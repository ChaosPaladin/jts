package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class redry extends npc_elder {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 3) == 0 && myself.GetOneTimeQuestFlag(talker, 3) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Will the Seal be Broken?");

}
if (gg.HaveMemo(talker, 3) == 0 && myself.GetOneTimeQuestFlag(talker, 3) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Will the Seal be Broken? (Done)");

}
if (gg.HaveMemo(talker, 3) == 1 && myself.GetOneTimeQuestFlag(talker, 3) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Will the Seal be Broken? (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 3) == 0 && myself.GetOneTimeQuestFlag(talker, 3) == 0) {
myself.SetCurrentQuestID(3);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowQuestPage(talker, "redry_q0003_00.htm", 3);

} else if (talker.level >= 16) {
myself.FHTML_SetFileName(fhtml0, "redry_q0003_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 3);
myself.ShowQuestFHTML(talker, fhtml0, 3);

} else {
myself.ShowPage(talker, "redry_q0003_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 3) == 0 && myself.GetOneTimeQuestFlag(talker, 3) == 1) {
myself.SetCurrentQuestID(3);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 3) == 1 && myself.GetOneTimeQuestFlag(talker, 3) == 0) {
myself.SetCurrentQuestID(3);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1081) >= 1 && gg.OwnItemCount(talker, 1082) >= 1 && gg.OwnItemCount(talker, 1083) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 956, 1);
myself.DeleteItem1(talker, 1081, gg.OwnItemCount(talker, 1081));
myself.DeleteItem1(talker, 1082, gg.OwnItemCount(talker, 1082));
myself.DeleteItem1(talker, 1083, gg.OwnItemCount(talker, 1083));
myself.RemoveMemo(talker, 3);
gg.AddLog(2, talker, 3);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 3, 1);
myself.ShowPage(talker, "redry_q0003_06.htm");

}

} else {
myself.ShowPage(talker, "redry_q0003_04.htm");

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
if (quest_id == 3) {
myself.SetCurrentQuestID(3);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 3);
gg.AddLog(1, talker, 3);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "redry_q0003_03.htm", 3);
myself.SetFlagJournal(talker, 3, 1);

}
return;

}
super;
	}


}