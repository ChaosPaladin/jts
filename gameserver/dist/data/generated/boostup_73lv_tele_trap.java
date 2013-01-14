package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class boostup_73lv_tele_trap extends abstract_npc {
	protected int GM_ID = -1;
	protected int ItemA = 13032;
	protected int ItemB = 13033;
	protected String AreaName = "default_area_name";

	protected void CREATED() {
myself.RegisterGlobalMap(GM_ID, 1);
myself.AddTimerEx(5000, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1) {
myself.c_ai0 = creature;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 2316001) {
gg.Area_SetOnOffEx(AreaName, 0, myself.InstantZone_GetId());
myself.AddTimerEx(1000, 1000);
myself.DropItem1(myself.sm, ItemA, gg.Rand(10) + 1);
myself.DropItem1(myself.sm, ItemB, gg.Rand(10) + 1);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 500) {
myself.LookNeighbor(2000);
myself.AddTimerEx(500, 5000);

}
if (timer_id == 1000) {
switch (GM_ID) {
case 2316001: {

}
case 2316002: {

}
case 2316003: {
if (myself.GetGlobalMap(2316001) == 1 && myself.GetGlobalMap(2316002) == 1 && myself.GetGlobalMap(2316003) == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.GiveItem1(myself.c_ai0, 13056, 1);

}
myself.RegisterGlobalMap(GM_ID, 0);

}
break;

}
case 2316007: {

}
case 2316008: {
if (myself.GetGlobalMap(2316007) == 1 && myself.GetGlobalMap(2316008) == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.GiveItem1(myself.c_ai0, 13057, 1);

}
myself.RegisterGlobalMap(GM_ID, 0);

}
break;

}

}
myself.AddTimerEx(2000, 5000);

}
if (timer_id == 2000) {
myself.Despawn();

}
	}


}