package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_the_heat extends default_npc {
	protected int heat_skill01 = 408944641;
	protected int heat_skill02 = 408944642;
	protected int heat_skill03 = 408944643;
	protected int heat_skill04 = 408944644;
	protected int heat_skill05 = 408944645;
	protected int vaccine_area_skill01 = 409796609;
	protected int radius_to_look = 600;
	protected int time_to_despawn = 20;
	protected int yell_appear = 1800890;
	protected int yell_disappear = 1800891;
	protected int TID_TO_DESPAWN = 78001;
	protected int vaccine_skill01 = 409010177;
	protected int vaccine_skill02 = 409075713;
	protected int vaccine_skill03 = 409141249;
	protected int vaccine_skill04 = 409206785;
	protected int vaccine_skill05 = 409272321;
	protected int vaccine_skill06 = 409337857;
	protected int vaccine_skill07 = 409403393;
	protected int vaccine_skill08 = 409468929;
	protected int vaccine_skill09 = 409534465;

	protected void CREATED() {
if (myself.IsNullCreature(gg.GetCreatureFromID(myself.sm.param1)) == 0) {
myself.c_ai0 = gg.GetCreatureFromID(myself.sm.param1);
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(vaccine_area_skill01)) > 0) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(heat_skill01)) == 2) {
myself.AddUseSkillDesire(myself.c_ai0, heat_skill03, 0, 1, 1000000);

} else if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(heat_skill01)) == 1) {
myself.AddUseSkillDesire(myself.c_ai0, heat_skill02, 0, 1, 1000000);

} else if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(heat_skill01)) <= 0) {
myself.AddUseSkillDesire(myself.c_ai0, heat_skill01, 0, 1, 1000000);

}

}
myself.Say(gg.MakeFString(yell_appear, "", "", "", "", ""));
myself.AddTimerEx(TID_TO_DESPAWN, time_to_despawn * 1000);

} else {
myself.AddTimerEx(TID_TO_DESPAWN, 10);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_TO_DESPAWN) {
myself.Say(gg.MakeFString(yell_disappear, "", "", "", "", ""));
myself.Despawn();

}
	}


}