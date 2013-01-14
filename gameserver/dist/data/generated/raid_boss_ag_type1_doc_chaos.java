package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_ag_type1_doc_chaos extends raid_boss_ag_type1 {
	protected void CREATED() {
myself.AddTimerEx(1001, 1000);
myself.i_ai1 = myself.GetCurrentTick();
myself.i_ai2 = 0;
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.SpecialCamera3(myself.sm, 30, -200, 20, 6000, 700, 8000, 0, 0, 0, 0, 0);
myself.AddTimerEx(1002, 10000);

}
if (timer_id == 1002) {
myself.i_ai2 = 1;

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.i_ai1 = myself.GetCurrentTick();
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
myself.i_ai1 = myself.GetCurrentTick();
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.i_ai2 == 1) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void NO_DESIRE() {
if (myself.GetCurrentTick() - myself.i_ai1 > 60 * 20) {
myself.Say(gg.MakeFString(1010582, "", "", "", "", ""));
gg.SendScriptEvent(myself.boss, 10029, 0);
myself.Despawn();

}
	}

	protected void MY_DYING() {
myself.Say(gg.MakeFString(1010583, "", "", "", "", ""));
gg.SendScriptEvent(myself.boss, 10029, 0);
	}


}