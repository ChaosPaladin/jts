package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ol_cooker_guard extends warrior_basic {
	protected void CREATED() {
if (myself.IsNullCreature(myself.boss) == 0) {
myself.ChangeMoveType(0);
if (myself.sm.param1 == 1) {
myself.AddFollowDesire2(myself.boss, 100, 1, 100, 90 + gg.Rand(90));

} else {
myself.AddFollowDesire2(myself.boss, 100, 1, 100, 270 - gg.Rand(90));

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker) {
myself.AddAttackDesire(attacker, 1, 5000);
super;
	}

	protected void MY_DYING(HandlerParam last_attacker) {
if (gg.HaveMemo(last_attacker, 289) == 1 && gg.GetMemoState(last_attacker, 289) == 1) {
if (gg.Rand(1000) < 599) {
myself.GiveItem1(last_attacker, 15713, 1);
myself.SoundEffect(last_attacker, "ItemSound.quest_itemget");

}

}
	}


}