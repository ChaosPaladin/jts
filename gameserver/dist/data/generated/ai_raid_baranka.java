package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_raid_baranka extends default_npc {
	protected String Privates1 = "baranka_confidential_re:ai_raid_baranka_confi:1:0sec;baranka_chamberlain_re:ai_nest_healer:1:0sec";
	protected String Privates2 = "baranka_protecter_re:ai_raid_baranka_protector:1:0sec";
	protected String Privates3 = "ragna_orc_hero_re:ai_raid_baranka_orc_warrior:1:0sec;ragna_orc_seer_re:ai_raid_baranka_orc_wizard:1:0sec";
	protected int SKILL_dmg_shield = 402849793;
	protected int SKILL_dmg_shield_Prob = 500;
	protected int SKILL_slow = 275447818;
	protected int SKILL_DD_ID = 278724618;
	protected int SKILL_DD_ID_Prob = 2000;
	protected int SKILL_teleport_Prob = 500;
	protected int SKILL_target_cancel = 302645249;
	protected int ITEM_Pendant = 14848;
	protected int TIMER_random_teleport = 31123;
	protected int TIMER_spawn_protector = 31124;
	protected int TIMER_regular_timer = 31125;
	protected int TIMER_check_trr = 31126;
	protected int TIMER_init = 31127;
	protected int TIMER_spawn_orc = 31128;
	protected int TIMER_repeat_shield = 31129;
	protected int Pos_X1 = 74450;
	protected int Pos_Y1 = -102185;
	protected int Pos_Z1 = -960;
	protected int Pos_X2 = 74445;
	protected int Pos_Y2 = -101578;
	protected int Pos_Z2 = -960;
	protected int Pos_X3 = 73797;
	protected int Pos_Y3 = -101913;
	protected int Pos_Z3 = -960;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam c0) {
myself.i_ai5 = 0;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.i_ai9 = 0;
myself.i_ai4 = 0;
myself.i_quest8 = 0;
myself.CreatePrivates(Privates1);
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (debug_mode) {
myself.Say("I Spawned with param1");

}
if (myself.IsNullCreature(c0) == 0) {
if (debug_mode) {
myself.Say("I Make Attack Event to param2, name : " + c0.name);

}
if (c0.is_pc == 1) {
myself.MakeAttackEvent(c0, 2000, 0);

} else if (myself.IsInCategory(12, c0.npc_class_id)) {
myself.MakeAttackEvent(c0.master, 2000, 0);

}

} else if (debug_mode) {
myself.Say("ERROR! param2 creature is null");

}

}
myself.AddTimerEx(TIMER_regular_timer, 60 * 1000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0, HandlerParam i1) {
myself.i_quest8 = myself.GetCurrentTick();
if (myself.i_ai5 == 0) {
if (debug_mode) {
myself.Say("전투 시작");

}
myself.i_ai5 = 1;
myself.AddTimerEx(TIMER_spawn_protector, 60 * 1000);
myself.AddTimerEx(TIMER_check_trr, 10 * 1000);

}
if (myself.sm.hp < myself.sm.max_hp * 0.750000 && myself.i_ai6 == 0) {
if (debug_mode) {
myself.Say("HP 75% 이하가 됨. 오크 스폰 모드");

}
myself.i_ai6 = 1;
myself.AddTimerEx(TIMER_spawn_orc, 1);

} else if (myself.sm.hp < myself.sm.max_hp * 0.500000 && myself.i_ai6 == 1) {
if (debug_mode) {
myself.Say("HP 50% 이하가 됨. 오크 스폰 모드");

}
myself.i_ai6 = 2;
myself.AddTimerEx(TIMER_spawn_orc, 1);

} else if (myself.sm.hp < myself.sm.max_hp * 0.250000 && myself.i_ai6 == 2) {
if (debug_mode) {
myself.Say("HP 25% 이하가 됨. 오크 스폰 모드");

}
myself.i_ai6 = 3;
myself.AddTimerEx(TIMER_spawn_orc, 1);

} else if (myself.i_ai7 == 1) {
if (debug_mode) {
myself.Say("무적 모드, 쫄잡아야 풀림");

}

} else if (myself.i_ai4 == 1) {
if (debug_mode) {
myself.Say("DD 반복 사용 중지");

}
myself.i_ai4 = 0;
myself.MakeAttackEvent(myself.c_ai0, 100, 0);

} else {
myself.AddAttackDesire(attacker, 1, damage * 2);
myself.c_ai0 = myself.top_desire_target;
if (SKILL_DD_ID != 458752001) {
if (gg.Rand(10000) < SKILL_DD_ID_Prob) {
if (myself.Skill_GetConsumeMP(SKILL_DD_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_DD_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_DD_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, SKILL_DD_ID, 0, 1, 1000000);

}

}

}
if (gg.Rand(10000) < SKILL_teleport_Prob) {
if (debug_mode) {
myself.Say("USE - TELEPORT PATTERN ATTACK");

}
myself.RemoveAllDesire();
myself.StopMove();
i0 = gg.Rand(3);
if (myself.i_ai9 == i0) {
i1 = gg.Rand(2);
switch (myself.i_ai9) {
case 0: {
if (i1 == 0) {
myself.InstantTeleport(myself.sm, Pos_X2, Pos_Y2, Pos_Z2);
myself.i_ai9 = 1;

} else if (i1 == 1) {
myself.InstantTeleport(myself.sm, Pos_X3, Pos_Y3, Pos_Z3);
myself.i_ai9 = 2;

}
break;

}
case 1: {
if (i1 == 0) {
myself.InstantTeleport(myself.sm, Pos_X1, Pos_Y1, Pos_Z1);
myself.i_ai9 = 0;

} else if (i1 == 1) {
myself.InstantTeleport(myself.sm, Pos_X3, Pos_Y3, Pos_Z3);
myself.i_ai9 = 2;

}
break;

}
case 2: {
if (i1 == 0) {
myself.InstantTeleport(myself.sm, Pos_X1, Pos_Y1, Pos_Z1);
myself.i_ai9 = 0;

} else if (i1 == 1) {
myself.InstantTeleport(myself.sm, Pos_X2, Pos_Y2, Pos_Z2);
myself.i_ai9 = 1;

}
break;

}

}

} else {
myself.i_ai9 = i0;
switch (i0) {
case 0: {
myself.InstantTeleport(myself.sm, Pos_X1, Pos_Y1, Pos_Z1);
break;

}
case 1: {
myself.InstantTeleport(myself.sm, Pos_X2, Pos_Y2, Pos_Z2);
break;

}
case 2: {
myself.InstantTeleport(myself.sm, Pos_X3, Pos_Y3, Pos_Z3);
break;

}

}

}
if (debug_mode) {
myself.Say("텔레포트 한 곳 : " + myself.i_ai9);

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.CastBuffForQuestReward(myself.c_ai0, SKILL_target_cancel);

}
if (myself.sm.hp < myself.sm.max_hp * 0.500000) {
if (debug_mode) {
myself.Say("USE - TELEPORT PATTERN ATTACK with SLOW");

}
if (myself.Skill_GetConsumeMP(SKILL_slow) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_slow) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_slow) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, SKILL_slow, 0, 1, 1000000);

}

}
myself.i_ai4 = 1;
if (myself.Skill_GetConsumeMP(SKILL_DD_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_DD_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_DD_ID) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, SKILL_DD_ID, 0, 1, 1000000);

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.300000) {
if (gg.Rand(10000) < SKILL_dmg_shield_Prob) {
if (debug_mode) {
myself.Say("USE - REFLECT SKILL");

}
if (myself.Skill_GetConsumeMP(SKILL_dmg_shield) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_dmg_shield) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_dmg_shield) == 0) {
myself.AddUseSkillDesire(myself.sm, SKILL_dmg_shield, 1, 1, 1000000);

}

}

}

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.BroadcastScriptEventEx(2214008, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(myself.top_desire_target), 3000);

} else if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEventEx(2214008, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(myself.c_ai0), 3000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
super;
if (success == 1) {
if (skill_name_id == SKILL_DD_ID) {
if (myself.i_ai4 == 1) {
if (debug_mode) {
myself.Say("USE_SKILL_FINISHED : DD 반복사용");

}
if (myself.Skill_GetConsumeMP(SKILL_DD_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_DD_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_DD_ID) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, SKILL_DD_ID, 0, 1, 1000000);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == TIMER_spawn_protector) {
if (myself.i_ai5 == 1) {
if (debug_mode) {
myself.Say("수호자 스폰!");

}
maker0 = myself.GetMyMaker();
if (maker0.maximum_npc - maker0.npc_count >= 3) {
myself.CreatePrivates(Privates2);

}
myself.AddTimerEx(TIMER_spawn_protector, 60 * 1000);

} else if (debug_mode) {
myself.Say("수호자 스폰 타이머가 되었으나 초기화");

}

} else if (timer_id == TIMER_regular_timer) {
if (myself.i_ai5 == 1) {
if (myself.GetCurrentTick() - myself.i_quest8 >= 300 && myself.c_ai0 != myself.GetLastAttacker()) {
myself.c_ai0 = gg.GetNullCreature();

}
if (myself.IsNullCreature(myself.c_ai0) || myself.c_ai0.alive == 0 || myself.DistFromMe(myself.c_ai0) >= 3000) {
if (debug_mode) {
myself.Say("regular timer - 초기화 루틴");

}
myself.AddTimerEx(TIMER_init, 1);

}

} else if (debug_mode) {
myself.Say("ERR. 1분 정기 타이머가 되었으나 전투가 시작되지 않았음");

}
myself.AddTimerEx(TIMER_regular_timer, 60 * 1000);

} else if (timer_id == TIMER_check_trr) {
if (myself.i_ai5 == 1) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.Say(gg.MakeFString(1800844, "", "", "", "", ""));
myself.AddTimerEx(TIMER_init, 1);

}
myself.AddTimerEx(TIMER_check_trr, 10 * 1000);

} else if (debug_mode) {
myself.Say("테리토리 검사 타이머가 되었으나 초기화");

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.BroadcastScriptEventEx(2214008, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(myself.top_desire_target), 3000);

} else if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.BroadcastScriptEventEx(2214008, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(myself.c_ai0), 3000);

}

} else if (timer_id == TIMER_spawn_orc) {
myself.RemoveAllDesire();
myself.StopMove();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
if (myself.Skill_GetConsumeMP(SKILL_dmg_shield) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_dmg_shield) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_dmg_shield) == 0) {
myself.AddUseSkillDesire(myself.sm, SKILL_dmg_shield, 1, 1, 1000000);

}
myself.i_ai7 = 1;
myself.i_ai4 = 1;
myself.CreatePrivates(Privates3);
if (myself.Skill_GetConsumeMP(SKILL_DD_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_DD_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_DD_ID) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, SKILL_DD_ID, 0, 1, 1000000);

}
myself.AddTimerEx(TIMER_repeat_shield, 10 * 1000);

} else if (timer_id == TIMER_repeat_shield) {
if (myself.i_ai7 == 1) {
if (debug_mode) {
myself.Say("repeat shield");

}
if (myself.Skill_GetConsumeMP(SKILL_dmg_shield) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_dmg_shield) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_dmg_shield) == 0) {
myself.AddUseSkillDesire(myself.sm, SKILL_dmg_shield, 1, 1, 1000000);

}
myself.AddTimerEx(TIMER_repeat_shield, 10 * 1000);

}

} else if (timer_id == TIMER_init) {
if (debug_mode) {
myself.Shout("초기화 타이머 CALL , 디스폰됨");

}
myself.BroadcastScriptEvent(2214007, 0, 4000);
myself.Despawn();

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 2214006) {
myself.i_ai8 = myself.i_ai8 + 1;
if (debug_mode) {
myself.Say("Baranka Private Died!... : " + myself.i_ai8);

}
if (myself.i_ai8 == 2) {
if (debug_mode) {
myself.Say("무적 모드 Off!");

}
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.i_ai4 = 0;
myself.AddAttackDesire(myself.c_ai0, 1, 10000);

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(creature) == 0 && myself.i_ai4 != 1) {
myself.MakeAttackEvent(creature, 100, 0);

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam c0) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.IsInCategory(12, myself.c_ai0.npc_class_id) == 1) {
c0 = myself.c_ai0.master;

} else {
c0 = myself.c_ai0;

}
if (myself.IsNullCreature(c0) == 0) {
if (gg.OwnItemCount(c0, ITEM_Pendant) > 0) {
if (debug_mode) {
myself.Say("날 죽인 PC의 아이템 삭제");

}
myself.DeleteItem1(c0, ITEM_Pendant, 1);

} else {
if (debug_mode) {
myself.Say("ERR! 퀘스트 아이템 없음! 보상 드랍 안함");

}
myself.SetAbilityItemDrop(0);

}

}

}
myself.BroadcastScriptEvent(2214007, 0, 4000);
	}


}