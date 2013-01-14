package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kind_water_dragon_private extends party_private {
	protected int PhysicalSpecial = 458752001;
	protected int selfbuff = 458752001;

	protected void CREATED(HandlerParam c0) {
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 0, 10000000);

}
myself.AddTimerEx(3001, 30 * 1000 + gg.Rand(30) * 1000);
myself.AddTimerEx(3002, 30 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (timer_id == 3001) {
if (myself.IsMyBossAlive()) {
myself.RemoveAllDesire();
myself.AddAttackDesire(myself.boss, 1, 10000000);
i0 = gg.Rand(20);
if (i0 < 10) {
i0 = i0 + 10;

}
myself.AddTimerEx(3001, i0 * 1000);

}

} else if (timer_id == 3002) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(3002, 30 * 1000);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam private, HandlerParam f0) {
if (private != myself.boss) {
if (gg.Rand(100) < 33) {
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
	}

	protected void SEE_CREATURE(HandlerParam creature) {
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

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
myself.DropItem1(myself.sm, 9689, 1);
if (myself.sm.class_id == 1022270) {
if (gg.Rand(10000) <= 1008) {
myself.DropItem1(myself.sm, 9595, 1);

}

}
if (myself.sm.class_id == 1022271) {
if (gg.Rand(10000) <= 1008) {
myself.DropItem1(myself.sm, 9595, 1);

}

}
	}


}