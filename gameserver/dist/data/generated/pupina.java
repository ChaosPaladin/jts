package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pupina extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 227) == 0 && myself.GetOneTimeQuestFlag(talker, 227) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Reformer");

}
if (gg.HaveMemo(talker, 227) == 0 && myself.GetOneTimeQuestFlag(talker, 227) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Reformer (Done)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.OwnItemCount(talker, 2832) >= 1 && gg.GetMemoState(talker, 227) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) >= 1 && gg.GetMemoState(talker, 227) < 3) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) >= 4) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 1 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 2 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 3 && gg.GetMemoState(talker, 138) < 7 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 7 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 8 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Temple Champion - 2 (In Progress)");

}
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 9 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Temple Champion - 2 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 0 && myself.GetOneTimeQuestFlag(talker, 227) == 0) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 15 || talker.occupation == 42) {
if (talker.level >= 39) {
myself.FHTML_SetFileName(fhtml0, "pupina_q0227_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 227);
myself.ShowQuestFHTML(talker, fhtml0, 227);

} else {
myself.ShowPage(talker, "pupina_q0227_01.htm");

}

} else {
myself.ShowPage(talker, "pupina_q0227_02.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 0 && myself.GetOneTimeQuestFlag(talker, 227) == 1) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.OwnItemCount(talker, 2832) >= 1 && gg.GetMemoState(talker, 227) == 3) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0227_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) >= 1 && gg.GetMemoState(talker, 227) < 3) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0227_04a.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) >= 4) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0227_07.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 0 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0138_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 1 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0138_02.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 2 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0138_05.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 3 && gg.GetMemoState(talker, 138) < 7 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0138_09.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 7 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 10343, gg.OwnItemCount(talker, 10343));
myself.SetMemoState(talker, 138, 8);
myself.ShowPage(talker, "pupina_q0138_10.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 8 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.GiveItem1(talker, 10344, 1);
myself.SetMemoState(talker, 138, 9);
myself.ShowPage(talker, "pupina_q0138_12.htm");
myself.SetFlagJournal(talker, 138, 6);
myself.ShowQuestMark(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) >= 9 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pupina_q0138_13.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 227) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 227) == 0 && myself.GetOneTimeQuestFlag(talker, 227) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 15 || talker.occupation == 42 && talker.level >= 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 2822, 1);
myself.SetMemoState(talker, 227, 1);
myself.SetFlagJournal(talker, 227, 1);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");
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
myself.ShowQuestPage(talker, "pupina_q0227_04b.htm", 227);

} else {
myself.ShowQuestPage(talker, "pupina_q0227_04.htm", 227);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 227) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 227) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2822) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "pupina_q0227_06.htm");
myself.DeleteItem1(talker, 2822, 1);
myself.GiveItem1(talker, 2823, 1);
myself.SetMemoState(talker, 227, 4);
myself.DeleteItem1(talker, 2832, gg.OwnItemCount(talker, 2832));
myself.SetFlagJournal(talker, 227, 4);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 138) {
myself.SetCurrentQuestID(138);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 138) {
if (reply == 1) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 1 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetMemoState(talker, 138, 2);
myself.ShowPage(talker, "pupina_q0138_03.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 2 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.ShowPage(talker, "pupina_q0138_04.htm");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 2 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.ShowPage(talker, "pupina_q0138_06.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 2 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.ShowPage(talker, "pupina_q0138_07.htm");

}

}
if (reply == 5) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 2 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.SetMemoState(talker, 138, 3);
myself.ShowPage(talker, "pupina_q0138_08.htm");
myself.SetFlagJournal(talker, 138, 3);
myself.ShowQuestMark(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 6) {
if (gg.HaveMemo(talker, 138) == 1 && gg.GetMemoState(talker, 138) == 8 && myself.GetOneTimeQuestFlag(talker, 138) == 0) {
myself.GiveItem1(talker, 10344, 1);
myself.SetMemoState(talker, 138, 9);
myself.ShowPage(talker, "pupina_q0138_11.htm");
myself.SetFlagJournal(talker, 138, 6);
myself.ShowQuestMark(talker, 138);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}