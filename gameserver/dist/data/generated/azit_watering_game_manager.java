package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_game_manager extends default_npc {
	protected int ticket = 0;
	protected int PosX = 0;
	protected int PosY = 0;
	protected int PosZ = 0;
	protected int NumberOfCircle = 0;
	protected int GameMaster = 0;
	protected String QuizString1 = "BABYDUCK";
	protected String QuizString2 = "ALBATROS";
	protected String QuizString3 = "PELICAN";
	protected String QuizString4 = "KINGFISHER";
	protected String QuizString5 = "CYGNUS";
	protected String QuizString6 = "TRITON";
	protected String QuizString7 = "RAINBOW";
	protected String QuizString8 = "SPRING";
	protected int ItemA = 8035;
	protected int ItemB = 8036;
	protected int ItemC = 8037;
	protected int ItemD = 8038;
	protected int ItemE = 8039;
	protected int ItemF = 8040;
	protected int ItemG = 8041;
	protected int ItemH = 8042;
	protected int ItemI = 8043;
	protected int ItemK = 8045;
	protected int ItemL = 8046;
	protected int ItemN = 8047;
	protected int ItemO = 8048;
	protected int ItemP = 8049;
	protected int ItemR = 8050;
	protected int ItemS = 8051;
	protected int ItemT = 8052;
	protected int ItemU = 8053;
	protected int ItemW = 8054;
	protected int ItemY = 8055;
	protected String AreaData_DeBuff = "azit_watering_game_manager_default";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.i_quest0 = -1;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.c_quest0 = gg.GetNullCreature();
myself.c_quest4 = gg.GetNullCreature();
myself.sm.residence_id = 62;
myself.AddTimerEx(1004, 6 * 10000);
myself.AddTimerEx(1005, 45000);
myself.AddTimerEx(1001, 10000);
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
myself.ShowPage(talker, "watering_manager001.htm");
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0 && myself.i_ai2 == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.int_list.Add(c0.id);

}

}
myself.i_ai2 = 1;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam fhtml0) {
if (ask == -100) {
if (myself.i_quest0 == -1) {
myself.Say(gg.MakeFString(1010628, "", "", "", "", ""));

} else if (myself.i_quest0 == 0) {
if (gg.OwnItemCount(talker, ItemA) >= 1 && gg.OwnItemCount(talker, ItemB) >= 2 && gg.OwnItemCount(talker, ItemC) >= 1 && gg.OwnItemCount(talker, ItemD) >= 1 && gg.OwnItemCount(talker, ItemK) >= 1 && gg.OwnItemCount(talker, ItemU) >= 1 && gg.OwnItemCount(talker, ItemY) >= 1) {
myself.DeleteItem1(talker, ItemA, 1);
myself.DeleteItem1(talker, ItemB, 2);
myself.DeleteItem1(talker, ItemC, 1);
myself.DeleteItem1(talker, ItemD, 1);
myself.DeleteItem1(talker, ItemK, 1);
myself.DeleteItem1(talker, ItemU, 1);
myself.DeleteItem1(talker, ItemY, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 1) {
if (gg.OwnItemCount(talker, ItemA) >= 2 && gg.OwnItemCount(talker, ItemB) >= 1 && gg.OwnItemCount(talker, ItemL) >= 1 && gg.OwnItemCount(talker, ItemO) >= 1 && gg.OwnItemCount(talker, ItemR) >= 1 && gg.OwnItemCount(talker, ItemS) >= 1 && gg.OwnItemCount(talker, ItemT) >= 1) {
myself.DeleteItem1(talker, ItemA, 2);
myself.DeleteItem1(talker, ItemB, 1);
myself.DeleteItem1(talker, ItemL, 1);
myself.DeleteItem1(talker, ItemO, 1);
myself.DeleteItem1(talker, ItemR, 1);
myself.DeleteItem1(talker, ItemS, 1);
myself.DeleteItem1(talker, ItemT, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 2) {
if (gg.OwnItemCount(talker, ItemA) >= 1 && gg.OwnItemCount(talker, ItemC) >= 1 && gg.OwnItemCount(talker, ItemE) >= 1 && gg.OwnItemCount(talker, ItemI) >= 1 && gg.OwnItemCount(talker, ItemL) >= 1 && gg.OwnItemCount(talker, ItemN) >= 1 && gg.OwnItemCount(talker, ItemP) >= 1) {
myself.DeleteItem1(talker, ItemA, 1);
myself.DeleteItem1(talker, ItemC, 1);
myself.DeleteItem1(talker, ItemE, 1);
myself.DeleteItem1(talker, ItemI, 1);
myself.DeleteItem1(talker, ItemL, 1);
myself.DeleteItem1(talker, ItemN, 1);
myself.DeleteItem1(talker, ItemP, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 3) {
if (gg.OwnItemCount(talker, ItemE) >= 1 && gg.OwnItemCount(talker, ItemF) >= 1 && gg.OwnItemCount(talker, ItemG) >= 1 && gg.OwnItemCount(talker, ItemH) >= 1 && gg.OwnItemCount(talker, ItemI) >= 2 && gg.OwnItemCount(talker, ItemK) >= 1 && gg.OwnItemCount(talker, ItemN) >= 1 && gg.OwnItemCount(talker, ItemR) >= 1 && gg.OwnItemCount(talker, ItemS) >= 1) {
myself.DeleteItem1(talker, ItemE, 1);
myself.DeleteItem1(talker, ItemF, 1);
myself.DeleteItem1(talker, ItemG, 1);
myself.DeleteItem1(talker, ItemH, 1);
myself.DeleteItem1(talker, ItemI, 2);
myself.DeleteItem1(talker, ItemK, 1);
myself.DeleteItem1(talker, ItemN, 1);
myself.DeleteItem1(talker, ItemR, 1);
myself.DeleteItem1(talker, ItemS, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 4) {
if (gg.OwnItemCount(talker, ItemC) >= 1 && gg.OwnItemCount(talker, ItemG) >= 1 && gg.OwnItemCount(talker, ItemN) >= 1 && gg.OwnItemCount(talker, ItemS) >= 1 && gg.OwnItemCount(talker, ItemU) >= 1 && gg.OwnItemCount(talker, ItemY) >= 1) {
myself.DeleteItem1(talker, ItemC, 1);
myself.DeleteItem1(talker, ItemG, 1);
myself.DeleteItem1(talker, ItemN, 1);
myself.DeleteItem1(talker, ItemS, 1);
myself.DeleteItem1(talker, ItemU, 1);
myself.DeleteItem1(talker, ItemY, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 5) {
if (gg.OwnItemCount(talker, ItemI) >= 1 && gg.OwnItemCount(talker, ItemN) >= 1 && gg.OwnItemCount(talker, ItemO) >= 1 && gg.OwnItemCount(talker, ItemR) >= 1 && gg.OwnItemCount(talker, ItemT) >= 2) {
myself.DeleteItem1(talker, ItemI, 1);
myself.DeleteItem1(talker, ItemN, 1);
myself.DeleteItem1(talker, ItemO, 1);
myself.DeleteItem1(talker, ItemR, 1);
myself.DeleteItem1(talker, ItemT, 2);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 6) {
if (gg.OwnItemCount(talker, ItemA) >= 1 && gg.OwnItemCount(talker, ItemB) >= 1 && gg.OwnItemCount(talker, ItemI) >= 1 && gg.OwnItemCount(talker, ItemN) >= 1 && gg.OwnItemCount(talker, ItemO) >= 1 && gg.OwnItemCount(talker, ItemR) >= 1 && gg.OwnItemCount(talker, ItemW) >= 1) {
myself.DeleteItem1(talker, ItemA, 1);
myself.DeleteItem1(talker, ItemB, 1);
myself.DeleteItem1(talker, ItemI, 1);
myself.DeleteItem1(talker, ItemN, 1);
myself.DeleteItem1(talker, ItemO, 1);
myself.DeleteItem1(talker, ItemR, 1);
myself.DeleteItem1(talker, ItemW, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

} else if (myself.i_quest0 == 7) {
if (gg.OwnItemCount(talker, ItemG) >= 1 && gg.OwnItemCount(talker, ItemI) >= 1 && gg.OwnItemCount(talker, ItemN) >= 1 && gg.OwnItemCount(talker, ItemP) >= 1 && gg.OwnItemCount(talker, ItemR) >= 1 && gg.OwnItemCount(talker, ItemS) >= 1) {
myself.DeleteItem1(talker, ItemG, 1);
myself.DeleteItem1(talker, ItemI, 1);
myself.DeleteItem1(talker, ItemN, 1);
myself.DeleteItem1(talker, ItemP, 1);
myself.DeleteItem1(talker, ItemR, 1);
myself.DeleteItem1(talker, ItemS, 1);
if (myself.i_quest0 >= 1 && myself.i_quest0 <= 6) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 90) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

} else {
i0 = gg.Rand(100);
if (i0 < 10) {
myself.GiveItem1(talker, 8030, 1);

} else if (i0 < 40) {
myself.GiveItem1(talker, 8031, 1);

} else if (i0 < 70) {
myself.GiveItem1(talker, 8032, 1);

} else {
myself.GiveItem1(talker, 8033, 1);

}

}
myself.ShowPage(talker, "watering_manager004.htm");

} else {
myself.ShowPage(talker, "watering_manager002.htm");

}

}

} else if (ask == -500) {
if (myself.i_quest0 == -1) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", gg.MakeFString(1010635, "", "", "", "", ""));

} else if (myself.i_quest0 == 0) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString1);

} else if (myself.i_quest0 == 1) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString2);

} else if (myself.i_quest0 == 2) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString3);

} else if (myself.i_quest0 == 3) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString4);

} else if (myself.i_quest0 == 4) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString5);

} else if (myself.i_quest0 == 5) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString6);

} else if (myself.i_quest0 == 6) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString7);

} else if (myself.i_quest0 == 7) {
myself.FHTML_SetFileName(fhtml0, "watering_manager005.htm");
myself.FHTML_SetStr(fhtml0, "QuizString", QuizString8);

}
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -600) {

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam c1, HandlerParam i1, HandlerParam i5, HandlerParam maker0) {
if (script_event_arg1 == 10002) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);

} else if (script_event_arg1 == 10003) {
myself.c_ai1 = gg.GetCreatureFromIndex(script_event_arg2);

} else if (script_event_arg1 == 10004) {
myself.c_ai2 = gg.GetCreatureFromIndex(script_event_arg2);

} else if (script_event_arg1 == 10005) {
myself.c_ai3 = gg.GetCreatureFromIndex(script_event_arg2);

} else if (script_event_arg1 == NumberOfCircle && script_event_arg2 == 30000) {
myself.i_quest1 = 1;
myself.i_quest2 = script_event_arg3;

} else if (script_event_arg1 == NumberOfCircle && myself.i_quest1 == 1 && myself.i_quest2 == script_event_arg3) {
myself.i_quest1 = 2;
myself.i_quest3 = script_event_arg3;
if (myself.i_ai0 == 1) {
myself.AddUseSkillDesire(myself.c_quest4, 326959105, 0, 0, 10000000);
myself.i_ai0 = 0;

} else if (myself.i_ai1 == 1) {
myself.AddUseSkillDesire(myself.c_quest4, 327024641, 1, 0, 10000000);
myself.i_ai1 = 0;

} else if (myself.i_quest0 == 1 && myself.i_quest3 == 0) {
myself.BroadcastScriptEventEx(myself.i_quest2, gg.FloatToInt(myself.c_quest4.hp), i1, 10000);

} else if (myself.i_quest1 == 2) {
i1 = gg.FloatToInt(myself.c_quest4.hp);
gg.SetNpcParam(myself.c_quest4, 9, myself.i_quest3);
myself.BroadcastScriptEventEx(myself.i_quest2, 30000, i1, 10000);
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;

}

} else if (script_event_arg1 == NumberOfCircle && script_event_arg2 == 20001) {
gg.Area_SetOnOff(AreaData_DeBuff, 1);
myself.AddTimerEx(5001, 60 * 1000);

} else if (script_event_arg1 == 1 && script_event_arg2 == 10000) {
myself.i_quest0 = script_event_arg3;

} else if (script_event_arg1 != 5 && script_event_arg2 == 40000) {
myself.sm.residence_id = 62;
if (myself.i_quest4 != 0) {
c0 = gg.GetCreatureFromIndex(myself.i_quest4);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 1000) {
myself.MG_SetWinner(c0);
myself.BroadcastScriptEvent(0, 20002, 8000);

} else {
for (i5 = 0; i5 < myself.int_list.GetSize(); i5 = i5 + 1) {
c1 = gg.GetCreatureFromID(myself.int_list.Get(i5));
if (myself.IsNullCreature(c1) == 0 && myself.DistFromMe(c1) < 1000) {
myself.MG_SetWinner(c1);
myself.BroadcastScriptEvent(0, 20002, 8000);
return;

}

}

}

} else {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) < 1000) {
myself.MG_SetWinner(c0);
myself.BroadcastScriptEvent(0, 20002, 8000);

} else {
for (i5 = 0; i5 < myself.int_list.GetSize(); i5 = i5 + 1) {
c1 = gg.GetCreatureFromID(myself.int_list.Get(i5));
if (myself.IsNullCreature(c1) == 0 && myself.DistFromMe(c1) < 1000) {
myself.MG_SetWinner(c1);
myself.BroadcastScriptEvent(0, 20002, 8000);
return;

}

}

}

}

} else if (script_event_arg2 == 20002) {
gg.Area_SetOnOff(AreaData_DeBuff, 0);

} else if (script_event_arg1 == 5 && script_event_arg2 == 40000) {
myself.BroadcastScriptEvent(NumberOfCircle, 50000, 1000);
myself.i_quest4 = script_event_arg3;
myself.AddTimerEx(5005, 1000);

} else if (script_event_arg1 == NumberOfCircle && script_event_arg2 == 50000) {
if (myself.Skill_GetConsumeMP(330235905) < myself.sm.mp && myself.Skill_GetConsumeHP(330235905) < myself.sm.hp && myself.Skill_InReuseDelay(330235905) == 0) {
myself.AddUseSkillDesire(myself.sm, 330235905, 1, 1, 1000000);

}

} else if (script_event_arg1 == NumberOfCircle && script_event_arg2 == 30003) {
if (myself.IsNullCreature(myself.c_quest4) == 0) {
myself.AddUseSkillDesire(myself.c_quest4, 327024641, 1, 0, 1000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam party0) {
if (timer_id == 5001) {
gg.Area_SetOnOff(AreaData_DeBuff, 0);

} else if (timer_id == 5002) {
if (myself.i_ai0 == 1) {
myself.AddUseSkillDesire(myself.c_quest4, 326959105, 0, 0, 10000000);
myself.i_ai0 = 0;

} else if (myself.i_ai1 == 1) {
myself.AddUseSkillDesire(myself.c_quest4, 327024641, 1, 0, 10000000);
myself.i_ai1 = 0;

} else if (myself.i_quest0 == 1 && myself.i_quest3 == 0) {
myself.BroadcastScriptEventEx(myself.i_quest2, gg.FloatToInt(myself.c_quest4.hp), i1, 10000);

} else if (myself.i_quest1 == 2) {
i1 = gg.FloatToInt(myself.c_quest4.hp);
gg.SetNpcParam(myself.c_quest4, 9, myself.i_quest3);
myself.BroadcastScriptEventEx(myself.i_quest2, 30000, i1, 10000);
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;

}

} else if (timer_id == 5005) {
myself.BroadcastScriptEventEx(NumberOfCircle, 40000, 0, 1000);

} else if (timer_id == 1001) {
myself.LookNeighbor(200);
if (GameMaster == 1) {
myself.Shout(gg.MakeFString(1010633, "", "", "", "", ""));
myself.AddTimerEx(2001, 1000);

}

} else if (timer_id == 9999) {
myself.LookNeighbor(200);
myself.AddTimerEx(9999, 1000);

} else if (timer_id == 2001) {
i0 = gg.Rand(8);
if (i0 == 0) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString1);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 1) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString2);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 2) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString3);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 3) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString4);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 4) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString5);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 5) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString6);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 6) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString7);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

} else if (i0 == 7) {
gg.BroadcastOnScreenMsgStr(myself.sm, 5000, 2, 0, 0, 0, 1, 0, 10000, 0, QuizString8);
myself.i_quest0 = i0;
myself.BroadcastScriptEventEx(1, 10000, i0, 10000);

}
myself.AddTimerEx(2001, 3 * 60 * 1000);

}
if (timer_id == 1004) {
myself.LookNeighbor(800);
if (myself.IsNullCreature(myself.c_quest4) == 0) {
i2 = gg.FloatToInt(myself.c_quest4.hp / myself.c_quest4.max_hp * 100);
if (myself.IsNullCreature(myself.c_ai4) == 0) {
party0 = gg.GetParty(myself.c_ai4);
if (myself.IsNullParty(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
myself.Shout(gg.MakeFString(1010634, c1.name, gg.IntToStr(i2), "", "", ""));

}

}

}

}
myself.AddTimerEx(1004, 3 * 60 * 1000);

}
if (timer_id == 1005) {
myself.LookNeighbor(1000);

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
party0 = gg.GetParty(speller);
if (myself.IsNullParty(party0) == 0 && myself.i_ai2 == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.int_list.Add(c0.id);

}

}
myself.i_ai2 = 1;

}
if (skill_name_id == 146800641) {
i0 = gg.Rand(100);
if (i0 < 90) {
myself.i_ai0 = 1;
if (myself.i_ai0 == 1) {
myself.AddUseSkillDesire(myself.c_quest4, 326959105, 0, 0, 10000000);
myself.i_ai0 = 0;

} else if (myself.i_ai1 == 1) {
myself.AddUseSkillDesire(myself.c_quest4, 327024641, 1, 0, 10000000);
myself.i_ai1 = 0;

} else if (myself.i_quest0 == 1 && myself.i_quest3 == 0) {
myself.BroadcastScriptEventEx(myself.i_quest2, gg.FloatToInt(myself.c_quest4.hp), i1, 10000);

} else if (myself.i_quest1 == 2) {
i1 = gg.FloatToInt(myself.c_quest4.hp);
gg.SetNpcParam(myself.c_quest4, 9, myself.i_quest3);
myself.BroadcastScriptEventEx(myself.i_quest2, 30000, i1, 10000);
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;

}
myself.i_ai1 = gg.GetIndexFromCreature(speller);

} else {
myself.CreateOnePrivateEx(1035592, "azit_watering_crazy_yeti", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (skill_name_id == 146866177) {
i0 = gg.Rand(4) + 1;
if (i0 == NumberOfCircle) {
i0 = i0 - 1;
if (i0 < 1) {
i0 = 4;

}

}
for (i2 = 1; i2 < 5; i2 = i2 + 1) {
if (i2 != NumberOfCircle) {
myself.BroadcastScriptEventEx(i2, 30003, 0, 10000);

}

}

} else if (skill_name_id == 146931713) {
myself.LookNeighbor(800);
if (myself.IsNullCreature(myself.c_ai4) == 0) {
party0 = gg.GetParty(myself.c_ai4);
if (myself.IsNullParty(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
myself.Shout(gg.MakeFString(1010641, c1.name, "", "", "", ""));

}

}

}
i0 = gg.Rand(4) + 1;
i4 = 0;
i5 = 0;
i6 = 0;
for (i2 = 1; i2 < 5; i2 = i2 + 1) {
if (i2 != NumberOfCircle) {
if (i4 == 0) {
i4 = i2;

} else if (i5 == 0) {
i5 = i2;

} else if (i6 == 0) {
i6 = i2;

}

}
i7 = gg.Rand(100);
if (i7 < 33) {
i0 = i4;

} else if (i7 < 66) {
i0 = i5;

} else {
i0 = i6;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
c0 = myself.c_ai0;

}

} else if (i0 == 2) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
c0 = myself.c_ai1;

}

} else if (i0 == 3) {
if (myself.IsNullCreature(myself.c_ai2) == 0) {
c0 = myself.c_ai2;

}

} else if (i0 == 4) {
if (myself.IsNullCreature(myself.c_ai3) == 0) {
c0 = myself.c_ai3;

}

}
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(myself.c_quest4) == 0) {
i2 = gg.FloatToInt(myself.c_quest4.hp);
i3 = gg.FloatToInt(c0.hp);
gg.SetNpcParam(myself.c_quest4, 9, i3);
gg.SetNpcParam(c0, 9, i2);

}

} else if (skill_name_id == 146997249) {
myself.LookNeighbor(800);
if (myself.IsNullCreature(myself.c_ai4) == 0) {
party0 = gg.GetParty(myself.c_ai4);
if (myself.IsNullParty(party0) == 0) {
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c1) == 0) {
myself.Shout(gg.MakeFString(1010640, c1.name, "", "", "", ""));

}

}

}
i0 = gg.Rand(4) + 1;
if (i0 == NumberOfCircle) {
i0 = i0 - 1;
if (i0 < 1) {
i0 = 4;

}

}
for (i2 = 1; i2 < 5; i2 = i2 + 1) {
if (i2 != NumberOfCircle) {
myself.BroadcastScriptEventEx(i2, 20001, 0, 10000);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
if (creature.is_pc == 0 && myself.IsNullCreature(myself.c_quest4) == 1) {
myself.c_quest4 = creature;

}
if (creature.is_pc == 1) {
myself.c_ai4 = creature;

}
	}


}