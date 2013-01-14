package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_26_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 310378498;
	protected int Skill01_Probablity = 5;
	protected int Skill01_Target_Type = 1;

	protected void CREATED() {
myself.CreateOnePrivateEx(1018556, "inzone_raid_26_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai1 = 1;
myself.AddTimerEx(9004, 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam h0) {
if (timer_id == 9004) {
if (myself.i_ai0 == 1 && myself.i_ai1 == 0) {
myself.CreateOnePrivateEx(1018556, "inzone_raid_26_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Say(gg.MakeFString(1800177, "", "", "", "", ""));
myself.i_ai1 = 1;

}
myself.AddTimerEx(9004, 60 * 1000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_ai1 = 0;

}
	}


}