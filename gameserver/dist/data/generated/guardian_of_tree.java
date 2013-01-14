package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_of_tree extends party_private_ex {
	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(421);
if (timer_id == 42101) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0, HandlerParam i1) {
myself.SetCurrentQuestID(421);
i0 = myself.sm.param2;
i1 = myself.sm.param3;
if (i0 > 0) {
c0 = gg.GetCreatureFromIndex(i0);
myself.AddTimerEx(42101, 1000 * 300);
if (c0) {
if (i1 == -1) {
myself.AddUseSkillDesire(c0, 278069249, 0, 0, 1000000);

}
myself.AddAttackDesire(c0, 1, 2000);

}

} else {
i0 = gg.Rand(3);
if (i0 == 0) {
myself.Say(gg.MakeFString(42118, "", "", "", "", ""));

} else if (i0 == 1) {
myself.Say(gg.MakeFString(42119, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(42120, "", "", "", "", ""));

}

}
super;
	}


}