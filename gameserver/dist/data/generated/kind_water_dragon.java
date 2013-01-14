package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kind_water_dragon extends default_npc {
	protected String areadata = "kind_water_dragon_area_default";
	protected int selfbuff = 359792641;
	protected String areadata_name = "24_22_water_";

	protected void CREATED(HandlerParam s0, HandlerParam s1) {
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 0, 1000000);

}
myself.CreateOnePrivateEx(1022270, "kind_water_dragon_private", 0, 0, gg.FloatToInt(myself.sm.x + 50), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022270, "kind_water_dragon_private", 0, 0, gg.FloatToInt(myself.sm.x + 100), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022271, "kind_water_dragon_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 50), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(1022271, "kind_water_dragon_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 100), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.AddTimerEx(1103, 30 * 1000);
myself.AddTimerEx(1104, 5 * 60 * 1000);
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = 0;
if (myself.i_ai0 < 10) {
s1 = "00";

} else {
s1 = "0";

}
if (gg.Rand(100) < 50) {
myself.i_ai1 = 1;

} else {
myself.i_ai1 = 2;

}
if (myself.i_ai0 != 0) {
s0 = areadata_name + s1 + myself.i_ai0 + "_06";
gg.Area_SetOnOff(s0, 1);
s0 = areadata_name + s1 + myself.i_ai0 + "_0" + myself.i_ai1;
gg.Area_SetOnOff(s0, 1);

}
	}

	protected void NO_DESIRE() {
	}

	protected void PARTY_DIED(HandlerParam private, HandlerParam party0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (private != myself.sm) {
if (private.class_id == 1022270) {
myself.AddTimerEx(1101, 30 * 1000);

} else if (private.class_id == 1022271) {
myself.AddTimerEx(1102, 30 * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1, HandlerParam s0, HandlerParam s1) {
if (timer_id == 1101) {
myself.CreateOnePrivateEx(1022270, "kind_water_dragon_private", 0, 0, gg.FloatToInt(myself.sm.x + 200), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
if (timer_id == 1102) {
myself.CreateOnePrivateEx(1022271, "kind_water_dragon_private", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y + 200), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else if (timer_id == 1103) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(1103, 30 * 1000);

} else if (timer_id == 1104) {
if (myself.i_ai0 < 10) {
s1 = "00";

} else {
s1 = "0";

}
if (myself.i_ai0 != 0) {
s0 = areadata_name + s1 + myself.i_ai0 + "_0" + myself.i_ai1;
gg.Area_SetOnOff(s0, 0);

}
myself.DropItem1(myself.sm, 9691, 1);
if (gg.Rand(100) < 33) {
myself.DropItem1(myself.sm, 9700, 1);

}
myself.AddTimerEx(1105, 1000);

} else if (timer_id == 1105) {
myself.Despawn();

}
	}

	protected void MY_DYING(HandlerParam s0, HandlerParam s1) {
if (myself.i_ai0 < 10) {
s1 = "00";

} else {
s1 = "0";

}
if (myself.i_ai0 != 0) {
s0 = areadata_name + s1 + myself.i_ai0 + "_06";
gg.Area_SetOnOff(s0, 0);
s0 = areadata_name + s1 + myself.i_ai0 + "_0" + myself.i_ai1;
gg.Area_SetOnOff(s0, 0);

}
	}


}