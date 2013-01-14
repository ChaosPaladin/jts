package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_golem_revive extends warrior_basic {
	protected int Privates01_sil = 1022802;
	protected String Privates01_ai = "golem_cannon2_p";
	protected int Privates02_sil = 1022803;
	protected String Privates02_ai = "golem_cannon3_p";

	protected void CREATED() {
myself.i_ai9 = 0;
super;
	}

	protected void MY_DYING(HandlerParam c0) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc != 0 && myself.IsInCategory(0, c0.occupation)) {
if (myself.i_ai9 == 1) {
myself.Say("물리형");

}
myself.CreateOnePrivateEx(Privates01_sil, Privates01_ai, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, c0.id, 0);

} else {
if (myself.i_ai9 == 1) {
myself.Say("마법형");

}
myself.CreateOnePrivateEx(Privates02_sil, Privates02_ai, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, c0.id, 0);

}

}
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
super;
	}


}