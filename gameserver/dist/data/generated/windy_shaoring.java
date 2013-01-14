package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class windy_shaoring extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2812)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2814)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2812)) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "windy_shaoring_q0226_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.OwnItemCount(talker, 2814)) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "windy_shaoring_q0226_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 226) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 226) {
if (reply == 1 && gg.OwnItemCount(talker, 2812) > 0) {
myself.ShowPage(talker, "windy_shaoring_q0226_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 2812) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "windy_shaoring_q0226_03.htm");
myself.DeleteItem1(talker, 2812, 1);
myself.GiveItem1(talker, 2814, 1);
myself.SetFlagJournal(talker, 226, 8);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.Despawn();

}

}

}
super;
	}


}