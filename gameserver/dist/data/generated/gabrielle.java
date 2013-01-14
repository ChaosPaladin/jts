package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gabrielle extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 337) == 0 && talker.level < 50) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Audience with the Land Dragon ");

}
if (gg.HaveMemo(talker, 337) == 0 && talker.level >= 50) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Audience with the Land Dragon ");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 20000 && gg.GetMemoState(talker, 337) < 30000) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 30000) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 40000 && gg.GetMemoState(talker, 337) < 50000) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 50000) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 60000) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Audience with the Land Dragon  (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 1 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 1 * 10 + 1 && talker.subjob_id == 0) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1 && talker.subjob_id != 0) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Path of the Noblesse, Possessor of a Precious Soul - 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 0 && talker.level < 50) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "gabrielle_q0337_01.htm", 337);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 0 && talker.level >= 50) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "gabrielle_q0337_02.htm", 337);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 20000 && gg.GetMemoState(talker, 337) < 30000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gabrielle_q0337_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 30000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gabrielle_q0337_08.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) >= 40000 && gg.GetMemoState(talker, 337) < 50000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gabrielle_q0337_10.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 50000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3890, 1);
myself.DeleteItem1(talker, 3852, gg.OwnItemCount(talker, 3852));
myself.DeleteItem1(talker, 3864, gg.OwnItemCount(talker, 3864));
myself.SetMemoState(talker, 337, 60000);
myself.SetJournal(talker, 337, 3);
myself.ShowQuestMark(talker, 337);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "gabrielle_q0337_11.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 60000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gabrielle_q0337_12.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 337) == 1 && gg.GetMemoState(talker, 337) == 70000) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gabrielle_q0337_13.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 1 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 241, 1);
myself.ShowPage(talker, "gabrielle_q0241_0101.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && myself.GetOneTimeQuestFlag(talker, 241) == 0 && gg.GetMemoState(talker, 241) == 1 * 10 + 1 && talker.subjob_id == 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "quest_not_subclass001.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1 && talker.subjob_id != 0) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gabrielle_q0241_0202.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || talker.subjob_id == 0 && gg.HaveMemo(talker, 241) == 1 && gg.GetMemoState(talker, 241) == 2 * 10 + 1) {
myself.SetCurrentQuestID(241);
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
if (quest_id == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 3852, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 337);
gg.AddLog(1, talker, 337);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "gabrielle_q0337_05.htm", 337);
myself.SetMemoState(talker, 337, 20000);
myself.SetJournal(talker, 337, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 337) {
myself.SetCurrentQuestID(337);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 337) {
if (reply == 1) {
myself.ShowQuestPage(talker, "gabrielle_q0337_03.htm", 337);

}
if (reply == 2) {
myself.FHTML_SetFileName(fhtml0, "gabrielle_q0337_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 337);
myself.ShowQuestFHTML(talker, fhtml0, 337);

}
if (reply == 3) {
myself.DeleteItem1(talker, 3864, gg.OwnItemCount(talker, 3864));
myself.SetMemoState(talker, 337, 40000);
myself.SetJournal(talker, 337, 2);
myself.ShowQuestMark(talker, 337);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "gabrielle_q0337_09.htm");

}

}
if (ask == 241) {
myself.SetCurrentQuestID(241);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 241) {
i0 = myself.GetHTMLCookie(talker, 241, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 241) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gabrielle_q0241_0201.htm");
myself.SetMemoState(talker, 241, 2 * 10 + 1);
myself.SetFlagJournal(talker, 241, 2);
myself.ShowQuestMark(talker, 241);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}