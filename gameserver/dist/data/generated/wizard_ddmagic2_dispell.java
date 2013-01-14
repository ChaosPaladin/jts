package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_ddmagic2_dispell extends wizard_ddmagic2 {
	protected int Dispell = 262209537;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0) {
super;
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.i_ai0 == 0) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (gg.Rand(100) < 33 && i0 == 1) {
if (myself.Skill_GetConsumeMP(Dispell) < myself.sm.mp && myself.Skill_GetConsumeHP(Dispell) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(Dispell) == 0) {
myself.AddUseSkillDesire(attacker, Dispell, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, Dispell, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
super;
	}


}