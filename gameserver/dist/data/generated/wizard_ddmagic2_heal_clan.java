package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_ddmagic2_heal_clan extends wizard_ddmagic2 {
	protected int MagicHeal = 458752001;

	protected void CREATED() {
myself.i_ai2 = 0;
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private) {
if (private == myself.boss && myself.i_ai2 == 0) {
if (private.hp < private.max_hp * 0.500000) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(private, MagicHeal, 1, 1, 1000000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == MagicHeal) {
myself.i_ai2 = 1;
myself.AddTimerEx(777, 2 * 1000);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 777) {
if (myself.i_ai2 == 1) {
myself.i_ai2 = 0;

}

}
super;
	}


}