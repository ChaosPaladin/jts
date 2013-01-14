package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tataru_zu_hestui extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 416) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Shaman");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1616) == 1 && gg.OwnItemCount(talker, 1617) + gg.OwnItemCount(talker, 1618) + gg.OwnItemCount(talker, 1619) < 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1616) == 1 && gg.OwnItemCount(talker, 1617) + gg.OwnItemCount(talker, 1618) + gg.OwnItemCount(talker, 1619) >= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1620) == 1 && gg.OwnItemCount(talker, 1621) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1622) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1623) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1625) || gg.OwnItemCount(talker, 1624) || gg.OwnItemCount(talker, 1626) || gg.OwnItemCount(talker, 1627) || gg.OwnItemCount(talker, 1628) || gg.OwnItemCount(talker, 1630)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 416) == 1 && gg.GetMemoState(talker, 416) == 100) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Orc Shaman (In Progress)");

}
if (gg.HaveMemo(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Long Live the Pa'agrio Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 0) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "tataru_zu_hestui_q0416_01.htm", 416);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1616) == 1 && gg.OwnItemCount(talker, 1617) + gg.OwnItemCount(talker, 1618) + gg.OwnItemCount(talker, 1619) < 3) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tataru_zu_hestui_q0416_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1616) == 1 && gg.OwnItemCount(talker, 1617) + gg.OwnItemCount(talker, 1618) + gg.OwnItemCount(talker, 1619) >= 3) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tataru_zu_hestui_q0416_08.htm");
myself.DeleteItem1(talker, 1616, gg.OwnItemCount(talker, 1616));
myself.DeleteItem1(talker, 1617, gg.OwnItemCount(talker, 1617));
myself.DeleteItem1(talker, 1618, gg.OwnItemCount(talker, 1618));
myself.DeleteItem1(talker, 1619, gg.OwnItemCount(talker, 1619));
myself.GiveItem1(talker, 1620, 1);
myself.GiveItem1(talker, 1621, 1);
myself.SetFlagJournal(talker, 416, 3);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1620) == 1 && gg.OwnItemCount(talker, 1621) == 1) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tataru_zu_hestui_q0416_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1622) == 1) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tataru_zu_hestui_q0416_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1623) == 1) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tataru_zu_hestui_q0416_12.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.OwnItemCount(talker, 1625) || gg.OwnItemCount(talker, 1624) || gg.OwnItemCount(talker, 1626) || gg.OwnItemCount(talker, 1627) || gg.OwnItemCount(talker, 1628) || gg.OwnItemCount(talker, 1630)) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tataru_zu_hestui_q0416_13.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 416) == 1 && gg.GetMemoState(talker, 416) == 100) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tataru_zu_hestui_q0416_11c.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1542) < 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tataru_zu_hestui_q0004_01.htm");
myself.GiveItem1(talker, 1542, 1);
if (gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 5) {
myself.SetFlagJournal(talker, 4, 2);
myself.ShowQuestMark(talker, 4);

}
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(talker, 1542) >= 1) {
myself.ShowPage(talker, "tataru_zu_hestui_q0004_02.htm");

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
if (quest_id == 416) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 416);
gg.AddLog(1, talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "tataru_zu_hestui_q0416_06.htm", 416);
myself.GiveItem1(talker, 1616, 1);
myself.SetFlagJournal(talker, 416, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 416) {
myself.SetCurrentQuestID(416);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 416 && reply == 1) {
if (talker.occupation != 49) {
if (talker.occupation == 50) {
myself.ShowQuestPage(talker, "tataru_zu_hestui_q0416_02a.htm", 416);

} else {
myself.ShowQuestPage(talker, "tataru_zu_hestui_q0416_02.htm", 416);

}

} else if (talker.level < 18) {
myself.ShowQuestPage(talker, "tataru_zu_hestui_q0416_03.htm", 416);

} else if (gg.OwnItemCount(talker, 1631) != 0) {
myself.ShowQuestPage(talker, "tataru_zu_hestui_q0416_04.htm", 416);

} else {
myself.FHTML_SetFileName(fhtml0, "tataru_zu_hestui_q0416_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 416);
myself.ShowQuestFHTML(talker, fhtml0, 416);

}

}
if (ask == 416 && reply == 2 && gg.OwnItemCount(talker, 1622) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tataru_zu_hestui_q0416_11a.htm");

}

}
if (ask == 416 && reply == 11 && gg.OwnItemCount(talker, 1622) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tataru_zu_hestui_q0416_11b.htm");
myself.DeleteItem1(talker, 1622, 1);
myself.GiveItem1(talker, 1623, 1);
myself.SetFlagJournal(talker, 416, 5);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 416 && reply == 12 && gg.OwnItemCount(talker, 1622) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tataru_zu_hestui_q0416_11c.htm");
myself.DeleteItem1(talker, 1622, 1);
myself.SetFlagJournal(talker, 416, 12);
myself.ShowQuestMark(talker, 416);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 416, 100);

}

}
super;
	}


}