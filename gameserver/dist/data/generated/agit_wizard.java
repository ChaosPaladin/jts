package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class agit_wizard extends agit_warrior {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0) {
if (attacker.level > myself.sm.level + 8 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(357564417)) == -1) {
myself.AddUseSkillDesire(attacker, 357564417, 0, 1, 1000000);
myself.RemoveAttackDesire(attacker.id);

}
if (myself.IsInCategory(12, attacker.npc_class_id) != 0 && attacker.master.pledge_id == myself.sm.pledge_id) {

} else if (attacker.pledge_id != myself.sm.pledge_id || attacker.pledge_id == 0) {
if (attacker.is_pc == 1) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 100);

} else {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 10);

}
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(267190278) < myself.sm.mp && myself.Skill_GetConsumeHP(267190278) < myself.sm.hp && myself.Skill_InReuseDelay(267190278) == 0) {
myself.AddUseSkillDesire(attacker, 267190278, 0, 1, 1000000);

}

}

}
	}


}