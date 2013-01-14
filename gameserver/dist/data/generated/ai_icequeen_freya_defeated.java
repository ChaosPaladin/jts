package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_freya_defeated extends default_npc {
	protected int ITEM_invisi_1hs = 15280;

	protected void CREATED() {
myself.EquipItem(ITEM_invisi_1hs);
myself.ChangeStatus(0);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1) {
if (script_event_arg1 == 23140020) {
myself.Despawn();

}
	}


}