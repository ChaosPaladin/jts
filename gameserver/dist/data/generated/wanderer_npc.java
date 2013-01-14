package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wanderer_npc extends merchant_for_chaotic {
	protected int PosX1 = 0;
	protected int PosY1 = 0;
	protected int PosZ1 = 0;
	protected int PosX2 = 0;
	protected int PosY2 = 0;
	protected int PosZ2 = 0;
	protected int PosX3 = 0;
	protected int PosY3 = 0;
	protected int PosZ3 = 0;
	protected int PosX4 = 0;
	protected int PosY4 = 0;
	protected int PosZ4 = 0;
	protected int PosX5 = 0;
	protected int PosY5 = 0;
	protected int PosZ5 = 0;
	protected int PosX6 = 0;
	protected int PosY6 = 0;
	protected int PosZ6 = 0;
	protected int PosX7 = 0;
	protected int PosY7 = 0;
	protected int PosZ7 = 0;
	protected int PosX8 = 0;
	protected int PosY8 = 0;
	protected int PosZ8 = 0;
	protected int PosX9 = 0;
	protected int PosY9 = 0;
	protected int PosZ9 = 0;
	protected int PosX10 = 0;
	protected int PosY10 = 0;
	protected int PosZ10 = 0;
	protected int PosX11 = 0;
	protected int PosY11 = 0;
	protected int PosZ11 = 0;
	protected int PosX12 = 0;
	protected int PosY12 = 0;
	protected int PosZ12 = 0;
	protected int PosX13 = 0;
	protected int PosY13 = 0;
	protected int PosZ13 = 0;
	protected int PosX14 = 0;
	protected int PosY14 = 0;
	protected int PosZ14 = 0;
	protected int PosX15 = 0;
	protected int PosY15 = 0;
	protected int PosZ15 = 0;
	protected int PosX16 = 0;
	protected int PosY16 = 0;
	protected int PosZ16 = 0;
	protected int PosX17 = 0;
	protected int PosY17 = 0;
	protected int PosZ17 = 0;
	protected int PosX18 = 0;
	protected int PosY18 = 0;
	protected int PosZ18 = 0;
	protected int PosX19 = 0;
	protected int PosY19 = 0;
	protected int PosZ19 = 0;
	protected int PosX20 = 0;
	protected int PosY20 = 0;
	protected int PosZ20 = 0;
	protected int PosX21 = 0;
	protected int PosY21 = 0;
	protected int PosZ21 = 0;
	protected int PosX22 = 0;
	protected int PosY22 = 0;
	protected int PosZ22 = 0;
	protected int PosX23 = 0;
	protected int PosY23 = 0;
	protected int PosZ23 = 0;
	protected int PosX24 = 0;
	protected int PosY24 = 0;
	protected int PosZ24 = 0;
	protected int PosX25 = 0;
	protected int PosY25 = 0;
	protected int PosZ25 = 0;
	protected int PosX26 = 0;
	protected int PosY26 = 0;
	protected int PosZ26 = 0;
	protected int PosX27 = 0;
	protected int PosY27 = 0;
	protected int PosZ27 = 0;
	protected int PosX28 = 0;
	protected int PosY28 = 0;
	protected int PosZ28 = 0;
	protected int PosX29 = 0;
	protected int PosY29 = 0;
	protected int PosZ29 = 0;
	protected int PosX30 = 0;
	protected int PosY30 = 0;
	protected int PosZ30 = 0;
	protected int PosX31 = 0;
	protected int PosY31 = 0;
	protected int PosZ31 = 0;
	protected int PosX32 = 0;
	protected int PosY32 = 0;
	protected int PosZ32 = 0;
	protected int PosX33 = 0;
	protected int PosY33 = 0;
	protected int PosZ33 = 0;
	protected int PosX34 = 0;
	protected int PosY34 = 0;
	protected int PosZ34 = 0;
	protected int PosX35 = 0;
	protected int PosY35 = 0;
	protected int PosZ35 = 0;
	protected int PosX36 = 0;
	protected int PosY36 = 0;
	protected int PosZ36 = 0;
	protected int PosX37 = 0;
	protected int PosY37 = 0;
	protected int PosZ37 = 0;
	protected int PosX38 = 0;
	protected int PosY38 = 0;
	protected int PosZ38 = 0;
	protected int PosX39 = 0;
	protected int PosY39 = 0;
	protected int PosZ39 = 0;

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5000) {
i0 = gg.Rand(39);
if (i0 == 0) {
myself.InstantTeleport(myself.sm, PosX1, PosY1, PosZ1);

} else if (i0 == 1) {
myself.InstantTeleport(myself.sm, PosX2, PosY2, PosZ2);

} else if (i0 == 2) {
myself.InstantTeleport(myself.sm, PosX3, PosY3, PosZ3);

} else if (i0 == 3) {
myself.InstantTeleport(myself.sm, PosX4, PosY4, PosZ4);

} else if (i0 == 4) {
myself.InstantTeleport(myself.sm, PosX5, PosY5, PosZ5);

} else if (i0 == 5) {
myself.InstantTeleport(myself.sm, PosX6, PosY6, PosZ6);

} else if (i0 == 6) {
myself.InstantTeleport(myself.sm, PosX7, PosY7, PosZ7);

} else if (i0 == 7) {
myself.InstantTeleport(myself.sm, PosX8, PosY8, PosZ8);

} else if (i0 == 8) {
myself.InstantTeleport(myself.sm, PosX9, PosY9, PosZ9);

} else if (i0 == 9) {
myself.InstantTeleport(myself.sm, PosX10, PosY10, PosZ10);

} else if (i0 == 10) {
myself.InstantTeleport(myself.sm, PosX11, PosY11, PosZ11);

} else if (i0 == 11) {
myself.InstantTeleport(myself.sm, PosX12, PosY12, PosZ12);

} else if (i0 == 12) {
myself.InstantTeleport(myself.sm, PosX13, PosY13, PosZ13);

} else if (i0 == 13) {
myself.InstantTeleport(myself.sm, PosX14, PosY14, PosZ14);

} else if (i0 == 14) {
myself.InstantTeleport(myself.sm, PosX15, PosY15, PosZ15);

} else if (i0 == 15) {
myself.InstantTeleport(myself.sm, PosX16, PosY16, PosZ16);

} else if (i0 == 16) {
myself.InstantTeleport(myself.sm, PosX17, PosY17, PosZ17);

} else if (i0 == 17) {
myself.InstantTeleport(myself.sm, PosX18, PosY18, PosZ18);

} else if (i0 == 18) {
myself.InstantTeleport(myself.sm, PosX19, PosY19, PosZ19);

} else if (i0 == 19) {
myself.InstantTeleport(myself.sm, PosX20, PosY20, PosZ20);

} else if (i0 == 20) {
myself.InstantTeleport(myself.sm, PosX21, PosY21, PosZ21);

} else if (i0 == 21) {
myself.InstantTeleport(myself.sm, PosX22, PosY22, PosZ22);

} else if (i0 == 22) {
myself.InstantTeleport(myself.sm, PosX23, PosY23, PosZ23);

} else if (i0 == 23) {
myself.InstantTeleport(myself.sm, PosX24, PosY24, PosZ24);

} else if (i0 == 24) {
myself.InstantTeleport(myself.sm, PosX25, PosY25, PosZ25);

} else if (i0 == 25) {
myself.InstantTeleport(myself.sm, PosX26, PosY26, PosZ26);

} else if (i0 == 26) {
myself.InstantTeleport(myself.sm, PosX27, PosY27, PosZ27);

} else if (i0 == 27) {
myself.InstantTeleport(myself.sm, PosX28, PosY28, PosZ28);

} else if (i0 == 28) {
myself.InstantTeleport(myself.sm, PosX29, PosY29, PosZ29);

} else if (i0 == 29) {
myself.InstantTeleport(myself.sm, PosX30, PosY30, PosZ30);

} else if (i0 == 30) {
myself.InstantTeleport(myself.sm, PosX31, PosY31, PosZ31);

} else if (i0 == 31) {
myself.InstantTeleport(myself.sm, PosX32, PosY32, PosZ32);

} else if (i0 == 32) {
myself.InstantTeleport(myself.sm, PosX33, PosY33, PosZ33);

} else if (i0 == 33) {
myself.InstantTeleport(myself.sm, PosX34, PosY34, PosZ34);

} else if (i0 == 34) {
myself.InstantTeleport(myself.sm, PosX35, PosY35, PosZ35);

} else if (i0 == 35) {
myself.InstantTeleport(myself.sm, PosX36, PosY36, PosZ36);

} else if (i0 == 36) {
myself.InstantTeleport(myself.sm, PosX37, PosY37, PosZ37);

} else if (i0 == 37) {
myself.InstantTeleport(myself.sm, PosX38, PosY38, PosZ38);

} else if (i0 == 38) {
myself.InstantTeleport(myself.sm, PosX39, PosY39, PosZ39);

}
myself.i_ai0 = 0;

}
if (timer_id == 5001) {
myself.Say(gg.MakeFString(1800882, "", "", "", "", ""));
myself.AddTimerEx(5002, 60 * 1000);

}
if (timer_id == 5002) {
myself.Say(gg.MakeFString(1800883, "", "", "", "", ""));
myself.AddTimerEx(5003, 60 * 1000);

}
if (timer_id == 5003) {
myself.Say(gg.MakeFString(1800884, "", "", "", "", ""));
myself.AddTimerEx(5004, 60 * 1000);

}
if (timer_id == 5004) {
myself.Say(gg.MakeFString(1800885, "", "", "", "", ""));

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.Say(gg.MakeFString(1800886, "", "", "", "", ""));
myself.AddTimerEx(5000, 5 * 60 * 1000);
myself.AddTimerEx(5001, 60 * 1000);

}
super;
	}


}