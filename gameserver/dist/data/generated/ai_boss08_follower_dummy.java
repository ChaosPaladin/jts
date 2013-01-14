package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_follower_dummy extends default_npc {
	protected int SpecialSkill = 327942145;

	protected void CREATED() {
myself.AddUseSkillDesire(myself.sm, SpecialSkill, 1, 1, 1000000);
myself.AddTimerEx(1001, 10200);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.Despawn();

}
	}


}