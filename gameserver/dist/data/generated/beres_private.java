package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class beres_private extends warrior_aggressive {
	protected int PhysicalSpecial = 458752001;
	protected String aareadata = "beres_private_area_default";
	protected int silhouette1 = 1020130;
	protected int silhouette2 = 1020130;
	protected String ai_type = "beres_private_private";
	protected String areadata_name = "24_22_water_";

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(1102, 30 * 1000);
myself.AddTimerEx(1103, 5000);
	}

	protected void NO_DESIRE() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam maker0, HandlerParam s0, HandlerParam s1) {
if (script_event_arg1 == 12564) {
myself.i_ai2 = script_event_arg2;
if (gg.Rand(100) < 50) {
myself.i_ai3 = 4;

} else {
myself.i_ai3 = 5;

}
if (myself.i_ai2 < 10) {
s1 = "00";

} else {
s1 = "0";

}
if (myself.i_ai2 != 0) {
s0 = areadata_name + s1 + myself.i_ai2 + "_04";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_05";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_03";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_06";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_01";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_02";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_0" + myself.i_ai3;
gg.Area_SetOnOff(s0, 1);

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam private, HandlerParam f0) {
if (gg.Rand(100) < 30) {
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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam c3, HandlerParam c4, HandlerParam c5, HandlerParam party0) {
myself.c_ai0 = attacker;
if (myself.i_ai1 == 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
i1 = gg.Rand(i0);
i2 = gg.Rand(i0);
i3 = gg.Rand(i0);
i4 = gg.Rand(i0);
i5 = gg.Rand(i0);
c0 = myself.GetMemberOfParty(party0, i1);
c1 = myself.GetMemberOfParty(party0, i2);
c2 = myself.GetMemberOfParty(party0, i3);
c3 = myself.GetMemberOfParty(party0, i4);
c4 = myself.GetMemberOfParty(party0, i5);
if (i0 >= 6) {
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 500) {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(c0.x + 110), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, 0, gg.GetIndexFromCreature(c0), 0);

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 150), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 150), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 500) {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(c1.x + 10), gg.FloatToInt(c1.y), gg.FloatToInt(c1.z), 0, 0, gg.GetIndexFromCreature(c1), 0);

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y - 150), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);

}

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y - 150), gg.FloatToInt(myself.sm.z), 0, 0, gg.GetIndexFromCreature(c1), 0);

}

}

}
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 500) {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(c0.x + 10), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, 0, gg.GetIndexFromCreature(c0), 0);

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 150), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 150), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) < 500) {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(c1.x + 10), gg.FloatToInt(c1.y), gg.FloatToInt(c1.z), 0, 0, gg.GetIndexFromCreature(c1), 0);

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 150), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 150), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.DistFromMe(c2) < 500) {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(c2.x + 10), gg.FloatToInt(c2.y), gg.FloatToInt(c2.z), 0, 0, gg.GetIndexFromCreature(c2), 0);

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 30), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 30), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (myself.IsNullCreature(c3) == 0) {
if (myself.DistFromMe(c3) < 500) {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(c3.x + 10), gg.FloatToInt(c3.y), gg.FloatToInt(c3.z), 0, 0, gg.GetIndexFromCreature(c3), 0);

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y - 30), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y - 30), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (myself.IsNullCreature(c4) == 0) {
if (myself.DistFromMe(c4) < 500) {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(c4.x + 10), gg.FloatToInt(c4.y), gg.FloatToInt(c4.z), 0, 0, gg.GetIndexFromCreature(c4), 0);

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 80), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 80), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
myself.i_ai1 = 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(100) < 33 && myself.DistFromMe(attacker) > 100) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 0, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (timer_id == 1100) {
myself.i_ai1 = 0;

} else if (timer_id == 1101) {
if (myself.i_quest0 == 0) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
i1 = gg.Rand(i0);
if (i1 == 0) {
i1 = 1;

}
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) < 500) {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(c0.x + 10), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, 0, 0, 0);

} else if (gg.Rand(100) < 50) {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 10), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette2, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 50), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 120), gg.FloatToInt(myself.sm.y + 130), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else {
myself.CreateOnePrivateEx(silhouette1, ai_type, 0, 0, gg.FloatToInt(myself.sm.x - 10), gg.FloatToInt(myself.sm.y + 150), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}

} else if (timer_id == 1102) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(1102, 30 * 1000);

} else if (timer_id == 1102) {
gg.Area_SetOnOffEx(areadata_name + "00" + myself.i_ai2 + "_0" + i0, 1, 0);

}
	}

	protected void PARTY_DIED(HandlerParam private, HandlerParam party0, HandlerParam i1, HandlerParam c0, HandlerParam c1, HandlerParam s0, HandlerParam s1) {
if (private != myself.sm) {
if (myself.i_ai4 < 5) {
myself.AddTimerEx(1101, 5 * 1000 + gg.Rand(10) * 1000);

}
myself.i_ai4 = myself.i_ai4 + 1;
if (myself.i_ai4 >= 10) {
if (myself.i_ai2 < 10) {
s1 = "00";

} else {
s1 = "0";

}
if (myself.i_ai2 != 0) {
s0 = areadata_name + s1 + myself.i_ai2 + "_03";
gg.Area_SetOnOff(s0, 1);

}

}

}
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2, HandlerParam s0, HandlerParam s1, HandlerParam i0) {
myself.i_quest0 = 1;
if (myself.i_ai2 < 10) {
s1 = "00";

} else {
s1 = "0";

}
if (myself.i_ai2 != 0) {
s0 = areadata_name + s1 + myself.i_ai2 + "_0" + myself.i_ai3;
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai2 + "_03";
gg.Area_SetOnOff(s0, 0);

}
myself.CreateOnePrivateEx(1018482, "kind_water_dragon", 0, 0, gg.FloatToInt(myself.start_x), gg.FloatToInt(myself.start_y), gg.FloatToInt(myself.start_z), 0, myself.i_ai2, 0, 0);
if (gg.Rand(100) <= 77) {
myself.DropItem1(myself.sm, 9596, 1);

}
	}


}