package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_43_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 273809412;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 2;
	protected int Skill02 = 267845636;
	protected int Skill02_Probablity = 10;
	protected int Skill02_Target_Type = 2;
	protected int Skill03 = 304152580;
	protected int Skill03_Probablity = 5;
	protected int Skill03_Target_Type = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED() {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= 60 && myself.i_ai1 == 0) {
myself.CreateOnePrivateEx(1018563, "inzone_raid_43_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai1 = 1;
myself.AddTimerEx(9008, 30 * 1000);

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= 30 && myself.i_ai2 == 0) {
myself.i_ai2 = 1;

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.Say(gg.MakeFString(1800180, "", "", "", "", ""));
myself.CreateOnePrivateEx(1018563, "inzone_raid_43_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0, HandlerParam h0) {
if (timer_id == 9008) {
if (myself.i_ai2 == 1 && myself.i_ai3 < 3) {
myself.CreateOnePrivateEx(1018563, "inzone_raid_43_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai3 = myself.i_ai3 + 1;

}
myself.AddTimerEx(9008, 30 * 1000);

}
super;
	}


}