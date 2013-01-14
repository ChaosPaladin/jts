package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pig_soccer extends default_npc {
	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.AddMoveAroundDesire(5, 5);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
myself.c_ai0 = attacker;
if (skill_name_id == 12451841) {
myself.RemoveAllDesire();
myself.ChangeMoveType(1);
myself.AddFleeDesireEx(attacker, 500, 1000000);
myself.Say("불꽃 슛~~~");

} else if (skill_name_id == 196609) {
myself.RemoveAllDesire();
myself.Say("환상의 드리블");
myself.ChangeMoveType(0);
myself.AddFleeDesireEx(attacker, 150, 1000000);

} else if (skill_name_id == 16711681) {
myself.RemoveAllDesire();
myself.Say("엘튼장?울아빠에요..");
myself.StopMove();

}
	}


}