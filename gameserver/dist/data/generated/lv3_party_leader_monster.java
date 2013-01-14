package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_party_leader_monster extends lv3_monster {
	protected String Privates = "orc:party_private:1:20sec";

	protected void CREATED() {
myself.CreatePrivates(Privates);
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam c0) {
c0 = attacker;
if (c0.master) {
c0 = c0.master;

}
if (c0.is_pc == 1) {
if (c0.dbid != myself.sm.param2) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
gg.SendScriptEvent(myself.c_ai1, 1000, 0);

}
myself.Despawn();
return;

} else if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 50);

}

}
	}


}