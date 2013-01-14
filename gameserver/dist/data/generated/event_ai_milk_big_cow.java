package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_ai_milk_big_cow extends default_npc {
	protected int event_coin = 14720;
	protected int debug_mode = 0;
	protected int s_event_skill1 = 187891713;
	protected int s_event_skill2 = 187957249;
	protected int ev_massage1 = 1800762;
	protected int ev_massage2 = 1800818;
	protected int ev_massage3 = 1800759;

	protected void CREATED(HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.sm.summoner_id);
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.c_ai4 = gg.GetNullCreature();
myself.i_ai0 = c0.id;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_quest0 = 0;
myself.i_quest1 = 0;
myself.AddTimerEx(20000, 360000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam party0, HandlerParam c0, HandlerParam c1, HandlerParam c2) {
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (myself.IsNullCreature(c0) == 1) {
myself.Despawn();

}
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(401932289) < myself.sm.mp && myself.Skill_GetConsumeHP(401932289) < myself.sm.hp && myself.Skill_InReuseDelay(401932289) == 0) {
myself.AddUseSkillDesire(attacker, 401932289, 0, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(402063361) < myself.sm.mp && myself.Skill_GetConsumeHP(402063361) < myself.sm.hp && myself.Skill_InReuseDelay(402063361) == 0) {
myself.AddUseSkillDesire(attacker, 402063361, 0, 1, 1000000);

}

}
if (skill_name_id == s_event_skill1 || skill_name_id == s_event_skill2) {
if (myself.i_ai3 == 0) {
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai3 = 1;
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
i1 = gg.Rand(100);
if (i1 < 30) {
for (i2 = 0; i2 < i0; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
myself.EffectMusic(myself.sm, 200, "EV_03");
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800771, "", "", "", "", ""));

}

}
myself.i_ai2 = 1;
myself.AddTimerEx(20001, 1000);

} else {
myself.i_ai2 = 0;

}

}

}

}
if (myself.i_ai0 == attacker.id) {
if (gg.Rand(100) < 10) {
i3 = gg.Rand(5);
myself.Say(gg.MakeFString(ev_massage1 + i3, "", "", "", "", ""));

}

}

} else if (gg.Rand(100) < 10) {
i4 = gg.Rand(2);
myself.Say(gg.MakeFString(MakeFString + i4, "", "", "", "", ""));

}
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (timer_id == 20000) {
myself.Despawn();

}
if (timer_id == 20001) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800772, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20002, 1000);

}
if (timer_id == 20002) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800773, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20003, 1000);

}
if (timer_id == 20003) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800774, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20004, 1000);

}
if (timer_id == 20004) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800775, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20005, 1000);

}
if (timer_id == 20005) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800776, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20006, 1000);

}
if (timer_id == 20006) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800777, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20007, 1000);

}
if (timer_id == 20007) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800778, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20008, 1000);

}
if (timer_id == 20008) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800779, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20009, 1000);

}
if (timer_id == 20009) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800780, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20010, 1000);

}
if (timer_id == 20010) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800781, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20011, 1000);

}
if (timer_id == 20011) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800782, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20012, 1000);

}
if (timer_id == 20012) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800783, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20013, 1000);

}
if (timer_id == 20013) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800784, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20014, 1000);

}
if (timer_id == 20014) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800785, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20015, 1000);

}
if (timer_id == 20015) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800786, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20016, 1000);

}
if (timer_id == 20016) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800787, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20017, 1000);

}
if (timer_id == 20017) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800788, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20018, 1000);

}
if (timer_id == 20018) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800789, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20019, 1000);

}
if (timer_id == 20019) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800790, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20020, 1000);

}
if (timer_id == 20020) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800791, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20021, 1000);

}
if (timer_id == 20021) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800792, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20022, 1000);

}
if (timer_id == 20022) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800793, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20023, 1000);

}
if (timer_id == 20023) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800794, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20024, 1000);

}
if (timer_id == 20024) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800795, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20025, 1000);

}
if (timer_id == 20025) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800796, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20026, 1000);

}
if (timer_id == 20026) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800797, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20027, 1000);

}
if (timer_id == 20027) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800798, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20028, 1000);

}
if (timer_id == 20028) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800799, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20029, 1000);

}
if (timer_id == 20029) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800800, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20030, 1000);

}
if (timer_id == 20030) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800801, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20031, 1000);

}
if (timer_id == 20031) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800802, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20032, 1000);

}
if (timer_id == 20032) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800803, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20033, 1000);

}
if (timer_id == 20033) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800804, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20034, 1000);

}
if (timer_id == 20034) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800805, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20035, 1000);

}
if (timer_id == 20035) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800806, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20036, 1000);

}
if (timer_id == 20036) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800807, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20037, 1000);

}
if (timer_id == 20037) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800808, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20038, 1000);

}
if (timer_id == 20038) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800809, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20039, 1000);

}
if (timer_id == 20039) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800810, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20040, 1000);

}
if (timer_id == 20040) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800811, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20041, 1000);

}
if (timer_id == 20041) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800812, "", "", "", "", ""));

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20042, 2500);

}
if (timer_id == 20042) {
myself.i_ai2 = 0;
if (myself.i_quest0 == 1) {
myself.i_ai2 = 1;
myself.AddTimerEx(50000, 4000);

} else if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {

}

}

} else {
myself.i_ai2 = 0;
return;

}

} else {
myself.Despawn();

}

}
if (timer_id == 50000) {
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
i0 = party0.member_count;
if (myself.IsNullParty(party0) == 0) {
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c1 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c1) == 0) {
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(1800814, "", "", "", "", ""));

}

}

}

}

}
	}

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam party0) {
i0 = 1 + gg.Rand(2);
myself.i_quest0 = 1;
i5 = gg.Rand(3);
c0 = gg.GetCreatureFromID(myself.i_ai0);
party0 = gg.GetParty(c0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsNullParty(party0) == 0) {
i1 = party0.member_count;
if (myself.i_ai2 == 1) {
i3 = gg.FloatToInt(i0 * i1 * 0.200000 * 2);
myself.Say(gg.MakeFString(ev_massage2 + i5, c0.name, "", "", "", ""));
if (myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(c0, 14720, i3);

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) <= 1500) {
myself.GiveItem1(c1, 14720, i0 * 2);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(1800814, "", "", "", "", ""));

}

}

}

} else if (myself.i_ai2 == 0) {
i4 = gg.FloatToInt(i0 * i1 * 0.200000);
myself.Say(gg.MakeFString(ev_massage3 + i5, "", "", "", "", ""));
if (myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(c0, 14720, i4);

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = myself.GetMemberOfParty(party0, i2);
if (myself.IsNullCreature(c1) == 0) {
if (myself.DistFromMe(c1) <= 1500) {
myself.GiveItem1(c1, 14720, i0);

}

}

}

}

} else {
myself.GiveItem1(c0, 14720, i0);
myself.Say(gg.MakeFString(1800821, "", "", "", "", ""));

}

}
	}


}