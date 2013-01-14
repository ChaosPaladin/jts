package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class katari extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 5 || gg.GetMemoState(talker, 227) == 6) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 8 || gg.GetMemoState(talker, 227) == 7) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 9 && gg.OwnItemCount(talker, 2833) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) >= 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Reformer (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 5 && gg.OwnItemCount(talker, 4326) < 10) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 5 && gg.OwnItemCount(talker, 4326) >= 10) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 9) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Repent Your Sins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 5 || gg.GetMemoState(talker, 227) == 6) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "katari_q0227_01.htm");
myself.SetMemoState(talker, 227, 6);
myself.SetFlagJournal(talker, 227, 6);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2824, gg.OwnItemCount(talker, 2824));
if (myself.Maker_GetNpcCount() == 1) {
i0 = myself.CreateOnePrivateEx(1030732, "ol_mahum_pilgrim", 0, 0, -4015, 40141, -3664, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1027129, "ol_mahum_inspector", 0, 0, -4034, 40201, -3665, 0, i0, 0, 0);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 8 || gg.GetMemoState(talker, 227) == 7) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 227) == 7) {
myself.SetMemoState(talker, 227, 8);

}
myself.ShowPage(talker, "katari_q0227_02.htm");
myself.SetFlagJournal(talker, 227, 8);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");
if (myself.Maker_GetNpcCount() < 3) {
i0 = myself.CreateOnePrivateEx(1027130, "ol_mahum_betrayer", 0, 0, -4106, 40174, -3660, 0, 0, 0, 0);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 9 && gg.OwnItemCount(talker, 2833) >= 1) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "katari_q0227_03.htm");
myself.SetMemoState(talker, 227, 10);
myself.DeleteItem1(talker, 2833, 1);
myself.GiveItem1(talker, 2827, 1);
myself.SetFlagJournal(talker, 227, 10);
myself.ShowQuestMark(talker, 227);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) >= 10) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "katari_q0227_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 1) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 5);
myself.ShowPage(talker, "katari_q0422_01.htm");
myself.SetFlagJournal(talker, 422, 6);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 5 && gg.OwnItemCount(talker, 4326) < 10) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "katari_q0422_02.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 5 && gg.OwnItemCount(talker, 4326) >= 10) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 9);
myself.ShowPage(talker, "katari_q0422_03.htm");
myself.SetFlagJournal(talker, 422, 10);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 4326, gg.OwnItemCount(talker, 4326));

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 9) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "katari_q0422_04.htm");

}
break;

}

}
return;

}
super;
	}


}