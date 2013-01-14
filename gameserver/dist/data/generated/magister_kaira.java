package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_kaira extends mage_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 219) == 0 && myself.GetOneTimeQuestFlag(talker, 219) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Fate");

}
if (gg.HaveMemo(talker, 219) == 0 && myself.GetOneTimeQuestFlag(talker, 219) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Fate (Done)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3173)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3174) || gg.OwnItemCount(talker, 3175)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3176) || gg.OwnItemCount(talker, 3177)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3184)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3185) || gg.OwnItemCount(talker, 3186)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3187)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3188)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3189)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190)) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Testimony of Fate (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3318) == 0) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3318) == 1 && gg.OwnItemCount(talker, 3309) == 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Test of Witchcraft (In Progress)");

}
if (gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) >= 1 || gg.OwnItemCount(talker, 3324) >= 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Test of Witchcraft (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 0 && myself.GetOneTimeQuestFlag(talker, 219) == 0) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 2 && talker.level >= 37 && myself.IsInCategory(20, talker.occupation)) {
myself.ShowQuestPage(talker, "magister_kaira_q0219_03.htm", 219);

} else if (talker.race == 2 && talker.level >= 37) {
myself.ShowPage(talker, "magister_kaira_q0219_01a.htm");

} else if (talker.race == 2) {
myself.ShowPage(talker, "magister_kaira_q0219_02.htm");

} else {
myself.ShowPage(talker, "magister_kaira_q0219_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 0 && myself.GetOneTimeQuestFlag(talker, 219) == 1) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3173)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3174) || gg.OwnItemCount(talker, 3175)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3176) || gg.OwnItemCount(talker, 3177)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_08.htm");
myself.SetFlagJournal(talker, 219, 5);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3184)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_kaira_q0219_09.htm");
myself.GiveItem1(talker, 3185, 1);
myself.DeleteItem1(talker, 3184, 1);
myself.CreateOnePrivateEx(1030613, "alders_spirit", 0, 0, 78977, 149036, -3597, 0, 0, 0, 0);
myself.SetFlagJournal(talker, 219, 10);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3185) || gg.OwnItemCount(talker, 3186)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_10.htm");
myself.SetFlagJournal(talker, 219, 11);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3187)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_11.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3188)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_kaira_q0219_15.htm");
myself.GiveItem1(talker, 3189, 1);
myself.DeleteItem1(talker, 3188, 1);
myself.SetFlagJournal(talker, 219, 15);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3189)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_16.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3190)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_kaira_q0219_17.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3309) == 1 && gg.OwnItemCount(talker, 3318) == 0) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "magister_kaira_q0229_01.htm", 229);

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3318) == 1 && gg.OwnItemCount(talker, 3309) == 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "magister_kaira_q0229_03.htm", 229);

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 229) == 1 && gg.OwnItemCount(talker, 3323) >= 1 || gg.OwnItemCount(talker, 3324) >= 1) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "magister_kaira_q0229_04.htm", 229);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 219) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 219) == 0 && myself.GetOneTimeQuestFlag(talker, 219) == 0 && myself.GetMemoCount(talker) < 41 && talker.race == 2 && talker.level >= 37 && myself.IsInCategory(20, talker.occupation)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 219, 1);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, 219);
myself.GiveItem1(talker, 3173, 1);
talker.flag = 0;
if (myself.GetOneTimeQuestFlag(talker, 55) == 0) {
if (talker.race == 0) {
myself.GiveItem1(talker, 7562, 96);

} else if (talker.race == 1) {
myself.GiveItem1(talker, 7562, 102);

} else if (talker.race == 2) {
myself.GiveItem1(talker, 7562, 98);

} else if (talker.race == 3) {
myself.GiveItem1(talker, 7562, 109);

} else if (talker.race == 4) {
myself.GiveItem1(talker, 7562, 50);

}
myself.SetOneTimeQuestFlag(talker, 55, 1);
myself.ShowQuestPage(talker, "magister_kaira_q0219_05a.htm", 219);

} else {
myself.ShowQuestPage(talker, "magister_kaira_q0219_05.htm", 219);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 219) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 219) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "magister_kaira_q0219_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 219);
myself.ShowQuestFHTML(talker, fhtml0, 219);

} else if (reply == 2 && gg.OwnItemCount(talker, 3187) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "magister_kaira_q0219_12.htm");
myself.GiveItem1(talker, 3189, 1);
myself.DeleteItem1(talker, 3187, 1);
myself.SetFlagJournal(talker, 219, 15);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 229) {
myself.SetCurrentQuestID(229);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 229) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "magister_kaira_q0229_02.htm", 229);
myself.GiveItem1(talker, 3318, 1);
if (gg.OwnItemCount(talker, 3317) >= 1 && gg.OwnItemCount(talker, 3319) >= 1 && gg.OwnItemCount(talker, 3320) >= 1 && gg.OwnItemCount(talker, 3321) >= 1 && gg.OwnItemCount(talker, 3322) >= 1) {
myself.SetFlagJournal(talker, 229, 3);
myself.ShowQuestMark(talker, 229);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}