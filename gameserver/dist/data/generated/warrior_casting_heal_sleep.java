package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_heal_sleep extends warrior_casting_heal {
	protected int MagicSleep = 265158657;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(MagicSleep) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicSleep) < myself.sm.hp && myself.Skill_InReuseDelay(MagicSleep) == 0) {
myself.AddUseSkillDesire(attacker, MagicSleep, 0, 1, 1000000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam i0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(victim, MagicHeal, 1, 1, 1000000);

}

}

}
super;
	}


}