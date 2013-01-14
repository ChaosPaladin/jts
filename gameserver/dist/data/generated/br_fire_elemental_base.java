package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_fire_elemental_base extends default_npc {
	protected int PHASE_START_ID = 3401;
	protected int PHASE_ATTACK_FLAME = 3402;
	protected int PHASE_COUNTER_MODE = 3410;
	protected int PHASE_COUNTER_MODE_START = 3411;
	protected int PHASE_COUNTER_MODE_END = 3412;
	protected int PHASE_CRITICAL_MODE = 3413;
	protected int PHASE_CRITICAL_MODE_END = 3414;
	protected int SKILL_BURN = 1511915521;
	protected int life_time = 70;
	protected int max_hp = 10;
	protected int dalay_flame = 14;
	protected int dalay_flame_offset = 2;
	protected int rate_flame = 100;
	protected int rate_cold = 40;
	protected int time_counter = 3;
	protected int time_critical = 10;
	protected int delay_roar = 10;
	protected int delay_cold = 10;
	protected int delay_burn = 20;
	protected int rate_roar = 30;
	protected int rate_burn = 20;

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
myself.AddTimerEx(PHASE_START_ID, life_time * 1000);
myself.AddTimerEx(PHASE_ATTACK_FLAME, dalay_flame * 1000 + gg.Rand(dalay_flame_offset * 1000));
myself.i_ai0 = max_hp;
myself.i_ai1 = 0;
myself.i_ai3 = 0;
myself.AddUseSkillDesire(myself.sm, 1512046593, 1, 0, 100000);
myself.AddHateInfo(myself.master, 100, 0, 1, 1);
i0 = gg.Rand(5);
for (i1 = i0; i1 == i0; i1) {
i1 = gg.Rand(5);
if (SKILL_BURN == 1511981057 && i0 > 1 && i1 > 1) {
i1 = i0;

}

}
myself.AddTimerEx(PHASE_COUNTER_MODE, 5 + i0 * 10 + 2 * 1000);
myself.AddTimerEx(PHASE_CRITICAL_MODE, 5 + i1 * 10 * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam h0, HandlerParam c0) {
if (timer_id == PHASE_START_ID) {
myself.Despawn();

}
if (myself.sm.alive == 0) {
return;

}
if (timer_id == PHASE_ATTACK_FLAME) {
if (myself.i_ai1 == 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0 && gg.Rand(100) < rate_flame) {
myself.AddUseSkillDesire(c0, 1512243201, 0, 0, 100000);

}

}

}
myself.AddTimerEx(PHASE_ATTACK_FLAME, dalay_flame * 1000 + gg.Rand(dalay_flame_offset * 1000));

}
if (timer_id == PHASE_COUNTER_MODE) {
if (myself.i_ai1 != 0) {
myself.Say("Error: 모드 겹침! Cur Mode=" + gg.IntToStr(myself.i_ai1));

}
myself.Say(gg.MakeFString(1900034, "", "", "", "", ""));
myself.i_ai1 = 1;
myself.AddTimerEx(PHASE_COUNTER_MODE_START, 2 * 1000);

}
if (timer_id == PHASE_COUNTER_MODE_START) {
myself.i_ai1 = 2;
myself.i_ai2 = 0;
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.master, 1512112129, 0, 0, 2200000);
myself.AddEffectActionDesire(myself.sm, 3, 100, 2000000);
myself.AddTimerEx(PHASE_COUNTER_MODE_END, time_counter * 1000);

}
if (timer_id == PHASE_COUNTER_MODE_END) {
myself.AddEffectActionDesire(myself.sm, 2, 30, 1000000);
if (myself.i_ai1 == 2) {
myself.i_ai1 = 0;

}

}
if (timer_id == PHASE_CRITICAL_MODE) {
if (myself.i_ai1 != 0) {
myself.Say("Error: 모드 겹침! Cur Mode=" + gg.IntToStr(myself.i_ai1));

}
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.master, 1512112129, 0, 0, 2200000);
myself.AddEffectActionDesire(myself.sm, 1, 270, 2000000);
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0 && gg.Rand(100) < rate_flame) {
myself.AddUseSkillDesire(c0, 1512243201, 0, 0, 100000);

}

}
myself.Say(gg.MakeFString(1900035, "", "", "", "", ""));
myself.i_ai1 = 3;
myself.i_ai2 = 0;
myself.AddTimerEx(PHASE_CRITICAL_MODE_END, time_critical * 1000);

}
if (timer_id == PHASE_CRITICAL_MODE_END) {
if (myself.i_ai1 == 3) {
myself.i_ai1 = 0;

}
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.master, 1512112129, 0, 0, 2200000);
if (myself.i_ai2 < 3) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
c0 = h0.creature;
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, SKILL_BURN, 0, 0, 100000);

}

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.sm.alive == 0) {
return;

}
myself.AddHateInfo(attacker, 100, 0, 1, 1);
if (myself.IsWeaponEquippedInHand(attacker) != 0) {
if (myself.i_ai3 == 0) {
myself.i_ai3 = 1;
myself.Say(gg.MakeFString(1900040, "", "", "", "", ""));

}
return;

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(1512046593)) <= 0) {
return;

}
i0 = 0;
i0 = gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(1512112129));
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(1511915521)) > 0) {
i0 = 3;

}
if (i0 <= 1) {
myself.i_ai0 = myself.i_ai0 - 1;
if (gg.Rand(100) < rate_cold) {
myself.AddUseSkillDesire(attacker, 1512177665, 0, 0, 110000);

}

} else if (i0 == 2) {
myself.i_ai0 = myself.i_ai0 - 2;

}
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp * myself.i_ai0 / max_hp);
if (myself.i_ai0 <= 0) {
gg.SetNpcParam(myself.sm, 9, 1);
myself.Suicide();
return;

}
if (myself.i_ai1 == 2) {
if (i0 <= 1 || i0 == 2) {
myself.RemoveAllDesire();
myself.AddUseSkillDesire(attacker, 1511849985, 0, 0, 100000);

}

} else if (myself.i_ai1 == 3) {
if (i0 <= 1 || i0 == 2) {
myself.i_ai2 = myself.i_ai2 + 1;

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
myself.AddHateInfo(creature, 100, 0, 1, 1);
	}


}