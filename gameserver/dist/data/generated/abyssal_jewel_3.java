package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class abyssal_jewel_3 extends citizen {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(337);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.GetMemoState(attacker, 337) == 70000 && gg.HaveMemo(attacker, 337) == 1) {
if (myself.sm.hp < myself.sm.max_hp * 0.800000 && myself.i_quest0 == 0) {
myself.CreateOnePrivate(1027170, "jewel_guardian_pyton", 0, 1);
myself.CreateOnePrivate(1027170, "jewel_guardian_pyton", 0, 1);
myself.CreateOnePrivate(1027170, "jewel_guardian_pyton", 0, 1);
myself.CreateOnePrivate(1027170, "jewel_guardian_pyton", 0, 1);
myself.i_quest0 = 1;

}
if (myself.sm.hp < myself.sm.max_hp * 0.400000 && gg.OwnItemCount(attacker, 3861) == 0) {
myself.GiveItem1(attacker, 3861, 1);
myself.SoundEffect(attacker, "ItemSound.quest_itemget");

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.100000) {
myself.Despawn();

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(337);
if (timer_id == 233721) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(337);
myself.AddTimerEx(233721, 1000 * 3 * 60);
super;
	}


}