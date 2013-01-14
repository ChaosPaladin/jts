package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_item_drop extends abstract_npc {
	protected int ItemA = 13032;
	protected int ItemB = 13033;
	protected int Item_SoulshotD = 13037;
	protected int Item_SoulshotC = 13045;
	protected int Item_SoulshotA = 13055;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (damage < 1) {
return;

}
if (myself.i_ai0 != 0) {
return;

}
if (gg.IsSameString(myself.sm.name, "pa36_crystal_pint") || gg.IsSameString(myself.sm.name, "pa36_blazing_brazier")) {
switch (gg.Rand(6)) {
case 0: {
if (gg.IsSameString(myself.sm.name, "pa36_crystal_pint") == 1) {
myself.DropItem1(myself.sm, 13041, gg.Rand(7) + 1);

}
break;

}
case 1: {
if (gg.IsSameString(myself.sm.name, "pa36_blazing_brazier") == 1) {
myself.DropItem1(myself.sm, 13040, gg.Rand(7) + 1);

}
break;

}
case 2: {

}
case 3: {
myself.DropItem1(myself.sm, ItemA, gg.Rand(10) + 1);
break;

}
case 4: {

}
case 5: {
myself.DropItem1(myself.sm, ItemB, gg.Rand(10) + 1);
break;

}

}
myself.AddTimerEx(1000, 3000);

} else if (gg.IsSameString(myself.sm.name, "pa61_treasure")) {
switch (gg.Rand(7)) {
case 0: {

}
case 1: {
myself.DropItem1(myself.sm, 13048, gg.Rand(10) + 1);
break;

}
case 2: {
myself.DropItem1(myself.sm, 13049, gg.Rand(5) + 1);
break;

}
case 3: {
myself.DropItem1(myself.sm, 13150, gg.Rand(1) + 1);
break;

}
case 4: {
myself.DropItem1(myself.sm, 13059, gg.Rand(7) + 1);
break;

}
case 5: {
myself.DropItem1(myself.sm, ItemA, gg.Rand(10) + 1);
break;

}
case 6: {
myself.DropItem1(myself.sm, ItemB, gg.Rand(10) + 1);
break;

}

}
myself.AddTimerEx(1000, 3000);

}
myself.i_ai0 = 1;
myself.AddTimerEx(1000, 2000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.Despawn();

}
	}


}