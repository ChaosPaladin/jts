package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class olympiad_operator_basic extends citizen {
	protected int fstr_prepared_team = 1300132;
	protected int fstr_prepared_classless = 1300166;
	protected int fstr_prepared_class = 1300167;
	protected int is_shout = 1;
	protected String fnFlagMan = "flagman.htm";

	protected void CREATED() {
myself.RegisterAsOlympiadOperator();
super;
	}

	protected void TALKED(HandlerParam talker) {
if (gg.OwnItemCount(talker, 13560) > 0 || gg.OwnItemCount(talker, 13561) > 0 || gg.OwnItemCount(talker, 13562) > 0 || gg.OwnItemCount(talker, 13563) > 0 || gg.OwnItemCount(talker, 13564) > 0 || gg.OwnItemCount(talker, 13565) > 0 || gg.OwnItemCount(talker, 13566) > 0 || gg.OwnItemCount(talker, 13567) > 0 || gg.OwnItemCount(talker, 13568) > 0) {
myself.ShowPage(talker, fnFlagMan);

} else {
myself.CheckCursedUser(talker);

}
	}

	protected void CHECK_CURSED_USER_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply == 0) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else {
myself.ShowPage(talker, "olympiad_operator002.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator003.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam s0, HandlerParam s1) {
if (ask == -50) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else {
myself.ShowPage(talker, "olympiad_operator002.htm");

}

} else if (ask == -51) {
myself.ShowPage(talker, "olympiad_operator010.htm");

} else if (ask == -52) {
switch (reply) {
case 0: {
myself.ShowPage(talker, "olympiad_operator001.htm");
break;

}
case 1: {
myself.ShowPage(talker, "olympiad_operator010a.htm");
break;

}
case 2: {
myself.ShowPage(talker, "olympiad_operator010b.htm");
break;

}
case 3: {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator010f.htm");
i0 = myself.GetOlympiadWaitingCount();
if (i0 < 100) {
myself.FHTML_SetStr(fhtml0, "WaitingCount", gg.MakeFString(1000504, "100", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "WaitingCount", gg.MakeFString(1000505, "100", "", "", "", ""));

}
i0 = myself.GetTeamOlympiadWaitingCount();
if (i0 < 100) {
myself.FHTML_SetStr(fhtml0, "TeamWaitingCount", gg.MakeFString(1000504, "100", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "WaitingCount", gg.MakeFString(1000505, "100", "", "", "", ""));

}
i0 = myself.GetClassFreeOlympiadWaitingCount();
if (i0 < 100) {
myself.FHTML_SetStr(fhtml0, "ClassFreeWaitingCount", gg.MakeFString(1000504, "100", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "ClassFreeWaitingCount", gg.MakeFString(1000505, "100", "", "", "", ""));

}
myself.ShowFHTML(talker, fhtml0);
break;

}
case 4: {
myself.ShowPage(talker, "olympiad_operator010g.htm");
break;

}
case 5: {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator010h.htm");
myself.FHTML_SetInt(fhtml0, "WaitingCount", myself.GetOlympiadPoint(talker));
myself.ShowFHTML(talker, fhtml0);
break;

}
case 6: {

}
case 7: {
myself.ShowPage(talker, "olympiad_operator010m.htm");
break;

}

}

} else if (ask == -53) {
if (reply == 0) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else if (reply == 1) {
if (myself.IsMainClass(talker) == 1) {
if (myself.IsInCategory(9, talker.occupation)) {
if (myself.GetOlympiadPoint(talker) > 0) {
myself.AddClassFreeOlympiad(talker);

} else {
myself.ShowPage(talker, "olympiad_operator010i.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator010j.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator010c.htm");

}

}

} else if (ask == -90) {
if (reply == 0) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else if (reply == 1) {
if (myself.IsMainClass(talker) == 1) {
if (myself.IsInCategory(9, talker.occupation)) {
if (myself.GetOlympiadPoint(talker) > 0) {
myself.AddTeamOlympiad(talker);

} else {
myself.ShowPage(talker, "olympiad_operator010i.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator010j.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator010c.htm");

}

}

} else if (ask == -54) {
if (reply == 0) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else if (reply == 1) {
if (myself.IsMainClass(talker) == 1) {
if (myself.IsInCategory(9, talker.occupation)) {
if (myself.GetOlympiadPoint(talker) > 0) {
myself.AddOlympiad(talker);

} else {
myself.ShowPage(talker, "olympiad_operator010i.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator010j.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator010c.htm");

}

}

} else if (ask == -55) {
myself.ShowPage(talker, "olympiad_operator030.htm");

} else if (ask == -56) {

} else if (ask == -57) {

} else if (ask == -58) {
myself.RemoveOlympiad(talker);

} else if (ask == -59) {
if (reply == 0) {
myself.ShowPage(talker, "olympiad_field_list_npc.htm");

} else if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator020.htm");
for (i0 = 1; i0 <= 22; i0 = i0 + 1) {
s0 = "";
s1 = "";
myself.FHTML_SetInt(fhtml0, "FI" + i0, i0);
if (myself.GetStatusForOlympiadField(i0) == 0) {
myself.FHTML_SetStr(fhtml0, "Status" + i0, "&$906;");

} else if (myself.GetStatusForOlympiadField(i0) == 1) {
s0 = "&$1718;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

} else {
s0 = "&$1719;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

}

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator021.htm");
for (i0 = 23; i0 <= 44; i0 = i0 + 1) {
s0 = "";
s1 = "";
myself.FHTML_SetInt(fhtml0, "FI" + i0, i0);
if (myself.GetStatusForOlympiadField(i0) == 0) {
myself.FHTML_SetStr(fhtml0, "Status" + i0, "&$906;");

} else if (myself.GetStatusForOlympiadField(i0) == 1) {
s0 = "&$1718;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

} else {
s0 = "&$1719;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

}

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 3) {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator022.htm");
for (i0 = 45; i0 <= 66; i0 = i0 + 1) {
s0 = "";
s1 = "";
myself.FHTML_SetInt(fhtml0, "FI" + i0, i0);
if (myself.GetStatusForOlympiadField(i0) == 0) {
myself.FHTML_SetStr(fhtml0, "Status" + i0, "&$906;");

} else if (myself.GetStatusForOlympiadField(i0) == 1) {
s0 = "&$1718;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

} else {
s0 = "&$1719;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

}

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 4) {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator023.htm");
for (i0 = 67; i0 <= 88; i0 = i0 + 1) {
s0 = "";
s1 = "";
myself.FHTML_SetInt(fhtml0, "FI" + i0, i0);
if (myself.GetStatusForOlympiadField(i0) == 0) {
myself.FHTML_SetStr(fhtml0, "Status" + i0, "&$906;");

} else if (myself.GetStatusForOlympiadField(i0) == 1) {
s0 = "&$1718;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

} else {
s0 = "&$1719;" + "&nbsp;&nbsp;&nbsp;" + myself.GetPlayer1ForOlympiadField(i0) + "&nbsp; : &nbsp;" + myself.GetPlayer2ForOlympiadField(i0);
myself.FHTML_SetStr(fhtml0, "Status" + i0, s0);

}

}
myself.ShowFHTML(talker, fhtml0);

}

} else if (ask == -60) {
if (reply == 0) {
if (talker.nobless_type == 1) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else {
myself.ShowPage(talker, "olympiad_operator002.htm");

}

}

} else if (ask == -61) {
myself.ShowPage(talker, "olympiad_operator020.htm");

} else if (ask == -70) {
if (reply == 0) {
myself.ShowPage(talker, "olympiad_operator001.htm");

} else if (reply == 1) {
if (myself.GetOlympiadTradePoint(talker) == 0) {
myself.ShowPage(talker, "olympiad_operator031a.htm");

} else if (myself.GetOlympiadTradePoint(talker) < 20) {
if (talker.hero_type == 1 || talker.hero_type == 2) {
myself.ShowPage(talker, "olympiad_operator031.htm");

} else {
myself.ShowPage(talker, "olympiad_operator031a.htm");

}

} else {
myself.ShowPage(talker, "olympiad_operator031.htm");

}

} else if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator010l.htm");
myself.FHTML_SetInt(fhtml0, "WaitingCount", myself.GetPreviousOlympiadPoint(talker));
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 513) {
myself.ShowMultisell(reply, talker);

} else if (reply == 699) {
myself.ShowMultisell(reply, talker);

}

} else if (ask == -71) {
if (reply == 0) {
myself.ShowPage(talker, "olympiad_operator030.htm");

} else if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteOlympiadTradePoint(talker, myself.GetOlympiadTradePoint(talker));

}

} else if (ask == -80) {

} else if (ask == -110) {
myself.FHTML_SetFileName(fhtml0, "olympiad_operator_rank_class.htm");
for (i0 = 1; i0 <= 15; i0 = i0 + 1) {
if (myself.GetRankByOlympiadRankOrder(reply, i0) == 0) {
break;

}
myself.FHTML_SetInt(fhtml0, "Rank" + i0, myself.GetRankByOlympiadRankOrder(reply, i0));
myself.FHTML_SetStr(fhtml0, "Name" + i0, myself.GetNameByOlympiadRankOrder(reply, i0));

}
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -130) {
myself.ObserveOlympiad(talker, reply);

}
	}

	protected void DELETE_OLYMPIAD_TRADE_POINT_RETURNED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
i1 = 0;
if (reply != 0) {
if (talker.hero_type == 1 || talker.hero_type == 2) {
i1 = 180;

}
i0 = ask + i1 * 1000;
gg.AddLogEx(1, talker, ask, i0);
myself.GiveItem1(talker, 13722, i0);

}
	}

	protected void ON_OLYMPIAD_GAME_PREPARED(HandlerParam event_id, HandlerParam i0) {
if (is_shout == 1) {
if (i0 == 0) {
myself.Shout(gg.MakeFString(fstr_prepared_team, gg.IntToStr(event_id), "", "", "", ""));

} else if (i0 == 1) {
myself.Shout(gg.MakeFString(fstr_prepared_classless, gg.IntToStr(event_id), "", "", "", ""));

} else if (i0 == 2) {
myself.Shout(gg.MakeFString(fstr_prepared_class, gg.IntToStr(event_id), "", "", "", ""));

}

} else {
myself.Say(gg.MakeFString(fstr_prepared_class, gg.IntToStr(event_id), "", "", "", ""));

}
	}


}