package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_cancel extends warrior {
	protected int CancelMagic = 268304385;
	protected int CheckMagic = 458752001;
	protected int CheckMagic1 = 458752001;
	protected int CheckMagic2 = 458752001;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(10000) < 1 && myself.i_ai0 == 0 && myself.sm.hp > myself.sm.max_hp * 0.400000) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.i_ai0 = 1;

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(10000) < 1 && myself.i_ai0 == 0 && myself.sm.hp > myself.sm.max_hp * 0.400000) {
myself.i_ai0 = 1;

}

}
super;
	}


}