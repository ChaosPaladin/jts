package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class vlasti extends mage_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 169) == 0 && myself.GetOneTimeQuestFlag(talker, 169) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Offspring of Nightmares");

}
if (gg.HaveMemo(talker, 169) == 0 && myself.GetOneTimeQuestFlag(talker, 169) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Offspring of Nightmares (Done)");

}
if (gg.HaveMemo(talker, 169)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Offspring of Nightmares (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 169) == 0 && myself.GetOneTimeQuestFlag(talker, 169) == 0) {
myself.SetCurrentQuestID(169);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 2) {
myself.ShowPage(talker, "vlasti_q0326_00.htm");

} else if (talker.level >= 15) {
myself.FHTML_SetFileName(fhtml0, "vlasti_q0326_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 169);
myself.ShowQuestFHTML(talker, fhtml0, 169);

} else {
myself.ShowQuestPage(talker, "vlasti_q0326_02.htm", 169);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 169) == 0 && myself.GetOneTimeQuestFlag(talker, 169) == 1) {
myself.SetCurrentQuestID(169);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 169)) {
myself.SetCurrentQuestID(169);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1030) >= 1 && gg.OwnItemCount(talker, 1031) == 0) {
myself.ShowPage(talker, "vlasti_q0326_06.htm");

} else if (gg.OwnItemCount(talker, 1031) >= 1) {
myself.ShowPage(talker, "vlasti_q0326_07.htm");

} else if (gg.OwnItemCount(talker, 1030) == 0 && gg.OwnItemCount(talker, 1031) == 0) {
myself.ShowPage(talker, "vlasti_q0326_05.htm");

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
if (quest_id == 169) {
myself.SetCurrentQuestID(169);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "vlasti_q0326_04.htm", 169);
myself.SetMemo(talker, 169);
myself.ShowQuestMark(talker, 169);
myself.SetFlagJournal(talker, 169, 1);
gg.AddLog(1, talker, 169);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 169) {
myself.SetCurrentQuestID(169);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 169) {
if (reply == 1 && myself.GetOneTimeQuestFlag(talker, 169) == 0) {
if (gg.HaveMemo(talker, 169) == 1 && gg.OwnItemCount(talker, 1031) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "vlasti_q0326_08.htm");
myself.GiveItem1(talker, 31, 1);
myself.GiveItem1(talker, 57, 17030 + 10 * gg.OwnItemCount(talker, 1030));
myself.IncrementParam(talker, 0, 17475);
myself.IncrementParam(talker, 1, 818);
myself.DeleteItem1(talker, 1030, gg.OwnItemCount(talker, 1030));
myself.DeleteItem1(talker, 1031, gg.OwnItemCount(talker, 1031));
myself.RemoveMemo(talker, 169);
gg.AddLog(2, talker, 169);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 169, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000000);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4155, "", "", "", "", ""));

}

}

}

}

}
super;
	}


}