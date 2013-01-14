package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_treasure_box extends default_npc {
	protected int ItemA = 8035;
	protected int ItemB = 8036;
	protected int ItemC = 8037;
	protected int ItemD = 8038;
	protected int ItemE = 8039;
	protected int ItemF = 8040;
	protected int ItemG = 8041;
	protected int ItemH = 8042;
	protected int ItemI = 8043;
	protected int ItemK = 8045;
	protected int ItemL = 8046;
	protected int ItemN = 8047;
	protected int ItemO = 8048;
	protected int ItemP = 8049;
	protected int ItemR = 8050;
	protected int ItemS = 8051;
	protected int ItemT = 8052;
	protected int ItemU = 8053;
	protected int ItemW = 8054;
	protected int ItemY = 8055;

	protected void CREATED() {
myself.sm.residence_id = 62;
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i2 = gg.Rand(2) + 1;
for (i1 = 0; i1 < i2; i1 = i1 + 1) {
i0 = gg.Rand(100);
if (i0 <= 5) {
myself.DropItem1(myself.sm, ItemA, 1);

} else if (i0 > 5 && i0 <= 10) {
myself.DropItem1(myself.sm, ItemB, 1);

} else if (i0 > 10 && i0 <= 15) {
myself.DropItem1(myself.sm, ItemC, 1);

} else if (i0 > 15 && i0 <= 20) {
myself.DropItem1(myself.sm, ItemD, 1);

} else if (i0 > 20 && i0 <= 25) {
myself.DropItem1(myself.sm, ItemE, 1);

} else if (i0 > 25 && i0 <= 30) {
myself.DropItem1(myself.sm, ItemF, 1);

} else if (i0 > 30 && i0 <= 35) {
myself.DropItem1(myself.sm, ItemG, 1);

} else if (i0 > 35 && i0 <= 40) {
myself.DropItem1(myself.sm, ItemH, 1);

} else if (i0 > 40 && i0 <= 45) {
myself.DropItem1(myself.sm, ItemI, 1);

} else if (i0 > 45 && i0 <= 50) {
myself.DropItem1(myself.sm, ItemK, 1);

} else if (i0 > 50 && i0 <= 55) {
myself.DropItem1(myself.sm, ItemL, 1);

} else if (i0 > 55 && i0 <= 60) {
myself.DropItem1(myself.sm, ItemN, 1);

} else if (i0 > 60 && i0 <= 65) {
myself.DropItem1(myself.sm, ItemO, 1);

} else if (i0 > 65 && i0 <= 70) {
myself.DropItem1(myself.sm, ItemP, 1);

} else if (i0 > 70 && i0 <= 75) {
myself.DropItem1(myself.sm, ItemR, 1);

} else if (i0 > 75 && i0 <= 80) {
myself.DropItem1(myself.sm, ItemS, 1);

} else if (i0 > 80 && i0 <= 85) {
myself.DropItem1(myself.sm, ItemT, 1);

} else if (i0 > 85 && i0 <= 90) {
myself.DropItem1(myself.sm, ItemU, 1);

} else if (i0 > 90 && i0 <= 95) {
myself.DropItem1(myself.sm, ItemW, 1);

} else if (i0 > 95) {
myself.DropItem1(myself.sm, ItemY, 1);

}

}
	}


}