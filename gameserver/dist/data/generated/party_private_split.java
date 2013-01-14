package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_split extends party_private {
	protected int PhysicalSpecial1 = 458752001;
	protected int PhysicalSpecial2 = 458752001;

	protected void CREATED() {
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.top_desire_target = myself.c_ai0;

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature == myself.top_desire_target) {
if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial1, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial2, 0, 1, 1000000);

}
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

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1006) {
if (myself.IsMyBossAlive() == 0) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.Despawn();
return;

} else {
myself.AddTimerEx(1006, 3 * 60 * 1000);

}

}

}
if (timer_id == 1004) {
myself.AddTimerEx(1006, 3 * 60 * 1000);

}
if (timer_id == 1001) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 9 && myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0) {
if (MoveAroundSocial > 0 || MoveAroundSocial1 > 0 || MoveAroundSocial2 > 0) {
if (MoveAroundSocial2 > 0 && gg.Rand(100) < 20) {
myself.AddEffectActionDesire(myself.sm, 3, MoveAroundSocial2 * 1000 / 30, 50);

} else if (MoveAroundSocial1 > 0 && gg.Rand(100) < 20) {
myself.AddEffectActionDesire(myself.sm, 2, MoveAroundSocial1 * 1000 / 30, 50);

} else if (MoveAroundSocial > 0 && gg.Rand(100) < 20) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 50);

}

}
if (ShoutMsg2 > 0 && gg.Rand(1000) < 17) {
if (IsSay == 0) {
myself.Shout(gg.MakeFString(ShoutMsg2, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(ShoutMsg2, "", "", "", "", ""));

}

}

} else if (myself.p_state == 3) {
if (ShoutMsg3 > 0 && gg.Rand(100) < 10) {
if (IsSay == 0) {
myself.Shout(gg.MakeFString(ShoutMsg3, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(ShoutMsg3, "", "", "", "", ""));

}

}

}
myself.AddTimerEx(1001, 10000);

}
if (timer_id == 1) {
if (AttackLowLevel == 1) {
myself.LookNeighbor(300);

}

}
if (timer_id == 2) {
if (IsVs == 1) {
myself.c_ai0 = myself.sm;

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.AddTimerEx(1004, 3 * 60 * 1000);

}
	}


}