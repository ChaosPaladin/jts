package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_timer_bomb extends warrior {
	protected int SelfRangeDDMagic = 330432513;
	protected String superpointname = "hall_alarm_device";

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
myself.i_ai0 = 0;
i0 = gg.Rand(59);
if (i0 < 10) {
i0 = i0 + 10;

}
myself.AddTimerEx(1009, i0 * 1000);
i1 = gg.Rand(9);
i1 = i1 + 1;
myself.AddTimerEx(1010, i1 * 1000);
myself.AddMoveSuperPointDesire(superpointname, 1, 2000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) < 200) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i1) {
if (timer_id == 1009) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}
if (timer_id == 1010) {
if (myself.i_ai0 == 0) {
myself.ChangeMoveType(0);
myself.i_ai0 = 1;

} else {
myself.ChangeMoveType(1);
myself.i_ai0 = 0;

}
i1 = gg.Rand(9);
if (i1 <= 2) {
i1 = i1 + 3;

}
myself.AddTimerEx(1010, i1 * 1000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (SelfRangeDDMagic != 0) {
if (skill_name_id == SelfRangeDDMagic) {
if (success == 1) {
myself.Suicide();

}

}

}
super;
	}


}