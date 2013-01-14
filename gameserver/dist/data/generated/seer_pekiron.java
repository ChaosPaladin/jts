package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_pekiron extends mage_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2888) == 0 && gg.OwnItemCount(talker, 2894) == 0 && gg.OwnItemCount(talker, 2912) == 0 && gg.OwnItemCount(talker, 2880) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2888) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the War Spirit (In Progress)");

}
if (gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2888) == 0 && gg.OwnItemCount(talker, 2894) >= 1 || gg.OwnItemCount(talker, 2912) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the War Spirit (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2888) == 0 && gg.OwnItemCount(talker, 2894) == 0 && gg.OwnItemCount(talker, 2912) == 0 && gg.OwnItemCount(talker, 2880) == 0) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_pekiron_q0233_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2888) == 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2889) >= 1 && gg.OwnItemCount(talker, 2890) >= 1 && gg.OwnItemCount(talker, 2891) >= 1 && gg.OwnItemCount(talker, 2892) >= 1 && gg.OwnItemCount(talker, 2893) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_pekiron_q0233_04.htm");
myself.DeleteItem1(talker, 2888, gg.OwnItemCount(talker, 2888));
myself.DeleteItem1(talker, 2889, gg.OwnItemCount(talker, 2889));
myself.DeleteItem1(talker, 2890, gg.OwnItemCount(talker, 2890));
myself.DeleteItem1(talker, 2891, gg.OwnItemCount(talker, 2891));
myself.DeleteItem1(talker, 2892, gg.OwnItemCount(talker, 2892));
myself.DeleteItem1(talker, 2893, 1);
myself.GiveItem1(talker, 2894, 1);
myself.SetFlagJournal(talker, 233, 2);
myself.ShowQuestMark(talker, 233);

}

} else {
myself.ShowPage(talker, "seer_pekiron_q0233_03.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 233) == 1 && gg.OwnItemCount(talker, 2888) == 0 && gg.OwnItemCount(talker, 2894) >= 1 || gg.OwnItemCount(talker, 2912) >= 1 || gg.OwnItemCount(talker, 2880) >= 1) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_pekiron_q0233_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 233) {
myself.SetCurrentQuestID(233);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 233) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_pekiron_q0233_02.htm");
myself.GiveItem1(talker, 2888, 1);

}

}

}
super;
	}


}