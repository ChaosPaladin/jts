package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class c_tower_warrior_summon extends warrior_use_skill {
	protected String MyMaker = "maker_name";

	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam maker0) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 30 && myself.i_ai4 == 0) {
myself.i_ai4 = 1;
maker0 = gg.GetNpcMaker(MyMaker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 88002, 0, 0);

}

}
super;
	}


}