package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_adiantum_boss extends default_npc {
	protected int Skill01_id = 373686274;
	protected int Skill02_id = 373751810;
	protected int Skill03_id = 373817345;
	protected int Skill01_display = 377094145;
	protected int Skill04_display = 377159681;
	protected int DEBUG_MODE = 0;

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
	}

	protected void NO_DESIRE() {
if (myself.GetLifeTime() > 9) {
myself.AddMoveAroundDesire(5, 5);
myself.LookNeighbor(2000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam attacker, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
myself.AddAttackDesire(attacker, 1, 10000);
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai0 == 0) {
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.c_ai0 = attacker.master;

}
if (gg.GetMemoState(myself.c_ai0, 128) == 9) {
myself.AddTimerEx(9000, 1000);
myself.i_ai0 = 1;

} else {
myself.AddTimerEx(2000, 1000);
myself.i_ai0 = 1;

}

}
myself.c_ai0 = attacker;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (myself.i_ai0 == 0) {
if (creature.is_pc == 1) {
myself.c_ai0 = creature;

} else if (creature.summon_type == 1 || creature.summon_type == 2) {
myself.c_ai0 = creature.master;

} else {
return;

}
if (gg.GetMemoState(myself.c_ai0, 128) == 9) {
myself.AddTimerEx(9000, 1000);
myself.i_ai0 = 1;

} else {
myself.AddTimerEx(2000, 1000);
myself.i_ai0 = 1;

}
myself.c_ai0 = creature;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i10, HandlerParam i11) {
if (timer_id == 1000) {
myself.LookNeighbor(1000);
myself.AddTimerEx(1000, 5 * 1000);

}
if (timer_id == 2000) {
i0 = gg.Rand(100);
if (DEBUG_MODE == 1) {
myself.Say("Rand value:" + i0);

}
c0 = myself.c_ai0;
if (myself.IsNullCreature(c0) == 1) {
myself.AddTimerEx(2000, 3 * 1000);

}
if (i0 < 60) {
i10 = gg.Rand(6);
switch (i10) {
case 0: {

}
case 1: {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_display, 1, 0, 50000000);
if (myself.InMyTerritory(c0)) {
myself.CreateOnePrivateEx(1018621, "ai_adiantum_skilluse", 0, 0, gg.FloatToInt(c0.x), gg.FloatToInt(c0.y), gg.FloatToInt(c0.z), 0, 0, 0, 0);

}
if (DEBUG_MODE == 1) {
myself.Say("Skill 01");

}
break;

}
case 2: {

}
case 3: {
myself.AddUseSkillDesire(c0, Skill02_id, 0, 1, 50000000);
if (DEBUG_MODE == 1) {
myself.Say("Skill 02");

}
break;

}
case 4: {
myself.AddUseSkillDesire(c0, Skill03_id, 0, 1, 50000000);
if (DEBUG_MODE == 1) {
myself.Say("Skill 03");

}
break;

}
case 5: {
myself.AddUseSkillDesire(myself.sm, Skill04_display, 1, 0, 50000000);
i1 = 0;
if (185171 < gg.FloatToInt(c0.y) && 185467 > gg.FloatToInt(c0.y)) {
i1 = 1;
if (DEBUG_MODE == 1) {
myself.Say("A 열 - " + i1);

}

}
if (184875 <= gg.FloatToInt(c0.y) && 185171 >= gg.FloatToInt(c0.y)) {
i1 = 2;
if (DEBUG_MODE == 1) {
myself.Say("B 열 - " + i1);

}

}
if (184579 <= gg.FloatToInt(c0.y) && 184875 > gg.FloatToInt(c0.y)) {
i1 = 3;
if (DEBUG_MODE == 1) {
myself.Say("C 열 - " + i1);

}

}
if (i1 == 0) {
if (DEBUG_MODE == 1) {
myself.Say("PC가 보스 방에 없다.");

}

}
if (gg.FloatToInt(c0.x) < -53300) {
i2 = -54031;
if (i1 == 1) {
i3 = 185319;

} else if (i1 == 2) {
i3 = 185319 - 296;

} else if (i1 == 3) {
i3 = 185319 - 296 - 296;

} else if (DEBUG_MODE == 1) {
myself.Say("Y축 Seed ?? 없다.");

}
i5 = 1;
for (i4 = 0; i4 < 6; i4 = i4 + 1) {
myself.CreateOnePrivateEx(1018617, "adiantum_trap", 0, 0, i6, i3, gg.FloatToInt(c0.z), 0, 0, 0, 0);
i6 = i2 + i4 * 150 + i5 * 22;
if (DEBUG_MODE == 1) {
myself.Say("x:" + i6 + " y:" + i3 + " z:" + gg.FloatToInt(c0.z));

}
i5 = 2 * i5;

}
if (DEBUG_MODE == 1) {
myself.Say("Skill 04");

}

} else {
if (DEBUG_MODE == 1) {
myself.Say("역순 Trap On");

}
i2 = -52578;
if (i1 == 1) {
i3 = 185319;

} else if (i1 == 2) {
i3 = 185319 - 296;

} else if (i1 == 3) {
i3 = 185319 - 296 - 296;

} else if (DEBUG_MODE == 1) {
myself.Say("Y축 Seed 값이 없다.");

}
i5 = 1;
for (i4 = 0; i4 < 6; i4 = i4 + 1) {
myself.CreateOnePrivateEx(1018617, "adiantum_trap", 0, 0, i6, i3, gg.FloatToInt(c0.z), 0, 0, 0, 0);
i6 = i2 - i4 * 150 - i5 * 22;
if (DEBUG_MODE == 1) {
myself.Say("x:" + i6 + " y:" + i3 + " z:" + gg.FloatToInt(c0.z));

}
i5 = 2 * i5;

}
break;

}

}

}

} else {
if (DEBUG_MODE == 1) {
myself.Say("물리 공격");

}
myself.AddAttackDesire(c0, 1, 500);

}
myself.AddTimerEx(2000, 15 * 1000);

}
if (timer_id == 9000) {
myself.CreateOnePrivateEx(1032510, "pa36_reward_npc", 0, 0, -53168, 184996, -4616, 0, 0, 0, 0);
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2316002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, Skill01_id, 0, 1, 9000000000);
if (DEBUG_MODE == 1) {
myself.Say("진짜 skill 01 사용");

}

} else if (DEBUG_MODE == 1) {
myself.Say("Creature is NULL");

}

}
	}

	protected void MY_DYING() {
	}


}