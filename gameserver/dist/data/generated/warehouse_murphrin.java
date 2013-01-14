package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_murphrin extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) && gg.OwnItemCount(talker, 1569) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) == 0 && gg.OwnItemCount(talker, 1569)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) == 0 && gg.OwnItemCount(talker, 1569) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) && gg.OwnItemCount(talker, 1569) == 0) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_murphrin_q0108_01.htm");
myself.GiveItem1(talker, 1569, 1);
myself.DeleteItem1(talker, 1568, 1);
myself.SetFlagJournal(talker, 108, 10);
myself.ShowQuestMark(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) == 0 && gg.OwnItemCount(talker, 1569)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_murphrin_q0108_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) == 0 && gg.OwnItemCount(talker, 1569) == 0) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_murphrin_q0108_03.htm");

}
break;

}

}
return;

}
super;
	}


}