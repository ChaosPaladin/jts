package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class khavatari_rosheek extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1593)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1594) && gg.OwnItemCount(talker, 1597) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1594) == 0 && gg.OwnItemCount(talker, 1597)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1595) == 1 && gg.OwnItemCount(talker, 1598) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1595) == 0 && gg.OwnItemCount(talker, 1598) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1596) == 1 && gg.OwnItemCount(talker, 1599) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1596) == 0 && gg.OwnItemCount(talker, 1599) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1604) == 1 && gg.OwnItemCount(talker, 1603) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1603) == 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Orc Monk (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1593)) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "khavatari_rosheek_q0415_01.htm");
myself.DeleteItem1(talker, 1593, 1);
myself.GiveItem1(talker, 1594, 1);
myself.SetFlagJournal(talker, 415, 2);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1594) && gg.OwnItemCount(talker, 1597) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_rosheek_q0415_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1594) == 0 && gg.OwnItemCount(talker, 1597)) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "khavatari_rosheek_q0415_03.htm");
myself.DeleteItem1(talker, 1597, 1);
myself.GiveItem1(talker, 1595, 1);
myself.SetFlagJournal(talker, 415, 4);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1595) == 1 && gg.OwnItemCount(talker, 1598) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_rosheek_q0415_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1595) == 0 && gg.OwnItemCount(talker, 1598) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "khavatari_rosheek_q0415_05.htm");
myself.DeleteItem1(talker, 1598, 1);
myself.GiveItem1(talker, 1596, 1);
myself.SetFlagJournal(talker, 415, 6);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1596) == 1 && gg.OwnItemCount(talker, 1599) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_rosheek_q0415_06.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1596) == 0 && gg.OwnItemCount(talker, 1599) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "khavatari_rosheek_q0415_07.htm");
myself.DeleteItem1(talker, 1599, 1);
myself.GiveItem1(talker, 1603, 1);
myself.GiveItem1(talker, 1604, 1);
myself.SetFlagJournal(talker, 415, 8);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1604) == 1 && gg.OwnItemCount(talker, 1603) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_rosheek_q0415_08.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1604) == 0 && gg.OwnItemCount(talker, 1603) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "khavatari_rosheek_q0415_09.htm");

}
break;

}

}
return;

}
super;
	}


}