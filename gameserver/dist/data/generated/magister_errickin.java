package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_errickin extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) < 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 3 && gg.OwnItemCount(talker, 9787) < 35) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 3 && gg.OwnItemCount(talker, 9787) >= 35) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 4) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "More Than Meets the Eye (In Progress)");

}
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) > 4) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "More Than Meets the Eye (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) < 2) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_errickin_q0136_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 2) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_errickin_q0136_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 3 && gg.OwnItemCount(talker, 9787) < 35) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_errickin_q0136_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 3 && gg.OwnItemCount(talker, 9787) >= 35) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 9787, gg.OwnItemCount(talker, 9787));
myself.SetMemoState(talker, 136, 4);
myself.ShowPage(talker, "magister_errickin_q0136_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 4) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 9786, 1);
myself.SetMemoState(talker, 136, 5);
myself.ShowPage(talker, "magister_errickin_q0136_06.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 136, 5);
myself.ShowQuestMark(talker, 136);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) > 4) {
myself.SetCurrentQuestID(136);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_errickin_q0136_07.htm");

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
if (gg.HaveMemo(talker, 136) == 1 && gg.GetMemoState(talker, 136) == 2) {
myself.SetMemoState(talker, 136, 3);
myself.ShowPage(talker, "magister_errickin_q0136_03.htm");
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetFlagJournal(talker, 136, 3);
myself.ShowQuestMark(talker, 136);

}

}

}
super;
	}


}