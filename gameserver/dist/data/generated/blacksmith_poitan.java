package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_poitan extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2715) == 0 && gg.OwnItemCount(talker, 2709) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) == 0 && gg.OwnItemCount(talker, 2709) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) >= 1 && gg.OwnItemCount(talker, 2709) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2709) >= 1 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2715) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) % 100 < 10) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) % 100 >= 10) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 5) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 5) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Certified Arbalester (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) == 1 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2715) == 0 && gg.OwnItemCount(talker, 2709) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_poitan_q0214_01.htm");
myself.GiveItem1(talker, 2711, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) == 0 && gg.OwnItemCount(talker, 2709) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0214_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2711) >= 1 && gg.OwnItemCount(talker, 2715) >= 1 && gg.OwnItemCount(talker, 2709) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0214_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2705) >= 1 && gg.OwnItemCount(talker, 2709) >= 1 && gg.OwnItemCount(talker, 2711) == 0 && gg.OwnItemCount(talker, 2715) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0214_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) % 100 < 10) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 363, 1);
myself.SetMemoStateEx(talker, 363, 1, i0 + 11);
myself.SetMemoStateEx(talker, 363, 0, 2);
i1 = gg.Rand(3);
if (i1 == 0) {
myself.ShowPage(talker, "poitan_q0363_01.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 1) {
myself.ShowPage(talker, "poitan_q0363_02.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 2) {
myself.ShowPage(talker, "poitan_q0363_03.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) % 100 >= 10) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "poitan_q0363_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 5) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0066_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 5) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0066_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0066_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 7) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_poitan_q0066_10.htm");

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
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 5) {
myself.DeleteItem1(talker, 9774, gg.OwnItemCount(talker, 9774));
myself.SetMemoState(talker, 66, 6);
myself.ShowPage(talker, "blacksmith_poitan_q0066_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
myself.ShowPage(talker, "blacksmith_poitan_q0066_05.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
myself.ShowPage(talker, "blacksmith_poitan_q0066_06.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
myself.ShowPage(talker, "blacksmith_poitan_q0066_07.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
myself.ShowPage(talker, "blacksmith_poitan_q0066_08.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 6) {
myself.SetMemoState(talker, 66, 7);
myself.ShowPage(talker, "blacksmith_poitan_q0066_09.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 6);
myself.ShowQuestMark(talker, 66);

}

}

}
super;
	}


}