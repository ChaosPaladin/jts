package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blueprint_seller_daeger extends merchant {
protected Object[][] SellList0 = {
{"sb_summon_mechanic_golem1";10;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 60) == 0 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Good Work's Reward");

}
if (myself.GetOneTimeQuestFlag(talker, 60) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Good Work's Reward (Done)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) <= 2 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 3 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 4 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) > 4 && gg.GetMemoState(talker, 60) < 8 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 8 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 9 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Good Work's Reward (In Progress)");

}
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Good Work's Reward (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 0 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 5) {
if (myself.IsInCategory(7, talker.occupation)) {
if (talker.level >= 39) {
myself.ShowQuestPage(talker, "blueprint_seller_daeger_q0060_01.htm", 60);

} else {
myself.ShowQuestPage(talker, "blueprint_seller_daeger_q0060_03.htm", 60);

}

} else {
myself.ShowQuestPage(talker, "blueprint_seller_daeger_q0060_04.htm", 60);

}

} else {
myself.ShowQuestPage(talker, "blueprint_seller_daeger_q0060_06.htm", 60);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 60) == 1) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) <= 2 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_08.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 3 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 4 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_11.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) > 4 && gg.GetMemoState(talker, 60) < 8 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 8 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_13.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 9 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 60, 10);
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_15.htm");
myself.SetFlagJournal(talker, 60, 10);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 10 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_16.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 60) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 60) == 0 && talker >= 39 && myself.IsInCategory(7, talker.occupation) && talker.race != 5 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetMemoState(talker, 60, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "blueprint_seller_daeger_q0060_07.htm", 60);
myself.SetFlagJournal(talker, 60, 1);
myself.ShowQuestMark(talker, 60);

}
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 60) {
myself.SetCurrentQuestID(60);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 60) {
if (reply == 1) {
if (gg.HaveMemo(talker, 60) == 0 && talker.level >= 39 && myself.IsInCategory(7, talker.occupation) && talker.race != 5 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.FHTML_SetFileName(fhtml0, "blueprint_seller_daeger_q0060_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 60);
myself.ShowQuestFHTML(talker, fhtml0, 60);

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 3 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetMemoState(talker, 60, 4);
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_10.htm");
myself.SetFlagJournal(talker, 60, 4);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 60) == 1 && gg.GetMemoState(talker, 60) == 8 && myself.GetOneTimeQuestFlag(talker, 60) == 0) {
myself.SetMemoState(talker, 60, 9);
myself.ShowPage(talker, "blueprint_seller_daeger_q0060_14.htm");
myself.SetFlagJournal(talker, 60, 9);
myself.ShowQuestMark(talker, 60);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}