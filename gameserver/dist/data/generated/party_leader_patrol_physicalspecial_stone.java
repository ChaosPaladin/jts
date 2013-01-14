package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_patrol_physicalspecial_stone extends party_leader_patrol_physicalspecial {
	protected int DeBuff1 = 295895041;

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc != 0) {
if (gg.OwnItemCount(attacker, FriendShip1) >= 1 || gg.OwnItemCount(attacker, FriendShip2) >= 1 || gg.OwnItemCount(attacker, FriendShip3) >= 1 || gg.OwnItemCount(attacker, FriendShip4) >= 1 || gg.OwnItemCount(attacker, FriendShip5) >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}
myself.RemoveAttackDesire(attacker.id);

} else {
super;

}

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0) {
if (myself.IsNullCreature(attacker.master) == 0 && gg.OwnItemCount(attacker.master, FriendShip1) >= 1 || gg.OwnItemCount(attacker.master, FriendShip2) >= 1 || gg.OwnItemCount(attacker.master, FriendShip3) >= 1 || gg.OwnItemCount(attacker.master, FriendShip4) >= 1 || gg.OwnItemCount(attacker.master, FriendShip5) >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}
myself.RemoveAttackDesire(attacker.id);

} else {
super;

}

} else {
super;

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
if (attacker.is_pc != 0) {
if (gg.OwnItemCount(attacker, FriendShip1) >= 1 || gg.OwnItemCount(attacker, FriendShip2) >= 1 || gg.OwnItemCount(attacker, FriendShip3) >= 1 || gg.OwnItemCount(attacker, FriendShip4) >= 1 || gg.OwnItemCount(attacker, FriendShip5) >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}
myself.RemoveAttackDesire(attacker.id);

} else {
super;

}

} else if (myself.IsInCategory(12, attacker.npc_class_id) != 0) {
if (myself.IsNullCreature(attacker.master) == 0 && gg.OwnItemCount(attacker.master, FriendShip1) >= 1 || gg.OwnItemCount(attacker.master, FriendShip2) >= 1 || gg.OwnItemCount(attacker.master, FriendShip3) >= 1 || gg.OwnItemCount(attacker.master, FriendShip4) >= 1 || gg.OwnItemCount(attacker.master, FriendShip5) >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}
myself.RemoveAttackDesire(attacker.id);

} else {
super;

}

} else {
super;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.Skill_GetEffectPoint(skill_name_id) > 0) {
if (speller.is_pc != 0) {
if (gg.OwnItemCount(speller, FriendShip1) >= 1 || gg.OwnItemCount(speller, FriendShip2) >= 1 || gg.OwnItemCount(speller, FriendShip3) >= 1 || gg.OwnItemCount(speller, FriendShip4) >= 1 || gg.OwnItemCount(speller, FriendShip5) >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(speller, DeBuff1, 0, 1, 1000000);

}
myself.RemoveAttackDesire(speller.id);

} else {
super;

}

} else if (myself.IsInCategory(12, speller.npc_class_id) != 0) {
if (myself.IsNullCreature(speller.master) == 0 && gg.OwnItemCount(speller.master, FriendShip1) >= 1 || gg.OwnItemCount(speller.master, FriendShip2) >= 1 || gg.OwnItemCount(speller.master, FriendShip3) >= 1 || gg.OwnItemCount(speller.master, FriendShip4) >= 1 || gg.OwnItemCount(speller.master, FriendShip5) >= 1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(speller, DeBuff1, 0, 1, 1000000);

}
myself.RemoveAttackDesire(speller.id);

} else {
super;

}

} else {
super;

}

}
	}


}