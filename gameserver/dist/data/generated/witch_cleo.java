package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class witch_cleo extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8000) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8100) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) > 8100 && gg.GetMemoState(talker, 503) < 10000) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 10000 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Pursuit of Clan Ambition! (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_cleo_q0503_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_cleo_q0503_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 8100) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_cleo_q0503_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) > 8100 && gg.GetMemoState(talker, 503) < 10000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_cleo_q0503_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 10000 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "witch_cleo_q0503_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 503) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 503) {
if (reply == 1) {
myself.ShowPage(talker, "witch_cleo_q0503_03.htm");

}
if (reply == 2) {
myself.SetMemoState(talker, 503, 8100);
myself.ShowPage(talker, "witch_cleo_q0503_04.htm");
myself.Say(gg.MakeFString(50338, "", "", "", "", ""));
myself.CreateOnePrivateEx(1030758, "witch_athrea", 0, 5, 160688, 21296, -3714, 0, 32768, 50301, 0);
myself.CreateOnePrivateEx(1030759, "witch_kalis", 0, 5, 160690, 21176, -3712, 0, 32768, 50302, 0);
myself.SetJournal(talker, 503, 9);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 3) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.OwnItemCount(talker, 3869) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3870, 1);
myself.IncrementParam(talker, 1, 250000);
myself.DeleteItem1(talker, 3869, gg.OwnItemCount(talker, 3869));
myself.RemoveMemo(talker, 503);
gg.AddLog(2, talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "witch_cleo_q0503_08.htm");

}

}

}

}
super;
	}


}