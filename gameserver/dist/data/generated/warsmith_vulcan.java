package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warsmith_vulcan extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 13) == 1 && gg.OwnItemCount(talker, 7263) >= 1 && myself.GetOneTimeQuestFlag(talker, 13) == 0 && gg.GetMemoState(talker, 13) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Parcel Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 617) == 0 && talker.level >= 74) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Gather the Flames");

}
if (gg.HaveMemo(talker, 617) == 0 && talker.level < 74) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Gather the Flames");

}
if (gg.HaveMemo(talker, 617) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Gather the Flames (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 13) == 1 && gg.OwnItemCount(talker, 7263) >= 1 && myself.GetOneTimeQuestFlag(talker, 13) == 0 && gg.GetMemoState(talker, 13) == 1 * 10 + 1) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 13, 1);
myself.ShowPage(talker, "warsmith_vulcan_q0013_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 617) == 0 && talker.level >= 74) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "warsmith_vulcan_q0617_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 617);
myself.ShowQuestFHTML(talker, fhtml0, 617);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 617) == 0 && talker.level < 74) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "warsmith_vulcan_q0617_02.htm", 617);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 617) == 1) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7264) >= 1000) {
myself.ShowPage(talker, "warsmith_vulcan_q0617_04.htm");

} else if (gg.OwnItemCount(talker, 7264) < 1000) {
myself.ShowPage(talker, "warsmith_vulcan_q0617_05.htm");

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
if (quest_id == 617) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "warsmith_vulcan_q0617_03.htm", 617);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 13) {
myself.SetCurrentQuestID(13);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 13 && myself.GetOneTimeQuestFlag(talker, 13) == 0) {
i0 = myself.GetHTMLCookie(talker, 13, 2 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 13) == 1 && myself.GetOneTimeQuestFlag(talker, 13) == 0) {
if (gg.OwnItemCount(talker, 7263) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7263, gg.OwnItemCount(talker, 7263));
myself.GiveItem1(talker, 57, 157834);
myself.IncrementParam(talker, 0, 589092);
myself.IncrementParam(talker, 1, 58794);

}
gg.AddLog(2, talker, 13);
myself.RemoveMemo(talker, 13);
myself.SetOneTimeQuestFlag(talker, 13, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warsmith_vulcan_q0013_0201.htm");

} else {
myself.ShowPage(talker, "warsmith_vulcan_q0013_0202.htm");

}

}

}

}
if (ask == 617) {
myself.SetCurrentQuestID(617);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 617) {
if (reply == 1) {
myself.ShowPage(talker, "warsmith_vulcan_q0617_06.htm");

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 7264) >= 1000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(10);
if (i0 == 0) {
myself.GiveItem1(talker, 6881, 1);

} else if (i0 == 1) {
myself.GiveItem1(talker, 6883, 1);

} else if (i0 == 2) {
myself.GiveItem1(talker, 6885, 1);

} else if (i0 == 3) {
myself.GiveItem1(talker, 6887, 1);

} else if (i0 == 4) {
myself.GiveItem1(talker, 7580, 1);

} else if (i0 == 5) {
myself.GiveItem1(talker, 6891, 1);

} else if (i0 == 6) {
myself.GiveItem1(talker, 6893, 1);

} else if (i0 == 7) {
myself.GiveItem1(talker, 6895, 1);

} else if (i0 == 8) {
myself.GiveItem1(talker, 6897, 1);

} else if (i0 == 9) {
myself.GiveItem1(talker, 6899, 1);

}
myself.DeleteItem1(talker, 7264, 1000);
myself.ShowPage(talker, "warsmith_vulcan_q0617_07.htm");
gg.AddLog(3, talker, 617);

}

}

}
if (reply == 4) {
myself.DeleteItem1(talker, 7264, gg.OwnItemCount(talker, 7264));
myself.RemoveMemo(talker, 617);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "warsmith_vulcan_q0617_08.htm");
gg.AddLog(2, talker, 617);

}

}
super;
	}


}