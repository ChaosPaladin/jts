package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_liliths_agent_wizard_ssq extends default_npc {
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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (attacker.is_pc == 1) {
return;

}
if (myself.DistFromMe(attacker) > 300) {
myself.AddUseSkillDesire(attacker, 405536769, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, 405602305, 0, 1, 1000000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 9274215) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.MakeAttackEvent(c0, 100, 0);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private) {
if (private == myself.boss) {
myself.MakeAttackEvent(attacker, 100, 0);

}
	}


}