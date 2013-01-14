package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_saint_selfrange_ddmagic extends wizard_saint_middle_ddmagic {
	protected int W_SelfRangeDDMagic = 264306689;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0 || myself.top_desire_target != attacker && myself.DistFromMe(attacker) < 40) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_SelfRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(myself.sm, W_SelfRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(myself.sm, 1, 1000);

}

}

}
super;
	}


}