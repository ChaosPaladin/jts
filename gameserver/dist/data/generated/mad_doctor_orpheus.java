package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mad_doctor_orpheus extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 345) == 1 && gg.OwnItemCount(talker, 4280) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Method to Raise the Dead (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 345) == 1 && gg.OwnItemCount(talker, 4280) > 0) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mad_doctor_orpheus_q0345_08.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 345) {
myself.SetCurrentQuestID(345);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 345) {
if (reply == 4) {
myself.ShowPage(talker, "mad_doctor_orpheus_q0345_10.htm");

}
if (reply == 5) {
if (gg.OwnItemCount(talker, 4280) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 4280) * 104);
myself.DeleteItem1(talker, 4280, gg.OwnItemCount(talker, 4280));
myself.ShowPage(talker, "mad_doctor_orpheus_q0345_11.htm");
gg.AddLog(3, talker, 345);

}

}

}

}
super;
	}


}