package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_raid_baranka_observer extends default_npc {
	protected int debug_mode = 0;

	protected void SEE_CREATURE(HandlerParam creature) {
if (debug_mode) {
myself.Say("SEE CREATURE");

}
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (creature.is_pc == 1) {
gg.SendScriptEvent(myself.boss, 2214009, gg.GetIndexFromCreature(creature));

} else {
gg.SendScriptEvent(myself.boss, 2214009, gg.GetIndexFromCreature(creature.master));

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (script_event_arg1 == 2214007) {
myself.Despawn();

}
	}


}