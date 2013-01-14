package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_bomb extends ssq_event_basic_warrior {
	protected int DDMagic = 262209537;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c1) {
c1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.IsNullCreature(c1) == 0) {
if (myself.InMyTerritory(c1)) {
if (script_event_arg1 == 10007) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.AddMoveToDesire(myself.sm.param1, script_event_arg2, gg.FloatToInt(myself.sm.z), 50);

}

}

}

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, DDMagic, 0, 1, 1000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam success) {
if (success == 1) {
myself.Suicide();

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam party0, HandlerParam party1) {
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
if (myself.IsInCategory(35, attacker.npc_class_id)) {
myself.i_ai1 = 1;

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