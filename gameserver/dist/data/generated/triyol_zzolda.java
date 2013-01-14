package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class triyol_zzolda extends warrior_aggressive_physicalspecial {
	protected void ATTACKED(HandlerParam attacker, HandlerParam c1, HandlerParam npc0) {
myself.SetCurrentQuestID(25);
c1 = attacker;
if (gg.FloatToInt(myself.sm.hp) <= 30) {
if (gg.HaveMemo(c1, 25) == 1 && gg.GetMemoState(c1, 25) == 8 && gg.OwnItemCount(c1, 7158) == 0 && c1.dbid == myself.sm.param2) {
myself.GiveItem1(c1, 7158, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.SetFlagJournal(c1, 25, 8);
myself.ShowQuestMark(c1, 25);
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Say(gg.MakeFString(2551, "", "", "", "", ""));
myself.Despawn();

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(25);
if (timer_id == 2501) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
myself.Say(gg.MakeFString(2550, c0.name, "", "", "", ""));

}

} else if (timer_id == 2502) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(25);
myself.AddTimerEx(2501, 500);
myself.AddTimerEx(2502, 1000 * 120);
i0 = myself.sm.param1;
if (i0 > 0) {
c0 = gg.GetCreatureFromIndex(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 20000);

}

}
super;
	}


}