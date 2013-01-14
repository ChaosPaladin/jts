package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_tollese extends warrior_basic {
	protected String last_stand_maker = "gludio58_1926_last_standm1";
	protected String my_maker = "gludio58_mb1926_501m1";

	protected void CREATED(HandlerParam maker1) {
myself.EffectMusic(myself.sm, 8000, "Rm01_A");
maker1 = gg.GetNpcMaker(my_maker);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1001, 0, 0);

}
maker1 = gg.GetNpcMaker(last_stand_maker);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1001, 0, 0);

}
myself.RegisterGlobalMap(16, myself.sm.id);
myself.SetDBValue(myself.sm, 0);
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);

}
super;
	}

	protected void MY_DYING(HandlerParam maker0, HandlerParam maker1) {
maker0 = gg.GetNpcMaker(last_stand_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010013, 0, 0);

}
maker1 = gg.GetNpcMaker(my_maker);
if (gg.IsNull(maker1) == 0) {
gg.SendMakerScriptEvent(maker1, 1000, 0, 0);

}
super;
myself.RegisterGlobalMap(16, -1);
myself.SetDBValue(myself.sm, 0);
	}


}