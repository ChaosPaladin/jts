package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentinel_kendnell extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 105) == 0 && myself.GetOneTimeQuestFlag(talker, 105) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Skirmish with the Orcs");

}
if (gg.HaveMemo(talker, 105) == 0 && myself.GetOneTimeQuestFlag(talker, 105) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Skirmish with the Orcs (Done)");

}
if (gg.HaveMemo(talker, 105)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Skirmish with the Orcs (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 105) == 0 && myself.GetOneTimeQuestFlag(talker, 105) == 0) {
myself.SetCurrentQuestID(105);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 10 && talker.race == 1) {
myself.FHTML_SetFileName(fhtml0, "sentinel_kendnell_q0105_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 105);
myself.ShowQuestFHTML(talker, fhtml0, 105);

} else if (talker.race != 1) {
myself.ShowQuestPage(talker, "sentinel_kendnell_q0105_00.htm", 105);

} else {
myself.ShowQuestPage(talker, "sentinel_kendnell_q0105_10.htm", 105);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 105) == 0 && myself.GetOneTimeQuestFlag(talker, 105) == 1) {
myself.SetCurrentQuestID(105);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 105)) {
myself.SetCurrentQuestID(105);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1844)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentinel_kendnell_q0105_06.htm");
myself.SetFlagJournal(talker, 105, 3);
myself.ShowQuestMark(talker, 105);
if (gg.OwnItemCount(talker, 1836)) {
myself.DeleteItem1(talker, 1836, 1);

}
if (gg.OwnItemCount(talker, 1837)) {
myself.DeleteItem1(talker, 1837, 1);

}
if (gg.OwnItemCount(talker, 1838)) {
myself.DeleteItem1(talker, 1838, 1);

}
if (gg.OwnItemCount(talker, 1839)) {
myself.DeleteItem1(talker, 1839, 1);

}
myself.DeleteItem1(talker, 1844, 1);
i0 = gg.Rand(100);
if (i0 < 25) {
myself.GiveItem1(talker, 1840, 1);

} else if (i0 < 50) {
myself.GiveItem1(talker, 1841, 1);

} else if (i0 < 75) {
myself.GiveItem1(talker, 1842, 1);

} else {
myself.GiveItem1(talker, 1843, 1);

}

}

} else if (gg.OwnItemCount(talker, 1836) || gg.OwnItemCount(talker, 1837) || gg.OwnItemCount(talker, 1838) || gg.OwnItemCount(talker, 1839)) {
myself.ShowPage(talker, "sentinel_kendnell_q0105_05.htm");

} else if (gg.OwnItemCount(talker, 1845)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sentinel_kendnell_q0105_08.htm");
if (gg.OwnItemCount(talker, 1840)) {
myself.DeleteItem1(talker, 1840, 1);

}
if (gg.OwnItemCount(talker, 1841)) {
myself.DeleteItem1(talker, 1841, 1);

}
if (gg.OwnItemCount(talker, 1842)) {
myself.DeleteItem1(talker, 1842, 1);

}
if (gg.OwnItemCount(talker, 1843)) {
myself.DeleteItem1(talker, 1843, 1);

}
myself.DeleteItem1(talker, 1845, 1);
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
if (myself.IsInCategory(0, talker.occupation) && myself.GetOneTimeQuestFlag(talker, 105) == 0) {
myself.GiveItem1(talker, 981, 1);

} else if (myself.GetOneTimeQuestFlag(talker, 105) == 0) {
myself.GiveItem1(talker, 754, 1);

}
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 7000);

}
if (talker.level < 25 && myself.IsInCategory(1, talker.occupation)) {
myself.GiveItem1(talker, 5790, 3000);
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);

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
myself.IncrementParam(talker, 0, 41478);
myself.IncrementParam(talker, 1, 3555);
myself.GiveItem1(talker, 57, 17599);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 105, 1);
myself.RemoveMemo(talker, 105);
gg.AddLog(2, talker, 105);

}

} else if (gg.OwnItemCount(talker, 1840) || gg.OwnItemCount(talker, 1841) || gg.OwnItemCount(talker, 1842) || gg.OwnItemCount(talker, 1843)) {
myself.ShowPage(talker, "sentinel_kendnell_q0105_07.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 105) {
myself.SetCurrentQuestID(105);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 105);
gg.AddLog(1, talker, 105);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sentinel_kendnell_q0105_03.htm", 105);
myself.SetFlagJournal(talker, 105, 1);
if (gg.OwnItemCount(talker, 1836) + gg.OwnItemCount(talker, 1837) + gg.OwnItemCount(talker, 1838) + gg.OwnItemCount(talker, 1839) == 0) {
i0 = gg.Rand(100);
if (i0 < 25) {
myself.GiveItem1(talker, 1836, 1);

} else if (i0 < 50) {
myself.GiveItem1(talker, 1837, 1);

} else if (i0 < 75) {
myself.GiveItem1(talker, 1838, 1);

} else {
myself.GiveItem1(talker, 1839, 1);

}

}

}
return;

}
super;
	}


}