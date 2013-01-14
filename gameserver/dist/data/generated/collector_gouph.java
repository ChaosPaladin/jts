package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class collector_gouph extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 108) == 0 && myself.GetOneTimeQuestFlag(talker, 108) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jumble, Tumble, Diamond Fuss");

}
if (gg.HaveMemo(talker, 108) == 0 && myself.GetOneTimeQuestFlag(talker, 108 == 1)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jumble, Tumble, Diamond Fuss (Done)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1559)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1560) || gg.OwnItemCount(talker, 1561) || gg.OwnItemCount(talker, 1562) || gg.OwnItemCount(talker, 1563)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) || gg.OwnItemCount(talker, 1567) || gg.OwnItemCount(talker, 1569) || gg.OwnItemCount(talker, 1570)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1571) && myself.GetOneTimeQuestFlag(talker, 108) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Jumble, Tumble, Diamond Fuss (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 0 && myself.GetOneTimeQuestFlag(talker, 108) == 0) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 4) {
myself.ShowQuestPage(talker, "collector_gouph_q0108_00.htm", 108);

} else if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "collector_gouph_q0108_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 108);
myself.ShowQuestFHTML(talker, fhtml0, 108);

} else {
myself.ShowQuestPage(talker, "collector_gouph_q0108_01.htm", 108);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 0 && myself.GetOneTimeQuestFlag(talker, 108 == 1)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1559)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collector_gouph_q0108_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1560) || gg.OwnItemCount(talker, 1561) || gg.OwnItemCount(talker, 1562) || gg.OwnItemCount(talker, 1563)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collector_gouph_q0108_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1566)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "collector_gouph_q0108_06.htm");
myself.SetFlagJournal(talker, 108, 8);
myself.ShowQuestMark(talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 1566, 1);
myself.GiveItem1(talker, 1567, 1);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1568) || gg.OwnItemCount(talker, 1567) || gg.OwnItemCount(talker, 1569) || gg.OwnItemCount(talker, 1570)) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "collector_gouph_q0108_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 108) == 1 && gg.OwnItemCount(talker, 1571) && myself.GetOneTimeQuestFlag(talker, 108) == 0) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 25 && myself.IsInCategory(0, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 7000);

}
if (talker.level < 25 && myself.IsInCategory(1, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5790, 3000);

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
myself.IncrementParam(talker, 0, 34565);
myself.IncrementParam(talker, 1, 2962);
myself.GiveItem1(talker, 57, 14666);
myself.GiveItem1(talker, 1060, 100);
myself.GiveItem1(talker, 4414, 10);
myself.GiveItem1(talker, 4415, 10);
myself.GiveItem1(talker, 4416, 10);
myself.GiveItem1(talker, 4413, 10);
myself.GiveItem1(talker, 4412, 10);
myself.ShowPage(talker, "collector_gouph_q0108_08.htm");
myself.GiveItem1(talker, 1511, 1);
myself.DeleteItem1(talker, 1571, 1);
myself.RemoveMemo(talker, 108);
gg.AddLog(2, talker, 108);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 108, 1);

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
if (quest_id == 108) {
myself.SetCurrentQuestID(108);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "collector_gouph_q0108_03.htm", 108);
myself.SetMemo(talker, 108);
myself.ShowQuestMark(talker, 108);
gg.AddLog(1, talker, 108);
myself.GiveItem1(talker, 1559, 1);
myself.SetFlagJournal(talker, 108, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}