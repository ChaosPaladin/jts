package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class boostup_73lv_animal extends warrior_use_skill {
	protected int ItemA = 13032;
	protected int ItemB = 13033;
	protected int Item_SoulshotA = 13055;

	protected void MY_DYING() {
switch (gg.Rand(2)) {
case 0: {
myself.DropItem1(myself.sm, ItemB, gg.Rand(10) + 1);
break;

}
case 1: {
myself.DropItem1(myself.sm, ItemA, gg.Rand(10) + 1);
break;

}

}
	}


}