package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cruma_ev_1st extends warrior_basic {
	protected int SaySpawn_Id = 1800176;
	protected int SpawnSkill = -1;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.AddUseSkillDesire(myself.sm, SpawnSkill, 1, 1, 1000000);
myself.Say(gg.MakeFString(SaySpawn_Id, "", "", "", "", ""));
myself.LookNeighbor(2000);
myself.AddTimerEx(2021, 40 * 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2021) {
myself.LookNeighbor(2000);
myself.i_ai2 = 1;
myself.AddTimerEx(2022, 5 * 1000);
myself.AddTimerEx(2021, 40 * 1000);

}
if (timer_id == 2022 && myself.i_ai2 == 1) {
if (myself.i_ai3 == 0) {
myself.Despawn();

} else {
myself.i_ai2 = 0;
myself.i_ai3 = 0;

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai0 == 1 && myself.i_ai2 == 1) {
if (myself.InMyTerritory(creature) == 1 && creature.is_pc == 1) {
if (creature.alive == 1) {
myself.i_ai1 = 1;

} else {
myself.i_ai1 = 0;

}

} else {
myself.i_ai1 = 0;

}
myself.i_ai3 = myself.i_ai3 + myself.i_ai1;

}
myself.i_ai0 = 1;
super;
	}


}