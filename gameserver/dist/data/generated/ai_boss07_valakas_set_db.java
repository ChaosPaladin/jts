package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss07_valakas_set_db extends default_npc {
	protected int GM_ID = 3;
	protected int NorMalAttackLeft = 306774017;
	protected int NorMalAttackRight = 306839553;
	protected int RearStrike = 307036161;
	protected int RearThrow = 307232769;
	protected int Meteor = 307363841;
	protected int BreathHigh = 306970625;
	protected int BreathLow = 306905089;
	protected int PowerWord_Body = 384040961;
	protected int PowerWord_Soul = 384106497;
	protected int PowerWord_Body_2nd = 384172033;
	protected int PowerWord_Soul_2nd = 384237569;
	protected int PowerUp = 306708481;
	protected int ReadyRearAttack = 307167233;
	protected int Fear = 307298305;
	protected int TID_TANKER_HATE_CHECK = 78001;
	protected int TIME_TANKER_HATE_CHECK = 1;
	protected int babble_mode = 0;
	protected int Dispel_Debuff = 1;

	protected void CREATED(HandlerParam reply, HandlerParam i0) {
if (GM_ID != 0) {
i0 = myself.GetGlobalMap(GM_ID);
if (i0 == -1) {
myself.RegisterGlobalMap(GM_ID, gg.GetIndexFromCreature(myself.sm));

}

}
if (reply == 0) {
myself.SetDBValue(myself.sm, 0);

} else if (myself.sm.db_value == 1) {
if (babble_mode == 1) {
myself.AddTimerEx(1001, 60 * 1000);

} else {
myself.AddTimerEx(1001, 10 * 60 * 1000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 99999999) {
myself.MPCC_SetMasterPartyRouting(script_event_arg2, myself.sm, 1);
myself.int_list.Add(script_event_arg2);

}
if (myself.sm.db_value == 0) {
if (babble_mode == 1) {
myself.AddTimerEx(1001, 60 * 1000);

} else {
myself.AddTimerEx(1001, 20 * 60 * 1000);

}
myself.SetDBValue(myself.sm, 1);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c2, HandlerParam c3, HandlerParam h0, HandlerParam h1) {
if (timer_id == 1001) {
myself.SetDBValue(myself.sm, 2);
myself.InstantTeleport(myself.sm, 212852, -114842, -1632);
myself.i_quest1 = myself.GetCurrentTick();
myself.EffectMusic(myself.sm, 10000, "BS03_A");
myself.AddTimerEx(1004, 2000);

}
if (timer_id == 1004) {
myself.SpecialCamera(myself.sm, 1800, 180, -1, 1500, 15000, 10000, 0, 0, 1, 0, 0);
myself.AddTimerEx(1102, 1500);

}
if (timer_id == 1102) {
myself.SpecialCamera(myself.sm, 1300, 180, -5, 3000, 15000, 10000, 0, -5, 1, 0, 0);
myself.AddTimerEx(1103, 3300);

}
if (timer_id == 1103) {
myself.SpecialCamera(myself.sm, 500, 180, -8, 600, 15000, 10000, 0, 60, 1, 0, 0);
myself.AddTimerEx(1104, 2900);

}
if (timer_id == 1104) {
myself.SpecialCamera(myself.sm, 800, 180, -8, 2700, 15000, 10000, 0, 30, 1, 0, 0);
myself.AddTimerEx(1105, 2700);

}
if (timer_id == 1105) {
myself.SpecialCamera(myself.sm, 200, 250, 70, 0, 15000, 10000, 30, 80, 1, 0, 0);
myself.AddTimerEx(1106, 1);

}
if (timer_id == 1106) {
myself.SpecialCamera(myself.sm, 1100, 250, 70, 2500, 15000, 10000, 30, 80, 1, 0, 0);
myself.AddTimerEx(1107, 3200);

}
if (timer_id == 1107) {
myself.SpecialCamera(myself.sm, 700, 150, 30, 0, 15000, 10000, -10, 60, 1, 0, 0);
myself.AddTimerEx(1108, 1400);

}
if (timer_id == 1108) {
myself.SpecialCamera(myself.sm, 1200, 150, 20, 2900, 15000, 10000, -10, 30, 1, 0, 0);
myself.AddTimerEx(1109, 6700);

}
if (timer_id == 1109) {
myself.SpecialCamera(myself.sm, 750, 170, -10, 3400, 15000, 4000, 10, -15, 1, 0, 0);
myself.AddTimerEx(1110, 5700);

}
if (timer_id == 1110) {
myself.AddUseSkillDesire(myself.sm, 307429377, 1, 1, 4000000);
myself.SetDBValue(myself.sm, 3);
myself.AddTimerEx(1002, 60 * 1000);
myself.AddTimerEx(TID_TANKER_HATE_CHECK, TIME_TANKER_HATE_CHECK * 60 * 1000);
c3 = myself.FindNeighborHero(4000);
if (myself.IsNullCreature(c3) == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 1, 0, 0, 0, 0, 0, 3000, 0, gg.MakeFString(1000519, c3.name, "", "", "", ""));

}
myself.AddTimerEx(3423, 3 * 60 * 1000);
myself.AddTimerEx(3424, 60 * 1000);
myself.SetHateInfoListIndex(1);
if (myself.GetHateInfoCount() == 0) {
myself.SetHateInfoListIndex(0);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
c2 = h0.creature;

}

} else {
i1 = gg.Rand(4);
myself.SetHateInfoListIndex(i1);
h1 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h1) == 0) {
if (myself.IsInCategory(5, h1.creature.occupation) == 1) {
c2 = h1.creature;

} else {
myself.SetHateInfoListIndex(1);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (h1.hate < h0.hate * 0.700000) {
c2 = h0.creature;

} else {
c2 = h1.creature;

}

}

}

}

}
if (myself.IsNullCreature(c2) == 1) {
myself.SetHateInfoListIndex(0);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
c2 = h0.creature;

}

}
if (myself.IsNullCreature(c2) == 0) {
if (gg.Rand(100) < 10) {
for (i0 = 0; i0 < 4; i0 = i0 + 1) {
myself.SetHateInfoListIndex(i0);
h0 = myself.GetHateInfoByCreature(c2);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddHateInfo(c2, h0.hate / 2, 0, 1, 0);

}

}

}

}

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.sm.hp < myself.sm.max_hp * 1.000000 / 5.000000) {
myself.i_ai0 = 5;
if (myself.i_ai0 < myself.i_ai0) {
if (myself.Skill_GetConsumeMP(PowerUp) < myself.sm.mp && myself.Skill_GetConsumeHP(PowerUp) < myself.sm.hp && myself.Skill_InReuseDelay(PowerUp) == 0) {
myself.AddUseSkillDesire(myself.sm, PowerUp, 1, 1, 1000000);

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 2.000000 / 5.000000) {
myself.i_ai0 = 4;
if (myself.i_ai0 > myself.i_ai0) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (myself.i_ai0 < myself.i_ai0) {
if (myself.Skill_GetConsumeMP(PowerUp) < myself.sm.mp && myself.Skill_GetConsumeHP(PowerUp) < myself.sm.hp && myself.Skill_InReuseDelay(PowerUp) == 0) {
myself.AddUseSkillDesire(myself.sm, PowerUp, 1, 1, 1000000);

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 3.000000 / 5.000000) {
myself.i_ai0 = 3;
if (myself.i_ai0 > myself.i_ai0) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (myself.i_ai0 < myself.i_ai0) {
if (myself.Skill_GetConsumeMP(PowerUp) < myself.sm.mp && myself.Skill_GetConsumeHP(PowerUp) < myself.sm.hp && myself.Skill_InReuseDelay(PowerUp) == 0) {
myself.AddUseSkillDesire(myself.sm, PowerUp, 1, 1, 1000000);

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 4.000000 / 5.000000) {
myself.i_ai0 = 2;
if (myself.i_ai0 > myself.i_ai0) {
myself.i_ai0 = myself.i_ai0 + 1;

} else if (myself.i_ai0 < myself.i_ai0) {
if (myself.Skill_GetConsumeMP(PowerUp) < myself.sm.mp && myself.Skill_GetConsumeHP(PowerUp) < myself.sm.hp && myself.Skill_InReuseDelay(PowerUp) == 0) {
myself.AddUseSkillDesire(myself.sm, PowerUp, 1, 1, 1000000);

}

}

} else {
myself.i_ai0 = 1;
if (myself.i_ai0 > myself.i_ai0) {
myself.i_ai0 = myself.i_ai0 + 1;

}

}
switch (myself.i_ai0) {
case 1: {
i0 = 0;
i1 = 0;
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i0 = 1;

}
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i1 = 1;

}
if (gg.Rand(10000) < 500) {
myself.AddUseSkillDesire(myself.sm, Meteor, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(c2, Fear, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1000 && i0 == 1 && myself.i_quest0 == 1) {
myself.AddUseSkillDesire(c2, RearStrike, 0, 1, 1000000);
myself.i_quest0 = 0;

} else if (gg.Rand(10000) < 1500 && i1 == 1) {
myself.AddUseSkillDesire(c2, RearThrow, 0, 1, 1000000);

} else if (gg.Rand(10000) < 500 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Body, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5618, 10 * 1000);

} else if (gg.Rand(10000) < 500 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Soul, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5619, 10 * 1000);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(c2, BreathLow, 0, 1, 1000000);

} else if (myself.GetDirection(c2) > 0 && myself.GetDirection(c2) <= 180) {
myself.AddUseSkillDesire(c2, NorMalAttackRight, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, NorMalAttackLeft, 0, 1, 1000000);

}
break;

}
case 2: {
i0 = 0;
i1 = 0;
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i0 = 1;

}
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i1 = 1;

}
if (gg.Rand(10000) < 500) {
myself.AddUseSkillDesire(myself.sm, Meteor, 0, 1, 1000000);

} else if (gg.Rand(10000) < 4000) {
myself.AddUseSkillDesire(c2, Fear, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1500 && i0 == 1 && myself.i_quest0 == 1) {
myself.AddUseSkillDesire(c2, RearStrike, 0, 1, 1000000);
myself.i_quest0 = 0;

} else if (gg.Rand(10000) < 1500 && i1 == 1) {
myself.AddUseSkillDesire(c2, RearThrow, 0, 1, 1000000);

} else if (gg.Rand(10000) < 700 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Body, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5618, 10 * 1000);

} else if (gg.Rand(10000) < 700 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Soul, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5619, 10 * 1000);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(c2, BreathLow, 0, 1, 1000000);

} else if (myself.GetDirection(c2) > 0 && myself.GetDirection(c2) <= 180) {
myself.AddUseSkillDesire(c2, NorMalAttackRight, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, NorMalAttackLeft, 0, 1, 1000000);

}
break;

}
case 3: {
i0 = 0;
i1 = 0;
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i0 = 1;

}
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i1 = 1;

}
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, Meteor, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(c2, Fear, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1500 && i0 == 1 && myself.i_quest0 == 1) {
myself.AddUseSkillDesire(c2, RearStrike, 0, 1, 1000000);
myself.i_quest0 = 0;

} else if (gg.Rand(10000) < 1000 && i1 == 1) {
myself.AddUseSkillDesire(c2, RearThrow, 0, 1, 1000000);

} else if (gg.Rand(10000) < 2600 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Body, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5618, 10 * 1000);

} else if (gg.Rand(10000) < 2600 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Soul, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5619, 10 * 1000);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(c2, BreathLow, 0, 1, 1000000);

} else if (myself.GetDirection(c2) > 0 && myself.GetDirection(c2) <= 180) {
myself.AddUseSkillDesire(c2, NorMalAttackRight, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, NorMalAttackLeft, 0, 1, 1000000);

}
break;

}
case 4: {
i0 = 0;
i1 = 0;
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i0 = 1;

}
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i1 = 1;

}
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, Meteor, 0, 1, 1000000);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(c2, Fear, 0, 1, 1000000);

} else if (gg.Rand(10000) < 2500 && i0 == 1 && myself.i_quest0 == 1) {
myself.AddUseSkillDesire(c2, RearStrike, 0, 1, 1000000);
myself.i_quest0 = 0;

} else if (gg.Rand(10000) < 2500 && i1 == 1) {
myself.AddUseSkillDesire(c2, RearThrow, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1500 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Body, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5618, 10 * 1000);

} else if (gg.Rand(10000) < 1500 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Soul, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5619, 10 * 1000);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(c2, BreathLow, 0, 1, 1000000);

} else if (myself.GetDirection(c2) > 0 && myself.GetDirection(c2) <= 180) {
myself.AddUseSkillDesire(c2, NorMalAttackRight, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, NorMalAttackLeft, 0, 1, 1000000);

}
break;

}
case 5: {
i0 = 0;
i1 = 0;
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i0 = 1;

}
if (myself.DistFromMe(c2) < 1423 && myself.GetDirection(c2) < 180 + 8 && myself.GetDirection(c2) > 180 - 8 || myself.DistFromMe(c2) < 802 && myself.GetDirection(c2) < 180 + 14 && myself.GetDirection(c2) > 180 - 14) {
i1 = 1;

}
if (gg.Rand(10000) < 3700) {
myself.AddUseSkillDesire(myself.sm, Meteor, 0, 1, 1000000);

} else if (gg.Rand(10000) < 3700) {
myself.AddUseSkillDesire(c2, Fear, 0, 1, 1000000);

} else if (gg.Rand(10000) < 2500 && i0 == 1 && myself.i_quest0 == 1) {
myself.AddUseSkillDesire(c2, RearStrike, 0, 1, 1000000);
myself.i_quest0 = 0;

} else if (gg.Rand(10000) < 2500 && i1 == 1) {
myself.AddUseSkillDesire(c2, RearThrow, 0, 1, 1000000);

} else if (gg.Rand(10000) < 1570 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Body, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5618, 10 * 1000);

} else if (gg.Rand(10000) < 1570 && myself.IsInCategory(1, c2.occupation) || myself.IsInCategory(70, c2.occupation) || myself.IsInCategory(3, c2.occupation) && gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Body)) <= 0 || gg.GetAbnormalLevel(c2, myself.Skill_GetAbnormalType(PowerWord_Soul)) <= 0 && myself.IsNullCreature(myself.c_ai1)) {
myself.AddUseSkillDesire(c2, PowerWord_Soul, 0, 1, 1000000);
myself.c_ai1 = c2;
myself.AddTimerEx(5619, 10 * 1000);

} else if (gg.Rand(10000) < 3700) {
myself.AddUseSkillDesire(c2, BreathLow, 0, 1, 1000000);

} else if (myself.GetDirection(c2) > 0 && myself.GetDirection(c2) <= 180) {
myself.AddUseSkillDesire(c2, NorMalAttackRight, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c2, NorMalAttackLeft, 0, 1, 1000000);

}
break;

}

}

}

}
if (timer_id == 1111) {
myself.SpecialCamera(myself.sm, 1100, 210, -5, 3000, 15000, 10000, -13, 0, 1, 1, 0);
myself.AddTimerEx(1112, 3500);

}
if (timer_id == 1112) {
myself.SpecialCamera(myself.sm, 1300, 200, -8, 3000, 15000, 10000, 0, 15, 1, 1, 0);
myself.AddTimerEx(1113, 4500);

}
if (timer_id == 1113) {
myself.SpecialCamera(myself.sm, 1000, 190, 0, 500, 15000, 10000, 0, 10, 1, 1, 0);
myself.AddTimerEx(1114, 500);

}
if (timer_id == 1114) {
myself.SpecialCamera(myself.sm, 1700, 120, 0, 2500, 15000, 10000, 12, 40, 1, 1, 0);
myself.AddTimerEx(1115, 4600);

}
if (timer_id == 1115) {
myself.SpecialCamera(myself.sm, 1700, 20, 0, 700, 15000, 10000, 10, 10, 1, 1, 0);
myself.AddTimerEx(1116, 750);

}
if (timer_id == 1116) {
myself.SpecialCamera(myself.sm, 1700, 10, 0, 1000, 15000, 10000, 20, 70, 1, 1, 0);
myself.AddTimerEx(1117, 2500);

}
if (timer_id == 1117) {
myself.SpecialCamera(myself.sm, 1700, 10, 0, 300, 15000, 250, 20, -20, 1, 1, 0);

}
super;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam plist0, HandlerParam pos0, HandlerParam last_attacker, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam party0) {
myself.UnregisterGlobalMap(GM_ID);
myself.SetDBValue(myself.sm, 0);
myself.EffectMusic(myself.sm, 10000, "B03_D");
myself.SpecialCamera(myself.sm, 2000, 130, -1, 0, 15000, 10000, 0, 0, 1, 1, 0);
myself.AddTimerEx(1111, 500);
c0 = last_attacker;
if (myself.IsNullCreature(c0) == 0) {
i0 = myself.MPCC_GetMPCCId(c0);
if (i0 > 0) {
for (i1 = 0; i1 < myself.MPCC_GetPartyCount(i0); i1 = i1 + 1) {
i2 = myself.MPCC_GetPartyID(i0, i1);
party0 = gg.GetPartyFromID(i2);
if (myself.IsNullParty(party0) == 0) {
for (i3 = 0; i3 < party0.member_count; i3 = i3 + 1) {
c1 = myself.GetMemberOfParty(party0, i3);
if (myself.IsNullCreature(c1) == 0 && myself.DistFromMe(c1) < 8000) {
if (gg.HaveMemo(c1, 10291) == 1 && gg.GetMemoState(c1, 10291) == 1 && gg.OwnItemCount(c1, 15524) > 0) {
myself.DeleteItem1(c1, 15524, gg.OwnItemCount(c1, 15524));
myself.GiveItem1(c1, 15525, 1);
myself.SetMemoState(c1, 10291, 2);
myself.SetFlagJournal(c1, 10291, 2);
myself.ShowQuestMark(c1, 10291);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}

}

}

}
	}


}