package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_of_frintessa_select_target_skill extends ai_boss08_follower_of_frintessa_decide_action {
	protected void CREATED(HandlerParam reply) {
super;
myself.SetMaxHateListSize(50);
myself.AddTimerEx(3001, 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam skill_name_id, HandlerParam maker0, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam f0, HandlerParam h0) {
if (myself.i_ai4 == 1) {
return;

}
super;
if (attacker.yongma_type == 1 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(279052289)) <= 0) {
if (myself.Skill_GetConsumeMP(279052289) < myself.sm.mp && myself.Skill_GetConsumeHP(279052289) < myself.sm.hp && myself.Skill_InReuseDelay(279052289) == 0) {
myself.AddUseSkillDesire(attacker, 279052289, 0, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 10.000000 * 1.500000), 0, 1, 1);

} else {
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 10.000000), 0, 1, 1);

}

}
if (myself.i_ai4 == 0) {
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * 5, 0);
	}

	protected void SPELLED(HandlerParam skill_name_id, HandlerParam maker0, HandlerParam c2, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam h0) {
if (skill_name_id == 328204290) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_103m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_104m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.i_ai2 = 1;
if (myself.i_ai4 == 0) {
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
super;
if (timer_id == 3001) {
if (myself.p_state == 1 || myself.p_state == 0) {
if (myself.i_ai4 == 0) {
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}

}
myself.AddTimerEx(3001, 60 * 1000);

} else if (timer_id == 8000) {
if (myself.i_ai4 == 0) {
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
if (myself.i_ai4 == 1) {
return;

}
super;
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
if (gg.Rand(100) < 1 && myself.sm.db_value == 6) {
gg.SendScriptEvent(creature, 20000, 0);
myself.RemoveAllDesire();
myself.AddEffectActionDesire2(myself.sm, 4, 1500, 10000000, 5000);

}
return;

}
if (myself.i_ai4 == 0) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * 10.000000 * 1.500000), 0, 1, 1);

} else {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * 10.000000), 0, 1, 1);

}

}
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
if (myself.i_ai4 == 0) {
if (skill_name_id == DashAllVer2 && success == 1 && myself.i_ai2 == 3) {
myself.i_ai2 = 0;
if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

} else if (myself.i_ai4 == 0) {
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 5000);
h0 = myself.GetMaxHateInfo(0);
if (gg.IsNull(h0) == 0) {
c2 = h0.creature;

}
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai3 < 30010) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(h0.creature, DashAllVer1, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer1, 0, 1, 10000);

}

}
if (myself.i_ai3 >= 30010) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1500) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashVer2, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAllVer2, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, SwingVer2, 0, 1, 10000);

}

}

}

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam maker0) {
if (script_event_arg1 == 40001) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_103m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), "godard32_1713_104m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
if (myself.sm.db_value == 6) {
myself.i_ai2 = 1;

}

}
super;
	}


}