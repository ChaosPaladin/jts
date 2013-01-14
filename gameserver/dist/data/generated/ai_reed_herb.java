package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_reed_herb extends default_npc {
	protected int loot_extra01 = 14827;
	protected int loot_extra02 = 14825;
	protected int loot_extra03 = 14826;
	protected int loot_extra04 = 14824;
	protected int base_extra_roll = 100;
	protected int loot01_extra_roll = 50;
	protected int loot02_extra_roll = 5;
	protected int loot03_extra_roll = 25;
	protected int loot04_extra_roll = 10;
	protected int TID_SWAMP_CHECK = 78001;
	protected int TIME_SWAMP_CHECK = 240;
	protected int babble_mode = 0;

	protected void CREATED() {
if (gg.FloatToInt(myself.sm.z) >= -3800 && gg.FloatToInt(myself.sm.z) <= -3750) {
if (babble_mode == 1) {
myself.Say("허브 드랍 체크 후 타이머 재개");

}
if (gg.Rand(base_extra_roll) <= loot04_extra_roll) {
myself.DropItem1(myself.sm, loot_extra04, 1);

} else if (gg.Rand(base_extra_roll) <= loot03_extra_roll) {
myself.DropItem1(myself.sm, loot_extra03, 1);

} else if (gg.Rand(base_extra_roll) <= loot02_extra_roll) {
myself.DropItem1(myself.sm, loot_extra02, 1);

} else if (gg.Rand(base_extra_roll) <= loot01_extra_roll) {
myself.DropItem1(myself.sm, loot_extra01, 1);

}

}
myself.AddTimerEx(TID_SWAMP_CHECK, TIME_SWAMP_CHECK * 1000);
myself.AddMoveAroundDesire(3000, 50);
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(3000, 50);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TID_SWAMP_CHECK) {
if (gg.FloatToInt(myself.sm.z) >= -3800 && gg.FloatToInt(myself.sm.z) <= -3750) {
if (babble_mode == 1) {
myself.Say("허브 드랍 체크 후 타이머 재개");

}
if (gg.Rand(base_extra_roll) <= loot04_extra_roll) {
myself.DropItem1(myself.sm, loot_extra04, 1);

} else if (gg.Rand(base_extra_roll) <= loot03_extra_roll) {
myself.DropItem1(myself.sm, loot_extra03, 1);

} else if (gg.Rand(base_extra_roll) <= loot02_extra_roll) {
myself.DropItem1(myself.sm, loot_extra02, 1);

} else if (gg.Rand(base_extra_roll) <= loot01_extra_roll) {
myself.DropItem1(myself.sm, loot_extra01, 1);

}

}
myself.AddTimerEx(TID_SWAMP_CHECK, TIME_SWAMP_CHECK * 1000);

}
	}


}