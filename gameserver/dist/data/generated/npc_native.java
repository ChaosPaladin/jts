package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_native extends default_npc {
	protected int DoomSkill = 458752001;
	protected int silhouette = 1025543;
	protected String ai_type = "devil_called_by_native";

	protected void CREATED() {
myself.i_ai0 = 100;
myself.i_ai1 = 0;
	}

	protected void MY_DYING(HandlerParam c0) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, gg.GetIndexFromCreature(c0), 0);

} else {
myself.CreateOnePrivateEx(silhouette, ai_type, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam f0, HandlerParam i0) {
if (timer_id == 1000) {
if (myself.IsMyBossAlive() == 0) {
myself.Despawn();

}
i0 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) - 1;
if (i0 <= 0) {
myself.Suicide();

} else {
gg.SetNpcParam(myself.sm, 9, i0 * myself.sm.max_hp / 100);

}
if (myself.i_ai1 == 1) {
myself.AddTimerEx(1000, 1000);

}

}
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive() != 0) {
myself.AddFollowDesire(myself.boss, 5);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 0) {
if (myself.i_ai1 == 1) {
myself.i_ai1 = 0;

}

}
if (script_event_arg1 == 1) {
if (myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.Say(gg.MakeFString(1800136, "", "", "", "", ""));
myself.AddTimerEx(1000, 1000);

}

}
if (script_event_arg1 == 3) {
myself.Despawn();

}
	}


}