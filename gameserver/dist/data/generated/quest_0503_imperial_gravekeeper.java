package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class quest_0503_imperial_gravekeeper extends default_npc {
	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void CREATED() {
myself.i_ai0 = 1;
myself.i_ai1 = 50;
myself.i_ai2 = 80;
myself.sm.weight_point = 10;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
if (myself.sm.in_peacezone != 1) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= myself.i_ai1) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 3) {
myself.i_ai0 = 2;
myself.InstantTeleportInMyTerritory(179520, 6464, -2706, 200);

} else {
myself.i_ai0 = 3;
myself.InstantTeleportInMyTerritory(171104, 6496, -2706, 200);

}

}
if (myself.Skill_GetConsumeMP(267386881) < myself.sm.mp && myself.Skill_GetConsumeHP(267386881) < myself.sm.hp && myself.Skill_InReuseDelay(267386881) == 0) {
myself.AddUseSkillDesire(myself.sm, 267386881, 1, 1, 1000000);

}
if (myself.i_ai1 == 50) {
myself.i_ai1 = 30;

} else if (myself.i_ai1 == 30) {
myself.i_ai1 = -1;

}

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) <= myself.i_ai2) {
if (myself.i_ai2 == 80) {
myself.i_ai2 = 40;

} else if (myself.i_ai2 == 40) {
myself.i_ai2 = 20;

} else {
myself.i_ai2 = -1;

}
myself.CreateOnePrivate(1027180, "imperial_slave", 0, 1);
myself.CreateOnePrivate(1027180, "imperial_slave", 0, 1);
myself.CreateOnePrivate(1027180, "imperial_slave", 0, 1);
myself.CreateOnePrivate(1027180, "imperial_slave", 0, 1);

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
myself.i_ai1 = 50;

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 30) {
myself.i_ai1 = 30;

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 80) {
myself.i_ai2 = 80;

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 40) {
myself.i_ai2 = 40;

} else if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 20) {
myself.i_ai2 = 20;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 50);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 50);

}
	}

	protected void OUT_OF_TERRITORY() {
myself.RemoveAllAttackDesire();
	}


}