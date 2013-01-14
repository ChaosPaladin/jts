package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kasha_spider extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c1.quest_last_reward_time = 0;
if (gg.HaveMemo(c1, 419) == 1 && gg.OwnItemCount(c1, 3421) == 1) {
if (gg.OwnItemCount(c1, 3426) < 50 && gg.Rand(100) < 60) {
myself.GiveItem1(c1, 3426, 1);
if (gg.OwnItemCount(c1, 3426) >= 50) {
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
case 1: {
myself.SetCurrentQuestID(268);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 10869) == 29) {
myself.GiveItem1(target, 10869, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 268, 2);
myself.SetFlagJournal(target, 268, 2);
myself.ShowQuestMark(target, 268);

} else {
myself.GiveItem1(target, 10869, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}


}