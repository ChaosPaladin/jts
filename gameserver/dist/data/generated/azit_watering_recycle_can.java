package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_recycle_can extends default_npc {
	protected int EatItem01 = 57;
	protected int EatItem02 = 57;
	protected int EatItem03 = 57;
	protected int EatItem04 = 57;
	protected int EatItem05 = 57;
	protected int EatItem06 = 57;
	protected int EatItem07 = 57;
	protected int EatItem08 = 57;
	protected int EatItem09 = 57;
	protected int EatItem10 = 57;
	protected int EatItem11 = 57;
	protected int EatItem12 = 57;
	protected int EatItem13 = 57;
	protected int EatItem14 = 57;
	protected int EatItem15 = 57;
	protected int EatItem16 = 57;
	protected int EatItem17 = 57;
	protected int EatItem18 = 57;
	protected int EatItem19 = 57;
	protected int EatItem20 = 57;
	protected int EatItem21 = 57;
	protected int EatItem22 = 57;
	protected int EatItem23 = 57;
	protected int EatItem24 = 57;
	protected int EatItem25 = 57;
	protected int EatItem26 = 17;

	protected void CREATED() {
myself.AddTimerEx(1011, 5 * 60 * 1000);
myself.AddTimerEx(1002, 30 * 1000);
myself.LookItem(450, 20, -1);
	}

	protected void TALKED(HandlerParam talker) {
myself.Say(gg.MakeFString(1010639, "", "", "", "", ""));
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1002) {
myself.LookItem(450, 20, 0);
myself.AddTimerEx(1002, 30 * 1000);

} else if (timer_id == 1011) {
myself.Despawn();

}
	}

	protected void SEE_ITEM(HandlerParam item_index_list, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = item_index_list.GetSize();
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
myself.AddGetItemDesireEx(item_index_list.GetItemIndex(i1), 10000 - i1);
if (item_index_list.GetItemIndex(i1) >= 8035 && item_index_list.GetItemIndex(i1) <= 8055) {
myself.AddGetItemDesireEx(item_index_list.GetItemIndex(i1), 10000 - i1);

}

}
	}

	protected void GET_ITEM_FINISHED(HandlerParam item, HandlerParam success) {
if (item.class_id == 8190 || item.class_id == 8689) {
if (success == 1) {
myself.Say(gg.MakeFString(1800023, "", "", "", "", ""));

}

}
	}


}