package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_pilgrim2 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 11) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 12) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 11) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 11) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 12) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Ghost Sentinel (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 11) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim2_q0082_0131.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 12) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim2_q0082_0132.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 11) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim2_q0083_0131.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 12) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim2_q0083_0132.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 11) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim2_q0084_0131.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 12) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_pilgrim2_q0084_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 82) {
if (reply == 9) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 11) {
myself.SetMemoState(talker, 82, 12);
myself.ShowPage(talker, "dark_pilgrim2_q0082_0133.htm");
myself.SetFlagJournal(talker, 82, 15);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 83) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 83) {
if (reply == 9) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 11) {
myself.SetMemoState(talker, 83, 12);
myself.ShowPage(talker, "dark_pilgrim2_q0083_0133.htm");
myself.SetFlagJournal(talker, 83, 15);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 84) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 84) {
if (reply == 9) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 11) {
myself.SetMemoState(talker, 84, 12);
myself.ShowPage(talker, "dark_pilgrim2_q0084_0133.htm");
myself.SetFlagJournal(talker, 84, 15);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}