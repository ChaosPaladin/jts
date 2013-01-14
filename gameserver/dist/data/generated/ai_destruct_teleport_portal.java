package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_teleport_portal extends default_npc {
	protected int OutPos_X = 0;
	protected int OutPos_Y = 0;
	protected int OutPos_Z = 0;
	protected int MovPos_X = 0;
	protected int MovPos_Y = 0;
	protected int position = 0;
	protected int teleport_portal_flag = -1;
	protected String my_maker_name = "";

	protected void CREATED() {
myself.i_ai0 = 0;
switch (teleport_portal_flag) {
case 1: {
myself.AddTimerEx(6711, 5 * 1000);
break;

}
case 2: {
myself.AddTimerEx(6711, 5 * 1000);
break;

}
case 3: {
myself.AddTimerEx(6811, 10 * 1000);
break;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam maker0) {
switch (teleport_portal_flag) {
case 1: {
i3 = 1224015;
break;

}
case 2: {
i3 = 0;
break;

}
case 3: {
i3 = 1224015;
break;

}

}
switch (position) {
case 0: {
i3 = MovPos_X;
i2 = MovPos_Y;
break;

}
case 1: {
i2 = 1224016;
break;

}
case 2: {
i2 = 1224017;
break;

}
case 3: {
i2 = 1224018;
break;

}
case 4: {
i2 = 1224019;
break;

}
case 5: {
i2 = 1224020;
break;

}

}
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
if (maker0.npc_count < maker0.maximum_npc - 5) {
myself.i_ai0 = 0;

} else {
myself.i_ai0 = 1;

}

}
if (timer_id == 6711) {
if (myself.i_ai0 == 0) {
if (teleport_portal_flag == 1) {
myself.CreateOnePrivateEx(1022538, "ai_destruct_warrior_dd_self", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224011, i3, i2);

} else if (teleport_portal_flag == 2) {
myself.CreateOnePrivateEx(1022538, "ai_destruct_warrior_dd_self", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);

}

}
myself.AddTimerEx(6712, 3 * 1000);

} else if (timer_id == 6712) {
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(1022540, "ai_destruct_warrior_dd_self", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);

}
myself.AddTimerEx(6713, 3 * 1000);

} else if (timer_id == 6713) {
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(1022542, "ai_destruct_wizard_selfrange_buff", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);

}
myself.AddTimerEx(6714, 3 * 1000);

} else if (timer_id == 6714) {
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(1022548, "ai_destruct_peltast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);

}
myself.AddTimerEx(6711, 3 * 60 * 1000);

} else if (timer_id == 6811) {
if (myself.i_ai0 == 0) {
i1 = gg.Rand(12);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022569, "ai_destruct_warrior_debuff_self_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022570, "ai_destruct_warrior_dd_self_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022571, "ai_destruct_wizard_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 3: {
myself.CreateOnePrivateEx(1022572, "ai_destruct_warrior_dd_self_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 4: {
myself.CreateOnePrivateEx(1022573, "ai_destruct_warrior_dd_self_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 5: {
myself.CreateOnePrivateEx(1022574, "ai_destruct_warrior_dd_self_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 6: {
myself.CreateOnePrivateEx(1022575, "ai_destruct_warrior_dd_self_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 7: {
myself.CreateOnePrivateEx(1022576, "ai_destruct_wizard_selfrange_buff_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 8: {
myself.CreateOnePrivateEx(1022577, "ai_destruct_wizard_selfrange_buff_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 9: {
myself.CreateOnePrivateEx(1022578, "ai_destruct_wizard_selfrange_buff_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 10: {
myself.CreateOnePrivateEx(1022579, "ai_destruct_berserker_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}
case 11: {
myself.CreateOnePrivateEx(1022581, "ai_destruct_peltast_ret", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1224010, i3, i2);
break;

}

}

}
myself.AddTimerEx(6811, 10 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 1224009) {
myself.Despawn();

} else if (script_event_arg1 == 1224014 || script_event_arg1 == 1224013) {
myself.Despawn();

}
	}


}