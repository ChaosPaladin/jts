package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class azit_watering_mimic extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void CREATED() {
myself.sm.residence_id = 62;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
	}


}