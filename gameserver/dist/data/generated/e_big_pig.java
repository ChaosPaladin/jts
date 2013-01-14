package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_big_pig extends default_npc {
	protected int event_coin = 9142;
	protected int event_animal = 12;
	protected int b_oneshot_kill = 1;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_quest3 = 0;
myself.i_quest4 = 0;
myself.c_quest4 = gg.GetNullCreature();
myself.c_quest0 = gg.GetNullCreature();
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam skill_name_id) {
if (skill_name_id == 213647361 || skill_name_id == 213778433) {
damage = damage + 100;
if (skill_name_id == 213778433) {
damage = damage + 100;

} else if (myself.i_quest4 - myself.sm.hp > 250) {
damage = damage + 200;

}
if (myself.IsNullCreature(myself.c_ai0) != 0) {
myself.c_ai0 = attacker;

} else if (attacker != myself.c_ai0 && myself.IsNullCreature(myself.c_ai1) == 1) {
myself.c_ai1 = attacker;

} else if (attacker != myself.c_ai0 && attacker != myself.c_ai1 && myself.IsNullCreature(myself.c_ai2) == 1) {
myself.c_ai2 = attacker;

} else if (attacker != myself.c_ai0 && attacker != myself.c_ai1 && attacker != myself.c_ai2 && myself.IsNullCreature(myself.c_ai3) == 1) {
myself.c_ai3 = attacker;

}
if (myself.IsNullCreature(myself.c_ai0) == 0 && attacker == myself.c_ai0) {
myself.i_quest0 = damage + myself.i_quest0;

} else if (myself.IsNullCreature(myself.c_ai1) == 0 && attacker == myself.c_ai1) {
myself.i_quest1 = damage + myself.i_quest1;

} else if (myself.IsNullCreature(myself.c_ai2) == 0 && attacker == myself.c_ai2) {
myself.i_quest2 = damage + myself.i_quest2;

} else if (myself.IsNullCreature(myself.c_ai3) == 0 && attacker == myself.c_ai3) {
myself.i_quest3 = damage + myself.i_quest3;

}

}
if (skill_name_id == 213778433) {
if (myself.i_ai4 == 1 && myself.c_quest4 == attacker) {
myself.i_ai4 = 4;
gg.SetNpcParam(myself.sm, 9, 1);
myself.c_quest4 = gg.GetNullCreature();
myself.Suicide();

} else if (gg.Rand(2000) < 2) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800020, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(341049345) < myself.sm.mp && myself.Skill_GetConsumeHP(341049345) < myself.sm.hp && myself.Skill_InReuseDelay(341049345) == 0) {
myself.AddUseSkillDesire(myself.sm, 341049345, 1, 1, 1000000);

}
myself.AddTimerEx(2002, 1000);
myself.AddTimerEx(2003, 2000);

}

}
if (b_oneshot_kill == 1) {
if (skill_name_id == 213647361 && myself.sm.hp <= myself.sm.max_hp * 0.900000 && myself.sm.hp >= myself.sm.max_hp * 0.300000) {
if (myself.i_ai4 == 0) {
if (gg.Rand(10) < 3) {
if (myself.Skill_GetConsumeMP(368246785) < myself.sm.mp && myself.Skill_GetConsumeHP(368246785) < myself.sm.hp && myself.Skill_InReuseDelay(368246785) == 0) {
myself.AddUseSkillDesire(myself.sm, 368246785, 1, 1, 1000000);

}
myself.i_ai4 = 1;
myself.c_quest4 = attacker;
if (gg.Rand(2) < 1) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 2, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800147, "", "", "", "", ""));

}

} else if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 2, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800148, "", "", "", "", ""));

}
myself.AddTimerEx(4444, 5000);

} else {
myself.c_quest4 = gg.GetNullCreature();

}

}

}

}
myself.AddFleeDesire(attacker, 15);
myself.i_quest4 = gg.FloatToInt(myself.sm.hp);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 2002) {
i0 = gg.Rand(100);
if (i0 <= 70) {
if (event_animal == 1) {
myself.CreateOnePrivateEx(1013124, "e_gold_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(1013035, "e_gold_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (event_animal == 1) {
myself.CreateOnePrivateEx(1013123, "e_super_big_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(1013034, "e_super_big_pig", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

} else if (timer_id == 4444) {
if (myself.i_ai4 != 4 && myself.IsNullCreature(myself.c_quest4) == 0) {
myself.i_ai4 = 2;
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800019, "", "", "", "", ""));

}
if (myself.Skill_GetConsumeMP(267059212) < myself.sm.mp && myself.Skill_GetConsumeHP(267059212) < myself.sm.hp && myself.Skill_InReuseDelay(267059212) == 0) {
myself.AddUseSkillDesire(myself.c_quest4, 267059212, 0, 1, 1000000);

}

}

} else if (timer_id == 2003) {
myself.Despawn();

} else if (timer_id == 3001) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3002, 200);

} else if (timer_id == 3002) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3003, 200);

} else if (timer_id == 3003) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3004, 200);

} else if (timer_id == 3004) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3005, 200);

} else if (timer_id == 3005) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3006, 150);

} else if (timer_id == 3006) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3007, 100);

} else if (timer_id == 3007) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3008, 200);

} else if (timer_id == 3008) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}
myself.AddTimerEx(3009, 200);

} else if (timer_id == 3009) {
if (myself.IsNullCreature(myself.c_ai4) == 0) {
myself.DropItem2(myself.sm, event_coin, 1, myself.c_ai4.id);

} else {
myself.DropItem2(myself.sm, event_coin, 1, 0);

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (gg.Rand(1000) < 1) {
myself.Shout(gg.MakeFString(1800022, "", "", "", "", ""));
i0 = 0;
i1 = 0;
if (myself.i_quest0 >= myself.i_quest1) {
i0 = myself.i_quest0;

} else {
i0 = myself.i_quest1;

}
if (myself.i_quest2 >= myself.i_quest3) {
i1 = myself.i_quest2;

} else {
i1 = myself.i_quest2;

}
if (i0 >= i1) {
if (i0 == myself.i_quest0) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
c0 = myself.c_ai0;

}

} else if (myself.IsNullCreature(myself.c_ai1) == 0) {
c0 = myself.c_ai1;

}

} else if (i1 == myself.i_quest2) {
if (myself.IsNullCreature(myself.c_ai2) == 0) {
c0 = myself.c_ai2;

}

} else if (myself.IsNullCreature(myself.c_ai3) == 0) {
c0 = myself.c_ai3;

}
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai4 = c0;
myself.DropItem2(myself.sm, event_coin, 1, c0.id);

}
myself.CreateOnePrivateEx(1032110, "e_pig_clear_npc", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z + 30), 0, 0, 0, 0);
myself.AddTimerEx(3001, 200);

} else if (gg.Rand(100) < 50) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800018, "", "", "", "", ""));

}

} else if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800021, "", "", "", "", ""));

}
	}


}