package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_slow_type1 extends warrior_slow_type_bagic {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.p_state == 3 && attacker != myself.top_desire_target) {
if (myself.DistFromMe(myself.top_desire_target) > 100 && myself.DistFromMe(attacker) < 100) {
if (gg.Rand(100) < 80) {
myself.RemoveAllAttackDesire();
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

}
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(DDMagicSlow) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagicSlow) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagicSlow) == 0) {
myself.AddUseSkillDesire(attacker, DDMagicSlow, 0, 1, 1000000);

}

}
super;
	}


}