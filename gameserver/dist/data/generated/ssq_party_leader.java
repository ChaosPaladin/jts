package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_party_leader extends ssq_event_basic_warrior {
	protected String Privates = "orc:ssq_event_party_private:1:20sec;orc:ssq_event_party_private:1:20sec";

	protected void CREATED() {
myself.sm.weight_point = 10;
myself.CreatePrivates(Privates);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.InMyTerritory(attacker) == 0) {
return;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) >= 0 && myself.DistFromMe(myself.top_desire_target) > 40) {
if (myself.CanAttack(myself.top_desire_target) == 1) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

}

}

}
super;
	}


}