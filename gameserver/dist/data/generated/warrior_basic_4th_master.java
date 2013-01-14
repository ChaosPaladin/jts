package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_basic_4th_master extends warrior_basic {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam f0, HandlerParam i0) {
if (gg.Rand(100) <= 1) {
myself.BroadcastScriptEvent(19261001, gg.GetIndexFromCreature(attacker), 2000);

}
super;
	}


}