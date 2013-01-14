package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_around_pet_manager extends default_npc {
	protected String fnHi = "chi.htm";
	protected int MoveAroundSocial = 0;
	protected int MoveAroundSocial1 = 0;

	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(30.000000);
myself.AddTimerEx(5001, 3000);
myself.i_ai2 = gg.FloatToInt(myself.start_x);
myself.i_ai3 = gg.FloatToInt(myself.start_y);
myself.i_ai4 = gg.FloatToInt(myself.boss.z);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 5001) {
if (myself.IsMyBossAlive() == 0) {
myself.AddMoveToDesire(myself.i_ai2, myself.i_ai3, myself.i_ai4, 30);
myself.AddTimerEx(5001, 5000);

}

}
	}

	protected void MOVE_TO_FINISHED() {
myself.i_ai2 = gg.FloatToInt(myself.boss.x) - 50 + gg.Rand(100);
myself.i_ai3 = gg.FloatToInt(myself.boss.y) - 50 + gg.Rand(100);
	}


}