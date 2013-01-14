package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class arujien extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 2) == 0 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "What Women Want");

}
if (gg.HaveMemo(talker, 2) == 0 && myself.GetOneTimeQuestFlag(talker, 2) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "What Women Want (Done)");

}
if (gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "What Women Want (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 2) == 0 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1 && talker.race != 0) {
myself.ShowQuestPage(talker, "arujien_q0002_00.htm", 2);

} else if (talker.level > 1) {
myself.FHTML_SetFileName(fhtml0, "arujien_q0002_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 2);
myself.ShowQuestFHTML(talker, fhtml0, 2);

} else {
myself.ShowPage(talker, "arujien_q0002_01.htm");

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 2) == 0 && myself.GetOneTimeQuestFlag(talker, 2) == 1) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1092)) {
myself.ShowPage(talker, "arujien_q0002_05.htm");

} else if (gg.OwnItemCount(talker, 1094)) {
myself.ShowPage(talker, "arujien_q0002_07.htm");

} else if (gg.OwnItemCount(talker, 1093)) {
myself.ShowPage(talker, "arujien_q0002_06.htm");

} else if (gg.OwnItemCount(talker, 689)) {
myself.ShowPage(talker, "arujien_q0002_11.htm");

} else if (gg.OwnItemCount(talker, 693)) {
myself.ShowPage(talker, "arujien_q0002_10.htm");
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 113, 1);
myself.DeleteItem1(talker, 693, 1);
myself.RemoveMemo(talker, 2);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

}
myself.IncrementParam(talker, 0, 4254);
myself.IncrementParam(talker, 1, 335);
myself.GiveItem1(talker, 57, 1850);
gg.AddLog(2, talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 2, 1);

}

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
if (quest_id == 2) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 2);
myself.ShowQuestMark(talker, 2);
gg.AddLog(1, talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_accept");
if (gg.OwnItemCount(talker, 1092) == 0 && gg.OwnItemCount(talker, 1093) == 0 && gg.OwnItemCount(talker, 1094) == 0) {
myself.GiveItem1(talker, 1092, 1);

}
myself.ShowQuestPage(talker, "arujien_q0002_04.htm", 2);
myself.SetFlagJournal(talker, 2, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 2) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 2) {
if (reply == 1 && gg.OwnItemCount(talker, 1094) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1094, 1);
myself.GiveItem1(talker, 689, 1);
myself.SetFlagJournal(talker, 2, 4);
myself.ShowQuestMark(talker, 2);
myself.ShowPage(talker, "arujien_q0002_08.htm");

}

} else if (reply == 2 && myself.GetOneTimeQuestFlag(talker, 2) == 0 && gg.OwnItemCount(talker, 1094) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "arujien_q0002_09.htm");
myself.DeleteItem1(talker, 1094, 1);
myself.GiveItem1(talker, 57, 450);
myself.RemoveMemo(talker, 2);
gg.AddLog(2, talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 2, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

} else if (gg.GetNRMemoState(talker, 41) % 10 != 1) {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1);
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(4151, "", "", "", "", ""));

}
myself.IncrementParam(talker, 0, 4254);
myself.IncrementParam(talker, 1, 335);
myself.GiveItem1(talker, 57, 1850);

}

}

}
super;
	}


}