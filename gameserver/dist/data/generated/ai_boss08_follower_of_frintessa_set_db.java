package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_of_frintessa_set_db extends default_npc {
	protected int GM_ID = 5;
	protected int SwingVer1 = 328597505;
	protected int SwingVer2 = 328597506;
	protected int DashVer1 = 328663041;
	protected int DashVer2 = 328663042;
	protected int DashAllVer1 = 328663044;
	protected int DashAllVer2 = 328663045;
	protected int AntiGravity = 328728577;
	protected int MagicCircle = 328859649;
	protected int GhostBomb = 0;
	protected int ChangeBodySkill = 328794113;
	protected int ChangeWeapon = 7903;
	protected String evilate_maker1 = "godard32_1713_103m1";
	protected String evilate_maker2 = "godard32_1713_104m1";
	protected String maker_frintessa_manager = "godard32_1713_102m1";
	protected int Dispel_Debuff = 1;

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam maker0, HandlerParam i1, HandlerParam c1, HandlerParam i2, HandlerParam c0) {
myself.ChangeMoveType(1);
myself.i_ai4 = 1;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.i_ai9 = 0;
myself.AddTimerEx(2, 3000);
myself.AddTimerEx(3, 6000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam maker0) {
if (script_event_arg1 == 4) {
if (myself.i_ai9 == 1) {
myself.Shout("출격요청 받음");

}
myself.i_quest1 = myself.GetCurrentTick();
myself.CreateOnePrivateInzoneEx(1029053, "ai_boss08_follower_dummy", 0, 0, -87789, -153295, -9176, 16384, 0, 0, 0, myself.InstantZone_GetId());
myself.AddTimerEx(1001, 5500);

} else if (script_event_arg1 == 10001031) {
myself.i_ai7 = script_event_arg2;

} else if (script_event_arg1 == 10001033) {
myself.i_ai8 = script_event_arg2;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c2, HandlerParam c3, HandlerParam maker0, HandlerParam c4, HandlerParam i4, HandlerParam h0) {
if (timer_id == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001012, myself.sm.id, 0);

}

} else if (timer_id == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10001021, myself.sm.id, 0);
gg.SendMakerScriptEvent(maker0, 10001023, myself.sm.id, 0);

}

}
if (timer_id == 1001) {
myself.AddTimerEx(1002, 500);

} else if (timer_id == 1002) {
if (myself.i_ai9 == 1) {
myself.Shout("전투공간으로 이동");

}
gg.InstantTeleportEx(myself.sm, -87789, -153295, -9176, 16384);
myself.AddTimerEx(1003, 8000);

} else if (timer_id == 1003) {
myself.AddTimerEx(1900, 10000);

} else if (timer_id == 1900) {
myself.i_ai4 = 0;
myself.LookNeighbor(4000);
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
myself.AddTimerEx(3000, 60 * 1000);

} else if (timer_id == 2000) {
myself.AddTimerEx(2002, 2000);

} else if (timer_id == 2002) {
myself.AddMoveToDesire(gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) + 50, gg.FloatToInt(myself.sm.z), 10000000);
myself.AddTimerEx(2003, 100);

} else if (timer_id == 2003) {
myself.AddMoveToDesire(gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) + 50, gg.FloatToInt(myself.sm.z), 10000000);
myself.AddTimerEx(2004, 100);

} else if (timer_id == 2004) {
myself.AddEffectActionDesire(myself.sm, 2, 84000, 10000000);
myself.AddTimerEx(2005, 7000);

} else if (timer_id == 2005) {
myself.SpecialCamera3(myself.sm, 250, 180, 20, 0, 5000, 10000, 0, 6, 1, 1, 1);
myself.AddTimerEx(2006, 100);

} else if (timer_id == 2006) {
myself.SpecialCamera3(myself.sm, 250, 180, 20, 0, 5000, 10000, 0, 6, 1, 1, 1);
myself.AddTimerEx(2100, 400);

} else if (timer_id == 2100) {
c4 = gg.GetCreatureFromID(myself.i_ai8);
if (myself.IsNullCreature(c4) == 0) {
gg.InstantTeleportEx(c4, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 16384);
gg.SendScriptEvent(c4, 7, 0);

} else {
myself.Shout("NPC에 문제 있음");

}
myself.AddTimerEx(2109, 50);

} else if (timer_id == 2109) {
myself.Despawn();

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam plist0, HandlerParam pos0, HandlerParam c0, HandlerParam i0, HandlerParam maker0) {
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, gg.GetIndexFromCreature(myself.sm), 30011);

}
myself.UnregisterGlobalMap(GM_ID);
myself.AddTimerEx(2000, 500);
	}


}