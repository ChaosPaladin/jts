package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_73_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 275251207;
	protected int Skill01_Probablity = 20;
	protected int Skill01_Target_Type = 2;
	protected int Skill02 = 274989063;
	protected int Skill02_Probablity = 20;
	protected int Skill02_Target_Type = 2;

	protected void CREATED() {
myself.AddTimerEx(9984, 60 * 1000);
myself.i_ai3 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9984) {
if (myself.i_ai0 == 1 && myself.i_ai3 < 9 && myself.sm.alive == 1) {
myself.CreateOnePrivateEx(1018578, "inzone_raid_73_normal_private", 0, 0, gg.FloatToInt(myself.sm.x + 10), gg.FloatToInt(myself.sm.y + 10), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.i_ai3 = myself.i_ai3 + 1;

}
myself.AddTimerEx(9984, 60 * 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam h0) {
if (script_event_arg1 == 6) {

}
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 3000);
c0 = gg.GetCreatureFromIndex(script_event_arg2);
i0 = myself.GetHateInfoCount();
if (i0 > 0) {
i1 = gg.Rand(i0);
h0 = myself.GetHateInfoByIndex(i1);

}
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 7, gg.GetIndexFromCreature(h0.creature));

}

}
	}


}