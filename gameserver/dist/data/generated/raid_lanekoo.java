package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_lanekoo extends warrior_basic {
	protected String Privates = "scapegoat_of_ranku:npc_native:1:300sec;scapegoat_of_ranku:npc_native:1:300sec;scapegoat_of_ranku:npc_native:1:300sec;scapegoat_of_ranku:npc_native:1:300sec;";
	protected int Party_Type = 2;

	protected void CREATED(HandlerParam maker0) {
myself.i_ai2 = myself.GetCurrentTick();
myself.EffectMusic(myself.sm, 8000, "Rm01_A");
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
myself.BroadcastScriptEvent(1, 0, 2000);
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
myself.BroadcastScriptEvent(3, 0, 2000);
myself.InstantZone_MarkRestriction();
myself.InstantZone_Finish(10);
super;
	}


}