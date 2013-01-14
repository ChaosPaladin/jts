package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_warrior_anger extends warrior_basic {
	protected int AngerSkill_id = 458752001;

	protected void MY_DYING() {
myself.BroadcastScriptEvent(88003, 0, 900);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (myself.sm.alive == 1 && script_event_arg1 == 88003) {
myself.AddUseSkillDesire(myself.sm, AngerSkill_id, 1, 1, 999999999999999999);

}
	}


}