package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class piper_longbow extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) && gg.OwnItemCount(talker, 2817) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2817) && gg.OwnItemCount(talker, 2818) == 0 || gg.OwnItemCount(talker, 2819) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2817) && gg.OwnItemCount(talker, 2818) && gg.OwnItemCount(talker, 2819)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) && gg.OwnItemCount(talker, 2817) == 0) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piper_longbow_q0226_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2817) && gg.OwnItemCount(talker, 2818) == 0 || gg.OwnItemCount(talker, 2819) == 0) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piper_longbow_q0226_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2817) && gg.OwnItemCount(talker, 2818) && gg.OwnItemCount(talker, 2819)) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piper_longbow_q0226_03.htm");
myself.SetFlagJournal(talker, 226, 21);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
return;

}
super;
	}


}