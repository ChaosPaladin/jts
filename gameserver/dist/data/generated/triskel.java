package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class triskel extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 411) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Assassin");

}
if (gg.HaveMemo(talker, 411) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Assassin (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 0) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 1252) == 0) {
myself.FHTML_SetFileName(fhtml0, "triskel_q0411_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 411);
myself.ShowQuestFHTML(talker, fhtml0, 411);

} else {
myself.ShowQuestPage(talker, "triskel_q0411_04.htm", 411);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 411) == 1) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 1 && gg.OwnItemCount(talker, 1252) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "triskel_q0411_06.htm");
myself.DeleteItem1(talker, 1251, 1);
myself.GiveItem1(talker, 1252, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 35830);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 35830);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 42528);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 411);
gg.AddLog(2, talker, 411);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

} else if (gg.OwnItemCount(talker, 1246) == 1 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "triskel_q0411_07.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 1 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "triskel_q0411_08.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "triskel_q0411_09.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 1 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 0) {
myself.ShowPage(talker, "triskel_q0411_10.htm");

} else if (gg.OwnItemCount(talker, 1246) == 0 && gg.OwnItemCount(talker, 1247) == 0 && gg.OwnItemCount(talker, 1250) == 0 && gg.OwnItemCount(talker, 1251) == 0 && gg.OwnItemCount(talker, 1252) == 0 && gg.OwnItemCount(talker, 1245) == 1) {
myself.ShowPage(talker, "triskel_q0411_11.htm");

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
if (quest_id == 411) {
myself.SetCurrentQuestID(411);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 18 && talker.occupation == 31 && gg.OwnItemCount(talker, 1252) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 411);
myself.ShowQuestMark(talker, 411);
gg.AddLog(1, talker, 411);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1245, 1);
myself.SetFlagJournal(talker, 411, 1);
myself.ShowQuestPage(talker, "triskel_q0411_05.htm", 411);

}

} else if (talker.occupation != 31) {
if (talker.occupation == 35) {
myself.ShowQuestPage(talker, "triskel_q0411_02a.htm", 411);

} else {
myself.ShowQuestPage(talker, "triskel_q0411_02.htm", 411);

}

} else if (talker.level < 18 && talker.occupation == 31) {
myself.ShowQuestPage(talker, "triskel_q0411_03.htm", 411);

} else if (talker.level >= 18 && talker.occupation == 31 && gg.OwnItemCount(talker, 1252) == 1) {
myself.ShowQuestPage(talker, "triskel_q0411_04.htm", 411);

}
return;

}
super;
	}


}