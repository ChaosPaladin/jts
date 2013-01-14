package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class witch_athrea extends citizen {
	protected void TALK_SELECTED(HandlerParam c2, HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 3 && gg.OwnItemCount(myself.Pledge_GetLeader(talker), 3872) && gg.OwnItemCount(myself.Pledge_GetLeader(talker), 3835) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 4) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Proof of Clan Alliance (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 3 && gg.OwnItemCount(myself.Pledge_GetLeader(talker), 3872) && gg.OwnItemCount(myself.Pledge_GetLeader(talker), 3835) == 0) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c2 = myself.Pledge_GetLeader(talker);
c2.flag = 0;
myself.ShowPage(talker, "witch_athrea_q0501_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 5) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_athrea_q0501_09.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 501) && gg.GetMemoState(myself.Pledge_GetLeader(talker), 501) == 4) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
c2 = myself.Pledge_GetLeader(talker);
if (c2.flag < 4) {
myself.ShowPage(talker, "witch_athrea_q0501_05.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "witch_athrea_q0501_08.htm");
myself.GiveItem1(talker, 3835, 1);
myself.SetMemoState(myself.Pledge_GetLeader(talker), 501, 5);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_athrea_q0503_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(503);
if (timer_id == 250302) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(503);
if (myself.sm.param2 == 50301) {
myself.Say(gg.MakeFString(50340, "", "", "", "", ""));
myself.AddTimerEx(250302, 1000 * 5);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam c1, HandlerParam c2, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam reply, HandlerParam talker) {
if (ask == 501) {
myself.SetCurrentQuestID(501);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 501) {
c2 = myself.Pledge_GetLeader(talker);
if (reply == 1) {
myself.ShowPage(talker, "witch_athrea_q0501_02.htm");

} else if (reply == 2) {
if (myself.Maker_GetNpcCount() < 4) {
myself.ShowPage(talker, "witch_athrea_q0501_03.htm");
myself.SetMemoState(c2, 501, 4);
c2.flag = 0;
myself.sm.flag = 0;
i1 = 0;
while (i1 < 16) {
if (i1 == 0) {
i2 = 102273;
i3 = 103433;
i4 = -3512;

} else if (i1 == 1) {
i2 = 102190;
i3 = 103379;
i4 = -3524;

} else if (i1 == 2) {
i2 = 102107;
i3 = 103325;
i4 = -3533;

} else if (i1 == 3) {
i2 = 102024;
i3 = 103271;
i4 = -3500;

} else if (i1 == 4) {
i2 = 102327;
i3 = 103350;
i4 = -3511;

} else if (i1 == 5) {
i2 = 102244;
i3 = 103296;
i4 = -3518;

} else if (i1 == 6) {
i2 = 102161;
i3 = 103242;
i4 = -3529;

} else if (i1 == 7) {
i2 = 102078;
i3 = 103188;
i4 = -3500;

} else if (i1 == 8) {
i2 = 102381;
i3 = 103267;
i4 = -3538;

} else if (i1 == 9) {
i2 = 102298;
i3 = 103213;
i4 = -3532;

} else if (i1 == 10) {
i2 = 102215;
i3 = 103159;
i4 = -3520;

} else if (i1 == 11) {
i2 = 102132;
i3 = 103105;
i4 = -3513;

} else if (i1 == 12) {
i2 = 102435;
i3 = 103184;
i4 = -3515;

} else if (i1 == 13) {
i2 = 102352;
i3 = 103130;
i4 = -3522;

} else if (i1 == 14) {
i2 = 102269;
i3 = 103076;
i4 = -3533;

} else if (i1 == 15) {
i2 = 102186;
i3 = 103022;
i4 = -3541;

}
i0 = gg.Rand(5);
switch (i0) {
case 0: {
myself.CreateOnePrivateEx(1027173, "box_of_athrea1", 0, 0, gg.FloatToInt(i2), gg.FloatToInt(i3), gg.FloatToInt(i4), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1027174, "box_of_athrea2", 0, 0, gg.FloatToInt(i2), gg.FloatToInt(i3), gg.FloatToInt(i4), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1027175, "box_of_athrea3", 0, 0, gg.FloatToInt(i2), gg.FloatToInt(i3), gg.FloatToInt(i4), 0, 0, 0, 0);
break;

}
case 3: {
myself.CreateOnePrivateEx(1027176, "box_of_athrea4", 0, 0, gg.FloatToInt(i2), gg.FloatToInt(i3), gg.FloatToInt(i4), 0, 0, 0, 0);
break;

}
case 4: {
myself.CreateOnePrivateEx(1027177, "box_of_athrea5", 0, 0, gg.FloatToInt(i2), gg.FloatToInt(i3), gg.FloatToInt(i4), 0, 0, 0, 0);
break;

}

}
i1 = i1 + 1;

}

} else {
myself.ShowPage(talker, "witch_athrea_q0501_03a.htm");

}

} else if (reply == 3) {
myself.ShowPage(talker, "witch_athrea_q0501_04.htm");

} else if (reply == 4) {
if (gg.OwnItemCount(talker, 57) >= 10000) {
myself.ShowPage(talker, "witch_athrea_q0501_07.htm");
if (myself.Maker_GetNpcCount() < 4) {
myself.DeleteItem1(talker, 57, 10000);

}

} else {
myself.ShowPage(talker, "witch_athrea_q0501_06.htm");

}

}

}
if (ask == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 503) {

}
super;
	}


}