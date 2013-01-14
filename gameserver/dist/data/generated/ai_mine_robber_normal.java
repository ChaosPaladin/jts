package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_robber_normal extends warrior_behavior {
	protected void CREATED() {
super;
if (myself.sm.param1 == 1000) {
if (myself.IsNullCreature(gg.GetCreatureFromIndex(myself.sm.param2)) == 0) {
myself.AddAttackDesire(gg.GetCreatureFromIndex(myself.sm.param2), 1, 10000);
gg.ShowOnScreenMsgStr(gg.GetCreatureFromIndex(myself.sm.param2), 5, 0, 1, 1, 1, 1, 5000, 0, gg.MakeFString(1800830, "", "", "", "", ""));

}

}
	}


}