package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandmagister_tifaren extends master_lv3_de {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Tragedy in Von Hellmann Forest");

}
if (gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Tragedy in Von Hellmann Forest (Done)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 2 && gg.OwnItemCount(talker, 7141) >= 1 && gg.OwnItemCount(talker, 7142) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 2 && gg.OwnItemCount(talker, 7141) >= 1 && gg.OwnItemCount(talker, 7142) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 4 && gg.OwnItemCount(talker, 7141) >= 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 5 && gg.OwnItemCount(talker, 7141) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Tragedy in Von Hellmann Forest (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "grandmagister_tifaren_q0022_01.htm", 22);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_tifaren_q0022_05.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 2 && gg.OwnItemCount(talker, 7141) >= 1 && gg.OwnItemCount(talker, 7142) == 0) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_tifaren_q0022_09.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 2 && gg.OwnItemCount(talker, 7141) >= 1 && gg.OwnItemCount(talker, 7142) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.i_quest0 == 0) {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_10.htm");

} else {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_11.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 4 && gg.OwnItemCount(talker, 7141) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.i_quest0 == 1) {
if (myself.i_quest1 == talker.dbid) {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_15.htm");

} else {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_16.htm");
myself.SetFlagJournal(talker, 22, 6);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_17.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 5 && gg.OwnItemCount(talker, 7141) >= 1) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "grandmagister_tifaren_q0022_19.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1 && talker.level >= 63) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 22, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "grandmagister_tifaren_q0022_04.htm", 22);
myself.SetFlagJournal(talker, 22, 1);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 22) {
myself.SetCurrentQuestID(22);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 22) {
if (reply == 1) {
if (myself.GetMemoCount(talker) < 41) {
if (gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 1 && talker.level >= 63) {
myself.FHTML_SetFileName(fhtml0, "grandmagister_tifaren_q0022_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 22);
myself.ShowQuestFHTML(talker, fhtml0, 22);

}
if (gg.HaveMemo(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 22) == 0 && myself.GetOneTimeQuestFlag(talker, 21) == 0 || talker.level < 63) {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_03.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 1 && gg.OwnItemCount(talker, 7141) >= 1) {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_06.htm");

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 1 && gg.OwnItemCount(talker, 7141) == 0) {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_07.htm");
myself.SetFlagJournal(talker, 22, 2);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 1 && gg.OwnItemCount(talker, 7141) >= 1) {
myself.SetMemoState(talker, 22, 2);
myself.ShowPage(talker, "grandmagister_tifaren_q0022_08.htm");
myself.SetFlagJournal(talker, 22, 4);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_12.htm");

}
if (reply == 5) {
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 2 && gg.OwnItemCount(talker, 7141) >= 1 && gg.OwnItemCount(talker, 7142) >= 1) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.CreateOnePrivateEx(1031528, "rune_ghost2", 0, 0, 38354, -49777, -1128, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);
myself.DeleteItem1(talker, 7142, gg.OwnItemCount(talker, 7142));
myself.SetMemoState(talker, 22, 4);
myself.ShowPage(talker, "grandmagister_tifaren_q0022_13.htm");
myself.SetFlagJournal(talker, 22, 7);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_14.htm");
myself.SetFlagJournal(talker, 22, 6);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (gg.HaveMemo(talker, 22) == 1 && gg.GetMemoState(talker, 22) == 4 && gg.OwnItemCount(talker, 7141) >= 1) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.i_quest1 = talker.dbid;
myself.CreateOnePrivateEx(1031528, "rune_ghost2", 0, 0, 38354, -49777, -1128, 0, gg.GetIndexFromCreature(talker), talker.dbid, myself.sm.id);
myself.ShowPage(talker, "grandmagister_tifaren_q0022_13.htm");

} else {
myself.ShowPage(talker, "grandmagister_tifaren_q0022_14.htm");
myself.SetFlagJournal(talker, 22, 6);
myself.ShowQuestMark(talker, 22);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}