package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_ag_type4_andreas extends raid_boss_ag_type4 {
	protected int TelPosX1 = -16393;
	protected int TelPosY1 = -53433;
	protected int TelPosZ1 = -10439;
	protected int TelPosX2 = -17150;
	protected int TelPosY2 = -54064;
	protected int TelPosZ2 = -10439;
	protected int TelPosX3 = -15690;
	protected int TelPosY3 = -54030;
	protected int TelPosZ3 = -10439;
	protected String MidSpawnMakerName11 = "altar_combat1_01";
	protected String MidSpawnMakerName12 = "altar_combat1_02";
	protected String MidSpawnMakerName13 = "altar_combat1_03";
	protected String MidSpawnMakerName21 = "altar_combat2_01";
	protected String MidSpawnMakerName22 = "altar_combat2_02";
	protected String MidSpawnMakerName23 = "altar_combat2_03";
	protected String MakerNameAltarDoorCon = "rune14_andreas_m3";
	protected String MakerNameStageCon = "rune14_andreas_m2";
	protected int SeekRange = 400;
	protected int BroadcastRange = 4000;
	protected int AttackPartyPointRate = 33;
	protected int TeleportEffect = 306118657;
	protected int SpecialEffectSkill = 274137089;
	protected int private1_silhouette = 1020130;
	protected String private1_ai_type = "warrior";
	protected int private1_pos_x = -91;
	protected int private1_pos_y = -95;
	protected int private2_silhouette = 1020130;
	protected String private2_ai_type = "warrior";
	protected int private2_pos_x = -48;
	protected int private2_pos_y = -130;
	protected int private3_silhouette = 1020130;
	protected String private3_ai_type = "warrior";
	protected int private3_pos_x = -91;
	protected int private3_pos_y = 95;
	protected int private4_silhouette = 1020130;
	protected String private4_ai_type = "warrior";
	protected int private4_pos_x = -48;
	protected int private4_pos_y = 130;
	protected int Start_x = -16385;
	protected int Start_y = -53268;
	protected int Start_z = -10439;

	protected void CREATED(HandlerParam maker0) {
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.c_ai0 = myself.sm;
myself.BroadcastScriptEvent(0, gg.GetIndexFromCreature(myself.sm), BroadcastRange * 2);
myself.AddTimerEx(6008, 5 * 60 * 60 * 1000);
myself.CreateOnePrivateEx(private1_silhouette, private1_ai_type, 0, 0, gg.FloatToInt(Start_x + private1_pos_x), gg.FloatToInt(Start_y + private1_pos_y), gg.FloatToInt(Start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(private2_silhouette, private2_ai_type, 0, 0, gg.FloatToInt(Start_x + private2_pos_x), gg.FloatToInt(Start_y + private2_pos_y), gg.FloatToInt(Start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(private3_silhouette, private3_ai_type, 0, 0, gg.FloatToInt(Start_x + private3_pos_x), gg.FloatToInt(Start_y + private3_pos_y), gg.FloatToInt(Start_z), 0, 0, 0, 0);
myself.CreateOnePrivateEx(private4_silhouette, private4_ai_type, 0, 0, gg.FloatToInt(Start_x + private4_pos_x), gg.FloatToInt(Start_y + private4_pos_y), gg.FloatToInt(Start_z), 0, 0, 0, 0);
	}

	protected void NO_DESIRE() {
if (myself.i_ai3 != 0 || myself.i_ai4 != 0) {
myself.i_ai2 = 0;
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddTimerEx(6005, 5 * 1000);

}

} else if (myself.i_ai3 < 3 || myself.i_ai3 >= 7) {
myself.AddMoveToDesire(Start_x, Start_y, Start_z, 30);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam maker0, HandlerParam maker1, HandlerParam i0, HandlerParam f0) {
super;
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.c_ai0 = myself.top_desire_target;

} else {
myself.c_ai0 = attacker;

}
myself.i_quest1 = myself.GetCurrentTick();
if (gg.Rand(100) < AttackPartyPointRate) {
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.c_ai0), SeekRange);

}
if (myself.sm.hp < myself.sm.max_hp * 0.100000) {
if (myself.i_ai4 == 2) {
myself.RemoveAllAttackDesire();
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.300000) {
if (myself.i_ai4 == 1) {
myself.RemoveAllAttackDesire();
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.600000) {
if (myself.i_ai4 == 0) {
myself.RemoveAllAttackDesire();
if (myself.Skill_GetConsumeMP(TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, TeleportEffect, 1, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam s0, HandlerParam c0, HandlerParam maker0, HandlerParam i0) {
if (timer_id == 6008) {
if (myself.i_ai2 == 0 && myself.i_ai3 == 0 && myself.i_ai4 == 0 && myself.c_ai0 == myself.sm && myself.p_state != 3 && myself.p_state != 10) {
maker0 = gg.GetNpcMaker(MidSpawnMakerName11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = myself.sm;
myself.BroadcastScriptEvent(6, gg.GetIndexFromCreature(myself.sm), BroadcastRange * 2);
myself.Despawn();

} else {
myself.AddTimerEx(6008, 30 * 60 * 1000);

}

} else if (timer_id == 6007) {
myself.RemoveAllDesire();
myself.RemoveAllHateInfoIF(0, 0);
myself.i_quest0 = 1;

} else if (timer_id == 6006) {
i0 = myself.GetCurrentTick() - myself.i_quest1;
if (i0 > 30 * 60) {
myself.RemoveAllAttackDesire();
myself.BroadcastScriptEvent(7, 0, BroadcastRange);

} else {
myself.AddTimerEx(6006, 60 * 1000);

}

} else if (timer_id == 6005) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.i_quest0 = 0;
if (myself.c_ai0.is_pc != 0 || myself.IsInCategory(12, myself.c_ai0.npc_class_id)) {
myself.AddAttackDesire(myself.c_ai0, 1, 7 * 100);

}
myself.BroadcastScriptEvent(10002, gg.GetIndexFromCreature(myself.c_ai0), SeekRange);

}

} else if (timer_id == 6004) {
myself.i_quest0 = 0;
myself.LookNeighbor(SeekRange);

} else if (timer_id == 6003) {
myself.i_quest0 = 0;
myself.LookNeighbor(SeekRange);

} else if (timer_id == 6099) {
if (myself.Skill_GetConsumeMP(SpecialEffectSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(SpecialEffectSkill) < myself.sm.hp && myself.Skill_InReuseDelay(SpecialEffectSkill) == 0) {
myself.AddUseSkillDesire(myself.sm, SpecialEffectSkill, 1, 1, 1000000);

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i6, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam i2) {
myself.i_ai2 = 1;
i1 = gg.GetIndexFromCreature(myself.c_ai0);
i2 = gg.GetIndexFromCreature(myself.sm);
if (creature.is_pc != 0) {
if (i1 == i2) {
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.AddAttackDesire(creature, 1, 7 * 100);

}

} else if (myself.c_ai0.is_pc != 0 || myself.IsInCategory(12, myself.c_ai0.npc_class_id)) {
myself.AddAttackDesire(myself.c_ai0, 1, 7 * 100);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam i0, HandlerParam maker0) {
if (skill_name_id == TeleportEffect) {
if (myself.i_ai4 == 2) {
if (success == 1) {
myself.InstantTeleport(myself.sm, TelPosX1, TelPosY1, TelPosZ1);

}
myself.i_ai4 = 3;
myself.AddTimerEx(6007, 500);
myself.AddTimerEx(6005, 10 * 1000);

} else if (myself.i_ai4 == 1) {
if (success == 1) {
i0 = gg.Rand(3);
if (i0 == 0) {
myself.InstantTeleport(myself.sm, TelPosX1, TelPosY1, TelPosZ1);

} else if (i0 == 1) {
myself.InstantTeleport(myself.sm, TelPosX2, TelPosY2, TelPosZ2);

} else {
myself.InstantTeleport(myself.sm, TelPosX3, TelPosY3, TelPosZ3);

}

}
myself.i_ai4 = 2;
maker0 = gg.GetNpcMaker(MidSpawnMakerName21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("null maker0");

}
myself.AddTimerEx(6007, 500);
myself.AddTimerEx(6004, 10 * 1000);

} else if (myself.i_ai4 == 0) {
if (success == 1) {
i0 = gg.Rand(2);
if (i0 == 0) {
myself.InstantTeleport(myself.sm, TelPosX3, TelPosY3, TelPosZ3);

} else {
myself.InstantTeleport(myself.sm, TelPosX2, TelPosY2, TelPosZ2);

}

}
myself.i_ai4 = 1;
maker0 = gg.GetNpcMaker(MidSpawnMakerName11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

} else {
myself.Say("null maker0");

}
myself.AddTimerEx(6007, 500);
myself.AddTimerEx(6003, 10 * 1000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 < 9) {
myself.i_ai3 = script_event_arg1;
if (script_event_arg1 == 1) {
myself.AddTimerEx(6006, 60 * 1000);

}
if (script_event_arg1 > 0) {
myself.i_quest1 = myself.GetCurrentTick();

}

}
if (script_event_arg1 == 4) {
if (script_event_arg2 != 0) {
myself.BroadcastScriptEvent(10020, script_event_arg2, SeekRange);
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddAttackDesire(c0, 1, 7 * 100);

}

}

} else if (script_event_arg1 == 7) {
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = myself.sm;
myself.AddMoveToDesire(Start_x, Start_y, Start_z, 30);

} else if (script_event_arg1 == 3) {
myself.AddTimerEx(6099, 6700);

}
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker(MidSpawnMakerName11);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName12);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName13);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName21);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName22);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
maker0 = gg.GetNpcMaker(MidSpawnMakerName23);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

} else {
myself.Say("null maker0");

}
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = myself.sm;
myself.BroadcastScriptEvent(5, gg.GetIndexFromCreature(myself.sm), BroadcastRange * 2);
super;
	}


}