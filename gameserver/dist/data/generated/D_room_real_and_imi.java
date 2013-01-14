package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class D_room_real_and_imi extends default_npc {
	protected int selfbuff = 458752001;
	protected String maker_name = "innadril19_2423_007m1";
	protected String d_doorname = "island_of_oracle_f";

	protected void CREATED(HandlerParam maker0, HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.c_ai0 = gg.GetNullCreature();
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 12509, 0, 0);

}
	}

	protected void NO_DESIRE() {
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 12508) {
myself.i_ai0 = script_event_arg2;
myself.i_ai4 = 1;
myself.BroadcastScriptEvent(12574, 0, 2000);

} else if (script_event_arg1 == 12574) {
myself.i_quest0 = myself.i_quest0 + 1;
if (myself.i_quest0 == 7) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 2 || myself.i_ai0 == 3) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.Say(gg.MakeFString(1800043, "", "", "", "", ""));

} else if (i0 < 40) {
myself.Say(gg.MakeFString(1800044, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(1800045, "", "", "", "", ""));

} else if (i0 < 80) {
myself.Say(gg.MakeFString(1800046, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800047, "", "", "", "", ""));

}

} else if (gg.Rand(100) < 70) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.Say(gg.MakeFString(1800043, "", "", "", "", ""));

} else if (i0 < 40) {
myself.Say(gg.MakeFString(1800044, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(1800045, "", "", "", "", ""));

} else if (i0 < 80) {
myself.Say(gg.MakeFString(1800046, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800047, "", "", "", "", ""));

}

} else if (gg.Rand(100) <= 10) {
myself.Say(gg.MakeFString(1800048, "", "", "", "", ""));

}

}

} else if (script_event_arg1 == 12536) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (c0 != myself.sm) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 2 || myself.i_ai0 == 3) {
i0 = gg.Rand(100);
if (i0 < 33) {
myself.Say(gg.MakeFString(1800051, "", "", "", "", ""));

} else if (i0 < 66) {
myself.Say(gg.MakeFString(1800052, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800053, "", "", "", "", ""));

}

}
myself.AddTimerEx(3004, 3000);

}

} else if (script_event_arg1 == 12537) {
myself.i_ai1 = myself.i_ai1 + 1;
if (myself.i_ai1 >= 3) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 2 || myself.i_ai0 == 3) {
myself.CreateOnePrivateEx(1032291, "ai_room_truefalse", 0, 0, 148912, 181908, -6112, 0, 0, 0, 0);

}

}

} else if (script_event_arg1 == 12538) {
myself.Despawn();

} else if (script_event_arg1 == 12558) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (c0 != myself.sm && myself.p_state != 3) {
myself.AddTimerEx(3002, 2000);

}

} else if (script_event_arg1 == 12571) {
myself.i_ai3 = 1;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0, HandlerParam i0, HandlerParam skill_name_id, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (myself.i_ai4 == 1) {
myself.i_ai4 = 2;
if (skill_name_id != 0) {
if (myself.Skill_GetEffectPoint(skill_name_id) < 0) {
myself.AddAttackDesire(attacker, 1, 10000000);
myself.BroadcastScriptEvent(12558, gg.GetIndexFromCreature(myself.sm), 2000);

} else {
if (myself.i_ai2 == 0) {
myself.BroadcastScriptEvent(12535, 0, 2000);
gg.Castle_GateOpenCloseEx(d_doorname, 1, myself.InstantZone_GetId());
myself.i_ai2 = 1;

}
if (myself.i_ai0 == 1 || myself.i_ai0 == 2 || myself.i_ai0 == 3) {
if (myself.i_ai3 == 0) {
i0 = gg.Rand(100);
if (i0 < 25) {
myself.Say(gg.MakeFString(1800054, "", "", "", "", ""));

} else if (i0 < 50) {
myself.Say(gg.MakeFString(1800055, "", "", "", "", ""));

} else if (i0 < 75) {
myself.Say(gg.MakeFString(1800056, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800057, "", "", "", "", ""));

}
myself.i_ai3 = 1;
myself.BroadcastScriptEvent(12537, 0, 2000);
if (myself.Skill_GetConsumeMP(selfbuff) < myself.sm.mp && myself.Skill_GetConsumeHP(selfbuff) < myself.sm.hp && myself.Skill_InReuseDelay(selfbuff) == 0) {
myself.AddUseSkillDesire(myself.sm, selfbuff, 1, 0, 1000000);

}
myself.AddTimerEx(3001, 2000);

}

} else {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1800049, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800050, "", "", "", "", ""));

}
myself.BroadcastScriptEvent(12571, 0, 2000);
myself.c_ai0 = attacker;
myself.AddTimerEx(3003, 3000);

}

}

} else {
if (myself.i_ai2 == 0) {
myself.BroadcastScriptEvent(12535, 0, 2000);
gg.Castle_GateOpenCloseEx(d_doorname, 1, myself.InstantZone_GetId());
myself.i_ai2 = 1;

}
if (myself.i_ai0 == 1 || myself.i_ai0 == 2 || myself.i_ai0 == 3) {
if (myself.i_ai3 == 0) {
i0 = gg.Rand(100);
if (i0 < 25) {
myself.Say(gg.MakeFString(1800054, "", "", "", "", ""));

} else if (i0 < 50) {
myself.Say(gg.MakeFString(1800055, "", "", "", "", ""));

} else if (i0 < 75) {
myself.Say(gg.MakeFString(1800056, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800057, "", "", "", "", ""));

}
myself.i_ai3 = 1;
myself.BroadcastScriptEvent(12537, 0, 2000);
myself.AddTimerEx(3001, 2000);

}

} else {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1800049, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800050, "", "", "", "", ""));

}
myself.BroadcastScriptEvent(12571, 0, 2000);
myself.c_ai0 = attacker;
myself.AddTimerEx(3003, 3000);

}

}

}
if (myself.i_ai0 > 3) {
myself.AddAttackDesire(attacker, 1, 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 3001) {
myself.Despawn();

} else if (timer_id == 3002) {
if (myself.p_state != 3) {
myself.Despawn();

}

} else if (timer_id == 3003) {
myself.BroadcastScriptEvent(12536, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddAttackDesire(myself.c_ai0, 1, 100000);

} else if (timer_id == 3004) {
myself.Despawn();

} else if (timer_id == 3005) {
if (myself.i_ai0 == 1 || myself.i_ai0 == 2 || myself.i_ai0 == 3) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.Say(gg.MakeFString(1800043, "", "", "", "", ""));

} else if (i0 < 40) {
myself.Say(gg.MakeFString(1800044, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(1800045, "", "", "", "", ""));

} else if (i0 < 80) {
myself.Say(gg.MakeFString(1800046, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800047, "", "", "", "", ""));

}

} else if (gg.Rand(100) < 50) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.Say(gg.MakeFString(1800043, "", "", "", "", ""));

} else if (i0 < 40) {
myself.Say(gg.MakeFString(1800044, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(1800045, "", "", "", "", ""));

} else if (i0 < 80) {
myself.Say(gg.MakeFString(1800046, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800047, "", "", "", "", ""));

}

} else if (gg.Rand(100) <= 10) {
myself.Say(gg.MakeFString(1800048, "", "", "", "", ""));

}

}
	}

	protected void MY_DYING() {
myself.InstantZone_MarkRestriction();
	}


}