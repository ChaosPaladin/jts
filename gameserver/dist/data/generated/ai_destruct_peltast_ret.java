package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_peltast_ret extends ai_destruct_warrior_ret {
	protected void ATTACKED(HandlerParam attacker) {
if (myself.DistFromMe(attacker) < 150) {
myself.AddFleeDesireEx(attacker, 300, 100000);

}
super;
	}


}