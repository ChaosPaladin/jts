package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_of_frintessa_tran_set_db extends default_npc {
	protected int Swing = 328597507;
	protected int Dash = 328663043;
	protected int DashAll = 328663046;
	protected int AntiGravity = 328728577;
	protected int MagicCircle = 328859650;
	protected int Vampiric = 328925185;
	protected int GM_ID = 6;
	protected String evilate_maker1 = "godard32_1713_103m1";
	protected String evilate_maker2 = "godard32_1713_104m1";
	protected int Dispel_Debuff = 1;

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam maker0, HandlerParam c1, HandlerParam i1, HandlerParam c2, HandlerParam i0, HandlerParam i2, HandlerParam c0) {
myself.AddTimerEx(1001, 2000);
myself.i_ai4 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.i_ai9 = 0;
myself.AddTimerEx(2, 3000);
myself.AddTimerEx(3, 6000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (script_event_arg1 == 99999999) {
myself.MPCC_SetMasterPartyRouting(script_event_arg2, myself.sm, 1);
myself.int_list.Add(script_event_arg2);

} else if (script_event_arg1 == 7) {
myself.AddTimerEx(1001, 2000);

} else if (script_event_arg1 == 10001031) {
myself.i_ai7 = script_event_arg2;

} else if (script_event_arg1 == 10001032) {
myself.i_ai8 = script_event_arg2;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c2, HandlerParam c3, HandlerParam i3, HandlerParam maker0, HandlerParam h0) {
if (timer_id == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001013, myself.sm.id, 0);

}

} else if (timer_id == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001021, myself.sm.id, 0);
gg.SendMakerScriptEvent(maker0, 10001022, myself.sm.id, 0);

}

} else if (timer_id == 1001) {
myself.i_quest1 = myself.GetCurrentTick();
c3 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c3) == 0) {
gg.SendScriptEvent(c3, gg.GetIndexFromCreature(myself.sm), 7);

}
myself.AddTimerEx(2101, 2000);

} else if (timer_id == 2101) {
myself.AddTimerEx(2102, 100);

} else if (timer_id == 2102) {
myself.SpecialCamera3(myself.sm, 250, 180, 20, 0, 5000, 10000, 0, 6, 1, 1, 1);
myself.AddTimerEx(2103, 100);

} else if (timer_id == 2103) {
myself.SpecialCamera3(myself.sm, 250, 180, 20, 0, 5000, 10000, 0, 6, 1, 1, 1);
myself.AddTimerEx(2104, 400);

} else if (timer_id == 2104) {
myself.SpecialCamera3(myself.sm, 300, 220, 0, 3000, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(1900, 3000);

} else if (timer_id == 1900) {
myself.AddTimerEx(5001, 4000);

} else if (timer_id == 5001) {
myself.i_ai0 = 30020;
myself.AddTimerEx(5004, 5000);

} else if (timer_id == 5004) {
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), evilate_maker1);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
maker0 = gg.InstantZone_GetNpcMaker(myself.InstantZone_GetId(), evilate_maker2);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.BroadcastScriptEvent(20000, 0, 8000);
myself.i_ai0 = 7;
myself.i_ai4 = 1;
myself.LookNeighbor(4000);
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
myself.i_quest1 = myself.GetCurrentTick();
myself.AddTimerEx(3000, 60 * 1000);

} else if (timer_id == 2000) {
myself.SpecialCamera3(myself.sm, 430, 300, 80, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(2001, 100);

} else if (timer_id == 2001) {
myself.EffectMusic(myself.sm, 6000, "BS05_D");
myself.SpecialCamera3(myself.sm, 430, 300, 80, 0, 5000, 10000, 0, 0, 1, 1, 1);
myself.AddTimerEx(2002, 400);

} else if (timer_id == 2002) {
myself.SpecialCamera3(myself.sm, 0, 180, 80, 4000, 5000, 6000, 0, 0, 1, 1, 1);
myself.AddTimerEx(2003, 6000);

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam plist0, HandlerParam pos0, HandlerParam i1, HandlerParam c1) {
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(15);
myself.BroadcastScriptEvent(gg.GetIndexFromCreature(myself.sm), 8, 8000);
myself.AddTimerEx(2000, 1);
	}


}