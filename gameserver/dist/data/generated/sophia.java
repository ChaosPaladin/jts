package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sophia extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 333) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hunt of the Black Lion");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) < 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) < 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) < 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) >= 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) >= 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Hunt of the Black Lion (In Progress)");

}
if (gg.HaveMemo(talker, 42) == 1 && gg.OwnItemCount(talker, 7549) >= 1 && gg.GetMemoState(talker, 42) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Help the Uncle! (In Progress)");

}
if (gg.HaveMemo(talker, 42) == 1 && gg.GetMemoState(talker, 42) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Help the Uncle! (In Progress)");

}
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 1 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path to Becoming a Lord - Dion (In progress)");

}
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 2 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path to Becoming a Lord - Dion (In progress)");

}
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 3 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path to Becoming a Lord - Dion (In progress)");

}
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 4 && myself.IsMyLord(talker) == 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path to Becoming a Lord - Dion (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 25) {
myself.ShowQuestPage(talker, "sophia_q0333_01.htm", 333);

} else if (talker.level >= 25 && gg.OwnItemCount(talker, 1369) == 0) {
myself.ShowQuestPage(talker, "sophia_q0333_02.htm", 333);

} else if (talker.level >= 25 && gg.OwnItemCount(talker, 1369) == 1) {
myself.FHTML_SetFileName(fhtml0, "sophia_q0333_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 333);
myself.ShowQuestFHTML(talker, fhtml0, 333);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0333_14.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) < 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) < 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0333_15.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) < 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0333_15a.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) >= 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) == 0) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (i0 < 20) {

} else if (i0 < 50) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3675, 1);

} else if (i0 < 100) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3675, 2);

} else {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3675, 3);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 3848) * 35 + gg.OwnItemCount(talker, 3851) * 35 + gg.OwnItemCount(talker, 3850) * 35 + gg.OwnItemCount(talker, 3849) * 35);
myself.DeleteItem1(talker, 3848, gg.OwnItemCount(talker, 3848));
myself.DeleteItem1(talker, 3849, gg.OwnItemCount(talker, 3849));
myself.DeleteItem1(talker, 3850, gg.OwnItemCount(talker, 3850));
myself.DeleteItem1(talker, 3851, gg.OwnItemCount(talker, 3851));
myself.ShowPage(talker, "sophia_q0333_22.htm");
myself.SetMemoState(talker, 333, 0);
gg.AddLog(3, talker, 333);

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 333) == 1 && gg.OwnItemCount(talker, 3671) + gg.OwnItemCount(talker, 3672) + gg.OwnItemCount(talker, 3673) + gg.OwnItemCount(talker, 3674) == 1 && gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851) >= 1 && gg.OwnItemCount(talker, 3440) + gg.OwnItemCount(talker, 3441) + gg.OwnItemCount(talker, 3442) + gg.OwnItemCount(talker, 3443) >= 1) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.OwnItemCount(talker, 3848) + gg.OwnItemCount(talker, 3849) + gg.OwnItemCount(talker, 3850) + gg.OwnItemCount(talker, 3851);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (i0 < 20) {

} else if (i0 < 50) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3675, 1);

} else if (i0 < 100) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3675, 2);

} else {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3675, 3);

}
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 3848) * 35);
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 3849) * 35);
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 3850) * 35);
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 3851) * 35);
myself.DeleteItem1(talker, 3848, gg.OwnItemCount(talker, 3848));
myself.DeleteItem1(talker, 3849, gg.OwnItemCount(talker, 3849));
myself.DeleteItem1(talker, 3850, gg.OwnItemCount(talker, 3850));
myself.DeleteItem1(talker, 3851, gg.OwnItemCount(talker, 3851));
myself.ShowPage(talker, "sophia_q0333_23.htm");
myself.SetMemoState(talker, 333, 0);
gg.AddLog(3, talker, 333);

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 42) == 1 && gg.OwnItemCount(talker, 7549) >= 1 && gg.GetMemoState(talker, 42) == 3 * 10 + 1) {
myself.SetCurrentQuestID(42);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 42, 3);
myself.ShowPage(talker, "sophia_q0042_0301.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 42) == 1 && gg.GetMemoState(talker, 42) == 4 * 10 + 1) {
myself.SetCurrentQuestID(42);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0042_0403.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 1 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0709_01.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 2 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0709_03.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 3 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0709_04.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 4 && myself.IsMyLord(talker) == 1) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sophia_q0709_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 333) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 333);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "sophia_q0333_04.htm", 333);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 333) {
myself.SetCurrentQuestID(333);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 333) {
if (reply == 1) {
myself.ShowPage(talker, "sophia_q0333_05.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "sophia_q0333_06.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "sophia_q0333_07.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "sophia_q0333_08.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "sophia_q0333_09.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 3671) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3671, 1);
myself.ShowPage(talker, "sophia_q0333_10.htm");

}

}

}
if (reply == 7) {
if (gg.OwnItemCount(talker, 3672) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3672, 1);
myself.ShowPage(talker, "sophia_q0333_11.htm");

}

}

}
if (reply == 8) {
if (gg.OwnItemCount(talker, 3673) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3673, 1);
myself.ShowPage(talker, "sophia_q0333_12.htm");

}

}

}
if (reply == 9) {
if (gg.OwnItemCount(talker, 3674) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3674, 1);
myself.ShowPage(talker, "sophia_q0333_13.htm");

}

}

}
if (reply == 10) {
if (gg.OwnItemCount(talker, 3675) < 10) {
myself.ShowPage(talker, "sophia_q0333_16.htm");

} else if (gg.OwnItemCount(talker, 3675) >= 10 && gg.OwnItemCount(talker, 3676) < 4) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3676, 1);
i0 = gg.Rand(100);
if (i0 < 25) {
myself.GiveItem1(talker, 1061, 20);

} else if (i0 < 50) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.GiveItem1(talker, 1463, 100);

} else {
myself.GiveItem1(talker, 2510, 50);

}

} else if (i0 < 75) {
myself.GiveItem1(talker, 736, 20);

} else {
myself.GiveItem1(talker, 735, 3);

}
myself.DeleteItem1(talker, 3675, 10);
myself.ShowPage(talker, "sophia_q0333_17a.htm");

}

} else if (gg.OwnItemCount(talker, 3675) >= 10 && gg.OwnItemCount(talker, 3676) >= 4 && gg.OwnItemCount(talker, 3676) <= 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3676, 1);
i0 = gg.Rand(100);
if (i0 < 25) {
myself.GiveItem1(talker, 1061, 25);

} else if (i0 < 50) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.GiveItem1(talker, 1463, 200);

} else {
myself.GiveItem1(talker, 2510, 100);

}

} else if (i0 < 75) {
myself.GiveItem1(talker, 736, 20);

} else {
myself.GiveItem1(talker, 735, 3);

}
myself.DeleteItem1(talker, 3675, 10);
myself.ShowPage(talker, "sophia_q0333_18b.htm");

}

} else if (gg.OwnItemCount(talker, 3675) >= 10 && gg.OwnItemCount(talker, 3676) >= 8) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 3676) > 8) {
myself.DeleteItem1(talker, 3676, gg.OwnItemCount(talker, 3676) - 8);

}
i0 = gg.Rand(100);
if (i0 < 25) {
myself.GiveItem1(talker, 1061, 50);

} else if (i0 < 50) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.GiveItem1(talker, 1463, 400);

} else {
myself.GiveItem1(talker, 2510, 200);

}

} else if (i0 < 75) {
myself.GiveItem1(talker, 736, 30);

} else {
myself.GiveItem1(talker, 735, 4);

}
myself.DeleteItem1(talker, 3675, 10);
myself.ShowPage(talker, "sophia_q0333_19b.htm");

}

}

}
if (reply == 11) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 3671, gg.OwnItemCount(talker, 3671));
myself.DeleteItem1(talker, 3672, gg.OwnItemCount(talker, 3672));
myself.DeleteItem1(talker, 3673, gg.OwnItemCount(talker, 3673));
myself.DeleteItem1(talker, 3674, gg.OwnItemCount(talker, 3674));
myself.ShowPage(talker, "sophia_q0333_20.htm");

}

}
if (reply == 12) {
myself.ShowPage(talker, "sophia_q0333_21.htm");

}
if (reply == 13) {
myself.ShowPage(talker, "sophia_q0333_24a.htm");

}
if (reply == 14) {
myself.ShowPage(talker, "sophia_q0333_25b.htm");

}
if (reply == 15) {
if (gg.OwnItemCount(talker, 1369) >= 1 && gg.HaveMemo(talker, 333) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 12400);
myself.DeleteItem1(talker, 3675, gg.OwnItemCount(talker, 3675));
myself.DeleteItem1(talker, 3676, gg.OwnItemCount(talker, 3676));
myself.DeleteItem1(talker, 3677, gg.OwnItemCount(talker, 3677));
myself.DeleteItem1(talker, 1369, gg.OwnItemCount(talker, 1369));
myself.DeleteItem1(talker, 3671, gg.OwnItemCount(talker, 3671));
myself.DeleteItem1(talker, 3672, gg.OwnItemCount(talker, 3672));
myself.DeleteItem1(talker, 3673, gg.OwnItemCount(talker, 3673));
myself.DeleteItem1(talker, 3674, gg.OwnItemCount(talker, 3674));
myself.ShowPage(talker, "sophia_q0333_26.htm");
myself.RemoveMemo(talker, 333);
gg.AddLog(2, talker, 333);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}

}
if (ask == 42) {
myself.SetCurrentQuestID(42);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 42) {
i0 = myself.GetHTMLCookie(talker, 42, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 42) == 1) {
if (gg.OwnItemCount(talker, 7549) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7549, 1);
myself.ShowPage(talker, "sophia_q0042_0401.htm");
myself.SetMemoState(talker, 42, 4 * 10 + 1);
myself.SetFlagJournal(talker, 42, 5);
myself.ShowQuestMark(talker, 42);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sophia_q0042_0402.htm");

}

}

}

}
if (ask == 709) {
myself.SetCurrentQuestID(709);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 709) {
if (reply == 1) {
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 1 && myself.IsMyLord(talker) == 1) {
i0 = gg.GetMemoState(talker, 709);
myself.SetMemoState(talker, 709, i0 + 10);
myself.ShowPage(talker, "sophia_q0709_02.htm");
myself.SetFlagJournal(talker, 709, 6);
myself.ShowQuestMark(talker, 709);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 709) == 1 && gg.GetMemoState(talker, 709) / 10 == 3 && myself.IsMyLord(talker) == 1) {
if (gg.GetMemoState(talker, 709) % 10 != 9) {
myself.DeleteItem1(talker, 13850, gg.OwnItemCount(talker, 13850));
i0 = gg.GetMemoState(talker, 709);
myself.SetMemoState(talker, 709, i0 + 10);
myself.ShowPage(talker, "sophia_q0709_05.htm");
myself.SetFlagJournal(talker, 709, 8);
myself.ShowQuestMark(talker, 709);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.DeleteItem1(talker, 13850, gg.OwnItemCount(talker, 13850));
i0 = gg.GetMemoState(talker, 709);
myself.SetMemoState(talker, 709, i0 + 10);
myself.ShowPage(talker, "sophia_q0709_06.htm");
myself.SetFlagJournal(talker, 709, 9);
myself.ShowQuestMark(talker, 709);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}