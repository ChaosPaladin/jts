package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class holdup_trap extends default_trap {
	protected int IsDetected = 0;
	protected int IsDefused = 0;
	protected String Maker1 = "holdup_trap_maker_default_1";
	protected int Maker1Weight = 50;
	protected String Maker2 = "holdup_trap_maker_default_2";
	protected int Maker2Weight = 30;
	protected String Maker3 = "holdup_trap_maker_default_3";
	protected int Maker3Weight = 10;
	protected String Maker4 = "holdup_trap_maker_default_4";
	protected int Maker4Weight = 5;
	protected int raidRespawnTime = 36;
	protected int raidRespawnRandTime = 24;

	protected void CREATED() {
myself.i_ai1 = 5;
myself.i_ai2 = 1;
myself.i_ai3 = 0;
myself.AddTimerEx(1002, 10 * 1000);
myself.AddTimerEx(780001, 1 * 60 * 1000);
	}

	protected void TRAP_ACTIVATED(HandlerParam i0) {
	}

	protected void TRAP_STEP_IN(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam s0, HandlerParam i2, HandlerParam maker0) {
s0 = "";
if (myself.m_WorldTrapState == 1) {
i2 = gg.Rand(100);
if (Maker4Weight != 0 && i2 <= Maker4Weight && myself.i_ai3 == 0) {
myself.i_ai2 = 4;
s0 = Maker4;
myself.i_ai3 = 1;
myself.AddTimerEx(7001, raidRespawnTime + gg.Rand(raidRespawnRandTime) * 60 * 60 * 1000);

} else if (Maker3Weight != 0 && i2 <= Maker3Weight) {
myself.i_ai2 = 3;
s0 = Maker3;

} else if (Maker2Weight != 0 && i2 <= Maker2Weight) {
myself.i_ai2 = 2;
s0 = Maker2;

} else if (Maker1Weight != 0 && i2 <= Maker1Weight) {
myself.i_ai2 = 1;
s0 = Maker1;

}
if (myself.i_ai2 != 0) {
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
if (myself.i_ai2 == 4) {
myself.i_ai1 = 20;

} else {
myself.i_ai1 = 5;

}

} else {
myself.i_ai1 = 2;

}
myself.DefuseWorldTrapByClassId(myself.sm.id, myself.sm.class_id);
myself.AddTimerEx(1003, myself.i_ai1 * 60 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam s0, HandlerParam maker0) {
if (timer_id == 780001) {
myself.AddTimerEx(780001, 1 * 60 * 1000);

}
if (timer_id == 1002) {
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}
if (timer_id == 1003) {
if (myself.i_ai2 != 0) {
switch (myself.i_ai2) {
case 4: {
s0 = Maker4;
break;

}
case 3: {
s0 = Maker3;
break;

}
case 2: {
s0 = Maker2;
break;

}
case 1: {
s0 = Maker1;
break;

}

}
maker0 = gg.GetNpcMaker(s0);
if (gg.IsNull(maker0) == 0) {
myself.i_ai2 = 0;
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}

}
if (myself.m_WorldTrapState == 0) {
myself.ActivateWorldTrapByClassId(myself.sm.id, myself.sm.class_id);

}

}
if (timer_id == 7001) {
myself.i_ai3 = 0;

}
super;
	}


}