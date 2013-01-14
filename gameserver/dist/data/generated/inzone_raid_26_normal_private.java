package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inzone_raid_26_normal_private extends inzone_combat_monster {
	protected int Skill01 = 309264385;
	protected int Skill01_Probablity = 10;
	protected int Skill01_Target_Type = 0;

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 4) {
myself.Despawn();

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
if (private == myself.boss) {
myself.Despawn();

}

}
	}


}