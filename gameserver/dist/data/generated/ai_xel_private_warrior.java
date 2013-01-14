package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_xel_private_warrior extends warrior_basic {
	protected int minDistance = 100;
	protected int maxDistance = 200;
	protected int OHS_Weapon = 15280;
	protected int THS_Weapon = 15281;

	protected void NO_DESIRE() {
if (myself.i_ai0 != 0) {
return;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
myself.EquipItem(THS_Weapon);
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker) {
myself.EquipItem(THS_Weapon);
myself.AddAttackDesire(attacker, 1, 5000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam pos0) {
if (script_event_arg1 == 2219018 && myself.p_state != 3) {
if (myself.i_ai3 == 0) {
if (myself.i_ai0 == 1) {
myself.EquipItem(THS_Weapon);

}
myself.i_ai0 = 1;
myself.i_ai3 = 1;
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 1) {

} else {
myself.ChangeMoveType(1);
if (gg.Rand(3) < 1) {
myself.Say(gg.MakeFString(1801118, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1801119, "", "", "", "", ""));

}
pos0 = gg.GetRandomPosInCreature(c0, minDistance, maxDistance - 100);
myself.RemoveAllDesire();
myself.AddMoveToDesire(pos0.x, pos0.y, pos0.z, 100);
myself.i_ai1 = pos0.x;
myself.i_ai2 = pos0.y;
myself.c_ai0 = c0;

}

}

}
if (script_event_arg1 == 2219021 && myself.p_state != 3) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 1) {

} else {
myself.ChangeMoveType(0);
pos0 = gg.GetRandomPosInCreature(c0, minDistance, maxDistance);
myself.RemoveAllDesire();
myself.AddMoveToDesire(pos0.x, pos0.y, pos0.z, 100);
myself.i_ai1 = pos0.x;
myself.i_ai2 = pos0.y;

}

}

}
if (script_event_arg1 == 2219020 && myself.p_state != 3) {
myself.RemoveAllDesire();
myself.i_ai0 = 0;
myself.i_ai3 = 0;
myself.EquipItem(THS_Weapon);
myself.AddTimerEx(2219009, 3000);

}
if (script_event_arg1 == 2219024) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) != 1) {
myself.c_ai1 = c0;
myself.i_ai4 = 1;
myself.AddTimerEx(2219012, 3 * 60 * 1000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2219009) {
if (myself.i_ai0 == 0 && myself.i_ai3 == 0) {
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);

}

}
if (timer_id == 2219010) {
if (myself.i_ai0 == 1) {
myself.i_quest0 = 1;
myself.AddUseSkillDesire(myself.sm, 414908417, 1, 0, 1000000);
myself.ChangeNPCState(myself.sm, 2);
myself.ChangeMoveType(0);
myself.AddTimerEx(2219011, 5 * 60 * 1000);

}
if (myself.i_ai3 == 1) {
myself.i_quest0 = 1;
myself.AddUseSkillDesire(myself.sm, 414973953, 1, 0, 1000000);
myself.ChangeNPCState(myself.sm, 1);
myself.ChangeMoveType(0);
myself.AddTimerEx(2219011, 5 * 60 * 1000);

}

}
if (timer_id == 2219011) {
myself.i_quest0 = 0;
myself.ChangeNPCState(myself.sm, 3);
myself.ChangeMoveType(1);

}
if (timer_id == 2219012) {
myself.i_ai4 = 0;

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z, HandlerParam maker0, HandlerParam i0) {
if (myself.i_ai1 == x && myself.i_ai2 == y) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {

}
myself.EquipItem(OHS_Weapon);
myself.AddTimerEx(2219010, 3000);

}
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (gg.HaveMemo(last_attacker, 289) == 1) {
if (gg.GetMemoState(last_attacker, 289) == 1) {
if (myself.c_ai1 == last_attacker && myself.i_ai4 == 1) {
if (gg.Rand(1000) < 699) {
myself.GiveItem1(last_attacker, 15712, 1);

}

} else if (gg.Rand(1000) < 699) {
myself.GiveItem1(last_attacker, 15713, 1);

}

}

}
	}


}