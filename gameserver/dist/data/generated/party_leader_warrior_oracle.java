package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_warrior_oracle extends warrior {
	protected int debuff = 458752001;
	protected int PhysicalSpecial = 458752001;
	protected String ai_type = "party_private_warrior_oracle";
	protected int silhouette = 1020116;
	protected double Attack_DecayRatio = 6.600000;
	protected int bSpawn = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = myself.GetTick();
myself.AddTimerEx(1100, 60 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam damage, HandlerParam attacker, HandlerParam party0, HandlerParam i0, HandlerParam f0) {
myself.i_ai1 = myself.GetTick();
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
if (gg.Rand(100) < 3) {
if (myself.Skill_GetConsumeMP(debuff) < myself.sm.mp && myself.Skill_GetConsumeHP(debuff) < myself.sm.hp && myself.Skill_InReuseDelay(debuff) == 0) {
myself.AddUseSkillDesire(attacker, debuff, 0, 0, 1000000);

}

}
if (attacker.is_pc == 1) {
party0 = gg.GetParty(attacker);

}
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
if (bSpawn == 0) {
if (i0 >= 5) {
if (gg.Rand(100) < 70) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 80, gg.FloatToInt(myself.sm.y) + 80, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 40, gg.FloatToInt(myself.sm.y) + 40, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 80, gg.FloatToInt(myself.sm.y) - 80, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) - 40, gg.FloatToInt(myself.sm.y) - 40, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai0 = 1;

}

} else if (i0 >= 3) {
if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 80, gg.FloatToInt(myself.sm.y) + 80, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x) + 40, gg.FloatToInt(myself.sm.y) + 40, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai0 = 1;

}

} else if (gg.Rand(100) < 30) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}

} else if (gg.Rand(100) < 30) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
myself.i_ai1 = myself.GetTick();
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
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0) {
myself.i_ai1 = myself.GetTick();
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
if (gg.Rand(100) < 50) {
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

}

} else if (gg.Rand(100) < 20) {
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

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim, HandlerParam party0, HandlerParam f0) {
myself.i_ai1 = myself.GetTick();
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (gg.Rand(100) < 50) {
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

} else if (gg.Rand(100) < 20) {
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

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1100) {
if (myself.GetTick() - myself.i_ai1 > 5 * 60 * 1000 && myself.i_ai0 == 1) {
myself.i_ai0 = 0;
myself.BroadcastScriptEvent(1000, 0, 300);

}
myself.AddTimerEx(1100, 1 * 60 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 11039) {
myself.i_ai0 = 0;
myself.BroadcastScriptEvent(1000, 0, 300);

}
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
if (myself.sm.class_id == 1022259) {
if (gg.Rand(10000) <= 2642) {
myself.DropItem1(myself.sm, 9593, 1);

}

} else if (myself.sm.class_id == 1022263) {
if (gg.Rand(10000) <= 1403) {
myself.DropItem1(myself.sm, 9594, 1);

}

}
	}


}