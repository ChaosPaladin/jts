package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_wizard_for_friend extends party_private_wizard_dd2 {
	protected int CreatureID = 0;

	protected void CREATED() {
myself.i_ai4 = 0;
myself.sm.flag = CreatureID;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 4051) {
if (myself.i_ai4 == 1) {
myself.LookNeighbor(300);
myself.AddTimerEx(4051, 3 * 60 * 1000);

}

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam f0) {
if (creature.flag == myself.sm.flag) {
myself.i_ai4 = 0;

} else {
myself.AddAttackDesire(creature, 1, 1000);
super;

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (private != myself.sm) {
myself.i_ai4 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (attacker.flag != myself.sm.flag) {
myself.AddAttackDesire(attacker, 1, 1000);
super;

}
	}


}