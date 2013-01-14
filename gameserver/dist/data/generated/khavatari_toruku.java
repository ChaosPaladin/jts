package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class khavatari_toruku extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1606)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1607) && gg.OwnItemCount(talker, 1608) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1607) == 0 && gg.OwnItemCount(talker, 1608) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1613) == 1 && gg.OwnItemCount(talker, 1614) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Monk (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1606)) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "khavatari_toruku_q0415_01.htm");
myself.DeleteItem1(talker, 1606, 1);
myself.GiveItem1(talker, 1607, 1);
myself.SetFlagJournal(talker, 415, 11);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1607) && gg.OwnItemCount(talker, 1608) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_toruku_q0415_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1607) == 0 && gg.OwnItemCount(talker, 1608) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "khavatari_toruku_q0415_03.htm");
myself.DeleteItem1(talker, 1608, 1);
myself.GiveItem1(talker, 1613, 1);
myself.GiveItem1(talker, 1614, 1);
myself.SetFlagJournal(talker, 415, 13);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1613) == 1 && gg.OwnItemCount(talker, 1614) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_toruku_q0415_04.htm");

}
break;

}

}
return;

}
super;
	}


}