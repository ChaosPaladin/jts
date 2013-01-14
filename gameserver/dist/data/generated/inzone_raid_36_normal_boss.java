package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_36_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 274857987;
	protected int Skill01_Probablity = 30;
	protected int Skill01_Target_Type = 0;
	protected int Skill02 = 274726916;
	protected int Skill02_Probablity = 40;
	protected int Skill02_Target_Type = 0;

	protected void CREATED() {
myself.AddTimerEx(9004, 60 * 1000);
myself.i_ai3 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam h0, HandlerParam private) {
if (timer_id == 9004) {
if (myself.i_ai0 == 1 && myself.i_ai3 < 9) {
myself.CreateOnePrivateEx(1018560, "inzone_raid_36_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai3 = myself.i_ai3 + 1;

}
myself.AddTimerEx(9004, 60 * 1000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_ai3 = myself.i_ai3 - 1;

}
	}


}