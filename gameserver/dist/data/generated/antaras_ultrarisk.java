package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class antaras_ultrarisk extends raid_boss_alone {
	protected int TeleportEffect = 306118657;
	protected int PhysicalSpecial = 333905921;
	protected int LongRangePhysicalSpecial = 333971457;
	protected int Dispel_Debuff = 1;

	protected void CREATED(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam c0, HandlerParam c1, HandlerParam c2) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = myself.GetTick();
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
i3 = myself.GetGlobalMap(10);
c2 = gg.GetCreatureFromIndex(i3);
myself.c_ai1 = c2;
i0 = gg.Rand(60);
if (i0 == 0) {
i0 = 1;

}
if (gg.Rand(1) == 0) {
i0 = i0 * -1;

}
myself.AddTimerEx(5001, 30 + gg.Rand(30) * 1000);
myself.AddTimerEx(5002, 5 * 60 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 5001) {
if (myself.IsMyBossAlive() == 0 || myself.boss.db_value == 0 || myself.boss.db_value == 1 || myself.DistFromMe(myself.boss) > 8000) {
myself.Despawn();
return;

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
myself.AddTimerEx(5001, 30 + gg.Rand(30) * 1000);

} else if (timer_id == 5002) {
if (myself.GetTick() - myself.i_ai3 > 15 * 60 * 1000) {
myself.Despawn();

}
myself.AddTimerEx(5002, 5 * 60 * 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 12021) {
if (myself.p_state != 3 && myself.IsMyBossAlive() && myself.DistFromMe(myself.boss) > 1000) {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}

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

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(269418497)) == -1) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
return;

}
myself.i_ai3 = myself.GetTick();
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(269418497)) != -1) {
myself.RemoveAttackDesire(attacker.id);
return;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (attacker == myself.top_desire_target && gg.Rand(Rand * 6) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

} else if (attacker != myself.top_desire_target && myself.DistFromMe(attacker) > 300 && gg.Rand(Rand * 6) < 1) {
myself.AddUseSkillDesire(attacker, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 0) {
return;

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(269418497)) != -1) {
myself.RemoveAttackDesire(attacker.id);
return;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (attacker == myself.top_desire_target && gg.Rand(Rand * 6) < 1) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

} else if (attacker != myself.top_desire_target && myself.DistFromMe(attacker) > 300 && gg.Rand(Rand * 6) < 1) {
myself.AddUseSkillDesire(attacker, LongRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (speller.is_pc == 0 && myself.IsInCategory(12, speller.npc_class_id) == 0) {
return;

}
myself.i_ai3 = myself.GetTick();
if (gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(269418497)) == -1) {
if (speller == myself.top_desire_target && gg.Rand(Rand * 6) < 1) {
myself.AddUseSkillDesire(speller, PhysicalSpecial, 0, 1, 1000000);

}
if (speller != myself.top_desire_target && myself.DistFromMe(speller) > 300 && gg.Rand(Rand * 6) < 1) {
myself.AddUseSkillDesire(speller, LongRangePhysicalSpecial, 0, 1, 1000000);

}
if (gg.Rand(100) < 20 && speller.is_pc != 0 && myself.IsInCategory(3, speller.occupation) != 0) {
if (speller.is_pc != 0 || myself.IsInCategory(12, speller.npc_class_id)) {
myself.AddAttackDesire(speller, 1, 1 * 1000000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (skill_name_id == TeleportEffect) {

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (private == myself.boss) {
myself.Despawn();

}

}
	}


}