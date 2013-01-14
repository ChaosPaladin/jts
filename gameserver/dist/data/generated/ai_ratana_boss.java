package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ratana_boss extends default_npc {
	protected int Skill01_id = 374538241;
	protected int Skill02_id = 374603777;
	protected int Skill03_id = 374669313;
	protected int Skill04_id = 374734849;
	protected int Skill02_display = 377421825;
	protected int DEBUG_MODE = 0;
	protected int OHS_Weapon = 9136;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.AddTimerEx(1000, 1000);
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (myself.i_ai2 == 0) {
if (creature.is_pc == 1) {
myself.c_ai0 = creature;

}
if (creature.summon_type == 1 || creature.summon_type == 2) {
return;

}
if (gg.GetMemoState(myself.c_ai0, 144) == 4) {
myself.AddTimerEx(9000, 1000);
myself.i_ai0 = 1;

} else {
myself.EffectMusic(myself.sm, 10000, "BS08_A");
myself.BroadcastScriptEvent(2316004, 1, 4000);
myself.AddTimerEx(500, 1000);
myself.i_ai2 = 1;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam attacker, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
myself.AddAttackDesire(attacker, 0, 100);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0) {
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.c_ai0 = attacker.master;

}
if (gg.GetMemoState(myself.c_ai0, 144) == 4) {
myself.AddTimerEx(9000, 1000);
myself.i_ai0 = 1;

} else {
myself.EffectMusic(myself.sm, 10000, "BS08_A");
myself.BroadcastScriptEvent(2316004, 2, 4000);
myself.AddTimerEx(600, 1000);
myself.i_ai2 = 1;

}

}
myself.c_ai0 = attacker;
if (myself.sm.hp < myself.sm.max_hp * 0.300000 && myself.i_ai0 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill04_id, 1, 0, 50000000);
myself.i_ai0 = 1;
myself.AddTimerEx(4000, 120 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i10, HandlerParam i11) {
if (timer_id == 500) {
myself.CreateOnePrivateEx(1018605, "ai_wdragon_target", 0, 0, 105465, -41817, -1768, 0, 0, 0, 0);
myself.AddTimerEx(501, 3000);

}
if (timer_id == 501) {
myself.AddEffectActionDesire(myself.sm, 0, 91 * 1000 / 30, 10000);
myself.AddTimerEx(502, 3000);

}
if (timer_id == 502) {
myself.AddUseSkillDesire(myself.c_ai1, Skill02_display, 0, 0, 500);
myself.AddTimerEx(503, 9700);

}
if (timer_id == 503) {
if (myself.IsNullCreature(myself.c_ai1) == 1) {

} else {
myself.AddUseSkillDesire(myself.c_ai1, Skill02_id, 0, 0, 5000);

}
myself.AddTimerEx(504, 6030);

}
if (timer_id == 504) {
myself.AddTimerEx(505, 4000);

}
if (timer_id == 505) {
myself.AddTimerEx(2000, 1000);

}
if (timer_id == 600) {
myself.CreateOnePrivateEx(1018605, "ai_wdragon_target", 0, 0, 105465, -41817, -1768, 0, 0, 0, 0);
myself.AddTimerEx(602, 2000);

}
if (timer_id == 602) {
myself.AddUseSkillDesire(myself.sm, Skill01_id, 0, 0, 50000);
myself.AddTimerEx(603, 2500);

}
if (timer_id == 603) {
if (myself.IsNullCreature(myself.c_ai1) == 1) {

} else {
myself.AddUseSkillDesire(myself.c_ai1, Skill02_id, 0, 0, 50000);

}
myself.AddTimerEx(604, 6030);

}
if (timer_id == 604) {
myself.AddTimerEx(2000, 6000);

}
if (timer_id == 1000) {
myself.AddTimerEx(1000, 30 * 1000);

}
if (timer_id == 2000) {
i0 = gg.Rand(100);
c0 = myself.c_ai0;
if (myself.IsNullCreature(c0) == 1) {
myself.AddTimerEx(2000, 3000);

}
if (myself.DistFromMe(c0) < 100) {
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(myself.sm, Skill01_id, 0, 0, 500000);

} else {
myself.AddAttackDesire(c0, 0, 1000);

}

} else if (gg.Rand(100) < 50) {
if (myself.InMyTerritory(c0)) {
myself.CreateOnePrivateEx(1018661, "ai_ratana_skilluse", 0, 0, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, gg.GetIndexFromCreature(myself.sm), 0, 0);

}

} else {
myself.AddUseSkillDesire(c0, Skill03_id, 0, 0, 500000);

}
myself.AddTimerEx(2000, 6000);

}
if (timer_id == 4000) {
myself.i_ai0 = 0;

}
if (timer_id == 9000) {
myself.CreateOnePrivateEx(1032512, "pa73_reward_npc", 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) + 100, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2316002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && myself.DistFromMe(c0) <= 900) {
myself.AddUseSkillDesire(c0, Skill02_id, 0, 0, 500000);
if (DEBUG_MODE == 1) {
myself.Say("Skill 02");

}

} else if (DEBUG_MODE == 1) {
myself.Say("Error in Skill 03");

}

}
if (script_event_arg1 == 2316005) {
myself.c_ai1 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(myself.c_ai1) == 0) {

}

}
	}

	protected void MY_DYING() {
myself.CreateOnePrivateEx(1018604, "wdragon_camera02", 0, 0, 105974, -41794, -1784, 32768, 0, 0, 0);
myself.CreateOnePrivateEx(1032512, "pa73_reward_npc", 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y) + 100, gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
	}


}