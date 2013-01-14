package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class antaras_tarasque extends warrior_basic {
	protected int TeleportEffect = 306118657;
	protected double ATTACKED_Weight_Point = 0.000000;
	protected double CLAN_ATTACKED_Weight_Point = 0.000000;
	protected double PARTY_ATTACKED_Weight_Point = 0.000000;
	protected double SEE_SPELL_Weight_Point = 10.000000;
	protected double HATE_SKILL_Weight_Point = 10.000000;
	protected int Skill01_ID = 333905921;
	protected int Skill01_Probablity = 3333;
	protected int Skill01_Target = 0;
	protected int Skill01_Type = 0;
	protected int Skill01_AttackSplash = 0;
	protected double Skill01_Desire = 1000000000.000000;
	protected int Skill01_Dist_Min = 0;
	protected int Skill01_Dist_Max = 199;
	protected int Skill02_ID = 333971457;
	protected int Skill02_Probablity = 3333;
	protected int Skill02_Target = 0;
	protected int Skill02_Type = 0;
	protected int Skill02_AttackSplash = 0;
	protected double Skill02_Desire = 1000000000.000000;
	protected int Skill02_Dist_Min = 200;
	protected int Skill02_Dist_Max = 2000;
	protected int TID_BOSS_CHECK = 78001;
	protected int TIME_BOSS_CHECK = 1;
	protected int Dispel_Debuff = 1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = myself.GetTick();
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(TID_BOSS_CHECK, TIME_BOSS_CHECK * 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_BOSS_CHECK) {
if (myself.IsMyBossAlive() == 0 || myself.boss.db_value == 0 || myself.boss.db_value == 1 || myself.DistFromMe(myself.boss) > 8000) {
myself.Despawn();

} else if (myself.IsMyBossAlive() && myself.boss.db_value == 2 || myself.boss.db_value == 3 && myself.i_ai2 == 0) {
myself.BroadcastScriptEventEx(12004, 0, 0, 8000);
myself.i_ai2 = 1;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(269418497)) != -1) {
myself.RemoveAllAttackDesire();
myself.LookNeighbor(500);

}

}
if (myself.GetTick() - myself.i_ai3 > 15 * 60 * 1000) {
myself.Despawn();

} else {
myself.AddTimerEx(TID_BOSS_CHECK, TIME_BOSS_CHECK * 60 * 1000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
return;

}
myself.i_ai3 = myself.GetTick();
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(269418497)) != -1) {
myself.RemoveAttackDesire(attacker.id);

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(269418497)) == -1) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller) {
if (speller.is_pc == 0 && myself.IsInCategory(12, speller.npc_class_id) == 0) {
return;

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 12021 && myself.p_state != 3 && myself.IsMyBossAlive() && myself.DistFromMe(myself.boss) > 1000) {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

} else if (script_event_arg1 == 12015) {
myself.Despawn();

} else if (script_event_arg1 == 12005) {
myself.i_ai1 = myself.i_ai1 + 1;
i0 = 0;
if (myself.i_ai0 == 0) {
myself.i_ai0 = script_event_arg2;
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg3);

} else {
i0 = script_event_arg2;

}
if (i0 >= myself.i_ai0) {
myself.i_ai0 = script_event_arg2;
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg3);

}
if (myself.IsNullCreature(myself.c_ai0) == 0 && myself.i_ai1 == 19 && myself.i_ai2 == 1) {
if (myself.DistFromMe(myself.c_ai0) <= 8000) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z));
myself.i_ai2 = 0;
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

} else {
myself.LookNeighbor(1500);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.c_ai0 = gg.GetNullCreature();

}

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm && private == myself.boss) {
myself.Despawn();

}
super;
	}


}