package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_anakims_holly_ssq extends default_npc {
	protected void CREATED() {
super;
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire(myself.boss, 5);

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 9274214) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 10000, 0);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (attacker.is_pc == 1) {
return;

}
i0 = gg.Rand(100);
if (i0 < 20) {
if (gg.Rand(2) < 1) {
myself.AddUseSkillDesire(attacker, 405798913, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, 405864449, 0, 1, 1000000);

}

}
myself.AddAttackDesire(attacker, 1, 100);
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private) {
if (private == myself.boss) {
myself.MakeAttackEvent(attacker, 100, 0);

}
	}


}