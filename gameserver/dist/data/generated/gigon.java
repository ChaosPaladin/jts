package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gigon extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 405) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Cleric");

}
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1200) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Cleric (In Progress)");

}
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1200) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Cleric (In Progress)");

}
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Cleric (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 0) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 1201) == 0) {
myself.FHTML_SetFileName(fhtml0, "gigon_q0405_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 405);
myself.ShowQuestFHTML(talker, fhtml0, 405);

} else {
myself.ShowQuestPage(talker, "gigon_q0405_04.htm", 405);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1200) == 0) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gigon_q0405_07.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1192) == 1 && gg.OwnItemCount(talker, 1200) == 1) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gigon_q0405_09.htm");
myself.DeleteItem1(talker, 1200, 1);
myself.DeleteItem1(talker, 1192, 1);
myself.GiveItem1(talker, 1201, 1);
myself.RemoveMemo(talker, 405);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 23152);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 28630);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 35328);

}
myself.GiveItem1(talker, 57, 163800);

}
gg.AddLog(2, talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1194) == 1 && gg.OwnItemCount(talker, 1195) > 0 && gg.OwnItemCount(talker, 1196) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gigon_q0405_08.htm");
myself.DeleteItem1(talker, 1196, 1);
myself.DeleteItem1(talker, 1194, 1);
myself.DeleteItem1(talker, 1195, 3);
myself.DeleteItem1(talker, 1191, 1);
myself.GiveItem1(talker, 1192, 1);
myself.SetFlagJournal(talker, 405, 3);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "gigon_q0405_06.htm");

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
if (quest_id == 405) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 18 && talker.occupation == 10 && gg.OwnItemCount(talker, 1201) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 405);
myself.ShowQuestMark(talker, 405);
gg.AddLog(1, talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.GiveItem1(talker, 1191, 1);
myself.SetFlagJournal(talker, 405, 1);
myself.ShowQuestPage(talker, "gigon_q0405_05.htm", 405);

}

} else if (talker.occupation != 10) {
if (talker.occupation == 15) {
myself.ShowQuestPage(talker, "gigon_q0405_02a.htm", 405);

} else {
myself.ShowQuestPage(talker, "gigon_q0405_02.htm", 405);

}

} else if (talker.level < 18 && talker.occupation == 10) {
myself.ShowQuestPage(talker, "gigon_q0405_03.htm", 405);

} else if (talker.level >= 18 && talker.occupation == 10 && gg.OwnItemCount(talker, 1201) == 1) {
myself.ShowQuestPage(talker, "gigon_q0405_04.htm", 405);

}
return;

}
super;
	}


}