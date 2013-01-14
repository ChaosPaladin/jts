package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class default_air_monster extends wizard_behavior {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Target = 0;
	protected int Skill01_Type = 0;
	protected int Skill01_AttackSplash = 0;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Target = 0;
	protected int Skill02_Type = 0;
	protected int Skill02_AttackSplash = 0;
	protected int Skill03_ID = 458752001;
	protected int Skill03_Target = 0;
	protected int Skill03_Type = 0;
	protected int Skill03_AttackSplash = 0;
	protected int MoveTo = 0;
	protected int Approach = 1;
	protected int Avoidence = 2;
	protected int Detect = 3;
	protected int Attack = 4;
	protected int Dogfight = 5;
	protected int Death = 6;
	protected int Idle = 7;
	protected int dist = 400;
	protected int ItemName_A = 57;
	protected int ItemName_B_1 = -1;
	protected int ItemName_B_2 = -1;
	protected int ItemName_B_3 = -1;
	protected int ItemName_B_4 = -1;
	protected int ItemName_B_5 = -1;
	protected int ItemName_B_6 = -1;
	protected int ItemName_B_7 = -1;
	protected int ItemName_B_8 = -1;
	protected int ItemName_B_9 = -1;
	protected int ItemName_B_10 = -1;
	protected int ItemName_B_11 = -1;
	protected int ItemName_B_12 = -1;
	protected int ItemName_B_13 = -1;
	protected int ItemName_B_14 = -1;
	protected int ItemName_B_15 = -1;
	protected int ItemName_B_16 = -1;
	protected int ItemName_B_17 = -1;
	protected int ItemName_B_18 = -1;
	protected int ItemName_B_19 = -1;
	protected int ItemName_B_20 = -1;
	protected int ItemName_B_21 = -1;
	protected int ItemName_B_22 = -1;
	protected int ItemName_B_23 = -1;
	protected int ItemName_B_24 = -1;
	protected int ItemName_C_1 = -1;
	protected int ItemName_C_2 = -1;
	protected int ItemName_C_3 = -1;
	protected int ItemName_C_4 = -1;
	protected int ItemName_C_5 = -1;
	protected int ItemName_C_6 = -1;
	protected int ItemName_C_7 = -1;
	protected int ItemRate_A = 70;
	protected int ItemRate_B = -1;
	protected int ItemRate_C = -1;
	protected int ItemRate_A_Min = -1;
	protected int ItemRate_A_Max = -1;
	protected int ItemRate_B_1 = -1;
	protected int ItemRate_B_2 = -1;
	protected int ItemRate_B_3 = -1;
	protected int ItemRate_B_4 = -1;
	protected int ItemRate_B_5 = -1;
	protected int ItemRate_B_6 = -1;
	protected int ItemRate_B_6 = -1;
	protected int ItemRate_B_7 = -1;
	protected int ItemRate_B_8 = -1;
	protected int ItemRate_B_9 = -1;
	protected int ItemRate_B_10 = -1;
	protected int ItemRate_B_11 = -1;
	protected int ItemRate_B_12 = -1;
	protected int ItemRate_B_13 = -1;
	protected int ItemRate_B_14 = -1;
	protected int ItemRate_B_15 = -1;
	protected int ItemRate_B_16 = -1;
	protected int ItemRate_B_17 = -1;
	protected int ItemRate_B_18 = -1;
	protected int ItemRate_B_19 = -1;
	protected int ItemRate_B_20 = -1;
	protected int ItemRate_B_21 = -1;
	protected int ItemRate_B_22 = -1;
	protected int ItemRate_B_23 = -1;
	protected int ItemRate_B_24 = -1;
	protected int ItemRate_C_1 = -1;
	protected int ItemRate_C_2 = -1;
	protected int ItemRate_C_3 = -1;
	protected int ItemRate_C_4 = -1;
	protected int ItemRate_C_5 = -1;
	protected int ItemRate_C_6 = -1;
	protected int ItemRate_C_7 = -1;
	protected int IsAggressive = 1;

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (gg.FloatToInt(ItemRate_A) > gg.Rand(1000000)) {
i0 = gg.Rand(ItemRate_A_Max - ItemRate_A_Min);
i1 = ItemRate_A_Min + i0;
myself.GiveItem1(last_attacker, 57, i1);
i2 = 1;

}
if (gg.FloatToInt(ItemRate_B) > gg.Rand(1000000)) {
if (gg.FloatToInt(ItemRate_B_1) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_1, 1);

}
if (gg.FloatToInt(ItemRate_B_2) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_2, 1);

}
if (gg.FloatToInt(ItemRate_B_3) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_3, 1);

}
if (gg.FloatToInt(ItemRate_B_4) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_4, 1);

}
if (gg.FloatToInt(ItemRate_B_5) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_5, 1);

}
if (gg.FloatToInt(ItemRate_B_6) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_6, 1);

}
if (gg.FloatToInt(ItemRate_B_7) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_7, 1);

}
if (gg.FloatToInt(ItemRate_B_8) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_8, 1);

}
if (gg.FloatToInt(ItemRate_B_9) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_9, 1);

}
if (gg.FloatToInt(ItemRate_B_10) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_10, 1);

}
if (gg.FloatToInt(ItemRate_B_11) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_11, 1);

}
if (gg.FloatToInt(ItemRate_B_12) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_12, 1);

}
if (gg.FloatToInt(ItemRate_B_13) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_13, 1);

}
if (gg.FloatToInt(ItemRate_B_14) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_14, 1);

}
if (gg.FloatToInt(ItemRate_B_15) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_15, 1);

}
if (gg.FloatToInt(ItemRate_B_16) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_16, 1);

}
if (gg.FloatToInt(ItemRate_B_17) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_17, 1);

}
if (gg.FloatToInt(ItemRate_B_18) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_18, 1);

}
if (gg.FloatToInt(ItemRate_B_19) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_19, 1);

}
if (gg.FloatToInt(ItemRate_B_20) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_20, 1);

}
if (gg.FloatToInt(ItemRate_B_21) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_21, 1);

}
if (gg.FloatToInt(ItemRate_B_22) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_22, 1);

}
if (gg.FloatToInt(ItemRate_B_23) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_23, 1);

}
if (gg.FloatToInt(ItemRate_B_24) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_B_24, 1);

}

}
if (gg.FloatToInt(ItemRate_C) > gg.Rand(1000000)) {
if (gg.FloatToInt(ItemRate_C_1) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_1, 1);

}
if (gg.FloatToInt(ItemRate_C_2) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_2, 1);

}
if (gg.FloatToInt(ItemRate_C_3) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_3, 1);

}
if (gg.FloatToInt(ItemRate_C_4) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_4, 1);

}
if (gg.FloatToInt(ItemRate_C_5) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_5, 1);

}
if (gg.FloatToInt(ItemRate_C_6) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_6, 1);

}
if (gg.FloatToInt(ItemRate_C_7) > gg.Rand(1000000)) {
i2 = 1;
myself.GiveItem1(last_attacker, ItemName_C_7, 1);

}

}
	}

	protected void CREATED() {
myself.i_ai0 = MoveTo;
myself.i_ai2 = 0;
myself.i_ai3 = 2;
myself.i_ai4 = 0;
myself.AddTimerEx(9000, 1000);
myself.AddTimerEx(9002, 1000);
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (gg.FloatToInt(myself.sm.z) > 5000) {
myself.AddMoveToDesire(gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z) - 1000, 1000);

}
if (myself.i_ai0 == Approach && myself.i_ai4 == 1) {
myself.i_ai0 = Attack;
myself.i_ai4 = 0;
myself.AddTimerEx(9000, 100);
return;

}
if (myself.i_ai0 == Avoidence && myself.i_ai3 == 1 && myself.i_ai4 == 1) {
myself.i_ai0 = Detect;
myself.i_ai3 = 2;
myself.i_ai4 = 0;
myself.AddTimerEx(9000, 100);
return;

}
if (myself.i_ai0 == Avoidence && myself.i_ai3 == 2 && myself.i_ai4 == 1) {
myself.i_ai3 = 1;
myself.i_ai4 = 0;
myself.AddTimerEx(9000, 100);
return;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
if (gg.Rand(2) == 0) {
if (myself.i_ai0 == Attack && myself.i_ai2 == 1) {
myself.i_ai0 = Attack;
myself.i_ai2 = 0;
myself.AddTimerEx(9000, 1000);
return;

}

}
if (myself.i_ai0 == Attack) {
if (gg.Rand(6) < 1) {
myself.i_ai0 = Avoidence;

}
myself.AddTimerEx(9000, 1000);

}
	}

	protected void NO_DESIRE(HandlerParam i0) {
if (myself.sm.class_id == 1025633 || myself.sm.class_id == 1025627 || myself.sm.class_id == 1025628 || myself.sm.class_id == 1025629 || myself.sm.class_id == 1025630 || myself.sm.class_id == 1025631 || myself.sm.class_id == 1025632 || myself.sm.class_id == 1025623 || myself.sm.class_id == 1025624 || myself.sm.class_id == 1025625 || myself.sm.class_id == 1025626) {
return;

} else if (myself.i_ai0 == MoveTo) {
myself.AddMoveAroundDesire(1, 100);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3, HandlerParam h0) {
if (timer_id == 1000) {
myself.AddTimerEx(9000, 5000);

}
if (timer_id == 1001) {
if (myself.IsNullCreature(myself.c_ai0)) {
myself.AddTimerEx(9000, 1000);
return;

}
i0 = gg.FloatToInt(myself.sm.x) + gg.FloatToInt(myself.c_ai0.x) / 2;
i1 = gg.FloatToInt(myself.sm.y) + gg.FloatToInt(myself.c_ai0.y) / 2;
i2 = gg.FloatToInt(myself.sm.z) + gg.FloatToInt(myself.c_ai0.z) / 2;
if (gg.FloatToInt(myself.sm.z) - gg.FloatToInt(myself.c_ai0.z) > -500 && gg.FloatToInt(myself.sm.z) - gg.FloatToInt(myself.c_ai0.z) < 500) {
if (gg.Rand(2) == 1) {
i2 = i2 + gg.Rand(40) + 200;

} else {
i2 = i2 - gg.Rand(40) + 200;

}

} else if (gg.FloatToInt(myself.sm.z) - gg.FloatToInt(myself.c_ai0.z) < -500) {
i2 = i2 + gg.Rand(140) + 200;

} else if (gg.FloatToInt(myself.sm.z) - gg.FloatToInt(myself.c_ai0.z) > 500) {
i2 = i2 - gg.Rand(140) + 200;

}
myself.i_ai4 = 1;
if (i2 > 5000) {
i2 = 5000;

}
if (i2 < 0) {
i2 = 0;

}
myself.AddMoveToDesire(i0, i1, i2, 50000);
return;

}
if (timer_id == 1002) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(myself.c_ai0) || myself.IsNullHateInfo(h0)) {
myself.i_ai0 = MoveTo;
myself.AddTimerEx(9000, 5000);
return;

}
i0 = gg.FloatToInt(myself.c_ai0.x);
i1 = gg.FloatToInt(myself.c_ai0.y);
i2 = gg.FloatToInt(myself.c_ai0.z);
if (myself.i_ai3 == 2) {
f0 = myself.c_ai0.x - dist - myself.sm.x * myself.c_ai0.x - dist - myself.sm.x + myself.c_ai0.y - myself.sm.y * myself.c_ai0.y - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
f1 = myself.c_ai0.x + dist - myself.sm.x * myself.c_ai0.x + dist - myself.sm.x + myself.c_ai0.y - myself.sm.y * myself.c_ai0.y - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
f2 = myself.c_ai0.x - myself.sm.x * myself.c_ai0.x - myself.sm.x + myself.c_ai0.y - dist - myself.sm.y * myself.c_ai0.y - dist - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
f3 = myself.c_ai0.x - myself.sm.x * myself.c_ai0.x - myself.sm.x + myself.c_ai0.y + dist - myself.sm.y * myself.c_ai0.y + dist - myself.sm.y + myself.c_ai0.z - myself.sm.z * myself.c_ai0.z - myself.sm.z;
if (gg.Rand(2)) {
if (f0 > f1) {
i0 = i0 - dist;

} else {
i0 = i0 + dist;

}
if (f2 > f3) {
i3 = gg.FloatToInt(myself.c_ai0.x) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y - dist) - gg.FloatToInt(myself.sm.y);

} else {
i3 = gg.FloatToInt(myself.c_ai0.x) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y + dist) - gg.FloatToInt(myself.sm.y);

}

} else {
if (f2 > f3) {
i1 = i1 - dist;

} else {
i1 = i1 + dist;

}
if (f0 > f1) {
i3 = gg.FloatToInt(myself.c_ai0.x - dist) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y) - gg.FloatToInt(myself.sm.y);

} else {
i3 = gg.FloatToInt(myself.c_ai0.x + dist) - gg.FloatToInt(myself.sm.x);
i4 = gg.FloatToInt(myself.c_ai0.y) - gg.FloatToInt(myself.sm.y);

}

}
myself.i_ai4 = 1;
if (i2 > 5000) {
i2 = 5000;

}
if (i2 < 0) {
i2 = 0;

}
myself.AddMoveToDesire(i0, i1, i2, 5000);
myself.int_list.Clear();
myself.int_list.Add(gg.FloatToInt(i0 + i3));
myself.int_list.Add(gg.FloatToInt(i1 + i4));
myself.int_list.Add(gg.FloatToInt(i2));
return;

}
if (myself.i_ai3 == 1) {
i0 = myself.int_list.Get(0);
i1 = myself.int_list.Get(1);
i2 = myself.int_list.Get(2);
myself.i_ai4 = 1;
if (i2 > 5000) {
i2 = 5000;

}
if (i2 < 0) {
i2 = 0;

}
myself.AddMoveToDesire(i0, i1, i2, 8000);
myself.int_list.Clear();
return;

}

}
if (timer_id == 1003) {
myself.i_ai2 = 0;
if (myself.sm.hp / myself.sm.max_hp > 0.100000) {
if (gg.Rand(100) < 90) {
myself.i_ai0 = Approach;

} else {
myself.i_ai0 = Avoidence;

}

} else {
myself.i_ai0 = Approach;

}
myself.AddTimerEx(9000, 100);

}
if (timer_id == 1004) {
if (Skill03_ID == 458752001) {
switch (gg.Rand(2)) {
case 0: {
if (Skill01_Type == 0) {
if (Skill01_Target == 0 || Skill01_Target == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, 5000000);

}

} else if (Skill01_Target == 0 || Skill01_Target == 1) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, 5000000);

}
if (Skill01_AttackSplash == 1) {
myself.i_ai2 = 1;

}
break;

}
case 1: {
if (Skill02_Type == 0) {
if (Skill02_Target == 0 || Skill02_Target == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill02_ID, 0, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, 5000000);

}

} else if (Skill02_Target == 0 || Skill02_Target == 1) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, 5000000);

}
if (Skill02_ID == 379650049) {
if (gg.Rand(3) < 1) {
gg.SendScriptEvent(myself.sm, 1424001, 1);

}

}
if (Skill02_ID == 379584513) {
if (gg.Rand(3) < 1) {
gg.SendScriptEvent(myself.sm, 1424001, 2);

}

}
if (Skill02_AttackSplash == 1) {
myself.i_ai2 = 1;

}
break;

}

}

} else {
switch (gg.Rand(3)) {
case 0: {
if (Skill01_Type == 0) {
if (Skill01_Target == 0 || Skill01_Target == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 0, 0, 5000000);

}

} else if (Skill01_Target == 0 || Skill01_Target == 1) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, 5000000);

}
if (Skill01_AttackSplash == 1) {
myself.i_ai2 = 1;

}
break;

}
case 1: {
if (Skill02_Type == 0) {
if (Skill02_Target == 0 || Skill02_Target == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill02_ID, 0, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 0, 5000000);

}

} else if (Skill02_Target == 0 || Skill02_Target == 1) {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 0, 5000000);

}
if (Skill02_ID == 379650049) {
if (gg.Rand(3) < 1) {
gg.SendScriptEvent(myself.sm, 1424001, 1);

}

}
if (Skill02_ID == 379584513) {
if (gg.Rand(3) < 1) {
gg.SendScriptEvent(myself.sm, 1424001, 2);

}

}
if (Skill02_AttackSplash == 1) {
myself.i_ai2 = 1;

}
break;

}
case 2: {
if (Skill03_Type == 0) {
if (Skill03_Target == 0 || Skill03_Target == 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill03_ID, 0, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 0, 0, 5000000);

}

} else if (Skill03_Target == 0 || Skill03_Target == 1) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, 5000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 0, 5000000);

}
if (Skill03_AttackSplash == 1) {
myself.i_ai2 = 1;

}
break;

}

}

}

}
if (timer_id == 1005) {

}
if (timer_id == 9000) {
if (myself.i_ai0 == MoveTo) {
myself.AddTimerEx(1000, 1000);

}
if (myself.i_ai0 == Approach) {
myself.AddTimerEx(1001, 1000);

}
if (myself.i_ai0 == Avoidence) {
myself.AddTimerEx(1002, 1000);

}
if (myself.i_ai0 == Detect) {
myself.AddTimerEx(1003, 1000);

}
if (myself.i_ai0 == Attack) {
myself.AddTimerEx(1004, 1000);

}
if (myself.i_ai0 == Dogfight) {
myself.AddTimerEx(1005, 1000);

}

}
if (timer_id == 9001) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullCreature(myself.c_ai0) == 1 || myself.IsNullHateInfo(h0) == 1 || myself.DistFromMe(myself.c_ai0) > 5000) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.i_ai0 = Idle;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 2;
myself.i_ai4 = 0;

}
myself.AddTimerEx(9001, 5 * 1000);

}
if (timer_id == 9002) {
if (myself.GetPathfindFailCount() > 5 || myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.i_ai0 = Idle;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 2;
myself.i_ai4 = 0;

}
myself.AddTimerEx(9002, 10 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam skill_name_id, HandlerParam f0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.c_ai0 = h0.creature;
if (myself.i_ai1 == 0) {
if (myself.i_ai0 == Idle) {
i0 = 1;

} else {
i0 = 0;

}
myself.i_ai0 = Approach;
myself.i_ai1 = 1;
if (i0 == 1) {
myself.AddTimerEx(9000, 100);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam f0, HandlerParam i0, HandlerParam h0) {
if (myself.sm.class_id == 1025633 || myself.sm.class_id == 1025627 || myself.sm.class_id == 1025628 || myself.sm.class_id == 1025629 || myself.sm.class_id == 1025630 || myself.sm.class_id == 1025631 || myself.sm.class_id == 1025632) {
return;

}
if (IsAggressive == 0) {

} else if (myself.GetLifeTime() >= Aggressive_Time) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * ATTACKED_Weight_Point + 300), 0, 1, 1);
myself.MakeAttackEvent(creature, 100, 0);

} else {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * ATTACKED_Weight_Point), 0, 1, 1);
myself.MakeAttackEvent(creature, 100, 0);

}

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (myself.p_state == 3 && myself.top_desire_target == speller) {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == speller.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == speller.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (speller.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (speller.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (speller.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, speller.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, speller.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

} else {
i0 = myself.Skill_GetEffectPoint(skill_name_id);
f0 = DefaultHate;
if (HateRace1 > -1) {
if (HateRace1 == speller.race) {
f0 = f0 + HateRace1Boost;

}

}
if (HateRace2 > -1) {
if (HateRace2 == speller.race) {
f0 = f0 + HateRace2Boost;

}

}
if (HateClass1 > -1) {
if (speller.occupation == HateClass1) {
f0 = f0 + HateClass1Boost;

}

}
if (HateClass2 > -1) {
if (speller.occupation == HateClass2) {
f0 = f0 + HateClass2Boost;

}

}
if (HateClass3 > -1) {
if (speller.occupation == HateClass3) {
f0 = f0 + HateClass3Boost;

}

}
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, speller.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, speller.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = i0 * f0 + 1;

}
myself.AddHateInfo(speller, gg.FloatToInt(f0 * SEE_SPELL_Weight_Point), 0, 1, 1);

}

}
super;
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
super;
	}


}