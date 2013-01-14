package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_controller extends citizen {
	protected int fortress_id = 0;
	protected int barrack_id = 0;
	protected int DoorKey = -1;
	protected String fnNoKey = "";
	protected String DoorName1 = "fortress_controller_door_default_1";
	protected String DoorName2 = "fortress_controller_door_default_2";
	protected String fnNoActivation = "";
	protected int msg_broken1 = -1;
	protected int msg_broken2 = -1;
	protected int msg_broken3 = -1;
	protected int msg_broken4 = -1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
i0 = myself.i_ai0 * myself.i_ai1 * myself.i_ai2 * myself.i_ai3;
if (i0 == 0) {
myself.ShowPage(talker, fnNoActivation);
return;

}
if (gg.OwnItemCount(talker, DoorKey) > 0) {
super;

} else {
myself.ShowPage(talker, fnNoKey);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -1999 & reply == 0) {
if (reply == 0) {
if (myself.IsNullString(DoorName2) == 0 && myself.IsNullString(DoorName1) == 0) {
gg.Castle_GateOpenClose2(DoorName1, 0);
gg.Castle_GateOpenClose2(DoorName2, 0);
myself.DeleteItem1(talker, DoorKey, 1);

}

} else if (reply == 1) {
if (myself.IsNullString(DoorName2) == 0 && myself.IsNullString(DoorName1) == 0) {
gg.Castle_GateOpenClose2(DoorName1, 1);
gg.Castle_GateOpenClose2(DoorName2, 1);
myself.DeleteItem1(talker, DoorKey, 1);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 1008) {
if (script_event_arg2 == 0) {
if (myself.IsNullString(DoorName2) == 0 && myself.IsNullString(DoorName1) == 0) {
gg.Castle_GateOpenClose2(DoorName2, 0);
gg.Castle_GateOpenClose2(DoorName1, 0);

}

} else if (script_event_arg2 == 1) {
if (myself.IsNullString(DoorName2) == 0 && myself.IsNullString(DoorName1) == 0) {
gg.Castle_GateOpenClose2(DoorName2, 1);
gg.Castle_GateOpenClose2(DoorName1, 1);

}

}

} else if (script_event_arg1 == 1005) {
switch (script_event_arg2) {
case 1: {
if (msg_broken1 > 0) {
myself.Shout(gg.MakeFString(msg_broken1, "", "", "", "", ""));

}
myself.i_ai0 = 1;
break;

}
case 2: {
if (msg_broken2 > 0) {
myself.Shout(gg.MakeFString(msg_broken2, "", "", "", "", ""));

}
myself.i_ai1 = 1;
break;

}
case 3: {
if (msg_broken3 > 0) {
myself.Shout(gg.MakeFString(msg_broken3, "", "", "", "", ""));

}
myself.i_ai2 = 1;
break;

}
case 4: {
if (msg_broken4 > 0) {
myself.Shout(gg.MakeFString(msg_broken4, "", "", "", "", ""));

}
myself.i_ai3 = 1;
break;

}

}

}
	}


}