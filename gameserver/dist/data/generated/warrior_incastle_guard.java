package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_incastle_guard extends warrior_basic {
	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.Say("넌 이미 죽어있다");
gg.SetStepWithoutActor_FieldCycle(FieldCycle, 8, 5);

}
super;
	}


}