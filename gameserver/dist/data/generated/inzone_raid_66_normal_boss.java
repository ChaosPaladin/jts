package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_66_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 278134790;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02 = 340983814;
	protected int Skill02_Probablity = 10;
	protected int Skill02_Target_Type = 1;
	protected int Skill03 = 311164934;
	protected int Skill03_Probablity = 10;
	protected int Skill03_Target_Type = 0;

	protected void CREATED() {
myself.AddTimerEx(9984, 60 * 1000);
myself.i_ai3 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9984) {
if (myself.i_ai0 == 1 && myself.i_ai3 < 9 && myself.sm.alive == 1) {
myself.CreateOnePrivateEx(1018574, "inzone_raid_66_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai3 = myself.i_ai3 + 1;

}
myself.AddTimerEx(9984, 60 * 1000);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_ai3 = myself.i_ai3 - 1;

}
	}


}