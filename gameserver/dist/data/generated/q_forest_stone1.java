package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class q_forest_stone1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 1 || gg.GetMemoState(talker, 21) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Lidia's Heart (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 1 || gg.GetMemoState(talker, 21) == 3) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone1_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone1_q0023_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone1_q0023_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 10) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "q_forest_stone1_q0023_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 21) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 21) {
if (reply == 1) {
myself.ShowPage(talker, "q_forest_stone1_q0021_02.htm");

}
if (reply == 2) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 1 || gg.GetMemoState(talker, 21) == 3) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.CreateOnePrivateEx(1031524, "rune_ghost1", 0, 0, 51432, -54570, -3136, 0, 0, 0, myself.sm.id);
myself.SoundEffect(talker, "SkillSound5.horror_02");
myself.ShowPage(talker, "q_forest_stone1_q0021_03.htm");
myself.SetFlagJournal(talker, 21, 2);
myself.ShowQuestMark(talker, 21);

} else {
myself.SoundEffect(talker, "SkillSound5.horror_02");
myself.ShowPage(talker, "q_forest_stone1_q0021_04.htm");

}

}

}

}
if (ask == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 23) {
if (reply == 22) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8 || gg.GetMemoState(talker, 23) == 9) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.CreateOnePrivateEx(1031524, "rune_ghost1", 0, 0, 51432, -54570, -3136, 0, 0, 0, myself.sm.id);
myself.ShowPage(talker, "q_forest_stone1_q0023_02.htm");
myself.SoundEffect(talker, "SkillSound5.horror_02");

} else {
myself.ShowPage(talker, "q_forest_stone1_q0023_03.htm");
myself.SoundEffect(talker, "SkillSound5.horror_02");

}

}

}
if (reply == 26) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7149, 1);
myself.SetMemoState(talker, 23, 10);
myself.ShowPage(talker, "q_forest_stone1_q0023_06.htm");
myself.SetFlagJournal(talker, 23, 8);
myself.ShowQuestMark(talker, 23);

}

}

}

}
super;
	}


}