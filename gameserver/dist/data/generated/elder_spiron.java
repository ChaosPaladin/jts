package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elder_spiron extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 292) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Brigands Sweep");

}
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1483) < 1 && gg.OwnItemCount(talker, 1484) < 1 && gg.OwnItemCount(talker, 1485) < 1 && gg.OwnItemCount(talker, 1486) == 0 && gg.OwnItemCount(talker, 1487) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 1 && gg.OwnItemCount(talker, 1486) == 0 && gg.OwnItemCount(talker, 1487) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1486) == 1 && gg.OwnItemCount(talker, 1487) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1486) >= 2 && gg.OwnItemCount(talker, 1487) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1486) == 0 && gg.OwnItemCount(talker, 1487) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Brigands Sweep (In Progress)");

}
if (gg.HaveMemo(talker, 231) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Test of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3247) >= 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3252) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3252) == 0 && gg.OwnItemCount(talker, 3247) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3252) >= 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3247) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3252) == 0 && gg.OwnItemCount(talker, 3247) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3258) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 100 || gg.GetMemoState(talker, 347) == 200) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Go Get the Calculator. (In Progress)");

}
if (gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 300 || gg.GetMemoState(talker, 347) == 400 || gg.GetMemoState(talker, 347) == 500 || gg.GetMemoState(talker, 347) == 600 || gg.GetMemoState(talker, 347) == 700) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Go Get the Calculator. (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 0) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 4) {
myself.ShowQuestPage(talker, "elder_spiron_q0292_00.htm", 292);

} else if (talker.level >= 5) {
myself.FHTML_SetFileName(fhtml0, "elder_spiron_q0292_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 292);
myself.ShowQuestFHTML(talker, fhtml0, 292);

} else {
myself.ShowQuestPage(talker, "elder_spiron_q0292_01.htm", 292);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1483) < 1 && gg.OwnItemCount(talker, 1484) < 1 && gg.OwnItemCount(talker, 1485) < 1 && gg.OwnItemCount(talker, 1486) == 0 && gg.OwnItemCount(talker, 1487) == 0) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0292_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 1 && gg.OwnItemCount(talker, 1486) == 0 && gg.OwnItemCount(talker, 1487) == 0) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_spiron_q0292_05.htm");
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33 + 1000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33);

}
myself.DeleteItem1(talker, 1483, gg.OwnItemCount(talker, 1483));
myself.DeleteItem1(talker, 1484, gg.OwnItemCount(talker, 1484));
myself.DeleteItem1(talker, 1485, gg.OwnItemCount(talker, 1485));
gg.AddLog(3, talker, 292);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1486) == 1 && gg.OwnItemCount(talker, 1487) == 0) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_spiron_q0292_08.htm");
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 1) {
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33 + 1000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33);

}

}
myself.DeleteItem1(talker, 1483, gg.OwnItemCount(talker, 1483));
myself.DeleteItem1(talker, 1484, gg.OwnItemCount(talker, 1484));
myself.DeleteItem1(talker, 1485, gg.OwnItemCount(talker, 1485));
gg.AddLog(3, talker, 292);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1486) >= 2 && gg.OwnItemCount(talker, 1487) == 0) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_spiron_q0292_09.htm");
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 1) {
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33 + 1000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33);

}

}
myself.DeleteItem1(talker, 1483, gg.OwnItemCount(talker, 1483));
myself.DeleteItem1(talker, 1484, gg.OwnItemCount(talker, 1484));
myself.DeleteItem1(talker, 1485, gg.OwnItemCount(talker, 1485));
gg.AddLog(3, talker, 292);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 292) == 1 && gg.OwnItemCount(talker, 1486) == 0 && gg.OwnItemCount(talker, 1487) == 1) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_spiron_q0292_10.htm");
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 1) {
if (gg.OwnItemCount(talker, 1483) + gg.OwnItemCount(talker, 1484) + gg.OwnItemCount(talker, 1485) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33 + 1000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1483) * 12 + gg.OwnItemCount(talker, 1484) * 36 + gg.OwnItemCount(talker, 1485) * 33);

}

}
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1487) * 120 + 1000);
myself.DeleteItem1(talker, 1483, gg.OwnItemCount(talker, 1483));
myself.DeleteItem1(talker, 1484, gg.OwnItemCount(talker, 1484));
myself.DeleteItem1(talker, 1485, gg.OwnItemCount(talker, 1485));
myself.DeleteItem1(talker, 1487, gg.OwnItemCount(talker, 1487));
gg.AddLog(3, talker, 292);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 231) == 1) {
myself.SetCurrentQuestID(231);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0231_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3247) >= 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3252) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0221_01.htm");
myself.DeleteItem1(talker, 3247, gg.OwnItemCount(talker, 3247));

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3252) == 0 && gg.OwnItemCount(talker, 3247) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0221_02.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3252) >= 1 && gg.OwnItemCount(talker, 3258) == 0 && gg.OwnItemCount(talker, 3247) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elder_spiron_q0221_03.htm");
myself.DeleteItem1(talker, 3252, 1);
myself.GiveItem1(talker, 3258, 1);

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3252) == 0 && gg.OwnItemCount(talker, 3247) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3258) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0221_04.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 100 || gg.GetMemoState(talker, 347) == 200) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0347_01.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 347) == 1 && gg.GetMemoState(talker, 347) == 300 || gg.GetMemoState(talker, 347) == 400 || gg.GetMemoState(talker, 347) == 500 || gg.GetMemoState(talker, 347) == 600 || gg.GetMemoState(talker, 347) == 700) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elder_spiron_q0347_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 292) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 292);
myself.ShowQuestMark(talker, 292);
gg.AddLog(1, talker, 292);
myself.SetFlagJournal(talker, 292, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elder_spiron_q0292_03.htm", 292);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 292) {
myself.SetCurrentQuestID(292);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 292) {
if (reply == 1) {
myself.ShowPage(talker, "elder_spiron_q0292_06.htm");
myself.DeleteItem1(talker, 1486, gg.OwnItemCount(talker, 1486));
myself.RemoveMemo(talker, 292);
gg.AddLog(2, talker, 292);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "elder_spiron_q0292_07.htm");

}

}
if (ask == 347) {
myself.SetCurrentQuestID(347);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 347) {
if (reply == 3) {
myself.SetMemoState(talker, 347, 200 + gg.GetMemoState(talker, 347));
if (gg.GetMemoState(talker, 347) == 100) {
myself.SetFlagJournal(talker, 347, 3);
myself.ShowQuestMark(talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.GetMemoState(talker, 347) == 200) {
myself.SetFlagJournal(talker, 347, 4);
myself.ShowQuestMark(talker, 347);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowPage(talker, "elder_spiron_q0347_02.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "elder_spiron_q0347_03.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "elder_spiron_q0347_04.htm");

}

}
super;
	}


}