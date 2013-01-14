package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_sinslave extends warrior_basic {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Probablity = 0;
	protected int Skill02_ID = 348323843;
	protected int Skill02_Probablity = 0;
	protected int Skill03_ID = 348323845;
	protected int Skill03_Probablity = 0;
	protected int mode = 0;
	protected int use_skill = 0;
	protected int time_interval = 3600;

	protected void CREATED() {
if (use_skill == 1) {
gg.SendScriptEvent(myself.boss, 78010006, 0);

} else if (use_skill == 2) {
gg.SendScriptEvent(myself.boss, 78010007, 0);

} else {
myself.AddUseSkillDesire(myself.boss, Skill01_ID, 1, 1, 10000000);

}
myself.AddTimerEx(78001, time_interval * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
if (use_skill == 0) {
if (gg.GetAbnormalLevel(myself.boss, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
myself.AddUseSkillDesire(myself.boss, Skill01_ID, 1, 1, 10000000);

}

} else if (use_skill == 1) {
gg.SendScriptEvent(myself.boss, 78010006, 0);

} else if (use_skill == 2) {
gg.SendScriptEvent(myself.boss, 78010007, 0);

}
myself.AddTimerEx(78001, time_interval * 1000);

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (use_skill == 1 || use_skill == 2) {
if (mode == 0) {
i0 = gg.Rand(15000);

} else {
i0 = gg.Rand(10000);

}
if (i0 <= 100 && use_skill == 1 || i0 <= 50 && use_skill == 2) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
if (mode == 1) {
myself.AddUseSkillDesire(myself.sm, Skill03_ID, 1, 1, 10000000);

} else {
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 1, 1, 10000000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (skill_name_id == Skill01_ID && use_skill == 0 && target == myself.boss) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Skill01_ID)) <= 0) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 1, 10000000);

}

} else if (skill_name_id == Skill02_ID || skill_name_id == Skill03_ID && success == 1) {
myself.Despawn();

}
super;
	}

	protected void MY_DYING() {
if (use_skill == 0 && myself.IsNullCreature(myself.boss) == 0) {
if (gg.GetAbnormalLevel(myself.boss, myself.Skill_GetAbnormalType(Skill01_ID)) > 0) {
myself.Dispel(myself.boss, myself.Skill_GetAbnormalType(Skill01_ID));

}

}
super;
	}


}