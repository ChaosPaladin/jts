package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_premium_criminal extends default_npc {
	protected int MoveAroundSocial = 0;

	protected void CREATED(HandlerParam i0) {
myself.Summon_SetOption(3, 0);
myself.AddPetDefaultDesire_Follow(20.000000);
myself.AddTimerEx(1671, 10000);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1671) {
if (MoveAroundSocial > 0) {
if (myself.sm.hp > myself.sm.max_hp * 0.400000 && myself.sm.alive != 0 && myself.p_state != 3) {
myself.AddEffectActionDesire(myself.sm, 1, MoveAroundSocial * 1000 / 30, 50);

}

}
myself.AddTimerEx(1671, 10000);

}
	}

	protected void PET_DIED(HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (i0 == 1 && i1 == 0) {
i2 = gg.Rand(10) + 1;
if (myself.sm.master.pk_count <= i2) {
myself.IncrementParam(myself.sm.master, 9, -1 * myself.sm.master.pk_count);

} else {
myself.IncrementParam(myself.sm.master, 9, -1 * i2);

}

}
	}


}