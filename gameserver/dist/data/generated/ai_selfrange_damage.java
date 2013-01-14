package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_selfrange_damage extends abstract_npc {
	protected int Skill01_id = 374472705;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (damage == 0) {
return;

}
myself.AddUseSkillDesire(myself.sm, Skill01_id, 1, 0, 50000000);
myself.AddTimerEx(1000, 2000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.Despawn();

}
	}


}