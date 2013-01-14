package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_legend_orc_warrior extends warrior_basic {
	protected void CREATED() {
super;
	}

	protected void MY_DYING(HandlerParam maker0, HandlerParam last_attacker) {
if (gg.Rand(100) < 2) {
switch (gg.Rand(2)) {
case 0: {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
myself.CreateOnePrivateEx(1022707, "ai_legend_orc_ev_vice", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(last_attacker), 0, 0);
gg.SendMakerScriptEvent(maker0, 2114001, 0, 0);

}
break;

}
case 1: {
if (gg.Rand(2) < 1) {
myself.CreateOnePrivateEx(1018815, "ai_legend_orc_ev_leader", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(last_attacker), 0, 0);

}
break;

}

}

}
	}


}