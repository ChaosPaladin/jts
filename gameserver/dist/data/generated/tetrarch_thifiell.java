package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tetrarch_thifiell extends dark_elf_lv1_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 106) == 0 && myself.GetOneTimeQuestFlag(talker, 106) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Forgotten Truth");

}
if (gg.HaveMemo(talker, 106) == 0 && myself.GetOneTimeQuestFlag(talker, 106) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Forgotten Truth (Done)");

}
if (gg.HaveMemo(talker, 106)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Forgotten Truth (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 4 && gg.OwnItemCount(talker, 2736)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 6 && gg.OwnItemCount(talker, 2755) && gg.OwnItemCount(talker, 2754) + gg.OwnItemCount(talker, 2753) + gg.OwnItemCount(talker, 2752) == 3) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 5) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3189)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3191)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3192)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3202)) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Fate (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 106) == 0 && myself.GetOneTimeQuestFlag(talker, 106) == 0) {
myself.SetCurrentQuestID(106);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "tetrarch_thifiell_q0106_00.htm", 106);

} else if (talker.level >= 10) {
myself.ShowQuestPage(talker, "tetrarch_thifiell_q0106_03.htm", 106);

} else {
myself.ShowQuestPage(talker, "tetrarch_thifiell_q0106_02.htm", 106);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 106) == 0 && myself.GetOneTimeQuestFlag(talker, 106) == 1) {
myself.SetCurrentQuestID(106);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 106)) {
myself.SetCurrentQuestID(106);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 984) || gg.OwnItemCount(talker, 985) && gg.OwnItemCount(talker, 988) == 0) {
myself.ShowPage(talker, "tetrarch_thifiell_q0106_06.htm");

} else if (gg.OwnItemCount(talker, 988) && myself.GetOneTimeQuestFlag(talker, 106) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 25 && myself.IsInCategory(1, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 3000);

}
myself.GiveItem1(talker, 1060, 100);
myself.GiveItem1(talker, 4414, 10);
myself.GiveItem1(talker, 4415, 10);
myself.GiveItem1(talker, 4416, 10);
myself.GiveItem1(talker, 4413, 10);
myself.GiveItem1(talker, 4412, 10);
if (myself.IsInCategory(0, talker.occupation)) {
myself.GiveItem1(talker, 1835, 1000);

} else {
myself.GiveItem1(talker, 2509, 500);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4154, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 1000000 / 100000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4154, "", "", "", "", ""));

}
myself.ShowPage(talker, "tetrarch_thifiell_q0106_07.htm");
myself.DeleteItem1(talker, 988, 1);
myself.GiveItem1(talker, 989, 1);
myself.IncrementParam(talker, 0, 24195);
myself.IncrementParam(talker, 1, 2074);
myself.GiveItem1(talker, 57, 10266);
myself.RemoveMemo(talker, 106);
gg.AddLog(2, talker, 106);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 106, 1);

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 4 && gg.OwnItemCount(talker, 2736)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tetrarch_thifiell_q0217_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 6 && gg.OwnItemCount(talker, 2755) && gg.OwnItemCount(talker, 2754) + gg.OwnItemCount(talker, 2753) + gg.OwnItemCount(talker, 2752) == 3) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tetrarch_thifiell_q0217_03.htm");
myself.GiveItem1(talker, 2740, 1);
myself.DeleteItem1(talker, 2755, gg.OwnItemCount(talker, 2755));
myself.DeleteItem1(talker, 2752, gg.OwnItemCount(talker, 2752));
myself.DeleteItem1(talker, 2754, gg.OwnItemCount(talker, 2754));
myself.DeleteItem1(talker, 2753, gg.OwnItemCount(talker, 2753));
myself.SetMemoState(talker, 217, 7);
myself.SetFlagJournal(talker, 217, 9);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 7) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tetrarch_thifiell_q0217_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 5) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tetrarch_thifiell_q0217_05.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3189)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tetrarch_thifiell_q0219_01.htm");
myself.GiveItem1(talker, 3191, 1);
myself.GiveItem1(talker, 3190, 1);
myself.DeleteItem1(talker, 3189, 1);
myself.SetFlagJournal(talker, 219, 16);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3191)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tetrarch_thifiell_q0219_02.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3192)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tetrarch_thifiell_q0219_03.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190) && gg.OwnItemCount(talker, 3202)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1365470);
myself.IncrementParam(talker, 1, 91124);
myself.GiveItem1(talker, 57, 247708);
myself.ShowPage(talker, "tetrarch_thifiell_q0219_04.htm");
myself.GiveItem1(talker, 3172, 1);
myself.DeleteItem1(talker, 3202, 1);
myself.DeleteItem1(talker, 3190, 1);
myself.RemoveMemo(talker, 219);
gg.AddLog(2, talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 219, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 55) == 0) {
if (talker.race == 0) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.race == 1) {
myself.GiveItem1(talker, 7562, 102);

} else if (talker.race == 2) {
myself.GiveItem1(talker, 7562, 98);

} else if (talker.race == 3) {
myself.GiveItem1(talker, 7562, 109);

} else if (talker.race == 4) {
myself.GiveItem1(talker, 7562, 50);

}
myself.SetOneTimeQuestFlag(talker, 55, 1);

}

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 106) {
myself.SetCurrentQuestID(106);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "tetrarch_thifiell_q0106_05.htm", 106);
myself.GiveItem1(talker, 984, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 106);
myself.SetFlagJournal(talker, 106, 1);
gg.AddLog(1, talker, 106);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 106) {
myself.SetCurrentQuestID(106);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 106) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "tetrarch_thifiell_q0106_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 106);
myself.ShowQuestFHTML(talker, fhtml0, 106);

}

}
if (ask == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 217) {
if (reply == 1 && gg.OwnItemCount(talker, 2736) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tetrarch_thifiell_q0217_02.htm");
myself.GiveItem1(talker, 2748, 1);
myself.DeleteItem1(talker, 2736, 1);
myself.SetMemoState(talker, 217, 5);
myself.SetFlagJournal(talker, 217, 5);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}