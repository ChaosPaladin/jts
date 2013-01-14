package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_tamed extends default_npc {
	protected int SKILL_control_attack = 548012033;
	protected int SKILL_control_follow = 548077569;
	protected int SKILL_control_buff = 548143105;
	protected int SKILL_control_byebye = 549060609;
	protected int ITEM_feed_item = 15474;
	protected int ITEM_feed_adena = 15475;
	protected int TIMER_eat_feed = 2115001;
	protected int TIMER_confirm_pc = 2115002;
	protected int TIMER_byebye = 2115004;
	protected int TIMER_byebye2 = 2115011;
	protected int TIMER_time_over = 2115005;
	protected int TIMER_end_flee = 2115010;
	protected int Buff = 458752001;
	protected int Buff1 = 421462017;
	protected int Buff2 = 436862977;
	protected int Buff3 = 421658625;
	protected int Buff4 = 436928513;
	protected int Buff5 = 437059585;
	protected int Buff6 = 437256193;
	protected int Buff7 = 421527553;
	protected int Buff8 = 436994049;
	protected int Buff9 = 421593089;
	protected int Buff10 = 437125121;
	protected int Buff11 = 437190657;
	protected int my_type = -1;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam c0, HandlerParam c1, HandlerParam i0, HandlerParam s0) {
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);
if (myself.sm.param1 != 0) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
if (debug_mode) {
myself.Say("init. 주인 정상 확인. " + c0.name);

}
myself.AddFollowDesire2(c0, 10, 1, gg.Rand(50) + 50, gg.Rand(60) - 30 + 180);
myself.i_ai9 = gg.GetIndexFromCreature(c0);
myself.ChangeMasterName(myself.sm, c0.name + "의");
if (gg.HaveMemo(c0, 20) == 1 && gg.GetMemoState(c0, 20) == 1) {
if (gg.Rand(100) < 5 && gg.OwnItemCount(c0, 7185) == 0 && gg.OwnItemCount(c0, 15533) == 0) {
myself.GiveItem1(c0, 15533, 1);
myself.SetFlagJournal(c0, 7185, 2);
myself.ShowQuestMark(c0, 20);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

}
c1 = myself.Pledge_GetLeader(gg.GetCreatureFromIndex(myself.sm.param1));
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 655)) {
if (gg.OwnItemCount(c1, 8084) < 10 && myself.DistFromMe(c1) < 2000) {
if (myself.GetPledgeSkillLevel(gg.GetCreatureFromIndex(myself.sm.param1)) >= 4) {
myself.GiveItem1(c1, 8084, 1);

}
if (gg.OwnItemCount(c1, 8084) >= 9) {
myself.SetFlagJournal(c1, 655, 2);
myself.ShowQuestMark(c1, 655);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}

}

} else {
if (debug_mode) {
myself.Say("param 1 is 0. 주인 확인 실패.");

}
myself.AddTimerEx(TIMER_byebye, 1500);

}
if (myself.sm.param2 == 0) {
myself.i_ai1 = gg.Rand(2) + 1;

} else {
myself.i_ai1 = myself.sm.param2;

}
if (my_type == 1) {
s0 = gg.MakeFString(1801106, "", "", "", "", "");

} else if (my_type == 2) {
s0 = gg.MakeFString(1801107, "", "", "", "", "");

} else if (my_type == 3) {
s0 = gg.MakeFString(1801108, "", "", "", "", "");

} else if (my_type == 4) {
s0 = gg.MakeFString(1801109, "", "", "", "", "");

}
i0 = gg.Rand(6);
switch (i0) {
case 0: {
myself.i_ai2 = Buff1;
myself.i_ai3 = Buff2;
myself.ChangeNickName(myself.sm, gg.MakeFString(1801100, s0, "", "", "", ""));
break;

}
case 1: {
myself.i_ai2 = Buff3;
myself.i_ai3 = Buff4;
myself.ChangeNickName(myself.sm, gg.MakeFString(1801101, s0, "", "", "", ""));
break;

}
case 2: {
myself.i_ai2 = Buff5;
myself.i_ai3 = Buff6;
myself.ChangeNickName(myself.sm, gg.MakeFString(1801102, s0, "", "", "", ""));
break;

}
case 3: {
myself.i_ai2 = Buff7;
myself.i_ai3 = Buff8;
myself.ChangeNickName(myself.sm, gg.MakeFString(1801103, s0, "", "", "", ""));
break;

}
case 4: {
myself.i_ai2 = Buff9;
myself.i_ai3 = Buff10;
myself.ChangeNickName(myself.sm, gg.MakeFString(1801104, s0, "", "", "", ""));
break;

}
case 5: {
myself.i_ai2 = Buff11;
myself.i_ai3 = 458752001;
myself.ChangeNickName(myself.sm, gg.MakeFString(1801105, s0, "", "", "", ""));
break;

}

}
myself.AddTimerEx(TIMER_eat_feed, 60 * 1000);
myself.AddTimerEx(TIMER_confirm_pc, 60 * 1000);
myself.AddTimerEx(TIMER_time_over, 30 * 60 * 1000);
	}

	protected void NO_DESIRE(HandlerParam c0) {
if (gg.Rand(10000) > 100) {
c0 = gg.GetCreatureFromIndex(myself.i_ai9);
if (myself.IsNullCreature(c0) == 0) {
myself.AddFollowDesire2(c0, 10, 1, gg.Rand(50) + 50, gg.Rand(60) - 30 + 180);

}

} else if (gg.Rand(2) == 1) {
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);

} else {
myself.AddEffectActionDesire(myself.sm, 3, 80, 1000000);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc == 0) {
myself.AddAttackDesire(attacker, 1, damage / 2);

} else {
myself.AddFleeDesire(attacker, 10);
myself.AddTimerEx(TIMER_end_flee, 5000);

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam c0, HandlerParam c1) {
if (debug_mode) {
myself.Say("SPELLED");

}
c0 = gg.GetCreatureFromIndex(myself.i_ai9);
if (myself.IsNullCreature(c0) == 0) {
if (speller == c0 && speller.is_pc == 1) {
if (skill_name_id == SKILL_control_follow) {
if (debug_mode) {
myself.Say("- follow");

}
myself.RemoveAllDesire();
myself.RemoveAbsoluteDesire();

} else if (skill_name_id == SKILL_control_buff) {
if (debug_mode) {
myself.Say("- buff");

}
myself.RemoveAllDesire();
myself.RemoveAbsoluteDesire();
myself.AddUseSkillDesire(c0, myself.i_ai2, 1, 1, 10000000);
if (myself.i_ai3 != 458752001) {
myself.AddUseSkillDesire(c0, myself.i_ai3, 1, 1, 10000000);

}
c1 = myself.GetSummon(c0);
if (myself.IsNullCreature(c1) == 0) {
if (debug_mode) {
myself.Say(" - buff : 펫이 존재하여 펫에게도 버프 시전");

}
myself.CastBuffForQuestReward(c1, myself.i_ai2);
if (myself.i_ai3 != 458752001) {
myself.CastBuffForQuestReward(c1, myself.i_ai3);

}

}

} else if (skill_name_id == SKILL_control_attack) {
if (debug_mode) {
myself.Say("- bye 1마리");

}
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);
myself.AddTimerEx(TIMER_byebye, 2000);

} else if (skill_name_id == SKILL_control_byebye) {
if (debug_mode) {
myself.Say("- byebye");

}
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);
myself.AddTimerEx(TIMER_byebye, 2000);

}

}

} else if (debug_mode) {
myself.Say("spelled : spawner is null!");

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam s0) {
if (timer_id == TIMER_eat_feed) {
if (debug_mode) {
myself.Say("사료소비 타이머");

}
myself.AddEffectActionDesire(myself.sm, 2, 30, 1000000);
myself.AddEffectActionDesire(myself.sm, 3, 80, 1000000);
c0 = gg.GetCreatureFromIndex(myself.i_ai9);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai1 == 1 && gg.OwnItemCount(c0, ITEM_feed_item) > 0) {
if (debug_mode) {
myself.Say("아이템형 사료소비. " + myself.sm.id);

}
myself.DeleteItem1(c0, ITEM_feed_item, 1);

} else if (myself.i_ai1 == 2 && gg.OwnItemCount(c0, ITEM_feed_adena) > 0) {
if (debug_mode) {
myself.Say("아데나형 사료소비. " + myself.sm.id);

}
myself.DeleteItem1(c0, ITEM_feed_adena, 1);

} else {
if (my_type == 1) {
s0 = gg.MakeFString(1801106, "", "", "", "", "");

} else if (my_type == 2) {
s0 = gg.MakeFString(1801107, "", "", "", "", "");

} else if (my_type == 3) {
s0 = gg.MakeFString(1801108, "", "", "", "", "");

} else if (my_type == 4) {
s0 = gg.MakeFString(1801109, "", "", "", "", "");

}
if (myself.i_ai1 == 1) {
myself.ShowSystemMessageStr(c0, gg.MakeFString(1801094, s0, "", "", "", ""));

} else {
myself.ShowSystemMessageStr(c0, gg.MakeFString(1801095, s0, "", "", "", ""));

}
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);
myself.AddTimerEx(TIMER_byebye, 2000);

}

}
myself.AddTimerEx(TIMER_eat_feed, 150 * 1000);

} else if (timer_id == TIMER_confirm_pc) {
if (debug_mode) {
myself.Say("PC 확인 타이머");

}
c0 = gg.GetCreatureFromIndex(myself.i_ai9);
if (myself.IsNullCreature(c0) == 1 || myself.DistFromMe(c0) >= 2000) {
if (debug_mode) {
myself.Say("PC가 없으므로 디스폰");

}
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);
myself.AddTimerEx(TIMER_byebye, 2000);

} else {
if (debug_mode) {
myself.Say("confirm_pc ok. 타이머 루프");

}
myself.AddTimerEx(TIMER_confirm_pc, 60 * 1000);

}

} else if (timer_id == TIMER_byebye) {
c0 = gg.GetCreatureFromIndex(myself.i_ai9);
if (myself.IsNullCreature(c0) == 0) {
myself.AddFleeDesire(c0, 500000);

}
myself.AddTimerEx(TIMER_byebye2, 2000);

} else if (timer_id == TIMER_byebye2) {
myself.Despawn();

} else if (timer_id == TIMER_time_over) {
if (debug_mode) {
myself.Say("스폰된지 30분이 지나 디스폰함. 추후 sysmsg로 표현");

}
myself.AddEffectActionDesire(myself.sm, 1, 110, 1000000);
myself.AddTimerEx(TIMER_byebye, 2000);

} else if (timer_id == TIMER_end_flee) {
myself.RemoveAllDesire();

}
	}


}