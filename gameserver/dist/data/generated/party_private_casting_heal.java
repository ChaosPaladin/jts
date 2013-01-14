package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_casting_heal extends party_private {
	protected int MagicHeal = 264568833;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damege, HandlerParam i0) {
i0 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
if (gg.Rand(100) < 33 && i0 < 70) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damege, HandlerParam i0) {
i0 = gg.FloatToInt(private.hp / private.max_hp * 100);
if (gg.Rand(100) < 33 && i0 < 70) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(private, MagicHeal, 1, 1, 1000000);

}

}
super;
	}


}