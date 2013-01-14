package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_lilith_ssq extends default_npc {
	protected void CREATED() {
myself.BroadcastScriptEvent(9274212, 0, 3000);
myself.i_ai7 = 0;
myself.i_ai8 = 0;
myself.AddTimerEx(1001, 1000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.MakeAttackEvent(creature, 100, 0);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (attacker.is_pc == 1) {
return;

}
myself.AddUseSkillDesire(attacker, 405471233, 0, 0, 1000000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1001) {
if (myself.i_ai8 == 0) {
myself.Shout(gg.MakeFString(19615, "", "", "", "", ""));
myself.i_ai8 = 1;

} else if (gg.Rand(100) < 10) {
i0 = gg.Rand(3);
if (i0 < 1) {
myself.Shout(gg.MakeFString(19616, "", "", "", "", ""));

} else if (i0 < 2) {
myself.Shout(gg.MakeFString(19617, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(19618, "", "", "", "", ""));

}

}
myself.BroadcastScriptEvent(9274212, myself.sm.id, 3000);
myself.AddTimerEx(1001, 1000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 9274213) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai7 = script_event_arg2;
myself.MakeAttackEvent(c0, 100, 0);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id, HandlerParam c0) {
c0 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 1) {
return;

}
myself.AddUseSkillDesire(c0, 405471233, 0, 0, 1000000);

}
	}


}