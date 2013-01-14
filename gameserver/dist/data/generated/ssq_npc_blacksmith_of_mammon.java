package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_npc_blacksmith_of_mammon extends merchant {
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

protected Object[][] SellList0 = {

};

	protected void CREATED() {
myself.AddTimerEx(5098, 30 * 60 * 1000);
	}

	protected void TALKED(HandlerParam talker) {
if (myself.GetSSQStatus() != 3) {
myself.Despawn();
return;

}
if (gg.GetSSQPart(talker) != 0 && myself.GetSSQSealOwner(2) == gg.GetSSQPart(talker)) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, "blacksmith_of_mammon002.htm");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 5098) {
i0 = gg.Rand(70);
if (i0 <= 10 && PosX1 != 0) {
myself.InstantTeleport(myself.sm, PosX1, PosY1, PosZ1);

} else if (i0 > 10 && i0 <= 20 && PosX2 != 0) {
myself.InstantTeleport(myself.sm, PosX2, PosY2, PosZ2);

} else if (i0 > 20 && i0 <= 30 && PosX3 != 0) {
myself.InstantTeleport(myself.sm, PosX3, PosY3, PosZ3);

} else if (i0 > 30 && i0 <= 40 && PosX4 != 0) {
myself.InstantTeleport(myself.sm, PosX4, PosY4, PosZ4);

} else if (i0 > 40 && i0 <= 50 && PosX5 != 0) {
myself.InstantTeleport(myself.sm, PosX5, PosY5, PosZ5);

} else if (i0 > 50 && i0 < 60 && PosX6 != 0) {
myself.InstantTeleport(myself.sm, PosX6, PosY6, PosZ6);

} else if (PosX7 != 0) {
myself.InstantTeleport(myself.sm, PosX7, PosY7, PosZ7);

}
i1 = gg.Rand(30);
if (i1 < 10) {
myself.Shout(gg.MakeFString(1000431, "", "", "", "", ""));

} else if (i1 >= 10 && i1 < 20) {
myself.Shout(gg.MakeFString(1000432, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1000433, "", "", "", "", ""));

}
myself.AddTimerEx(5098, 30 * 60 * 1000);

} else if (timer_id == 5099) {
if (myself.GetSSQStatus() == 1) {
myself.Despawn();

} else {
myself.AddTimerEx(5099, 60 * 1000);

}

}
	}


}