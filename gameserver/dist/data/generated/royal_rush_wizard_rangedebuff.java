package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_wizard_rangedebuff extends royal_rush_wizard_ddmagic2 {
	protected int W_RangeDeBuff = 272629761;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_RangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(W_RangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_RangeDeBuff) == 0) {
myself.AddUseSkillDesire(attacker, W_RangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_RangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

}
super;
	}


}