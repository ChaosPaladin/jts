package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_rematan_boss extends default_npc {
	protected int Skill01_id = 374079489;
	protected int Skill02_id = 374145025;
	protected int Skill03_id = 374210561;
	protected int Skill04_id = 374276097;
	protected int Skill05_display = 377225217;
	protected int JumpStage_Hate = 300;
	protected int TeleZone_X = 86116;
	protected int TeleZone_Y = -209117;
	protected int TeleZone_Z = -3774;
	protected int TeleUnderShip_X = 85413;
	protected int TeleUnderShip_Y = -210717;
	protected int TeleUnderShip_Z = -4216;
	protected int TeleOnTheShip_X = 85000;
	protected int TeleOnTheShip_Y = -208699;
	protected int TeleOnTheShip_Z = -3336;
	protected int TeleportEffect = 306118657;
	protected String TeleZoneName = "22_11_pailaka_telezone_02";
	protected String private_maker = "pailaka_2211_43m1";

	protected void CREATED() {
myself.AddTimerEx(1000, 1000);
gg.Area_SetOnOffEx(TeleZoneName, 0, myself.InstantZone_GetId());
myself.CreateOnePrivateEx(1018606, "ai_arrived_detect", 0, 0, 85010, -208700, -3336, 0, 0, 0, 0);
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.c_ai0 = attacker;
myself.AddHateInfo(attacker, gg.FloatToInt(damage * 1), 0, 1, 1);

}
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;
myself.c_ai1 = attacker;

}
if (myself.i_ai0 == 0) {
if (attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
myself.c_ai0 = attacker.master;

}
if (gg.GetMemoState(myself.c_ai0, 129) == 4) {
myself.AddTimerEx(9000, 1000);
myself.i_ai0 = 1;

} else {
myself.AddTimerEx(1001, 1000);
myself.i_ai2 = 1;
myself.i_ai0 = 1;

}

}
if (myself.i_ai2 == 2 && myself.i_ai4 == 0) {
myself.AddTimerEx(3000, 10);
myself.i_ai4 = 1;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam attacker, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
myself.LookNeighbor(300);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 0) {
if (creature.is_pc == 1) {
myself.c_ai0 = creature;

} else if (creature.summon_type == 1 || creature.summon_type == 2) {
myself.c_ai0 = creature.master;

} else {
return;

}
if (gg.GetMemoState(myself.c_ai0, 129) == 4) {
myself.AddTimerEx(9000, 1000);
myself.i_ai0 = 1;

} else {
myself.AddTimerEx(1001, 1000);
myself.i_ai2 = 1;
myself.i_ai0 = 1;

}
myself.c_ai0 = creature;

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.i_ai3 == 0) {
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}
myself.i_ai2 = 2;
myself.AddTimerEx(4000, 2000);
myself.i_ai3 = 1;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam h0, HandlerParam c0, HandlerParam maker0) {
if (timer_id == 1000) {
myself.LookNeighbor(1000);
myself.AddTimerEx(1000, 20 * 1000);

}
if (timer_id == 1001) {
if (myself.sm.hp < myself.sm.max_hp * 0.500000) {
myself.RemoveAllDesire();
myself.AddTimerEx(2000, 1 * 1000);
return;

}
c0 = myself.c_ai0;
if (gg.Rand(100) < 30) {
myself.AddUseSkillDesire(c0, Skill01_id, 0, 1, 50000);

} else {
myself.AddAttackDesire(c0, 1, 10000);

}
myself.AddTimerEx(1001, 5 * 1000);

}
if (timer_id == 2000) {
gg.Area_SetOnOffEx(TeleZoneName, 1, myself.InstantZone_GetId());
myself.AddMoveToDesire(TeleZone_X, TeleZone_Y, TeleZone_Z, 500000000);
if (myself.i_ai2 != 2) {
myself.AddTimerEx(2000, 5 * 1000);

} else {
myself.RemoveAllDesire();

}

}
if (timer_id == 3000) {
if (myself.i_ai2 != 2) {
return;

}
if (myself.IsNullCreature(myself.c_ai2) == 0) {
if (myself.DistFromMe(myself.c_ai2) > 800) {
myself.InstantTeleport(myself.sm, TeleOnTheShip_X, TeleOnTheShip_Y, TeleOnTheShip_Z);

}

}
if (myself.i_ai1 == 0) {
myself.AddUseSkillDesire(myself.sm, Skill05_display, 0, 0, 80000000);
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, private_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.AddTimerEx(5000, 5000);
myself.i_ai1 = 1;

}
if (myself.i_ai4 == 1) {
if (myself.sm.hp < myself.sm.max_hp * 0.400000) {
myself.BroadcastScriptEvent(2211003, gg.GetIndexFromCreature(myself.sm), 4000);
myself.i_ai4 = 0;

}

} else if (myself.sm.hp > myself.sm.max_hp * 0.500000) {
myself.BroadcastScriptEvent(2211004, gg.GetIndexFromCreature(myself.sm), 4000);
myself.i_ai4 = 1;

}
if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(myself.sm, Skill04_id, 1, 0, 80000000);

}
if (gg.Rand(100) < 50) {
if (gg.Rand(2) < 1) {
myself.AddUseSkillDesire(myself.c_ai0, Skill02_id, 0, 1, 50000000);

} else {
myself.AddUseSkillDesire(myself.c_ai0, Skill03_id, 0, 1, 50000000);

}

} else {
myself.AddAttackDesire(myself.c_ai0, 1, 1000);

}
myself.AddTimerEx(3000, 15 * 1000);

}
if (timer_id == 4000) {
myself.InstantTeleport(myself.sm, TeleOnTheShip_X, TeleOnTheShip_Y, TeleOnTheShip_Z);

}
if (timer_id == 5000) {
myself.BroadcastScriptEvent(2211001, gg.GetIndexFromCreature(myself.sm), 3000);

}
if (timer_id == 9000) {
myself.CreateOnePrivateEx(1032511, "pa61_reward_npc", 0, 0, 85583, -208678, -3328, 0, 0, 0, 0);
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 2211002 && myself.i_ai4 == 0) {
myself.c_ai2 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(myself.c_ai2) == 1) {

}
myself.AddTimerEx(3000, 1);
myself.i_ai4 = 1;

}
	}

	protected void MY_DYING() {
myself.CreateOnePrivateEx(1032511, "pa61_reward_npc", 0, 0, 84983, -208736, -3328, 49915, 0, 0, 0);
	}


}