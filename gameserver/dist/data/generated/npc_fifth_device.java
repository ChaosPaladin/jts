package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_fifth_device extends default_npc {
	protected String door1 = "door_default";
	protected String door2 = "door_default";
	protected String door3 = "door_default";

	protected void CREATED() {
myself.i_ai0 = 1;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (myself.i_ai0 == 1) {
if (talker.occupation == 57 || talker.occupation == 118) {
myself.ShowPage(talker, "device_operate001c.htm");

} else {
myself.ShowPage(talker, "device_operate001.htm");

}

} else {
myself.ShowPage(talker, "device_operate001b.htm");

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1006) {
if (reply == 1) {
if (myself.i_ai0 == 1) {
if (talker.occupation == 57 || talker.occupation == 118) {
if (door1 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door1, 0);

}
if (door2 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door2, 0);

}
if (door3 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door3, 0);

}
myself.AddTimerEx(1002, 2 * 60 * 1000);

} else if (gg.Rand(10000) < 10000) {
if (door1 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door1, 0);

}
if (door2 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door2, 0);

}
if (door3 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door3, 0);

}
myself.AddTimerEx(1002, 2 * 60 * 1000);

} else {
myself.ShowPage(talker, "device_operate001a.htm");
myself.i_ai0 = 0;
myself.AddTimerEx(1001, 2 * 60 * 1000);

}

} else {
myself.ShowPage(talker, "device_operate001b.htm");

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.i_ai0 = 1;

} else if (timer_id == 1002) {
if (door1 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door1, 1);

}
if (door2 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door2, 1);

}
if (door3 == "door_default") {

} else {
gg.Castle_GateOpenClose2(door3, 1);

}

}
	}


}