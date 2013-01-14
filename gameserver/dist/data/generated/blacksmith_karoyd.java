package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blacksmith_karoyd extends blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 103) == 0 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Spirit of Craftsman");

}
if (gg.HaveMemo(talker, 103) == 0 && myself.GetOneTimeQuestFlag(talker, 103) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Spirit of Craftsman (Done)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 968) >= 1 || gg.OwnItemCount(talker, 969) >= 1 || gg.OwnItemCount(talker, 970) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Spirit of Craftsman (In Progress)");

}
if (gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 974) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Spirit of Craftsman (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 0 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "blacksmith_karoyd_q0103_00.htm", 103);

} else if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "blacksmith_karoyd_q0103_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 103);
myself.ShowQuestFHTML(talker, fhtml0, 103);

} else {
myself.ShowQuestPage(talker, "blacksmith_karoyd_q0103_02.htm", 103);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 0 && myself.GetOneTimeQuestFlag(talker, 103) == 1) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 968) >= 1 || gg.OwnItemCount(talker, 969) >= 1 || gg.OwnItemCount(talker, 970) >= 1) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "blacksmith_karoyd_q0103_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 103) == 1 && gg.OwnItemCount(talker, 974) == 1 && myself.GetOneTimeQuestFlag(talker, 103) == 0) {
myself.SetCurrentQuestID(103);
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
myself.IncrementParam(talker, 0, 46663);
myself.IncrementParam(talker, 1, 3999);
myself.GiveItem1(talker, 57, 19799);
myself.ShowPage(talker, "blacksmith_karoyd_q0103_07.htm");
myself.DeleteItem1(talker, 974, 1);
myself.GiveItem1(talker, 975, 1);
myself.RemoveMemo(talker, 103);
gg.AddLog(2, talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 103, 1);

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
if (quest_id == 103) {
myself.SetCurrentQuestID(103);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "blacksmith_karoyd_q0103_05.htm", 103);
myself.GiveItem1(talker, 968, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 103);
myself.SetFlagJournal(talker, 103, 1);
gg.AddLog(1, talker, 103);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}