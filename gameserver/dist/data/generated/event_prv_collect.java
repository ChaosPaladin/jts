package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_prv_collect extends citizen {
	protected int TelPosX1 = 0;
	protected int TelPosY1 = 0;
	protected int TelPosZ1 = 0;
	protected int TelPosX2 = 0;
	protected int TelPosY2 = 0;
	protected int TelPosZ2 = 0;
	protected int TelPosX3 = 0;
	protected int TelPosY3 = 0;
	protected int TelPosZ3 = 0;
	protected int TelPosX4 = 0;
	protected int TelPosY4 = 0;
	protected int TelPosZ4 = 0;
	protected int TelPosX5 = 0;
	protected int TelPosY5 = 0;
	protected int TelPosZ5 = 0;
	protected int TelPosX6 = 0;
	protected int TelPosY6 = 0;
	protected int TelPosZ6 = 0;
	protected int TelPosX7 = 0;
	protected int TelPosY7 = 0;
	protected int TelPosZ7 = 0;
	protected int TelPosX8 = 0;
	protected int TelPosY8 = 0;
	protected int TelPosZ8 = 0;
	protected int TelPosX9 = 0;
	protected int TelPosY9 = 0;
	protected int TelPosZ9 = 0;
	protected int TelPosX10 = 0;
	protected int TelPosY10 = 0;
	protected int TelPosZ10 = 0;
	protected int TelPosX11 = 0;
	protected int TelPosY11 = 0;
	protected int TelPosZ11 = 0;
	protected int TelPosX12 = 0;
	protected int TelPosY12 = 0;
	protected int TelPosZ12 = 0;
	protected int TelPosX13 = 0;
	protected int TelPosY13 = 0;
	protected int TelPosZ13 = 0;
	protected int TelPosX14 = 0;
	protected int TelPosY14 = 0;
	protected int TelPosZ14 = 0;
	protected int TelPosX15 = 0;
	protected int TelPosY15 = 0;
	protected int TelPosZ15 = 0;
	protected int TelPosX16 = 0;
	protected int TelPosY16 = 0;
	protected int TelPosZ16 = 0;
	protected int TelPosX17 = 0;
	protected int TelPosY17 = 0;
	protected int TelPosZ17 = 0;

	protected void CREATED() {
myself.AddTimerEx(1700, 1000 * 60 * 10);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam talker, HandlerParam i0) {
if (timer_id == 1700) {
i0 = gg.Rand(17);
switch (i0) {
case 0: {
myself.InstantTeleport(myself.sm, TelPosX1, TelPosY1, TelPosZ1);
break;

}
case 1: {
myself.InstantTeleport(myself.sm, TelPosX2, TelPosY2, TelPosZ2);
break;

}
case 2: {
myself.InstantTeleport(myself.sm, TelPosX3, TelPosY3, TelPosZ3);
break;

}
case 3: {
myself.InstantTeleport(myself.sm, TelPosX4, TelPosY4, TelPosZ4);
break;

}
case 4: {
myself.InstantTeleport(myself.sm, TelPosX5, TelPosY5, TelPosZ5);
break;

}
case 5: {
myself.InstantTeleport(myself.sm, TelPosX6, TelPosY6, TelPosZ6);
break;

}
case 6: {
myself.InstantTeleport(myself.sm, TelPosX7, TelPosY7, TelPosZ7);
break;

}
case 7: {
myself.InstantTeleport(myself.sm, TelPosX8, TelPosY8, TelPosZ8);
break;

}
case 8: {
myself.InstantTeleport(myself.sm, TelPosX9, TelPosY9, TelPosZ9);
break;

}
case 9: {
myself.InstantTeleport(myself.sm, TelPosX10, TelPosY10, TelPosZ10);
break;

}
case 10: {
myself.InstantTeleport(myself.sm, TelPosX11, TelPosY11, TelPosZ11);
break;

}
case 11: {
myself.InstantTeleport(myself.sm, TelPosX12, TelPosY12, TelPosZ12);
break;

}
case 12: {
myself.InstantTeleport(myself.sm, TelPosX13, TelPosY13, TelPosZ13);
break;

}
case 13: {
myself.InstantTeleport(myself.sm, TelPosX14, TelPosY14, TelPosZ14);
break;

}
case 14: {
myself.InstantTeleport(myself.sm, TelPosX15, TelPosY15, TelPosZ15);
break;

}
case 15: {
myself.InstantTeleport(myself.sm, TelPosX16, TelPosY16, TelPosZ16);
break;

}
case 16: {
myself.InstantTeleport(myself.sm, TelPosX17, TelPosY17, TelPosZ17);
break;

}

}
myself.Shout(gg.MakeFString(99601, "", "", "", "", ""));
myself.AddTimerEx(1700, 1000 * 60 * 10);

}
	}


}