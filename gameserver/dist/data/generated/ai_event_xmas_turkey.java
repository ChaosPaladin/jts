package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_xmas_turkey extends default_npc {
	protected int PHASE_COUNT = 3301;
	protected int PHASE_WAIT_1ST = 3302;
	protected int PHASE_WAIT_2ND = 3303;
	protected int PHASE_WAIT_3RD = 3304;
	protected int PHASE_START_ID = 3305;
	protected int PHASE_READY_END = 3306;
	protected int PHASE_READY_END2 = 3307;
	protected int PHASE_RESULT = 3308;
	protected int PHASE_ANI = 3309;
	protected int PHASE_DEFEAT = 3310;
	protected int PHASE_DESPAWN = 3311;
	protected int event_stop = 0;
	protected int event_fighting = 1;
	protected int event_gift = 2;
	protected int event_time = 30;
	protected int debug_mode = 0;
	protected int skill_TURKEY_READY = 400818177;
	protected int skill_TURKEY_DEFEAT_EFFECT = 223150081;
	protected int skill_TURKEY_MISTAKE = 400097281;
	protected int skill_TURKEY_GAWI = 399769601;
	protected int skill_TURKEY_BAWI = 399769602;
	protected int skill_TURKEY_BO = 399769603;
	protected int skill_TURKEY_GAWI_PC = 399572993;
	protected int skill_TURKEY_BAWI_PC = 399638529;
	protected int skill_TURKEY_BO_PC = 399704065;
	protected int skill_TURKEY_GAWI_CF = 400883713;
	protected int skill_TURKEY_BAWI_CF = 400883714;
	protected int skill_TURKEY_BO_CF = 400883715;
	protected int skill_TURKEY_WINNING = 399966209;
	protected int skill_TURKEY_DEBUFF_WINNING = 400031745;
	protected int skill_TURKEY_STONE = 300023809;

	protected void CREATED() {
if (debug_mode) {
myself.Shout("칠면조 등장");

}
myself.Shout(gg.MakeFString(1800720, "", "", "", "", ""));
myself.BroadcastSystemMessage(myself.sm, 8000, 2933);
myself.AddTimerEx(PHASE_WAIT_1ST, 10 * 1000);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = -1;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(PHASE_COUNT, 60000);
myself.SetMaxHateListSize(150);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == PHASE_COUNT) {
if (debug_mode) {
myself.Shout("PHASE - COUNT");

}
myself.i_ai3 = myself.i_ai3 + 1;
if (debug_mode) {
myself.Shout("COUNT 경과 횟수 : " + myself.i_ai3);

}
if (myself.i_ai3 < event_time) {
myself.AddTimerEx(PHASE_COUNT, 60 * 1000);

}

} else if (timer_id == PHASE_WAIT_1ST) {
if (debug_mode) {
myself.Shout("PHASE - WAIT_1ST");

}
i0 = gg.Rand(100);
if (myself.i_ai3 >= event_time) {
if (debug_mode) {
myself.Shout("시간초과. DESPAWN하겠음");

}
myself.Say(gg.MakeFString(1800745, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 2, 140, 1000000);
myself.AddTimerEx(PHASE_DESPAWN, 2 * 1000);

} else if (myself.i_ai3 >= event_time - 2) {
if (debug_mode) {
myself.Shout("종료 2타임 전");

}
myself.Say(gg.MakeFString(1800746, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 4, 214, 1000000);

} else if (i0 < 40) {
myself.Say(gg.MakeFString(1800733, "", "", "", "", ""));

} else if (i0 < 70) {
myself.Say(gg.MakeFString(1800734, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800735, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 4, 214, 1000000);

}
myself.AddTimerEx(PHASE_WAIT_2ND, 3 * 1000);

} else if (timer_id == PHASE_WAIT_2ND) {
if (debug_mode) {
myself.Shout("PHASE - WAIT_2ND");

}
myself.AddEffectActionDesire(myself.sm, 1, 217, 1000000);
myself.AddTimerEx(PHASE_WAIT_3RD, 4 * 1000);

} else if (timer_id == PHASE_WAIT_3RD) {
if (debug_mode) {
myself.Shout("PHASE - WAIT_3RD");

}
myself.AddUseSkillDesire(myself.sm, skill_TURKEY_READY, 1, 1, 100000000);
myself.AddTimerEx(PHASE_START_ID, 3 * 1000);

} else if (timer_id == PHASE_START_ID) {
if (debug_mode) {
myself.Shout("PHASE - START");

}
if (gg.Rand(100) < 50) {
myself.Shout(gg.MakeFString(1800721, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1800722, "", "", "", "", ""));

}
myself.AddTimerEx(PHASE_ANI, 4 * 1000);
myself.AddTimerEx(PHASE_READY_END, 7 * 1000);
myself.RemoveAllHateInfoIF(0, 0);
myself.i_ai1 = 1;

} else if (timer_id == PHASE_ANI) {
if (debug_mode) {
myself.Shout("PHASE - ANIMATION 반복");

}
myself.AddEffectActionDesire(myself.sm, 5, 214, 1000000);

} else if (timer_id == PHASE_READY_END) {
if (debug_mode) {
myself.Shout("PHASE - READY_END");

}
if (myself.i_ai1 == 1) {
myself.i_ai2 = gg.Rand(30) % 3 + 1;
if (myself.i_ai2 == 1) {
if (debug_mode) {
myself.Say("DBG - 가위!");

}
myself.AddUseSkillDesire(myself.sm, skill_TURKEY_GAWI, 1, 1, 10000000);

} else if (myself.i_ai2 == 2) {
if (debug_mode) {
myself.Say("DBG - 바위!");

}
myself.AddUseSkillDesire(myself.sm, skill_TURKEY_BAWI, 1, 1, 10000000);

} else if (myself.i_ai2 == 3) {
if (debug_mode) {
myself.Say("DBG - 보!");

}
myself.AddUseSkillDesire(myself.sm, skill_TURKEY_BO, 1, 1, 10000000);

}

}
myself.AddTimerEx(PHASE_READY_END2, 3 * 1000);

} else if (timer_id == PHASE_READY_END2) {
if (debug_mode) {
myself.Shout("PHASE - READY_END2");

}
if (myself.i_ai2 == 1) {
myself.Shout("나는 가위!");

} else if (myself.i_ai2 == 2) {
myself.Shout("나는 바위!");

} else if (myself.i_ai2 == 3) {
myself.Shout("나는 보!");

}
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1800723, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800724, "", "", "", "", ""));

}
myself.i_ai1 = 2;
myself.i_ai0 = 0;
gg.SendScriptEvent(myself.sm, 2008122, 0);
myself.AddTimerEx(PHASE_RESULT, 4 * 1000);

} else if (timer_id == PHASE_RESULT) {
if (debug_mode) {
myself.Shout("PHASE - RESULT");

}
if (myself.i_ai0 == 2) {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1800731, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800732, "", "", "", "", ""));

}
myself.AddUseSkillDesire(myself.sm, skill_TURKEY_DEFEAT_EFFECT, 1, 1, 10000000);
myself.AddTimerEx(PHASE_DEFEAT, 3 * 1000);

} else {
if (myself.i_ai0 == 1) {
if (gg.Rand(100) < 50) {
if (gg.Rand(100) < 30) {
myself.Say(gg.MakeFString(1800727, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 1, 217, 1000000);

} else if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1800730, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 3, 141, 1000000);

} else {
myself.Say(gg.MakeFString(1800728, "", "", "", "", ""));
myself.AddEffectActionDesire(myself.sm, 3, 141, 1000000);

}

} else {
myself.Say(gg.MakeFString(1800729, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, skill_TURKEY_MISTAKE, 1, 1, 10000000);

}

} else {
if (gg.Rand(100) < 50) {
myself.Say(gg.MakeFString(1800725, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800726, "", "", "", "", ""));

}
myself.AddEffectActionDesire(myself.sm, 1, 217, 1000000);

}
myself.i_ai1 = 0;
myself.AddTimerEx(PHASE_WAIT_1ST, 6000);

}

} else if (timer_id == PHASE_DEFEAT) {
gg.SendScriptEvent(myself.boss, 2008120, gg.GetIndexFromCreature(myself.c_ai0));
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 0, 1, 1, 1, 5 * 1000, 0, gg.MakeFString(1800752, "", "", "", "", ""));
myself.Suicide();

} else if (timer_id == PHASE_DESPAWN) {
myself.BroadcastSystemMessage(myself.sm, 8000, 2935);
gg.SendScriptEvent(myself.boss, 2008121, 0);
myself.Despawn();

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam damage, HandlerParam h0) {
if (gg.OwnItemCount(attacker, 57) == 1330) {
if (debug_mode) {
myself.Say("Direction : " + myself.GetDirection(attacker));

}

}
if (myself.i_ai1 == 1) {
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(skill_TURKEY_GAWI_CF)) > 0) {
if (debug_mode) {
myself.Say("ATTACKED - 이미 컨펌스킬이 있어서 삭제");

}
myself.Dispel(attacker, myself.Skill_GetAbnormalType(skill_TURKEY_GAWI_CF));

}
if (skill_name_id == skill_TURKEY_GAWI_PC) {
if (debug_mode) {
myself.Say("ATTACKED - 가위 confirm");

}
myself.CastBuffForQuestReward(attacker, skill_TURKEY_GAWI_CF);
if (myself.IsNullCreature(attacker) == 0) {
myself.AddHateInfo(attacker, 1, 0, 1, 0);

}

} else if (skill_name_id == skill_TURKEY_BAWI_PC) {
if (debug_mode) {
myself.Say("ATTACKED - 바위 confirm");

}
myself.CastBuffForQuestReward(attacker, skill_TURKEY_BAWI_CF);
if (myself.IsNullCreature(attacker) == 0) {
myself.AddHateInfo(attacker, 2, 0, 1, 0);

}

} else if (skill_name_id == skill_TURKEY_BO_PC) {
if (debug_mode) {
myself.Say("ATTACKED - 보 confirm");

}
myself.CastBuffForQuestReward(attacker, skill_TURKEY_BO_CF);
if (myself.IsNullCreature(attacker) == 0) {
myself.AddHateInfo(attacker, 3, 0, 1, 0);

}

} else if (debug_mode) {
myself.Say("ATTACKED - ERROR!! 스킬 확인 불가");

}

} else if (debug_mode) {
myself.Say("ATTACKED - 도전 가능 상태가 아님");

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam h0) {
if (script_event_arg1 == 2008122) {
if (myself.GetHateInfoCount() > 0) {
for (i0 = 0; i0 < myself.GetHateInfoCount(); i0 = i0 + 1) {
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (debug_mode) {
myself.Say("CALC 연산 시작. index NUM : " + i0);

}
i2 = 0;
if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_GAWI_CF)) == 1) {
if (debug_mode) {
myself.Say("CALC : PC가 가위를 냈음");

}
myself.Dispel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_GAWI_CF));
if (myself.i_ai2 == 1) {
i2 = 0;

} else if (myself.i_ai2 == 2) {
i2 = 1;

} else if (myself.i_ai2 == 3) {
i2 = -1;

} else if (debug_mode) {
myself.Say("CALC ERROR!! - myself.i_ai2 오류");

}

} else if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_BAWI_CF)) == 2) {
if (debug_mode) {
myself.Say("CALC : PC? 바위를 냈음");

}
myself.Dispel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_BAWI_CF));
if (myself.i_ai2 == 1) {
i2 = -1;

} else if (myself.i_ai2 == 2) {
i2 = 0;

} else if (myself.i_ai2 == 3) {
i2 = 1;

} else if (debug_mode) {
myself.Say("CALC ERROR!! - myself.i_ai2 오류");

}

} else if (gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_BO_CF)) == 3) {
if (debug_mode) {
myself.Say("CALC : PC가 보를 냈음");

}
myself.Dispel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_BO_CF));
if (myself.i_ai2 == 1) {
i2 = 1;

} else if (myself.i_ai2 == 2) {
i2 = -1;

} else if (myself.i_ai2 == 3) {
i2 = 0;

} else if (debug_mode) {
myself.Say("CALC ERROR!! - myself.i_ai2 오류");

}

}
if (debug_mode) {
if (gg.OwnItemCount(h0.creature, 57) == 1227) {
if (debug_mode) {
myself.Say("무조건 이기는 모드 - 1227");

}
i2 = -1;

}

}
i1 = gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(skill_TURKEY_WINNING));
if (i1 == myself.sm.param2) {
if (debug_mode) {
myself.Say("MAX 연승자이므로 승패처리 안함");

}

} else {
if (i2 == 1) {
if (debug_mode) {
myself.Say("CALC RESULT : 칠면조 승리");

}
i1 = 0;
myself.CastBuffForQuestReward(h0.creature, skill_TURKEY_DEBUFF_WINNING);
if (gg.Rand(100) < 30) {
if (debug_mode) {
myself.Say("CALC RESULT : (30%) 칠면조가 석화 캐스팅");

}
myself.CastBuffForQuestReward(h0.creature, skill_TURKEY_STONE);

}

} else if (i2 == -1) {
if (debug_mode) {
myself.Say("CALC RESULT : 칠면조 패배");

}
if (i1 <= 0) {
myself.CastBuffForQuestReward(h0.creature, skill_TURKEY_WINNING);
i1 = 1;

} else {
myself.CastBuffForQuestReward(h0.creature, skill_TURKEY_WINNING + i1);
i1 = i1 + 1;

}

} else if (i2 == 0) {
if (debug_mode) {
myself.Say("CALC RESULT : 무승부");

}

} else if (debug_mode) {
myself.Say("CALC ERROR : i2값 에러");

}
if (myself.i_ai0 < 1 && i1 >= myself.sm.param1) {
myself.i_ai0 = 1;
if (debug_mode) {
myself.Say("칠면조 위기 상태로 전환");

}

}
if (myself.i_ai0 < 2 && i1 >= myself.sm.param2) {
myself.i_ai0 = 2;
if (debug_mode) {
myself.Say("칠면조 패배 상태로 전환");

}
if (myself.IsNullHateInfo(h0) == 0) {
myself.c_ai0 = h0.creature;
if (debug_mode) {
myself.Say("패배 상태로 만든 PC 이름 : " + h0.creature.name);

}

}

}

}

}

}

}

}

}
	}

	protected void MY_DYING() {
if (debug_mode) {
myself.Say("MY_DYING : 탈출 산타 스폰");

}
myself.CreateOnePrivateEx(1013185, "ai_event_xmas_santa_escape", 0, 0, myself.start_x, myself.start_y, myself.start_z, 0, gg.GetIndexFromCreature(myself.boss), gg.GetIndexFromCreature(myself.c_ai0), 0);
	}


}