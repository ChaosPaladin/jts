package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_wizard extends wizard_basic {
	protected int Ditect_PC = -1;
	protected int Dying_Message = -1;

	protected void CREATED() {
myself.i_ai8 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (Ditect_PC != -1) {
if (myself.i_ai8 == 0) {
myself.Say(gg.MakeFString(Ditect_PC, "", "", "", "", ""));
myself.i_ai8 = 1;

}

}

}
super;
	}

	protected void MY_DYING() {
if (Dying_Message != -1) {
myself.Say(gg.MakeFString(Dying_Message, "", "", "", "", ""));

}
super;
	}


}