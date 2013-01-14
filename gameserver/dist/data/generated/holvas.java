package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class holvas extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) % 1000 < 100) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) % 1000 > 100) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 7) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 8 && gg.OwnItemCount(talker, 9775) < 30) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 8 && gg.OwnItemCount(talker, 9775) >= 30) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 9) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) > 9) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) % 1000 < 100) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 363, 1);
myself.SetMemoStateEx(talker, 363, 1, i0 + 101);
myself.SetMemoStateEx(talker, 363, 0, 2);
i1 = gg.Rand(3);
if (i1 == 0) {
myself.ShowPage(talker, "holvas_q0363_01.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 1) {
myself.ShowPage(talker, "holvas_q0363_02.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 2) {
myself.ShowPage(talker, "holvas_q0363_03.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) % 1000 > 100) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holvas_q0363_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 7) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holvas_q0066_01.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holvas_q0066_02.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 8 && gg.OwnItemCount(talker, 9775) < 30) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holvas_q0066_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 8 && gg.OwnItemCount(talker, 9775) >= 30) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 9775, gg.OwnItemCount(talker, 9775));
myself.SetMemoState(talker, 66, 9);
myself.ShowPage(talker, "holvas_q0066_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 9) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9776, 1);
myself.SetMemoState(talker, 66, 10);
myself.ShowPage(talker, "holvas_q0066_09.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 9);
myself.ShowQuestMark(talker, 66);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) > 9) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holvas_q0066_10.htm");

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
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
myself.ShowPage(talker, "holvas_q0066_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
myself.ShowPage(talker, "holvas_q0066_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
myself.SetMemoState(talker, 66, 8);
myself.ShowPage(talker, "holvas_q0066_05.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 7);
myself.ShowQuestMark(talker, 66);

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 9) {
myself.GiveItem1(talker, 9776, 1);
myself.SetMemoState(talker, 66, 10);
myself.ShowPage(talker, "holvas_q0066_08.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 9);
myself.ShowQuestMark(talker, 66);

}

}

}
super;
	}


}