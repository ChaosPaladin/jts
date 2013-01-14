package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gludio_sword_guard_use_skill extends ai_gludio_sword_guard {
	protected int PhysicalSpecial = 458752001;
	protected int Dispel = 458752001;

	protected void ATTACKED(HandlerParam attacker) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker == myself.top_desire_target && gg.Rand(25) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
if (myself.DistFromMe(attacker) < 150 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(myself.sm, Dispel, 0, 1, 1000000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && myself.Castle_GetPledgeState(attacker.master) == 2) {

} else if (myself.Castle_GetPledgeState(attacker) != 2) {
if (attacker == myself.top_desire_target && gg.Rand(25) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
if (myself.DistFromMe(attacker) < 150 && gg.Rand(Rand * 15) < 1) {
myself.AddUseSkillDesire(myself.sm, Dispel, 0, 1, 1000000);

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0) {
if (myself.IsInCategory(12, creature.npc_class_id) != 0 && myself.Castle_GetPledgeState(creature.master) == 2) {

} else if (myself.Castle_GetPledgeState(creature) != 2) {
i0 = gg.Rand(10000);
if (i0 < 1) {
myself.Shout(gg.MakeFString(1800012, "", "", "", "", ""));

} else if (i0 < 2) {
myself.Shout(gg.MakeFString(1800013, "", "", "", "", ""));

}
myself.AddAttackDesire(creature, 1, 200);

}
	}


}