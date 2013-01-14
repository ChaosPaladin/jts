package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rant extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1015) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Deliver Goods (In Progress)");

}
if (gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1018) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Deliver Goods (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1015) != 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1015, gg.OwnItemCount(talker, 1015));
if (gg.OwnItemCount(talker, 1018) == 0) {
myself.GiveItem1(talker, 1018, 1);

}
myself.ShowPage(talker, "rant_q0302_01.htm");
if (gg.OwnItemCount(talker, 1016) >= 1 && gg.OwnItemCount(talker, 1017) >= 1) {
myself.SetFlagJournal(talker, 153, 2);
myself.ShowQuestMark(talker, 153);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1018) != 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rant_q0302_02.htm");

}
break;

}

}
return;

}
super;
	}


}