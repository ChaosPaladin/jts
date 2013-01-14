package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_fire_elemental extends br_fire_elemental_base {
	protected int SKILL_BURN = 1511981057;
	protected int max_hp = 10;

	protected void CREATED() {
myself.Say(gg.MakeFString(1900028, "", "", "", "", ""));
super;
	}

	protected void MY_DYING(HandlerParam c0) {
if (gg.Rand(100) < 20) {
myself.DropItem2(myself.sm, 20582, 1, myself.master.id);

}
if (gg.Rand(100) < 100) {
myself.DropItem2(myself.sm, 22025, 1, myself.master.id);

}
if (gg.Rand(100) < 10) {
myself.DropItem2(myself.sm, 22024, 1, myself.master.id);

}
if (gg.Rand(1000) < 125) {
myself.DropItem2(myself.sm, 20579, 1, myself.master.id);

}
if (gg.Rand(100) < 1) {
myself.DropItem2(myself.sm, 20583, 1, myself.master.id);

}
if (gg.Rand(100) < 3) {
myself.DropItem2(myself.sm, 20576, 1, myself.master.id);

}
myself.Say(gg.MakeFString(1900038, "", "", "", "", ""));
c0 = gg.GetCreatureFromIndex(myself.GetGlobalMap(104));
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEvent(c0, 1, 1);

}
super;
	}


}