package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ghost_of_umul extends warrior_aggressive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(22);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam c1) {
myself.SetCurrentQuestID(22);
c1 = attacker;
if (gg.HaveMemo(c1, 22) == 1 && gg.GetMemoState(c1, 22) == 10 && gg.OwnItemCount(c1, 7144) >= 1) {
myself.SetMemoState(c1, 22, 11);

} else if (gg.HaveMemo(c1, 22) == 1 && gg.GetMemoState(c1, 22) == 11 && gg.OwnItemCount(c1, 7144) >= 1) {
if (myself.i_quest0 == 1) {
myself.DeleteItem1(c1, 7144, gg.OwnItemCount(c1, 7144));
myself.GiveItem1(c1, 7145, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.SetFlagJournal(c1, 22, 11);
myself.ShowQuestMark(c1, 22);

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(22);
if (timer_id == 2203) {
myself.i_quest0 = 1;

} else if (timer_id == 2204) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(22);
myself.AddTimerEx(2203, 1000 * 90);
myself.AddTimerEx(2204, 1000 * 120);
i0 = myself.sm.param1;
if (i0 > 0) {
c0 = gg.GetCreatureFromIndex(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 2000);

}

}
super;
	}


}