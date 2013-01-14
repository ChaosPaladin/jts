package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magister_ladd extends wizard_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 235) == 0 && myself.GetOneTimeQuestFlag(talker, 235) == 0 && talker.race != 5) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Mimir's Elixir");

}
if (gg.HaveMemo(talker, 235) == 0 && myself.GetOneTimeQuestFlag(talker, 235) == 0 && talker.race == 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Mimir's Elixir");

}
if (gg.HaveMemo(talker, 235) == 0 && myself.GetOneTimeQuestFlag(talker, 235) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Mimir's Elixir (Done)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 1 && gg.OwnItemCount(talker, 6320) < 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 1 && gg.OwnItemCount(talker, 6320) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) >= 2 && gg.GetMemoState(talker, 235) < 5) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 5) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) >= 6 && gg.GetMemoState(talker, 235) < 8) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 8) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Mimir's Elixir (In Progress)");

}
if (gg.HaveMemo(talker, 246) == 1 && gg.OwnItemCount(talker, 7594) >= 1 && gg.GetMemoState(talker, 246) == 4 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path of the Noblesse, Possessor of a Precious Soul - 3 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 246) == 1 && gg.GetMemoState(talker, 246) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Noblesse, Possessor of a Precious Soul - 3 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 0 && myself.GetOneTimeQuestFlag(talker, 235) == 0 && talker.race != 5) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 75 && gg.OwnItemCount(talker, 5011) >= 1) {
myself.ShowQuestPage(talker, "magister_ladd_q0235_01.htm", 235);

} else if (talker.level >= 75 && gg.OwnItemCount(talker, 5011) < 1) {
myself.ShowPage(talker, "magister_ladd_q0235_01b.htm");

} else if (talker.level < 75) {
myself.ShowPage(talker, "magister_ladd_q0235_01a.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 0 && myself.GetOneTimeQuestFlag(talker, 235) == 0 && talker.race == 5) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_01c.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 0 && myself.GetOneTimeQuestFlag(talker, 235) == 1) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 1 && gg.OwnItemCount(talker, 6320) < 1) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_07.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 1 && gg.OwnItemCount(talker, 6320) >= 1) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_08.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) >= 2 && gg.GetMemoState(talker, 235) < 5) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_10.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 5) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_11.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) >= 6 && gg.GetMemoState(talker, 235) < 8) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_13.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 8) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magister_ladd_q0235_14.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 246) == 1 && gg.OwnItemCount(talker, 7594) >= 1 && gg.GetMemoState(talker, 246) == 4 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(246);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 246, 4);
myself.ShowPage(talker, "magister_ladd_q0246_0401.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 246) == 1 && gg.GetMemoState(talker, 246) == 4 * 10 + 1) {
myself.SetCurrentQuestID(246);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 235) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (talker.level >= 75 && gg.OwnItemCount(talker, 5011) >= 1 && myself.GetOneTimeQuestFlag(talker, 235) == 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 235);
myself.SetMemoState(talker, 235, 1);
myself.SetFlagJournal(talker, 235, 1);
gg.AddLog(1, talker, 235);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "magister_ladd_q0235_06.htm", 235);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 235) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 235) {
if (reply == 1) {
myself.ShowQuestPage(talker, "magister_ladd_q0235_02.htm", 235);

}
if (reply == 2) {
myself.ShowQuestPage(talker, "magister_ladd_q0235_03.htm", 235);

}
if (reply == 3) {
myself.ShowQuestPage(talker, "magister_ladd_q0235_04.htm", 235);

}
if (reply == 4 && gg.HaveMemo(talker, 235) == 0) {
myself.FHTML_SetFileName(fhtml0, "magister_ladd_q0235_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 235);
myself.ShowQuestFHTML(talker, fhtml0, 235);

}
if (reply == 5 && gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 1) {
myself.SetMemoState(talker, 235, 2);
myself.SetFlagJournal(talker, 235, 2);
myself.ShowQuestMark(talker, 235);
myself.ShowPage(talker, "magister_ladd_q0235_09.htm");

}
if (reply == 6 && gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5905, 1);
myself.SetMemoState(talker, 235, 6);
myself.SetFlagJournal(talker, 235, 6);
myself.ShowQuestMark(talker, 235);
myself.ShowPage(talker, "magister_ladd_q0235_12.htm");

}

}
if (reply == 7 && gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 8) {
myself.ShowPage(talker, "magister_ladd_q0235_15.htm");

}
if (reply == 8 && gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 8 && gg.OwnItemCount(talker, 5905) >= 1 && gg.OwnItemCount(talker, 6319) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
myself.AddUseSkillDesire(talker, 284360705, 0, 0, 1000000);
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5905, gg.OwnItemCount(talker, 5905));
myself.DeleteItem1(talker, 6319, gg.OwnItemCount(talker, 6319));
myself.DeleteItem1(talker, 5011, gg.OwnItemCount(talker, 5011));
myself.GiveItem1(talker, 729, 1);
myself.RemoveMemo(talker, 235);
gg.AddLog(2, talker, 235);
myself.SetOneTimeQuestFlag(talker, 235, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_ladd_q0235_16.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}

}
if (ask == 246) {
myself.SetCurrentQuestID(246);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 246 && myself.GetOneTimeQuestFlag(talker, 246) == 0) {
i0 = myself.GetHTMLCookie(talker, 246, 5 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 246) == 1 && myself.GetOneTimeQuestFlag(talker, 246) == 0) {
if (gg.OwnItemCount(talker, 7594) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7594, gg.OwnItemCount(talker, 7594));
myself.GiveItem1(talker, 7679, 1);
myself.IncrementParam(talker, 0, 719843);

}
gg.AddLog(2, talker, 246);
myself.RemoveMemo(talker, 246);
myself.SetOneTimeQuestFlag(talker, 246, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "magister_ladd_q0246_0501.htm");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

} else {
myself.ShowPage(talker, "magister_ladd_q0246_0502.htm");

}

}

}

}
super;
	}


}