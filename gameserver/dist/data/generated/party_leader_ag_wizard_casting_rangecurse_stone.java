package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_ag_wizard_casting_rangecurse_stone extends party_leader_wizard_casting_rangecurse_stone {
	protected int MeleeAttackerAg = -1;

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc != 0) {
if (gg.OwnItemCount(creature, FriendShip1) >= 1 || gg.OwnItemCount(creature, FriendShip2) >= 1 || gg.OwnItemCount(creature, FriendShip3) >= 1 || gg.OwnItemCount(creature, FriendShip4) >= 1 || gg.OwnItemCount(creature, FriendShip5) >= 1) {

} else if (myself.IsInCategory(112, creature.occupation) != 0 && MeleeAttackerAg != 1 && gg.Rand(100) < MeleeAttackerAg) {

} else {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;

}

} else if (myself.IsInCategory(12, creature.npc_class_id) != 0) {
if (myself.IsNullCreature(creature.master) == 0 && gg.OwnItemCount(creature.master, FriendShip1) >= 1 || gg.OwnItemCount(creature.master, FriendShip2) >= 1 || gg.OwnItemCount(creature.master, FriendShip3) >= 1 || gg.OwnItemCount(creature.master, FriendShip4) >= 1 || gg.OwnItemCount(creature.master, FriendShip5) >= 1) {

} else {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;

}

} else {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (SeeCreatureAttackerTime == -1) {
if (SetAggressiveTime == -1) {
if (myself.GetLifeTime() >= gg.Rand(5) + 3 && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (SetAggressiveTime == 0) {
if (myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SetAggressiveTime + gg.Rand(4) && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

} else if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;

}
	}


}