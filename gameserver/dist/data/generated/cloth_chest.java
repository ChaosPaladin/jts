package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cloth_chest extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 364) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jovial Accordion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cloth_chest_q0364_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 364) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 364) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 4323) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(2) == 0) {
myself.GiveItem1(talker, 4322, 1);
myself.DeleteItem1(talker, 4323, 1);
myself.ShowPage(talker, "cloth_chest_q0364_02.htm");

} else {
myself.DeleteItem1(talker, 4323, 1);
myself.ShowPage(talker, "cloth_chest_q0364_04.htm");

}

}

} else {
myself.ShowPage(talker, "cloth_chest_q0364_03.htm");

}

}

}
super;
	}


}