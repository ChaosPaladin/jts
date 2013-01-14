package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class prefect_vokiyan extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 5 && gg.OwnItemCount(talker, 3296)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 6) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 7 && gg.OwnItemCount(talker, 3301)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 8) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 0 && myself.GetOneTimeQuestFlag(talker, 220) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Glory");

}
if (gg.HaveMemo(talker, 220) == 0 && myself.GetOneTimeQuestFlag(talker, 220) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Testimony of Glory (Done)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3204) && gg.OwnItemCount(talker, 3205) < 10 || gg.OwnItemCount(talker, 3205) < 10 || gg.OwnItemCount(talker, 3206) < 10 || gg.OwnItemCount(talker, 3207) < 10) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3204) && gg.OwnItemCount(talker, 3205) >= 10 && gg.OwnItemCount(talker, 3206) >= 10 && gg.OwnItemCount(talker, 3207) >= 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3208)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Testimony of Glory (In Progress)");

}
if (gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) == 0 && gg.OwnItemCount(talker, 3208) || gg.OwnItemCount(talker, 3220)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Testimony of Glory (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 5 && gg.OwnItemCount(talker, 3296)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0224_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 6) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0224_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 7 && gg.OwnItemCount(talker, 3301)) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0224_04.htm");
myself.DeleteItem1(talker, 3301, 1);
myself.SetMemoState(talker, 224, 8);
myself.SetFlagJournal(talker, 224, 8);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 224) == 1 && gg.GetMemoState(talker, 224) == 8) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0224_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 0 && myself.GetOneTimeQuestFlag(talker, 220) == 0) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 3 && talker.level >= 37 && myself.IsInCategory(21, talker.occupation)) {
myself.ShowQuestPage(talker, "prefect_vokiyan_q0220_03.htm", 220);

} else if (talker.race == 3 && talker.level >= 37) {
myself.ShowPage(talker, "prefect_vokiyan_q0220_01a.htm");

} else if (talker.race == 3) {
myself.ShowPage(talker, "prefect_vokiyan_q0220_02.htm");

} else {
myself.ShowPage(talker, "prefect_vokiyan_q0220_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 0 && myself.GetOneTimeQuestFlag(talker, 220) == 1) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3204) && gg.OwnItemCount(talker, 3205) < 10 || gg.OwnItemCount(talker, 3205) < 10 || gg.OwnItemCount(talker, 3206) < 10 || gg.OwnItemCount(talker, 3207) < 10) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0220_06.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3204) && gg.OwnItemCount(talker, 3205) >= 10 && gg.OwnItemCount(talker, 3206) >= 10 && gg.OwnItemCount(talker, 3207) >= 10) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "prefect_vokiyan_q0220_08.htm");
myself.SetFlagJournal(talker, 220, 3);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 3208, 1);
myself.GiveItem1(talker, 3209, 1);
myself.DeleteItem1(talker, 3204, 1);
myself.DeleteItem1(talker, 3205, gg.OwnItemCount(talker, 3205));
myself.DeleteItem1(talker, 3206, gg.OwnItemCount(talker, 3206));
myself.DeleteItem1(talker, 3207, gg.OwnItemCount(talker, 3207));

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) && gg.OwnItemCount(talker, 3208)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0220_09.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 220) == 1 && gg.OwnItemCount(talker, 3209) == 0 && gg.OwnItemCount(talker, 3208) || gg.OwnItemCount(talker, 3220)) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "prefect_vokiyan_q0220_10.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 220) == 0 && myself.GetOneTimeQuestFlag(talker, 220) == 0 && myself.GetMemoCount(talker) < 41 && talker.race == 3 && talker.level >= 37 && myself.IsInCategory(21, talker.occupation)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 220);
myself.GiveItem1(talker, 3204, 1);
myself.SetFlagJournal(talker, 220, 1);
myself.ShowQuestMark(talker, 220);
myself.SoundEffect(talker, "ItemSound.quest_middle");
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
myself.ShowQuestPage(talker, "prefect_vokiyan_q0220_05a.htm", 220);

} else {
myself.ShowQuestPage(talker, "prefect_vokiyan_q0220_05.htm", 220);

}

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 224) {
myself.SetCurrentQuestID(224);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 224) {
if (reply == 1 && gg.OwnItemCount(talker, 3296) > 0) {
myself.ShowPage(talker, "prefect_vokiyan_q0224_02.htm");
myself.DeleteItem1(talker, 3296, 1);
myself.SetMemoState(talker, 224, 6);
myself.SetFlagJournal(talker, 224, 6);
myself.ShowQuestMark(talker, 224);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (ask == 220) {
myself.SetCurrentQuestID(220);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 220) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "prefect_vokiyan_q0220_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 220);
myself.ShowQuestFHTML(talker, fhtml0, 220);

}

}
super;
	}


}