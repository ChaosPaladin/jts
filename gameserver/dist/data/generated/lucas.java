package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lucas extends inzone_raid_controller {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2679) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2680) >= 1 || gg.OwnItemCount(talker, 2683) >= 1 || gg.OwnItemCount(talker, 2682) >= 1 || gg.OwnItemCount(talker, 2684) >= 1 || gg.OwnItemCount(talker, 2681) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2685) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2686) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2693) >= 1 || gg.OwnItemCount(talker, 2676) >= 1 || gg.OwnItemCount(talker, 2677) >= 1 || gg.OwnItemCount(talker, 2688) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Certified Soul Breaker (In Progress)");

}
if (gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Mutated Kaneus - Dion");

}
if (gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Mutated Kaneus - Dion (Done)");

}
if (gg.HaveMemo(talker, 10277) == 1 && gg.GetMemoState(talker, 10277) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Mutated Kaneus - Dion (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2679) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lucas_q0214_01.htm");
myself.SetFlagJournal(talker, 214, 4);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2679, 1);
myself.GiveItem1(talker, 2681, 1);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2680) >= 1 || gg.OwnItemCount(talker, 2683) >= 1 || gg.OwnItemCount(talker, 2682) >= 1 || gg.OwnItemCount(talker, 2684) >= 1 || gg.OwnItemCount(talker, 2681) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lucas_q0214_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2685) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lucas_q0214_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) >= 1 && gg.OwnItemCount(talker, 2689) >= 1 && gg.OwnItemCount(talker, 2686) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2687) < 5) {
myself.ShowPage(talker, "lucas_q0214_05.htm");

} else {
myself.ShowPage(talker, "lucas_q0214_06.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2693) >= 1 || gg.OwnItemCount(talker, 2676) >= 1 || gg.OwnItemCount(talker, 2677) >= 1 || gg.OwnItemCount(talker, 2688) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lucas_q0214_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lucas_q0065_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 8) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lucas_q0065_03.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 0) {
myself.SetCurrentQuestID(10277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 28) {
myself.ShowQuestPage(talker, "lucas_q10277_01.htm", 10277);

} else {
myself.ShowQuestPage(talker, "lucas_q10277_04.htm", 10277);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 1) {
myself.SetCurrentQuestID(10277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lucas_q10277_02.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10277) == 1 && gg.GetMemoState(talker, 10277) == 1) {
myself.SetCurrentQuestID(10277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13832) >= 1 && gg.OwnItemCount(talker, 13833) >= 1) {
myself.ShowPage(talker, "lucas_q10277_07.htm");

} else {
myself.ShowPage(talker, "lucas_q10277_06.htm");

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
if (quest_id == 10277) {
myself.SetCurrentQuestID(10277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 10277) == 0 && talker.level >= 28 && myself.GetOneTimeQuestFlag(talker, 10277) == 0) {
myself.SetMemoState(talker, 10277, 1);
myself.SetMemoState(talker, 10277, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowPage(talker, "lucas_q10277_05.htm");
myself.SetFlagJournal(talker, 10277, 1);
myself.ShowQuestMark(talker, 10277);
gg.AddLog(1, talker, 10277);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2685) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "lucas_q0214_04.htm");
myself.SetFlagJournal(talker, 214, 10);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2685, 1);
myself.GiveItem1(talker, 2686, 1);

}

}

}

}
if (ask == 65) {
myself.SetCurrentQuestID(65);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 65) {
if (reply == 1 && gg.HaveMemo(talker, 65) == 1 && myself.GetOneTimeQuestFlag(talker, 65) == 0 && gg.GetMemoState(talker, 65) == 7) {
myself.SetMemoState(talker, 65, 8);
myself.ShowPage(talker, "lucas_q0065_02.htm");
myself.SetFlagJournal(talker, 65, 8);
myself.ShowQuestMark(talker, 65);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 10277) {
myself.SetCurrentQuestID(10277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10277) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 0) {
if (talker.level >= 28) {
myself.FHTML_SetFileName(fhtml0, "lucas_q10277_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10277);
myself.ShowQuestFHTML(talker, fhtml0, 10277);

}

}

}

}
super;
	}


}