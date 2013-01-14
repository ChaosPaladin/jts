package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_sumari extends blacksmith {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3401) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3401) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3401) == 0 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3402) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) >= 1 && gg.OwnItemCount(talker, 3394) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3401) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3401) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_sumari_q0232_01.htm");
myself.GiveItem1(talker, 3401, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3401) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_sumari_q0232_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3401) == 0 && gg.OwnItemCount(talker, 3404) == 0 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3394) >= 1 && gg.OwnItemCount(talker, 3402) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_sumari_q0232_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) >= 1 && gg.OwnItemCount(talker, 3404) >= 1 && gg.OwnItemCount(talker, 3394) == 0 && gg.OwnItemCount(talker, 3402) == 0 && gg.OwnItemCount(talker, 3401) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_sumari_q0232_04.htm");

}
break;

}

}
return;

}
super;
	}


}