package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class holy_ark_2 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 1000 / 100 == 1 && gg.OwnItemCount(talker, 4292) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4292) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "An Arrogant Search (In Progress)");

}
if (gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) <= 8 && gg.GetMemoStateEx(talker, 348, 1) % 1000 / 100 == 0 && gg.OwnItemCount(talker, 4292) == 0 && gg.OwnItemCount(talker, 4397) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "An Arrogant Search (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) < 8 && gg.GetMemoStateEx(talker, 348, 1) % 1000 / 100 == 1 && gg.OwnItemCount(talker, 4292) == 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holy_ark_2_q0348_01.htm");
i0 = gg.GetMemoStateEx(talker, 348, 1);
if (i0 % 10 != 0) {
myself.SetFlagJournal(talker, 348, 10);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.CreateOnePrivateEx(1027182, "ark_guardian_elberoth", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.OwnItemCount(talker, 4292) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4397, 1);
myself.DeleteItem1(talker, 4292, 1);
myself.DeleteRadar(talker, 181472, 7158, -2725, 1);
if (gg.GetMemoStateEx(talker, 348, 1) % 10 == 0 && gg.OwnItemCount(talker, 4398) > 0 && gg.OwnItemCount(talker, 4399) > 0) {
myself.SetFlagJournal(talker, 348, 21);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.GetMemoStateEx(talker, 348, 1) % 10 != 0) {
myself.SetFlagJournal(talker, 348, 12);
myself.ShowQuestMark(talker, 348);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.SetMemoStateEx(talker, 348, 1, gg.GetMemoStateEx(talker, 348, 1) - 200);
if (gg.GetMemoStateEx(talker, 348, 1) - 200 % 1000 / 100 == 0) {
myself.SetMemoStateEx(talker, 348, 0, gg.GetMemoStateEx(talker, 348, 0) + 1);

}
if (gg.GetMemoStateEx(talker, 348, 1) - 200 % 10 == 2) {
myself.SetMemoStateEx(talker, 348, 0, 8);

}
myself.ShowPage(talker, "holy_ark_2_q0348_02.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 348) == 1 && gg.GetMemoState(talker, 348) <= 8 && gg.GetMemoStateEx(talker, 348, 1) % 1000 / 100 == 0 && gg.OwnItemCount(talker, 4292) == 0 && gg.OwnItemCount(talker, 4397) > 0) {
myself.SetCurrentQuestID(348);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "holy_ark_2_q0348_03.htm");

}
break;

}

}
return;

}
super;
	}


}