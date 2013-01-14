package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fortress_subsidiary extends warrior_basic {
	protected int fortress_id = 0;

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.Fortress_GetPledgeSiegeState(creature) != 2) {
return;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.Fortress_GetPledgeSiegeState(attacker) != 2) {
return;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.Fortress_GetPledgeSiegeState(attacker) != 2) {
return;

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (myself.Fortress_GetPledgeSiegeState(attacker) != 2) {
return;

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (myself.Fortress_GetPledgeSiegeState(speller) != 2) {
return;

}
super;
	}


}