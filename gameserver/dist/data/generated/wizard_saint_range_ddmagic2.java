package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_saint_range_ddmagic2 extends wizard_saint_ddmagic2 {
	protected int W_LongRangeDDMagic2 = 272039937;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0 || myself.top_desire_target != attacker && myself.DistFromMe(attacker) > 100) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic2) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic2) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic2, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic2, 0, 1, 1000000);

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