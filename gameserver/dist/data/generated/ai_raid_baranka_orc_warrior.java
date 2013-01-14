package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_raid_baranka_orc_warrior extends ai_nest_warrior_hero {
	protected int debug_mode = 0;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
super;
if (script_event_arg1 == 2214005) {
if (debug_mode) {
myself.Say("SCRIPT_EVNET : BARANKA_INIT!!");

}
myself.Despawn();

} else if (script_event_arg1 == 2214007) {
if (debug_mode) {
myself.Say("SCRIPT_EVENT : BARANKA_DIED!!");

}
myself.Despawn();

} else if (script_event_arg1 == 2214008) {
if (myself.IsMyBossAlive()) {
if (myself.boss == gg.GetCreatureFromIndex(script_event_arg2)) {
myself.MakeAttackEvent(gg.GetCreatureFromIndex(script_event_arg3), 500, 0);

}

}

}
	}

	protected void MY_DYING() {
super;
myself.BroadcastScriptEvent(2214006, 0, 4000);
	}


}