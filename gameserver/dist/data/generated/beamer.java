package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class beamer extends wizard_ag_ddmagic2_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 328)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 42) == 1 && gg.GetMemoState(target, 42) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 42) == 1 && gg.GetMemoState(target, 42) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 42) == 1 && gg.GetMemoState(target, 42) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(214);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 214) && gg.OwnItemCount(c1, 2676) == 1 && gg.OwnItemCount(c1, 2690) == 1 && gg.OwnItemCount(c1, 2694) == 1 && gg.OwnItemCount(c1, 2695) < 5) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2695, 1);
if (gg.OwnItemCount(c1, 2695) >= 4 && gg.OwnItemCount(c1, 2696) >= 5 && gg.OwnItemCount(c1, 2697) >= 2) {
myself.SetFlagJournal(c1, 214, 17);
myself.ShowQuestMark(c1, 214);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(328);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 78) {
myself.GiveItem1(target, 1347, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 < 79) {
myself.GiveItem1(target, 1366, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(42);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000 && 1000 != 0) {
if (gg.OwnItemCount(target, 7548) + 1 >= 30) {
if (gg.OwnItemCount(target, 7548) < 30) {
myself.GiveItem1(target, 7548, 30 - gg.OwnItemCount(target, 7548));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 42, 3);
myself.ShowQuestMark(target, 42);

}
myself.SetMemoState(target, 42, 2 * 10 + 2);

} else {
myself.GiveItem1(target, 7548, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
super;
	}


}