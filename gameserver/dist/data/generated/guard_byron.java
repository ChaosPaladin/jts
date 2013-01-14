package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_byron extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 3 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 4 && gg.OwnItemCount(talker, 3816) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 4 && gg.OwnItemCount(talker, 3817) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 10) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Little Wing (In Progress)");

}
if (gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 0 && gg.OwnItemCount(talker, 3817) == 0 && gg.OwnItemCount(talker, 3818) == 1 || gg.OwnItemCount(talker, 3819) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Little Wing (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 3 && gg.OwnItemCount(talker, 3816) == 1 || gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_byron_q0420_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 420, 4);
myself.ShowPage(talker, "guard_byron_q0420_05.htm");
myself.SetJournal(talker, 420, 4);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 420, 4);
myself.ShowPage(talker, "guard_byron_q0420_06.htm");
myself.SetJournal(talker, 420, 4);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 4 && gg.OwnItemCount(talker, 3816) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_byron_q0420_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 4 && gg.OwnItemCount(talker, 3817) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_byron_q0420_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 10) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_byron_q0420_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 420) == 1 && gg.GetMemoState(talker, 420) == 11 && gg.OwnItemCount(talker, 3816) == 0 && gg.OwnItemCount(talker, 3817) == 0 && gg.OwnItemCount(talker, 3818) == 1 || gg.OwnItemCount(talker, 3819) == 1) {
myself.SetCurrentQuestID(420);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_byron_q0420_10.htm");

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
myself.ShowPage(talker, "guard_byron_q0420_02.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3816) == 1) {
myself.SetMemoState(talker, 420, 4);
myself.ShowPage(talker, "guard_byron_q0420_03.htm");
myself.SetJournal(talker, 420, 4);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.SetMemoState(talker, 420, 4);
myself.ShowPage(talker, "guard_byron_q0420_04.htm");
myself.SetJournal(talker, 420, 4);
myself.ShowQuestMark(talker, 420);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}