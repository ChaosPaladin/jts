package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class highpriestess_morelyn extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 4) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Winds of Change (In progress)");

}
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) > 4) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Winds of Change (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 4) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriestess_morelyn_q0237_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) > 4) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "highpriestess_morelyn_q0237_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 237) {
myself.SetCurrentQuestID(237);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 237) {
if (reply == 1) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 4) {
myself.ShowPage(talker, "highpriestess_morelyn_q0237_02.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 237) == 1 && gg.GetMemoState(talker, 237) == 4) {
myself.SetMemoState(talker, 237, 5);
myself.ShowPage(talker, "highpriestess_morelyn_q0237_03.htm");
myself.SetFlagJournal(talker, 237, 4);
myself.ShowQuestMark(talker, 237);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}