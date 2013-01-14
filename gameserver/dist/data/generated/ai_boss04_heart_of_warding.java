package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss04_heart_of_warding extends default_npc {
	protected String fnHi = "heart_of_warding001.htm";
	protected String fnBattle = "heart_of_warding003.htm";
	protected String fnNotRespawn = "heart_of_warding002.htm";
	protected String fnNoTicket = "heart_of_warding004.htm";
	protected String fnNoMoreTicket = "heart_of_warding005.htm";
	protected String fnNotAllianceLeader = "heart_of_warding006.htm";
	protected int ticket_no = 200;

	protected void CREATED(HandlerParam reply) {
if (reply == 0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.SetDBValue(myself.sm, 0);

} else {
myself.i_ai0 = myself.sm.db_value;

}
myself.AddTimerEx(2002, 60 * 1000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MPCC_TELEPORTED(HandlerParam talker, HandlerParam reply, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam c2, HandlerParam c3, HandlerParam c4) {
i7 = myself.GetGlobalMap(10);
if (i7 != -1) {
c4 = gg.GetCreatureFromIndex(i7);
i1 = myself.MPCC_GetMPCCId(talker);
if (talker == myself.MPCC_GetMaster(i1) && myself.IsNullCreature(c4) == 0) {
if (reply >= 99) {
gg.SendScriptEvent(c4, 99999999, i1);
myself.i_ai1 = i1;
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "MPCC_TELEPORTED: asking loot permission for alliance", i1, 0, 0, 0, 0, 1);

}
if (reply > 0) {
myself.i_ai0 = myself.i_ai0 + reply;
myself.SetDBValue(myself.sm, myself.i_ai0);
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "MPCC_TELEPORTED: entering alliance detected", reply, myself.i_ai0, myself.sm.db_value, 0, 0, 1);

}

}

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i0, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam i1, HandlerParam i2, HandlerParam c3, HandlerParam c4, HandlerParam c5, HandlerParam c6, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7) {
i0 = myself.GetGlobalMap(10);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0 && c0.alive) {
if (c0.db_value == 0 || c0.db_value == 1) {
if (myself.i_ai0 >= ticket_no) {
myself.ShowPage(talker, fnNoMoreTicket);

} else {
i3 = myself.MPCC_GetMPCCId(talker);
c3 = myself.MPCC_GetMaster(i3);
if (i3 != 0 && talker != c3) {
myself.ShowPage(talker, fnNotAllianceLeader);

} else if (i3 != 0 && talker == c3) {
if (gg.OwnItemCount(talker, 3865) > 0) {
if (myself.MPCC_GetMemberCount(i3) > ticket_no - myself.i_ai0) {
myself.ShowPage(talker, fnNoMoreTicket);

} else {
myself.InstantTeleportMPCC(talker, 179700, 113800, -7709, 1000, 200, 500, 3865, 1);
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TELEPORT_REQUESTED: entering alliance members are detected", myself.MPCC_GetMemberCount(i3), myself.i_ai0, myself.sm.db_value, 0, 0, 1);
if (c0.db_value == 0) {
myself.MPCC_SetMasterPartyRouting(myself.i_ai1, c0, 0);
gg.SendScriptEvent(c0, 78010088, 0);

}

}

} else {
myself.ShowPage(talker, fnNoTicket);

}

} else if (gg.OwnItemCount(talker, 3865) > 0) {
myself.DeleteItem1(talker, 3865, 1);
i1 = 179700 + gg.Rand(700);
i2 = 113800 + gg.Rand(2100);
myself.InstantTeleport(talker, i1, i2, -7709);
myself.i_ai0 = myself.i_ai0 + 1;
myself.SetDBValue(myself.sm, myself.i_ai0);
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TELEPORT_REQUESTED: entering individual is detected", 1, myself.i_ai0, myself.sm.db_value, 0, 0, 1);
if (c0.db_value == 0) {
myself.MPCC_SetMasterPartyRouting(myself.i_ai1, c0, 0);
gg.SendScriptEvent(c0, 78010088, 0);

}

} else {
myself.ShowPage(talker, fnNoTicket);

}

}

} else {
myself.ShowPage(talker, fnBattle);

}

} else {
myself.ShowPage(talker, fnNotRespawn);

}

} else {
myself.ShowPage(talker, fnNotRespawn);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam c0) {
if (timer_id == 2002) {
i0 = myself.GetGlobalMap(10);
c0 = gg.GetCreatureFromIndex(i0);
if (i0 == -1 || myself.IsNullCreature(c0) == 0 && c0.alive && c0.db_value == 0 && myself.i_ai0 != 0 || myself.sm.db_value != 0) {
myself.SetDBValue(myself.sm, 0);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.AddLogByNpc2(127, myself.sm, "antaras_test", "TIMER_FIRED_EX: member counter initialized", myself.i_ai0, myself.sm.db_value, 0, 0, 0, 1);

}
myself.AddTimerEx(2002, 60 * 1000);

}
	}


}