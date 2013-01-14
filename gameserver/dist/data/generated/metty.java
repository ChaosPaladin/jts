package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class metty extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Get a Pet (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 419, gg.GetMemoState(talker, 419) | 4);
myself.ShowPage(talker, "metty_q0419_01.htm");

}
break;

}

}
return;

}
super;
	}


}