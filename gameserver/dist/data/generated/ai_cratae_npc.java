package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cratae_npc extends citizen {
	protected String maker_name_70 = "etc10_1717_026m1";
	protected String maker_name_75 = "etc10_1715_026m1";
	protected String maker_name_80 = "etc10_1815_026m1";
	protected int count_string_5 = 1800203;
	protected int count_string_3 = 1800204;
	protected int count_string_1 = 1800205;

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.AddTimerEx(8101, 3 * 1000);
myself.AddTimerEx(8401, 4 * 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (timer_id == 8101) {
if (myself.IsNullCreature(myself.c_ai1) == 1 || myself.IsNullCreature(myself.c_ai2) == 1 || myself.IsNullCreature(myself.c_ai3) == 1) {
myself.i_ai0 = 1;
gg.SendScriptEvent(myself.sm, 1717001, 0);
myself.AddTimerEx(8101, 3 * 1000);

} else {
myself.i_ai0 = 0;

}

} else if (timer_id == 8102) {
myself.Say(gg.MakeFString(count_string_5, "", "", "", "", ""));
myself.AddTimerEx(8103, 2 * 60 * 1000);

} else if (timer_id == 8103) {
myself.Say(gg.MakeFString(count_string_3, "", "", "", "", ""));
myself.AddTimerEx(8104, 2 * 60 * 1000);

} else if (timer_id == 8104) {
myself.Say(gg.MakeFString(count_string_1, "", "", "", "", ""));

} else if (timer_id == 8201) {
myself.AddTimerEx(8202, 10 * 60 * 1000);

} else if (timer_id == 8202) {
myself.Say(gg.MakeFString(1800206, gg.IntToStr(20), "", "", "", ""));
myself.AddTimerEx(8203, 10 * 60 * 1000);

} else if (timer_id == 8203) {
myself.Say(gg.MakeFString(1800206, gg.IntToStr(10), "", "", "", ""));
myself.AddTimerEx(8204, 5 * 60 * 1000);

} else if (timer_id == 8204) {
myself.Say(gg.MakeFString(1800206, gg.IntToStr(5), "", "", "", ""));
myself.AddTimerEx(8301, 2 * 60 * 1000);

} else if (timer_id == 8301) {
myself.Say(gg.MakeFString(1800207, "", "", "", "", ""));
myself.AddTimerEx(8302, 1 * 60 * 1000);

} else if (timer_id == 8302) {
myself.Say(gg.MakeFString(1800207, "", "", "", "", ""));
myself.AddTimerEx(8303, 1 * 60 * 1000);

} else if (timer_id == 8303) {
myself.Say(gg.MakeFString(1800207, "", "", "", "", ""));

} else if (timer_id == 8401) {
i0 = gg.GetDateTime(0, 4);
if (i0 >= 0 && i0 < 27) {
myself.Say(gg.MakeFString(1800208, gg.IntToStr(27), "", "", "", ""));

} else if (i0 >= 27 && i0 < 30) {

} else if (i0 >= 30 && i0 < 57) {
myself.Say(gg.MakeFString(1800208, gg.IntToStr(57), "", "", "", ""));

} else if (i0 >= 57) {

}
myself.AddTimerEx(8401, 4 * 60 * 1000);

}
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam party0) {
if (myself.i_ai0 == 1) {

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0) {
if (ask == -1300) {
switch (reply) {
case -1001: {
if (myself.i_ai4 == 1) {
myself.ShowPage(talker, "cratae_teleport_npc004.htm");

} else {
myself.CheckRegisterUserPVPMatch(talker);

}
break;

}
case -1002: {
myself.ShowPage(talker, "cratae_teleport_npc002.htm");
break;

}
case -1003: {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.InstantTeleport(talker, -59161, -56954, -2036);

} else if (i0 < 40) {
myself.InstantTeleport(talker, -59155, -56831, -2036);

} else if (i0 < 60) {
myself.InstantTeleport(talker, -59299, -56955, -2036);

} else if (i0 < 80) {
myself.InstantTeleport(talker, -59224, -56837, -2036);

} else {
myself.InstantTeleport(talker, -59134, -56899, -2036);

}
break;

}
case -1004: {
myself.UnregisterUserPVPMatch(talker);
myself.ShowPage(talker, "cratae_teleport_npc012.htm");
break;

}
case -2070: {
if (talker.level >= 70 && talker.level <= 75) {
myself.RegisterUserPVPMatch(talker);

} else {
myself.ShowPage(talker, "cratae_teleport_npc010.htm");

}
break;

}
case -2075: {
if (talker.level >= 76 && talker.level <= 79) {
myself.RegisterUserPVPMatch(talker);

} else {
myself.ShowPage(talker, "cratae_teleport_npc010.htm");

}
break;

}
case -2080: {
if (talker.level >= 80) {
myself.RegisterUserPVPMatch(talker);

} else {
myself.ShowPage(talker, "cratae_teleport_npc010.htm");

}
break;

}
case -2001: {
myself.CheckRegisterUserPVPMatch(talker);
break;

}

}

}
	}

	protected void CHECK_REGISTER_USER_RESULT(HandlerParam reply, HandlerParam i0, HandlerParam c0) {
c0 = gg.GetCreatureFromID(i0);
if (myself.i_ai0 == 1) {

} else if (myself.GetInventoryInfo(c0, 0) >= myself.GetInventoryInfo(c0, 1) * 0.800000 || myself.GetInventoryInfo(c0, 2) >= myself.GetInventoryInfo(c0, 3) * 0.800000) {
myself.ShowPage(c0, "cratae_teleport_npc006.htm");

} else if (reply == 13) {
myself.ShowPage(c0, "cratae_teleport_npc007.htm");

} else if (reply == 1) {

} else if (reply == 3) {
myself.ShowPage(c0, "cratae_teleport_npc008.htm");

} else if (reply == 10) {

} else if (reply == 11) {
myself.ShowPage(c0, "cratae_teleport_npc010.htm");

} else if (reply == 12) {

} else if (reply == 14) {
myself.ShowPage(c0, "cratae_teleport_npc011.htm");

} else if (reply == 15 || reply == 16) {
myself.ShowPage(c0, "cratae_teleport_npc013.htm");

} else if (reply == 0 && myself.i_ai0 == 0) {
myself.ShowPage(c0, "cratae_teleport_npc003.htm");

}
	}

	protected void LET_IN_USER_PVP_MATCH(HandlerParam talker, HandlerParam i0, HandlerParam party0) {
if (talker.transformID == 260 || talker.transformID == 8 || talker.transformID == 9) {
myself.Dispel(talker, myself.Skill_GetAbnormalType(55181313));

}
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
myself.ShowPage(talker, "cratae_teleport_npc007.htm");
myself.UnregisterUserPVPMatch(talker);

} else if (talker.instant_zone_id > 0) {
myself.UnregisterUserPVPMatch(talker);

} else if (talker.level >= 70 && talker.level <= 75) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.InstantTeleport(talker, -87247, -16391, -8320);

} else if (i0 < 40) {
myself.InstantTeleport(talker, -87159, -16594, -8320);

} else if (i0 < 60) {
myself.InstantTeleport(talker, -87203, -16491, -8320);

} else if (i0 < 80) {
myself.InstantTeleport(talker, -87205, -16273, -8320);

} else {
myself.InstantTeleport(talker, -87237, -16159, -8320);

}
gg.SendScriptEvent(myself.c_ai1, 1717002, talker.id);

} else if (talker.level >= 76 && talker.level <= 79) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.InstantTeleport(talker, -87015, -81808, -8352);

} else if (i0 < 40) {
myself.InstantTeleport(talker, -87008, -81971, -8352);

} else if (i0 < 60) {
myself.InstantTeleport(talker, -87006, -81637, -8352);

} else if (i0 < 80) {
myself.InstantTeleport(talker, -87015, -81881, -8352);

} else {
myself.InstantTeleport(talker, -87014, -81725, -8352);

}
gg.SendScriptEvent(myself.c_ai2, 1717002, talker.id);

} else if (talker.level >= 80) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.InstantTeleport(talker, -54000, -83280, -8336);

} else if (i0 < 40) {
myself.InstantTeleport(talker, -53808, -83200, -8336);

} else if (i0 < 60) {
myself.InstantTeleport(talker, -54080, -82800, -8336);

} else if (i0 < 80) {
myself.InstantTeleport(talker, -53824, -82752, -8336);

} else {
myself.InstantTeleport(talker, -53648, -83024, -8336);

}
gg.SendScriptEvent(myself.c_ai3, 1717002, talker.id);

}
	}

	protected void REGISTER_USER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam reply, HandlerParam i0) {
if (reply == 0) {
myself.ShowPage(talker, "cratae_teleport_npc009.htm");

} else if (reply == 1) {

} else if (reply == 8) {
myself.ShowPage(talker, "cratae_teleport_npc005.htm");

} else if (reply == 10) {

} else if (reply == 12) {

} else if (reply == 13) {
myself.ShowPage(talker, "cratae_teleport_npc007.htm");

} else if (reply == 14) {
myself.ShowPage(talker, "cratae_teleport_npc011.htm");

}
	}

	protected void UNREGISTER_USER_PVP_MATCH_RESULT(HandlerParam talker, HandlerParam reply) {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam maker0) {
switch (script_event_arg1) {
case 1717001: {
maker0 = gg.GetNpcMaker(maker_name_70);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717001, myself.sm.id, 0);

}
maker0 = gg.GetNpcMaker(maker_name_75);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717001, myself.sm.id, 0);

}
maker0 = gg.GetNpcMaker(maker_name_80);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717001, myself.sm.id, 0);

}
break;

}
case 1717070: {
myself.c_ai1 = gg.GetCreatureFromID(script_event_arg2);
break;

}
case 1717075: {
myself.c_ai2 = gg.GetCreatureFromID(script_event_arg2);
break;

}
case 1717080: {
myself.c_ai3 = gg.GetCreatureFromID(script_event_arg2);
break;

}
case 1717170: {
myself.i_ai1 = script_event_arg2;
break;

}
case 1717175: {
myself.i_ai2 = script_event_arg2;
break;

}
case 1717180: {
myself.i_ai3 = script_event_arg2;
break;

}
case 2114002: {
myself.i_ai4 = 1;
break;

}
case 1717006: {
if (myself.i_ai4 == 1) {
myself.AddTimerEx(8102, 2 * 60 * 1000);
myself.AddTimerEx(8201, 10 * 60 * 1000);
myself.i_ai4 = 0;

}
break;

}

}
	}


}