package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_B_course extends raid_boss_standard {
	protected int selfbuff1 = 355074049;
	protected int selfbuff2 = 458752001;
	protected int heal = 356450309;
	protected int attack_weight_value = 1000;
	protected String doorname = "cyratal_cave_b_b";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0) {
if (gg.FloatToInt(myself.sm.x) < 153265) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
return;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.i_ai3 == 0 && attacker.is_pc == 1) {
myself.c_ai0 = attacker;
myself.i_ai3 = 1;

} else if (myself.i_ai3 == 1 && myself.c_ai0 != myself.top_desire_target) {
if (myself.top_desire_target.is_pc == 1) {
myself.c_ai1 = myself.top_desire_target;
myself.i_ai3 = 2;

} else if (attacker.is_pc == 1) {
myself.c_ai1 = attacker;
myself.i_ai3 = 2;

}

} else if (myself.i_ai3 == 2 && myself.c_ai0 != myself.top_desire_target && myself.c_ai1 != myself.top_desire_target) {
if (myself.top_desire_target.is_pc == 1) {
myself.c_ai2 = myself.top_desire_target;
myself.i_ai3 = 3;

} else if (attacker.is_pc == 1) {
myself.c_ai2 = attacker;
myself.i_ai3 = 3;

}

} else if (myself.i_ai3 == 3 && myself.c_ai0 != myself.top_desire_target && myself.c_ai1 != myself.top_desire_target && myself.c_ai2 != myself.top_desire_target) {
if (myself.top_desire_target.is_pc == 1) {
myself.c_ai3 = myself.top_desire_target;
myself.i_ai3 = 4;

} else if (attacker.is_pc == 1) {
myself.c_ai3 = attacker;
myself.i_ai3 = 4;

}

}

}
if (myself.sm.hp <= myself.sm.max_hp * 0.900000 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.i_ai1 = 1;
myself.RemoveAttackDesire(attacker.id);
myself.AddTimerEx(2002, 1000);

} else if (myself.sm.hp <= myself.sm.max_hp * 0.600000 && myself.i_ai0 == 1) {
myself.i_ai0 = 2;
myself.i_ai1 = 1;
myself.RemoveAttackDesire(attacker.id);
myself.AddTimerEx(2002, 1000);

} else if (myself.sm.hp <= myself.sm.max_hp * 0.300000 && myself.i_ai0 == 2) {
myself.i_ai0 = 3;
myself.i_ai1 = 1;
myself.RemoveAttackDesire(attacker.id);
myself.AddTimerEx(2002, 1000);

}
if (myself.sm.hp >= myself.sm.max_hp * 0.900000 && myself.i_quest0 == 10) {
myself.i_quest0 = 0;
myself.AddTimerEx(2002, 1000);
myself.i_ai1 = 1;
myself.RemoveAttackDesire(attacker.id);

} else if (myself.sm.hp >= myself.sm.max_hp * 0.600000 && myself.i_quest1 == 12) {
myself.i_quest1 = 0;
myself.AddTimerEx(2002, 1000);
myself.i_ai1 = 1;
myself.RemoveAttackDesire(attacker.id);

} else if (myself.sm.hp >= myself.sm.max_hp * 0.300000 && myself.i_quest2 == 14) {
myself.i_quest2 = 0;
myself.AddTimerEx(2002, 1000);
myself.i_ai1 = 1;
myself.RemoveAttackDesire(attacker.id);

}
if (myself.i_ai4 == 0) {
gg.Castle_GateOpenCloseEx(doorname, 1, myself.InstantZone_GetId());
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
i3 = 0;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343105)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343106)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343107)) > 0 || gg.GetAbnormalLevel(c0, myself.Skill_GetAbnormalType(343343108)) > 0) {
i3 = i3 + 1;

}

}

}
if (i3 == 0) {
myself.InstantZone_Finish(5);

}
myself.i_ai4 = 1;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (victim != myself.sm) {
if (gg.Rand(100) <= 20 && myself.DistFromMe(victim) < 200) {
myself.AddUseSkillDesire(myself.sm, heal, 1, 1, 1000000);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.i_quest0 < 10) {
myself.i_quest0 = myself.i_quest0 + 1;
if (myself.i_quest0 == 10) {

}

} else if (myself.i_quest1 < 12) {
myself.i_quest1 = myself.i_quest1 + 1;
if (myself.i_quest1 == 12) {

}

} else if (myself.i_quest2 < 14) {
myself.i_quest2 = myself.i_quest2 + 1;
if (myself.i_quest2 == 14) {

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1, HandlerParam c2) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
c0 = myself.c_ai1;

} else {
c0 = myself.top_desire_target;

}
if (myself.IsNullCreature(myself.c_ai2) == 0) {
c1 = myself.c_ai2;

} else {
c1 = myself.top_desire_target;

}
if (myself.IsNullCreature(myself.c_ai3) == 0) {
c2 = myself.c_ai3;

} else {
c2 = myself.top_desire_target;

}
if (timer_id == 2002) {
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 1, gg.GetIndexFromCreature(c0), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 2, gg.GetIndexFromCreature(c1), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 3, gg.GetIndexFromCreature(c2), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 4, gg.GetIndexFromCreature(c0), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 5, gg.GetIndexFromCreature(c1), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 6, gg.GetIndexFromCreature(c2), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 7, gg.GetIndexFromCreature(c0), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 8, gg.GetIndexFromCreature(c1), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 9, gg.GetIndexFromCreature(c2), 1);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 10, gg.GetIndexFromCreature(c0), 1);
if (myself.i_ai0 == 2) {
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 11, gg.GetIndexFromCreature(c1), 2);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 12, gg.GetIndexFromCreature(c2), 2);
myself.AddTimerEx(2004, 15 * 1000);

}
if (myself.i_ai0 == 3) {
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 11, gg.GetIndexFromCreature(c2), 3);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 12, gg.GetIndexFromCreature(c0), 3);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 13, gg.GetIndexFromCreature(c1), 3);
myself.CreateOnePrivateEx(1025533, "raid_boss_B_course_private", 0, 0, 152986, 149529, -12136, 0, 14, gg.GetIndexFromCreature(c2), 3);
myself.AddTimerEx(2005, 15 * 1000);

}
myself.AddTimerEx(2003, 3000);

} else if (timer_id == 2003) {
gg.Castle_GateOpenCloseEx(doorname, 0, myself.InstantZone_GetId());

} else if (timer_id == 2004) {
myself.BroadcastScriptEvent(12517, 1, 2000);

} else if (timer_id == 2005) {
myself.BroadcastScriptEvent(12518, 1, 2000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12516) {
myself.i_ai1 = 0;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == selfbuff1) {

}
	}

	protected void MY_DYING(HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam party0, HandlerParam c0) {
myself.InstantZone_MarkRestriction();
myself.CreateOnePrivateEx(1032277, "ai_telecube_oracle_raid", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
party0 = gg.GetParty(myself.c_ai0);

} else if (myself.IsNullCreature(myself.c_ai1) == 0) {
party0 = gg.GetParty(myself.c_ai0);

}
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
if (gg.OwnItemCount(c0, 9690) >= 1) {
myself.DeleteItem1(c0, 9690, 1);
myself.GiveItem1(c0, 9696, 1);
myself.GiveItem1(c0, 9597, 1);

} else {
myself.InstantZone_Leave(c0);

}

}

}

}

}
super;
	}


}