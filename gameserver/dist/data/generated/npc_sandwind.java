package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_sandwind extends default_npc {
	protected int SandWind = 356188161;

	protected void CREATED() {
myself.ChangeMoveType(1);
	}

	protected void NO_DESIRE() {
myself.ChangeMoveType(1);
myself.AddMoveAroundDesire(10, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.AddUseSkillDesire(creature, SandWind, 0, 1, 1000000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (skill_name_id == 356122625) {
myself.Despawn();

}
super;
	}


}