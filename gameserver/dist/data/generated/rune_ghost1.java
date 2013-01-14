package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rune_ghost1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3 && gg.GetMemoStateEx(talker, 21, 1) <= 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3 && gg.GetMemoStateEx(talker, 21, 1) > 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) >= 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Hidden Truth (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9 && gg.OwnItemCount(talker, 7149) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Lidia's Heart (In Progress)");

}
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9 || gg.GetMemoState(talker, 23) == 10 && gg.OwnItemCount(talker, 7149) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Lidia's Heart (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 1) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost1_q0021_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3 && gg.GetMemoStateEx(talker, 21, 1) <= 20) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.av_quest0.GetValue() <= 5) {
myself.ShowPage(talker, "rune_ghost1_q0021_07.htm");
myself.CreateOnePrivateEx(1031525, "rune_ghost1b", 0, 0, 51446, -54514, -3136, 0, gg.GetIndexFromCreature(talker), 0, myself.sm.id);
myself.av_quest0.Increment(1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 1);
myself.SetFlagJournal(talker, 21, 3);
myself.ShowQuestMark(talker, 21);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "rune_ghost1_q0021_07a.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3 && gg.GetMemoStateEx(talker, 21, 1) > 20) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost1_q0021_07b.htm");
myself.SetFlagJournal(talker, 21, 4);
myself.ShowQuestMark(talker, 21);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) >= 4) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost1_q0021_07c.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost1_q0023_01.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9 && gg.OwnItemCount(talker, 7149) == 0) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "rune_ghost1_q0023_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 9 || gg.GetMemoState(talker, 23) == 10 && gg.OwnItemCount(talker, 7149) >= 1) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 23, 10);
myself.ShowPage(talker, "rune_ghost1_q0023_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(21);
if (timer_id == 2101) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(21);
myself.AddTimerEx(2101, 1000 * 300);
myself.Say(gg.MakeFString(2150, "", "", "", "", ""));
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 21) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 21) {
if (reply == 3) {
if (myself.av_quest0.GetValue() <= 5) {
myself.SetMemoState(talker, 21, 3);
myself.ShowPage(talker, "rune_ghost1_q0021_06.htm");
myself.CreateOnePrivateEx(1031525, "rune_ghost1b", 0, 0, 51446, -54514, -3136, 0, gg.GetIndexFromCreature(talker), 0, myself.sm.id);
myself.av_quest0.Increment(1);
myself.SetMemoStateEx(talker, 21, 1, gg.GetMemoStateEx(talker, 21, 1) + 1);
myself.SetFlagJournal(talker, 21, 3);
myself.ShowQuestMark(talker, 21);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowPage(talker, "rune_ghost1_q0021_06a.htm");

}

}

}
if (ask == 23) {
myself.SetCurrentQuestID(23);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 23) {
if (reply == 23) {
myself.ShowPage(talker, "rune_ghost1_q0023_02.htm");
myself.SoundEffect(talker, "ChrSound.MHFighter_cry");

}
if (reply == 24) {
myself.ShowPage(talker, "rune_ghost1_q0023_03.htm");

}
if (reply == 25) {
if (gg.HaveMemo(talker, 23) == 1 && gg.GetMemoState(talker, 23) == 8) {
myself.DeleteItem1(talker, 7064, gg.OwnItemCount(talker, 7064));
myself.SetMemoState(talker, 23, 9);
myself.ShowPage(talker, "rune_ghost1_q0023_04.htm");
myself.SetFlagJournal(talker, 23, 7);
myself.ShowQuestMark(talker, 23);

}

}

}
super;
	}


}