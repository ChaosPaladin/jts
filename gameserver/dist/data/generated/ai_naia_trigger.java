package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_naia_trigger extends warrior_flee {
	protected int trigger_type = 0;
	protected String naia_maker = "gludio59_1825_naia01m1";
	protected String naia_door_name = "c_tower_xxx";
	protected String area_naia_floor = "18_25_core_naia";
	protected String area_naia_pillar_1 = "18_25_naia_pillar_green";
	protected String area_naia_pillar_2 = "18_25_naia_pillar_red";
	protected int moveto1_x = -46080;
	protected int moveto1_y = 246368;
	protected int moveto1_z = -14183;
	protected int moveto2_x = -44816;
	protected int moveto2_y = 246368;
	protected int moveto2_z = -14183;
	protected int moveto3_x = -44224;
	protected int moveto3_y = 247440;
	protected int moveto3_z = -14184;
	protected int moveto4_x = -44896;
	protected int moveto4_y = 248464;
	protected int moveto4_z = -14183;
	protected int moveto5_x = -46064;
	protected int moveto5_y = 248544;
	protected int moveto5_z = -14183;
	protected int moveto6_x = -46720;
	protected int moveto6_y = 247424;
	protected int moveto6_z = -14183;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam i0, HandlerParam maker0) {
if (babble_mode == 1) {
myself.Shout("Trigger: " + gg.IntToStr(trigger_type));

}
if (trigger_type == 0) {
myself.BroadcastScriptEvent(78010059, 0, 5000);
if (babble_mode == 1) {
myself.Shout("보스전 가능 - 엘피 나왔음");

}
gg.Castle_GateOpenClose2(naia_door_name, 0);
gg.Area_SetOnOff(area_naia_floor, 0);
gg.Area_SetOnOff(area_naia_pillar_1, 1);
gg.Area_SetOnOff(area_naia_pillar_2, 0);
switch (gg.Rand(6)) {
case 0: {
myself.InstantTeleport(myself.sm, moveto1_x, moveto1_y, moveto1_z);
break;

}
case 1: {
myself.InstantTeleport(myself.sm, moveto2_x, moveto2_y, moveto2_z);
break;

}
case 2: {
myself.InstantTeleport(myself.sm, moveto3_x, moveto3_y, moveto3_z);
break;

}
case 3: {
myself.InstantTeleport(myself.sm, moveto4_x, moveto4_y, moveto4_z);
break;

}
case 4: {
myself.InstantTeleport(myself.sm, moveto5_x, moveto5_y, moveto5_z);
break;

}
case 5: {
myself.InstantTeleport(myself.sm, moveto6_x, moveto6_y, moveto6_z);
break;

}

}
myself.AddMoveAroundDesire(50, 20);

} else if (trigger_type == 1) {
if (babble_mode == 1) {
myself.Shout("보스 사망 기록 엘피 나왔음");

}
myself.Suicide();

}
	}


}