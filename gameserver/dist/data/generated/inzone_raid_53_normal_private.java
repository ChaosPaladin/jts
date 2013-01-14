package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_53_normal_private extends default_npc {
	protected int skill_explosion = 302383110;
	protected int debug_mode = 0;

	protected void CREATED() {
myself.SetMaxHateListSize(10);
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.AddTimerEx(9999, 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9999) {
myself.AddUseSkillDesire(myself.sm, skill_explosion, 1, 0, 999999999999999999);

} else if (timer_id == 9998) {
if (myself.c_ai3.instant_zone_id == myself.sm.instant_zone_id) {
if (myself.DistFromMe(myself.c_ai3) <= 50) {
myself.AddUseSkillDesire(myself.sm, skill_explosion, 1, 0, 999999999999999999);
if (debug_mode) {
myself.Say("거리 조건 만족으로 스킬 사용");

}

} else {
if (debug_mode) {
myself.Say("거리 조건 불만족! 재이동 루틴 작동!");

}
myself.AddMoveToDesire(gg.FloatToInt(myself.c_ai3.x), gg.FloatToInt(myself.c_ai3.y), gg.FloatToInt(myself.c_ai3.z), 100000000);
myself.AddTimerEx(9998, 1 * 1000);

}

} else if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 6, gg.GetIndexFromCreature(myself.sm));

}

} else if (timer_id == 9997) {
myself.RemoveAllDesire();
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == skill_explosion) {
myself.AddTimerEx(9997, 1 * 100);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 7) {
myself.c_ai3 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.c_ai3.instant_zone_id == myself.sm.instant_zone_id) {
myself.AddMoveToDesire(gg.FloatToInt(myself.c_ai3.x), gg.FloatToInt(myself.c_ai3.y), gg.FloatToInt(myself.c_ai3.z), 100000000);
myself.AddTimerEx(9998, 1 * 1000);

} else {
gg.SendScriptEvent(myself.c_ai0, 6, gg.GetIndexFromCreature(myself.sm));

}
if (debug_mode) {
myself.Say("타겟 받음 " + myself.c_ai3.name + " 이 타겟");

}

} else if (script_event_arg1 == 8) {
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
gg.SendScriptEvent(myself.c_ai0, 6, gg.GetIndexFromCreature(myself.sm));

}
if (debug_mode) {
myself.Say("보스 확인");

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.Despawn();

}
	}


}