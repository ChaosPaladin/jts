package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class drake_exarion extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 6 && gg.OwnItemCount(talker, 3821) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 7 && gg.OwnItemCount(talker, 3823) < 20 && gg.OwnItemCount(talker, 3822) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3823) >= 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 8 && gg.OwnItemCount(talker, 3823) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Little Wing (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 6 && gg.OwnItemCount(talker, 3821) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "drake_exarion_q0420_02.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 7 && gg.OwnItemCount(talker, 3823) < 20 && gg.OwnItemCount(talker, 3822) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "drake_exarion_q0420_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.OwnItemCount(talker, 3823) >= 20) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3823, gg.OwnItemCount(talker, 3823) - 1);
myself.DeleteItem1(talker, 3822, gg.OwnItemCount(talker, 3822));
myself.SetMemoState(talker, 420, 8);
myself.ShowPage(talker, "drake_exarion_q0420_05.htm");
myself.SetJournal(talker, 420, 7);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 8 && gg.OwnItemCount(talker, 3823) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "drake_exarion_q0420_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 420) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3822, 1);
myself.DeleteItem1(talker, 3821, gg.OwnItemCount(talker, 3821));
myself.SetMemoState(talker, 420, 7);
myself.ShowPage(talker, "drake_exarion_q0420_03.htm");
myself.SetJournal(talker, 420, 6);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}