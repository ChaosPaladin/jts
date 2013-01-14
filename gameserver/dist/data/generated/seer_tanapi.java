package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seer_tanapi extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 276) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Totem of the Hestui");

}
if (gg.HaveMemo(talker, 276)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Totem of the Hestui (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 1 && gg.OwnItemCount(talker, 2723)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 2) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 5 && gg.OwnItemCount(talker, 2724)) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Pilgrim (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3235) && gg.OwnItemCount(talker, 3236) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3235) && gg.OwnItemCount(talker, 3236) == 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3237)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 9) == 1 && myself.GetOneTimeQuestFlag(talker, 9) == 0 && gg.GetMemoState(talker, 9) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Into the City of Humans (In Progress)");

}
if (gg.HaveMemo(talker, 9) == 1 && gg.GetMemoState(talker, 9) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Into the City of Humans (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 276) == 0) {
myself.SetCurrentQuestID(276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 3) {
myself.ShowQuestPage(talker, "seer_tanapi_q0276_00.htm", 276);

} else if (talker.level < 15) {
myself.ShowQuestPage(talker, "seer_tanapi_q0276_01.htm", 276);

} else {
myself.FHTML_SetFileName(fhtml0, "seer_tanapi_q0276_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 276);
myself.ShowQuestFHTML(talker, fhtml0, 276);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 276)) {
myself.SetCurrentQuestID(276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1481) < 1) {
myself.ShowPage(talker, "seer_tanapi_q0276_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_tanapi_q0276_05.htm");
myself.RemoveMemo(talker, 276);
gg.AddLog(2, talker, 276);
gg.AddLog(3, talker, 276);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.DeleteItem1(talker, 1481, gg.OwnItemCount(talker, 1481));
myself.DeleteItem1(talker, 1480, gg.OwnItemCount(talker, 1480));
myself.GiveItem1(talker, 1500, 1);
myself.GiveItem1(talker, 29, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 1 && gg.OwnItemCount(talker, 2723)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_tanapi_q0215_01.htm");
myself.DeleteItem1(talker, 2723, 1);
myself.SetMemoState(talker, 215, 2);
myself.SetFlagJournal(talker, 215, 2);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 2) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_tanapi_q0215_02.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 215) == 1 && gg.GetMemoState(talker, 215) == 5 && gg.OwnItemCount(talker, 2724)) {
myself.SetCurrentQuestID(215);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_tanapi_q0215_03.htm");
myself.SetFlagJournal(talker, 215, 6);
myself.ShowQuestMark(talker, 215);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_tanapi_q0220_01.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3235) && gg.OwnItemCount(talker, 3236) == 0) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_tanapi_q0220_04.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3235) && gg.OwnItemCount(talker, 3236) == 1) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_tanapi_q0220_05.htm");
myself.GiveItem1(talker, 3237, 1);
myself.DeleteItem1(talker, 3236, 1);
myself.DeleteItem1(talker, 3235, 1);
myself.SetFlagJournal(talker, 220, 11);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3237)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_tanapi_q0220_06.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 9) == 1 && myself.GetOneTimeQuestFlag(talker, 9) == 0 && gg.GetMemoState(talker, 9) == 1 * 10 + 1) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 9, 1);
myself.ShowPage(talker, "seer_tanapi_q0009_0101.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 9) == 1 && gg.GetMemoState(talker, 9) == 2 * 10 + 1) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "seer_tanapi_q0009_0202.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 276) {
myself.SetCurrentQuestID(276);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 276);
myself.ShowQuestMark(talker, 276);
gg.AddLog(1, talker, 276);
myself.SetFlagJournal(talker, 276, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "seer_tanapi_q0276_03.htm", 276);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 220) {
if (reply == 1) {
myself.ShowPage(talker, "seer_tanapi_q0220_02.htm");

} else if (reply == 2 && gg.OwnItemCount(talker, 3220) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_tanapi_q0220_03.htm");
myself.GiveItem1(talker, 3235, 1);
myself.DeleteItem1(talker, 3220, 1);
myself.SetFlagJournal(talker, 220, 9);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 9) {
myself.SetCurrentQuestID(9);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 9) {
i0 = myself.GetHTMLCookie(talker, 9, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 9) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "seer_tanapi_q0009_0201.htm");
myself.SetMemoState(talker, 9, 2 * 10 + 1);
myself.SetFlagJournal(talker, 9, 2);
myself.ShowQuestMark(talker, 9);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}