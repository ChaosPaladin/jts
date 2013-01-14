package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_63_normal_private extends inzone_combat_monster {
	protected int Skill01 = 309526533;
	protected int Skill01_Probablity = 40;
	protected int Skill01_Target_Type = 0;

	protected void CREATED() {
myself.AddTimerEx(9984, 20 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9984 && myself.sm.alive == 1) {
myself.Say(gg.MakeFString(1800184, "", "", "", "", ""));
gg.SendScriptEvent(myself.boss, 3, 0);
myself.Suicide();

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}


}