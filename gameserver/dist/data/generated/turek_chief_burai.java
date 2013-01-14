package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class turek_chief_burai extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3214) == 0 && gg.OwnItemCount(talker, 3231) == 0 && gg.OwnItemCount(talker, 3227) == 0 && gg.OwnItemCount(talker, 3226) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3231)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3227)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3226) >= 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3214)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) < 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 10 && gg.OwnItemCount(talker, 4249) < 30 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 10 && gg.OwnItemCount(talker, 4249) >= 30 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Acts of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 11 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Acts of Evil (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3214) == 0 && gg.OwnItemCount(talker, 3231) == 0 && gg.OwnItemCount(talker, 3227) == 0 && gg.OwnItemCount(talker, 3226) == 0) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0220_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3231)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0220_02.htm");
myself.DeleteRadar(talker, -94294, 110818, -3563, 1);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3227)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0220_04.htm");
if (myself.Maker_GetNpcCount() < 3) {
myself.CreateOnePrivate(1027083, "makum_bugbear_thug", 0, 1);
myself.CreateOnePrivate(1027083, "makum_bugbear_thug", 0, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3226) >= 2) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "turek_chief_burai_q0220_05.htm");
myself.GiveItem1(talker, 3214, 1);
myself.DeleteItem1(talker, 3226, gg.OwnItemCount(talker, 3226));
if (gg.OwnItemCount(talker, 3212) >= 1 && gg.OwnItemCount(talker, 3211) >= 1 && gg.OwnItemCount(talker, 3215) >= 1 && gg.OwnItemCount(talker, 3213) >= 1) {
myself.SetFlagJournal(talker, 220, 5);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3210) && gg.OwnItemCount(talker, 3214)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0220_06.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3216) || gg.OwnItemCount(talker, 3217) || gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0220_07.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) < 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0171_01.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 9 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0171_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 10 && gg.OwnItemCount(talker, 4249) < 30 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0171_06.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 10 && gg.OwnItemCount(talker, 4249) >= 30 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 8000);
myself.DeleteItem1(talker, 4249, gg.OwnItemCount(talker, 4249));
myself.SetMemoState(talker, 171, 11);
myself.SetFlagJournal(talker, 171, 11);
myself.ShowQuestMark(talker, 171);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "turek_chief_burai_q0171_07.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 171) == 1 && gg.GetMemoState(talker, 171) == 11 && myself.GetOneTimeQuestFlag(talker, 171) == 0) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "turek_chief_burai_q0171_08.htm");

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
if (reply == 1 && gg.OwnItemCount(talker, 3231) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "turek_chief_burai_q0220_03.htm");
myself.CreateOnePrivate(1027083, "makum_bugbear_thug", 0, 1);
myself.CreateOnePrivate(1027083, "makum_bugbear_thug", 0, 1);
myself.GiveItem1(talker, 3227, 1);
myself.DeleteItem1(talker, 3231, 1);

}

}

}
if (ask == 171) {
myself.SetCurrentQuestID(171);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 171) {
if (reply == 1) {
myself.ShowPage(talker, "turek_chief_burai_q0171_03.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "turek_chief_burai_q0171_04.htm");

}
if (reply == 3) {
myself.DeleteItem1(talker, 4246, gg.OwnItemCount(talker, 4246));
myself.DeleteItem1(talker, 4247, gg.OwnItemCount(talker, 4247));
myself.DeleteItem1(talker, 4248, gg.OwnItemCount(talker, 4248));
myself.SetMemoState(talker, 171, 10);
myself.SetFlagJournal(talker, 171, 10);
myself.ShowQuestMark(talker, 171);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "turek_chief_burai_q0171_05.htm");

}

}
super;
	}


}