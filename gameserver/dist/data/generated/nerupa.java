package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class nerupa extends citizen {
	protected void TALKED(HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.OwnItemCount(talker, 1069) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Elf's Tutorial");

}
if (gg.OwnItemCount(talker, 1069) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Elf's Tutorial");

}
if (gg.OwnItemCount(talker, 1069) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Elf's Tutorial");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1069) > 0) {
myself.SetCurrentQuestID(203);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nerupa001.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1069) == 0 && gg.GetMemoStateEx(talker, 255, 1) > 3) {
myself.SetCurrentQuestID(203);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nerupa004.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.OwnItemCount(talker, 1069) == 0 && gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetCurrentQuestID(203);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nerupa003.htm");

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
if (gg.HaveMemo(talker, 160) == 0 && myself.GetOneTimeQuestFlag(talker, 160) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Nerupa's Request");

}
if (gg.HaveMemo(talker, 160) == 0 && myself.GetOneTimeQuestFlag(talker, 160) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Nerupa's Request (Done)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1026) != 0 || gg.OwnItemCount(talker, 1027) != 0 || gg.OwnItemCount(talker, 1028) != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0 && myself.GetOneTimeQuestFlag(talker, 160) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Nerupa's Request (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) == 0 && myself.GetOneTimeQuestFlag(talker, 160) == 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1) {
myself.ShowQuestPage(talker, "nerupa_q0311_00.htm", 160);

} else if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "nerupa_q0311_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 160);
myself.ShowQuestFHTML(talker, fhtml0, 160);

} else {
myself.ShowQuestPage(talker, "nerupa_q0311_02.htm", 160);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) == 0 && myself.GetOneTimeQuestFlag(talker, 160) == 1) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "finishedquest.htm", 160);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1026) != 0 || gg.OwnItemCount(talker, 1027) != 0 || gg.OwnItemCount(talker, 1028) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "nerupa_q0311_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0 && myself.GetOneTimeQuestFlag(talker, 160) == 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1029, gg.OwnItemCount(talker, 1029));
myself.RemoveMemo(talker, 160);
gg.AddLog(2, talker, 160);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 160, 1);
myself.GiveItem1(talker, 1060, 5);
myself.IncrementParam(talker, 0, 1000);
myself.ShowPage(talker, "nerupa_q0311_06.htm");

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
if (quest_id == 160) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 160);
gg.AddLog(1, talker, 160);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1026) == 0) {
myself.GiveItem1(talker, 1026, 1);

}
myself.ShowQuestPage(talker, "nerupa_q0311_04.htm", 160);
myself.SetFlagJournal(talker, 160, 1);

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(203);
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
if (ask == 203) {
myself.SetCurrentQuestID(203);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 420) {
if (reply == 31 && gg.OwnItemCount(talker, 1069) > 0) {
if (myself.IsInCategory(0, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 200) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);
myself.IncrementParam(talker, 1, 50);

}
if (myself.IsInCategory(1, talker.occupation) && gg.OwnItemCount(talker, 5789) <= 200 && gg.OwnItemCount(talker, 5790) <= 100) {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 100);
myself.IncrementParam(talker, 1, 50);

}
myself.ShowPage(talker, "nerupa002.htm");
myself.DeleteItem1(talker, 1069, 1);
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 60);
if (gg.GetMemoStateEx(talker, 255, 1) <= 3) {
myself.SetMemoStateEx(talker, 255, 1, 4);

}

}
if (reply == 41) {
myself.ShowPage(talker, "nerupa005.htm");
myself.InstantTeleport(talker, -120050, 44500, 360);
myself.ShowRadar(talker, -119692, 44504, 380, 1);

}
if (reply == 42) {
myself.ShowPage(talker, "nerupa006.htm");
myself.ShowRadar(talker, 45475, 48359, -3060, 1);

}

}
super;
	}


}