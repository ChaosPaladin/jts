package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_monster extends monster_parameter {
	protected int LifeTime = 12;

	protected void CREATED() {
if (myself.sm.param1) {
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 200);

}

}
if (myself.sm.param3) {
myself.c_ai1 = myself.boss;

}
myself.AddTimerEx(3000, 1000 * 60 * LifeTime);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam npc0, HandlerParam c0, HandlerParam i0, HandlerParam f0) {
c0 = attacker;
if (c0.master) {
c0 = c0.master;

}
if (c0.is_pc == 1) {
if (c0.dbid != myself.sm.param2) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
gg.SendScriptEvent(myself.c_ai1, 1000, 0);

}
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = 0;
if (SetHateGroup >= 0) {
if (myself.IsInCategory(SetHateGroup, attacker.occupation)) {
f0 = f0 + SetHateGroupRatio;

}

}
if (attacker.occupation == SetHateOccupation) {
f0 = f0 + SetHateOccupationRatio;

}
if (SetHateRace == attacker.race) {
f0 = f0 + SetHateRaceRatio;

}
f0 = 1.000000 * damage / myself.sm.level + 7 + f0 / 100 * 1.000000 * damage / myself.sm.level + 7;
myself.AddAttackDesire(attacker, 1, f0 * 100);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam npc0) {
if (timer_id == 3000) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam npc0, HandlerParam c0) {
c0 = speller;
if (c0.master) {
c0 = c0.master;

}
if (c0.is_pc == 1) {
if (c0.dbid != myself.sm.param2) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
gg.SendScriptEvent(myself.c_ai1, 1000, 0);

}
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}

}
	}


}