package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_ai_milk_cow extends default_npc {
	protected int event_coin = 14720;
	protected int timer_count = 10;
	protected int event_animal = 2;
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
myself.AddTimerEx(200001, 360000);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam c0) {
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
i0 = gg.Rand(100);
if (i0 < 30) {
myself.EffectMusic(myself.sm, 200, "EV_04");
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800770, "", "", "", "", ""));
myself.i_ai2 = 1;
myself.AddTimerEx(20001, 1000);

} else {
myself.i_ai2 = 0;

}

}

}
if (myself.i_ai0 == attacker.id) {
if (gg.Rand(100) < 10) {
i1 = gg.Rand(5);
myself.Say(gg.MakeFString(ev_massage1 + i1, "", "", "", "", ""));

}

} else if (gg.Rand(100) < 10) {
myself.Say(gg.MakeFString(1800815, "", "", "", "", ""));

}

} else if (gg.Rand(100) < 10) {
i2 = gg.Rand(2);
myself.Say(gg.MakeFString(MakeFString + i2, "", "", "", "", ""));

}
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(40, 20);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (timer_id == 200001) {
myself.Despawn();

}
if (timer_id == 20001) {
myself.i_ai2 = 1;
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800802, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800803, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800804, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800805, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800806, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800807, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800808, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800809, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800810, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800811, "", "", "", "", ""));

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
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 1000, 0, gg.MakeFString(1800812, "", "", "", "", ""));

} else {
myself.Despawn();

}
if (myself.i_quest0 == 1) {
myself.AddTimerEx(50000, 4000);
return;

}
myself.AddTimerEx(20012, 2500);

}
if (timer_id == 20012) {
myself.i_ai2 = 0;
if (myself.i_quest0 == 1) {
myself.i_ai2 = 1;
myself.AddTimerEx(50000, 4000);

} else if (myself.IsNullCreature(c0) == 0) {

} else {
myself.Despawn();

}

}
if (timer_id == 50000) {
if (myself.IsNullCreature(c0) == 0) {
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(1800814, "", "", "", "", ""));

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam c0) {
i0 = 1 + gg.Rand(2);
i1 = gg.Rand(3);
myself.i_quest0 = 1;
c0 = gg.GetCreatureFromID(myself.i_ai0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) <= 1500) {
if (myself.i_ai2 == 1) {
myself.GiveItem1(c0, 14720, i0 * 2);
myself.Say(gg.MakeFString(ev_massage2 + i1, c0.name, "", "", "", ""));
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(1800814, "", "", "", "", ""));

} else if (myself.i_ai2 == 0) {
myself.GiveItem1(c0, 14720, i0);
myself.Say(gg.MakeFString(ev_massage3 + i1, "", "", "", "", ""));

}

}

}
	}


}