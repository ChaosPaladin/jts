package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_beast extends ai_beastfarm_basic {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 2500;
	protected int Skill_LookAtMe = 436797441;
	protected int Skill_Display = 458752001;
	protected int Buff = 458752001;
	protected int DeBuff = 458752001;
	protected int TIMER_despawn = 2115003;
	protected int TIMER_spawn_attack = 2115006;
	protected int ITEM_feed_item = 15474;
	protected int ITEM_feed_adena = 15475;
	protected int ITEM_feed_item_s = 15478;
	protected int ITEM_feed_adena_s = 15479;
	protected int ITEM_feed_item_bress = 15476;
	protected int ITEM_feed_adena_bress = 15477;
	protected int my_type = -1;
	protected int my_grade = -1;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam c0) {
super;
myself.AddEffectActionDesire(myself.sm, 1, 120, 1000000);
myself.i_ai4 = 0;
myself.i_ai8 = 0;
myself.i_ai9 = 0;
if (myself.sm.param1 != 0 && myself.sm.param2 != 0) {
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = myself.sm.param2;
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai5 = myself.sm.param1;
if (Skill_LookAtMe != 458752001) {
myself.CastBuffForQuestReward(c0, Skill_LookAtMe);

}
myself.AddTimerEx(TIMER_spawn_attack, 1000);

} else if (debug_mode) {
myself.Say("ERR : param1's pc is null");

}

} else if (debug_mode) {
myself.Say("ERR : param1 or param2 is 0");

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
super;
if (timer_id == TIMER_spawn_attack) {
c0 = gg.GetCreatureFromIndex(myself.i_ai5);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 10000);

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam maker0) {
myself.AddAttackDesire(attacker, 1, damage);
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.700000) {
if (myself.i_ai8 == 0) {
myself.i_ai8 = 1;
if (my_grade == 4) {
if (gg.Rand(2) == 1) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 10000000);

}

} else if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 10000000);

}

}

}
if (myself.IsInCategory(122, attacker.npc_class_id) == 1) {
myself.i_ai6 = myself.i_ai6 + 1;
if (myself.i_ai6 == 5) {
myself.Suicide();

}

}
c0 = gg.GetCreatureFromIndex(myself.i_ai5);
if (myself.IsNullCreature(c0) == 0) {
if (attacker == c0) {
if (skill_name_id == SKILL_feed_item_s || skill_name_id == SKILL_feed_adena_s || skill_name_id == SKILL_feed_item_bress || skill_name_id == SKILL_feed_adena_bress) {
if (debug_mode) {
myself.Say("진화한 맹수는 특수 사료를 먹지 않습니다.");

}
if (gg.Rand(10000) < 7000) {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801091, "", "", "", "", ""));

} else {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801092, "", "", "", "", ""));
if (skill_name_id == SKILL_feed_item_s) {
myself.DropItem2(myself.sm, ITEM_feed_item_s, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena_s) {
myself.DropItem2(myself.sm, ITEM_feed_adena_s, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_item_bress) {
myself.DropItem2(myself.sm, ITEM_feed_item_bress, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena_bress) {
myself.DropItem2(myself.sm, ITEM_feed_adena_bress, 1, attacker.id);

}

}

} else if (skill_name_id == SKILL_feed_item || skill_name_id == SKILL_feed_adena) {
if (myself.i_ai1 == 1 && skill_name_id == SKILL_feed_item || myself.i_ai1 == 2 && skill_name_id == SKILL_feed_adena) {
myself.i_ai4 = myself.i_ai4 + 1;
if (my_grade == 2) {
if (myself.i_ai4 == 1 && gg.Rand(100) < 30 || myself.i_ai4 == 2 && gg.Rand(100) < 50 || myself.i_ai4 == 3 && myself.i_ai9 == 0) {
myself.i_ai9 = 1;
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 1018876;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018877;
i1 = 2;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 1018883;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018884;
i1 = 2;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 1018890;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018891;
i1 = 2;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 1018897;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018898;
i1 = 2;

}
break;

}

}
if (debug_mode) {
myself.Say("3단계 몬스터로 진화");

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(c0), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else if (debug_mode) {
myself.Say("진화 실패");

}

} else if (my_grade == 3) {
if (myself.i_ai4 == 1 && myself.i_ai9 == 0) {
if (debug_mode) {
myself.Say("첫번째 사료");

}
if (gg.Rand(100) < 10) {
myself.i_ai9 = 1;
if (debug_mode) {
myself.Say("첫번째 사료 펫으로 진화");

}
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 11;

} else if (myself.i_ai1 == 2) {
i0 = 12;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 21;

} else if (myself.i_ai1 == 2) {
i0 = 22;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 31;

} else if (myself.i_ai1 == 2) {
i0 = 32;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 41;

} else if (myself.i_ai1 == 2) {
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

} else if (gg.Rand(100) < 20) {
myself.i_ai9 = 1;
if (debug_mode) {
myself.Say("첫번째 사료 4단계로 진화");

}
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 1018878;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018879;
i1 = 2;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 1018885;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018886;
i1 = 2;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 1018892;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018893;
i1 = 2;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 1018899;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018900;
i1 = 2;

}
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(c0), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else if (debug_mode) {
myself.Say("진화 실패 " + myself.i_ai4);

}

} else if (myself.i_ai4 == 2 && myself.i_ai9 == 0) {
if (debug_mode) {
myself.Say("두번째 사료");

}
if (gg.Rand(100) < 20) {
myself.i_ai9 = 1;
if (debug_mode) {
myself.Say("두번째 사료 펫으로 진화");

}
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 11;

} else if (myself.i_ai1 == 2) {
i0 = 12;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 21;

} else if (myself.i_ai1 == 2) {
i0 = 22;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 31;

} else if (myself.i_ai1 == 2) {
i0 = 32;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 41;

} else if (myself.i_ai1 == 2) {
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

} else if (gg.Rand(100) < 50) {
myself.i_ai9 = 1;
if (debug_mode) {
myself.Say("두번째 사료 4단계로 진화");

}
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 1018878;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018879;
i1 = 2;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 1018885;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018886;
i1 = 2;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 1018892;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018893;
i1 = 2;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 1018899;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018900;
i1 = 2;

}
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(c0), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

} else if (debug_mode) {
myself.Say("진화 실패 " + myself.i_ai4);

}

} else if (myself.i_ai4 == 3 && myself.i_ai9 == 0) {
if (debug_mode) {
myself.Say("세번째 사료");

}
if (gg.Rand(100) < 30) {
myself.i_ai9 = 1;
if (debug_mode) {
myself.Say("세번째 사료 펫으로 진화");

}
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 11;

} else if (myself.i_ai1 == 2) {
i0 = 12;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 21;

} else if (myself.i_ai1 == 2) {
i0 = 22;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 31;

} else if (myself.i_ai1 == 2) {
i0 = 32;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 41;

} else if (myself.i_ai1 == 2) {
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

} else {
myself.i_ai9 = 1;
if (debug_mode) {
myself.Say("세번째 사료 4단계로 진화");

}
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i0 = 1018878;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018879;
i1 = 2;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i0 = 1018885;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018886;
i1 = 2;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i0 = 1018892;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018893;
i1 = 2;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i0 = 1018899;
i1 = 1;

} else if (myself.i_ai1 == 2) {
i0 = 1018900;
i1 = 2;

}
break;

}

}
myself.CreateOnePrivateEx(i0, "ai_beastfarm_beast", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm) * 182, gg.GetIndexFromCreature(c0), i1, 0);
myself.AddTimerEx(TIMER_despawn, 500);

}

} else if (debug_mode) {
myself.Say("진화 실패 " + myself.i_ai4);

}

} else if (my_grade == 4) {
if (debug_mode) {
myself.Say("4단계 맹수는 사료를 먹지 않습니다.");

}
if (gg.Rand(10000) < 7000) {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801091, "", "", "", "", ""));

} else {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1801092, "", "", "", "", ""));
if (skill_name_id == SKILL_feed_item) {
myself.DropItem2(myself.sm, ITEM_feed_item, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena) {
myself.DropItem2(myself.sm, ITEM_feed_adena, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_item_s) {
myself.DropItem2(myself.sm, ITEM_feed_item_s, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena_s) {
myself.DropItem2(myself.sm, ITEM_feed_adena_s, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_item_bress) {
myself.DropItem2(myself.sm, ITEM_feed_item_bress, 1, attacker.id);

} else if (skill_name_id == SKILL_feed_adena_bress) {
myself.DropItem2(myself.sm, ITEM_feed_adena_bress, 1, attacker.id);

}

}

} else if (debug_mode) {
myself.Say("ERR : my_grade param is incorrect. " + my_grade);

}

} else if (debug_mode) {
myself.Say("몬스터 타입과 다른 종류의 사료를 던졌어요~");

}

}

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam f0) {
if (gg.HaveMemo(last_attacker, 458) == 1 && gg.GetMemoState(last_attacker, 458) == 1) {
if (my_grade == 4) {
switch (my_type) {
case 1: {
i3 = 1018879;
break;

}
case 2: {
i3 = 1018886;
break;

}
case 3: {
i3 = 1018893;
break;

}
case 4: {
i3 = 1018900;
break;

}

}

}
if (myself.GetNPCLogByID(last_attacker, 458, 0, i3) < 10) {
i0 = 0;
i1 = 0;
i2 = 0;
if (myself.GetOverhitBonus(myself.sm) > 1) {
f0 = myself.GetOverhitBonus(myself.sm);
if (myself.GetOverhitBonus(myself.sm) >= 1.200000) {
myself.SetMemoStateEx(last_attacker, 458, 2, gg.GetMemoStateEx(last_attacker, 458, 2) + 1);

}
myself.SetMemoStateEx(last_attacker, 458, 1, gg.GetMemoStateEx(last_attacker, 458, 1) + 1);
myself.SetMemoStateEx(last_attacker, 458, 3, gg.GetMemoStateEx(last_attacker, 458, 3) + 1);
i0 = gg.GetMemoStateEx(last_attacker, 458, 3) % 100;
i1 = gg.GetMemoStateEx(last_attacker, 458, 3) - i0 * 100;
if (i0 < i1) {
myself.SetMemoStateEx(last_attacker, 458, 3, i1 * 100 + i1);

}

} else {
i2 = gg.GetMemoStateEx(last_attacker, 458, 3) % 100;
myself.SetMemoStateEx(last_attacker, 458, 3, i2 * 100);

}

}
if (my_grade == 4) {
switch (my_type) {
case 1: {
myself.IncreaseNPCLogByID(last_attacker, 458, 0, 1018879, 10);
break;

}
case 2: {
myself.IncreaseNPCLogByID(last_attacker, 458, 0, 1018886, 10);
break;

}
case 3: {
myself.IncreaseNPCLogByID(last_attacker, 458, 0, 1018893, 10);
break;

}
case 4: {
myself.IncreaseNPCLogByID(last_attacker, 458, 0, 1018900, 10);
break;

}

}

}
if (myself.GetNPCLogByID(last_attacker, 458, 0, 1018879) == 10 && myself.GetNPCLogByID(last_attacker, 458, 0, 1018886) == 10 && myself.GetNPCLogByID(last_attacker, 458, 0, 1018893) == 10 && myself.GetNPCLogByID(last_attacker, 458, 0, 1018900) == 10) {
myself.SetMemoState(last_attacker, 458, 2);
myself.SetFlagJournal(last_attacker, 458, 2);
myself.ShowQuestMark(last_attacker, 458);
myself.SoundEffect(last_attacker, "ItemSound.quest_middle");
myself.SetMemoStateEx(last_attacker, 458, 3, gg.GetMemoStateEx(last_attacker, 458, 3) % 100);

} else {
myself.SoundEffect(last_attacker, "ItemSound.quest_itemget");

}

}
if (gg.HaveMemo(last_attacker, 631) == 1 && gg.GetMemoState(last_attacker, 631) == 1) {
if (my_grade == 4) {
switch (my_type) {
case 1: {
if (myself.i_ai1 == 1) {
i1 = 172;

} else if (myself.i_ai1 == 2) {
i1 = 334;

}
break;

}
case 2: {
if (myself.i_ai1 == 1) {
i1 = 172;

} else if (myself.i_ai1 == 2) {
i1 = 334;

}
break;

}
case 3: {
if (myself.i_ai1 == 1) {
i1 = 182;

} else if (myself.i_ai1 == 2) {
i1 = 349;

}
break;

}
case 4: {
if (myself.i_ai1 == 1) {
i1 = 182;

} else if (myself.i_ai1 == 2) {
i1 = 349;

}
break;

}

}
i0 = gg.Rand(1000);
if (i0 < i1) {
if (gg.OwnItemCount(last_attacker, 15534) >= 119) {
myself.SetMemoState(last_attacker, 631, 2);
myself.SetFlagJournal(last_attacker, 631, 2);
myself.ShowQuestMark(last_attacker, 631);
myself.SoundEffect(last_attacker, "ItemSound.quest_middle");
myself.GiveItem1(last_attacker, 15534, 1);

} else {
myself.GiveItem1(last_attacker, 15534, 1);
myself.SoundEffect(last_attacker, "ItemSound.quest_itemget");

}

}

}

}
	}


}