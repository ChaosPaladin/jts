package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barbado extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 364) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jovial Accordion");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) >= 1 && gg.GetMemoState(talker, 364) < 5) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 5) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 5 || gg.GetMemoState(talker, 363) == 6) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Sorrowful Sound of Flute (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 0) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "barbado_q0364_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 364);
myself.ShowQuestFHTML(talker, fhtml0, 364);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) >= 1 && gg.GetMemoState(talker, 364) < 5) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "barbado_q0364_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.GetMemoState(talker, 364) == 5) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4421, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.RemoveMemo(talker, 364);
gg.AddLog(3, talker, 364);
myself.ShowPage(talker, "barbado_q0364_05.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 4) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 363, 1) % 10 * 20;
if (gg.Rand(100) < i0) {
if (gg.OwnItemCount(talker, 4318) > 0) {
myself.DeleteItem1(talker, 4318, 1);

}
if (gg.OwnItemCount(talker, 4319) > 0) {
myself.DeleteItem1(talker, 4319, 1);

}
if (gg.OwnItemCount(talker, 4320) > 0) {
myself.DeleteItem1(talker, 4320, 1);

}
myself.SetMemoState(talker, 363, 5);
myself.SetJournal(talker, 363, 4);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "barbado_q0363_01.htm");

} else {
myself.SetMemoState(talker, 363, 6);
myself.SetJournal(talker, 363, 4);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "barbado_q0363_02.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 5 || gg.GetMemoState(talker, 363) == 6) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "barbado_q0363_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 364) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 15) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "barbado_q0364_02.htm", 364);
myself.SetMemoState(talker, 364, 1);
myself.SetFlagJournal(talker, 364, 1);
gg.AddLog(1, talker, 364);

}

} else {
myself.ShowQuestPage(talker, "barbado_q0364_03.htm", 364);

}
return;

}
super;
	}


}