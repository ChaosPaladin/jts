package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_mimic extends default_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int CreviceOfDiminsion = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0) {
if (CreviceOfDiminsion != 0) {
if (myself.InMyTerritory(attacker) == 0) {
myself.RemoveAttackDesire(attacker.id);
return;

}

}
if (skill_name_id / 256 * 256 == 27 || skill_name_id / 256 * 256 == 2065 && myself.DistFromMe(attacker) > 280) {
i0 = myself.sm.level - 1;
i0 = i0 + 271581185;
if (myself.Skill_GetConsumeMP(278200321) < myself.sm.mp && myself.Skill_GetConsumeHP(278200321) < myself.sm.hp && myself.Skill_InReuseDelay(278200321) == 0) {
myself.AddUseSkillDesire(myself.sm, 278200321, 0, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
myself.AddUseSkillDesire(attacker, i0, 0, 1, 1000000);

}
myself.AddAttackDesire(attacker, 1, -1.000000 * myself.Skill_GetEffectPoint(skill_name_id) / myself.sm.level + 7 * 150);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
	}


}