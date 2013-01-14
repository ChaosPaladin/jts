package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_castle_pailaka_invader_wizard extends ai_castle_pailaka_invader_basic {
	protected void CREATED() {
super;
myself.i_ai4 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam h0) {
super;
if (myself.i_ai4 == 0) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);
if (myself.GetHateInfoCount() > 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (myself.DistFromMe(h0.creature) >= 150) {
if (DDSkill_01 != 458752001) {
if (myself.Skill_GetConsumeMP(DDSkill_01) < myself.sm.mp && myself.Skill_GetConsumeHP(DDSkill_01) < myself.sm.hp && myself.Skill_InReuseDelay(DDSkill_01) == 0) {
myself.AddUseSkillDesire(h0.creature, DDSkill_01, 0, 1, 1000000);

}

}

} else if (DDSkill_02 != 458752001) {
if (myself.Skill_GetConsumeMP(DDSkill_02) < myself.sm.mp && myself.Skill_GetConsumeHP(DDSkill_02) < myself.sm.hp && myself.Skill_InReuseDelay(DDSkill_02) == 0) {
myself.AddUseSkillDesire(h0.creature, DDSkill_02, 0, 1, 1000000);

}

}

}

}

}

} else if (myself.i_ai4 == 1) {
myself.AddAttackDesire(attacker, 1, damage);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0) {
super;
if (timer_id == 4811) {
if (myself.Skill_GetConsumeMP(DDSkill_01) > myself.sm.mp && myself.Skill_GetConsumeMP(DDSkill_02) > myself.sm.mp) {
myself.AddTimerEx(4811, 10 * 1000);

} else {
myself.RemoveAllDesire();
myself.i_ai4 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
if (myself.i_ai4 == 0) {
if (myself.Skill_GetConsumeMP(DDSkill_01) > myself.sm.mp && myself.Skill_GetConsumeMP(DDSkill_02) > myself.sm.mp) {
myself.RemoveAllDesire();
h0 = myself.GetMaxHateInfo(0);
myself.AddAttackDesire(h0.creature, 1, 1000);
myself.i_ai4 = 1;
myself.AddTimerEx(4811, 10 * 1000);

} else {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
c0 = h0.creature;
if (myself.DistFromMe(c0) >= 150) {
if (DDSkill_01 != 458752001) {
if (myself.Skill_GetConsumeMP(DDSkill_01) < myself.sm.mp && myself.Skill_GetConsumeHP(DDSkill_01) < myself.sm.hp && myself.Skill_InReuseDelay(DDSkill_01) == 0) {
myself.AddUseSkillDesire(c0, DDSkill_01, 0, 1, 1000000);

}

}

} else if (DDSkill_02 != 458752001) {
if (myself.Skill_GetConsumeMP(DDSkill_02) < myself.sm.mp && myself.Skill_GetConsumeHP(DDSkill_02) < myself.sm.hp && myself.Skill_InReuseDelay(DDSkill_02) == 0) {
myself.AddUseSkillDesire(c0, DDSkill_02, 0, 1, 1000000);

}

}

}

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam h0, HandlerParam i0, HandlerParam i1) {
if (script_event_arg1 == 2117001) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai0 == 1) {
myself.MakeAttackEvent(c0, 500, 0);

}

}

}
	}


}