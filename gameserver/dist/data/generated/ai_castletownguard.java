package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castletownguard extends warrior_basic {
	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = -1;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai1 == -1) {
myself.Say(gg.MakeFString(1000016, "", "", "", "", ""));
myself.BroadcastScriptEvent(78010001, gg.GetIndexFromCreature(myself.sm), 1000);
myself.i_ai0 = 1;
myself.i_ai1 = creature.id;

}
super;
	}

	protected void ATTACKED() {
if (myself.i_ai0 == 0) {
myself.Say(gg.MakeFString(1000016, "", "", "", "", ""));
myself.BroadcastScriptEvent(78010001, gg.GetIndexFromCreature(myself.sm), 1000);
myself.i_ai0 = 1;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 78010029) {
myself.i_ai0 = 1;

}
	}


}