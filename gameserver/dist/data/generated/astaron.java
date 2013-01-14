package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class astaron extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 324) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sweetest Venom");

}
if (gg.HaveMemo(talker, 324) == 1 && gg.OwnItemCount(talker, 1077) < 10) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sweetest Venom (In Progress)");

}
if (gg.HaveMemo(talker, 324) == 1 && gg.OwnItemCount(talker, 1077) >= 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sweetest Venom (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 324) == 0) {
myself.SetCurrentQuestID(324);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 18) {
myself.FHTML_SetFileName(fhtml1, "astaron_q0324_03.htm");
myself.FHTML_SetInt(fhtml1, "quest_id", 324);
myself.ShowQuestFHTML(talker, fhtml1, 324);

} else {
myself.ShowQuestPage(talker, "astaron_q0324_02.htm", 324);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 324) == 1 && gg.OwnItemCount(talker, 1077) < 10) {
myself.SetCurrentQuestID(324);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "astaron_q0324_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 324) == 1 && gg.OwnItemCount(talker, 1077) >= 10) {
myself.SetCurrentQuestID(324);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1077, gg.OwnItemCount(talker, 1077));
myself.GiveItem1(talker, 57, 5810);
myself.RemoveMemo(talker, 324);
gg.AddLog(2, talker, 324);
gg.AddLog(3, talker, 324);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "astaron_q0324_06.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 324) {
myself.SetCurrentQuestID(324);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "astaron_q0324_04.htm", 324);
myself.SetMemo(talker, 324);
myself.ShowQuestMark(talker, 324);
myself.SetFlagJournal(talker, 324, 1);
gg.AddLog(1, talker, 324);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}