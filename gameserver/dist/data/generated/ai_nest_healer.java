package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_healer extends warrior_behavior {
	protected int Heal = 458752001;
	protected int HealProb = 3333;
	protected int SelfRangeHeal = 458752001;
	protected int SelfRangeHealProb = 1500;
	protected int SelfRangeBuff = 458752001;
	protected int HELP_PROB = 2500;

	protected void CREATED() {
super;
if (SelfRangeBuff != 458752001) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff, 1, 1, 1000000);

}

}
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (myself.sm.hp < myself.sm.max_hp * 0.700000) {
if (gg.Rand(10000) < HealProb) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(myself.sm, Heal, 1, 1, 1000000);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam victim, HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.IsNullCreature(victim) == 0 && victim != myself.sm) {
if (myself.IsNullCreature(attacker) == 0) {
i0 = gg.Rand(10000);
if (i0 <= HELP_PROB) {
myself.MakeAttackEvent(attacker, damage, 0);

}

}

}
if (victim.hp < victim.max_hp * 0.700000) {
if (gg.Rand(10000) < HealProb) {
if (myself.Skill_GetConsumeMP(Heal) < myself.sm.mp && myself.Skill_GetConsumeHP(Heal) < myself.sm.hp && myself.Skill_InReuseDelay(Heal) == 0) {
myself.AddUseSkillDesire(victim, Heal, 1, 1, 1000000);

}

}

}
if (victim.hp < victim.max_hp * 0.300000) {
if (gg.Rand(10000) < SelfRangeHealProb) {
if (myself.Skill_GetConsumeMP(SelfRangeHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeHeal) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeHeal, 1, 1, 1000000);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 2214005 || script_event_arg1 == 2214007) {
myself.Despawn();

} else if (script_event_arg1 == 2214008) {
if (myself.IsMyBossAlive()) {
if (myself.boss == gg.GetCreatureFromIndex(script_event_arg2)) {
myself.MakeAttackEvent(gg.GetCreatureFromIndex(script_event_arg3), 500, 0);

}

}

}
	}


}