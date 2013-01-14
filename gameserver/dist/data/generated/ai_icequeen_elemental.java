package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_elemental extends default_npc {
	protected int Skill_Blizzard = 458752001;
	protected int Skill_Suicide = 458752001;
	protected int TIMER_blizzard = 2314005;
	protected int TIMER_elemental_suicide = 2314006;
	protected int TIMER_elemental_killed = 2314007;
	protected int TIMER_suicide = 2314050;
	protected int Dispel_Debuff_Prob = 7000;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam c0) {
myself.ChangeMoveType(0);
if (myself.sm.instant_zone_type_id == 144) {
myself.AddTimerEx(TIMER_blizzard, 10 * 1000);

} else {
myself.AddTimerEx(TIMER_blizzard, 20 * 1000);

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (myself.sm.param1 != 0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
if (myself.sm.instant_zone_type_id == 139) {
if (skill_level > 0) {
if (myself.Skill_GetAbnormalType(6029313) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6029313)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(6029313));

}

} else if (myself.Skill_GetAbnormalType(91357185) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(91357185)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(91357185));

}

} else if (myself.Skill_GetAbnormalType(18284545) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(18284545)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(18284545));

}

} else if (myself.Skill_GetAbnormalType(24051713) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(24051713)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(24051713));

}

} else if (myself.Skill_GetAbnormalType(76611585) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(76611585)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(76611585));

}

} else if (myself.Skill_GetAbnormalType(78708737) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(78708737));

}

} else if (myself.Skill_GetAbnormalType(26411009) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(26411009)) > 0) {
if (gg.Rand(10000) < Dispel_Debuff_Prob) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(26411009));

}

}

}

} else if (myself.sm.instant_zone_type_id == 144) {
if (skill_level > 0) {
if (myself.Skill_GetAbnormalType(6029313) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(6029313)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(6029313));

} else if (myself.Skill_GetAbnormalType(91357185) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(91357185)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(91357185));

} else if (myself.Skill_GetAbnormalType(18284545) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(18284545)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(18284545));

} else if (myself.Skill_GetAbnormalType(24051713) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(24051713)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(24051713));

} else if (myself.Skill_GetAbnormalType(76611585) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(76611585)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(76611585));

} else if (myself.Skill_GetAbnormalType(78708737) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(78708737)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(78708737));

} else if (myself.Skill_GetAbnormalType(26411009) == myself.Skill_GetAbnormalType(skill_name_id) && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(26411009)) > 0) {
myself.Dispel(myself.sm, myself.Skill_GetAbnormalType(26411009));

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || myself.IsInCategory(123, attacker.npc_class_id) == 1) {
if (myself.sm.hp < myself.sm.max_hp / 20.000000) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.AddTimerEx(TIMER_elemental_killed, 1000);

}

} else {
myself.AddAttackDesire(attacker, 1, damage * 2);
if (skill_name_id != 0) {
if (myself.Skill_GetAbnormalType(1835009) == myself.Skill_GetAbnormalType(skill_name_id)) {
if (debug_mode) {
myself.Say("HATE");

}
myself.AddAttackDesire(attacker, 1, damage * 5);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
myself.AddAttackDesire(creature, 1, 100);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_blizzard) {
myself.i_ai1 = myself.i_ai1 + 1;
if (debug_mode) {
myself.Say("timer_blizzard " + myself.i_ai1);

}
if (myself.i_ai0 == 0) {
if (myself.sm.instant_zone_type_id == 144) {
if (myself.i_ai1 == 5) {
myself.AddTimerEx(TIMER_elemental_suicide, 10 * 1000);

} else {
if (myself.Skill_GetConsumeMP(Skill_Blizzard) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Blizzard) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Blizzard) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill_Blizzard, 0, 1, 1000000);

}
myself.AddTimerEx(TIMER_blizzard, 10 * 1000);

}

} else if (myself.i_ai1 == 2) {
myself.AddTimerEx(TIMER_elemental_suicide, 20 * 1000);

} else {
if (myself.Skill_GetConsumeMP(Skill_Blizzard) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill_Blizzard) < myself.sm.hp && myself.Skill_InReuseDelay(Skill_Blizzard) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill_Blizzard, 0, 1, 1000000);

}
myself.AddTimerEx(TIMER_blizzard, 20 * 1000);

}

}

} else if (timer_id == TIMER_elemental_suicide) {
if (debug_mode) {
myself.Say("timer_suicide");

}
myself.StopMove();
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill_Suicide, 0, 0, 10000000000);

} else if (timer_id == TIMER_elemental_killed) {
if (myself.i_ai0 == 1) {
if (debug_mode) {
myself.Say("i killed. use suicide");

}
myself.StopMove();
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill_Suicide, 0, 0, 10000000000);

}

} else if (timer_id == TIMER_suicide) {
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == Skill_Suicide) {
if (debug_mode) {
myself.Say("skill_suicide finished");

}
myself.Suicide();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (script_event_arg1 == 23140020) {
myself.Suicide();

} else if (script_event_arg1 == 23140048) {
if (debug_mode) {
myself.Say("SCE_HOLD_DESIRE_ON");

}
myself.RemoveAllDesire();
myself.StopMove();
myself.Despawn();
myself.sm.absolute_defence = 1;
myself.sm.no_attack_damage = 1;

} else if (script_event_arg1 == 23140049) {
if (debug_mode) {
myself.Say("SCE_HOLD_DESIRE_OFF");

}
myself.sm.absolute_defence = 0;
myself.sm.no_attack_damage = 0;

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
if (debug_mode) {
myself.Say("블리자드 사용");
myself.AddUseSkillDesire(myself.sm, Skill_Blizzard, 0, 1, 1000000);

}

} else if (reply == 11) {
if (debug_mode) {
myself.Say("절대 디자이어 삭제");
myself.RemoveAbsoluteDesire();

}

} else if (reply == 2) {
if (debug_mode) {
myself.Say("Distfromme : " + myself.DistFromMe(creature));

}

} else if (reply == 3) {
myself.AddUseSkillDesire(myself.sm, Skill_Suicide, 0, 0, 10000000000);

}
	}


}