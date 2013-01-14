package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hermit_2 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 11) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 12) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 11) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 12) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 11) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 12) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Ghost Hunter (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 11) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_2_q0079_0131.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 12) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_2_q0079_0132.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 11) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_2_q0080_0131.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 12) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_2_q0080_0132.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 11) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_2_q0081_0131.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 12) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "hermit_2_q0081_0132.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 79) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 79) {
if (reply == 9) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 11) {
myself.SetMemoState(talker, 79, 12);
myself.ShowPage(talker, "hermit_2_q0079_0133.htm");
myself.SetFlagJournal(talker, 79, 15);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 80) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 80) {
if (reply == 9) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 11) {
myself.SetMemoState(talker, 80, 12);
myself.ShowPage(talker, "hermit_2_q0080_0133.htm");
myself.SetFlagJournal(talker, 80, 15);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 81) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 81) {
if (reply == 9) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 11) {
myself.SetMemoState(talker, 81, 12);
myself.ShowPage(talker, "hermit_2_q0081_0133.htm");
myself.SetFlagJournal(talker, 81, 15);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}