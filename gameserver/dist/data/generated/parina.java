package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class parina extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 404) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Wizard");

}
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1282) == 0 || gg.OwnItemCount(talker, 1285) == 0 || gg.OwnItemCount(talker, 1288) == 0 || gg.OwnItemCount(talker, 1291) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1282) != 0 && gg.OwnItemCount(talker, 1285) != 0 && gg.OwnItemCount(talker, 1288) != 0 && gg.OwnItemCount(talker, 1291) != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2841) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2842) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2843) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of Magus (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) == 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "parina_q0404_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 404);
myself.ShowQuestFHTML(talker, fhtml0, 404);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1282) == 0 || gg.OwnItemCount(talker, 1285) == 0 || gg.OwnItemCount(talker, 1288) == 0 || gg.OwnItemCount(talker, 1291) == 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parina_q0404_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1282) != 0 && gg.OwnItemCount(talker, 1285) != 0 && gg.OwnItemCount(talker, 1288) != 0 && gg.OwnItemCount(talker, 1291) != 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1282, gg.OwnItemCount(talker, 1282));
myself.DeleteItem1(talker, 1285, gg.OwnItemCount(talker, 1285));
myself.DeleteItem1(talker, 1288, gg.OwnItemCount(talker, 1288));
myself.DeleteItem1(talker, 1291, gg.OwnItemCount(talker, 1291));
myself.RemoveMemo(talker, 404);
gg.AddLog(2, talker, 404);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 23152);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 29850);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 36548);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (gg.OwnItemCount(talker, 1292) == 0) {
myself.GiveItem1(talker, 1292, 1);

}
myself.ShowPage(talker, "parina_q0404_06.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2841) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parina_q0228_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2842) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parina_q0228_03.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2843) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parina_q0228_04.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "parina_q0228_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 404) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.occupation == 10) {
if (talker.level >= 18) {
if (gg.OwnItemCount(talker, 1292)) {
myself.ShowQuestPage(talker, "parina_q0404_03.htm", 404);

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "parina_q0404_08.htm", 404);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 404);
gg.AddLog(1, talker, 404);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 404, 1);

}

} else {
myself.ShowQuestPage(talker, "parina_q0404_02.htm", 404);

}

} else if (talker.occupation == 11) {
myself.ShowQuestPage(talker, "parina_q0404_02a.htm", 404);

} else {
myself.ShowQuestPage(talker, "parina_q0404_01.htm", 404);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 228) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 228) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2841) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "parina_q0228_02.htm");
myself.DeleteItem1(talker, 2841, 1);
myself.GiveItem1(talker, 2842, 1);
myself.SetFlagJournal(talker, 228, 2);
myself.ShowQuestMark(talker, 228);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}