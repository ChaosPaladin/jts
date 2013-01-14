package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_73_normal_private extends default_npc {
	protected int soul_skill = 368574465;
	protected int super_skill = 355008513;
	protected int basic_hate = 1;

	protected void CREATED() {
myself.AddTimerEx(8887, 1000);
myself.AddTimerEx(9984, 20 * 1000);
myself.SetMaxHateListSize(10);
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(2, 5);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0, HandlerParam i0, HandlerParam i1) {
if (timer_id == 9984) {
gg.SendScriptEvent(myself.boss, 6, gg.GetIndexFromCreature(myself.sm));
myself.AddTimerEx(9984, 15 * 1000 + gg.Rand(5000));

}
if (timer_id == 8887) {
myself.AddUseSkillDesire(myself.sm, super_skill, 1, 0, 500000000000000000);

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
if (script_event_arg1 == 7) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddUseSkillDesire(c0, soul_skill, 0, 1, 999999999999999);

}

}
	}


}