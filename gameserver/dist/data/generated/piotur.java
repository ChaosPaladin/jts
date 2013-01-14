package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class piotur extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1 && gg.OwnItemCount(talker, 3242) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1 && gg.OwnItemCount(talker, 3242) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 327) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Recover the Farmland");

}
if (gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Recover the Farmland (In Progress)");

}
if (gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Recover the Farmland (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 2) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 6 && gg.OwnItemCount(talker, 4327) < 10) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Repent Your Sins (In Progress)");

}
if (gg.GetMemoState(talker, 422) == 6 && gg.OwnItemCount(talker, 4327) >= 10) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Repent Your Sins (In Progress)");

}
if (gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 10) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Repent Your Sins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1 && gg.OwnItemCount(talker, 3242) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piotur_q0221_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) == 1 && gg.OwnItemCount(talker, 3242) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piotur_q0221_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3240) == 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piotur_q0221_04.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) == 0) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 25) {
myself.ShowQuestPage(talker, "piotur_q0327_01.htm", 327);

} else {
myself.FHTML_SetFileName(fhtml0, "piotur_q0327_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 327);
myself.ShowQuestFHTML(talker, fhtml0, 327);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) >= 1) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "piotur_q0327_03a.htm", 327);
myself.DeleteItem1(talker, 5012, gg.OwnItemCount(talker, 5012));
myself.SetFlagJournal(talker, 327, 3);
myself.ShowQuestMark(talker, 327);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327) && gg.OwnItemCount(talker, 5012) == 0) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1846) + gg.OwnItemCount(talker, 1847) < 1) {
myself.ShowPage(talker, "piotur_q0327_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "piotur_q0327_05.htm");
if (gg.OwnItemCount(talker, 1846) + gg.OwnItemCount(talker, 1847) >= 10) {
myself.GiveItem1(talker, 57, 619 + gg.OwnItemCount(talker, 1846) * 40 + gg.OwnItemCount(talker, 1847) * 50);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1846) * 40 + gg.OwnItemCount(talker, 1847) * 50);

}
myself.DeleteItem1(talker, 1846, gg.OwnItemCount(talker, 1846));
myself.DeleteItem1(talker, 1847, gg.OwnItemCount(talker, 1847));
gg.AddLog(3, talker, 327);
myself.SetFlagJournal(talker, 327, 4);
myself.ShowQuestMark(talker, 327);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 2) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 6);
myself.ShowPage(talker, "piotur_q0422_01.htm");
myself.SetFlagJournal(talker, 422, 7);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 6 && gg.OwnItemCount(talker, 4327) < 10) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piotur_q0422_02.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.GetMemoState(talker, 422) == 6 && gg.OwnItemCount(talker, 4327) >= 10) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 422, 10);
myself.DeleteItem1(talker, 4327, gg.OwnItemCount(talker, 4327));
myself.ShowPage(talker, "piotur_q0422_03.htm");
myself.SetFlagJournal(talker, 422, 11);
myself.ShowQuestMark(talker, 422);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 422) == 1 && gg.GetMemoState(talker, 422) == 10) {
myself.SetCurrentQuestID(422);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "piotur_q0422_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 327) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 327);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 327, 1);
gg.AddLog(1, talker, 327);
myself.ShowQuestPage(talker, "piotur_q0327_03.htm", 327);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 221) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 221) {
if (reply == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "piotur_q0221_02.htm");
myself.GiveItem1(talker, 3242, 1);
if (gg.OwnItemCount(talker, 3241) >= 1 && gg.OwnItemCount(talker, 3243) >= 1 && gg.OwnItemCount(talker, 3244) >= 1) {
myself.SetFlagJournal(talker, 221, 2);
myself.ShowQuestMark(talker, 221);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 327) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 327) {
if (reply == 1) {
myself.ShowPage(talker, "piotur_q0327_06.htm");
myself.RemoveMemo(talker, 327);
gg.AddLog(2, talker, 327);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "piotur_q0327_07.htm");

}

}
super;
	}


}