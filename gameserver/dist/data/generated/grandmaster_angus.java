package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandmaster_angus extends master_lv3_de {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) < 3 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 3 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 4 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 5 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Temple Champion - 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) < 3 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_angus_q0138_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 3 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_angus_q0138_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 4 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10342) >= 10) {
myself.GiveItem1(talker, 10343, 1);
myself.DeleteItem1(talker, 10342, gg.OwnItemCount(talker, 10342));
myself.SetMemoState(talker, 138, 7);
myself.ShowPage(talker, "grandmaster_angus_q0138_05.htm");
myself.SetFlagJournal(talker, 138, 5);
myself.ShowQuestMark(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "grandmaster_angus_q0138_04.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 5 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmaster_angus_q0138_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 138) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 138) {
if (reply == 1) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 3 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetMemoState(talker, 138, 4);
myself.ShowPage(talker, "grandmaster_angus_q0138_03.htm");
myself.SetFlagJournal(talker, 138, 4);
myself.ShowQuestMark(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}