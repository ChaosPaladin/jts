package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_seeker extends default_npc {
	protected String frintessa_control_maker = "godard32_1713_102m1";

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam c0, HandlerParam maker0, HandlerParam i1, HandlerParam c1) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

} else {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, "godard32_1713_102m1");
if (gg.IsNull(maker0) == 0) {
i1 = myself.MPCC_GetMPCCId(creature);
c1 = myself.MPCC_GetMaster(i1);
if (myself.IsNullCreature(c1) == 0) {
gg.SendMakerScriptEvent(maker0, 2, i1, 0);

} else {
gg.SendMakerScriptEvent(maker0, 2, 0, 0);

}

}
myself.Despawn();

}
	}


}