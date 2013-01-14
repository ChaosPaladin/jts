package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_marguene extends default_npc {
	protected int FIRST_TIMER = 1111;
	protected int SECOND_TIMER = 1112;
	protected int THIRD_TIMER = 1113;
	protected int FORTH_TIMER = 1114;
	protected int END_TIMER = 1115;
	protected int DIST_CHECK_TIMER = 1116;
	protected int B_PLASMA1 = 417267713;
	protected int B_PLASMA2 = 417267714;
	protected int B_PLASMA3 = 417267715;
	protected int C_PLASMA1 = 417333249;
	protected int C_PLASMA2 = 417333250;
	protected int C_PLASMA3 = 417333251;
	protected int R_PLASMA1 = 417398785;
	protected int R_PLASMA2 = 417398786;
	protected int R_PLASMA3 = 417398787;
	protected int B_BUFF_1 = 415694849;
	protected int B_BUFF_2 = 415694850;
	protected int C_BUFF_1 = 417136641;
	protected int C_BUFF_2 = 417136642;
	protected int R_BUFF_1 = 417202177;
	protected int R_BUFF_2 = 417202178;

	protected void CREATED(HandlerParam s0) {
myself.i_quest9 = 0;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param3);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
s0 = myself.c_ai0.name;
if (myself.i_quest9) {
myself.Say(myself.c_ai0.name + " 가 내 주인");

}
myself.ChangeMasterName(myself.sm, s0);
myself.AddFollowDesire2(myself.c_ai0, 10, 1, 60, 0);
if (myself.sm.param2 == 0) {
gg.ShowOnScreenMsgStr(myself.c_ai0, 2, 0, 0, 0, 0, 1, 4000, 0, gg.MakeFString(1801149, "", "", "", "", ""));

}

}
if (myself.i_quest9) {
myself.Say(myself.sm.param3 + " 인덱스");

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.AddTimerEx(DIST_CHECK_TIMER, 1 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == DIST_CHECK_TIMER) {
if (myself.DistFromMe(myself.c_ai0) < 100 && myself.i_ai2 == 0) {
myself.i_ai2 = 1;
myself.AddTimerEx(FIRST_TIMER, 4 * 1000);

} else {
myself.AddTimerEx(DIST_CHECK_TIMER, 1 * 100);

}

} else if (timer_id == FIRST_TIMER) {
i0 = gg.Rand(3) + 1;
if (myself.i_quest9) {
myself.Say(i0 + " : 랜덤값");

}
myself.ChangeNPCState(myself.sm, i0);
myself.i_ai1 = i0;
myself.AddTimerEx(SECOND_TIMER, 5000 + gg.Rand(300));
i0 = gg.Rand(3) + 1;
switch (i0) {
case 1: {
myself.AddEffectActionDesire(myself.sm, 1, 1, 100);
break;

}
case 2: {
myself.AddEffectActionDesire(myself.sm, 2, 1, 100);
break;

}
case 3: {
myself.AddEffectActionDesire(myself.sm, 3, 1, 100);
break;

}

}

} else if (timer_id == SECOND_TIMER) {
myself.ChangeNPCState(myself.sm, 4);
i0 = gg.Rand(3) + 1;
if (myself.i_quest9) {
myself.Say(i0 + " : 랜덤값");

}
myself.ChangeNPCState(myself.sm, i0);
myself.i_ai1 = i0;
myself.AddTimerEx(THIRD_TIMER, 4600 + gg.Rand(600));
if (myself.i_quest9) {
myself.Say("세번째 타이머 가동");

}
i0 = gg.Rand(3) + 1;
switch (i0) {
case 1: {
myself.AddEffectActionDesire(myself.sm, 1, 1, 100);
break;

}
case 2: {
myself.AddEffectActionDesire(myself.sm, 2, 1, 100);
break;

}
case 3: {
myself.AddEffectActionDesire(myself.sm, 3, 1, 100);
break;

}

}

} else if (timer_id == THIRD_TIMER) {
myself.ChangeNPCState(myself.sm, 4);
i0 = gg.Rand(3) + 1;
if (myself.i_quest9) {
myself.Say(i0 + " : 랜덤값");

}
myself.ChangeNPCState(myself.sm, i0);
myself.i_ai1 = i0;
myself.AddTimerEx(FORTH_TIMER, 4200 + gg.Rand(900));
if (myself.i_quest9) {
myself.Say("세번째까지 끝나 자살 타이머!");

}
i0 = gg.Rand(3) + 1;
switch (i0) {
case 1: {
myself.AddEffectActionDesire(myself.sm, 1, 1, 100);
break;

}
case 2: {
myself.AddEffectActionDesire(myself.sm, 2, 1, 100);
break;

}
case 3: {
myself.AddEffectActionDesire(myself.sm, 3, 1, 100);
break;

}

}

} else if (timer_id == FORTH_TIMER) {
myself.i_ai1 = 0;
myself.ChangeNPCState(myself.sm, 4);
myself.AddTimerEx(END_TIMER, 5 * 100);
if (myself.i_quest9) {
myself.Say(myself.i_ai1 + "  초기화! 곧 자살!");

}
i0 = gg.Rand(3) + 1;
switch (i0) {
case 1: {
myself.AddEffectActionDesire(myself.sm, 1, 1, 100);
break;

}
case 2: {
myself.AddEffectActionDesire(myself.sm, 2, 1, 100);
break;

}
case 3: {
myself.AddEffectActionDesire(myself.sm, 3, 1, 100);
break;

}

}

} else if (timer_id == END_TIMER) {
myself.ChangeNPCState(myself.sm, 4);
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.c_ai0.param1 = 0;

}
if (myself.sm.param2 == 1) {
myself.Dispel(myself.c_ai0, myself.Skill_GetAbnormalType(B_PLASMA1));
myself.Dispel(myself.c_ai0, myself.Skill_GetAbnormalType(C_PLASMA1));
myself.Dispel(myself.c_ai0, myself.Skill_GetAbnormalType(R_PLASMA1));

}
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam target, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
i1 = gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(B_PLASMA1));
if (i1 == -1) {
i1 = 0;

}
i2 = gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(C_PLASMA1));
if (i2 == -1) {
i2 = 0;

}
i3 = gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(R_PLASMA1));
if (i3 == -1) {
i3 = 0;

}
if (myself.i_quest9) {
myself.Whisper(target, "결산 :  비스타콘 " + i1 + " 코크라콘 " + i2 + " 렙틸리콘 " + i3 + " ");

}
if (i1 == 3 && i2 == 0 && i3 == 0) {
myself.ShowSystemMessageStr(target, gg.MakeFString(1801150, "", "", "", "", ""));
myself.Dispel(target, myself.Skill_GetAbnormalType(B_PLASMA1));
if (gg.Rand(100) < 70) {
myself.AddUseSkillDesire(target, B_BUFF_1, 0, 1, 100000000);

} else {
myself.AddUseSkillDesire(target, B_BUFF_2, 0, 1, 100000000);

}
i4 = gg.Rand(10000);
i5 = gg.Rand(20);
if (i4 == 0 && i5 != 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15488);
myself.CreatePet(target, 15488, 1016071, 60);

}

} else if (i4 == 0 && i5 == 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15489);
myself.CreatePet(target, 15489, 1016072, 60);

}

}
myself.AddTimerEx(END_TIMER, 3 * 1000);

} else if (i1 == 0 && i2 == 3 && i3 == 0) {
myself.ShowSystemMessageStr(target, gg.MakeFString(1801151, "", "", "", "", ""));
myself.Dispel(target, myself.Skill_GetAbnormalType(C_PLASMA1));
if (gg.Rand(100) < 70) {
myself.AddUseSkillDesire(target, C_BUFF_1, 0, 1, 100000000);

} else {
myself.AddUseSkillDesire(target, C_BUFF_2, 0, 1, 100000000);

}
i4 = gg.Rand(10000);
i5 = gg.Rand(20);
if (i4 == 0 && i5 != 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15488);
myself.CreatePet(target, 15488, 1016071, 60);

}

} else if (i4 == 0 && i5 == 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15489);
myself.CreatePet(target, 15489, 1016072, 60);

}

}
myself.AddTimerEx(END_TIMER, 3 * 1000);

} else if (i1 == 0 && i2 == 0 && i3 == 3) {
myself.ShowSystemMessageStr(target, gg.MakeFString(1801152, "", "", "", "", ""));
myself.Dispel(target, myself.Skill_GetAbnormalType(R_PLASMA1));
if (gg.Rand(100) < 70) {
myself.AddUseSkillDesire(target, R_BUFF_1, 0, 1, 100000000);

} else {
myself.AddUseSkillDesire(target, R_BUFF_2, 0, 1, 100000000);

}
i4 = gg.Rand(10000);
i5 = gg.Rand(20);
if (i4 == 0 && i5 != 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15488);
myself.CreatePet(target, 15488, 1016071, 60);

}

} else if (i4 == 0 && i5 == 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15489);
myself.CreatePet(target, 15489, 1016072, 60);

}

}
myself.AddTimerEx(END_TIMER, 3 * 1000);

} else if (i1 + i2 + i3 == 3) {
if (i1 == 1 && i2 == 1 && i3 == 1) {
myself.Dispel(target, myself.Skill_GetAbnormalType(B_PLASMA1));
myself.Dispel(target, myself.Skill_GetAbnormalType(C_PLASMA1));
myself.Dispel(target, myself.Skill_GetAbnormalType(R_PLASMA1));
myself.ShowSystemMessageStr(target, gg.MakeFString(1801153, "", "", "", "", ""));
switch (gg.Rand(3)) {
case 0: {
if (gg.Rand(100) < 70) {
myself.AddUseSkillDesire(target, B_BUFF_1, 0, 1, 100000000);

} else {
myself.AddUseSkillDesire(target, B_BUFF_2, 0, 1, 100000000);

}
break;

}
case 1: {
if (gg.Rand(100) < 70) {
myself.AddUseSkillDesire(target, C_BUFF_1, 0, 1, 100000000);

} else {
myself.AddUseSkillDesire(target, C_BUFF_2, 0, 1, 100000000);

}
break;

}
case 2: {
if (gg.Rand(100) < 70) {
myself.AddUseSkillDesire(target, R_BUFF_1, 0, 1, 100000000);

} else {
myself.AddUseSkillDesire(target, R_BUFF_2, 0, 1, 100000000);

}
break;

}

}
i4 = gg.Rand(10000);
i5 = gg.Rand(20);
if (i4 == 0 && i5 != 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15488);
myself.CreatePet(target, 15488, 1016071, 60);

}

} else if (i4 == 0 && i5 == 0) {
if (myself.GetInventoryInfo(target, 0) >= 1) {
myself.GetItemData(target, 15489);
myself.CreatePet(target, 15489, 1016072, 60);

}

}
myself.AddTimerEx(END_TIMER, 3 * 1000);

} else {
myself.ShowSystemMessageStr(target, gg.MakeFString(1801154, "", "", "", "", ""));
myself.Dispel(target, myself.Skill_GetAbnormalType(B_PLASMA1));
myself.Dispel(target, myself.Skill_GetAbnormalType(C_PLASMA1));
myself.Dispel(target, myself.Skill_GetAbnormalType(R_PLASMA1));
myself.AddTimerEx(END_TIMER, 1 * 1000);

}

} else {
myself.AddTimerEx(END_TIMER, 1 * 1000);

}
myself.ChangeNPCState(myself.sm, 4);
if (myself.IsNullCreature(target) == 0) {
if (target.param1 == 1) {
target.param1 = 0;

}

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (skill_name_id == 593756161 && myself.c_ai0 == speller) {
if (myself.i_ai1 != 0 && myself.i_ai0 == 0) {
i1 = gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(B_PLASMA1));
i2 = gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(C_PLASMA1));
i3 = gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(R_PLASMA1));
if (myself.i_quest9) {
myself.Whisper(speller, "수집기 작렬 / 타이머 블럭 / 현재 이펙트값은 " + myself.i_ai1 + " ");

}
myself.BlockTimer(FIRST_TIMER);
myself.BlockTimer(SECOND_TIMER);
myself.BlockTimer(THIRD_TIMER);
myself.BlockTimer(FORTH_TIMER);
myself.i_ai0 = 1;
if (myself.i_ai1 == 1) {
if (i1 == -1) {
myself.AddUseSkillDesire(speller, B_PLASMA1, 0, 1, 100000000);

} else if (i1 == 1) {
myself.AddUseSkillDesire(speller, B_PLASMA2, 0, 1, 100000000);

} else if (i1 == 2) {
myself.AddUseSkillDesire(speller, B_PLASMA3, 0, 1, 100000000);

}

} else if (myself.i_ai1 == 2) {
if (i2 == -1) {
myself.AddUseSkillDesire(speller, C_PLASMA1, 0, 1, 100000000);

} else if (i2 == 1) {
myself.AddUseSkillDesire(speller, C_PLASMA2, 0, 1, 100000000);

} else if (i2 == 2) {
myself.AddUseSkillDesire(speller, C_PLASMA3, 0, 1, 100000000);

}

} else if (myself.i_ai1 == 3) {
if (i3 == -1) {
myself.AddUseSkillDesire(speller, R_PLASMA1, 0, 1, 100000000);

} else if (i3 == 1) {
myself.AddUseSkillDesire(speller, R_PLASMA2, 0, 1, 100000000);

} else if (i3 == 2) {
myself.AddUseSkillDesire(speller, R_PLASMA3, 0, 1, 100000000);

}

}

}

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
myself.Whisper(creature, "===== Debug Mode =====");
myself.Whisper(creature, "All Timers were blocked");
myself.ChangeNPCState(myself.sm, reply);
myself.BlockTimer(FIRST_TIMER);
myself.BlockTimer(SECOND_TIMER);
myself.BlockTimer(THIRD_TIMER);
myself.BlockTimer(FORTH_TIMER);
myself.BlockTimer(END_TIMER);
myself.BlockTimer(DIST_CHECK_TIMER);
	}


}