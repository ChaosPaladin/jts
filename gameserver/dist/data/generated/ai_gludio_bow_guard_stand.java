package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_bow_guard_stand extends ai_gludio_stand {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 100);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, damage / myself.sm.max_hp / 0.050000 * 50);

}

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == 16121857) {
if (myself.DistFromMe(speller) < 1000) {
myself.AddAttackDesire(speller, 0, 50000);

}

}
	}


}