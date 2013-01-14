package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_kinggoat_box extends default_npc {
	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void ATTACKED(HandlerParam damage, HandlerParam attacker) {
myself.c_ai0 = attacker;
	}

	protected void MY_DYING() {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(70320129)) > 0) {
if (gg.Rand(100) <= 50) {
myself.DropItem1(myself.sm, 9693, 1);

}
if (gg.Rand(100) < 33) {
myself.DropItem1(myself.sm, 9692, 1);

}

}

}
	}


}