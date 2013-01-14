package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alexandria extends exchange_argathion {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3308) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) == 1 && gg.OwnItemCount(talker, 3323) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Witchcraft (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3308) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "alexandria_q0229_01.htm", 229);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "alexandria_q0229_04.htm", 229);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) == 1 && gg.OwnItemCount(talker, 3323) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "alexandria_q0229_05.htm", 229);

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 229) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 229) {
if (reply == 1) {
myself.ShowQuestPage(talker, "alexandria_q0229_02.htm", 229);

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 3308) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "alexandria_q0229_03.htm", 229);
myself.DeleteItem1(talker, 3308, 1);
myself.GiveItem1(talker, 3309, 1);
myself.SetFlagJournal(talker, 229, 2);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}