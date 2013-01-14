package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_servant_of_kserth extends default_npc {
	protected int inzone_id1 = 110;
	protected int FieldCycle = 2;
	protected int GM_ID1 = 17;
	protected int GM_ID2 = 18;
	protected int enter_type = 2;
	protected String ambush_maker_11 = "rumwarsha1224_611m1";
	protected String ambush_maker_12 = "rumwarsha1224_612m1";
	protected String ambush_maker_13 = "rumwarsha1224_613m1";
	protected String ambush_maker_21 = "rumwarsha1224_621m1";
	protected String ambush_maker_22 = "rumwarsha1224_622m1";
	protected String ambush_maker_23 = "rumwarsha1224_623m1";
	protected String ambush_maker_31 = "rumwarsha1224_601m1";
	protected String ambush_maker_32 = "rumwarsha1224_602m1";
	protected String ambush_maker_33 = "rumwarsha1224_603m1";
	protected String ambush_maker_34 = "rumwarsha1224_604m1";
	protected int real_npc = 1;
	protected String fnHi = "default.htm";

	protected void CREATED(HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (real_npc == 0) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 250234, 4336, 50);
myself.AddTimerEx(9875, 10000);
return;

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 1;
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 0) {
gg.SetStepWithoutActor_FieldCycle(FieldCycle, 1, 1);
gg.RegisterDBSavingMap(GM_ID1, myself.Castle_GetRawSystemTime());

} else if (i0 == 1) {
gg.LoadDBSavingMap(myself.sm, GM_ID1);
if (myself.i_ai0 < 0) {
myself.i_ai0 = myself.Castle_GetRawSystemTime();
gg.RegisterDBSavingMap(GM_ID1, myself.i_ai0);

}
myself.i_ai2 = 1;

} else if (i0 == 2) {
gg.LoadDBSavingMap(myself.sm, GM_ID1);
if (myself.i_ai0 <= 0) {
myself.i_ai0 = myself.Castle_GetRawSystemTime();
gg.RegisterDBSavingMap(GM_ID1, myself.i_ai0);

}
myself.i_ai2 = 2;

} else if (i0 >= 3) {
myself.i_ai1 = 0;
gg.SetStep_FieldCycle(FieldCycle, 2, 5, myself.sm);
myself.i_ai2 = 2;

}
myself.AddTimerEx(1001, 60 * 1000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
if (real_npc == 0) {
return;

}
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 == 1) {
myself.ShowPage(talker, "servant_of_Kserth001.htm");

} else if (i0 == 2) {
myself.ShowPage(talker, "servant_of_Kserth002.htm");

} else if (i0 == 3 || i0 == 4 || i0 == 5) {
myself.ShowPage(talker, "servant_of_Kserth003.htm");

} else {
myself.Say("필드사이클 단계 오류");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam party0, HandlerParam c0, HandlerParam c1) {
if (real_npc == 0) {
return;

}
if (ask == -1101) {
if (reply == 1) {
i0 = myself.MPCC_GetMPCCId(talker);
i1 = myself.MPCC_GetPartyCount(i0);
if (i0 > 0) {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
i6 = myself.MPCC_GetPartyID(i0, i2);
party0 = gg.GetPartyFromID(i6);
i4 = party0.member_count;
for (i5 = 0; i5 < i4; i5 = i5 + 1) {
c1 = myself.GetMemberOfParty(party0, i5);
if (myself.IsNullCreature(c1) == 0) {
if (c1.transformID == 260 || c1.transformID == 8 || c1.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}

}

}

}

} else if (talker.transformID == 260 || talker.transformID == 8 || talker.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}
myself.InstantZone_Enter(talker, inzone_id1, enter_type);

} else if (reply == 2) {
myself.ShowPage(talker, "servant_of_Kserth001c.htm");

} else if (reply == 11) {
if (talker.transformID == 260 || talker.transformID == 8 || talker.transformID == 9) {
myself.ShowSystemMessage(talker, 2924);
return;

}
myself.InstantTeleport(talker, -245337, 220406, -12104);

} else if (reply == 12) {
myself.ShowPage(talker, "servant_of_Kserth002a.htm");

} else if (reply == 21) {
myself.ShowPage(talker, "servant_of_Kserth003a.htm");

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event3, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 9842001) {
if (real_npc == 0) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 250234, 4336, 50);
return;

}

} else if (script_event_arg1 == 9842002) {
if (myself.i_ai2 == 1) {
gg.RegisterDBSavingMap(GM_ID1, myself.Castle_GetRawSystemTime());
myself.i_ai0 = myself.Castle_GetRawSystemTime();
myself.i_ai1 = 0;
myself.i_ai2 = 2;

}

} else if (script_event_arg1 == 9842003) {

} else if (script_event_arg1 == 9842004) {

} else if (script_event_arg1 == 9842005) {

} else if (script_event_arg1 == 1224013) {
myself.AddTimerEx(2001, 1);

} else if (script_event_arg1 == 1224014) {
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (i0 >= 3) {
myself.AddTimerEx(2002, 1);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam maker0) {
if (timer_id == 9875) {
if (real_npc == 0) {
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 250234, 4336, 50);
myself.Despawn();

}

}
i0 = gg.GetStep_FieldCycle(FieldCycle);
if (timer_id == 1001) {
i1 = gg.GetPoint_FieldCycle(FieldCycle);
i2 = myself.Castle_GetRawSystemTime();
gg.LoadDBSavingMap(myself.sm, GM_ID1);
if (i0 == 1) {
if (i2 > myself.i_ai0 + 259200) {

} else if (i2 > myself.i_ai0 + 518400) {
if (i1 < 50000) {
gg.SetStep_FieldCycle(FieldCycle, 1, 5, myself.sm);
gg.RegisterDBSavingMap(GM_ID1, myself.Castle_GetRawSystemTime());
myself.i_ai0 = myself.Castle_GetRawSystemTime();
myself.i_ai1 = 0;
myself.i_ai2 = 1;

} else {
gg.SetStep_FieldCycle(FieldCycle, 2, 5, myself.sm);
gg.RegisterDBSavingMap(GM_ID1, myself.Castle_GetRawSystemTime());
myself.i_ai0 = myself.Castle_GetRawSystemTime();
myself.i_ai1 = 0;
myself.i_ai2 = 2;

}

}

} else if (i0 == 2) {
if (i2 > myself.i_ai0 + 43200 && i2 <= myself.i_ai0 + 43500 && myself.i_ai1 == 0) {
myself.i_ai1 = 5;
myself.AddTimerEx(5005, 60 * 1000);

} else if (i2 > myself.i_ai0 + 43500 && i2 <= myself.i_ai0 + 86400 && myself.i_ai1 == 0) {
myself.Shout(gg.MakeFString(1800717, "", "", "", "", ""));
i4 = gg.Rand(100);
if (i4 < 20) {
myself.i_ai1 = 1;
myself.AddTimerEx(5001, 60 * 60 * 1000);

} else if (i4 < 70) {
myself.i_ai1 = 2;
myself.AddTimerEx(5002, 60 * 60 * 1000);

} else {
i5 = gg.Rand(100);
if (i5 < 80) {
myself.i_ai1 = 3;
myself.AddTimerEx(5003, 60 * 60 * 1000);

} else {
myself.i_ai1 = 4;
myself.AddTimerEx(5004, 60 * 60 * 1000);

}

}

} else if (i2 > myself.i_ai0 + 86400 && myself.i_ai1 == 0) {
myself.i_ai1 = 4;
myself.AddTimerEx(5004, 1000);

}

}
myself.AddTimerEx(1001, 60 * 1000);

} else if (timer_id == 2001) {
if (myself.i_ai1 != 0) {
if (myself.i_ai1 == 10) {
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}

} else if (myself.i_ai1 == 20) {
maker0 = gg.GetNpcMaker(ambush_maker_21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}

} else if (myself.i_ai1 == 30) {
maker0 = gg.GetNpcMaker(ambush_maker_31);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_32);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_33);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_34);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224013, 0, 0);

}

}
gg.SetStep_FieldCycle(FieldCycle, 2, 5, myself.sm);
myself.i_ai1 = 0;

}

} else if (timer_id == 2002) {
if (myself.i_ai1 == 10) {
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}

} else if (myself.i_ai1 == 20) {
maker0 = gg.GetNpcMaker(ambush_maker_21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}

} else if (myself.i_ai1 == 30) {
maker0 = gg.GetNpcMaker(ambush_maker_31);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_32);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_33);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_34);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224014, 0, 0);

}

}
gg.SetStep_FieldCycle(FieldCycle, 1, 5, myself.sm);
myself.InstantTeleportInMyTerritory(-InstantTeleportInMyTerritory, 250234, 4336, 50);
myself.i_ai0 = myself.Castle_GetRawSystemTime();
gg.RegisterDBSavingMap(GM_ID1, myself.i_ai0);
myself.i_ai1 = 0;
myself.i_ai2 = 1;

} else if (timer_id == 5001) {
if (myself.i_ai1 == 1) {
myself.i_ai1 = 10;
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 3, 5, myself.sm);
myself.AddTimerEx(2001, 10 * 60 * 1000);

}

} else if (timer_id == 5002) {
if (myself.i_ai1 == 2) {
myself.i_ai1 = 10;
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 3, 5, myself.sm);
myself.AddTimerEx(2001, 20 * 60 * 1000);

}

} else if (timer_id == 5003) {
if (myself.i_ai1 == 3) {
myself.i_ai1 = 10;
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 3, 5, myself.sm);
myself.AddTimerEx(2001, 30 * 60 * 1000);

}

} else if (timer_id == 5004) {
if (myself.i_ai1 == 4) {
myself.i_ai1 = 20;
maker0 = gg.GetNpcMaker(ambush_maker_21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 4, 5, myself.sm);
myself.AddTimerEx(2001, 30 * 60 * 1000);

}

} else if (timer_id == 5005) {
if (myself.i_ai1 == 5) {
myself.i_ai1 = 30;
maker0 = gg.GetNpcMaker(ambush_maker_31);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_32);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_33);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_34);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 5, 5, myself.sm);
myself.AddTimerEx(2001, 60 * 60 * 1000);

}

}
	}

	protected void LOAD_DBSAVING_MAP_RETURNED(HandlerParam talker, HandlerParam i0, HandlerParam i1) {
if (i0 == GM_ID1) {
myself.i_ai0 = i1;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam maker0) {
if (real_npc == 0) {
return;

}
if (gg.OwnItemCount(attacker, 57) == 1980 && gg.OwnItemCount(attacker, 214) == 1) {
myself.i_ai1 = 10;
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 3, 5, myself.sm);
myself.AddTimerEx(2001, 10 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, 57) == 1981 && gg.OwnItemCount(attacker, 214) == 1) {
myself.i_ai1 = 10;
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 3, 5, myself.sm);
myself.AddTimerEx(2001, 20 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, 57) == 1982 && gg.OwnItemCount(attacker, 214) == 1) {
myself.i_ai1 = 10;
maker0 = gg.GetNpcMaker(ambush_maker_11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 3, 5, myself.sm);
myself.AddTimerEx(2001, 30 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, 57) == 1983 && gg.OwnItemCount(attacker, 214) == 1) {
myself.i_ai1 = 20;
maker0 = gg.GetNpcMaker(ambush_maker_21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 4, 5, myself.sm);
myself.AddTimerEx(2001, 30 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, 57) == 1984 && gg.OwnItemCount(attacker, 214) == 1) {
myself.i_ai1 = 30;
maker0 = gg.GetNpcMaker(ambush_maker_31);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_32);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_33);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
maker0 = gg.GetNpcMaker(ambush_maker_34);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1224012, 0, 0);

}
gg.SetStep_FieldCycle(FieldCycle, 5, 5, myself.sm);
myself.i_ai4 = 5;
myself.AddTimerEx(2001, 60 * 60 * 1000);

} else if (gg.OwnItemCount(attacker, 57) == 1985 && gg.OwnItemCount(attacker, 214) == 1) {
gg.SetStep_FieldCycle(FieldCycle, 2, 5, myself.sm);
myself.i_ai0 = myself.Castle_GetRawSystemTime();
gg.RegisterDBSavingMap(GM_ID1, myself.i_ai0);
myself.i_ai1 = 0;
myself.i_ai4 = 0;
myself.i_ai2 = 2;

} else if (gg.OwnItemCount(attacker, 57) == 1986 && gg.OwnItemCount(attacker, 214) == 1) {
gg.AddPoint_FieldCycle(2, 200000, 1, myself.sm);

} else if (gg.OwnItemCount(attacker, 57) == 1987 && gg.OwnItemCount(attacker, 214) == 1) {
gg.SetStep_FieldCycle(FieldCycle, 1, 5, myself.sm);
myself.i_ai0 = myself.Castle_GetRawSystemTime();
gg.RegisterDBSavingMap(GM_ID1, myself.i_ai0);
myself.i_ai1 = 0;
myself.i_ai4 = 0;
myself.i_ai2 = 1;

}
	}


}