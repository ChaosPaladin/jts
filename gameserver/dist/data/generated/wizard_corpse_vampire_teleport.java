package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_corpse_vampire_teleport extends wizard_corpse_vampire_basic {
	protected int TeleportEffect = 263979009;

	protected void CREATED() {
myself.AddTimerEx(3000, 10000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
super;
return;

}
if (myself.p_state != 3 && myself.GetLifeTime() > 7 && myself.sm.alive == 1) {
if (myself.DistFromMe(creature) > 200) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z));
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3000) {
myself.LookNeighbor(500);
myself.AddTimerEx(3000, 10000);

}
super;
	}


}