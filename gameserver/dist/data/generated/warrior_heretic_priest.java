package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_heretic_priest extends warrior {
	protected int Hold = 0;
	protected int party_members = 0;
	protected int TelPosX1 = 0;
	protected int TelPosY1 = 0;
	protected int TelPosZ1 = 0;
	protected int TelPosX2 = 0;
	protected int TelPosY2 = 0;
	protected int TelPosZ2 = 0;
	protected int TelPosX3 = 0;
	protected int TelPosY3 = 0;
	protected int TelPosZ3 = 0;
	protected int PhysicalSpecial = 0;
	protected int PhysicalSpecial2 = 0;
	protected int HoldMagic = 0;
	protected int HelpCastRange = 500;
	protected int DistNoDesire = 500;
	protected int NoPCTeleport = 0;

	protected void CREATED() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void NO_DESIRE() {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 30);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.BroadcastScriptEvent(10033, gg.GetIndexFromCreature(attacker), HelpCastRange);

}
if (Hold == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

}

}

}

}

}
super;

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 0, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 0, 1000000);

}

}

} else if (myself.DistFromMe(myself.top_desire_target) > 500) {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 0, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 0, 1000000);

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, 1 * 100);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (Hold == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

}

}

}

} else if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

}

}
super;

} else {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3 && myself.p_state != 10) {
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 0, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 0, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, 1 * 100);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (attacker != myself.top_desire_target) {
if (myself.DistFromMe(myself.top_desire_target) > 500) {
myself.RemoveAttackDesire(myself.top_desire_target.id);
if (myself.DistFromMe(attacker) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 0, 1000000);

}

}

} else if (myself.DistFromMe(attacker) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 0, 1000000);

}

}

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 0, 1 * 100);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.sm.alive == 0) {
return;

}
i0 = gg.Rand(100);
if (i0 < 33 && creature.occupation == 5 || creature.occupation == 90 || myself.IsInCategory(3, creature.occupation)) {
myself.AddUseSkillDesire(creature, HoldMagic, 0, 0, 1000000);
if (Hold == 0) {
if (myself.DistFromMe(creature) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(creature) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial2, 0, 1, 1000000);

}

}

} else if (myself.DistFromMe(creature) <= 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial, 0, 0, 1000000);

}

}

} else if (myself.DistFromMe(creature) < 500) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial2, 0, 0, 1000000);

}

}

}
i0 = gg.Rand(100);
if (i0 < 33 && gg.Party_GetCount(creature) > party_members && creature.is_pc == 1 && NoPCTeleport == 0 && myself.InMyTerritory(creature)) {
c0 = myself.GetSummon(creature);
i1 = gg.Rand(3);
if (i1 == 0) {
myself.InstantTeleport(creature, TelPosX1, TelPosY1, TelPosZ1);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, TelPosX1, TelPosY1, TelPosZ1);

}

} else if (i1 == 1) {
myself.InstantTeleport(creature, TelPosX2, TelPosY2, TelPosZ2);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, TelPosX2, TelPosY2, TelPosZ2);

}

} else {
myself.InstantTeleport(creature, TelPosX3, TelPosY3, TelPosZ3);
if (myself.IsNullCreature(c0) == 0) {
myself.InstantTeleport(c0, TelPosX3, TelPosY3, TelPosZ3);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (Hold == 1) {
if (target.is_pc != 0 || myself.IsInCategory(12, target.npc_class_id)) {
myself.AddAttackDesire(target, 0, 1 * 100);

}

} else if (target.is_pc != 0 || myself.IsInCategory(12, target.npc_class_id)) {
myself.AddAttackDesire(target, 1, 1 * 100);

}
	}

	protected void OUT_OF_TERRITORY() {
if (Hold == 0) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);
myself.BroadcastScriptEvent(10035, 0, DistNoDesire);

}
	}


}