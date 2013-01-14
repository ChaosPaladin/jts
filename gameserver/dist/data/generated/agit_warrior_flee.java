package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class agit_warrior_flee extends agit_warrior {
	protected void CREATED() {
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1) {
if (attacker.level > myself.sm.level + 8 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(357564417)) == -1) {
myself.AddUseSkillDesire(attacker, 357564417, 0, 1, 1000000);
myself.RemoveAttackDesire(attacker.id);

}
if (myself.i_ai1 == 1) {
myself.AddFleeDesire(attacker, 10000);

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && attacker.master.pledge_id == myself.sm.pledge_id) {

} else if (attacker.pledge_id != myself.sm.pledge_id || attacker.pledge_id == 0) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (attacker.is_pc == 1) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

} else {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 10);

}

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 30) {
if (gg.Rand(100) < 90) {
if (attacker.is_pc == 1) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

} else {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 10);

}

} else {
myself.i_ai1 = 1;
myself.RemoveAllAttackDesire();
myself.AddTimerEx(3001, 5000);

}

} else {
myself.i_ai1 = 1;
myself.RemoveAllAttackDesire();

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai1 == 0) {
super;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3001) {
myself.i_ai1 = 0;

}
super;
	}


}