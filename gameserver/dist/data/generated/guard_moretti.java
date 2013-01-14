package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_moretti extends guard_stand {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1207) > 0 && gg.OwnItemCount(talker, 1208) + gg.OwnItemCount(talker, 1209) + gg.OwnItemCount(talker, 1210) + gg.OwnItemCount(talker, 1211) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Elven Scout (In Progress)");

}
if (gg.GetMemoState(talker, 407) == 1 && gg.OwnItemCount(talker, 1214) < 1 && gg.OwnItemCount(talker, 1215) == 0 && gg.OwnItemCount(talker, 1216) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Elven Scout (In Progress)");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1215) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Elven Scout (In Progress)");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1212) > 0 && gg.OwnItemCount(talker, 1214) > 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Elven Scout (In Progress)");

}
if (gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1216) > 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Elven Scout (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1207) > 0 && gg.OwnItemCount(talker, 1208) + gg.OwnItemCount(talker, 1209) + gg.OwnItemCount(talker, 1210) + gg.OwnItemCount(talker, 1211) == 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_moretti_q0407_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.GetMemoState(talker, 407) == 1 && gg.OwnItemCount(talker, 1214) < 1 && gg.OwnItemCount(talker, 1215) == 0 && gg.OwnItemCount(talker, 1216) == 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1208) + gg.OwnItemCount(talker, 1209) + gg.OwnItemCount(talker, 1210) + gg.OwnItemCount(talker, 1211) < 1) {
myself.ShowPage(talker, "guard_moretti_q0407_04.htm");

} else if (gg.OwnItemCount(talker, 1208) + gg.OwnItemCount(talker, 1209) + gg.OwnItemCount(talker, 1210) + gg.OwnItemCount(talker, 1211) > 0 && gg.OwnItemCount(talker, 1208) + gg.OwnItemCount(talker, 1209) + gg.OwnItemCount(talker, 1210) + gg.OwnItemCount(talker, 1211) < 4) {
myself.ShowPage(talker, "guard_moretti_q0407_05.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "guard_moretti_q0407_06.htm");
myself.DeleteItem1(talker, 1208, 1);
myself.DeleteItem1(talker, 1209, 1);
myself.DeleteItem1(talker, 1210, 1);
myself.DeleteItem1(talker, 1211, 1);
myself.GiveItem1(talker, 1212, 1);
myself.GiveItem1(talker, 1214, 1);
myself.SetFlagJournal(talker, 407, 4);
myself.ShowQuestMark(talker, 407);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1215) > 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "guard_moretti_q0407_07.htm");
myself.DeleteItem1(talker, 1215, 1);
myself.GiveItem1(talker, 1216, 1);
myself.SetFlagJournal(talker, 407, 8);
myself.ShowQuestMark(talker, 407);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1212) > 0 && gg.OwnItemCount(talker, 1214) > 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_moretti_q0407_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 407) == 1 && gg.OwnItemCount(talker, 1216) > 0) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_moretti_q0407_08.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 407) {
myself.SetCurrentQuestID(407);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 407) {
if (reply == 1 && gg.OwnItemCount(talker, 1207) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1207, 1);
myself.SetMemoState(talker, 407, 1);
myself.SetFlagJournal(talker, 407, 2);
myself.ShowQuestMark(talker, 407);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "guard_moretti_q0407_03.htm");

}

}

}
super;
	}


}