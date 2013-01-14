package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raldo extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2630)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 7) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Challenger (In Progress)");

}
if (gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 9) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Challenger (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.OwnItemCount(talker, 2630)) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "raldo_q0211_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 7) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "raldo_q0211_06a.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 211) == 1 && gg.GetMemoState(talker, 211) == 9) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.IncrementParam(talker, 0, 1067606);
myself.IncrementParam(talker, 1, 69242);
myself.GiveItem1(talker, 57, 194556);
myself.ShowPage(talker, "raldo_q0211_07.htm");
myself.GiveItem1(talker, 2627, 1);
myself.DeleteItem1(talker, 2632, gg.OwnItemCount(talker, 2632));
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 211, 1);
myself.RemoveMemo(talker, 211);
gg.AddLog(2, talker, 211);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
if (myself.GetOneTimeQuestFlag(talker, 54) == 0) {
if (talker.occupation == 1) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 4) {
myself.GiveItem1(talker, 7562, 45);

} else if (talker.occupation == 7) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 11) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 15) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 19) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 22) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 26) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 29) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 32) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 35) {
myself.GiveItem1(talker, 7562, 128);

} else if (talker.occupation == 39) {
myself.GiveItem1(talker, 7562, 168);

} else if (talker.occupation == 42) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 45) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 47) {
myself.GiveItem1(talker, 7562, 61);

} else if (talker.occupation == 50) {
myself.GiveItem1(talker, 7562, 49);

} else if (talker.occupation == 54) {
myself.GiveItem1(talker, 7562, 85);

} else if (talker.occupation == 56) {
myself.GiveItem1(talker, 7562, 85);

}
myself.SetOneTimeQuestFlag(talker, 54, 1);

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

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(211);
if (timer_id == 21101) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(211);
myself.AddTimerEx(21101, 1000 * 100);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
myself.SetMemoStateEx(c0, 211, 1, 1);

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 211) {
myself.SetCurrentQuestID(211);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 211) {
if (reply == 1) {
myself.ShowPage(talker, "raldo_q0211_02.htm");

} else if (reply == 2) {
myself.ShowPage(talker, "raldo_q0211_03.htm");

} else if (reply == 3 && gg.OwnItemCount(talker, 2630) > 0) {
myself.ShowPage(talker, "raldo_q0211_04.htm");
myself.SetMemoState(talker, 211, 7);
myself.SetFlagJournal(talker, 211, 8);
myself.ShowQuestMark(talker, 211);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2630, 1);

} else if (reply == 4 && gg.OwnItemCount(talker, 2630) > 0) {
myself.ShowPage(talker, "raldo_q0211_06.htm");
myself.SetMemoState(talker, 211, 7);
myself.SetFlagJournal(talker, 211, 8);
myself.ShowQuestMark(talker, 211);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2630, 1);

}

}
super;
	}


}