package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_corpse_zombie_basic extends warrior {
	protected int SelfRangeDeBuff = 274464769;
	protected int IsTeleport = 0;
	protected int IsPrivate = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
if (IsPrivate == 1) {
myself.AddTimerEx(1004, 20000);

}
super;
	}

	protected void NO_DESIRE() {
if (IsPrivate == 1) {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1004) {
if (IsPrivate == 1 && myself.IsMyBossAlive() == 0) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.Despawn();
return;

}

}
myself.AddTimerEx(1004, 20000);

}
super;
	}

	protected void MY_DYING() {
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(SelfRangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(SelfRangeDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, SelfRangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (IsTeleport != 0) {
if (myself.DistFromMe(attacker) > 100 && myself.sm.hp > 0) {
if (myself.top_desire_target == attacker && gg.Rand(100) < 10) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));
if (myself.Skill_GetConsumeMP(IsTeleport) < myself.sm.mp && myself.Skill_GetConsumeHP(IsTeleport) < myself.sm.hp && myself.Skill_InReuseDelay(IsTeleport) == 0) {
myself.AddUseSkillDesire(myself.sm, IsTeleport, 1, 1, 1000000);

}
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
myself.AddAttackDesire(attacker, 1, f0 * 30);

}

}

}

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 10 && myself.i_ai0 == 0) {
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(SelfRangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(SelfRangeDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, SelfRangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}
myself.i_ai0 = 1;

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (IsTeleport != 0) {
if (myself.DistFromMe(attacker) > 100 && myself.p_state != 3 && gg.Rand(100) < 10 && myself.sm.hp > 0) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));
if (myself.Skill_GetConsumeMP(IsTeleport) < myself.sm.mp && myself.Skill_GetConsumeHP(IsTeleport) < myself.sm.hp && myself.Skill_InReuseDelay(IsTeleport) == 0) {
myself.AddUseSkillDesire(myself.sm, IsTeleport, 1, 1, 1000000);

}
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
myself.AddAttackDesire(attacker, 1, f0 * 30);

}

}

}
super;
	}


}