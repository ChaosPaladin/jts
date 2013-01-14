package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class prefect_kasman extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1605)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1606) && gg.OwnItemCount(talker, 1607) == 0 || gg.OwnItemCount(talker, 1608) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1606) == 0 && gg.OwnItemCount(talker, 1607) == 1 || gg.OwnItemCount(talker, 1608) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1613)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Orc Monk (In Progress)");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1581) + gg.OwnItemCount(talker, 1583) + gg.OwnItemCount(talker, 1582) + gg.OwnItemCount(talker, 1584) + gg.OwnItemCount(talker, 1585) + gg.OwnItemCount(talker, 1586) + gg.OwnItemCount(talker, 1587) + gg.OwnItemCount(talker, 1588) + gg.OwnItemCount(talker, 1589) + gg.OwnItemCount(talker, 1590) >= 2 && gg.OwnItemCount(talker, 1591) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Path of the Orc Raider (In Progress)");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1591) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Path of the Orc Raider (In Progress)");

}
if (gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1591) >= 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Path of the Orc Raider (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Glory (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1605)) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_kasman_q0415_01.htm");
myself.DeleteItem1(talker, 1605, 1);
myself.GiveItem1(talker, 1606, 1);
myself.SetFlagJournal(talker, 415, 10);
myself.ShowQuestMark(talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1606) && gg.OwnItemCount(talker, 1607) == 0 || gg.OwnItemCount(talker, 1608) == 0) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_kasman_q0415_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1606) == 0 && gg.OwnItemCount(talker, 1607) == 1 || gg.OwnItemCount(talker, 1608) == 1) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_kasman_q0415_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 415) && gg.OwnItemCount(talker, 1613)) {
myself.SetCurrentQuestID(415);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_kasman_q0415_04.htm");
myself.DeleteItem1(talker, 1613, 1);
myself.DeleteItem1(talker, 1603, gg.OwnItemCount(talker, 1603));
myself.DeleteItem1(talker, 1614, gg.OwnItemCount(talker, 1614));
myself.GiveItem1(talker, 1615, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 25292);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 31990);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 38688);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 415);
gg.AddLog(2, talker, 415);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1581) + gg.OwnItemCount(talker, 1583) + gg.OwnItemCount(talker, 1582) + gg.OwnItemCount(talker, 1584) + gg.OwnItemCount(talker, 1585) + gg.OwnItemCount(talker, 1586) + gg.OwnItemCount(talker, 1587) + gg.OwnItemCount(talker, 1588) + gg.OwnItemCount(talker, 1589) + gg.OwnItemCount(talker, 1590) >= 2 && gg.OwnItemCount(talker, 1591) == 0) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_kasman_q0414_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1591) == 1) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_kasman_q0414_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 414) == 1 && gg.OwnItemCount(talker, 1591) >= 2) {
myself.SetCurrentQuestID(414);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_kasman_q0414_03.htm");
myself.DeleteItem1(talker, 1591, gg.OwnItemCount(talker, 1591));
myself.DeleteItem1(talker, 1581, gg.OwnItemCount(talker, 1581));
myself.DeleteItem1(talker, 1583, gg.OwnItemCount(talker, 1583));
myself.DeleteItem1(talker, 1582, gg.OwnItemCount(talker, 1582));
myself.DeleteItem1(talker, 1584, gg.OwnItemCount(talker, 1584));
myself.DeleteItem1(talker, 1585, gg.OwnItemCount(talker, 1585));
myself.DeleteItem1(talker, 1586, gg.OwnItemCount(talker, 1586));
myself.DeleteItem1(talker, 1587, gg.OwnItemCount(talker, 1587));
myself.DeleteItem1(talker, 1588, gg.OwnItemCount(talker, 1588));
myself.DeleteItem1(talker, 1589, gg.OwnItemCount(talker, 1589));
myself.DeleteItem1(talker, 1590, gg.OwnItemCount(talker, 1590));
myself.GiveItem1(talker, 1592, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 21312);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 28010);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 34708);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 414);
gg.AddLog(2, talker, 414);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_kasman_q0220_01.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_kasman_q0220_11.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 220) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3213)) {
myself.ShowPage(talker, "prefect_kasman_q0220_02.htm");

} else if (gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3230) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_kasman_q0220_03.htm");
myself.GiveItem1(talker, 3230, 1);
myself.ShowRadar(talker, -2150, 124443, -3724, 1);

}

} else if (gg.OwnItemCount(talker, 3213) == 0 && gg.OwnItemCount(talker, 3230) || gg.OwnItemCount(talker, 3233)) {
myself.ShowPage(talker, "prefect_kasman_q0220_04.htm");
myself.ShowRadar(talker, -2150, 124443, -3724, 1);

}

} else if (reply == 2) {
if (gg.OwnItemCount(talker, 3214)) {
myself.ShowPage(talker, "prefect_kasman_q0220_05.htm");

} else if (gg.OwnItemCount(talker, 3214) == 0 && gg.OwnItemCount(talker, 3231) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_kasman_q0220_06.htm");
myself.GiveItem1(talker, 3231, 1);
myself.ShowRadar(talker, -94294, 110818, -3563, 1);

}

} else if (gg.OwnItemCount(talker, 3214) == 0 && gg.OwnItemCount(talker, 3231)) {
myself.ShowPage(talker, "prefect_kasman_q0220_07.htm");
myself.ShowRadar(talker, -94294, 110818, -3563, 1);

}

} else if (reply == 3) {
if (gg.OwnItemCount(talker, 3215)) {
myself.ShowPage(talker, "prefect_kasman_q0220_08.htm");

} else if (gg.OwnItemCount(talker, 3215) == 0 && gg.OwnItemCount(talker, 3232) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_kasman_q0220_09.htm");
myself.GiveItem1(talker, 3232, 1);
myself.ShowRadar(talker, -55217, 200628, -3724, 1);

}

} else if (gg.OwnItemCount(talker, 3215) == 0 && gg.OwnItemCount(talker, 3232)) {
myself.ShowPage(talker, "prefect_kasman_q0220_10.htm");
myself.ShowRadar(talker, -55217, 200628, -3724, 1);

}

}

}
super;
	}


}