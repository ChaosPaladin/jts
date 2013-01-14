package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_keym_firearea extends warrior_basic {
	protected int Skill01_keymonster = 373686273;
	protected int Skill01_display = 377094145;
	protected int monster_id = 1018621;
	protected int FireDeBuff = 378339329;
	protected String monster_ai = "ai_adiantum_skilluse";

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 && myself.i_ai0 == 0) {
myself.c_ai0 = creature;
myself.i_ai0 = 1;
myself.AddTimerEx(2000, 1000);
myself.AddTimerEx(6000, 1000);

}
super;
	}

	protected void ATTACKED() {
myself.LookNeighbor(2000);
if (myself.i_ai0 == 0) {
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 1000) {
myself.LookNeighbor(3000);
myself.AddTimerEx(1000, 10 * 1000);

}
if (timer_id == 2000) {
i0 = gg.Rand(100);
if (i0 < 50) {
c0 = myself.c_ai0;
if (myself.InMyTerritory(c0)) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_display, 0, 0, 500000);
myself.CreateOnePrivateEx(monster_id, monster_ai, 0, 0, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, 0, 0, 0);

}

}
myself.AddTimerEx(2000, 15 * 1000);

}
if (timer_id == 6000) {
if (myself.Skill_GetConsumeMP(FireDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(FireDeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(FireDeBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, FireDeBuff, 0, 1, 1000000);

}
myself.AddTimerEx(6000, 60000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2316002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, Skill01_keymonster, 0, 1, 50000000);

}

}
	}


}