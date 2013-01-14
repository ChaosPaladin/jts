package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_slow_type_bagic extends warrior {
	protected int DDMagicSlow = 262209537;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai0 == 1) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
myself.i_ai1 = 1;

}

}

} else {
myself.AddTimerEx(2001, 5000);
myself.i_ai0 = 1;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;

} else {
if (myself.i_ai1 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0 && gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(DDMagicSlow) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagicSlow) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagicSlow) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, DDMagicSlow, 0, 1, 1000000);

}

}

}
myself.AddTimerEx(2001, 5000);
myself.i_ai1 = 0;

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(DDMagicSlow) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagicSlow) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagicSlow) == 0) {
myself.AddUseSkillDesire(attacker, DDMagicSlow, 0, 1, 1000000);

}

}

}
super;
	}


}