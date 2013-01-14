package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_invader extends warrior_use_skill {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 3333;
	protected int SelfBuff = 458752001;
	protected int pet_attack_prob = 1000;
	protected int event_spawn_prob = 33;
	protected int debug_mode = 0;

	protected void CREATED() {
super;
if (gg.Rand(10000) < event_spawn_prob) {
myself.CreateOnePrivateEx(1018905, "ai_beastfarm_invader_event", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Despawn();

}
myself.i_ai0 = 0;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
if (debug_mode) {
myself.Say("1 : 광기몬스터로 변신");

}
myself.CreateOnePrivateEx(1018905, "ai_beastfarm_invader_event", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Despawn();

} else if (debug_mode) {
myself.Say("1 : 광기몬스터로 변신");

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.IsInCategory(122, attacker.npc_class_id) == 0) {
if (myself.IsNullCreature(attacker) == 0) {
myself.AddAttackDesire(attacker, 1, damage);
if (myself.IsNullCreature(attacker) == 0) {
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

}

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.700000 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 10000000);

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(121, creature.npc_class_id) == 1) {
if (debug_mode) {
myself.Say("SEE_CREATURE. beastfarm_beast 카테고리.");

}
if (gg.Rand(10000) < pet_attack_prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 1) {
if (debug_mode) {
myself.Say("PC와 전투중이므로 맹수들의 호출 무시");

}

}

} else {
if (debug_mode) {
myself.Say("맹수 습격!");

}
myself.AddAttackDesire(creature, 1, 1000);

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 21150004) {
if (gg.Rand(10000) < pet_attack_prob) {
if (debug_mode) {
myself.Say("맹수 습격!");

}
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 1000, 0);

}

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (myself.IsInCategory(121, last_attacker.npc_class_id) == 1) {
myself.SetAbilityItemDrop(0);

}

}
	}


}