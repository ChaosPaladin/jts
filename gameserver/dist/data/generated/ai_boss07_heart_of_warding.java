package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss07_heart_of_warding extends default_npc {
	protected int TelPosX = 0;
	protected int TelPosY = 0;
	protected int TelPosZ = 0;
	protected String fnHi = "heart_of_volcano001.htm";
	protected String fnBattle = "heart_of_volcano003.htm";
	protected String fnNotRespawn = "heart_of_volcano002.htm";
	protected String fnNoMoreTicket = "heart_of_volcano004.htm";
	protected String Valakas_f_maker = "godard02_npc2416_65m1";
	protected String Valakas_f_shock_maker = "godard02_npc2416_62m1";
	protected String Valakas_f_shocker_maker = "godard02_npc2416_64m1";
	protected String Valakas_f_breath_maker = "godard02_npc2416_63m1";

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

	protected void MPCC_TELEPORTED(HandlerParam talker, HandlerParam reply, HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam i1) {
i0 = myself.GetGlobalMap(3);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);
i1 = myself.MPCC_GetMPCCId(talker);
if (talker == myself.MPCC_GetMaster(i1) && myself.IsNullCreature(c0) == 0 && c0.alive) {
if (reply >= 99) {
gg.SendScriptEvent(c0, 99999999, i1);
myself.i_ai1 = i1;

}
if (reply > 0) {
myself.i_ai0 = myself.i_ai0 + reply;
myself.SetDBValue(myself.sm, myself.i_ai0);
if (c0.db_value == 0) {
myself.MPCC_SetMasterPartyRouting(myself.i_ai1, c0, 0);
gg.SendScriptEvent(c0, 0, 0);

}

}

}

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c3) {
i0 = myself.GetGlobalMap(3);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0 && c0.alive) {
if (c0.db_value == 0 || c0.db_value == 1) {
if (myself.i_ai0 >= 200) {
myself.ShowPage(talker, fnNoMoreTicket);

} else {
i3 = myself.MPCC_GetMPCCId(talker);
c3 = myself.MPCC_GetMaster(i3);
if (talker != c3) {
myself.InstantTeleport(talker, TelPosX, TelPosY, TelPosZ);
myself.i_ai0 = myself.i_ai0 + 1;
myself.SetDBValue(myself.sm, myself.i_ai0);
if (c0.db_value == 0) {
myself.MPCC_SetMasterPartyRouting(myself.i_ai1, c0, 0);
gg.SendScriptEvent(c0, 0, 0);

}

} else {
i4 = myself.MPCC_GetMemberCount(i3);
if (i4 > 200 - myself.i_ai0) {
myself.ShowPage(talker, fnNoMoreTicket);

} else {
myself.InstantTeleportMPCC(talker, TelPosX, TelPosY, TelPosZ, 1000, 100, 200, 0, 0);

}

}

}

} else if (c0.db_value == 2 || c0.db_value == 3) {
myself.ShowPage(talker, fnBattle);

}

} else {
myself.ShowPage(talker, fnNotRespawn);

}

} else {
myself.ShowPage(talker, fnNotRespawn);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam c0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c3, HandlerParam maker0) {
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam c0) {
if (timer_id == 2002) {
i0 = myself.GetGlobalMap(3);
if (i0 != -1) {
c0 = gg.GetCreatureFromIndex(i0);
if (myself.IsNullCreature(c0) == 0 && c0.alive) {
if (c0.db_value == 0 && myself.sm.db_value != 0) {
myself.SetDBValue(myself.sm, 0);
myself.i_ai0 = 0;

}

} else if (myself.sm.db_value != 0) {
myself.SetDBValue(myself.sm, 0);
myself.i_ai0 = 0;

}

} else if (myself.sm.db_value != 0) {
myself.SetDBValue(myself.sm, 0);
myself.i_ai0 = 0;

}
myself.AddTimerEx(2002, 60 * 1000);

}
	}


}