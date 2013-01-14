package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_use_bow_not_flee extends warrior {
	protected int LongRangePhysicalSpecial = 458752001;
	protected int MagicHeal = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.sm.hp < myself.sm.max_hp / 3) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(LongRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(LongRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(LongRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (victim.hp < victim.max_hp / 3) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(victim, MagicHeal, 1, 1, 1000000);

}

}
super;
	}


}