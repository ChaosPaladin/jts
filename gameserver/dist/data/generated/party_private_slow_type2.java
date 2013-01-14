package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_slow_type2 extends party_private_slow_type_bagic {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) > 200 && gg.Rand(100) < 70) {
if (myself.Skill_GetConsumeMP(DDMagicSlow) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagicSlow) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagicSlow) == 0) {
myself.AddUseSkillDesire(attacker, DDMagicSlow, 0, 1, 1000000);

}

}
super;
	}


}