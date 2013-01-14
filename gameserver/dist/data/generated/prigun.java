package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class prigun extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1214) && gg.OwnItemCount(talker, 1212)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Scout (In Progress)");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1215)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Scout (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1214) && gg.OwnItemCount(talker, 1212)) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1293) < 1) {
myself.ShowPage(talker, "prigun_q0407_01.htm");
myself.SetFlagJournal(talker, 407, 5);
myself.ShowQuestMark(talker, 407);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prigun_q0407_02.htm");
myself.DeleteItem1(talker, 1293, 1);
myself.DeleteItem1(talker, 1212, 1);
myself.DeleteItem1(talker, 1214, 1);
myself.GiveItem1(talker, 1215, 1);
myself.SetFlagJournal(talker, 407, 7);
myself.ShowQuestMark(talker, 407);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1215)) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prigun_q0407_04.htm");

}
break;

}

}
return;

}
super;
	}


}