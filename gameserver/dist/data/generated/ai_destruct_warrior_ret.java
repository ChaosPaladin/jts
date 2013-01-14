package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_warrior_ret extends ai_destruct_basic_ret {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 0;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Prob = 0;
	protected int Skill03_ID = 458752001;
	protected int Skill03_Prob = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || attacker.npc_class_id == 1018775) {
myself.AddAttackDesire(attacker, 1, damage);
myself.c_ai1 = myself.top_desire_target;

}
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, 1000000);

}

}

}

}
if (Skill02_ID != 458752001) {
if (gg.Rand(10000) < Skill02_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill02_ID, 0, 1, 1000000);

}

}

}

}
if (Skill03_ID != 458752001) {
if (gg.Rand(10000) < Skill03_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Skill03_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill03_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill03_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill03_ID, 0, 1, 1000000);

}

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.MakeAttackEvent(attacker, damage / 5, 0);
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
myself.MakeAttackEvent(target.master, 100, 0);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
myself.MakeAttackEvent(creature, 1000, 0);

}
super;
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam maker0) {
if (gg.Rand(10000) < 300) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
if (maker0.npc_count < maker0.maximum_npc - 1) {
myself.CreateOnePrivateEx(1022545, "ai_destruct_spawned", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), gg.Rand(360), 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}

}

}

}
super;
	}


}