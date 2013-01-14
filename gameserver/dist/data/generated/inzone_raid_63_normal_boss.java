package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_63_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 273350662;
	protected int Skill01_Probablity = 5;
	protected int Skill01_Target_Type = 0;

	protected void CREATED() {
myself.AddTimerEx(9984, 50 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (timer_id == 9984) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 20 && myself.i_ai0 == 1 && myself.sm.alive == 1) {
myself.Say(gg.MakeFString(1800183, "", "", "", "", ""));
myself.CreateOnePrivateEx(1018572, "inzone_raid_63_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
gg.SetNpcParam(myself.sm, 9, myself.sm.hp - myself.sm.max_hp * 0.050000);

}
myself.AddTimerEx(9984, 50 * 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (script_event_arg1 == 3) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 70 && myself.sm.alive == 1) {
gg.SetNpcParam(myself.sm, 9, myself.sm.hp + myself.sm.max_hp * 0.200000);

} else {
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp - 10);

}

}
	}


}