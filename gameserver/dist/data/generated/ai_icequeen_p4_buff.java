package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_p4_buff extends default_npc {
	protected int Skill01_ID = 412024833;
	protected int TIMER_heal = 2314016;
	protected int debug_mode = 0;

	protected void CREATED() {
if (debug_mode) {
myself.Say("버프 NPC 스폰함");

}
myself.AddTimerEx(TIMER_heal, 5 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_heal) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 1000000);

}
myself.AddTimerEx(TIMER_heal, 10 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 23140020) {
if (debug_mode) {
myself.Say("버프NPC 디스폰함");

}
myself.Despawn();

}
	}


}