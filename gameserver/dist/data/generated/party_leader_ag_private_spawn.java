package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_ag_private_spawn extends party_leader_aggressive {
	protected void CREATED() {
myself.i_ai1 = 0;
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
f0 = 0.000000;
if (private != myself.sm && private.hp < private.max_hp / 3 && myself.sm.hp > 1 && myself.i_ai1 < 15) {
myself.CreateOnePrivateEx(1018327, "party_private_ag_private_spawn", 0, 0, gg.FloatToInt(private.x), gg.FloatToInt(private.y), gg.FloatToInt(private.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
myself.CreateOnePrivateEx(1018327, "party_private_ag_private_spawn", 0, 0, gg.FloatToInt(private.x), gg.FloatToInt(private.y), gg.FloatToInt(private.z), 0, 1000, gg.GetIndexFromCreature(attacker), 0);
gg.SendScriptEvent(private, 10023, 0);
myself.i_ai1 = myself.i_ai1 + 1;

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {
return;

}
if (myself.GetLifeTime() > SeeCreatureAttackerTime && myself.InMyTerritory(myself.sm)) {
myself.AddAttackDesire(creature, 1, 200);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("schuttgart13_mb2314_05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 10005, 0, 0);

}
myself.BroadcastScriptEvent(11036, 1, 8000);
	}


}