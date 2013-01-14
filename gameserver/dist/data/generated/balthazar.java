package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class balthazar extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000 && talker.is_pledge_master == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000 && gg.OwnItemCount(talker, 3871) == 0 && talker.is_pledge_master == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000 && gg.OwnItemCount(talker, 3871) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 5000) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Pursuit of Clan Ambition! (In Progress)");

}
if (gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 6000) {
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
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000 && talker.is_pledge_master == 0) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "balthazar_q0503_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000 && gg.OwnItemCount(talker, 3871) == 0 && talker.is_pledge_master == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "balthazar_q0503_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 4000 && gg.OwnItemCount(talker, 3871) == 1) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "balthazar_q0503_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) == 5000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 14855) < 10) {
myself.ShowPage(talker, "balthazar_q0503_07a.htm");

} else if (gg.OwnItemCount(talker, 3846) < 10 || gg.OwnItemCount(talker, 3844) < 10 && gg.OwnItemCount(talker, 14855) < 1) {
myself.ShowPage(talker, "balthazar_q0503_07a.htm");

} else if (gg.OwnItemCount(talker, 14855) >= 10) {
myself.DeleteItem1(talker, 3846, gg.OwnItemCount(talker, 3846));
myself.DeleteItem1(talker, 3844, gg.OwnItemCount(talker, 3844));
myself.DeleteItem1(talker, 14855, gg.OwnItemCount(talker, 14855));
myself.SetMemoState(talker, 503, 6000);
myself.ShowPage(talker, "balthazar_q0503_08a.htm");
myself.SetJournal(talker, 503, 6);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 3846) >= 10 && gg.OwnItemCount(talker, 3844) >= 10) {
myself.DeleteItem1(talker, 3846, gg.OwnItemCount(talker, 3846));
myself.DeleteItem1(talker, 3844, gg.OwnItemCount(talker, 3844));
myself.DeleteItem1(talker, 14855, gg.OwnItemCount(talker, 14855));
myself.SetMemoState(talker, 503, 6000);
myself.ShowPage(talker, "balthazar_q0503_08a.htm");
myself.SetJournal(talker, 503, 6);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(myself.Pledge_GetLeader(talker), 503) == 1 && gg.GetMemoState(talker, 503) >= 6000) {
myself.SetCurrentQuestID(503);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "balthazar_q0503_09.htm");

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
myself.DeleteItem1(talker, 3867, gg.OwnItemCount(talker, 3867));
myself.SetMemoState(talker, 503, 5000);
myself.ShowPage(talker, "balthazar_q0503_03.htm");
myself.SetJournal(talker, 503, 5);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
if (reply == 2) {
myself.ShowPage(talker, "balthazar_q0503_05.htm");

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 14854, 1);
myself.DeleteItem1(talker, 3867, gg.OwnItemCount(talker, 3867));
myself.DeleteItem1(talker, 3871, gg.OwnItemCount(talker, 3871));
myself.SetMemoState(talker, 503, 5000);
myself.ShowPage(talker, "balthazar_q0503_06.htm");
myself.SetJournal(talker, 503, 5);
myself.ShowQuestMark(talker, 503);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}