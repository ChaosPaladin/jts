package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_praga extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Cleric (In Progress)");

}
if (talker.level >= 25 && gg.HaveMemo(talker, 298) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Lizardmen's Conspiracy");

}
if (talker.level < 25 && gg.HaveMemo(talker, 298) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Lizardmen's Conspiracy");

}
if (gg.HaveMemo(talker, 298) == 1 && gg.GetMemoState(talker, 298) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "The Lizardmen's Conspiracy (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1196) == 0 && gg.OwnItemCount(talker, 1199) == 0) {
myself.ShowPage(talker, "guard_praga_q0405_01.htm");
myself.GiveItem1(talker, 1199, 1);

} else if (gg.OwnItemCount(talker, 1196) == 0 && gg.OwnItemCount(talker, 1199) == 1 && gg.OwnItemCount(talker, 1198) == 0) {
myself.ShowPage(talker, "guard_praga_q0405_02.htm");

} else if (gg.OwnItemCount(talker, 1196) == 0 && gg.OwnItemCount(talker, 1199) == 1 && gg.OwnItemCount(talker, 1198) == 1) {
myself.ShowPage(talker, "guard_praga_q0405_03.htm");
myself.DeleteItem1(talker, 1199, 1);
myself.DeleteItem1(talker, 1198, 1);
myself.GiveItem1(talker, 1196, 1);
if (gg.OwnItemCount(talker, 1195) >= 3 && gg.OwnItemCount(talker, 1194) >= 1 && gg.OwnItemCount(talker, 1196) >= 0) {
myself.SetFlagJournal(talker, 405, 2);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 1196) > 0) {
myself.ShowPage(talker, "guard_praga_q0405_04.htm");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level >= 25 && gg.HaveMemo(talker, 298) == 0) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guard_praga_q0298_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 298);
myself.ShowQuestFHTML(talker, fhtml0, 298);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level < 25 && gg.HaveMemo(talker, 298) == 0) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "guard_praga_q0298_0103.htm", 298);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 298) == 1 && gg.GetMemoState(talker, 298) == 1 * 10 + 1) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_praga_q0298_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 298) {
myself.SetCurrentQuestID(298);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 298);
myself.ShowQuestMark(talker, 298);
myself.SetMemoState(talker, 298, 1 * 10 + 1);
gg.AddLog(1, talker, 298);
myself.SetFlagJournal(talker, 298, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_praga_q0298_0104.htm", 298);
myself.GiveItem1(talker, 7182, 1);

}
return;

}
super;
	}


}