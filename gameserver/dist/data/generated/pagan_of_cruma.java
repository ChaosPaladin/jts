package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pagan_of_cruma extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
always_list.SetInfo(0, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
always_list.SetInfo(0, target);

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(134);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (gg.IsNull(c0) == 0) {
if (gg.HaveMemo(c0, 134) >= 1 && gg.GetMemoState(c0, 134) == 3 && gg.OwnItemCount(c0, 10337) < 3 && myself.DistFromMe(c0) <= 1500) {
myself.GiveItem1(c0, 10337, 1);
if (gg.OwnItemCount(c0, 10337) >= 2) {
myself.SetFlagJournal(c0, 134, 4);
myself.ShowQuestMark(c0, 134);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c0, "ItemSound.quest_itemget");

}

}

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

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(134);
if (timer_id == 13401) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam i0) {
myself.SetCurrentQuestID(134);
myself.AddTimerEx(13401, 1000 * 60);
super;
	}


}