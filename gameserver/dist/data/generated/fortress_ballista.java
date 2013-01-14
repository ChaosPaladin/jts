package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_ballista extends citizen {
	protected int FameValue = 500;
	protected int Armor = 40;
	protected int Bomb = 196609;
	protected int pledge_lv_req = 5;

	protected void CREATED() {
myself.c_ai0 = gg.GetNullCreature();
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
if (skill_name_id == Bomb && gg.Rand(100) < 100 - Armor) {
myself.c_ai0 = attacker;
myself.Suicide();

}
	}

	protected void MY_DYING() {
if (myself.IsNullCreature(myself.c_ai0) == 1) {
return;

}
if (myself.Fortress_GetPledgeSiegeState(myself.c_ai0) != 2 || myself.IsNullCreature(myself.c_ai0.master) == 0 && myself.Fortress_GetPledgeSiegeState(myself.c_ai0.master) != 2) {
if (myself.GetPledgeSkillLevel(myself.c_ai0) < pledge_lv_req) {
return;

}
myself.UpdatePledgeNameValue(myself.c_ai0, FameValue);
myself.ShowSystemMessage(myself.c_ai0, 2217);

}
	}


}