package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_corpse_necro_summon extends wizard_corpse_necro {
	protected int ClearCorpse = 272039937;
	protected int SummonPrivate = 1020130;
	protected String SummonPrivateAI = "warrior";

	protected void CREATED() {
myself.AddTimerEx(3456, 5000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam h0, HandlerParam i0) {
if (creature.alive == 0 && creature.is_pc == 0 && gg.Rand(100) < 30 && myself.DistFromMe(creature) < 200) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.UseSkill(creature, ClearCorpse);
myself.CreateOnePrivateEx(SummonPrivate, SummonPrivateAI, 0, 0, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z), 0, 1000, gg.GetIndexFromCreature(h0.creature), 0);

}

}
return;

}
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

} else {
super;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam f0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3456) {
myself.LookNeighbor(200);
myself.AddTimerEx(3456, 5000);

}
super;
	}


}