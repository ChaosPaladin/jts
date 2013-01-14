package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elliasin extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 316) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Destroy Plague Carriers");

}
if (gg.HaveMemo(talker, 316)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Destroy Plague Carriers (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 316) == 0) {
myself.SetCurrentQuestID(316);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1) {
myself.ShowQuestPage(talker, "elliasin_q0316_00.htm", 316);

} else if (talker.level >= 18) {
myself.FHTML_SetFileName(fhtml0, "elliasin_q0316_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 316);
myself.ShowQuestFHTML(talker, fhtml0, 316);

} else {
myself.ShowQuestPage(talker, "elliasin_q0316_02.htm", 316);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 316)) {
myself.SetCurrentQuestID(316);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1042) >= 1 || gg.OwnItemCount(talker, 1043) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "elliasin_q0316_07.htm");
if (gg.OwnItemCount(talker, 1042) + gg.OwnItemCount(talker, 1043) >= 10) {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1042) * 30 + gg.OwnItemCount(talker, 1043) * 10000 + 5000);

} else {
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 1042) * 30 + gg.OwnItemCount(talker, 1043) * 10000);

}
myself.DeleteItem1(talker, 1042, gg.OwnItemCount(talker, 1042));
myself.DeleteItem1(talker, 1043, gg.OwnItemCount(talker, 1043));
gg.AddLog(3, talker, 316);

}

} else {
myself.ShowPage(talker, "elliasin_q0316_05.htm");

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
if (quest_id == 316) {
myself.SetCurrentQuestID(316);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "elliasin_q0316_04.htm", 316);
myself.SetMemo(talker, 316);
myself.ShowQuestMark(talker, 316);
myself.SetFlagJournal(talker, 316, 1);
gg.AddLog(1, talker, 316);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 316) {
myself.SetCurrentQuestID(316);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 316) {
if (reply == 2) {
myself.RemoveMemo(talker, 316);
gg.AddLog(2, talker, 316);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elliasin_q0316_08.htm");

} else if (reply == 3) {
myself.ShowPage(talker, "elliasin_q0316_09.htm");

}

}
super;
	}


}