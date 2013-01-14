package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_fast_type_wizard extends ssq_event_basic_wizard {
	protected int W_ShortRangeDDMagic = 272629761;
	protected int W_LongRangeDDMagic = 272039937;
	protected int private_name = 33;
	protected String private_ai = "warrior";

	protected void CREATED() {
myself.i_ai3 = 0;
myself.i_ai4 = 0;
if (myself.sm.param3 & 268435456) {
myself.i_ai3 = 1;
myself.sm.param3 = myself.sm.param3 - 268435456;

}
myself.AddTimerEx(2002, 5000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2002) {
myself.LookNeighbor(600);
myself.AddTimerEx(2002, 5000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam f0) {
if (myself.i_ai4 == 1) {
return;

}
super;
if (myself.InMyTerritory(attacker) == 0) {
return;

}
h0 = myself.GetMaxHateInfo(0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai0 == 0) {
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (h0.creature == attacker) {
i0 = 1;

}

}
if (myself.DistFromMe(attacker) > 100 && gg.Rand(100) < 80) {
if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

} else if (i0 == 1) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (gg.Rand(100) < 2) {
if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam h0) {
if (myself.i_ai4 == 1) {
return;

}
if (myself.InMyTerritory(attacker) == 0) {
return;

}
myself.RemoveAllHateInfoIF(1, 0);
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.GetHateInfoCount() == 0) {
if (myself.DistFromMe(attacker) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0) {
if (myself.i_ai4 == 1) {
return;

}
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1) {
if (myself.i_ai0 != 1) {
if (myself.DistFromMe(h0.creature) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(h0.creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0, HandlerParam c1) {
c1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c1) == 0) {
if (myself.InMyTerritory(c1)) {
if (script_event_arg1 == 10007) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.AddMoveToDesire(myself.sm.param1, script_event_arg2, gg.FloatToInt(myself.sm.z), 50);

}

}
if (script_event_arg1 == 10014) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
i0 = i0 = gg.FloatToInt(1.000000 * myself.GetCurrentTick() - myself.i_ai0 / 60 * 17 * 2 * 100);
if (i0 > gg.Rand(100) && myself.IsNullCreature(c0) == 0) {
myself.RemoveAllHateInfoIF(0, 0);
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddHateInfo(c0, 5 * 100, 0, 1, 1);

}

}

}
if (script_event_arg1 == 10015) {
myself.RemoveAllAttackDesire();
myself.i_ai4 = 1;

}

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6, HandlerParam i0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.InMyTerritory(creature) == 0) {
return;

}
if (myself.i_ai0 == 1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}

}
if (myself.InMyTerritory(myself.sm) && myself.GetHateInfoCount() == 0) {
if (myself.DistFromMe(creature) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(creature, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(creature, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 1000);

}
myself.AddHateInfo(creature, 300, 0, 1, 1);

}
super;
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
if (myself.i_ai3 == 0) {
myself.BroadcastScriptEvent(10009, myself.sm.param3, 1500);

} else {
myself.BroadcastScriptEvent(10010, myself.sm.param3, 1500);

}
if (myself.i_ai1 == 1) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 0) {
c0 = c0.master;

}
if (myself.IsNullCreature(c0) == 0) {
c0 = gg.Party_GetLeader(c0);

}
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(c1) == 0) {
if (c0 == c1) {
if (gg.HaveMemo(c0, 505)) {
i1 = 1 + gg.FloatToInt(FloatToInt * 25 / 100);
if (myself.IsInCategory(2, c0.occupation)) {
if (myself.DistFromMe(c0) < 40) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}

} else if (myself.DistFromMe(c0) < 80) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}
if (myself.IsInCategory(2, c0.occupation)) {
if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 7 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 15 / 100);

}

} else if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 15 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 7 / 100);

}
myself.ShowSysMsgToParty2(party0, 2, 1381, 3, 5901, 1, i1);
myself.GiveItem1(c0, 5901, i1);

}

}

}

}

} else {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 0) {
c0 = c0.master;

}
if (myself.IsNullCreature(c0) == 0) {
c0 = gg.Party_GetLeader(c0);

}
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(c1) == 0) {
if (c0 == c1) {
if (gg.HaveMemo(c0, 505)) {
i1 = 7 + gg.FloatToInt(FloatToInt * 25 / 100);
if (myself.IsInCategory(2, c0.occupation)) {
if (myself.DistFromMe(c0) < 40) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}

} else if (myself.DistFromMe(c0) < 80) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}
if (myself.IsInCategory(2, c0.occupation)) {
if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 7 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 15 / 100);

}

} else if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 15 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 7 / 100);

}
myself.ShowSysMsgToParty2(party0, 2, 1381, 3, 5901, 1, i1);
myself.GiveItem1(c0, 5901, i1);

}

}

}

}

}
	}


}