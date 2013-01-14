package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_seed_teleporter extends default_npc {
	protected String fnHi = "default.htm";
	protected int position = 0;
	protected int landing_pos_x = 0;
	protected int landing_pos_y = 0;
	protected int landing_pos_z = 0;
	protected int circle_pos_x = -245833;
	protected int circle_pos_y = 220174;
	protected int circle_pos_z = -12104;
	protected int wall_pos_x = -251624;
	protected int wall_pos_y = 213420;
	protected int wall_pos_z = -12072;
	protected int throne_pos_x = -249774;
	protected int throne_pos_y = 207316;
	protected int throne_pos_z = -11952;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
i0 = gg.GetStep_FieldCycle(2);
if (i0 == 2) {
if (position == 4) {
myself.ShowPage(talker, "seed_controller001b.htm");

} else {
myself.ShowPage(talker, fnHi);

}

} else {
myself.ShowPage(talker, "seed_controller001a.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1101) {
if (reply == 1) {
myself.InstantTeleport(talker, circle_pos_x, circle_pos_y, circle_pos_z);

} else if (reply == 2) {
myself.InstantTeleport(talker, wall_pos_x, wall_pos_y, wall_pos_z);

} else if (reply == 3) {
myself.InstantTeleport(talker, throne_pos_x, throne_pos_y, throne_pos_z);

} else if (reply == 4) {
myself.InstantTeleport(talker, -248683, 250243, 4336);

} else if (reply == 5) {
myself.InstantZone_Leave(talker);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (script_event_arg1 == 1224014 || script_event_arg1 == 1224013 && script_event_arg2 <= 0 || myself.IsNullCreature(c0) && c0 != myself.sm) {
myself.BroadcastScriptEvent(script_event_arg1, myself.sm.id, 8000);

}
if (script_event_arg1 == 1224022) {
myself.BroadcastScriptEvent(1224009, 0, 8000);

}
super;
	}


}