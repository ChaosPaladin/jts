package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_basic_reed extends warrior_basic {
	protected int Skill01_Probablity = 3333;
	protected int Skill01_Check_Dist = 1;
	protected int Skill02_Probablity = -1;
	protected int Skill02_Check_Dist = 1;
	protected int loot01 = 8603;
	protected int loot02 = 8604;
	protected int loot03 = 8605;
	protected int loot04 = 8613;
	protected int loot01_roll = 20;
	protected int loot02_roll = 10;
	protected int loot03_roll = 5;
	protected int loot04_roll = 2;
	protected int Skill_swamp = 402456577;
	protected int Skill_onekill = 190054401;
	protected int Skill_selfslow01 = 402391041;
	protected int Skill_selfslow02 = 402391042;
	protected int Skill_selfslow03 = 402391043;
	protected double DefaultHate = 100.000000;
	protected double Maximum_Hate = 999999984306749440.000000;
	protected int TID_SWAMP_CHECK = 78001;
	protected int TIME_SWAMP_CHECK = 90;
	protected int TID_SIGNAL_ROUTINE = 78002;
	protected int TIME_SIGNAL_ROUTINE = 30;
	protected int babble_mode = 0;

	protected void CREATED() {
if (myself.sm.npc_class_id == 1022654) {
if (babble_mode == 1) {
myself.Shout("타락한 머크로키언 스폰");

}
myself.AddUseSkillDesire(myself.sm, Skill_swamp, 1, 1, Maximum_Hate);

} else if (myself.sm.npc_class_id == 1022655) {
if (babble_mode == 1) {
myself.Shout("변화한 머크로키언 스폰");

}
myself.AddUseSkillDesire(myself.sm, Skill_selfslow01, 1, 1, Maximum_Hate);

}
myself.i_ai1 = 0;
myself.AddTimerEx(TID_SIGNAL_ROUTINE, TIME_SIGNAL_ROUTINE * 1000);
super;
	}

	protected void SEE_CREATURE() {
if (myself.GetLifeTime() >= Aggressive_Time && myself.sm.npc_class_id == 1022654) {
myself.Say(gg.MakeFString(1800858, "", "", "", "", ""));

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1) {
if (myself.IsNullCreature(attacker) == 0 && myself.sm.alive) {
if (attacker.is_pc || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.sm.npc_class_id == 1022650 || myself.sm.npc_class_id == 1022651 || myself.sm.npc_class_id == 1022652 || myself.sm.npc_class_id == 1022653 || myself.sm.npc_class_id == 1022654) {
myself.BroadcastScriptEvent(78010082, attacker.id, 500);

}
if (myself.sm.level - attacker.level <= 5 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Skill_onekill)) > 0) {
if (babble_mode == 1) {
myself.Say("이상 스킬에 맞고 자살");

}
if (attacker.is_pc) {
myself.c_ai0 = attacker;

} else if (myself.IsInCategory(12, attacker.npc_class_id)) {
myself.c_ai0 = attacker.master;

}
myself.Suicide();

} else if (myself.i_ai1 == 0 && myself.sm.npc_class_id != 1022654 && myself.sm.npc_class_id != 1022655) {
if (attacker.is_pc && gg.Skill_IsMagic(skill_name_id)) {
if (attacker.is_pc) {
i0 = myself.sm.level - attacker.level * 5;

} else {
i0 = attacker.master.level - myself.sm.level * 5;

}
if (myself.sm.max_hp * 0.900000 <= myself.sm.hp) {
i0 = i0 + 15;

} else if (myself.sm.max_hp * 0.800000 <= myself.sm.hp) {
i0 = i0 + 10;

} else if (myself.sm.max_hp * 0.700000 <= myself.sm.hp) {
i0 = i0 + 5;

} else if (myself.sm.max_hp * 0.600000 <= myself.sm.hp) {
i0 = i0 - 5;

} else if (myself.sm.max_hp * 0.500000 <= myself.sm.hp) {
i0 = i0 - 10;

} else {
i0 = i0 - 15;

}
if (myself.DistFromMe(attacker) > 600) {
i0 = i0 - 15;

} else if (myself.DistFromMe(attacker) > 500) {
i0 = i0 - 10;

} else if (myself.DistFromMe(attacker) > 400) {
i0 = i0 - 5;

} else if (myself.DistFromMe(attacker) > 300) {
i0 = i0 + 5;

} else if (myself.DistFromMe(attacker) > 200) {
i0 = i0 + 10;

} else {
i0 = i0 + 15;

}
if (myself.Skill_GetConsumeMP(skill_name_id) > 125) {
i0 = i0 + 15;

} else if (myself.Skill_GetConsumeMP(skill_name_id) > 100) {
i0 = i0 + 10;

} else if (myself.Skill_GetConsumeMP(skill_name_id) > 75) {
i0 = i0 + 5;

} else if (myself.Skill_GetConsumeMP(skill_name_id) > 50) {
i0 = i0 - 5;

} else if (myself.Skill_GetConsumeMP(skill_name_id) > 25) {
i0 = i0 - 10;

} else {
i0 = i0 - 15;

}
if (i0 < -30) {
i0 = -30;

} else if (i0 > 30) {
i0 = 30;

}
i1 = gg.Rand(100) + i0;
if (babble_mode == 1) {
myself.Say("i0/i1:" + i0 + "/" + i1);

}
if (i1 >= 120) {
if (myself.sm.npc_class_id == 1022650 || myself.sm.npc_class_id == 1022651 || myself.sm.npc_class_id == 1022652 || myself.sm.npc_class_id == 1022653) {
myself.Shout(gg.MakeFString(1800872, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022656 || myself.sm.npc_class_id == 1022657) {
myself.Shout(gg.MakeFString(1800873, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022658 || myself.sm.npc_class_id == 1022659) {
myself.Shout(gg.MakeFString(1800874, "", "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, Skill_selfslow03, 1, 1, Maximum_Hate);
gg.SetNpcParam(myself.sm, 9, myself.sm.hp * 0.100000);

} else if (i1 >= 85) {
if (myself.sm.npc_class_id == 1022650 || myself.sm.npc_class_id == 1022651 || myself.sm.npc_class_id == 1022652 || myself.sm.npc_class_id == 1022653) {
myself.Say(gg.MakeFString(1800857, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022656 || myself.sm.npc_class_id == 1022657) {
myself.Say(gg.MakeFString(1800859, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022658 || myself.sm.npc_class_id == 1022659) {
myself.Say(gg.MakeFString(1800860, "", "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, Skill_selfslow02, 1, 1, Maximum_Hate);
gg.SetNpcParam(myself.sm, 9, myself.sm.hp * 0.500000);

}

}
myself.i_ai1 = 1;

}

} else {
myself.SetAbilityItemDrop(0);
myself.AddFleeDesireEx(attacker, 100, DefaultHate);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TID_SIGNAL_ROUTINE) {
if (myself.sm.alive && myself.sm.npc_class_id == 1022650 || myself.sm.npc_class_id == 1022651 || myself.sm.npc_class_id == 1022652 || myself.sm.npc_class_id == 1022653 || myself.sm.npc_class_id == 1022654 || myself.sm.npc_class_id == 1022655) {
if (babble_mode == 1) {
myself.Say("머크로키언 신호 보냄");

}
myself.BroadcastScriptEvent(78010077, myself.sm.id, 300);

}
myself.AddTimerEx(TID_SIGNAL_ROUTINE, TIME_SIGNAL_ROUTINE * 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 78010077 || script_event_arg1 == 78010079 && myself.sm.npc_class_id == 1022656 || myself.sm.npc_class_id == 1022657 || myself.sm.npc_class_id == 1022658 || myself.sm.npc_class_id == 1022659 || script_event_arg1 == 78010078 && myself.sm.npc_class_id == 1022650 || myself.sm.npc_class_id == 1022651 || myself.sm.npc_class_id == 1022652 || myself.sm.npc_class_id == 1022653 || myself.sm.npc_class_id == 1022654 || myself.sm.npc_class_id == 1022655 || script_event_arg1 == 78010082 && myself.sm.npc_class_id == 1022655) {
if (babble_mode == 1) {
myself.Say("적대 관계 신호 받음 - 공격 디자이어");

}
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0.alive) {
if (gg.Rand(3) == 0) {
if (myself.sm.npc_class_id == 1022656) {
myself.Say(gg.MakeFString(1800852, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022657) {
myself.Say(gg.MakeFString(1800853, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022658) {
myself.Say(gg.MakeFString(1800855, "", "", "", "", ""));

} else if (myself.sm.npc_class_id == 1022659) {
myself.Say(gg.MakeFString(1800856, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800858, "", "", "", "", ""));

}
myself.AddAttackDesire(c0, 1, DefaultHate);

}

}

}
super;
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.npc_class_id == 1018805 || target.npc_class_id == 1018806 && myself.sm.npc_class_id == 1022650 || myself.sm.npc_class_id == 1022651 || myself.sm.npc_class_id == 1022652 || myself.sm.npc_class_id == 1022653 || myself.sm.npc_class_id == 1022654 || myself.sm.npc_class_id == 1022655) {
if (babble_mode == 1) {
myself.Say("적대 목표 파괴 완료 - 귀환");

}
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, DefaultHate);

}
super;
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (last_attacker.is_pc && myself.IsInCategory(1, last_attacker.occupation)) {
if (gg.Rand(100) <= loot01_roll) {
myself.DropItem1(myself.sm, loot01, 1);

} else if (gg.Rand(100) <= loot02_roll) {
myself.DropItem1(myself.sm, loot02, 1);

} else if (gg.Rand(100) <= loot03_roll) {
myself.DropItem1(myself.sm, loot03, 1);

} else if (gg.Rand(100) <= loot04_roll) {
myself.DropItem1(myself.sm, loot04, 1);

}

}

}
super;
	}


}