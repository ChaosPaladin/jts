package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_C_course extends raid_boss_standard {
	protected int selfbuff1 = 458752001;
	protected int selfbuff2 = 458752001;
	protected int mirror_image_skill = 356581377;
	protected int W_LongRangeDDMagic = 458752001;
	protected int attack_weight_value = 10;
	protected String doorname = "cyratal_cave_c_b";

	protected void CREATED() {
if (myself.sm.param1 != 0) {
myself.i_ai0 = myself.sm.param1;
gg.SetNpcParam(myself.sm, 9, myself.boss.hp);
myself.i_quest2 = 1;

} else {
myself.i_ai0 = 0;

}
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest3 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.int_list.Clear();
myself.int_list.Add(-1);
if (myself.sm.param3 == 10) {
myself.i_quest1 = 1;
myself.AddTimerEx(6003, 60 * 1000);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i2 = myself.int_list.Get(0);
if (i2 == -1) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
myself.int_list.Clear();
myself.int_list.Add(i1);

} else {
myself.int_list.Clear();
myself.int_list.Add(0);

}

} else if (i2 != 0) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
if (party0.member_count == i2) {

} else {
myself.int_list.Clear();
myself.int_list.Add(0);

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam party0) {
if (skill_name_id == 155254785 && myself.i_ai4 == 1) {
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (myself.i_quest0 == 0) {
myself.AddTimerEx(6002, 3000);

}
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
myself.int_list.Add(party0.id);

} else {
myself.int_list.Add(0);

}
myself.i_quest0 = myself.i_quest0 + 1;

}
if (myself.i_ai2 == 0) {
gg.Castle_GateOpenCloseEx(doorname, 1, myself.InstantZone_GetId());
myself.i_ai2 = 1;

}
if (myself.i_quest2 == 1) {
myself.i_ai2 = myself.i_ai2 + damage;
if (myself.i_ai2 >= 100000) {
myself.BroadcastScriptEvent(11039, 1, 2000);
myself.i_quest2 = 0;

}

}
if (attacker.is_pc == 1) {
myself.c_ai1 = attacker;

}
if (gg.Rand(75) < 1 && myself.i_quest1 == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}
if (myself.sm.hp <= myself.sm.max_hp * 0.100000 && myself.i_ai4 == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff1, 1, 1, 1000000);
myself.Shout(gg.MakeFString(1800032, "", "", "", "", ""));
myself.i_ai4 = 1;

}
if (myself.sm.hp <= myself.sm.max_hp * 0.800000 && myself.i_ai0 == 0) {
myself.RemoveAllDesire();
myself.BroadcastScriptEvent(11039, 1, 2000);
myself.AddUseSkillDesire(myself.sm, mirror_image_skill, 1, 0, 1000000);
myself.i_ai0 = 1;
myself.AddTimerEx(6007, 3000);

} else if (myself.sm.hp <= myself.sm.max_hp * 0.600000 && myself.i_ai0 == 1) {
myself.BroadcastScriptEvent(11039, 1, 2000);
myself.AddUseSkillDesire(myself.sm, mirror_image_skill, 1, 0, 1000000);
myself.i_ai0 = 2;
myself.AddTimerEx(6007, 3000);

} else if (myself.sm.hp <= myself.sm.max_hp * 0.400000 && myself.i_ai0 == 2) {
myself.BroadcastScriptEvent(11039, 1, 2000);
myself.AddUseSkillDesire(myself.sm, mirror_image_skill, 1, 0, 1000000);
myself.i_ai0 = 3;
myself.AddTimerEx(6007, 3000);

} else if (myself.sm.hp <= myself.sm.max_hp * 0.200000 && myself.i_ai0 == 3) {
myself.BroadcastScriptEvent(11039, 1, 2000);
myself.AddUseSkillDesire(myself.sm, mirror_image_skill, 1, 0, 1000000);
myself.i_ai0 = 4;
myself.AddTimerEx(6007, 3000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam c0) {
if (timer_id == 6001) {
i0 = gg.Rand(100);
if (i0 > 90) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144650, 154313, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 1;

} else if (i0 > 80) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144522, 154714, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 2;

} else if (i0 > 70) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 143968, 154328, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 3;

} else if (i0 > 60) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144654, 154536, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 4;

} else if (i0 > 50) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144519, 154138, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 5;

} else if (i0 > 40) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144320, 154789, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 6;

} else if (i0 > 30) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144301, 154070, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 7;

} else if (i0 > 20) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144089, 154142, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 8;

} else if (i0 > 10) {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 143971, 154550, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 9;

} else {
myself.CreateOnePrivateEx(1025534, "raid_boss_C_course", 0, 0, 144116, 154715, -11848, 0, myself.i_ai0, gg.GetIndexFromCreature(myself.c_ai1), 10);
i3 = 10;

}
if (i3 != 1) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144650, 154313, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 2) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144522, 154714, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 3) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 143968, 154328, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 4) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144654, 154536, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 5) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144519, 154138, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 6) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144320, 154789, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 7) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144301, 154070, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 8) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144089, 154142, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 9) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 143971, 154550, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
if (i3 != 10) {
myself.CreateOnePrivateEx(1025535, "raid_boss_C_course_mirror", 0, 0, 144116, 154715, -11848, 0, 1000, gg.GetIndexFromCreature(myself.c_ai1), 0);

}
myself.AddTimerEx(6004, 5000);

} else if (timer_id == 6002) {
i5 = 0;
for (i4 = 1; i4 < myself.int_list.GetSize(); i4 = i4 + 1) {
if (i5 == 0) {
i5 = myself.int_list.Get(i4);

} else if (i5 == myself.int_list.Get(i4) && i5 != 0) {

} else {
myself.int_list.Clear();
myself.i_quest0 = 0;
myself.AddTimerEx(6009, 100);
return;

}

}
party0 = gg.GetParty(myself.c_ai0);
if (myself.IsNullParty(party0) == 0) {
i2 = party0.member_count;

}
i6 = myself.int_list.Get(0);
if (i2 != i6 || i6 == 0) {
myself.int_list.Clear();
myself.i_quest0 = 0;
myself.AddTimerEx(6009, 100);
return;

}
if (i2 == myself.i_quest0 && myself.i_ai4 == 1) {
myself.AddUseSkillDesire(myself.sm, selfbuff1, 1, 1, 1000000);
myself.Shout(gg.MakeFString(1800033, "", "", "", "", ""));
myself.i_ai4 = 2;

}
myself.i_quest0 = 0;
myself.int_list.Clear();

} else if (timer_id == 6003) {
myself.i_quest1 = 0;

} else if (timer_id == 6004) {
myself.BroadcastScriptEventEx(12519, myself.i_ai4, 0, 3000);
myself.Despawn();

} else if (timer_id == 6005) {
myself.SetVisible(1);
myself.AddUseSkillDesire(myself.sm, mirror_image_skill, 1, 1, 1000000);

} else if (timer_id == 6006) {
myself.SetVisible(0);

} else if (timer_id == 6007) {
myself.SetVisible(0);
myself.AddTimerEx(6001, 100);
myself.RemoveAllDesire();

} else if (timer_id == 6009) {
myself.int_list.Clear();
myself.int_list.Add(-1);
myself.LookNeighbor(2000);
myself.AddTimerEx(6009, 31 * 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 12519) {
myself.i_ai4 = script_event_arg2;
myself.c_ai2 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(myself.c_ai2) == 0) {
myself.AddAttackDesire(myself.c_ai2, 1, 1000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam i0, HandlerParam c0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 1);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == selfbuff1) {

}
super;
	}

	protected void MY_DYING(HandlerParam i1, HandlerParam i2, HandlerParam party0, HandlerParam c0) {
myself.CreateOnePrivateEx(1032278, "ai_telecube_oracle_raid", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
if (myself.IsNullCreature(myself.c_ai1) == 0) {
party0 = gg.GetParty(myself.c_ai1);

}
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c0 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c0) == 0) {
if (c0.instant_zone_id == myself.InstantZone_GetId()) {
myself.DeleteItem1(c0, 9690, 1);
myself.GiveItem1(c0, 9697, 1);
myself.GiveItem1(c0, 9598, 1);

}

}

}

}
myself.InstantZone_MarkRestriction();
super;
	}


}