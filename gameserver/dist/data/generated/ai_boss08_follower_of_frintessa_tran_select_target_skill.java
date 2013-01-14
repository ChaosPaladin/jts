package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_of_frintessa_tran_select_target_skill extends ai_boss08_follower_of_frintessa_tran_decide_action {
	protected void CREATED(HandlerParam reply) {
super;
myself.AddTimerEx(3001, 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam skill_name_id, HandlerParam maker0, HandlerParam i3, HandlerParam c3, HandlerParam h0) {
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
if (skill_name_id == 328204290) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

}
h0 = myself.GetMaxHateInfo(0);
c2 = h0.creature;
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.750000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.250000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.100000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

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

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * 2, 0);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
super;
if (timer_id == 3001) {
if (myself.i_ai0 == 7) {
h0 = myself.GetMaxHateInfo(0);
c2 = h0.creature;
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.750000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.250000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.100000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

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

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

}

}
myself.LookNeighbor(2000);
myself.AddTimerEx(3001, 60 * 1000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
if (myself.i_ai4 == 0) {
return;

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * 10.000000 * 1.500000), 0, 1, 1);

} else {
myself.AddHateInfo(creature, gg.FloatToInt(FloatToInt * 10.000000), 0, 1, 1);

}

}
h0 = myself.GetMaxHateInfo(0);
c2 = h0.creature;
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.750000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.250000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.100000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

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

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c2, HandlerParam h0) {
if (skill_name_id == DashAll && success == 1 && myself.i_ai2 == 3) {
myself.i_ai2 = 0;
h0 = myself.GetMaxHateInfo(0);
c2 = h0.creature;
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.750000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.250000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.100000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

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

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

}

} else {
h0 = myself.GetMaxHateInfo(0);
c2 = h0.creature;
if (myself.IsNullCreature(c2) == 0) {
if (myself.i_ai2 > 0) {
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.750000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.250000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 750) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 500) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.100000) {
if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

}
myself.i_ai2 = 0;

} else {
myself.i_ai2 = 0;

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, AntiGravity, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, MagicCircle, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 1000) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

} else if (gg.Rand(10000) < 2000) {
if (myself.IsInThisTerritory("25_15_frintessa_NoCharge01") == 1) {
if (myself.GetHateInfoCount() >= 5) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullCreature(h0.creature) == 0 && myself.DistFromMe(h0.creature) >= 500 && myself.DistFromMe(h0.creature) <= 1000) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);
return;

}

}

}

}

} else if (gg.Rand(10000) < 1000) {
myself.i_ai2 = 1;
if (myself.i_ai2 > 0 && myself.i_ai2 < 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Dash, 0, 1, 10000);

}
myself.i_ai2 = myself.i_ai2 + 1;

} else if (myself.i_ai2 == 3) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, DashAll, 0, 1, 10000);

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

} else if (gg.Rand(10000) < 0) {
if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Vampiric, 0, 1, 10000);

}

} else if (myself.IsNullCreature(c2) == 0) {
myself.AddUseSkillDesire(c2, Swing, 0, 1, 10000);

}

}

}
	}


}