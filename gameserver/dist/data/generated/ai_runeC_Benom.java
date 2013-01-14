package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_runeC_Benom extends raid_boss_alone {
	protected int PhysicalSpecial = 458752001;
	protected int DDMagic = 458752001;
	protected int SelfRangeCancel_a1 = 458752001;
	protected int SelfRangeCancel_a2 = 458752001;

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED() {
myself.AddDoNothingDesire(5, 5);
myself.Shout(gg.MakeFString(1010623, "", "", "", "", ""));
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_ai0 = 0;
myself.i_ai1 = gg.FloatToInt(myself.sm.x);
myself.i_ai2 = gg.FloatToInt(myself.sm.y);
myself.i_ai3 = gg.FloatToInt(myself.sm.z);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.i_ai1 = gg.FloatToInt(myself.sm.x);
myself.i_ai2 = gg.FloatToInt(myself.sm.y);
myself.i_ai3 = gg.FloatToInt(myself.sm.z);

}
if (timer_id == 1002) {
if (myself.InMyTerritory(myself.sm) == 0 && gg.Rand(2) < 1 && myself.p_state != 3) {
myself.RemoveAllAttackDesire();
myself.InstantTeleport(myself.sm, 11563, -49152, -537);
myself.AddMoveToDesire(11563, -49152, -537, 1000000);

}
if (gg.Rand(5) < 1) {
myself.RandomizeAttackDesire();

}
myself.AddTimerEx(1002, 60 * 2 * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 2000);

}
if (gg.Rand(Rand * 25) < 1 && myself.i_ai0 == 1) {
myself.AddUseSkillDesire(attacker, SelfRangeCancel_a1, 0, 1, 1000000);

}
if (myself.sm.hp < myself.sm.max_hp / 3 && gg.Rand(Rand * 25) < 1 && myself.i_ai0 == 1) {
myself.AddUseSkillDesire(attacker, SelfRangeCancel_a2, 0, 1, 1000000);

}
if (myself.DistFromMe(attacker) > 300 && gg.Rand(Rand * 10) < 1) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
if (gg.Rand(Rand * 10) < 1) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > 0 && myself.i_quest1 == 1) {
myself.AddAttackDesire(creature, 1, 200);

}
if (myself.i_ai0 == 1 && creature.is_pc == 1) {
if (myself.i_quest0 < 10 && gg.Rand(3) < 1) {
if (myself.i_quest0 == 0) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 1 && gg.GetCreatureFromID(myself.int_list.Get(0)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 2 && gg.GetCreatureFromID(myself.int_list.Get(1)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 3 && gg.GetCreatureFromID(myself.int_list.Get(2)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 4 && gg.GetCreatureFromID(myself.int_list.Get(3)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 5 && gg.GetCreatureFromID(myself.int_list.Get(4)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 6 && gg.GetCreatureFromID(myself.int_list.Get(5)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 7 && gg.GetCreatureFromID(myself.int_list.Get(6)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 8 && gg.GetCreatureFromID(myself.int_list.Get(7)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

} else if (myself.i_quest0 == 9 && gg.GetCreatureFromID(myself.int_list.Get(8)) != creature) {
myself.int_list.Add(creature.id);
myself.i_quest0 = myself.i_quest0 + 1;

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (skill_name_id == 276692993 && myself.i_ai0 == 1) {
myself.InstantTeleport(myself.sm, myself.i_ai1, myself.i_ai2, myself.i_ai3);
myself.RemoveAllAttackDesire();

} else if (skill_name_id == SelfRangeCancel_a1) {
i1 = gg.Rand(11) + 1;
if (i1 == 1) {
i2 = 12860;
i3 = -49158;
i4 = 976;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 14878;
i3 = -51339;
i4 = 1024;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 3) {
i2 = 15674;
i3 = -49970;
i4 = 864;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 4) {
i2 = 15696;
i3 = -48326;
i4 = 864;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 5) {
i2 = 14873;
i3 = -46956;
i4 = 1024;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 6) {
i2 = 12157;
i3 = -49135;
i4 = -1088;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 12875;
i3 = -46392;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 8) {
i2 = 14087;
i3 = -46706;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 9) {
i2 = 14086;
i3 = -51593;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 10) {
i2 = 12864;
i3 = -51898;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 11) {
i2 = 15538;
i3 = -49153;
i4 = -1056;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 12) {
i2 = 17001;
i3 = -49149;
i4 = -1064;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(target, i2, i3, i4);
myself.RemoveAttackDesire(target.id);

} else if (skill_name_id == SelfRangeCancel_a2) {
i1 = gg.Rand(11) + 1;
if (i1 == 1) {
i2 = 12860;
i3 = -49158;
i4 = 976;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 14878;
i3 = -51339;
i4 = 1024;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 3) {
i2 = 15674;
i3 = -49970;
i4 = 864;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 4) {
i2 = 15696;
i3 = -48326;
i4 = 864;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 5) {
i2 = 14873;
i3 = -46956;
i4 = 1024;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 6) {
i2 = 12157;
i3 = -49135;
i4 = -1088;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 12875;
i3 = -46392;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 8) {
i2 = 14087;
i3 = -46706;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 9) {
i2 = 14086;
i3 = -51593;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 10) {
i2 = 12864;
i3 = -51898;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 11) {
i2 = 15538;
i3 = -49153;
i4 = -1056;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 12) {
i2 = 17001;
i3 = -49149;
i4 = -1064;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(target, i2, i3, i4);
myself.RemoveAttackDesire(target.id);
for (i5 = 0; i5 < myself.int_list.GetSize(); i5 = i5 + 1) {
myself.c_quest0 = gg.GetCreatureFromID(myself.int_list.Get(i5));
if (myself.i_quest0 > 0 && myself.c_quest0 != target) {
if (myself.c_quest0.x - target.x * myself.c_quest0.x - target.x + myself.c_quest0.y - target.y * myself.c_quest0.y - target.y > 250 * 250) {
i0 = 1;

} else {
i0 = 0;

}
if (i0 == 0) {
i1 = gg.Rand(11) + 1;
if (i1 == 1) {
i2 = 12860;
i3 = -49158;
i4 = 976;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 2) {
i2 = 14878;
i3 = -51339;
i4 = 1024;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 3) {
i2 = 15674;
i3 = -49970;
i4 = 864;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 4) {
i2 = 15696;
i3 = -48326;
i4 = 864;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 5) {
i2 = 14873;
i3 = -46956;
i4 = 1024;
i2 = i2 + gg.Rand(100);
i3 = i3 + gg.Rand(100);

} else if (i1 == 6) {
i2 = 12157;
i3 = -49135;
i4 = -1088;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

} else if (i1 == 7) {
i2 = 12875;
i3 = -46392;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 8) {
i2 = 14087;
i3 = -46706;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 9) {
i2 = 14086;
i3 = -51593;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 10) {
i2 = 12864;
i3 = -51898;
i4 = -288;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 11) {
i2 = 15538;
i3 = -49153;
i4 = -1056;
i2 = i2 + gg.Rand(200);
i3 = i3 + gg.Rand(200);

} else if (i1 == 12) {
i2 = 17001;
i3 = -49149;
i4 = -1064;
i2 = i2 + gg.Rand(650);
i3 = i3 + gg.Rand(650);

}
myself.InstantTeleport(myself.c_quest0, i2, i3, i4);
myself.RemoveAttackDesire(myself.c_quest0.id);

}

}

}
myself.i_quest0 = 0;
myself.int_list.Clear();
myself.LookNeighbor(600);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 10100) {
myself.InstantTeleport(myself.sm, 11563, -49152, -537);
myself.i_ai0 = script_event_arg2;
myself.i_quest1 = 1;
myself.AddTimerEx(1002, 60 * 2 * 1000);
myself.AddTimerEx(1001, 5000);

}
	}

	protected void MY_DYING() {
myself.int_list.Clear();
myself.Shout(gg.MakeFString(1010626, "", "", "", "", ""));
if (myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(1029055, "ai_teleport_cube_benom", 0, 0, 12589, -49044, -3008, 0, 0, 0, 0);

}
	}


}