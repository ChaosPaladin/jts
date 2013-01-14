package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss09_barler_d extends default_npc {
	protected int d_skill1 = 458752001;

	protected void CREATED() {
myself.EffectMusic(myself.sm, 5000, "BS05_D");
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 13015) {
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153360, 141936, -12736, 8192, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153312, 142048, -12736, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153333, 142176, -12736, 61439, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153727, 141875, -12736, 24500, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153600, 141824, -12736, 16384, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153472, 141840, -12736, 12288, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153776, 142224, -12736, 40960, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153824, 142112, -12736, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153808, 141984, -12736, 28672, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153424, 142288, -12736, 57344, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153520, 142336, -12736, 49152, 0, 0, 0);
myself.CreateOnePrivateEx(1029105, "barler_private_crystal_golem_d", 0, 0, 153666, 142312, -12736, 45055, 0, 0, 0);

} else if (script_event_arg1 == 13016) {
myself.AddTimerEx(1002, 3000);

} else if (script_event_arg1 == 13017) {
myself.AddTimerEx(1003, 3000);
myself.AddTimerEx(1001, 11000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.Despawn();

} else if (timer_id == 1002) {
if (myself.Skill_GetConsumeMP(354091009) < myself.sm.mp && myself.Skill_GetConsumeHP(354091009) < myself.sm.hp && myself.Skill_InReuseDelay(354091009) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, 354091009, 0, 1, 1000000);

}

} else if (timer_id == 1003) {
if (myself.Skill_GetConsumeMP(354156545) < myself.sm.mp && myself.Skill_GetConsumeHP(354156545) < myself.sm.hp && myself.Skill_InReuseDelay(354156545) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, 354156545, 0, 1, 1000000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
	}


}