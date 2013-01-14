package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_present_npc extends abstract_npc {
	protected int RoomIndex = 0;
	protected int SSQPart = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.AddTimerEx(1001, 2 * 60 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1001) {
myself.Despawn();

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam party1, HandlerParam skill_name_id) {
if (RoomIndex != 0 && SSQPart != 0) {
if (myself.InMyTerritory(attacker) == 0) {
myself.i_ai1 = 1;

} else {
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
party1 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) || myself.IsNullParty(party1)) {
myself.i_ai1 = 1;

} else if (party0.id != party1.id && attacker.is_pc == 1) {
myself.i_ai1 = 1;

}

}

} else {
myself.Say("빵꾸 : 몬스터의 소속이 불분명");

}
if (skill_name_id != 0) {
myself.AddFleeDesire(attacker, 100);

} else if (gg.Rand(100) < 30) {
myself.AddFleeDesire(attacker, 100);

}
if (myself.IsInCategory(35, attacker.npc_class_id)) {
myself.i_ai1 = 1;

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
if (skill_name_id != 0) {
myself.AddFleeDesire(attacker, 100);

} else if (gg.Rand(100) < 30) {
myself.AddFleeDesire(attacker, 100);

}
	}

	protected void MY_DYING(HandlerParam c0, HandlerParam c1, HandlerParam party0, HandlerParam i1, HandlerParam i2) {
if (myself.i_ai1 == 1) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 0) {
c0 = c0.master;

}
if (myself.IsNullCreature(c0) == 0) {
c0 = gg.Party_GetLeader(c0);

}
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(c1) == 0) {
if (c0 == c1) {
if (gg.HaveMemo(c0, 505)) {
i1 = 3 + gg.FloatToInt(FloatToInt * 25 / 100);
if (myself.IsInCategory(2, c0.occupation)) {
if (myself.DistFromMe(c0) < 40) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}

} else if (myself.DistFromMe(c0) < 80) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}
if (myself.IsInCategory(2, c0.occupation)) {
if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 7 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 15 / 100);

}

} else if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 15 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 7 / 100);

}
myself.ShowSysMsgToParty2(party0, 2, 1381, 3, 5901, 1, i1);
myself.GiveItem1(c0, 5901, i1);

}

}

}

}

} else {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 0) {
c0 = c0.master;

}
if (myself.IsNullCreature(c0) == 0) {
c0 = gg.Party_GetLeader(c0);

}
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
c1 = myself.GetLeaderOfParty(party0);
if (myself.IsNullCreature(c0) == 0 && myself.IsNullCreature(c1) == 0) {
if (c0 == c1) {
if (gg.HaveMemo(c0, 505)) {
i1 = 30 + gg.FloatToInt(FloatToInt * 25 / 100);
if (myself.IsInCategory(2, c0.occupation)) {
if (myself.DistFromMe(c0) < 40) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}

} else if (myself.DistFromMe(c0) < 80) {
i1 = i1 + gg.FloatToInt(i1 * 30 / 100);

}
if (myself.IsInCategory(2, c0.occupation)) {
if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 7 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 15 / 100);

}

} else if (gg.Rand(2) > 0) {
i1 = i1 + gg.FloatToInt(i1 * 15 / 100);

} else {
i1 = i1 - gg.FloatToInt(i1 * 7 / 100);

}
myself.ShowSysMsgToParty2(party0, 2, 1381, 3, 5901, 1, i1);
myself.GiveItem1(c0, 5901, i1);

}

}

}

}

}
	}


}