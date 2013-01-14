package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class roien extends citizen {
	protected void TALKED(HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.OwnItemCount(talker, 1067) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fighter's Tutorial");

}
if (gg.OwnItemCount(talker, 1067) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fighter's Tutorial");

}
if (gg.OwnItemCount(talker, 1067) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Fighter's Tutorial");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1067) > 0) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roien001.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1067) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roien004.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1067) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roien003.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 101) == 0 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sword of Solidarity");

}
if (gg.HaveMemo(talker, 101) == 0 && myself.GetOneTimeQuestFlag(talker, 101) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sword of Solidarity (Done)");

}
if (gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 796) == 1 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sword of Solidarity (In Progress)");

}
if (gg.HaveMemo(talker, 101) == 1 && myself.GetOneTimeQuestFlag(talker, 101) == 0 && gg.OwnItemCount(talker, 796) == 0 && gg.OwnItemCount(talker, 742) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sword of Solidarity (In Progress)");

}
if (gg.HaveMemo(talker, 101) == 1 && myself.GetOneTimeQuestFlag(talker, 101) == 0 && gg.OwnItemCount(talker, 796) == 0 && gg.OwnItemCount(talker, 742)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sword of Solidarity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 0 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 0) {
myself.ShowQuestPage(talker, "roien_q0101_00.htm", 101);

} else if (talker.level >= 9) {
myself.FHTML_SetFileName(fhtml0, "roien_q0101_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 101);
myself.ShowQuestFHTML(talker, fhtml0, 101);

} else {
myself.ShowQuestPage(talker, "roien_q0101_08.htm", 101);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 0 && myself.GetOneTimeQuestFlag(talker, 101) == 1) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && gg.OwnItemCount(talker, 796) == 1 && myself.GetOneTimeQuestFlag(talker, 101) == 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "roien_q0101_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && myself.GetOneTimeQuestFlag(talker, 101) == 0 && gg.OwnItemCount(talker, 796) == 0 && gg.OwnItemCount(talker, 742) == 0) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 741) && gg.OwnItemCount(talker, 740)) {
myself.ShowPage(talker, "roien_q0101_12.htm");

} else if (gg.OwnItemCount(talker, 741) && gg.OwnItemCount(talker, 740) == 0) {
myself.ShowPage(talker, "roien_q0101_11.htm");

} else if (gg.OwnItemCount(talker, 741) == 0 && gg.OwnItemCount(talker, 740)) {
myself.ShowPage(talker, "roien_q0101_11.htm");

} else if (gg.OwnItemCount(talker, 739) > 0) {
myself.ShowPage(talker, "roien_q0101_07.htm");

} else if (gg.OwnItemCount(talker, 937) == 1 && gg.OwnItemCount(talker, 741) == 0 && gg.OwnItemCount(talker, 740) == 0) {
myself.ShowPage(talker, "roien_q0101_10.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 101) == 1 && myself.GetOneTimeQuestFlag(talker, 101) == 0 && gg.OwnItemCount(talker, 796) == 0 && gg.OwnItemCount(talker, 742)) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 742)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "roien_q0101_06.htm");
myself.DeleteItem1(talker, 742, gg.OwnItemCount(talker, 742));
myself.GiveItem1(talker, 739, 1);
myself.SetFlagJournal(talker, 101, 5);
myself.ShowQuestMark(talker, 101);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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
if (quest_id == 101) {
myself.SetCurrentQuestID(101);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "roien_q0101_04.htm", 101);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 796, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 101);
myself.SetFlagJournal(talker, 101, 1);
gg.AddLog(1, talker, 101);

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(201);
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
if (ask == 201) {
myself.SetCurrentQuestID(201);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 31 && gg.OwnItemCount(talker, 1067) > 0) {
if (myself.IsInCategory(0, talker.occupation) && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.GiveItem1(talker, 5789, 200);
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.IncrementParam(talker, 1, 50);
myself.SetMemoStateEx(talker, 255, 1, 4);

}
if (myself.IsInCategory(1, talker.occupation) && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
if (talker.occupation == 49) {
myself.GiveItem1(talker, 5789, 200);
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);

} else {
myself.GiveItem1(talker, 5790, 100);
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);

}
myself.IncrementParam(talker, 1, 50);
myself.SetMemoStateEx(talker, 255, 1, 4);

}
myself.ShowPage(talker, "roien002.htm");
myself.DeleteItem1(talker, 1067, 1);
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 60);

}
if (reply == 41) {
myself.ShowPage(talker, "roien005.htm");
myself.InstantTeleport(talker, -120050, 44500, 360);
myself.ShowRadar(talker, -119692, 44504, 380, 1);

}
if (reply == 42) {
myself.ShowPage(talker, "roien006.htm");
myself.ShowRadar(talker, -84081, 243277, -3723, 1);

}

}
super;
	}


}