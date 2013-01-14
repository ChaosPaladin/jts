package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_virgil extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 410) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Palus Knight");

}
if (gg.HaveMemo(talker, 410) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Palus Knight (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 410) == 0) {
myself.SetCurrentQuestID(410);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "master_virgil_q0410_01.htm", 410);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 410) == 1) {
myself.SetCurrentQuestID(410);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1237) == 1 && gg.OwnItemCount(talker, 1238) == 0) {
myself.ShowPage(talker, "master_virgil_q0410_07.htm");

} else if (gg.OwnItemCount(talker, 1237) == 1 && gg.OwnItemCount(talker, 1238) > 0 && gg.OwnItemCount(talker, 1238) < 13) {
myself.ShowPage(talker, "master_virgil_q0410_08.htm");

} else if (gg.OwnItemCount(talker, 1237) == 1 && gg.OwnItemCount(talker, 1238) >= 13) {
myself.ShowPage(talker, "master_virgil_q0410_09.htm");

} else if (gg.OwnItemCount(talker, 1243) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_virgil_q0410_11.htm");
myself.DeleteItem1(talker, 1243, 1);
myself.DeleteItem1(talker, 1240, gg.OwnItemCount(talker, 1240));
myself.GiveItem1(talker, 1244, 1);
if (myself.GetOneTimeQuestFlag(talker, 145) == 0) {
myself.SetOneTimeQuestFlag(talker, 145, 1);
if (talker.level >= 20) {
myself.IncrementParam(talker, 0, 320534);
myself.IncrementParam(talker, 1, 26212);

} else if (talker.level == 19) {
myself.IncrementParam(talker, 0, 456128);
myself.IncrementParam(talker, 1, 32910);

} else {
myself.IncrementParam(talker, 0, 591724);
myself.IncrementParam(talker, 1, 39608);

}
myself.GiveItem1(talker, 57, 163800);

}
myself.RemoveMemo(talker, 410);
gg.AddLog(2, talker, 410);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);

}

} else if (gg.OwnItemCount(talker, 1240) || gg.OwnItemCount(talker, 1239)) {
myself.ShowPage(talker, "master_virgil_q0410_12.htm");

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
if (quest_id == 410) {
myself.SetCurrentQuestID(410);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 410);
myself.ShowQuestMark(talker, 410);
gg.AddLog(1, talker, 410);
myself.SetFlagJournal(talker, 410, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "master_virgil_q0410_06.htm", 410);
myself.GiveItem1(talker, 1237, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 410) {
myself.SetCurrentQuestID(410);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 410) {
if (reply == 1) {
if (talker.level >= 18 && talker.occupation == 31 && gg.OwnItemCount(talker, 1244) == 0) {
myself.FHTML_SetFileName(fhtml0, "master_virgil_q0410_05.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 410);
myself.ShowQuestFHTML(talker, fhtml0, 410);

} else if (talker.occupation != 31) {
if (talker.occupation == 32) {
myself.ShowQuestPage(talker, "master_virgil_q0410_02a.htm", 410);

} else {
myself.ShowQuestPage(talker, "master_virgil_q0410_03.htm", 410);

}

} else if (talker.level < 18 && talker.occupation == 31) {
myself.ShowQuestPage(talker, "master_virgil_q0410_02.htm", 410);

} else if (talker.level >= 18 && talker.occupation == 31 && gg.OwnItemCount(talker, 1244) == 1) {
myself.ShowQuestPage(talker, "master_virgil_q0410_04.htm", 410);

}

} else if (reply == 2 && gg.OwnItemCount(talker, 1237) > 0 && gg.OwnItemCount(talker, 1238) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "master_virgil_q0410_10.htm");
myself.DeleteItem1(talker, 1237, 1);
myself.DeleteItem1(talker, 1238, gg.OwnItemCount(talker, 1238));
myself.GiveItem1(talker, 1239, 1);
myself.SetFlagJournal(talker, 410, 3);
myself.ShowQuestMark(talker, 410);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}