package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ol_mahum_betrayer extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(227);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 227) == 1 && gg.GetMemoState(c1, 227) == 8) {
myself.SetMemoState(c1, 227, 9);
myself.GiveItem1(c1, 2833, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.SetFlagJournal(c1, 227, 9);
myself.ShowQuestMark(c1, 227);

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

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(227);
if (timer_id == 7778) {
if (myself.i_quest0 < 12) {
myself.i_quest0 = myself.i_quest0 + 1;
myself.AddTimerEx(7778, 1000 * 5);

} else {
myself.Despawn();

}

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(227);
myself.AddTimerEx(7778, 1000 * 5);
myself.i_quest0 = 0;
myself.AddMoveToDesire(-AddMoveToDesire, 36787, -3709, 10000);
super;
	}


}