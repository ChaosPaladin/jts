package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class flying_npc_shocker extends default_npc {
	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (script_event_arg1 == 10001) {
myself.Shout("스킬 발동");
myself.AddUseSkillDesire(myself.sm, 339673089, 1, 1, 2000000);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam success) {
myself.Despawn();
	}


}