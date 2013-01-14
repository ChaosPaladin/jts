package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class default_brazier_reed extends default_npc {
	protected int loot = 8605;
	protected int loot_roll = 33;
	protected int TID_SIGNAL_ROUTINE = 78002;
	protected int TIME_SIGNAL_ROUTINE = 60;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
myself.AddTimerEx(TID_SIGNAL_ROUTINE, TIME_SIGNAL_ROUTINE * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TID_SIGNAL_ROUTINE) {
myself.BroadcastScriptEvent(78010078, myself.sm.id, 300);
myself.AddTimerEx(TID_SIGNAL_ROUTINE, TIME_SIGNAL_ROUTINE * 1000);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.IsNullCreature(attacker) == 0) {
if (gg.Rand(3) == 0) {
if (myself.i_ai1 == 0) {
if (myself.sm.npc_class_id == 1018805) {
myself.Say(gg.MakeFString(1800851, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800854, "", "", "", "", ""));

}
myself.i_ai1 = 1;

}
if (babble_mode == 1) {
myself.Say("피격 신호 전송");

}
myself.BroadcastScriptEvent(78010079, attacker.id, 500);

}

}
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam i0) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (last_attacker.is_pc && myself.IsInCategory(1, last_attacker.occupation) || myself.IsInCategory(12, last_attacker.npc_class_id) && myself.IsInCategory(1, last_attacker.master.occupation)) {
if (babble_mode == 1) {
myself.Say("캐스터 공격에 사망 - 허브 드랍");

}
i0 = gg.Rand(100);
if (i0 <= loot_roll) {
myself.DropItem1(myself.sm, loot, 1);

}

}

}
	}


}