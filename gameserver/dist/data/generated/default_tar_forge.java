package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class default_tar_forge extends default_npc {
	protected int Skill_tar_spite01 = 402522113;
	protected int Skill_tar_spite02 = 402522114;
	protected int Skill_tar_spite03 = 402522115;
	protected int Shot_num_til_dsp = 5;
	protected int TID_LONELY_TOO_LONG = 78001;
	protected int TIME_LONELY_TOO_LONG = 300;
	protected int TID_LOOK_NEIGHBOR = 78002;
	protected int TIME_LOOK_NEIGHBOR = 10;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = Shot_num_til_dsp;
myself.LookNeighbor(400);
myself.AddTimerEx(TID_LOOK_NEIGHBOR, TIME_LOOK_NEIGHBOR * 1000);
myself.AddTimerEx(TID_LONELY_TOO_LONG, TIME_LONELY_TOO_LONG * 1000);
myself.BroadcastScriptEvent(78010081, myself.sm.id, 3000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (babble_mode == 1) {
myself.Say("보임 - 거리:" + myself.DistFromMe(creature));

}
if (creature.is_pc && myself.DistFromMe(creature) <= 300 && myself.i_ai1 > 0 && myself.Skill_GetConsumeMP(Skill_tar_spite01) < myself.sm.mp && myself.Skill_GetConsumeMP(Skill_tar_spite02) < myself.sm.mp && myself.Skill_GetConsumeMP(Skill_tar_spite03) < myself.sm.mp && myself.Skill_InReuseDelay(Skill_tar_spite01) == 0 && myself.Skill_InReuseDelay(Skill_tar_spite02) == 0 && myself.Skill_InReuseDelay(Skill_tar_spite03) == 0) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill_tar_spite01)) >= 2) {
if (babble_mode == 1) {
myself.Say("유효 목표 발견 - 3단계 스킬 사용");

}
myself.AddUseSkillDesire(creature, Skill_tar_spite03, 0, 0, 100);

} else if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(Skill_tar_spite01)) >= 1) {
if (babble_mode == 1) {
myself.Say("유효 목표 발견 - 2단계 스킬 사용");

}
myself.AddUseSkillDesire(creature, Skill_tar_spite02, 0, 0, 500);

} else {
if (babble_mode == 1) {
myself.Say("유효 목표 발견 - 1단계 스킬 사용");

}
myself.AddUseSkillDesire(creature, Skill_tar_spite01, 0, 0, 1000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == Skill_tar_spite01 || skill_name_id == Skill_tar_spite02 || skill_name_id == Skill_tar_spite03) {
myself.i_ai1 = myself.i_ai1 - 1;
if (babble_mode == 1) {
myself.Say("스킬 사용 완료 - 남은 횟수:" + myself.i_ai1);

}
if (myself.i_ai1 <= 0 || myself.Skill_GetConsumeMP(Skill_tar_spite01) > myself.sm.mp && myself.i_ai0 == 0) {
myself.i_ai0 = 1;
myself.Despawn();

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TID_LOOK_NEIGHBOR) {
if (babble_mode == 1) {
myself.Say("보이나");

}
myself.LookNeighbor(400);
myself.AddTimerEx(TID_LOOK_NEIGHBOR, TIME_LOOK_NEIGHBOR * 1000);

} else if (timer_id == TID_LONELY_TOO_LONG) {
if (myself.i_ai1 >= Shot_num_til_dsp && myself.i_ai0 == 0) {
if (babble_mode == 1) {
myself.Say("장기 대기 - 남은 횟수 임계 도달 - 디스폰:");

}
myself.i_ai0 = 1;
myself.Despawn();

} else {
if (myself.i_ai1 < Shot_num_til_dsp) {
if (babble_mode == 1) {
myself.Say("장기 대기 - 남은 횟수 추가:" + myself.i_ai1);

}
myself.i_ai1 = myself.i_ai1 + 1;

}
myself.AddTimerEx(TID_LONELY_TOO_LONG, TIME_LONELY_TOO_LONG * 1000);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 78010081 && script_event_arg2 != myself.sm.id && myself.i_ai0 == 0) {
if (babble_mode == 1) {
myself.Say("인접한 다른 비틀 발견 - 디스폰:");

}
myself.i_ai0 = 1;
myself.Despawn();

}
super;
	}


}