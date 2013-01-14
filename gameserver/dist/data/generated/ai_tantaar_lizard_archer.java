package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_lizard_archer extends warrior_passive_use_bow {
	protected int Max_Desire = 1000000000000000000;
	protected int Skill01_ID = 458752001;
	protected int Skill02_ID = 458752001;
	protected int TID_SKILL_COOLTIME = 780001;
	protected int TIME_SKILL_COOLTIME = 2;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.AddTimerEx(TID_SKILL_COOLTIME, TIME_SKILL_COOLTIME * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
super;
if (myself.IsNullCreature(attacker) == 0) {
myself.c_ai0 = attacker;

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
super;
if (skill_name_id == 421199873) {
if (babble_mode) {
myself.Say("s_lizard_grasslands_fungus1 hit");

}
myself.AddUseSkillDesire(myself.sm, 433979393, 0, 1, Max_Desire);

}
if (babble_mode) {
myself.Say("SPELLED:" + skill_name_id / 256 * 256);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_SKILL_COOLTIME) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (gg.GetAbnormalLevel(myself.c_ai0, myself.Skill_GetAbnormalType(6619137)) == 0 && gg.Rand(100) >= 85) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 1, Max_Desire);

} else {
myself.AddUseSkillDesire(myself.c_ai0, Skill02_ID, 0, 1, Max_Desire);

}

}
myself.AddTimerEx(TID_SKILL_COOLTIME, TIME_SKILL_COOLTIME * 1000);

}
super;
	}

	protected void MY_DYING() {
super;
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.CreateOnePrivateEx(1018919, "ai_auragrafter", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 0, 0);

}
if (gg.Rand(1000) == 0 && myself.sm.npc_class_id != 1018862) {
myself.CreateOnePrivateEx(1018862, "tantaar_lizard_protecter", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 0, 0);

}
	}


}