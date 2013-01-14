package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit01_2_stand extends ai_agit01_1_stand {
	protected int b02_x0 = 1;
	protected int b02_y0 = 1;
	protected int b02_x1 = 1;
	protected int b02_y1 = 1;
	protected int b02_z1 = 1;
	protected int b02_x2 = 1;
	protected int b02_y2 = 1;
	protected int b02_z2 = 1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.AddTimerEx(2001, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.boss.flag == 0) {
if (myself.i_ai0 < 1) {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x + b02_x0), gg.FloatToInt(myself.boss.y + b02_y0), gg.FloatToInt(myself.boss.z), 100000000);
myself.i_ai0 = 1;

}

} else if (myself.boss.flag == 1) {
if (myself.i_ai0 < 2) {
myself.AddMoveToDesire(b02_x1, b02_y1, b02_z1, 100000000);
myself.i_ai0 = 2;

}

} else if (myself.i_ai0 < 3) {
myself.AddMoveToDesire(b02_x2, b02_y2, b02_z2, 100000000);
myself.i_ai0 = 3;

}
myself.AddTimerEx(2001, 10000);

}
super;
	}


}