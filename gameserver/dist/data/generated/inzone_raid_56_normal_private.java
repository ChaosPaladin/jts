package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_56_normal_private extends default_npc {
	protected int super_skill = 355008513;

	protected void CREATED(HandlerParam c0) {
myself.AddTimerEx(8887, 1000);
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromIndex(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddAttackDesire(c0, 1, 1000);

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0, HandlerParam i0, HandlerParam skill_name_id) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1) {
myself.i_quest4 = myself.GetCurrentTick();

}
myself.AddAttackDesire(attacker, 1, 10);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 1) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
myself.RemoveAllDesire();
myself.AddAttackDesire(c0, 1, 100000);

}
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 8887) {
myself.AddUseSkillDesire(myself.sm, super_skill, 1, 0, 500000000000000000);

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss) {
myself.Despawn();

}
super;
	}


}