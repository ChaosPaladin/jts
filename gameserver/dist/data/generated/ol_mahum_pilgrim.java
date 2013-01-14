package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ol_mahum_pilgrim extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 7) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Reformer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 227) == 1 && gg.GetMemoState(talker, 227) == 7) {
myself.SetCurrentQuestID(227);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "ol_mahum_pilgrim_q0227_01.htm");
myself.SetMemoState(talker, 227, 8);
myself.GiveItem1(talker, 2826, 1);

}

}
break;

}

}
return;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
myself.SetCurrentQuestID(227);
myself.AddAttackDesire(attacker, 1, 2000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(227);
if (timer_id == 7778) {
if (myself.i_quest0 < 60) {
myself.i_quest0 = myself.i_quest0 + 1;
myself.AddTimerEx(7778, 1000 * 5);

} else {
myself.Despawn();

}

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(227);
myself.AddTimerEx(7778, 1000 * 5);
myself.i_quest0 = 0;
super;
	}


}