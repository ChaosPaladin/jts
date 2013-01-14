package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_kaspar extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 1 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) < 30 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) >= 30) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) >= 30 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) >= 30) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) < 30 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) > 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) >= 9) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Fate's Whisper (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_kaspar_q0234_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_kaspar_q0234_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 1 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4671, 1);
myself.DeleteItem1(talker, 4673, 1);
myself.SetMemoState(talker, 234, 9);
myself.ShowPage(talker, "master_kaspar_q0234_04.htm");
myself.SetFlagJournal(talker, 234, 10);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) < 30 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) >= 30) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_kaspar_q0234_03c.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) >= 30 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) >= 30) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4671, 1);
myself.DeleteItem1(talker, 14361, gg.OwnItemCount(talker, 14361));
myself.SetMemoState(talker, 234, 9);
myself.ShowPage(talker, "master_kaspar_q0234_03d.htm");
myself.SetFlagJournal(talker, 234, 10);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 8 && gg.OwnItemCount(talker, 4673) == 0 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) < 30 && gg.OwnItemCount(talker, 14361) + gg.OwnItemCount(talker, 14362) > 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_kaspar_q0234_03e.htm");
myself.GiveItem1(talker, 14362, 30 - gg.OwnItemCount(talker, 14362));
myself.DeleteItem1(talker, 14361, gg.OwnItemCount(talker, 14361));

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) >= 9) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_kaspar_q0234_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 234) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 234) {
if (reply == 1) {
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
myself.ShowPage(talker, "master_kaspar_q0234_02.htm");

}

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4665, 1);
myself.SetMemoState(talker, 234, 8);
myself.ShowPage(talker, "master_kaspar_q0234_03a.htm");
myself.SetFlagJournal(talker, 234, 7);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 7) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 14362, 30);
myself.SetMemoState(talker, 234, 8);
myself.ShowPage(talker, "master_kaspar_q0234_03b.htm");
myself.SetFlagJournal(talker, 234, 8);
myself.ShowQuestMark(talker, 234);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}