package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_adiantum_skilluse extends abstract_npc {
	protected int Skill01_id_1 = 373686273;
	protected int Skill01_id_2 = 373686274;

	protected void CREATED() {
myself.AddTimerEx(1000, 1);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
myself.BroadcastScriptEvent(2316002, gg.GetIndexFromCreature(myself.sm), 2000);
myself.AddTimerEx(2000, 5000);

}
if (timer_id == 2000) {
myself.Despawn();

}
	}

	protected void SPELLED(HandlerParam skill_name_id) {
if (skill_name_id == Skill01_id_1 || skill_name_id == Skill01_id_2) {

}
	}


}