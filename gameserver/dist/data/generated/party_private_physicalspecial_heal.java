package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_physicalspecial_heal extends party_private_physicalspecial {
	protected int MagicHeal = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.sm.hp <= myself.sm.max_hp / 2 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 0, 1, 1000000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (myself.sm.hp <= myself.sm.max_hp / 2 && private != myself.sm && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(private, MagicHeal, 1, 1, 1000000);

}

}
if (myself.boss.hp <= myself.boss.max_hp / 2 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.boss, MagicHeal, 1, 1, 1000000);

}

}
super;
	}


}