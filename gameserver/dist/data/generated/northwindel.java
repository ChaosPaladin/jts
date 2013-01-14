package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class northwindel extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1224) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) < 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) >= 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Wizard (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1224) != 0) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1224, gg.OwnItemCount(talker, 1224));
if (gg.OwnItemCount(talker, 1274) == 0) {
myself.GiveItem1(talker, 1274, 1);

}
myself.ShowPage(talker, "northwindel_q0408_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) < 2) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "northwindel_q0408_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 408) != 0 && gg.OwnItemCount(talker, 1274) != 0 && gg.OwnItemCount(talker, 1225) >= 2) {
myself.SetCurrentQuestID(408);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1225, gg.OwnItemCount(talker, 1225));
myself.DeleteItem1(talker, 1274, gg.OwnItemCount(talker, 1274));
if (gg.OwnItemCount(talker, 1226) == 0) {
myself.GiveItem1(talker, 1226, 1);

}
myself.ShowPage(talker, "northwindel_q0408_03.htm");

}

}
break;

}

}
return;

}
super;
	}


}