package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_silvery extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 418) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Artisan");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1632) == 1 && gg.OwnItemCount(talker, 1636) + gg.OwnItemCount(talker, 1637) < 12) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1632) == 1 && gg.OwnItemCount(talker, 1636) >= 10 && gg.OwnItemCount(talker, 1637) >= 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) == 0 && gg.GetMemoState(talker, 418) == 10) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 100 || gg.GetMemoState(talker, 347) == 200 || gg.GetMemoState(talker, 347) == 300) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 400) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 500 && gg.OwnItemCount(talker, 4286) >= 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 500 && gg.OwnItemCount(talker, 4286) < 10) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 600 || gg.GetMemoState(talker, 347) == 700) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Go Get the Calculator. (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 0) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "blacksmith_silvery_q0418_01.htm", 418);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1632) == 1 && gg.OwnItemCount(talker, 1636) + gg.OwnItemCount(talker, 1637) < 12) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_silvery_q0418_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1632) == 1 && gg.OwnItemCount(talker, 1636) >= 10 && gg.OwnItemCount(talker, 1637) >= 2) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
myself.ShowPage(talker, "blacksmith_silvery_q0418_08a.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) == 1) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_silvery_q0418_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.OwnItemCount(talker, 1633) == 0 && gg.GetMemoState(talker, 418) == 10) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_silvery_q0418_09a.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 100 || gg.GetMemoState(talker, 347) == 200 || gg.GetMemoState(talker, 347) == 300) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_silvery_q0347_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 400) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 347, 500);
myself.SetFlagJournal(talker, 347, 5);
myself.ShowQuestMark(talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_silvery_q0347_02.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 500 && gg.OwnItemCount(talker, 4286) >= 10) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4285, 1);
myself.DeleteItem1(talker, 4286, gg.OwnItemCount(talker, 4286));
myself.SetMemoState(talker, 347, 600);
myself.SetFlagJournal(talker, 347, 6);
myself.ShowQuestMark(talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "blacksmith_silvery_q0347_03.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 500 && gg.OwnItemCount(talker, 4286) < 10) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_silvery_q0347_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 600 || gg.GetMemoState(talker, 347) == 700) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_silvery_q0347_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 418) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 418);
gg.AddLog(1, talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "blacksmith_silvery_q0418_06.htm", 418);
myself.GiveItem1(talker, 1632, 1);
myself.SetFlagJournal(talker, 418, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 418) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 418 && reply == 1) {
if (talker.occupation != 53) {
if (talker.occupation == 56) {
myself.ShowQuestPage(talker, "blacksmith_silvery_q0418_02a.htm", 418);

} else {
myself.ShowQuestPage(talker, "blacksmith_silvery_q0418_02.htm", 418);

}

} else if (talker.level < 18) {
myself.ShowQuestPage(talker, "blacksmith_silvery_q0418_03.htm", 418);

} else if (gg.OwnItemCount(talker, 1635) != 0) {
myself.ShowQuestPage(talker, "blacksmith_silvery_q0418_04.htm", 418);

} else {
myself.FHTML_SetFileName(fhtml0, "blacksmith_silvery_q0418_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 418);
myself.ShowQuestFHTML(talker, fhtml0, 418);

}

}
if (ask == 418 && reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_silvery_q0418_11.htm");
myself.DeleteItem1(talker, 1622, gg.OwnItemCount(talker, 1622));
myself.GiveItem1(talker, 1623, 1);

}

}
if (ask == 418 && reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "blacksmith_silvery_q0418_08b.htm");
myself.DeleteItem1(talker, 1632, gg.OwnItemCount(talker, 1632));
myself.DeleteItem1(talker, 1636, gg.OwnItemCount(talker, 1636));
myself.DeleteItem1(talker, 1637, gg.OwnItemCount(talker, 1637));
myself.GiveItem1(talker, 1633, 1);
myself.SetFlagJournal(talker, 418, 3);
myself.ShowQuestMark(talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 418 && reply == 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1632, gg.OwnItemCount(talker, 1632));
myself.DeleteItem1(talker, 1636, gg.OwnItemCount(talker, 1636));
myself.DeleteItem1(talker, 1637, gg.OwnItemCount(talker, 1637));
myself.ShowPage(talker, "blacksmith_silvery_q0418_08c.htm");
myself.SetMemoState(talker, 418, 10);
myself.SetFlagJournal(talker, 418, 8);
myself.ShowQuestMark(talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
super;
	}


}