package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard extends citizen {
	protected String fnHi = "chi.htm";
	protected String fnYouAreChaotic = "chi.htm";
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 500.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void CREATED() {
myself.AddTimerEx(9903, 60 * 1000);
super;
	}

	protected void TALKED(HandlerParam talker) {
if (NoFnHi == 1) {
return;

}
if (talker.karma > 0) {

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddAttackDesire(attacker, 1, 2000);
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.karma > 0) {
myself.AddAttackDesire(creature, 1, 1500);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9903) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
myself.AddTimerEx(9903, 60 * 1000);

}
super;
	}


}