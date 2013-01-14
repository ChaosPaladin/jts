package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_areadata_desert extends default_npc {
	protected String areadata1 = "area_dehydration";
	protected String areadata2 = "area_dehydration_var";

	protected void CREATED() {
myself.AddTimerEx(1000, 10000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1000) {
i0 = gg.GetL2Time(2);
if (i0) {
gg.Area_SetOnOff(areadata1, 0);
gg.Area_SetOnOff(areadata2, 0);

} else {
gg.Area_SetOnOff(areadata1, 1);
gg.Area_SetOnOff(areadata2, 1);

}
myself.AddTimerEx(1000, 10000);

}
	}


}