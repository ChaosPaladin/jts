package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_couple extends party_private {
	protected int MagicHeal = 266403841;
	protected int SelfBuff = 266403841;

	protected void PARTY_DIED(HandlerParam private, HandlerParam c0) {
if (private != myself.sm) {
if (myself.DistFromMe(private) < 100) {
c0 = myself.top_desire_target;
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(c0, 1, 1000);

}

}

}
super;
	}


}