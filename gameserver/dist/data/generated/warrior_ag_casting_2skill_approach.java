package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_ag_casting_2skill_approach extends warrior {
	protected int SelfBuff = 458752001;
	protected int PhysicalSpecial = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
	}

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (gg.Rand(100) < 20 && speller.is_pc != 0 && myself.IsInCategory(3, speller.occupation) != 0) {
myself.RemoveAllAttackDesire();
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
myself.AddAttackDesire(speller, 1, 1 * 200000);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg2 == 10037 && myself.sm.class_id == 1018329) {
myself.i_ai4 = myself.i_ai4 + 1;

}
if (script_event_arg2 == 10038 && myself.sm.class_id == 1018331) {
myself.i_ai3 = myself.i_ai3 + 1;

}
if (script_event_arg1 == 10001041) {
myself.AddMoveToDesire(script_event_arg2, script_event_arg3, gg.FloatToInt(myself.sm.z), 1000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 0, 1000000);

}

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.c_ai1 = myself.top_desire_target;

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = gg.Rand(100);
if (i0 < 5 && myself.sm.class_id == 1018329) {
myself.DropItem1(myself.sm, 8556, 1);

}
	}


}