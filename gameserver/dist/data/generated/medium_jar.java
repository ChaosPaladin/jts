package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class medium_jar extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Method to Raise the Dead (In Progress)");

}
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Method to Raise the Dead (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 3) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 4281, gg.OwnItemCount(talker, 4281));
myself.DeleteItem1(talker, 4274, gg.OwnItemCount(talker, 4274));
myself.DeleteItem1(talker, 4275, gg.OwnItemCount(talker, 4275));
myself.DeleteItem1(talker, 4276, gg.OwnItemCount(talker, 4276));
myself.DeleteItem1(talker, 4277, gg.OwnItemCount(talker, 4277));
myself.DeleteItem1(talker, 4278, gg.OwnItemCount(talker, 4278));
myself.SetMemoState(talker, 345, 7);
i0 = gg.Rand(100);
if (i0 <= 39) {
myself.SetMemoStateEx(talker, 345, 1, 1);

} else if (i0 <= 79) {
myself.SetMemoStateEx(talker, 345, 1, 2);

} else {
myself.SetMemoStateEx(talker, 345, 1, 3);

}
myself.ShowPage(talker, "medium_jar_q0345_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 1) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "medium_jar_q0345_03t.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 2) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "medium_jar_q0345_05t.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 3) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "medium_jar_q0345_07t.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 8) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "medium_jar_q0345_09.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 345) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 345) {
if (reply == 1) {
if (gg.GetMemoStateEx(talker, 345, 1) == 1) {
myself.ShowPage(talker, "medium_jar_q0345_03.htm");

} else if (gg.GetMemoStateEx(talker, 345, 1) == 2) {
myself.ShowPage(talker, "medium_jar_q0345_05.htm");

} else if (gg.GetMemoStateEx(talker, 345, 1) == 3) {
myself.ShowPage(talker, "medium_jar_q0345_07.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 1) {
myself.SetMemoState(talker, 345, 8);
myself.SetFlagJournal(talker, 345, 6);
myself.ShowQuestMark(talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "medium_jar_q0345_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 2) {
myself.SetMemoState(talker, 345, 8);
myself.SetFlagJournal(talker, 345, 6);
myself.ShowQuestMark(talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "medium_jar_q0345_06.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 345) == 1 && gg.GetMemoState(talker, 345) == 7 && gg.GetMemoStateEx(talker, 345, 1) == 3) {
myself.SetMemoState(talker, 345, 8);
myself.SetFlagJournal(talker, 345, 7);
myself.ShowQuestMark(talker, 345);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "medium_jar_q0345_08.htm");

}

}

}
super;
	}


}