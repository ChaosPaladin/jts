package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_fire_elemental_s extends br_fire_elemental_base {
	protected int SKILL_BURN = 1511915521;
	protected int max_hp = 25;
	protected int rate_cold = 50;

	protected void CREATED() {
myself.Say(gg.MakeFString(1900029, "", "", "", "", ""));
super;
	}

	protected void MY_DYING(HandlerParam c0) {
if (gg.Rand(100) < 52) {
myself.DropItem2(myself.sm, 20545, 2, myself.master.id);

}
if (gg.Rand(10) < 4) {
myself.DropItem2(myself.sm, 20546, 2, myself.master.id);

}
if (gg.Rand(100) < 26) {
myself.DropItem2(myself.sm, 22024, 2, myself.master.id);

}
if (gg.Rand(100) < 100) {
myself.DropItem2(myself.sm, 22025, 3, myself.master.id);

}
if (gg.Rand(10) < 8) {
myself.DropItem2(myself.sm, 20579, 1, myself.master.id);

}
if (gg.Rand(100) < 1) {
myself.DropItem2(myself.sm, 20580, 1, myself.master.id);

}
if (gg.Rand(100) < 8) {
myself.DropItem2(myself.sm, 20583, 1, myself.master.id);

}
if (gg.Rand(100) < 2) {
myself.DropItem2(myself.sm, 20584, 1, myself.master.id);

}
if (gg.Rand(10) < 2) {
myself.DropItem2(myself.sm, 20576, 1, myself.master.id);

}
myself.Say(gg.MakeFString(1900039, "", "", "", "", ""));
c0 = gg.GetCreatureFromIndex(myself.GetGlobalMap(104));
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1, 8);

}
	}


}