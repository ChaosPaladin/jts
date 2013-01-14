package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_stone extends default_npc {
	protected int Buff = 458752001;
	protected String MAKER_summoner = "schuttgart29_2314_05m1";
	protected String MAKER_summoner_hard = "schuttgart29_2314_hd_05m1";
	protected int TIMER_suicide = 2314004;
	protected int TIMER_state_chg = 2314008;
	protected int Dispel_Debuff = 1;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.ChangeNPCState(myself.sm, 1);
if (debug_mode) {
myself.Say("결빙석 스폰");

}
myself.AddTimerEx(TIMER_state_chg, 1400);
myself.i_ai0 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai0 == 0) {
if (myself.sm.hp < myself.sm.max_hp / 10.000000) {
if (debug_mode) {
myself.Say("MP회복 버프 시전");

}
if (myself.sm.param1 == 1) {
if (myself.Skill_GetConsumeMP(412942338) < myself.sm.mp && myself.Skill_GetConsumeHP(412942338) < myself.sm.hp && myself.Skill_InReuseDelay(412942338) == 0) {
myself.AddUseSkillDesire(myself.sm, 412942338, 1, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(412942337) < myself.sm.mp && myself.Skill_GetConsumeHP(412942337) < myself.sm.hp && myself.Skill_InReuseDelay(412942337) == 0) {
myself.AddUseSkillDesire(myself.sm, 412942337, 1, 1, 1000000);

}
myself.i_ai0 = 1;

}

}
myself.c_ai0 = attacker;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam maker0, HandlerParam i0) {
if (debug_mode) {
myself.Say("주변PC의 MP회복 버프 시전 완료.");

}
if (success == 1 && myself.i_ai0 == 1) {
if (skill_name_id == 412942337 || skill_name_id == 412942338) {
i0 = myself.InstantZone_GetId();
if (myself.sm.param1 == 1) {
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_summoner_hard);

} else if (myself.sm.param1 == 0) {
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_summoner);

}
if (gg.IsNull(maker0) == 0) {
if (gg.Rand(100) < 75) {
if (debug_mode) {
myself.Say("숨결 스폰 신호");

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140012, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(myself.c_ai0));

} else {
gg.SendMakerScriptEvent(maker0, 23140012, gg.GetIndexFromCreature(myself.sm), 0);

}

}

}
myself.AddTimerEx(TIMER_suicide, 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == TIMER_suicide) {
if (debug_mode) {
myself.Say("자살.");

}
myself.ChangeStatus(2);
myself.ChangeNPCState(myself.sm, 3);
myself.Suicide();

} else if (timer_id == TIMER_state_chg) {
myself.ChangeNPCState(myself.sm, 2);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 23140020) {
myself.ChangeNPCState(myself.sm, 3);
myself.AddTimerEx(TIMER_suicide, 1000);

} else if (script_event_arg1 == 23140051) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 23140052, gg.GetIndexFromCreature(myself.sm));

}

} else if (script_event_arg1 == 23140048) {
myself.Suicide();

}
	}

	protected void MY_DYING(HandlerParam maker0) {
if (debug_mode) {
myself.Say("my_dying.");

}
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140040, 0, 0);

}
	}

	protected void ABNORMAL_STATUS_CHANGED(HandlerParam speller, HandlerParam skill_id, HandlerParam skill_level, HandlerParam skill_name_id, HandlerParam s0, HandlerParam i0) {
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

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
if (debug_mode) {
myself.Say("1 : 펑");
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}

} else if (reply == 2) {
if (debug_mode) {
myself.Say("2 : 펑");
myself.AddTimerEx(TIMER_suicide, 500);

}

} else if (reply == 31) {
if (debug_mode) {
myself.Say("31 : 스테이트 변경 - 1");
myself.ChangeNPCState(myself.sm, 1);

}

} else if (reply == 32) {
if (debug_mode) {
myself.Say("32 : 스테이트 변경 - 2");
myself.ChangeNPCState(myself.sm, 2);

}

} else if (reply == 33) {
if (debug_mode) {
myself.Say("33 : 스테이트 변경 - 3");
myself.ChangeNPCState(myself.sm, 3);

}

} else if (debug_mode) {
myself.Say("1 : 버프쓰고 숨결스폰하고 펑");
myself.Say("2 : 그냥 펑.");
myself.Say("31 : 스테이트 변경 - 1");
myself.Say("32 : 스테이트 변경 - 2");
myself.Say("33 : 스테이트 변경 - 3");

}
	}


}