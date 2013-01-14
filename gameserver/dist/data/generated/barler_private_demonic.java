package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_private_demonic extends warrior_use_skill {
	protected int PhysicalSpecial1 = 458752001;
	protected int DropItem = 10015;

	protected void CREATED(HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
myself.i_ai0 = myself.sm.param3;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 1;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai1 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(myself.c_ai1) == 0) {
party0 = gg.GetParty(myself.c_ai1);
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsInCategory(1, c0.occupation) && myself.i_ai0 == 1) {
myself.c_ai0 = c0;
if (myself.c_ai3 != myself.c_ai0) {
myself.AddAttackDesire(c0, 1, 1000000);

} else {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}
return;

} else if (myself.IsInCategory(70, c0.occupation) && myself.i_ai0 == 2) {
myself.c_ai0 = c0;
if (myself.c_ai3 != myself.c_ai0) {
myself.AddAttackDesire(c0, 1, 1000000);

} else {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}
return;

} else if (myself.IsInCategory(3, c0.occupation) && myself.i_ai0 == 3) {
myself.c_ai0 = c0;
if (myself.c_ai3 != myself.c_ai0) {
myself.AddAttackDesire(c0, 1, 1000000);

} else {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}
return;

} else if (myself.IsInCategory(2, c0.occupation) && myself.i_ai0 == 4) {
myself.c_ai0 = c0;
if (myself.c_ai3 != myself.c_ai0) {
myself.AddAttackDesire(c0, 1, 1000000);

} else {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}
return;

} else {
myself.c_ai0 = myself.c_ai1;
if (myself.c_ai3 != myself.c_ai0) {
myself.AddAttackDesire(myself.c_ai1, 1, 1000000);

} else {
myself.AddMoveToDesire(gg.FloatToInt(myself.boss.x), gg.FloatToInt(myself.boss.y), gg.FloatToInt(myself.boss.z), 1000000);

}
return;

}

}

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
myself.c_ai2 = attacker;
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
if (script_event_arg1 == 13013) {
myself.Despawn();

} else if (script_event_arg1 == 13024) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm == c0) {
myself.i_ai1 = script_event_arg2;

}

}

} else if (script_event_arg1 == 13027) {
c0 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
if (myself.sm == c0) {
myself.i_ai2 = 1;

}

}

} else if (script_event_arg1 == 13026) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAttackDesire(c0.id);
myself.c_ai3 = c0;

}

} else if (script_event_arg1 == 13028) {
myself.i_ai4 = 0;

} else if (script_event_arg1 == 13029) {
myself.i_ai4 = 1;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (speller.is_pc == 1) {
if (myself.IsInCategory(3, speller.occupation) && gg.Rand(100) < 10) {
if (gg.Rand(100) < 50) {
myself.AddUseSkillDesire(speller, Skill01_ID, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(speller, Skill02_ID, 0, 1, 1000000);

}

}

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.DistFromMe(myself.boss) <= 1900) {
if (myself.i_ai2 == 0 && myself.i_ai1 == 0 && myself.i_ai4 == 1) {
if (gg.Rand(100) < 5) {
myself.DropItem1(myself.sm, DropItem, 1);

}

}
if (myself.i_ai2 != 0) {

}
if (myself.i_ai1 != 0) {

}

}

}
	}

	protected void MY_DYING(HandlerParam party0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
myself.BroadcastScriptEvent(13023, gg.GetIndexFromCreature(myself.sm), 3000);
myself.AddTimerEx(1001, 1000);
	}


}