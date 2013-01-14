package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class juria extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 1 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Lost Dream (In Progress)");

}
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 2 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Lost Dream (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 1 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "juria_q0190_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 2 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "juria_q0190_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 190) {
myself.SetCurrentQuestID(190);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 190) {
if (reply == 1) {
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 1 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.ShowPage(talker, "juria_q0190_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 190) == 1 && gg.GetMemoState(talker, 190) == 1 && myself.GetOneTimeQuestFlag(talker, 190) == 0) {
myself.SetMemoState(talker, 190, 2);
myself.ShowPage(talker, "juria_q0190_03.htm");
myself.SetFlagJournal(talker, 190, 2);
myself.ShowQuestMark(talker, 190);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}