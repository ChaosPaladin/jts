package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class iker extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3310) == 0 && gg.OwnItemCount(talker, 3317) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3310) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3310) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3317) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) == 1 && gg.OwnItemCount(talker, 3332) == 0 && gg.OwnItemCount(talker, 3334) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3334) == 0 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3332) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3332) == 0 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3334) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Witchcraft (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3310) == 0 && gg.OwnItemCount(talker, 3317) == 0) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "iker_q0229_01.htm", 229);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3310) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3311) >= 20 && gg.OwnItemCount(talker, 3312) >= 20 && gg.OwnItemCount(talker, 3313) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "iker_q0229_05.htm", 229);
myself.DeleteItem1(talker, 3310, 1);
myself.GiveItem1(talker, 3317, 1);
myself.DeleteItem1(talker, 3311, gg.OwnItemCount(talker, 3311));
myself.DeleteItem1(talker, 3312, gg.OwnItemCount(talker, 3312));
myself.DeleteItem1(talker, 3313, gg.OwnItemCount(talker, 3313));
if (gg.OwnItemCount(talker, 3318) >= 1 && gg.OwnItemCount(talker, 3319) >= 1 && gg.OwnItemCount(talker, 3320) >= 1 && gg.OwnItemCount(talker, 3321) >= 1 && gg.OwnItemCount(talker, 3322) >= 1) {
myself.SetFlagJournal(talker, 229, 3);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else {
myself.ShowQuestPage(talker, "iker_q0229_04.htm", 229);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3310) == 0 && gg.OwnItemCount(talker, 3309) >= 1 && gg.OwnItemCount(talker, 3317) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "iker_q0229_06.htm", 229);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3324) == 1 && gg.OwnItemCount(talker, 3332) == 0 && gg.OwnItemCount(talker, 3334) == 0) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "iker_q0229_07.htm", 229);

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3334) == 0 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3332) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "iker_q0229_09.htm", 229);

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3332) == 0 && gg.OwnItemCount(talker, 3324) >= 1 && gg.OwnItemCount(talker, 3334) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "iker_q0229_10.htm", 229);

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
myself.ShowQuestPage(talker, "iker_q0229_02.htm", 229);

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "iker_q0229_03.htm", 229);
myself.GiveItem1(talker, 3310, 1);

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "iker_q0229_08.htm", 229);
myself.GiveItem1(talker, 3332, 1);
myself.GiveItem1(talker, 3331, 1);
myself.DeleteItem1(talker, 3326, gg.OwnItemCount(talker, 3326));
if (gg.OwnItemCount(talker, 3029) >= 1) {
myself.SetFlagJournal(talker, 229, 7);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}