package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_clayton extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 5 && gg.OwnItemCount(talker, 2748)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 6 && gg.OwnItemCount(talker, 2755) && gg.OwnItemCount(talker, 2754) + gg.OwnItemCount(talker, 2753) + gg.OwnItemCount(talker, 2752) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 6 && gg.OwnItemCount(talker, 2755) && gg.OwnItemCount(talker, 2754) + gg.OwnItemCount(talker, 2753) + gg.OwnItemCount(talker, 2752) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) < 8) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 10 && gg.OwnItemCount(talker, 9789) < 5) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 10 && gg.OwnItemCount(talker, 9789) >= 5) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) >= 11) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 2) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 3 && gg.OwnItemCount(talker, 9773) < 30) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 3 && gg.OwnItemCount(talker, 9773) >= 30) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 4) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 5) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Certified Arbalester (In Progress)");

}
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) > 5) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Certified Arbalester (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 5 && gg.OwnItemCount(talker, 2748)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_clayton_q0217_01.htm");
myself.GiveItem1(talker, 2755, 1);
myself.DeleteItem1(talker, 2748, 1);
myself.SetMemoState(talker, 217, 6);
myself.SetFlagJournal(talker, 217, 6);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 6 && gg.OwnItemCount(talker, 2755) && gg.OwnItemCount(talker, 2754) + gg.OwnItemCount(talker, 2753) + gg.OwnItemCount(talker, 2752) < 3) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0217_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 6 && gg.OwnItemCount(talker, 2755) && gg.OwnItemCount(talker, 2754) + gg.OwnItemCount(talker, 2753) + gg.OwnItemCount(talker, 2752) == 3) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0217_03.htm");
myself.SetFlagJournal(talker, 217, 8);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) < 8) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0136_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 8) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0136_09.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 10 && gg.OwnItemCount(talker, 9789) < 5) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0136_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 10 && gg.OwnItemCount(talker, 9789) >= 5) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9790, 1);
myself.DeleteItem1(talker, 9789, gg.OwnItemCount(talker, 9789));
myself.SetMemoState(talker, 136, 11);
myself.ShowPage(talker, "magister_clayton_q0136_13.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 136, 9);
myself.ShowQuestMark(talker, 136);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) >= 11) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0136_14.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) < 2) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0066_01.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 2) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 66, 2);
myself.ShowPage(talker, "magister_clayton_q0066_02.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 3 && gg.OwnItemCount(talker, 9773) < 30) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0066_07.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 3 && gg.OwnItemCount(talker, 9773) >= 30) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 9773, gg.OwnItemCount(talker, 9773));
myself.SetMemoState(talker, 66, 4);
myself.ShowPage(talker, "magister_clayton_q0066_08.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 4) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9774, 1);
myself.SetMemoState(talker, 66, 5);
myself.ShowPage(talker, "magister_clayton_q0066_10.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 5);
myself.ShowQuestMark(talker, 66);

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 5) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0066_12.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) > 5) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_clayton_q0066_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 136) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 136) {
if (reply == 1) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 8) {
myself.DeleteItem1(talker, 9788, gg.OwnItemCount(talker, 9788));
myself.SetMemoState(talker, 136, 10);
myself.ShowPage(talker, "magister_clayton_q0136_10.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 136, 7);
myself.ShowQuestMark(talker, 136);

}

}

}
if (ask == 66) {
myself.SetCurrentQuestID(66);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 66) {
if (reply == 1) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 2) {
myself.ShowPage(talker, "magister_clayton_q0066_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 2) {
myself.ShowPage(talker, "magister_clayton_q0066_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 2) {
myself.ShowPage(talker, "magister_clayton_q0066_05.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 2) {
myself.SetMemoState(talker, 66, 3);
myself.ShowPage(talker, "magister_clayton_q0066_06.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 3);
myself.ShowQuestMark(talker, 66);

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 66) == 1 && gg.GetMemoState(talker, 66) == 4) {
myself.GiveItem1(talker, 9774, 1);
myself.SetMemoState(talker, 66, 5);
myself.ShowPage(talker, "magister_clayton_q0066_09.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 66, 5);
myself.ShowQuestMark(talker, 66);

}

}
if (reply == 6) {
myself.ShowPage(talker, "magister_clayton_q0066_11.htm");

}

}
super;
	}


}