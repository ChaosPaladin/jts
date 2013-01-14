package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class umul extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 10 || gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7144) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) > 11) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 10 || gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7144) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "umul_q0022_01.htm");
myself.SoundEffect(talker, "AmbSound.dd_horror_01");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) == 0) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7146, 1);
myself.ShowPage(talker, "umul_q0022_04.htm");
myself.SetFlagJournal(talker, 22, 13);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 11 && gg.OwnItemCount(talker, 7145) >= 1 && gg.OwnItemCount(talker, 7146) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "umul_q0022_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) > 11) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "umul_q0022_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 22) {
if (reply == 16) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.CreateOnePrivateEx(1027217, "ghost_of_umul", 0, 0, 34706, -54590, -2054, 0, gg.GetIndexFromCreature(talker), 0, myself.sm.id);
myself.ShowPage(talker, "umul_q0022_02.htm");
myself.SoundEffect(talker, "SkillSound3.antaras_fear");

} else {
myself.ShowPage(talker, "umul_q0022_03.htm");

}

}

}
super;
	}


}