package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_leikan extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 1 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) < 10 && gg.OwnItemCount(talker, 1248) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) >= 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1250) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Assassin (In Progress)");

}
if (gg.HaveMemo(talker, 327) == 0 && talker.level < 25) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Recover the Farmland");

}
if (gg.HaveMemo(talker, 327) == 0 && talker.level >= 25) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Recover the Farmland");

}
if (gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Recover the Farmland (In Progress)");

}
if (gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Recover the Farmland (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 1 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) == 0) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0411_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) == 0) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0411_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) < 10 && gg.OwnItemCount(talker, 1248) > 0) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0411_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) >= 10) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 411, 1);
myself.ShowPage(talker, "guard_leikan_q0411_07.htm");
myself.DeleteItem1(talker, 1248, gg.OwnItemCount(talker, 1248));
myself.DeleteItem1(talker, 1247, 1);
myself.SetFlagJournal(talker, 411, 5);
myself.ShowQuestMark(talker, 411);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1250) == 1) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0411_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1 && gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0 && gg.OwnItemCount(talker, 1248) == 0) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0411_09.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) == 0 && talker.level < 25) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "guard_leikan_q0327_01.htm", 327);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) == 0 && talker.level >= 25) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guard_leikan_q0327_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 327);
myself.ShowQuestFHTML(talker, fhtml0, 327);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) >= 1) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0327_04.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) == 0) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_leikan_q0327_05.htm");
myself.SetFlagJournal(talker, 327, 5);
myself.ShowQuestMark(talker, 327);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 327) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 327);
myself.GiveItem1(talker, 5012, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_leikan_q0327_03.htm", 327);
myself.SetFlagJournal(talker, 327, 2);
myself.ShowQuestMark(talker, 327);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 411) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 411) {
if (reply == 1 && gg.OwnItemCount(talker, 1246) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "guard_leikan_q0411_03.htm");
myself.GiveItem1(talker, 1247, 1);
myself.DeleteItem1(talker, 1246, 1);
myself.SetFlagJournal(talker, 411, 3);
myself.ShowQuestMark(talker, 411);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}