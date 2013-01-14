package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mystery_darkelf extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) >= 1 && gg.OwnItemCount(talker, 2817) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) >= 1 && gg.OwnItemCount(talker, 2817) >= 1 && gg.OwnItemCount(talker, 2818) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) >= 1 && gg.OwnItemCount(talker, 2817) >= 1 && gg.OwnItemCount(talker, 2818) >= 1 && gg.OwnItemCount(talker, 2819) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Test of the Healer (In Progress)");

}
if (gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2817) + gg.OwnItemCount(talker, 2818) + gg.OwnItemCount(talker, 2819) + gg.OwnItemCount(talker, 2816) == 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) >= 1 && gg.OwnItemCount(talker, 2817) == 0) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mystery_darkelf_q0226_01.htm");
myself.SetFlagJournal(talker, 226, 14);
myself.ShowQuestMark(talker, 226);
if (myself.Maker_GetNpcCount() < 36) {
myself.CreateOnePrivate(1027124, "leto_lizardman_assassin", 0, 1);
myself.CreateOnePrivate(1027124, "leto_lizardman_assassin", 0, 1);
myself.CreateOnePrivate(1027124, "leto_lizardman_assassin", 0, 1);
myself.SoundEffect(talker, "Itemsound.quest_before_battle");
myself.AddTimerEx(22607, 1000 * 10);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) >= 1 && gg.OwnItemCount(talker, 2817) >= 1 && gg.OwnItemCount(talker, 2818) == 0) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mystery_darkelf_q0226_02.htm");
myself.SetFlagJournal(talker, 226, 16);
myself.ShowQuestMark(talker, 226);
if (myself.Maker_GetNpcCount() < 36) {
myself.CreateOnePrivate(1027125, "leto_lizardman_sniper", 0, 1);
myself.CreateOnePrivate(1027125, "leto_lizardman_sniper", 0, 1);
myself.CreateOnePrivate(1027125, "leto_lizardman_sniper", 0, 1);
myself.SoundEffect(talker, "Itemsound.quest_before_battle");
myself.AddTimerEx(22607, 1000 * 10);

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2816) >= 1 && gg.OwnItemCount(talker, 2817) >= 1 && gg.OwnItemCount(talker, 2818) >= 1 && gg.OwnItemCount(talker, 2819) == 0) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mystery_darkelf_q0226_03.htm");
myself.SetFlagJournal(talker, 226, 18);
myself.ShowQuestMark(talker, 226);
if (myself.Maker_GetNpcCount() < 36) {
myself.CreateOnePrivate(1027126, "leto_lizardman_wizard", 0, 1);
myself.CreateOnePrivate(1027126, "leto_lizardman_wizard", 0, 1);
myself.CreateOnePrivate(1027127, "leto_lizardman_lord", 0, 1);
myself.SoundEffect(talker, "Itemsound.quest_before_battle");
myself.AddTimerEx(22607, 1000 * 10);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1 && gg.GetMemoState(talker, 226) == 8 && gg.OwnItemCount(talker, 2817) + gg.OwnItemCount(talker, 2818) + gg.OwnItemCount(talker, 2819) + gg.OwnItemCount(talker, 2816) == 4) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "mystery_darkelf_q0226_04.htm");
myself.SetFlagJournal(talker, 226, 20);
myself.ShowQuestMark(talker, 226);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(226);
if (timer_id == 22607) {
myself.Despawn();

}
super;
	}


}