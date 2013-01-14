package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class az extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 23) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 23) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 24) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 25) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 26) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 27) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 29) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Certified Arbalester (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 23) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 23) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 24) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 25) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 26) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 27) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_11.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 28) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_12.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 29) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "az_q0066_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 66) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 66) {
if (reply == 1) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 23) {
myself.ShowPage(talker, "az_q0066_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 23) {
myself.DeleteItem1(talker, 9779, gg.OwnItemCount(talker, 9779));
myself.SetMemoState(talker, 66, 24);
myself.ShowPage(talker, "az_q0066_05.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 24) {
myself.ShowPage(talker, "az_q0066_06.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 24) {
myself.ShowPage(talker, "az_q0066_07.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 24) {
myself.SetMemoState(talker, 66, 25);

}
myself.ShowPage(talker, "az_q0066_08.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 14);
myself.ShowQuestMark(talker, 66);

}

}
super;
	}


}