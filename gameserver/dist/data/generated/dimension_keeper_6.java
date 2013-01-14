package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dimension_keeper_6 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 634) == 0 && talker.level >= 20) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "In Search of Fragments of Dimension");

}
if (gg.HaveMemo(talker, 634) == 0 && talker.level < 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "In Search of Fragments of Dimension");

}
if (gg.HaveMemo(talker, 634) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "In Search of Fragments of Dimension (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 634) == 0 && talker.level >= 20) {
myself.SetCurrentQuestID(634);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "dimension_keeper_1_q0634_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 634);
myself.ShowQuestFHTML(talker, fhtml0, 634);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 634) == 0 && talker.level < 20) {
myself.SetCurrentQuestID(634);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "dimension_keeper_1_q0634_02.htm", 634);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 634) == 1) {
myself.SetCurrentQuestID(634);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dimension_keeper_1_q0634_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 635) {
myself.SetCurrentQuestID(635);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 % 100;
if (i1 >= 95 || i1 < 0) {
i1 = 0;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoState(talker, 635, 0);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SetMemoStateEx(talker, 255, 1, i1 + 60000);
myself.InstantTeleport(talker, -114796, -179334, -6752);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dimension_keeper_1_q0635_07.htm", 635);
gg.AddLog(1, talker, quest_id);

}
return;

}
if (quest_id == 634) {
myself.SetCurrentQuestID(634);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 634);
myself.SetFlagJournal(talker, 634, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dimension_keeper_1_q0634_03.htm", 634);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 635) {
myself.SetCurrentQuestID(635);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 635) {
if (reply == 1 && gg.HaveMemo(talker, 635) == 0) {
if (talker.level < 20) {
myself.ShowQuestPage(talker, "dimension_keeper_1_q0635_01.htm", 635);

} else if (talker.level >= 20) {
if (myself.GetMemoCount(talker) < 41) {
if (gg.OwnItemCount(talker, 7079) < 1) {
myself.ShowQuestPage(talker, "dimension_keeper_1_q0635_03.htm", 635);

} else {
myself.FHTML_SetFileName(fhtml0, "dimension_keeper_1_q0635_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 635);
myself.ShowQuestFHTML(talker, fhtml0, 635);

}

} else {
myself.ShowQuestPage(talker, "dimension_keeper_1_q0635_02.htm", 635);

}

}

} else if (reply == 1 && gg.HaveMemo(talker, 635) == 1) {
if (talker.level < 20) {
myself.ShowPage(talker, "dimension_keeper_1_q0635_01.htm");

} else if (talker.level >= 20) {
i0 = gg.GetMemoStateEx(talker, 255, 1);
i1 = i0 % 100;
if (i1 >= 95 || i1 < 0) {
i1 = 0;

}
if (gg.OwnItemCount(talker, 7079) < 1) {
myself.ShowPage(talker, "dimension_keeper_1_q0635_03.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemoStateEx(talker, 255, 1, i1 + 60000);
myself.InstantTeleport(talker, -114796, -179334, -6752);
myself.ShowPage(talker, "dimension_keeper_1_q0635_07a.htm");

}

}

}
if (reply == 2) {
myself.ShowPage(talker, "dimension_keeper_1_q0635_05.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "dimension_keeper_1_q0635_06.htm");

}

}
if (ask == 634) {
myself.SetCurrentQuestID(634);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 634) {
if (reply == 1 && gg.HaveMemo(talker, 634) == 1) {
myself.ShowPage(talker, "dimension_keeper_1_q0634_05.htm");

}
if (reply == 2 && gg.HaveMemo(talker, 634) == 1) {
myself.RemoveMemo(talker, 634);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dimension_keeper_1_q0634_06.htm");

}
if (reply == 3 && gg.HaveMemo(talker, 634) == 1) {
myself.ShowPage(talker, "dimension_keeper_1_q0634_07.htm");

}

}
super;
	}


}