package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class water_undine extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1285) != 0 && gg.OwnItemCount(talker, 1286) == 0 && gg.OwnItemCount(talker, 1288) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1286) != 0 && gg.OwnItemCount(talker, 1287) < 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1286) != 0 && gg.OwnItemCount(talker, 1287) >= 2) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1288) != 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Human Wizard (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1 && gg.OwnItemCount(talker, 2856) == 0 && gg.OwnItemCount(talker, 2862) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1 && gg.OwnItemCount(talker, 2862) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Test of Magus (In Progress)");

}
if (gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1 && gg.OwnItemCount(talker, 2856) == 1 && gg.OwnItemCount(talker, 2862) == 0) {
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
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1285) != 0 && gg.OwnItemCount(talker, 1286) == 0 && gg.OwnItemCount(talker, 1288) == 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1286) == 0) {
myself.GiveItem1(talker, 1286, 1);

}
myself.ShowPage(talker, "water_undine_q0404_01.htm");
myself.SetFlagJournal(talker, 404, 8);
myself.ShowQuestMark(talker, 404);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1286) != 0 && gg.OwnItemCount(talker, 1287) < 2) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "water_undine_q0404_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1286) != 0 && gg.OwnItemCount(talker, 1287) >= 2) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1287, gg.OwnItemCount(talker, 1287));
myself.DeleteItem1(talker, 1286, gg.OwnItemCount(talker, 1286));
if (gg.OwnItemCount(talker, 1288) == 0) {
myself.GiveItem1(talker, 1288, 1);

}
myself.ShowPage(talker, "water_undine_q0404_03.htm");
myself.SetFlagJournal(talker, 404, 10);
myself.ShowQuestMark(talker, 404);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 404) != 0 && gg.OwnItemCount(talker, 1288) != 0) {
myself.SetCurrentQuestID(404);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "water_undine_q0404_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1 && gg.OwnItemCount(talker, 2856) == 0 && gg.OwnItemCount(talker, 2862) == 0) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "water_undine_q0228_01.htm");
myself.GiveItem1(talker, 2862, 1);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1 && gg.OwnItemCount(talker, 2862) == 1) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2848) < 20) {
myself.ShowPage(talker, "water_undine_q0228_02.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "water_undine_q0228_03.htm");
myself.DeleteItem1(talker, 2848, gg.OwnItemCount(talker, 2848));
myself.DeleteItem1(talker, 2862, 1);
myself.GiveItem1(talker, 2856, 1);
if (gg.OwnItemCount(talker, 2857) >= 1 && gg.OwnItemCount(talker, 2858) >= 1 && gg.OwnItemCount(talker, 2859) >= 1) {
myself.SetFlagJournal(talker, 228, 6);
myself.ShowQuestMark(talker, 228);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 228) == 1 && gg.OwnItemCount(talker, 2847) == 1 && gg.OwnItemCount(talker, 2856) == 1 && gg.OwnItemCount(talker, 2862) == 0) {
myself.SetCurrentQuestID(228);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "water_undine_q0228_04.htm");

}
break;

}

}
return;

}
super;
	}


}