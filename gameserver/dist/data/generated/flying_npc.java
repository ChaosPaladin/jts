package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class flying_npc extends default_npc {
	protected int Freeway_ID = 34;
	protected int FreewayMove = 0;
	protected int OHS_Weapon = 9136;
	protected int THS_Weapon = 9137;

	protected void CREATED(HandlerParam reply) {
if (Freeway_ID == -1 || FreewayMove == -1) {
myself.Say("슈퍼포인트 없음");

} else {
myself.AddMoveFreewayDesire(Freeway_ID, FreewayMove, 2000);

}
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void NODE_ARRIVED(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam success) {
if (success == 1) {
myself.Despawn();

}
if (script_event_arg1 == 3) {
myself.EquipItem(OHS_Weapon);

} else if (script_event_arg1 == 4) {
myself.UnequipWeapon();

} else if (script_event_arg1 == 36) {
myself.EquipItem(OHS_Weapon);

} else if (script_event_arg1 == 37) {
myself.UnequipWeapon();

} else if (script_event_arg1 == 51) {
myself.EquipItem(OHS_Weapon);

} else if (script_event_arg1 == 52) {
myself.UnequipWeapon();
myself.BroadcastScriptEventEx(10005, gg.GetIndexFromCreature(myself.sm), 0, 5000);
myself.BroadcastScriptEventEx(10002, gg.GetIndexFromCreature(myself.sm), 0, 8000);

} else if (script_event_arg1 == 53) {
myself.BroadcastScriptEventEx(10001, 0, 0, 5000);
myself.BroadcastScriptEventEx(10002, gg.GetIndexFromCreature(myself.sm), 0, 8000);
myself.AddTimerEx(1001, 3000);

} else if (script_event_arg1 == 54) {
myself.EquipItem(OHS_Weapon);

} else if (script_event_arg1 == 55) {
myself.UnequipWeapon();

} else if (script_event_arg1 == 61) {
myself.EquipItem(OHS_Weapon);

} else if (script_event_arg1 == 62) {
myself.UnequipWeapon();

}
myself.AddMoveFreewayDesire(Freeway_ID, FreewayMove, 50);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.AddEffectActionDesire(myself.sm, 4, 10000, 1000000);
myself.AddTimerEx(1002, 10000);

} else if (timer_id == 1002) {
myself.BroadcastScriptEventEx(10002, gg.GetIndexFromCreature(myself.sm), 0, 8000);
myself.AddTimerEx(1003, 10000);

} else if (timer_id == 1003) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, 339738625, 0, 1, 2000000);

}
myself.AddTimerEx(1004, 3000);

} else if (timer_id == 1004) {
myself.AddTimerEx(1005, 25000);

} else if (timer_id == 1005) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, 339738625, 0, 1, 2000000);

} else {
myself.Shout("목표가 없다");

}
myself.AddTimerEx(2000, 10000);

} else if (timer_id == 2000) {
myself.AddMoveFreewayDesire(Freeway_ID, FreewayMove, 100);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10004) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.c_ai0 = c0;

}

}
	}


}