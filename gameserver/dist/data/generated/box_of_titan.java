package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class box_of_titan extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3270) >= 1 && gg.OwnItemCount(talker, 3271) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3030) >= 1 && gg.OwnItemCount(talker, 3245) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Prosperity (In Progress)");

}
if (gg.OwnItemCount(talker, 3030) == 0 && gg.OwnItemCount(talker, 3270) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3270) >= 1 && gg.OwnItemCount(talker, 3271) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "box_of_titan_q0221_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) >= 1 && gg.OwnItemCount(talker, 3030) >= 1 && gg.OwnItemCount(talker, 3245) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "box_of_titan_q0221_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 3030) == 0 && gg.OwnItemCount(talker, 3270) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "box_of_titan_q0221_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3270) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "box_of_titan_q0221_02.htm");
myself.DeleteItem1(talker, 3270, 1);
myself.GiveItem1(talker, 3271, 1);
myself.SetFlagJournal(talker, 221, 6);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3030) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "box_of_titan_q0221_04.htm");
myself.DeleteItem1(talker, 3272, gg.OwnItemCount(talker, 3272));
myself.DeleteItem1(talker, 3023, gg.OwnItemCount(talker, 3023));
myself.DeleteItem1(talker, 3273, gg.OwnItemCount(talker, 3273));
myself.DeleteItem1(talker, 3274, gg.OwnItemCount(talker, 3274));
myself.DeleteItem1(talker, 3275, gg.OwnItemCount(talker, 3275));
myself.DeleteItem1(talker, 3030, 1);
myself.GiveItem1(talker, 3245, 1);
myself.SetFlagJournal(talker, 221, 9);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}