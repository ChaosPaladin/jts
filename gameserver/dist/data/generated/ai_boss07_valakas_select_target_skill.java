package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss07_valakas_select_target_skill extends ai_boss07_valakas_decide_action {
	protected void CREATED(HandlerParam reply, HandlerParam i0) {
super;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
for (i0 = 0; i0 < 4; i0 = i0 + 1) {
myself.SetHateInfoListIndex(i0);
myself.SetMaxHateListSize(200);

}
myself.i_ai0 = 1;
myself.AddTimerEx(1003, 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c2, HandlerParam skill_name_id, HandlerParam h0, HandlerParam h1) {
super;
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
c0 = attacker.master;

} else {
c0 = attacker;

}
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
if (myself.IsInCategory(5, c0.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 3;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 2;
break;

}
case 4: {
myself.i_ai1 = 7;
break;

}
case 5: {
myself.i_ai1 = 5;
break;

}

}

} else if (myself.IsInCategory(112, c0.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else if (myself.IsInCategory(1, c0.occupation) || myself.IsInCategory(70, c0.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 10;
break;

}
case 3: {
myself.i_ai1 = 3;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 10;
break;

}
case 2: {
myself.i_ai1 = 8;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 4;
break;

}

}

}
myself.SetHateInfoListIndex(0);
myself.AddHateInfo(c0, gg.FloatToInt(damage / myself.i_ai1), 0, 1, 1);
if (myself.IsInCategory(5, c0.occupation)) {
myself.SetHateInfoListIndex(1);
myself.AddHateInfo(c0, gg.FloatToInt(damage / myself.i_ai1), 0, 1, 1);
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(c0, gg.FloatToInt(damage / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(1, c0.occupation) || myself.IsInCategory(70, c0.occupation)) {
myself.SetHateInfoListIndex(3);
myself.AddHateInfo(c0, gg.FloatToInt(damage / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(3, c0.occupation)) {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(c0, gg.FloatToInt(damage / myself.i_ai1 * 2), 0, 1, 1);

} else {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(c0, gg.FloatToInt(damage / myself.i_ai1), 0, 1, 1);

}
if (myself.sm.db_value == 3 && myself.p_state == 1 || myself.p_state == 0) {
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
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c2, HandlerParam h0, HandlerParam h1) {
super;
if (timer_id == 1003) {
if (myself.sm.db_value == 3 && myself.p_state == 1 || myself.p_state == 0) {
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
myself.AddTimerEx(1003, 60 * 1000);

}
if (timer_id == 3423) {
for (i0 = 0; i0 < 4; i0 = i0 + 1) {
myself.SetHateInfoListIndex(i0);
for (i1 = 0; i1 < myself.GetHateInfoCount(); i1 = i1 + 1) {
h0 = myself.GetHateInfoByIndex(i1);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddHateInfo(h0.creature, h0.hate / 2, 0, 1, 0);

}

}

}

}
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
myself.AddTimerEx(3423, 180 * 1000);
break;

}
case 2: {
myself.AddTimerEx(3423, 150 * 1000);
break;

}
case 3: {
myself.AddTimerEx(3423, 120 * 1000);
break;

}
case 4: {
myself.AddTimerEx(3423, 60 * 1000);
break;

}
case 5: {
myself.AddTimerEx(3423, 30 * 1000);
break;

}

}

}
if (timer_id == 3424) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.SetHateInfoListIndex(0);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
myself.c_ai0 = h0.creature;

}

} else {
myself.SetHateInfoListIndex(1);
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.c_ai0 == h0.creature) {
for (i0 = 0; i0 < 4; i0 = i0 + 1) {
myself.SetHateInfoListIndex(i0);
h0 = myself.GetHateInfoByCreature(myself.c_ai0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddHateInfo(myself.c_ai0, h0.hate / 2, 0, 1, 0);

}

}

}
myself.c_ai0 = gg.GetNullCreature();

}

}

}
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
myself.AddTimerEx(3424, 45 * 1000);
break;

}
case 2: {
myself.AddTimerEx(3424, 45 * 1000);
break;

}
case 3: {
myself.AddTimerEx(3424, 60 * 1000);
break;

}
case 4: {
myself.AddTimerEx(3424, 30 * 1000);
break;

}
case 5: {
myself.AddTimerEx(3424, 45 * 1000);
break;

}

}

}
if (timer_id == 5618) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
myself.AddUseSkillDesire(myself.c_ai1, PowerWord_Body_2nd, 0, 1, 10000000);
myself.c_ai1 = gg.GetNullCreature();

}

}
if (timer_id == 5619) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
myself.AddUseSkillDesire(myself.c_ai1, PowerWord_Soul_2nd, 0, 1, 10000000);
myself.c_ai1 = gg.GetNullCreature();

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0, HandlerParam h1) {
super;
if (myself.sm.db_value == 3 && myself.IsInCategory(3, creature.occupation)) {
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
if (myself.IsInCategory(5, creature.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 3;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 2;
break;

}
case 4: {
myself.i_ai1 = 7;
break;

}
case 5: {
myself.i_ai1 = 5;
break;

}

}

} else if (myself.IsInCategory(112, creature.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else if (myself.IsInCategory(1, creature.occupation) || myself.IsInCategory(70, creature.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 10;
break;

}
case 3: {
myself.i_ai1 = 3;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 10;
break;

}
case 2: {
myself.i_ai1 = 8;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 4;
break;

}

}

}
myself.SetHateInfoListIndex(0);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);
if (myself.IsInCategory(5, creature.occupation)) {
myself.SetHateInfoListIndex(1);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(1, creature.occupation) || myself.IsInCategory(70, creature.occupation)) {
myself.SetHateInfoListIndex(3);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(3, creature.occupation)) {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1 * 2), 0, 1, 1);

} else {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

}

} else if (creature.is_pc == 1) {
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
if (myself.IsInCategory(5, creature.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 3;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 2;
break;

}
case 4: {
myself.i_ai1 = 7;
break;

}
case 5: {
myself.i_ai1 = 5;
break;

}

}

} else if (myself.IsInCategory(112, creature.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else if (myself.IsInCategory(1, creature.occupation) || myself.IsInCategory(70, creature.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 10;
break;

}
case 3: {
myself.i_ai1 = 3;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 10;
break;

}
case 2: {
myself.i_ai1 = 8;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 4;
break;

}

}

}
myself.SetHateInfoListIndex(0);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);
if (myself.IsInCategory(5, creature.occupation)) {
myself.SetHateInfoListIndex(1);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(1, creature.occupation) || myself.IsInCategory(70, creature.occupation)) {
myself.SetHateInfoListIndex(3);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(3, creature.occupation)) {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1 * 2), 0, 1, 1);

} else {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

}

} else {
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
if (myself.IsInCategory(5, creature.master.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 3;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 2;
break;

}
case 4: {
myself.i_ai1 = 7;
break;

}
case 5: {
myself.i_ai1 = 5;
break;

}

}

} else if (myself.IsInCategory(112, creature.master.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 3;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else if (myself.IsInCategory(1, creature.master.occupation) || myself.IsInCategory(70, creature.master.occupation)) {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 6;
break;

}
case 2: {
myself.i_ai1 = 10;
break;

}
case 3: {
myself.i_ai1 = 3;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 3;
break;

}

}

} else {
switch (myself.i_ai0) {
case 1: {
myself.i_ai1 = 10;
break;

}
case 2: {
myself.i_ai1 = 8;
break;

}
case 3: {
myself.i_ai1 = 7;
break;

}
case 4: {
myself.i_ai1 = 5;
break;

}
case 5: {
myself.i_ai1 = 4;
break;

}

}

}
myself.SetHateInfoListIndex(0);
myself.AddHateInfo(creature.master, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);
if (myself.IsInCategory(5, creature.master.occupation)) {
myself.SetHateInfoListIndex(1);
myself.AddHateInfo(creature.master, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature.master, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(1, creature.master.occupation) || myself.IsInCategory(70, creature.master.occupation)) {
myself.SetHateInfoListIndex(3);
myself.AddHateInfo(creature.master, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

} else if (myself.IsInCategory(3, creature.master.occupation)) {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature.master, gg.FloatToInt(FloatToInt / myself.i_ai1 * 2), 0, 1, 1);

} else {
myself.SetHateInfoListIndex(2);
myself.AddHateInfo(creature.master, gg.FloatToInt(FloatToInt / myself.i_ai1), 0, 1, 1);

}

}
if (myself.sm.db_value == 3 && myself.p_state == 1 || myself.p_state == 0) {
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
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * 3, 0);
	}

	protected void USE_SKILL_FINISHED(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0, HandlerParam h1) {
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


}