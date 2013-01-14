package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_mirien extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 1 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 0 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Adept of Taste (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 0 && myself.GetOneTimeQuestFlag(talker, 214) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar");

}
if (gg.HaveMemo(talker, 214) == 0 && myself.GetOneTimeQuestFlag(talker, 214) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (Done)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) == 1 && gg.OwnItemCount(talker, 2693) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) == 1 && gg.OwnItemCount(talker, 2693) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) == 1 && gg.OwnItemCount(talker, 2698) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) == 1 && gg.OwnItemCount(talker, 2698) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2678) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 10277) == 1 && gg.GetMemoState(talker, 10277) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Mutated Kaneus - Dion (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1420) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_mirien_q0330_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 1 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 0) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1442) == 1) {
myself.ShowPage(talker, "magister_mirien_q0330_02t1.htm");
myself.DeleteItem1(talker, 1442, 1);
myself.GiveItem1(talker, 1447, 1);

}
if (gg.OwnItemCount(talker, 1443) == 1) {
myself.ShowPage(talker, "magister_mirien_q0330_02t2.htm");
myself.DeleteItem1(talker, 1443, 1);
myself.GiveItem1(talker, 1574, 1);

}
if (gg.OwnItemCount(talker, 1444) == 1) {
myself.ShowPage(talker, "magister_mirien_q0330_02t3.htm");
myself.DeleteItem1(talker, 1444, 1);
myself.GiveItem1(talker, 1575, 1);

}
if (gg.OwnItemCount(talker, 1445) == 1) {
myself.ShowPage(talker, "magister_mirien_q0330_02t4.htm");
myself.DeleteItem1(talker, 1445, 1);
myself.GiveItem1(talker, 1576, 1);

}
if (gg.OwnItemCount(talker, 1446) == 1) {
myself.ShowPage(talker, "magister_mirien_q0330_02t5.htm");
myself.DeleteItem1(talker, 1446, 1);
myself.GiveItem1(talker, 1577, 1);

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 330) == 1 && gg.OwnItemCount(talker, 1424) + gg.OwnItemCount(talker, 1425) + gg.OwnItemCount(talker, 1429) + gg.OwnItemCount(talker, 1430) + gg.OwnItemCount(talker, 1433) + gg.OwnItemCount(talker, 1437) + gg.OwnItemCount(talker, 1438) + gg.OwnItemCount(talker, 1441) == 0 && gg.OwnItemCount(talker, 1420) == 0 && gg.OwnItemCount(talker, 1442) + gg.OwnItemCount(talker, 1443) + gg.OwnItemCount(talker, 1444) + gg.OwnItemCount(talker, 1445) + gg.OwnItemCount(talker, 1446) == 0 && gg.OwnItemCount(talker, 1447) + gg.OwnItemCount(talker, 1574) + gg.OwnItemCount(talker, 1575) + gg.OwnItemCount(talker, 1576) + gg.OwnItemCount(talker, 1577) == 1) {
myself.SetCurrentQuestID(330);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_mirien_q0330_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 0 && myself.GetOneTimeQuestFlag(talker, 214) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39 == 0) {
myself.ShowPage(talker, "magister_mirien_q0214_01.htm");

} else if (talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39 && talker.level < 35) {
myself.ShowPage(talker, "magister_mirien_q0214_02.htm");

} else {
myself.FHTML_SetFileName(fhtml0, "magister_mirien_q0214_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 214);
myself.ShowQuestFHTML(talker, fhtml0, 214);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 0 && myself.GetOneTimeQuestFlag(talker, 214) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) == 1 && gg.OwnItemCount(talker, 2693) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_mirien_q0214_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2675) == 1 && gg.OwnItemCount(talker, 2693) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_mirien_q0214_06.htm");
myself.SetFlagJournal(talker, 214, 15);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2693, gg.OwnItemCount(talker, 2693));
myself.DeleteItem1(talker, 2675, 1);
myself.GiveItem1(talker, 2676, 1);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) == 1 && gg.OwnItemCount(talker, 2698) == 0) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_mirien_q0214_07.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) == 1 && gg.OwnItemCount(talker, 2698) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_mirien_q0214_08.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2678) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level < 36) {
myself.ShowPage(talker, "magister_mirien_q0214_11.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_mirien_q0214_12.htm");
myself.SetFlagJournal(talker, 214, 19);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2678, 1);
myself.GiveItem1(talker, 2677, 1);

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2677) == 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2720) == 0) {
myself.ShowPage(talker, "magister_mirien_q0214_13.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1753926);
myself.IncrementParam(talker, 1, 113754);
myself.GiveItem1(talker, 57, 319628);
myself.ShowPage(talker, "magister_mirien_q0214_14.htm");
myself.RemoveMemo(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 214, 1);
myself.DeleteItem1(talker, 2720, gg.OwnItemCount(talker, 2720));
myself.DeleteItem1(talker, 2677, 1);
myself.GiveItem1(talker, 2674, 1);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);

}

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10277) == 1 && gg.GetMemoState(talker, 10277) == 1) {
myself.SetCurrentQuestID(10277);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 13832) >= 1 && gg.OwnItemCount(talker, 13833) >= 1) {
myself.ShowPage(talker, "magister_mirien_q10277_02.htm");

} else {
myself.ShowPage(talker, "magister_mirien_q10277_01.htm");

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
if (quest_id == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 214) == 0 && myself.GetOneTimeQuestFlag(talker, 214) == 0 && myself.GetMemoCount(talker) < 41 && talker.occupation == 11 || talker.occupation == 26 || talker.occupation == 39 && talker.level >= 35) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 2675) == 0) {
myself.GiveItem1(talker, 2675, 1);

}
myself.SetFlagJournal(talker, 214, 1);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);
myself.ShowQuestPage(talker, "magister_mirien_q0214_04a.htm", 214);

} else {
myself.ShowQuestPage(talker, "magister_mirien_q0214_04.htm", 214);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2676) == 1 && gg.OwnItemCount(talker, 2698) == 1) {
if (gg.OwnItemCount(talker, 2676) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_mirien_q0214_10.htm");
myself.SetFlagJournal(talker, 214, 19);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2698, gg.OwnItemCount(talker, 2698));
myself.DeleteItem1(talker, 2676, 1);
myself.GiveItem1(talker, 2677, 1);

}

}

}

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
if (gg.HaveMemo(talker, 10277) == 1 && gg.GetMemoState(talker, 10277) == 1) {
if (gg.OwnItemCount(talker, 13832) >= 1 && gg.OwnItemCount(talker, 13833) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 20000);
myself.DeleteItem1(talker, 13832, gg.OwnItemCount(talker, 13832));
myself.DeleteItem1(talker, 13833, gg.OwnItemCount(talker, 13833));
myself.RemoveMemo(talker, 10277);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 10277);
gg.AddLog(3, talker, 10277);
myself.ShowPage(talker, "magister_mirien_q10277_03.htm");
myself.SetOneTimeQuestFlag(talker, 10277, 1);

}

}

}

}

}
super;
	}


}