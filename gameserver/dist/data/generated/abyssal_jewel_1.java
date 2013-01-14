package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class abyssal_jewel_1 extends citizen {
	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(337);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.GetMemoState(attacker, 337) == 40000 || gg.GetMemoState(attacker, 337) == 40001 && gg.HaveMemo(attacker, 337) == 1) {
if (myself.sm.hp < myself.sm.max_hp * 0.800000 && myself.i_quest0 == 0) {
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.CreateOnePrivate(1027168, "jewel_guardian_mara", 0, 1);
myself.i_quest0 = 1;
myself.AddTimerEx(233753, 1000 * 60 * 15);

}
if (myself.sm.hp < myself.sm.max_hp * 0.400000 && gg.OwnItemCount(attacker, 3859) == 0) {
myself.GiveItem1(attacker, 3859, 1);
myself.SoundEffect(attacker, "ItemSound.quest_itemget");
myself.AddTimerEx(233751, 1000 * 60 * 4);

}

}
if (myself.sm.hp < myself.sm.max_hp * 0.100000) {
myself.Despawn();

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(337);
if (timer_id == 233751 || timer_id == 233753) {
myself.Despawn();

}
super;
	}


}