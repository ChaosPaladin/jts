package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class serial_inzone_maker extends inzone_maker {
	protected String keym_maker_1 = "pailaka_1823_12m1";
	protected String keym_maker_2 = "pailaka_1823_18m1";
	protected String keym_maker_3 = "pailaka_1823_23m1";
	protected String keym_maker_4 = "pailaka_1823_36m1";
	protected String boss_maker = "pailaka_1823_bossm1";
	protected int on_start_spawn = 0;

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam reply, HandlerParam died, HandlerParam s0) {
if (gg.IsSameString(myself.name, keym_maker_1) == 1) {
s0 = keym_maker_2;

}
if (gg.IsSameString(myself.name, keym_maker_2) == 1) {
s0 = keym_maker_3;

}
if (gg.IsSameString(myself.name, keym_maker_3) == 1) {
s0 = keym_maker_4;

}
if (gg.IsSameString(myself.name, keym_maker_4) == 1) {
s0 = boss_maker;

}
if (gg.IsSameString(myself.name, boss_maker) == 0) {
i0 = myself.GetInZoneID();
maker0 = gg.InstantZone_GetNpcMaker(i0, s0);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}

}
super;
	}


}