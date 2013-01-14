package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_basic extends warrior_use_skill {
	protected int SKILL_feed_item = 593035265;
	protected int SKILL_feed_adena = 593100801;
	protected int SKILL_feed_item_s = 593297409;
	protected int SKILL_feed_adena_s = 593362945;
	protected int SKILL_feed_item_bress = 593166337;
	protected int SKILL_feed_adena_bress = 593231873;
	protected int PROB_gold_beast = 10;
	protected int PROB_beast_s = 8000;
	protected int PROB_beast_bress = 8000;
	protected int PROB_direct_pet = 100;
	protected int PROB_direct_4th = 100;
	protected int TIMER_despawn = 2115003;
	protected int TIMER_itsme = 2115008;
	protected String MAKER_tamed_beast = "rune06_npc2115_05m1";
	protected int my_grade = 1;
	protected int my_type = -1;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0) {
super;
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai6 = 0;
myself.i_ai8 = 0;
i0 = gg.Rand(250) + 50;
myself.AddTimerEx(TIMER_itsme, i0 * 1000);
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam i0, HandlerParam maker0) {
if (reply == 1) {
if (debug_mode) {
myself.Say("1 : 금빛펫으로 진화");
switch (my_type) {
case 1: {
i0 = 1018901;
break;

}
case 2: {
i0 = 1018902;
break;

}
case 3: {
i0 = 1018903;
break;

}
case 4: {
i0 = 1018904;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast_ev", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 0, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 11) {
myself.Say("11 : 금빛펫 진화확률 1/10로 증가");
myself.i_ai8 = 1;

} else if (reply == 21) {
if (debug_mode) {
myself.Say("21 : 2i형으로 바로 진화");
switch (my_type) {
case 1: {
i0 = 1018874;
break;

}
case 2: {
i0 = 1018881;
break;

}
case 3: {
i0 = 1018888;
break;

}
case 4: {
i0 = 1018895;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 22) {
if (debug_mode) {
myself.Say("22 : 2a형으로 바로 진화");
switch (my_type) {
case 1: {
i0 = 1018875;
break;

}
case 2: {
i0 = 1018882;
break;

}
case 3: {
i0 = 1018889;
break;

}
case 4: {
i0 = 1018896;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 2, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 31) {
if (debug_mode) {
myself.Say("31 : 3i형으로 바로 진화");
switch (my_type) {
case 1: {
i0 = 1018876;
break;

}
case 2: {
i0 = 1018883;
break;

}
case 3: {
i0 = 1018890;
break;

}
case 4: {
i0 = 1018897;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 32) {
if (debug_mode) {
myself.Say("32 : 3a형으로 바로 진화");
switch (my_type) {
case 1: {
i0 = 1018877;
break;

}
case 2: {
i0 = 1018884;
break;

}
case 3: {
i0 = 1018891;
break;

}
case 4: {
i0 = 1018898;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 2, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 41) {
if (debug_mode) {
myself.Say("41 : 4i형으로 바로 진화");
switch (my_type) {
case 1: {
i0 = 1018878;
break;

}
case 2: {
i0 = 1018885;
break;

}
case 3: {
i0 = 1018892;
break;

}
case 4: {
i0 = 1018899;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 42) {
if (debug_mode) {
myself.Say("42 : 4a형으로 바로 진화");
switch (my_type) {
case 1: {
i0 = 1018879;
break;

}
case 2: {
i0 = 1018886;
break;

}
case 3: {
i0 = 1018893;
break;

}
case 4: {
i0 = 1018900;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(creature), 2, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (reply == 51) {
if (debug_mode) {
myself.Say("51 : i형 펫몬스터로 바로 진화");
maker0 = gg.GetNpcMaker(MAKER_tamed_beast);
if (gg.IsNull(maker0) == 0) {
switch (my_type) {
case 1: {
i0 = 11;
break;

}
case 2: {
i0 = 21;
break;

}
case 3: {
i0 = 31;
break;

}
case 4: {
i0 = 41;
break;

}

}
gg.SendMakerScriptEvent(maker0, 21150002, gg.GetIndexFromCreature(creature), i0);
myself.AddTimerEx(TIMER_despawn, 500);

}

}

} else if (reply == 52) {
if (debug_mode) {
myself.Say("52 : a형 펫몬스터로 바로 진화");
maker0 = gg.GetNpcMaker(MAKER_tamed_beast);
if (gg.IsNull(maker0) == 0) {
switch (my_type) {
case 1: {
i0 = 12;
break;

}
case 2: {
i0 = 22;
break;

}
case 3: {
i0 = 32;
break;

}
case 4: {
i0 = 42;
break;

}

}
gg.SendMakerScriptEvent(maker0, 21150002, gg.GetIndexFromCreature(creature), i0);
myself.AddTimerEx(TIMER_despawn, 500);

}

}

} else if (reply == 6) {
if (debug_mode) {
myself.Say("6 : 주변 맹수 호출");
myself.BroadcastScriptEvent(21150004, gg.GetIndexFromCreature(myself.sm), 1000);

}

} else if (debug_mode) {
myself.Say("잘못된 debug_ai 입력");
myself.Say("1 : 금빛펫으로 진화");
myself.Say("21 : 2i형으로 바로 진화");
myself.Say("22 : 2a형으로 바로 진화");
myself.Say("31 : 3i형으로 바로 진화");
myself.Say("32 : 3a형으로 바로 진화");
myself.Say("41 : 4i형으로 바로 진화");
myself.Say("42 : 4a형으로 바로 진화");
myself.Say("51 : i형 펫몬스터로 바로 진화");
myself.Say("52 : a형 펫몬스터로 바로 진화");
myself.Say("6 : 주변 맹수 호출");

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam maker0) {
if (skill_name_id == SKILL_feed_item || skill_name_id == SKILL_feed_adena || skill_name_id == SKILL_feed_item_s || skill_name_id == SKILL_feed_adena_s || skill_name_id == SKILL_feed_item_bress || skill_name_id == SKILL_feed_adena_bress) {
if (debug_mode) {
myself.Say("사료를 받았다.");

}
if (myself.IsNullCreature(myself.c_ai0) == 1) {
if (myself.IsNullCreature(attacker) == 0 && attacker.is_pc == 1) {
myself.c_ai0 = attacker;

}
if (gg.Rand(10000) < PROB_gold_beast) {
if (debug_mode) {
myself.Say("금빛 맹수로 진화!");

}
switch (my_type) {
case 1: {
i0 = 1018901;
break;

}
case 2: {
i0 = 1018902;
break;

}
case 3: {
i0 = 1018903;
break;

}
case 4: {
i0 = 1018904;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast_ev", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(myself.c_ai0), 0, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else if (myself.i_ai8 == 1 && gg.Rand(10000) < 1000) {
if (debug_mode) {
myself.Say("테스트?위해 금빛 맹수 진화확률 상승");

}
if (debug_mode) {
myself.Say("금빛 맹수로 진화!");

}
switch (my_type) {
case 1: {
i0 = 1018901;
break;

}
case 2: {
i0 = 1018902;
break;

}
case 3: {
i0 = 1018903;
break;

}
case 4: {
i0 = 1018904;
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast_ev", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(myself.c_ai0), 0, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else if (skill_name_id == SKILL_feed_item_s || skill_name_id == SKILL_feed_adena_s) {
if (gg.Rand(10000) < PROB_beast_s) {
if (debug_mode) {
myself.Say("S그레이드 사료 성공! 4단계 몬스터로 진화");

}
if (skill_name_id == SKILL_feed_item_s) {
if (debug_mode) {
myself.Say("아이템형");

}
switch (my_type) {
case 1: {
i0 = 1018878;
break;

}
case 2: {
i0 = 1018885;
break;

}
case 3: {
i0 = 1018892;
break;

}
case 4: {
i0 = 1018899;
break;

}

}
i1 = 1;

} else if (skill_name_id == SKILL_feed_adena_s) {
if (debug_mode) {
myself.Say("아데나형");

}
switch (my_type) {
case 1: {
i0 = 1018879;
break;

}
case 2: {
i0 = 1018886;
break;

}
case 3: {
i0 = 1018893;
break;

}
case 4: {
i0 = 1018900;
break;

}

}
i1 = 2;

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(myself.c_ai0), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else {
if (debug_mode) {
myself.Say("S그레이드 사료를 먹였으나 진화 실패. PC를 공격");

}
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801093, "", "", "", "", ""));
myself.AddAttackDesire(attacker, 1, 10000);
myself.c_ai0 = gg.GetNullCreature();

}

} else if (skill_name_id == SKILL_feed_item_bress || skill_name_id == SKILL_feed_adena_bress) {
if (gg.Rand(10000) < PROB_beast_bress) {
maker0 = gg.GetNpcMaker(MAKER_tamed_beast);
if (gg.IsNull(maker0) == 0) {
switch (my_type) {
case 1: {
if (skill_name_id == SKILL_feed_item_bress) {
i0 = 11;

} else if (skill_name_id == SKILL_feed_adena_bress) {
i0 = 12;

}
break;

}
case 2: {
if (skill_name_id == SKILL_feed_item_bress) {
i0 = 21;

} else if (skill_name_id == SKILL_feed_adena_bress) {
i0 = 22;

}
break;

}
case 3: {
if (skill_name_id == SKILL_feed_item_bress) {
i0 = 31;

} else if (skill_name_id == SKILL_feed_adena_bress) {
i0 = 32;

}
break;

}
case 4: {
if (skill_name_id == SKILL_feed_item_bress) {
i0 = 41;

} else if (skill_name_id == SKILL_feed_adena_bress) {
i0 = 42;

}
break;

}

}
gg.SendMakerScriptEvent(maker0, 21150002, gg.GetIndexFromCreature(attacker), i0);
myself.AddTimerEx(TIMER_despawn, 500);

} else if (debug_mode) {
myself.Say("ERR : maker0 is null");

}

} else {
if (debug_mode) {
myself.Say("축복받은 사료를 먹였으나 진화 실패. PC를 공격");

}
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801093, "", "", "", "", ""));
myself.AddAttackDesire(attacker, 1, 10000);
myself.c_ai0 = gg.GetNullCreature();

}

} else if (gg.Rand(10000) < PROB_direct_pet) {
if (debug_mode) {
myself.Say("다이렉트로 펫몬스터로 진화");

}
switch (my_type) {
case 1: {
if (skill_name_id == SKILL_feed_item) {
i0 = 11;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 12;

}
break;

}
case 2: {
if (skill_name_id == SKILL_feed_item) {
i0 = 21;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 22;

}
break;

}
case 3: {
if (skill_name_id == SKILL_feed_item) {
i0 = 31;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 32;

}
break;

}
case 4: {
if (skill_name_id == SKILL_feed_item) {
i0 = 41;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 42;

}
break;

}

}
maker0 = gg.GetNpcMaker(MAKER_tamed_beast);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 21150002, gg.GetIndexFromCreature(attacker), i0);

}
myself.AddTimerEx(TIMER_despawn, 500);

} else if (gg.Rand(10000) < PROB_direct_4th) {
if (debug_mode) {
myself.Say("다이렉트로 4단계로 진화");

}
switch (my_type) {
case 1: {
if (skill_name_id == SKILL_feed_item) {
i0 = 1018878;
i1 = 1;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 1018879;
i1 = 2;

}
break;

}
case 2: {
if (skill_name_id == SKILL_feed_item) {
i0 = 1018885;
i1 = 1;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 1018886;
i1 = 2;

}
break;

}
case 3: {
if (skill_name_id == SKILL_feed_item) {
i0 = 1018892;
i1 = 1;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 1018893;
i1 = 2;

}
break;

}
case 4: {
if (skill_name_id == SKILL_feed_item) {
i0 = 1018899;
i1 = 1;

} else if (skill_name_id == SKILL_feed_adena) {
i0 = 1018900;
i1 = 2;

}
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(attacker), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else {
if (skill_name_id == SKILL_feed_item) {
if (debug_mode) {
myself.Say("아이템형");

}
switch (my_type) {
case 1: {
i0 = 1018874;
break;

}
case 2: {
i0 = 1018881;
break;

}
case 3: {
i0 = 1018888;
break;

}
case 4: {
i0 = 1018895;
break;

}

}
i1 = 1;

} else if (skill_name_id == SKILL_feed_adena) {
if (debug_mode) {
myself.Say("아데나형");

}
switch (my_type) {
case 1: {
i0 = 1018875;
break;

}
case 2: {
i0 = 1018882;
break;

}
case 3: {
i0 = 1018889;
break;

}
case 4: {
i0 = 1018896;
break;

}

}
i1 = 2;

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(myself.c_ai0), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

}

} else {
myself.AddAttackDesire(attacker, 1, damage * 2);
if (myself.IsInCategory(122, attacker.npc_class_id) == 1) {
myself.i_ai6 = myself.i_ai6 + 1;
if (myself.i_ai6 == 5) {
myself.BroadcastScriptEventEx(21150001, gg.GetIndexFromCreature(attacker), myself.sm.level, 1500);
myself.SetAbilityItemDrop(0);
myself.Suicide();

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
super;
if (timer_id == TIMER_despawn) {
myself.Despawn();

} else if (timer_id == TIMER_itsme) {
myself.BroadcastScriptEvent(21150004, gg.GetIndexFromCreature(myself.sm), 500);
i0 = gg.Rand(100) + 200;
myself.AddTimerEx(TIMER_itsme, i0 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam maker0) {
if (script_event_arg1 == 21150003) {
myself.BroadcastScriptEvent(21150004, gg.GetIndexFromCreature(myself.sm), 1000);

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
super;
if (myself.IsNullCreature(last_attacker) == 0) {
if (myself.IsInCategory(122, last_attacker.npc_class_id) == 1) {
myself.BroadcastScriptEventEx(21150001, gg.GetIndexFromCreature(last_attacker), myself.sm.level, 1500);

}

}
	}


}