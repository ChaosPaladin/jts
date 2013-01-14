package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class priest_eliyah extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 636) == 0 && talker.level >= 73 && gg.OwnItemCount(talker, 8064) == 0 && gg.OwnItemCount(talker, 8065) == 0 && gg.OwnItemCount(talker, 8067) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Truth Beyond the Gate");

}
if (gg.HaveMemo(talker, 636) == 0 && talker.level >= 73 && gg.OwnItemCount(talker, 8064) >= 1 || gg.OwnItemCount(talker, 8065) >= 1 || gg.OwnItemCount(talker, 8067) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Truth Beyond the Gate");

}
if (gg.HaveMemo(talker, 636) == 0 && talker.level < 73) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Truth Beyond the Gate");

}
if (gg.HaveMemo(talker, 636) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Truth Beyond the Gate (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 636) == 0 && talker.level >= 73 && gg.OwnItemCount(talker, 8064) == 0 && gg.OwnItemCount(talker, 8065) == 0 && gg.OwnItemCount(talker, 8067) == 0) {
myself.SetCurrentQuestID(636);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "priest_eliyah_q0636_01.htm", 636);

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 636) == 0 && talker.level >= 73 && gg.OwnItemCount(talker, 8064) >= 1 || gg.OwnItemCount(talker, 8065) >= 1 || gg.OwnItemCount(talker, 8067) >= 1) {
myself.SetCurrentQuestID(636);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "priest_eliyah_q0636_02.htm", 636);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 636) == 0 && talker.level < 73) {
myself.SetCurrentQuestID(636);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "priest_eliyah_q0636_03.htm", 636);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 636) == 1) {
myself.SetCurrentQuestID(636);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "priest_eliyah_q0636_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 636) {
myself.SetCurrentQuestID(636);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 636) == 0 && talker.level >= 73 && gg.OwnItemCount(talker, 8064) == 0 && gg.OwnItemCount(talker, 8065) == 0 && gg.OwnItemCount(talker, 8067) == 0) {
myself.SetMemo(talker, quest_id);
myself.SetFlagJournal(talker, 636, 1);
myself.ShowQuestMark(talker, 636);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "priest_eliyah_q0636_05.htm", 636);
gg.AddLog(1, talker, quest_id);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 636) {
myself.SetCurrentQuestID(636);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 636) {
if (reply == 1) {
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "priest_eliyah_q0636_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 636);
myself.ShowQuestFHTML(talker, fhtml0, 636);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}

}
super;
	}


}