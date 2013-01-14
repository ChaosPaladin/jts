package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_karnibi extends ai_a_seed_normal_monster {
	protected int Skill01_ID = 418971649;
	protected int Skill01_Probability = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 419037185;
	protected int Skill02_Probability = 10;
	protected int Skill02_Target_Type = 1;
	protected int Skill03_ID = 419102721;
	protected int Skill03_Probability = 10;
	protected int Skill03_Target_Type = 0;
	protected int SpecialSkill01_ID = 418906113;
	protected int FieldCycle_ID = 6;
	protected int FieldCycle_point = 1;
	protected int DIST_CHECK_TIMER = 3113;

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (target.is_pc == 1) {
if (myself.IsInCategory(112, target.occupation) == 1 || myself.IsInCategory(3, target.occupation) == 1) {
if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(target, 418709505, 0, 1, max_desire);

}

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(target, 418709505, 0, 1, max_desire);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
if (attacker.is_pc == 1) {
if (myself.IsInCategory(112, attacker.occupation) == 1 || myself.IsInCategory(3, attacker.occupation) == 1) {
if (gg.Rand(100) < 1) {
myself.AddFleeDesire(attacker, max_desire);
myself.AddTimerEx(DIST_CHECK_TIMER, 1000);
myself.c_ai0 = attacker;

}

} else if (gg.Rand(100) < 5) {
myself.AddFleeDesire(attacker, max_desire);
myself.AddTimerEx(DIST_CHECK_TIMER, 1000);
myself.c_ai0 = attacker;

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == DIST_CHECK_TIMER) {
myself.AddUseSkillDesire(myself.c_ai0, SpecialSkill01_ID, 0, 1, max_desire);

}
super;
	}


}