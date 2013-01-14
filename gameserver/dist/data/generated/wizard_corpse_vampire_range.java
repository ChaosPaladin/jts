package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_corpse_vampire_range extends wizard_corpse_vampire_basic {
	protected int W_SelfRangeDDMagic = 274071553;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_SelfRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_SelfRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_SelfRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

}

}
super;
	}


}