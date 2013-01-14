package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lotto_manager extends citizen {
	protected void CREATED() {
myself.i_ai0 = -2;
myself.i_ai1 = 0;
myself.AddTimerEx(777, 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 777) {
i0 = 0;
if (myself.i_ai0 != myself.Lotto_GetState()) {
myself.i_ai0 = myself.Lotto_GetState();
i0 = 1;

}
switch (myself.i_ai0) {
case 1: {
if (i0) {
myself.i_ai1 = 10 * 6;

}
if (myself.i_ai1) {
if (myself.i_ai1 % 10 == 0 && myself.GetLifeTime() > 2 * 60) {
myself.Shout(gg.MakeFString(1000282, "", "", "", "", ""));

}
myself.i_ai1 = myself.i_ai1 - 1;

}
break;

}
case 2: {
if (i0 && myself.GetLifeTime() > 2 * 60) {
myself.Shout(gg.MakeFString(1000283, "", "", "", "", ""));

}
break;

}
case 3: {
if (i0) {
myself.i_ai1 = 10 * 6;

}
if (myself.i_ai1) {
if (myself.i_ai1 % 10 == 0 && myself.GetLifeTime() > 2 * 60) {
myself.Shout(gg.MakeFString(1000284, "" + myself.Lotto_GetRoundNumber(), myself.Lotto_GetChosenNumber(), "", "", ""));

}
myself.i_ai1 = myself.i_ai1 - 1;

}
break;

}

}
myself.AddTimerEx(777, 1000);

}
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
i0 = myself.Lotto_GetState();
switch (i0) {
case 0: {
myself.ShowPage(talker, "lotto001.htm");
break;

}
case 1: {
myself.ShowPage(talker, "lotto003.htm");
break;

}
case 2: {
myself.ShowPage(talker, "lotto004.htm");
break;

}
case 3: {
myself.ShowPage(talker, "lotto002.htm");
break;

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam s0) {
if (myself.Lotto_GetState() == 0) {
return;

}
if (ask == -301 && reply == 2) {
switch (myself.Lotto_GetState()) {
case 1: {
myself.FHTML_SetFileName(fhtml0, "lotto009.htm");
myself.FHTML_SetInt(fhtml0, "lotto_round", myself.Lotto_GetRoundNumber());
myself.FHTML_SetInt(fhtml0, "current_reward", myself.Lotto_GetAccumulatedReward());
myself.FHTML_SetStr(fhtml0, "back_html", "lotto003.htm");
myself.ShowFHTML(talker, fhtml0);
break;

}
case 2: {
myself.FHTML_SetFileName(fhtml0, "lotto009.htm");
myself.FHTML_SetInt(fhtml0, "lotto_round", myself.Lotto_GetRoundNumber());
myself.FHTML_SetInt(fhtml0, "current_reward", myself.Lotto_GetAccumulatedReward());
myself.FHTML_SetStr(fhtml0, "back_html", "lotto004.htm");
myself.ShowFHTML(talker, fhtml0);
break;

}
case 3: {
myself.FHTML_SetFileName(fhtml0, "lotto006.htm");
myself.Lotto_MakeFinalRewardFHTML(fhtml0);
myself.ShowFHTML(talker, fhtml0);
break;

}

}

} else if (ask == -301 && reply == 101) {
myself.Lotto_ShowPrevRewardPage(talker, 0);

} else if (ask == -302) {
myself.Lotto_ShowPrevRewardPage(talker, reply);

} else if (ask == -800) {
myself.Lotto_GiveReward(talker, reply);
myself.Lotto_ShowPrevRewardPage(talker, 0);

} else if (ask == -301 && reply == 5) {
if (myself.Lotto_GetState() != 1) {
myself.ShowSystemMessage(talker, 930);
return;

}
if (talker.age > 0 && talker.age < 19) {
s0 = gg.MakeFString(1000285, "", "", "", "", "");
myself.ShowSystemMessageStr(talker, s0);
return;

}
talker.param1 = 0;
myself.FHTML_SetFileName(fhtml0, "lotto012.htm");
myself.Lotto_ShowBuyingPage(talker, 0, fhtml0);

} else if (ask == -777) {
if (myself.Lotto_GetState() != 1) {
myself.ShowSystemMessage(talker, 930);
return;

}
if (talker.age > 0 && talker.age < 19) {
s0 = gg.MakeFString(1000285, "", "", "", "", "");
myself.ShowSystemMessageStr(talker, s0);
return;

}
talker.param1 = reply;
myself.FHTML_SetFileName(fhtml0, "lotto012.htm");
myself.Lotto_ShowBuyingPage(talker, talker.param1, fhtml0);

} else if (ask == -778) {
if (myself.Lotto_GetState() != 1) {
myself.ShowSystemMessage(talker, 930);
return;

}
if (talker.age > 0 && talker.age < 19) {
s0 = gg.MakeFString(1000285, "", "", "", "", "");
myself.ShowSystemMessageStr(talker, s0);
return;

}
if (gg.OwnItemCount(talker, 57) < 2000) {
myself.ShowSystemMessage(talker, 279);
return;

}
myself.Lotto_BuyTicket(talker, reply, 2000);
myself.FHTML_SetFileName(fhtml0, "lotto011.htm");
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -301 && reply == 1) {
if (myself.Lotto_GetState() != 3) {
return;

}
myself.FHTML_SetFileName(fhtml0, "lotto005.htm");
myself.FHTML_SetInt(fhtml0, "lotto_round", myself.Lotto_GetRoundNumber());
myself.FHTML_SetStr(fhtml0, "choosen_number", myself.Lotto_GetChosenNumber());
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -301 && reply == 3) {
if (myself.Lotto_GetState() != 3) {
return;

}
myself.Lotto_ShowCurRewardPage(talker, 0);

} else if (ask == -304) {
if (myself.Lotto_GetState() != 3) {
return;

}
myself.Lotto_ShowCurRewardPage(talker, reply);

} else if (ask == -801) {
myself.Lotto_GiveReward(talker, reply);
myself.Lotto_ShowCurRewardPage(talker, 0);

}
	}


}