package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_alone_summon_private extends raid_boss_type1 {
	protected String Privates = "orc:party_private:1:20sec";
	protected int MaxPrivateNumber = 10;

	protected void CREATED() {
myself.sm.weight_point = 10;
myself.CreatePrivates(Privates);
myself.i_ai0 = 0;
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (myself.i_ai0 < MaxPrivateNumber && private != myself.sm) {
myself.CreateOnePrivate(private.npc_class_id, private.ai, private.weight_point, private.respawn_time);
myself.i_ai0 = myself.i_ai0 + 1;

}
	}


}