package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rune_ghost1b extends quest_0021_superpoint_move_npc {
	protected void TALKED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Hidden Truth (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 21) == 1 && gg.GetMemoState(talker, 21) == 3) {
myself.SetCurrentQuestID(21);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.i_quest0 == 0) {
myself.ShowPage(talker, "rune_ghost1b_q0021_01.htm");

} else {
myself.ShowPage(talker, "rune_ghost1b_q0021_02.htm");
myself.AddTimerEx(2105, 1000 * 3);

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
myself.SetCurrentQuestID(21);
if (timer_id == 2102) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (myself.i_quest0 == 0) {
myself.Say(gg.MakeFString(2151, c0.name, "", "", "", ""));

} else if (myself.i_quest0 == 1) {
myself.Say(gg.MakeFString(2152, c0.name, "", "", "", ""));

}

}
myself.AddTimerEx(2102, 1000 * 9);

} else if (timer_id == 2103) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (npc0) {
if (gg.IsNull(npc0) == 0) {
npc0.av_quest0.Decrement(1);

}

}
myself.Despawn();

} else if (timer_id == 2104) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (npc0) {
if (gg.IsNull(npc0) == 0) {
npc0.av_quest0.Decrement(1);

}

}
myself.Despawn();

} else if (timer_id == 2105) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (npc0) {
if (gg.IsNull(npc0) == 0) {
npc0.av_quest0.Decrement(1);

}

}
myself.Despawn();

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(21);
myself.AddTimerEx(2102, 500);
myself.AddTimerEx(2103, 1000 * 120);
myself.i_quest0 = 0;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
myself.SetCurrentQuestID(21);
if (script_event_arg1 == 10020) {
if (script_event_arg2 == 4) {
myself.i_quest0 = 1;
myself.RemoveAllDesire();
myself.AddTimerEx(2104, 1000 * 15);

}

}
super;
	}


}