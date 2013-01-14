package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_hero extends monster_parameter {
	protected int HeroSkill = 262209537;

	protected void CREATED(HandlerParam c0) {
if (myself.sm.param3 != 0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param3);
if (myself.IsNullCreature(c0) == 0) {
if (myself.Skill_GetConsumeMP(HeroSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(HeroSkill) < myself.sm.hp && myself.Skill_InReuseDelay(HeroSkill) == 0) {
myself.AddUseSkillDesire(c0, HeroSkill, 0, 1, 1000000);

}
myself.AddAttackDesire(c0, 1, 1000);

}

}
myself.AddTimerEx(3001, 15 * 1000);
myself.AddTimerEx(3002, 8000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 3001) {
myself.Despawn();

}
if (timer_id == 3002) {
i0 = 1000434 + gg.Rand(7);
myself.Say(gg.MakeFString(i0, "", "", "", "", ""));

}
super;
	}


}