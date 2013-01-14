package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class q_forest_box1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hiding Behind the Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 25) == 1 && gg.GetMemoState(talker, 25) == 11) {
myself.SetCurrentQuestID(25);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7155, 1);
myself.SetMemoState(talker, 25, 12);
myself.ShowPage(talker, "q_forest_box1_q0025_01.htm");
myself.AddTimerEx(2504, 1000 * 3);
myself.SetFlagJournal(talker, 25, 13);
myself.ShowQuestMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(25);
if (timer_id == 2503) {
myself.Despawn();

} else if (timer_id == 2504) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(25);
myself.AddTimerEx(2503, 1000 * 20);
super;
	}


}