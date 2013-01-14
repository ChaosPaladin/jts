package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_terrible_heat extends default_npc {
	protected int heatattack_skill01 = 409731073;
	protected int chillbolt_skill01 = 590479361;
	protected int chillbolt_skill02 = 591659009;
	protected int damaged_skill01 = 263979009;
	protected int damaged_skill02 = 263979010;
	protected int damaged_skill03 = 263979011;
	protected int heat_skill01 = 408944641;
	protected int delay_to_attack = 10;
	protected int damaged_count = 5;
	protected int damaged_count_to_useskill01 = 2;
	protected int damaged_count_to_useskill02 = 3;
	protected int damaged_count_to_useskill03 = 4;
	protected int per_to_damaged = 5;
	protected int yell_challange01 = 1800893;
	protected int yell_hit01 = 1800894;
	protected int yell_missed01 = 1800895;
	protected int yell_died01 = 1800896;
	protected int yell_nocapacity01 = 1800897;
	protected int yell_congratz01 = 1800898;
	protected int yell_congratz02 = 1800899;
	protected int yell_noeffect01 = 1800900;
	protected int yell_timeover01 = 1800902;
	protected int range_to_yell = 0;
	protected int present_s84_01 = 13143;
	protected int present_s84_02 = 13144;
	protected int present_s84_03 = 13145;
	protected int present_s84_04 = 14105;
	protected int present_s84_05 = 14106;
	protected int present_s84_06 = 14107;
	protected int present_s84_07 = 14108;
	protected int present_s84_08 = 14109;
	protected int present_s84_09 = 14110;
	protected int present_s84_10 = 14111;
	protected int present_s84_11 = 14112;
	protected int present_s84_12 = 14113;
	protected int present_s84_13 = 14114;
	protected int present_s84_14 = 14115;
	protected int present_s84_15 = 14116;
	protected int present_s84_16 = 14117;
	protected int present_s84_17 = 13887;
	protected int present_s80_01 = 9514;
	protected int present_s80_02 = 9515;
	protected int present_s80_03 = 9516;
	protected int present_s80_04 = 9517;
	protected int present_s80_05 = 9518;
	protected int present_s80_06 = 9519;
	protected int present_s80_07 = 9520;
	protected int present_s80_08 = 9521;
	protected int present_s80_09 = 9522;
	protected int present_s80_10 = 9523;
	protected int present_s80_11 = 9524;
	protected int present_s80_12 = 9525;
	protected int present_s80_13 = 9526;
	protected int present_s80_14 = 9527;
	protected int present_s80_15 = 9528;
	protected int present_s80_16 = 9529;
	protected int present_s80_17 = 13886;
	protected int present_norm_01 = 2134;
	protected int present_norm_02 = 2133;
	protected int present_norm_03 = 14701;
	protected int present_norm_04 = 14700;
	protected int roll_base = 100000000;
	protected int roll_norm_01 = 8683666;
	protected int roll_norm_02 = 24121300;
	protected int roll_norm_03 = 31013090;
	protected int roll_norm_04 = 36181940;
	protected int roll_lucky_base = 10000;
	protected int roll_lucky_S84 = 160;
	protected int roll_lucky_S80 = 428;
	protected int TID_TO_ATTACK = 78001;
	protected int TID_TO_DESPAWN = 78002;
	protected int time_to_despawn = 600;
	protected int babble_mode = 0;

	protected void CREATED() {
if (myself.IsNullCreature(gg.GetCreatureFromID(myself.sm.param1)) == 0) {
myself.c_ai0 = gg.GetCreatureFromID(myself.sm.param1);
myself.Dispel(myself.c_ai0, myself.Skill_GetAbnormalType(heat_skill01));
myself.Say(gg.MakeFString(yell_challange01, myself.c_ai0.name, "", "", "", ""));
if (babble_mode == 1) {
myself.Say("OK:" + myself.c_ai0.name);

}

} else if (babble_mode == 1) {
myself.Say("Nay:" + myself.sm.param1);

}
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.AddTimerEx(TID_TO_ATTACK, delay_to_attack * 1000);
myself.AddTimerEx(TID_TO_DESPAWN, time_to_despawn * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_TO_ATTACK) {
myself.AddUseSkillDesire(myself.sm, heatattack_skill01, 1, 1, 1000000);
myself.AddTimerEx(TID_TO_ATTACK, delay_to_attack * 1000);

} else if (timer_id == TID_TO_DESPAWN) {
myself.Say(gg.MakeFString(yell_timeover01, "", "", "", "", ""));
myself.Despawn();

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1) {
if (skill_name_id == chillbolt_skill01 || skill_name_id == chillbolt_skill02 && myself.IsNullCreature(attacker) == 0) {
if (babble_mode == 1) {
myself.Say("맞았음");

}
if (attacker == myself.c_ai0) {
if (myself.i_ai1 == 1) {
myself.GiveItem1(myself.c_ai0, present_s84_01, 1);
myself.BroadcastSystemMessageStr(myself.sm, range_to_yell, gg.MakeFString(yell_congratz01, myself.c_ai0.name, "", "", "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, range_to_yell, 5, 0, 1, 3, 1, 1, 5000, 0, gg.MakeFString(yell_congratz01, myself.c_ai0.name, "", "", "", ""));
myself.Despawn();

} else if (myself.i_ai1 == 2) {
myself.GiveItem1(myself.c_ai0, present_s80_01, 1);
myself.BroadcastSystemMessageStr(myself.sm, range_to_yell, gg.MakeFString(yell_congratz02, myself.c_ai0.name, "", "", "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, range_to_yell, 5, 0, 1, 3, 1, 1, 5000, 0, gg.MakeFString(yell_congratz02, myself.c_ai0.name, "", "", "", ""));
myself.Despawn();

} else if (skill_name_id == chillbolt_skill02) {
myself.Say(gg.MakeFString(yell_hit01, "", "", "", "", ""));
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.GetInventoryInfo(myself.c_ai0, 1) - myself.GetInventoryInfo(myself.c_ai0, 0) >= 1 && myself.GetInventoryInfo(myself.c_ai0, 2) < myself.GetInventoryInfo(myself.c_ai0, 3) * 0.800000) {
i0 = gg.Rand(roll_lucky_base) + 1;
i1 = roll_lucky_S84 * 17;
if (babble_mode == 1) {
myself.Say("아이템 지급 확률:" + gg.IntToStr(i0));

}
if (i0 <= i1) {
myself.BroadcastSystemMessageStr(myself.sm, range_to_yell, gg.MakeFString(yell_congratz01, myself.c_ai0.name, "", "", "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, range_to_yell, 5, 0, 1, 3, 1, 1, 5000, 0, gg.MakeFString(yell_congratz01, myself.c_ai0.name, "", "", "", ""));

} else {
myself.BroadcastSystemMessageStr(myself.sm, range_to_yell, gg.MakeFString(yell_congratz02, myself.c_ai0.name, "", "", "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, range_to_yell, 5, 0, 1, 3, 1, 1, 5000, 0, gg.MakeFString(yell_congratz02, myself.c_ai0.name, "", "", "", ""));

}
if (i0 <= roll_lucky_S84) {
myself.GiveItem1(myself.c_ai0, present_s84_01, 1);

} else if (i0 > roll_lucky_S84 && i0 <= roll_lucky_S84 * 2) {
myself.GiveItem1(myself.c_ai0, present_s84_02, 1);

} else if (i0 > roll_lucky_S84 * 2 && i0 <= roll_lucky_S84 * 3) {
myself.GiveItem1(myself.c_ai0, present_s84_03, 1);

} else if (i0 > roll_lucky_S84 * 3 && i0 <= roll_lucky_S84 * 4) {
myself.GiveItem1(myself.c_ai0, present_s84_04, 1);

} else if (i0 > roll_lucky_S84 * 4 && i0 <= roll_lucky_S84 * 5) {
myself.GiveItem1(myself.c_ai0, present_s84_05, 1);

} else if (i0 > roll_lucky_S84 * 5 && i0 <= roll_lucky_S84 * 6) {
myself.GiveItem1(myself.c_ai0, present_s84_06, 1);

} else if (i0 > roll_lucky_S84 * 6 && i0 <= roll_lucky_S84 * 7) {
myself.GiveItem1(myself.c_ai0, present_s84_07, 1);

} else if (i0 > roll_lucky_S84 * 7 && i0 <= roll_lucky_S84 * 8) {
myself.GiveItem1(myself.c_ai0, present_s84_08, 1);

} else if (i0 > roll_lucky_S84 * 8 && i0 <= roll_lucky_S84 * 9) {
myself.GiveItem1(myself.c_ai0, present_s84_09, 1);

} else if (i0 > roll_lucky_S84 * 9 && i0 <= roll_lucky_S84 * 10) {
myself.GiveItem1(myself.c_ai0, present_s84_10, 1);

} else if (i0 > roll_lucky_S84 * 10 && i0 <= roll_lucky_S84 * 11) {
myself.GiveItem1(myself.c_ai0, present_s84_11, 1);

} else if (i0 > roll_lucky_S84 * 11 && i0 <= roll_lucky_S84 * 12) {
myself.GiveItem1(myself.c_ai0, present_s84_12, 1);

} else if (i0 > roll_lucky_S84 * 12 && i0 <= roll_lucky_S84 * 13) {
myself.GiveItem1(myself.c_ai0, present_s84_13, 1);

} else if (i0 > roll_lucky_S84 * 13 && i0 <= roll_lucky_S84 * 14) {
myself.GiveItem1(myself.c_ai0, present_s84_14, 1);

} else if (i0 > roll_lucky_S84 * 14 && i0 <= roll_lucky_S84 * 15) {
myself.GiveItem1(myself.c_ai0, present_s84_15, 1);

} else if (i0 > roll_lucky_S84 * 15 && i0 <= roll_lucky_S84 * 16) {
myself.GiveItem1(myself.c_ai0, present_s84_16, 1);

} else if (i0 > roll_lucky_S84 * 16 && i0 <= i1) {
myself.GiveItem1(myself.c_ai0, present_s84_17, 1);

} else if (i0 > i1 && i0 <= i1 + roll_lucky_S80) {
myself.GiveItem1(myself.c_ai0, present_s80_01, 1);

} else if (i0 > i1 + roll_lucky_S80 && i0 <= i1 + roll_lucky_S80 * 2) {
myself.GiveItem1(myself.c_ai0, present_s80_02, 1);

} else if (i0 > i1 + roll_lucky_S80 * 2 && i0 <= i1 + roll_lucky_S80 * 3) {
myself.GiveItem1(myself.c_ai0, present_s80_03, 1);

} else if (i0 > i1 + roll_lucky_S80 * 3 && i0 <= i1 + roll_lucky_S80 * 4) {
myself.GiveItem1(myself.c_ai0, present_s80_04, 1);

} else if (i0 > i1 + roll_lucky_S80 * 4 && i0 <= i1 + roll_lucky_S80 * 5) {
myself.GiveItem1(myself.c_ai0, present_s80_05, 1);

} else if (i0 > i1 + roll_lucky_S80 * 5 && i0 <= i1 + roll_lucky_S80 * 6) {
myself.GiveItem1(myself.c_ai0, present_s80_06, 1);

} else if (i0 > i1 + roll_lucky_S80 * 6 && i0 <= i1 + roll_lucky_S80 * 7) {
myself.GiveItem1(myself.c_ai0, present_s80_07, 1);

} else if (i0 > i1 + roll_lucky_S80 * 7 && i0 <= i1 + roll_lucky_S80 * 8) {
myself.GiveItem1(myself.c_ai0, present_s80_08, 1);

} else if (i0 > i1 + roll_lucky_S80 * 8 && i0 <= i1 + roll_lucky_S80 * 9) {
myself.GiveItem1(myself.c_ai0, present_s80_09, 1);

} else if (i0 > i1 + roll_lucky_S80 * 9 && i0 <= i1 + roll_lucky_S80 * 10) {
myself.GiveItem1(myself.c_ai0, present_s80_10, 1);

} else if (i0 > i1 + roll_lucky_S80 * 10 && i0 <= i1 + roll_lucky_S80 * 11) {
myself.GiveItem1(myself.c_ai0, present_s80_11, 1);

} else if (i0 > i1 + roll_lucky_S80 * 11 && i0 <= i1 + roll_lucky_S80 * 12) {
myself.GiveItem1(myself.c_ai0, present_s80_12, 1);

} else if (i0 > i1 + roll_lucky_S80 * 12 && i0 <= i1 + roll_lucky_S80 * 13) {
myself.GiveItem1(myself.c_ai0, present_s80_13, 1);

} else if (i0 > i1 + roll_lucky_S80 * 13 && i0 <= i1 + roll_lucky_S80 * 14 + 1) {
myself.GiveItem1(myself.c_ai0, present_s80_14, 1);

} else if (i0 > i1 + roll_lucky_S80 * 14 + 1 && i0 <= i1 + roll_lucky_S80 * 15 + 2) {
myself.GiveItem1(myself.c_ai0, present_s80_15, 1);

} else if (i0 > i1 + roll_lucky_S80 * 15 + 2 && i0 <= i1 + roll_lucky_S80 * 16 + 3) {
myself.GiveItem1(myself.c_ai0, present_s80_16, 1);

} else {
myself.GiveItem1(myself.c_ai0, present_s80_17, 1);

}
myself.Say(gg.MakeFString(yell_died01, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(yell_nocapacity01, "", "", "", "", ""));

}

}
myself.Despawn();

} else if (gg.Rand(10) + 1 <= per_to_damaged) {
myself.Say(gg.MakeFString(yell_hit01, "", "", "", "", ""));
myself.i_ai0 = myself.i_ai0 + 1;
if (babble_mode == 1) {
myself.Say("카운터 증가:" + gg.IntToStr(myself.i_ai0));

}
if (myself.i_ai0 >= damaged_count) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
i0 = gg.Rand(roll_base) + 1;
if (myself.GetInventoryInfo(myself.c_ai0, 1) - myself.GetInventoryInfo(myself.c_ai0, 0) >= 1 && myself.GetInventoryInfo(myself.c_ai0, 2) < myself.GetInventoryInfo(myself.c_ai0, 3) * 0.800000) {
if (i0 <= roll_norm_01) {
myself.GiveItem1(myself.c_ai0, present_norm_01, 1);

} else if (i0 <= roll_norm_02) {
myself.GiveItem1(myself.c_ai0, present_norm_02, 1);

} else if (i0 <= roll_norm_03) {
myself.GiveItem1(myself.c_ai0, present_norm_03, 2);

} else {
myself.GiveItem1(myself.c_ai0, present_norm_04, 2);

}

} else {
myself.Shout(gg.MakeFString(yell_nocapacity01, "", "", "", "", ""));

}

}
myself.Despawn();

} else if (myself.i_ai0 == damaged_count_to_useskill03) {
if (babble_mode == 1) {
myself.Say("피격 스킬 3단계");

}
myself.AddUseSkillDesire(myself.sm, damaged_skill03, 1, 1, 1000000);

} else if (myself.i_ai0 == damaged_count_to_useskill02) {
if (babble_mode == 1) {
myself.Say("피격 스킬 2단계");

}
myself.AddUseSkillDesire(myself.sm, damaged_skill02, 1, 1, 1000000);

} else if (myself.i_ai0 == damaged_count_to_useskill01) {
if (babble_mode == 1) {
myself.Say("피격 스킬 1단계");

}
myself.AddUseSkillDesire(myself.sm, damaged_skill01, 1, 1, 1000000);

}

} else {
myself.Say(gg.MakeFString(yell_missed01, "", "", "", "", ""));

}

} else {
myself.Say(gg.MakeFString(yell_noeffect01, "", "", "", "", ""));

}

}
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 1) {
myself.Whisper(creature, "debug_set:" + gg.IntToStr(reply) + "(present_s84_01 100% 지급)");
myself.i_ai1 = reply;

} else if (reply == 2) {
myself.Whisper(creature, "debug_set:" + gg.IntToStr(reply) + "(present_s80_01 100% 지급)");
myself.i_ai1 = reply;

} else {
myself.Whisper(creature, "debug_set: 0 (초기화)");
myself.i_ai1 = 0;

}
	}


}