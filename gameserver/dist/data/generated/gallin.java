package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gallin extends citizen {
	protected void TALKED(HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.OwnItemCount(talker, 1068) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Mystic's Tutorial (In Progress)");

}
if (gg.OwnItemCount(talker, 1068) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Mystic's Tutorial (In Progress)");

}
if (gg.OwnItemCount(talker, 1068) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Mystic's Tutorial (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1068) > 0) {
myself.SetCurrentQuestID(202);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gallin001.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1068) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
myself.SetCurrentQuestID(202);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gallin004.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1068) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetCurrentQuestID(202);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gallin003.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 104) == 0 && myself.GetOneTimeQuestFlag(talker, 104) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Spirit of Mirrors");

}
if (gg.HaveMemo(talker, 104) == 0 && myself.GetOneTimeQuestFlag(talker, 104) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Spirit of Mirrors (Done)");

}
if (gg.HaveMemo(talker, 104) && gg.OwnItemCount(talker, 748) >= 1 && gg.OwnItemCount(talker, 1135) == 1 && gg.OwnItemCount(talker, 1136) == 1 && gg.OwnItemCount(talker, 1137) == 1 == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Spirit of Mirrors (In Progress)");

}
if (gg.HaveMemo(talker, 104) && gg.OwnItemCount(talker, 1135) == 1 && gg.OwnItemCount(talker, 1136) == 1 && gg.OwnItemCount(talker, 1137) == 1 && myself.GetOneTimeQuestFlag(talker, 104) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Spirit of Mirrors (In Progress)");

}
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1200) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Cleric (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 104) == 0 && myself.GetOneTimeQuestFlag(talker, 104) == 0) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 0) {
myself.ShowQuestPage(talker, "gallin_q0104_00.htm", 104);

} else if (talker.level >= 10) {
myself.FHTML_SetFileName(fhtml0, "gallin_q0104_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 104);
myself.ShowQuestFHTML(talker, fhtml0, 104);

} else {
myself.ShowQuestPage(talker, "gallin_q0104_06.htm", 104);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 104) == 0 && myself.GetOneTimeQuestFlag(talker, 104) == 1) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 104) && gg.OwnItemCount(talker, 748) >= 1 && gg.OwnItemCount(talker, 1135) == 1 && gg.OwnItemCount(talker, 1136) == 1 && gg.OwnItemCount(talker, 1137) == 1 == 0) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gallin_q0104_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 104) && gg.OwnItemCount(talker, 1135) == 1 && gg.OwnItemCount(talker, 1136) == 1 && gg.OwnItemCount(talker, 1137) == 1 && myself.GetOneTimeQuestFlag(talker, 104) == 0) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (talker.level < 25 && myself.IsInCategory(1, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 3000);

}
myself.IncrementParam(talker, 0, 39750);
myself.IncrementParam(talker, 1, 3407);
myself.GiveItem1(talker, 57, 16866);
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
myself.DeleteItem1(talker, 1135, 1);
myself.DeleteItem1(talker, 1136, 1);
myself.DeleteItem1(talker, 1137, 1);
myself.GiveItem1(talker, 747, 1);
myself.ShowPage(talker, "gallin_q0104_05.htm");
myself.RemoveMemo(talker, 104);
gg.AddLog(2, talker, 104);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.SetOneTimeQuestFlag(talker, 104, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1200) == 0) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1193) == 1 && gg.OwnItemCount(talker, 1197) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gallin_q0405_01.htm");
myself.DeleteItem1(talker, 1193, 1);
myself.GiveItem1(talker, 1197, 1);
myself.SetFlagJournal(talker, 405, 5);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1193) == 0 && gg.OwnItemCount(talker, 1197) == 1) {
myself.ShowPage(talker, "gallin_q0405_02.htm");

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
if (quest_id == 104) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 104);
gg.AddLog(1, talker, 104);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 748, 1);
myself.GiveItem1(talker, 748, 1);
myself.GiveItem1(talker, 748, 1);
myself.ShowQuestPage(talker, "gallin_q0104_03.htm", 104);
myself.SetFlagJournal(talker, 104, 1);

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(202);
if (timer_id <= 1000000) {
return;

}
talker = gg.GetCreatureFromIndex(timer_id - 1000000);
if (myself.IsNullCreature(talker) == 0) {
if (talker.alive == 0 || talker.is_pc == 0) {
return;

}
if (gg.GetMemoStateEx(talker, 255, 1) >= 4 && timer_id >= 1000000) {
myself.ShowQuestionMark(talker, 7);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.VoiceEffect(talker, "tutorial_voice_025", 1000);

}

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 202) {
myself.SetCurrentQuestID(202);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 31 && gg.OwnItemCount(talker, 1068) > 0) {
if (myself.IsInCategory(0, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 200) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);
myself.IncrementParam(talker, 1, 50);

}
if (myself.IsInCategory(1, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 200 && gg.OwnItemCount(talker, 5790) <= 100) {
if (talker.occupation == 49) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);

} else {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 100);

}
myself.IncrementParam(talker, 1, 50);

}
myself.ShowPage(talker, "gallin002.htm");
myself.DeleteItem1(talker, 1068, 1);
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 60);
if (gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetMemoStateEx(talker, 255, 1, 4);

}

}
if (reply == 41) {
myself.ShowPage(talker, "gallin005.htm");
myself.InstantTeleport(talker, -120050, 44500, 360);
myself.ShowRadar(talker, -119692, 44504, 380, 1);

}
if (reply == 42) {
myself.ShowPage(talker, "gallin006.htm");
myself.ShowRadar(talker, -84081, 243277, -3723, 1);

}

}
super;
	}


}