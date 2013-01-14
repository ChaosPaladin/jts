package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_grail_protection extends default_npc {
	protected int Skill01_ID = 414580737;
	protected int TIME_TO_DIE = 50001;
	protected int TIME_TO_FOLLOW = 50002;
	protected int TIME_EXPLODE = 5003;
	protected int DIST_CHECK = 5004;

	protected void CREATED(HandlerParam c0) {
myself.ChangeStatus(2);
myself.AddTimerEx(TIME_TO_FOLLOW, 1 * 100);
myself.AddTimerEx(TIME_TO_DIE, 2 * 60 * 1000);
myself.AddTimerEx(DIST_CHECK, 1 * 100);
c0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
myself.ChangeMasterName(myself.sm, "****" + c0.name + "****");
if (myself.IsInCategory(112, c0.occupation)) {
myself.ChangeMoveType(0);
myself.FixMoveType(1);

} else if (myself.IsInCategory(3, c0.occupation)) {
myself.ChangeMoveType(0);
myself.FixMoveType(1);

} else {
myself.ChangeMoveType(1);
myself.FixMoveType(1);

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply) {
if (reply == 0) {
myself.AddAttackDesire(creature, 1, 10000);
myself.FixMoveType(0);
myself.ChangeMoveType(0);
myself.FixMoveType(1);

}
if (reply == 1) {
myself.AddAttackDesire(creature, 1, 10000);
myself.FixMoveType(0);
myself.ChangeMoveType(1);
myself.FixMoveType(1);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 2114007) {
myself.Suicide();

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam success) {
if (success == 1) {
myself.AddTimerEx(TIME_EXPLODE, 1 * 100);

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0) {
myself.AddTimerEx(TIME_TO_FOLLOW, 1 * 100);
if (timer_id == TIME_TO_FOLLOW) {
if (myself.sm.param1 != 0) {
c0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.IsInCategory(112, c0.occupation)) {
myself.ChangeMoveType(0);
myself.FixMoveType(1);
myself.AddAttackDesire(c0, 1, 10);

} else if (myself.IsInCategory(3, c0.occupation)) {
myself.ChangeMoveType(0);
myself.FixMoveType(1);
myself.AddAttackDesire(c0, 1, 10);

} else {
myself.ChangeMoveType(1);
myself.FixMoveType(1);
myself.AddAttackDesire(c0, 1, 10);

}

}

}

} else if (timer_id == TIME_TO_DIE) {
myself.Suicide();

} else if (timer_id == TIME_EXPLODE) {
myself.Suicide();

} else if (timer_id == DIST_CHECK) {
myself.AddTimerEx(DIST_CHECK, 1 * 100);
if (myself.sm.param1 != 0) {
c0 = gg.GetCreatureFromID(myself.sm.param1);
if (myself.DistFromMe(c0) < 100) {
myself.RemoveAllDesire();
myself.ChangeMasterName(myself.sm, c0.name);
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 1, 1000000);

} else if (myself.DistFromMe(c0) > 200000) {
myself.Suicide();

} else if (myself.DistFromMe(c0) < 150 && myself.i_ai1 == 2) {
myself.i_ai1 = 3;
myself.ChangeMasterName(myself.sm, "*" + c0.name + "*");

} else if (myself.DistFromMe(c0) < 200 && myself.i_ai1 == 1) {
myself.i_ai1 = 2;
myself.ChangeMasterName(myself.sm, "**" + c0.name + "**");

} else if (myself.DistFromMe(c0) < 250 && myself.i_ai1 == 0) {
myself.i_ai1 = 1;
myself.ChangeMasterName(myself.sm, "***" + c0.name + "***");

}

}

}
super;
	}


}