package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ssq_event_basic_warrior extends abstract_npc {
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected int RoomIndex = 0;
	protected int SSQPart = 0;
	protected int SeeCreatureAttackerTime = -1;

	protected void CREATED() {
myself.AddTimerEx(2001, 10000);
myself.i_ai1 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.GetCurrentTick() - myself.sm.param2 > 60 * 17 + 50) {
myself.Despawn();

} else {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.InMyTerritory(myself.top_desire_target) == 0) {
myself.RemoveAttackDesire(myself.top_desire_target.id);

}

}
myself.AddTimerEx(2001, 10000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0, HandlerParam party1) {
if (myself.InMyTerritory(attacker) == 0) {
return;

}
if (myself.IsInCategory(35, attacker.npc_class_id)) {
myself.i_ai1 = 1;

}
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
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0, HandlerParam party1) {
if (myself.InMyTerritory(attacker) == 0) {
return;

}
if (myself.IsInCategory(35, attacker.npc_class_id)) {
myself.i_ai1 = 1;

}
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
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 30);

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
if (myself.InMyTerritory(speller) == 0) {
return;

}
myself.MakeAttackEvent(speller, desire, 0);
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam party0, HandlerParam party1) {
if (RoomIndex != 0 && SSQPart != 0) {
if (myself.InMyTerritory(speller) == 0) {
myself.i_ai1 = 1;

} else {
party0 = gg.GetPartyFromEventRoom(RoomIndex, SSQPart);
party1 = gg.GetParty(speller);
if (myself.IsNullParty(party0) || myself.IsNullParty(party1)) {
myself.i_ai1 = 1;

} else if (party0.id != party1.id && speller.is_pc == 1) {
myself.i_ai1 = 1;

}

}

} else {
myself.Say("빵꾸 : 몬스터의 소속이 불분명");

}
	}


}