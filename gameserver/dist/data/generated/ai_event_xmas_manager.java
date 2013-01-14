package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_xmas_manager extends default_npc {
	protected int GM_ID = -1;
	protected int turkey_x = 0;
	protected int turkey_y = 0;
	protected int turkey_z = 0;
	protected int sled_move_x = 0;
	protected int sled_move_y = 0;
	protected int sled_dir = 0;
	protected int event_stop = 0;
	protected int event_fighting = 1;
	protected int event_gift = 2;
	protected int debug_mode = 0;
	protected int item_XMAS_HAT = 14613;
	protected int item_XMAS_SOCKS = 14612;
	protected int item_COST_XMAS_SOCKS = 2000;
	protected int item_XMAS_GIFT_WINNER = 14616;
	protected int item_XMAS_GIFT_NORMAL = 14619;
	protected int item_XMAS_GIFT_JACKPOT = 14620;
	protected int skill_DOMINION_REG = 458752001;
	protected int skill_XMAS_FESTIVAL = 400162817;
	protected int skill_XMAS_5WIN = 399966213;
	protected int skill_DOMINION_GLUDIO = 400228353;
	protected int skill_DOMINION_DION = 400293889;
	protected int skill_DOMINION_GIRAN = 400359425;
	protected int skill_DOMINION_OREN = 400424961;
	protected int skill_DOMINION_ADEN = 400490497;
	protected int skill_DOMINION_HEINESS = 400556033;
	protected int skill_DOMINION_GODARD = 400621569;
	protected int skill_DOMINION_RUNE = 400687105;
	protected int skill_DOMINION_SCHTGART = 400752641;
	protected int is_main_manager = 0;
	protected String fnHi = "cat_of_xmas001.htm";

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (debug_mode) {
if (gg.OwnItemCount(attacker, 57) == 1330) {
if (debug_mode) {
myself.Say("Direction : " + myself.GetDirection(attacker));

}

}
if (gg.OwnItemCount(attacker, 57) == 1225) {
if (debug_mode) {
myself.Say("강제시작!");

}
myself.AddTimerEx(1226, 100);

}
if (gg.OwnItemCount(attacker, 57) == 1226) {
if (debug_mode) {
myself.Say("강제산타소환!");

}
if (myself.IsNullCreature(attacker) == 0) {
i0 = attacker.instant_zone_id;
if (debug_mode) {
myself.Say("Target의 인존 ID는 : " + i0);

}
if (attacker.instant_zone_id == 0) {
myself.CreateOnePrivateEx(1013184, "ai_event_xmas_giver_santa", 0, 0, gg.FloatToInt(attacker.x - 50 + gg.Rand(100)), gg.FloatToInt(attacker.y - 50 + gg.Rand(100)), gg.FloatToInt(attacker.z + 10), myself.GetDirectionToTarget(attacker) * 182, gg.GetIndexFromCreature(attacker), 0, 0);

}

}

}
if (gg.OwnItemCount(attacker, 57) == 1228) {
if (debug_mode) {
myself.Say("강제탈출산타소환!");

}
if (myself.IsNullCreature(attacker) == 0) {
myself.CreateOnePrivateEx(1013185, "ai_event_xmas_santa_escape", 0, 0, turkey_x, turkey_y, turkey_z, 0, gg.GetIndexFromCreature(myself.sm), gg.GetIndexFromCreature(attacker), 0);

}

}

}
	}

	protected void CREATED(HandlerParam i0, HandlerParam i2) {
myself.c_ai0 = gg.GetNullCreature();
if (is_main_manager) {
myself.EventManagerEnter();

}
i2 = skill_DOMINION_REG / 256 * 256;
myself.RegisterGlobalMap(GM_ID, event_stop);
gg.SetXMasEventState(i2, 0);
myself.i_ai3 = 4;
myself.AddTimerEx(1225, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
if (timer_id == 1225) {
if (debug_mode) {
myself.Say("time routine : GlobalMap : " + myself.GetGlobalMap(GM_ID));

}
myself.AddTimerEx(1225, 60000);
if (myself.i_ai3 > 0 && gg.GetDateTime(0, 3) % myself.i_ai3 != 0) {
return;

}
if (gg.GetDateTime(0, 4) != 0) {
return;

}
if (myself.GetGlobalMap(GM_ID) == event_gift || myself.GetGlobalMap(GM_ID) == event_stop) {
myself.RegisterGlobalMap(GM_ID, event_stop);
myself.AddTimerEx(1226, 1000);

} else if (myself.GetGlobalMap(GM_ID) == event_fighting) {
if (debug_mode) {
myself.Say("time routine : ERR. 이벤트 time이 되었으나 칠면조 전투중");

}

} else if (debug_mode) {
myself.Say("time routine : ERR. 알수 없는 Globalmap 수치");

}

} else if (timer_id == 1226) {
if (myself.GetGlobalMap(GM_ID) == event_stop) {
myself.RegisterGlobalMap(GM_ID, event_fighting);
myself.c_ai0 = gg.GetNullCreature();
i0 = 4;
i1 = 5;
if (debug_mode) {
i0 = 2;
i1 = 3;

}
myself.CreateOnePrivateEx(1013183, "ai_event_xmas_turkey", 0, 0, turkey_x, turkey_y, turkey_z, 0, i0, i1, GM_ID);
i2 = skill_DOMINION_REG / 256 * 256;
gg.SetXMasEventState(i2, 0);

} else if (debug_mode) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0 && debug_mode == 1 && gg.OwnItemCount(c0, 57) == 1225) {
myself.RegisterGlobalMap(GM_ID, event_stop);
myself.AddTimerEx(1226, 100);

} else {
myself.Say("ERR! 칠면조 스폰 중복 호출 - event_stop 상태가 아닐 때 호출");

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0, HandlerParam i2, HandlerParam s0) {
if (script_event_arg1 == 2008120) {
if (debug_mode) {
myself.Say("칠면조가 죽었다");

}
myself.c_ai0 = gg.GetCreatureFromIndex(script_event_arg2);
if (skill_DOMINION_REG == skill_DOMINION_GLUDIO) {
s0 = "글루디오";

} else if (skill_DOMINION_REG == skill_DOMINION_DION) {
s0 = "디온";

} else if (skill_DOMINION_REG == skill_DOMINION_GIRAN) {
s0 = "기란";

} else if (skill_DOMINION_REG == skill_DOMINION_OREN) {
s0 = "오렌";

} else if (skill_DOMINION_REG == skill_DOMINION_ADEN) {
s0 = "아덴";

} else if (skill_DOMINION_REG == skill_DOMINION_HEINESS) {
s0 = "인나드릴";

} else if (skill_DOMINION_REG == skill_DOMINION_GODARD) {
s0 = "고다드";

} else if (skill_DOMINION_REG == skill_DOMINION_RUNE) {
s0 = "루운";

} else if (skill_DOMINION_REG == skill_DOMINION_SCHTGART) {
s0 = "슈트가르트";

}
myself.BroadcastSystemMessageStr(myself.sm, 0, gg.MakeFString(1800751, myself.c_ai0.name, s0, "", "", ""));
i2 = skill_DOMINION_REG / 256 * 256;
gg.SetXMasEventState(i2, 1);
myself.RegisterGlobalMap(GM_ID, event_gift);

} else if (script_event_arg1 == 2008121) {
if (debug_mode) {
myself.Say("칠면조 자동 디스폰");

}
myself.RegisterGlobalMap(GM_ID, event_stop);

} else if (script_event_arg1 == 2008124) {
if (myself.IsNullCreature(gg.GetCreatureFromIndex(script_event_arg2)) == 0) {
myself.CreateOnePrivateEx(1013186, "ai_event_xmas_sled", 0, 0, turkey_x, turkey_y, turkey_z, sled_dir, sled_move_x, sled_move_y, script_event_arg2);

} else {
myself.CreateOnePrivateEx(1013186, "ai_event_xmas_sled", 0, 0, turkey_x, turkey_y, turkey_z, sled_dir, sled_move_x, sled_move_y, 0);

}

}
	}

	protected void CREATE_NPC_TO_WINNER(HandlerParam target, HandlerParam i0) {
if (debug_mode) {
gg.Announce("CREATE_NPC_TO_WINNER");

}
if (myself.IsNullCreature(target) == 0) {
i0 = target.instant_zone_id;
if (debug_mode) {
myself.Say("Target의 인존 ID는 : " + i0);

}
if (target.instant_zone_id == 0) {
myself.CreateOnePrivateEx(1013184, "ai_event_xmas_giver_santa", 0, 0, gg.FloatToInt(target.x - 50 + gg.Rand(100)), gg.FloatToInt(target.y - 50 + gg.Rand(100)), gg.FloatToInt(target.z + 10), myself.GetDirectionToTarget(target) * 182, gg.GetIndexFromCreature(target), 0, 0);

}

}
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0) {
if (debug_mode) {
myself.Say("TALKED");

}
myself.ShowPage(talker, fnHi);
super;
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam s0) {
i0 = myself.GetGlobalMap(GM_ID);
if (ask == -1225) {
if (debug_mode) {
myself.Say("ASK 확인, reply는 : " + reply);

}
switch (reply) {
case 1: {
if (gg.OwnItemCount(talker, item_XMAS_HAT) > 0) {
myself.ShowPage(talker, "cat_of_xmas082.htm");

} else {
myself.GiveItem1(talker, item_XMAS_HAT, 1);
myself.ShowPage(talker, "cat_of_xmas081.htm");

}
break;

}
case 2: {
if (gg.OwnItemCount(talker, 57) >= item_COST_XMAS_SOCKS) {
if (gg.OwnItemCount(talker, item_XMAS_SOCKS) > 0) {

} else {
myself.GiveItem1(talker, item_XMAS_SOCKS, 1);

}
myself.Dispel(talker, myself.Skill_GetAbnormalType(skill_DOMINION_REG));
myself.CastBuffForQuestReward(talker, skill_DOMINION_REG);
myself.DeleteItem1(talker, 57, item_COST_XMAS_SOCKS);
myself.ShowPage(talker, "cat_of_xmas071.htm");

} else {
myself.ShowPage(talker, "cat_of_xmas072.htm");

}
break;

}
case 3: {
if (debug_mode) {
i3 = 3;

} else {
i3 = 5;

}
if (gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(skill_XMAS_5WIN)) >= i3) {
myself.GiveItem1(talker, item_XMAS_GIFT_WINNER, 5);
myself.Dispel(talker, myself.Skill_GetAbnormalType(skill_XMAS_5WIN));
myself.ShowPage(talker, "cat_of_xmas050.htm");

} else {
myself.ShowPage(talker, "cat_of_xmas051.htm");

}
break;

}
case 4: {
if (gg.OwnItemCount(talker, item_XMAS_GIFT_NORMAL) > 0) {
myself.ShowPage(talker, "cat_of_xmas062.htm");

} else if (gg.OwnItemCount(talker, item_XMAS_GIFT_JACKPOT) > 0) {
myself.ShowPage(talker, "cat_of_xmas061.htm");

} else {
myself.ShowPage(talker, "cat_of_xmas063.htm");

}
break;

}
case 5: {
if (i0 == event_gift) {
if (debug_mode) {
myself.Say("산타가 풀려나 있는 상태. 버프를 준다.");

}
if (gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(skill_XMAS_FESTIVAL)) > 0) {
myself.ShowPage(talker, "cat_of_xmas042.htm");

} else {
myself.CastBuffForQuestReward(talker, skill_XMAS_FESTIVAL);
myself.ShowPage(talker, "cat_of_xmas040.htm");

}

} else {
if (debug_mode) {
myself.Say("산타가 잡혀있는 상태.");

}
myself.ShowPage(talker, "cat_of_xmas041.htm");

}
break;

}
case 101: {
i1 = 14621;
break;

}
case 102: {
i1 = 14622;
break;

}
case 103: {
i1 = 14625;
break;

}
case 104: {
i1 = 14623;
break;

}
case 105: {
i1 = 14624;
break;

}
case 106: {
i1 = 14630;
break;

}
case 107: {
i1 = 14631;
break;

}
case 108: {
i1 = 14628;
break;

}
case 109: {
i1 = 14627;
break;

}
case 110: {
i1 = 14626;
break;

}
case 111: {
i1 = 14674;
break;

}
case 112: {
i1 = 14632;
break;

}
case 113: {
i1 = 14634;
break;

}
case 114: {
i1 = 14633;
break;

}
case 511: {
i1 = 2500;
s0 = "다크 레기온";
break;

}
case 512: {
i1 = 81;
s0 = "드래곤 슬레이어";
break;

}
case 513: {
i1 = 236;
s0 = "소울세퍼레이터";
break;

}
case 514: {
i1 = 164;
s0 = "엘리시온";
break;

}
case 515: {
i1 = 7902;
s0 = "둠 크러셔";
break;

}
case 516: {
i1 = 7895;
s0 = "드래곤 플레임 헤드";
break;

}
case 517: {
i1 = 213;
s0 = "세계수의 가지";
break;

}
case 518: {
i1 = 270;
s0 = "드래곤 그라인더";
break;

}
case 519: {
i1 = 289;
s0 = "영혼의 활";
break;

}
case 520: {
i1 = 305;
s0 = "탈룸 글레이브";
break;

}
case 521: {
i1 = 5706;
s0 = "다마스커스*다마스커스";
break;

}
case 522: {
i1 = 9340;
s0 = "그리드 스팅거";
break;

}
case 523: {
i1 = 9344;
s0 = "데스브링거";
break;

}
case 524: {
i1 = 9348;
s0 = "소울 슈터";
break;

}

}
if (reply >= 101 && reply <= 114) {
myself.GiveItem1(talker, i1, 1);
myself.DeleteItem1(talker, item_XMAS_GIFT_NORMAL, 1);
myself.ShowPage(talker, "cat_of_xmas064.htm");

}
if (reply >= 511 && reply <= 524) {
i2 = 10 + gg.Rand(6);
myself.GiveItemEx(talker, i1, i2, 1);
myself.DeleteItem1(talker, item_XMAS_GIFT_JACKPOT, 1);
myself.BroadcastSystemMessageStr(myself.sm, 0, gg.MakeFString(1800753, talker.name, gg.IntToStr(i2), s0, "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 2, 0, 1, 1, 1, 1, 5 * 1000, 0, gg.MakeFString(1800753, talker.name, gg.IntToStr(i2), s0, "", ""));
myself.ShowPage(talker, "cat_of_xmas065.htm");

}

}
	}


}