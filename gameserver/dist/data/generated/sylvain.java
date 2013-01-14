package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sylvain extends human_elf_mage_lv2_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) == 1 && gg.OwnItemCount(talker, 2689) == 0 && gg.OwnItemCount(talker, 2693) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2688) == 0 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2675) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2688) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2693) >= 1 && gg.OwnItemCount(talker, 2689) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) >= 1 || gg.OwnItemCount(talker, 2677) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 137) == 0 && myself.GetOneTimeQuestFlag(talker, 137) < 1 && myself.GetOneTimeQuestFlag(talker, 135) >= 1 && myself.GetOneTimeQuestFlag(talker, 134) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Temple Champion - 1");

}
if (gg.HaveMemo(talker, 137) == 0 && myself.GetOneTimeQuestFlag(talker, 137) < 1 && myself.GetOneTimeQuestFlag(talker, 135) < 1 || myself.GetOneTimeQuestFlag(talker, 134) < 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Temple Champion - 1");

}
if (myself.GetOneTimeQuestFlag(talker, 137) >= 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Temple Champion - 1 (Done)");

}
if (gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Temple Champion - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 2) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Temple Champion - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 3) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Temple Champion - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 5) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Temple Champion - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 6) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Temple Champion - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 7) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Temple Champion - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) < 1 && myself.GetOneTimeQuestFlag(talker, 137) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Temple Champion - 2");

}
if (myself.GetOneTimeQuestFlag(talker, 138) >= 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Temple Champion - 2 (Done)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) < 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 1 && gg.GetMemoState(talker, 138) < 13 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 13 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Temple Champion - 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) == 1 && gg.OwnItemCount(talker, 2689) == 0 && gg.OwnItemCount(talker, 2693) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2688) == 0 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2675) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0214_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2688) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sylvain_q0214_04.htm");
myself.SetFlagJournal(talker, 214, 14);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2693, 1);
myself.DeleteItem1(talker, 2689, gg.OwnItemCount(talker, 2689));
myself.DeleteItem1(talker, 2688, gg.OwnItemCount(talker, 2688));

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2693) >= 1 && gg.OwnItemCount(talker, 2689) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0214_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) >= 1 || gg.OwnItemCount(talker, 2677) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0214_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 0 && myself.GetOneTimeQuestFlag(talker, 137) < 1 && myself.GetOneTimeQuestFlag(talker, 135) >= 1 && myself.GetOneTimeQuestFlag(talker, 134) >= 1) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 35) {
myself.FHTML_SetFileName(fhtml0, "sylvain_q0137_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 137);
myself.ShowQuestFHTML(talker, fhtml0, 137);

} else {
myself.ShowQuestPage(talker, "sylvain_q0137_02.htm", 137);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 0 && myself.GetOneTimeQuestFlag(talker, 137) < 1 && myself.GetOneTimeQuestFlag(talker, 135) < 1 || myself.GetOneTimeQuestFlag(talker, 134) < 1) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "sylvain_q0137_03.htm", 137);

}
break;

}
case 7: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 137) >= 1) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 1) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0137_06.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 2) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0137_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 3) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0137_11.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 5) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 10340) >= 30) {
myself.DeleteItem1(talker, 10340, gg.OwnItemCount(talker, 10340));
myself.SetMemoState(talker, 137, 6);
myself.ShowPage(talker, "sylvain_q0137_15.htm");

} else {
myself.ShowPage(talker, "sylvain_q0137_14.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 6) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0137_17.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 137) == 1 && gg.GetMemoState(talker, 137) == 7) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0137_20.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) < 1 && myself.GetOneTimeQuestFlag(talker, 137) >= 1) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 36) {
myself.FHTML_SetFileName(fhtml0, "sylvain_q0138_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 138);
myself.ShowQuestFHTML(talker, fhtml0, 138);

} else {
myself.ShowQuestPage(talker, "sylvain_q0138_02.htm", 138);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 15: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 138) >= 1) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) < 1) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0138_05.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 1 && gg.GetMemoState(talker, 138) < 13 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0138_07.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 13 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sylvain_q0138_08.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 137) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (gg.HaveMemo(talker, 137) == 0 && myself.GetOneTimeQuestFlag(talker, 137) < 1 && myself.GetOneTimeQuestFlag(talker, 135) >= 1 && myself.GetOneTimeQuestFlag(talker, 134) >= 1 && talker.level >= 35) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 137, 1);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sylvain_q0137_04.htm", 137);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 137, 1);
myself.ShowQuestMark(talker, 137);

}

}
return;

}
if (quest_id == 138) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (gg.HaveMemo(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) < 1 && myself.GetOneTimeQuestFlag(talker, 137) >= 1 && talker.level >= 36) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 10341, 1);
myself.SetMemoState(talker, 138, 0);
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sylvain_q0138_04.htm", 138);
gg.AddLog(1, talker, quest_id);
myself.SetFlagJournal(talker, 138, 1);
myself.ShowQuestMark(talker, 138);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sylvain_q0214_02.htm");
myself.GiveItem1(talker, 2689, 1);
myself.GiveItem1(talker, 2692, 1);
myself.SetFlagJournal(talker, 214, 2);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 137) {
myself.SetCurrentQuestID(137);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 137) {
if (reply == 1) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 1) {
myself.ShowPage(talker, "sylvain_q0137_05.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) >= 1) {
myself.ShowPage(talker, "sylvain_q0137_07.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 1) {
myself.SetMemoState(talker, 137, 2);
myself.ShowPage(talker, "sylvain_q0137_08.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 2) {
myself.SetMemoState(talker, 137, 3);
myself.ShowPage(talker, "sylvain_q0137_10.htm");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 3) {
myself.ShowPage(talker, "sylvain_q0137_12.htm");

}

}
if (reply == 7) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 3) {
myself.SetMemoState(talker, 137, 5);
myself.ShowPage(talker, "sylvain_q0137_13.htm");
myself.SetFlagJournal(talker, 137, 2);
myself.ShowQuestMark(talker, 137);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 8) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 6) {
myself.ShowPage(talker, "sylvain_q0137_16.htm");

}

}
if (reply == 9) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 6) {
myself.ShowPage(talker, "sylvain_q0137_18.htm");

}

}
if (reply == 10) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 6) {
myself.SetMemoState(talker, 137, 7);
myself.ShowPage(talker, "sylvain_q0137_19.htm");

}

}
if (reply == 11) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 7) {
myself.ShowPage(talker, "sylvain_q0137_21.htm");

}

}
if (reply == 12) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 7) {
myself.ShowPage(talker, "sylvain_q0137_22.htm");

}

}
if (reply == 13) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 7) {
myself.ShowPage(talker, "sylvain_q0137_23.htm");

}

}
if (reply == 14) {
if (gg.HaveMemo(talker, 137) >= 1 && gg.GetMemoState(talker, 137) == 7) {
myself.DeleteItem1(talker, 10334, gg.OwnItemCount(talker, 10334));
myself.DeleteItem1(talker, 10339, gg.OwnItemCount(talker, 10339));
myself.RemoveMemo(talker, 137);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sylvain_q0137_24.htm");
gg.AddLog(2, talker, 137);
myself.SetOneTimeQuestFlag(talker, 137, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 41) {
myself.GiveItem1(talker, 57, 69146);
myself.IncrementParam(talker, 0, 219975);
myself.IncrementParam(talker, 1, 13047);

} else {
myself.GiveItem1(talker, 57, 69146);

}
gg.AddLog(3, talker, 137);

}

}

}

}
if (ask == 138) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 138) {
if (reply == 1) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetMemoState(talker, 138, 1);
myself.ShowPage(talker, "sylvain_q0138_06.htm");
myself.SetFlagJournal(talker, 138, 2);
myself.ShowQuestMark(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 13 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.RemoveMemo(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "sylvain_q0138_09.htm");
gg.AddLog(2, talker, 138);
myself.SetOneTimeQuestFlag(talker, 138, 1);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 42) {
myself.GiveItem1(talker, 57, 84593);
myself.IncrementParam(talker, 0, 187062);
myself.IncrementParam(talker, 1, 11307);

} else {
myself.GiveItem1(talker, 57, 84593);

}
gg.AddLog(3, talker, 138);

}

}

}

}
super;
	}


}