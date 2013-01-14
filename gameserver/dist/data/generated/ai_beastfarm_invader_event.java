package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_invader_event extends warrior_use_skill {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 3333;
	protected int Skill_Display = 408551425;
	protected int TIMER_despawn = 2115003;
	protected int TIMER_callme = 2115007;
	protected int TIMER_suicide = 2115009;
	protected int reward_adena_83lv = 9031;
	protected int reward_adena_84lv = 10068;
	protected int debug_mode = 0;

	protected void CREATED() {
super;
if (debug_mode) {
myself.Shout("광기 몬스터 스폰. " + gg.FloatToInt(myself.sm.x) + " " + gg.FloatToInt(myself.sm.y) + " " + gg.FloatToInt(myself.sm.z));

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.AddTimerEx(TIMER_callme, 1000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 21150001) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (c0 == myself.sm) {
myself.i_ai0 = myself.i_ai0 + 1;
myself.i_ai1 = myself.i_ai1 - 1;
if (script_event_arg3 == 83) {
myself.i_ai2 = myself.i_ai2 + 1;

} else if (script_event_arg3 == 84) {
myself.i_ai3 = myself.i_ai3 + 1;

}
if (debug_mode) {
myself.Say("맹수 킬! 현재 " + myself.i_ai0 + "킬");

}
if (debug_mode) {
myself.Say("83레벨 : " + myself.i_ai2 + " 84레벨 : " + myself.i_ai3);

}
switch (gg.Rand(11)) {
case 0: {
i0 = 421462017;
break;

}
case 1: {
i0 = 421527553;
break;

}
case 2: {
i0 = 421593089;
break;

}
case 3: {
i0 = 421658625;
break;

}
case 4: {
i0 = 437190657;
break;

}
case 5: {
i0 = 436862977;
break;

}
case 6: {
i0 = 436928513;
break;

}
case 7: {
i0 = 436994049;
break;

}
case 8: {
i0 = 437256193;
break;

}
case 9: {
i0 = 437059585;
break;

}
case 10: {
i0 = 437125121;
break;

}

}
myself.AddUseSkillDesire(myself.sm, i0, 1, 0, 1000000);

}

}
if (myself.i_ai0 == 10) {
myself.AddTimerEx(TIMER_despawn, 5 * 60 * 1000);

}

} else if (script_event_arg1 == 21150004) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (debug_mode) {
myself.Say("맹수 호출 받음");

}
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 <= 50) {
myself.AddAttackDesire(c0, 1, 1000);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_callme) {
if (debug_mode) {
myself.Say("주변 맹수 호출");

}
myself.BroadcastScriptEvent(21150003, 0, 1200);
myself.AddTimerEx(TIMER_callme, 60 * 1000);

} else if (timer_id == TIMER_despawn) {
if (debug_mode) {
myself.Say("10킬 달성 후 5분이 지나 디스폰함.");

}
myself.Despawn();

} else if (timer_id == TIMER_suicide) {
myself.Suicide();

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam i2) {
if (myself.sm.hp < myself.sm.max_hp * 0.050000 && myself.i_ai4 == 0 && attacker.is_pc == 1) {
if (debug_mode) {
myself.Say("Low HP");

}
myself.i_ai4 = 1;
myself.RemoveAllDesire();
myself.StopMove();
myself.AddTimerEx(TIMER_suicide, 2000);
if (myself.i_ai0 != 0) {
myself.AddUseSkillDesire(myself.sm, Skill_Display, 1, 0, 100000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.050000 && myself.i_ai4 == 0 && attacker.is_pc == 0) {
if (debug_mode) {
myself.Say("Low HP by npc");

}
myself.i_ai4 = 1;
myself.SetAbilityItemDrop(0);
myself.AddTimerEx(TIMER_suicide, 1500);

} else if (myself.i_ai4 != 1) {
if (myself.IsInCategory(122, attacker.npc_class_id) == 0) {
myself.AddAttackDesire(attacker, 1, damage);
if (myself.IsNullCreature(attacker) == 0) {
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

}

}

}
super;

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (skill_name_id == Skill_Display) {
if (myself.i_ai0 != 0) {
if (myself.i_ai2 != 0) {
for (i0 = 0; i0 < myself.i_ai2; i0 = i0 + 1) {
i1 = reward_adena_83lv - gg.FloatToInt(reward_adena_83lv * 0.050000) + gg.Rand(gg.FloatToInt(reward_adena_83lv * 0.100000));
myself.DropItem2(myself.sm, 57, i1, target.id);

}

}
if (myself.i_ai3 != 0) {
for (i0 = 0; i0 < myself.i_ai3; i0 = i0 + 1) {
i1 = reward_adena_84lv - gg.FloatToInt(reward_adena_84lv * 0.050000) + gg.Rand(gg.FloatToInt(reward_adena_84lv * 0.100000));
myself.DropItem2(myself.sm, 57, i1, target.id);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(121, creature.npc_class_id) == 1) {
if (debug_mode) {
myself.Say("SEE_CREATURE. beastfarm_beast 카테고리.");

}
myself.AddAttackDesire(creature, 1, 10000);

}
super;
	}


}