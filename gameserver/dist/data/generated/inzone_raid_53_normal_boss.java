package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_53_normal_boss extends inzone_raid_boss_standard {
	protected int Skill01 = 344719365;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02 = 330498053;
	protected int Skill02_Probablity = 10;
	protected int Skill02_Target_Type = 2;
	protected String private_spawn_maker = "53_normal_buham1";

	protected void CREATED() {
myself.i_ai9 = 60;
myself.AddTimerEx(9004, myself.i_ai9 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0) {
if (timer_id == 9004) {
if (myself.i_ai0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_spawn_maker);
gg.SendMakerScriptEvent(maker0, 5, gg.GetIndexFromCreature(myself.sm), 0);

}
myself.AddTimerEx(9004, myself.i_ai9 * 1000);

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.Say("Debug Mode : Private Respawn Time is reduced");
myself.AddTimerEx(9004, 1 * 1000);
myself.i_ai9 = 5;

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam maker0) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_spawn_maker);
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);
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