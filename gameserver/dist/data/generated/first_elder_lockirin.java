package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class first_elder_lockirin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 418) == 1 && gg.GetMemoState(talker, 418) == 101) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Artisan (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 14 && gg.OwnItemCount(talker, 2737)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 15) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 17) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 18) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 0 && myself.GetOneTimeQuestFlag(talker, 231) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of the Maestro");

}
if (gg.HaveMemo(talker, 231) == 0 && myself.GetOneTimeQuestFlag(talker, 231) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Maestro (Done)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) >= 1 && gg.OwnItemCount(talker, 2864) == 0 || gg.OwnItemCount(talker, 2865) == 0 || gg.OwnItemCount(talker, 2866) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2864) >= 1 && gg.OwnItemCount(talker, 2865) >= 1 && gg.OwnItemCount(talker, 2866) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3241) == 0 && gg.OwnItemCount(talker, 3246) == 0 && gg.OwnItemCount(talker, 3239) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3241) >= 1 && gg.OwnItemCount(talker, 3246) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) < 1 && gg.OwnItemCount(talker, 3466) == 0) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) >= 1 && gg.OwnItemCount(talker, 3466) == 0) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3466) >= 1) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Hunt of the Black Lion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 418) == 1 && gg.GetMemoState(talker, 418) == 101) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0418_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 14 && gg.OwnItemCount(talker, 2737)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0217_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 15) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0217_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 17) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "first_elder_lockirin_q0217_04.htm");
myself.GiveItem1(talker, 2742, 1);
myself.SetMemoState(talker, 217, 18);
myself.SetFlagJournal(talker, 217, 22);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 18) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0217_05.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 0 && myself.GetOneTimeQuestFlag(talker, 231) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 56 && talker.level >= 39) {
myself.FHTML_SetFileName(fhtml0, "first_elder_lockirin_q0231_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 231);
myself.ShowQuestFHTML(talker, fhtml0, 231);

} else if (talker.occupation == 56) {
myself.ShowPage(talker, "first_elder_lockirin_q0231_01.htm");

} else {
myself.ShowPage(talker, "first_elder_lockirin_q0231_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 0 && myself.GetOneTimeQuestFlag(talker, 231) == 1) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.GetMemoState(talker, 231) >= 1 && gg.OwnItemCount(talker, 2864) == 0 || gg.OwnItemCount(talker, 2865) == 0 || gg.OwnItemCount(talker, 2866) == 0) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0231_05.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1 && gg.OwnItemCount(talker, 2864) >= 1 && gg.OwnItemCount(talker, 2865) >= 1 && gg.OwnItemCount(talker, 2866) >= 1) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 2085244);
myself.IncrementParam(talker, 1, 141240);
myself.GiveItem1(talker, 57, 372154);
myself.ShowPage(talker, "first_elder_lockirin_q0231_06.htm");
myself.GiveItem1(talker, 2867, 1);
myself.DeleteItem1(talker, 2864, gg.OwnItemCount(talker, 2864));
myself.DeleteItem1(talker, 2865, gg.OwnItemCount(talker, 2865));
myself.DeleteItem1(talker, 2866, gg.OwnItemCount(talker, 2866));
myself.RemoveMemo(talker, 231);
gg.AddLog(2, talker, 231);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 231, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);

}

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3241) == 0 && gg.OwnItemCount(talker, 3246) == 0 && gg.OwnItemCount(talker, 3239) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0221_01.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3258) >= 1 && gg.OwnItemCount(talker, 3259) >= 1 && gg.OwnItemCount(talker, 3260) >= 1 && gg.OwnItemCount(talker, 3261) >= 1 && gg.OwnItemCount(talker, 3262) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "first_elder_lockirin_q0221_05.htm");
myself.DeleteItem1(talker, 3246, 1);
myself.GiveItem1(talker, 3241, 1);
myself.DeleteItem1(talker, 3258, gg.OwnItemCount(talker, 3258));
myself.DeleteItem1(talker, 3259, gg.OwnItemCount(talker, 3259));
myself.DeleteItem1(talker, 3260, gg.OwnItemCount(talker, 3260));
myself.DeleteItem1(talker, 3261, gg.OwnItemCount(talker, 3261));
myself.DeleteItem1(talker, 3262, gg.OwnItemCount(talker, 3262));
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (gg.OwnItemCount(talker, 3242) >= 1 && gg.OwnItemCount(talker, 3243) >= 1 && gg.OwnItemCount(talker, 3244) >= 1) {
myself.SetFlagJournal(talker, 221, 2);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else {
myself.ShowPage(talker, "first_elder_lockirin_q0221_04.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3241) >= 1 && gg.OwnItemCount(talker, 3246) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0221_06.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0221_07.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) < 1 && gg.OwnItemCount(talker, 3466) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0333_01.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3462) + gg.OwnItemCount(talker, 3463) + gg.OwnItemCount(talker, 3464) + gg.OwnItemCount(talker, 3465) >= 1 && gg.OwnItemCount(talker, 3466) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0333_02.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3466) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_elder_lockirin_q0333_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 231) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 231) == 0 && myself.GetOneTimeQuestFlag(talker, 231) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 56 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 231);
myself.SetFlagJournal(talker, 231, 1);
myself.ShowQuestMark(talker, 231);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 231, 1);
talker.flag = 0;
if (myself.GetOneTimeQuestFlag(talker, 56) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 104);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 122);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 60);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 64);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 72);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 92);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 82);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 23);

}
myself.SetOneTimeQuestFlag(talker, 56, 1);
myself.ShowQuestPage(talker, "first_elder_lockirin_q0231_04a.htm", 231);

} else {
myself.ShowQuestPage(talker, "first_elder_lockirin_q0231_04.htm", 231);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 418) {
myself.SetCurrentQuestID(418);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 418) {
if (reply == 1 && gg.HaveMemo(talker, 418) == 1 && gg.GetMemoState(talker, 418) == 101) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1635, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 160267);
myself.IncrementParam(talker, 1, 11726);
myself.GiveItem1(talker, 57, 81900);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 228064);
myself.IncrementParam(talker, 1, 15075);
myself.GiveItem1(talker, 57, 81900);

} else {
myself.IncrementParam(talker, 0, 295862);
myself.IncrementParam(talker, 1, 18424);
myself.GiveItem1(talker, 57, 81900);

}

}
myself.RemoveMemo(talker, 418);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
gg.AddLog(2, talker, 418);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "first_elder_lockirin_q0418_05.htm");

}

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
if (reply == 1 && gg.OwnItemCount(talker, 2737) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "first_elder_lockirin_q0217_02.htm");
myself.GiveItem1(talker, 2759, 1);
myself.DeleteItem1(talker, 2737, 1);
myself.SetMemoState(talker, 217, 15);
myself.SetFlagJournal(talker, 217, 18);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
myself.ShowPage(talker, "first_elder_lockirin_q0221_02.htm");

}
if (reply == 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "first_elder_lockirin_q0221_03.htm");
myself.GiveItem1(talker, 3246, 1);
myself.GiveItem1(talker, 3247, 1);
myself.GiveItem1(talker, 3248, 1);
myself.GiveItem1(talker, 3249, 1);
myself.GiveItem1(talker, 3250, 1);
myself.GiveItem1(talker, 3251, 1);

}

}

}
if (ask == 333) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 333) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3466) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 30000);
myself.DeleteItem1(talker, 3466, 1);
myself.ShowPage(talker, "first_elder_lockirin_q0333_04.htm");
gg.AddLog(3, talker, 333);

}

}

}
if (reply == 2) {
myself.ShowPage(talker, "first_elder_lockirin_q0333_05.htm");

}

}
super;
	}


}