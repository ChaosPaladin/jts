package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class beres_private_private extends party_private {
	protected int PhysicalSpecial = 458752001;
	protected int selfbuff = 458752001;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 30;
myself.i_ai1 = myself.GetTick();
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 0, 10000000);

}
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddHateInfo(c0, 500, 0, 1, 1);
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(c0, PhysicalSpecial, 0, 1, 1000000);

}
myself.AddUseSkillDesire(c0, 305594369, 0, 1, 100000);

}

}
myself.AddTimerEx(1101, 30 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.i_ai1 = myself.GetTick();
if (gg.Rand(100) < myself.i_ai0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam private, HandlerParam f0) {
myself.i_ai1 = myself.GetTick();
if (gg.Rand(100) < myself.i_ai0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (private != myself.sm) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.i_ai1 = myself.GetTick();
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (timer_id == 1101) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.AddTimerEx(80129, 1000);

}
if (myself.GetTick() - myself.i_ai1 > 5 * 60 * 1000) {
myself.BroadcastScriptEvent(11039, 0, 1000);
myself.Despawn();

}
myself.AddTimerEx(1101, 30 * 1000);

}
if (timer_id == 80129) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 11039) {
myself.Despawn();

}
	}

	protected void PARTY_DIED(HandlerParam private, HandlerParam party0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (private != myself.boss) {
myself.i_ai0 = myself.i_ai0 + 10;

}
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
if (myself.sm.class_id == 1022268) {
if (gg.Rand(10000) <= 987) {
myself.DropItem1(myself.sm, 9595, 1);

}

}
if (myself.sm.class_id == 1022269) {
if (gg.Rand(10000) <= 995) {
myself.DropItem1(myself.sm, 9595, 1);

}

}
	}


}