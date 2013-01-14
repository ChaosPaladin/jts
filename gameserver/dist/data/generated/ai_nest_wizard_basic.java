package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_wizard_basic extends wizard_use_skill {
	protected int HELP_PROB = 800;
	protected int debug_mode = 0;

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void CLAN_ATTACKED(HandlerParam victim, HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.IsNullCreature(victim) == 0 && victim != myself.sm) {
if (myself.IsNullCreature(attacker) == 0) {
i0 = gg.Rand(10000);
if (i0 <= HELP_PROB) {
myself.MakeAttackEvent(attacker, damage, 0);

}

}

}
if (myself.IsMyBossAlive() && victim == myself.boss) {
if (myself.IsNullCreature(attacker) == 0) {
myself.MakeAttackEvent(attacker, damage, 0);

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (private != myself.sm) {
if (myself.IsNullCreature(attacker) == 0) {
myself.MakeAttackEvent(attacker, damage, 0);

}

}
	}


}