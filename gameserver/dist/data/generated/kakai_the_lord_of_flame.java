package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kakai_the_lord_of_flame extends orc_lv1_master {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 9 && gg.OwnItemCount(talker, 2738)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 13) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 14) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Trust (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3237) == 0 && gg.OwnItemCount(talker, 3220) || gg.OwnItemCount(talker, 3235)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3237)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 0 && myself.GetOneTimeQuestFlag(talker, 232) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Lord");

}
if (gg.HaveMemo(talker, 232) == 0 && myself.GetOneTimeQuestFlag(talker, 232) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Test of the Lord (Done)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3412) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3413) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Test of the Lord (In Progress)");

}
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3416) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 9 && gg.OwnItemCount(talker, 2738)) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0217_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 10) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0217_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 13) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0217_04.htm");
myself.GiveItem1(talker, 2743, 1);
myself.DeleteItem1(talker, 2758, gg.OwnItemCount(talker, 2758));
myself.SetMemoState(talker, 217, 14);
myself.SetFlagJournal(talker, 217, 17);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 217) == 1 && gg.GetMemoState(talker, 217) == 14) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0217_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3237) == 0 && gg.OwnItemCount(talker, 3220) || gg.OwnItemCount(talker, 3235)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0220_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3237)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1448226);
myself.IncrementParam(talker, 1, 96648);
myself.GiveItem1(talker, 57, 262720);
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0220_02.htm");
myself.GiveItem1(talker, 3203, 1);
myself.DeleteItem1(talker, 3237, 1);
myself.RemoveMemo(talker, 220);
gg.AddLog(2, talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 220, 1);
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
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 0 && myself.GetOneTimeQuestFlag(talker, 232) == 0) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_01.htm");

} else if (talker.occupation != 50) {
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_02.htm");

} else if (talker.level < 39) {
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_03.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "kakai_the_lord_of_flame_q0232_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 232);
myself.ShowQuestFHTML(talker, fhtml0, 232);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 0 && myself.GetOneTimeQuestFlag(talker, 232) == 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3391) == 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3400) >= 1 && gg.OwnItemCount(talker, 3404) >= 1 && gg.OwnItemCount(talker, 3406) >= 1 && gg.OwnItemCount(talker, 3411) >= 1 && gg.OwnItemCount(talker, 3409) >= 1) {
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_07.htm");

} else {
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_06.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3412) == 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_09.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3413) == 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_10.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3416) == 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 894888);
myself.IncrementParam(talker, 1, 61408);
myself.GiveItem1(talker, 57, 161806);
myself.DeleteItem1(talker, 3416, 1);
myself.GiveItem1(talker, 3390, 1);
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_11.htm");
myself.RemoveMemo(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 232, 1);
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

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 232) == 0 && myself.GetOneTimeQuestFlag(talker, 232) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 50 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SetFlagJournal(talker, 232, 1);
myself.ShowQuestMark(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 3391, 1);
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
myself.ShowQuestPage(talker, "kakai_the_lord_of_flame_q0232_05b.htm", 232);

} else {
myself.ShowQuestPage(talker, "kakai_the_lord_of_flame_q0232_05.htm", 232);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 217) {
myself.SetCurrentQuestID(217);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 217) {
if (reply == 1 && gg.OwnItemCount(talker, 2738) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0217_02.htm");
myself.GiveItem1(talker, 2757, 1);
myself.DeleteItem1(talker, 2738, 1);
myself.SetMemoState(talker, 217, 10);
myself.SetFlagJournal(talker, 217, 13);
myself.ShowQuestMark(talker, 217);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 232) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3400) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "kakai_the_lord_of_flame_q0232_08.htm");
myself.SetFlagJournal(talker, 232, 3);
myself.ShowQuestMark(talker, 232);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 3404, gg.OwnItemCount(talker, 3404));
myself.DeleteItem1(talker, 3406, gg.OwnItemCount(talker, 3406));
myself.DeleteItem1(talker, 3411, gg.OwnItemCount(talker, 3411));
myself.DeleteItem1(talker, 3409, gg.OwnItemCount(talker, 3409));
myself.DeleteItem1(talker, 3391, gg.OwnItemCount(talker, 3391));
myself.DeleteItem1(talker, 3400, 1);
myself.GiveItem1(talker, 3412, 1);

}

}

}

}
super;
	}


}