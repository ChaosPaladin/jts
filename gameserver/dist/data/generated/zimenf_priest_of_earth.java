package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zimenf_priest_of_earth extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) < 20) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) >= 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Scavenger (In Progress)");

}
if (gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1652) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Scavenger (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) < 20) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "zimenf_priest_of_earth_q0417_01.htm");
myself.DeleteItem1(talker, 1649, 1);
myself.GiveItem1(talker, 1652, 1);
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 10);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1649) == 1 && gg.GetMemoStateEx(talker, 417, 1) >= 20) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 417, 1);
myself.ShowPage(talker, "zimenf_priest_of_earth_q0417_02.htm");
myself.DeleteItem1(talker, 1649, 1);
myself.GiveItem1(talker, 1652, 1);
myself.SetMemoStateEx(talker, 417, 1, gg.GetMemoStateEx(talker, 417, 1) + 10);
myself.SetFlagJournal(talker, 417, 3);
myself.ShowQuestMark(talker, 417);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 417) == 1 && gg.OwnItemCount(talker, 1652) == 1) {
myself.SetCurrentQuestID(417);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "zimenf_priest_of_earth_q0417_03.htm");

}
break;

}

}
return;

}
super;
	}


}