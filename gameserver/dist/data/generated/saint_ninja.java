package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class saint_ninja extends warrior_physicalspecial {
	protected int PhysicalSpecial = 264241153;
	protected int SelfBuff = 263979009;
	protected int IsMainForm = 1;
	protected int TeleportEffect = 263979009;
	protected int OtherSelf = 1020130;
	protected String OtherSelfAI = "saint_ninja";

	protected void CREATED() {
myself.i_ai0 = 0;
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
if (IsMainForm == 0) {
myself.AddTimerEx(2000, 60000 * 5);

}
myself.AddTimerEx(2001, 60000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(100) < 80 && IsMainForm == 1 && myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(OtherSelf, OtherSelfAI, 0, 0, gg.FloatToInt(myself.sm.x) + gg.Rand(20), gg.FloatToInt(myself.sm.y) + gg.Rand(20), gg.FloatToInt(myself.sm.z), 32768, 1000, gg.GetIndexFromCreature(attacker), 1);
myself.i_ai0 = 1;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2000) {
if (myself.p_state != 3) {
myself.Despawn();
return;

} else {
myself.AddTimerEx(2000, 60000 * 5);

}

}
if (timer_id == 2001) {
if (myself.p_state != 3 && myself.sm.alive == 1) {
myself.InstantRandomTeleportInMyTerritory();
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}
myself.AddTimerEx(2001, 60000 * 5);

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0, HandlerParam f0) {
if (myself.IsInCombatMode(myself.sm) == 0 && myself.DistFromMe(attacker) > 300 && myself.sm.alive == 1) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z));
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

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

} else {
super;

}
	}


}