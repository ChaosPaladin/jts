package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_totem extends default_npc {
	protected int Skill01_ID = -1;
	protected int Skill02_ID = -1;
	protected int Skill03_ID = -1;
	protected int Skill04_ID = -1;
	protected int DespawnTime = -1;

	protected void CREATED(HandlerParam i0) {
i0 = gg.Rand(4) + 1;
switch (i0) {
case 1: {
myself.i_ai1 = Skill01_ID;
break;

}
case 2: {
myself.i_ai1 = Skill02_ID;
break;

}
case 3: {
myself.i_ai1 = Skill03_ID;
break;

}
case 4: {
myself.i_ai1 = Skill04_ID;
break;

}

}
myself.i_ai0 = 0;
myself.AddTimerEx(2000, DespawnTime * 1000);
myself.AddMoveAroundDesire(5, 5);
myself.i_ai2 = 1;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam party0, HandlerParam i0, HandlerParam i1) {
myself.i_ai0 = 1;
if (myself.sm.hp <= 1) {
c0 = myself.GetLastAttacker();
if (myself.i_ai2 == 1) {
if (myself.IsNullCreature(c0) == 0) {
party0 = gg.GetParty(c0);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
myself.CastBuffForQuestReward(c0, myself.i_ai1);

}

}

} else {
myself.CastBuffForQuestReward(c0, myself.i_ai1);

}

}
myself.AddTimerEx(2002, 1 * 1000);
myself.i_ai2 = myself.i_ai2 + 1;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2000) {
if (myself.i_ai0 == 0) {
myself.Despawn();

}

}
if (timer_id == 2002) {
myself.Suicide();

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam party0) {
	}


}