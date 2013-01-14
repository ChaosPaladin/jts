package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pick_up_crystal_golem extends default_npc {
	protected String DoorName = "cyratal_cave_c_b";
	protected int drop_item = 9693;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.AddTimerEx(1002, 60 * 1000);
myself.LookItem(200, 1, drop_item);
	}

	protected void TALKED(HandlerParam talker) {
myself.Say(gg.MakeFString(1800042, "", "", "", "", ""));
	}

	protected void GET_ITEM_FINISHED(HandlerParam item, HandlerParam success, HandlerParam i0) {
if (success == 1) {
myself.i_ai4 = 1;
i0 = gg.Rand(100);
if (i0 < 25) {
myself.Say(gg.MakeFString(1800038, "", "", "", "", ""));

} else if (i0 < 50) {
myself.Say(gg.MakeFString(1800039, "", "", "", "", ""));

} else if (i0 < 75) {
myself.Say(gg.MakeFString(1800040, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800041, "", "", "", "", ""));

}

}
	}

	protected void NO_DESIRE(HandlerParam i0) {
myself.LookItem(200, 1, drop_item);
if (myself.i_ai0 == 842) {
if (myself.sm.x <= myself.i_ai1) {
if (myself.i_ai2 == 0 && myself.i_ai3 == 0) {
myself.BroadcastScriptEvent(12540, gg.GetIndexFromCreature(myself.sm), 7000);
myself.i_ai3 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai2 == 1 && myself.i_ai3 == 1) {
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.InstantZone_GetId());
myself.i_ai3 = 2;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

}

}

} else if (myself.i_ai0 == 843) {
if (myself.sm.x >= myself.i_ai1) {
if (myself.i_ai2 == 0 && myself.i_ai3 == 0) {
myself.BroadcastScriptEvent(12540, gg.GetIndexFromCreature(myself.sm), 6000);
myself.i_ai3 = 1;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

} else if (myself.i_ai2 == 1 && myself.i_ai3 == 1) {
gg.Castle_GateOpenCloseEx(DoorName, 0, myself.InstantZone_GetId());
myself.i_ai3 = 2;
myself.AddUseSkillDesire(myself.sm, 356581377, 1, 0, 100000);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 12539) {
myself.i_ai0 = script_event_arg2;
myself.i_ai1 = script_event_arg3;
if (myself.i_ai0 == 843) {
myself.Shout(gg.MakeFString(1800034, "", "", "", "", ""));
myself.AddTimerEx(1003, 5000);

}

} else if (script_event_arg1 == 12540) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.sm != c0) {
myself.i_ai2 = 1;
myself.i_ai3 = 1;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1002) {
myself.LookItem(450, 20, drop_item);
myself.AddTimerEx(1002, 60 * 1000);

} else if (timer_id == 1003) {
if (myself.i_ai4 == 0) {
myself.Shout(gg.MakeFString(1800035, "", "", "", "", ""));
myself.AddTimerEx(1004, 5000);

}

} else if (timer_id == 1004) {
if (myself.i_ai4 == 0) {
myself.Shout(gg.MakeFString(1800036, "", "", "", "", ""));
myself.AddTimerEx(1005, 5000);

}

} else if (timer_id == 1005) {
if (myself.i_ai4 == 0) {
myself.Shout(gg.MakeFString(1800037, "", "", "", "", ""));

}

}
	}

	protected void SEE_ITEM(HandlerParam item_index_list, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = item_index_list.GetSize();
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
myself.AddGetItemDesireEx(item_index_list.GetItemIndex(i1), 10 - i1);

}
	}


}