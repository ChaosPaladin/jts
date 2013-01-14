package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_keeper_raut extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1657) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1644) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1645) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2704) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2713) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2705) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Scholar (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1657) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "raut_q0417_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1644) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "raut_q0417_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1645) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "raut_q0417_05.htm");
myself.DeleteItem1(talker, 1645, 1);
myself.GiveItem1(talker, 1642, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 160267);
myself.IncrementParam(talker, 1, 17706);
myself.GiveItem1(talker, 57, 81900);

} else if (talker.level >= 19) {
myself.IncrementParam(talker, 0, 228064);
myself.IncrementParam(talker, 1, 21055);
myself.GiveItem1(talker, 57, 81900);

} else {
myself.IncrementParam(talker, 0, 295862);
myself.IncrementParam(talker, 1, 24404);
myself.GiveItem1(talker, 57, 81900);

}

}
myself.RemoveMemo(talker, 417);
gg.AddLog(2, talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2704) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_raut_q0214_01.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2713) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_raut_q0214_04.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2706) >= 1 && gg.OwnItemCount(talker, 2705) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "warehouse_keeper_raut_q0214_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 417) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 417 && reply == 1 && gg.OwnItemCount(talker, 1657) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "raut_q0417_02.htm");
myself.DeleteItem1(talker, 1657, 1);
myself.GiveItem1(talker, 1644, 1);
myself.SetFlagJournal(talker, 417, 10);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 417 && reply == 2 && gg.OwnItemCount(talker, 1657) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "raut_q0417_03.htm");
myself.DeleteItem1(talker, 1657, 1);
myself.GiveItem1(talker, 1644, 1);
myself.SetFlagJournal(talker, 417, 10);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2704) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_keeper_raut_q0214_02.htm");
myself.SetFlagJournal(talker, 214, 25);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2704, 1);
myself.GiveItem1(talker, 2706, 1);
myself.GiveItem1(talker, 2713, 1);

}

}

}

}
super;
	}


}