package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class edmond extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 259) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Request from the Farm Owner");

}
if (gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Request from the Farm Owner (In Progress)");

}
if (gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Request from the Farm Owner (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 259) == 0) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "edmond_q0259_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 259);
myself.ShowQuestFHTML(talker, fhtml0, 259);

} else {
myself.ShowQuestPage(talker, "edmond_q0259_01.htm", 259);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) < 1) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "edmond_q0259_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 259) == 1 && gg.OwnItemCount(talker, 1495) >= 1) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "edmond_q0259_05.htm");
if (gg.OwnItemCount(talker, 1495) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1495) * 25 + 250);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1495) * 25);

}
myself.DeleteItem1(talker, 1495, gg.OwnItemCount(talker, 1495));
gg.AddLog(3, talker, 259);

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
if (quest_id == 259) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 259);
myself.ShowQuestMark(talker, 259);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 259, 1);
gg.AddLog(1, talker, 259);
myself.SetFlagJournal(talker, 259, 1);
myself.ShowQuestPage(talker, "edmond_q0259_03.htm", 259);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 259) {
myself.SetCurrentQuestID(259);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 259) {
if (reply == 1) {
myself.ShowPage(talker, "edmond_q0259_06.htm");
myself.RemoveMemo(talker, 259);
gg.AddLog(2, talker, 259);
myself.SoundEffect(talker, "ItemSound.quest_finish");

} else if (reply == 2) {
myself.ShowPage(talker, "edmond_q0259_07.htm");

}

}
super;
	}


}