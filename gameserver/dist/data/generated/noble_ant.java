package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class noble_ant extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 370)) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 370)) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 370)) {
random1_list.SetInfo(3, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 142) == 1 && gg.GetMemoState(target, 142) == 7 && myself.GetOneTimeQuestFlag(target, 142) == 0) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 142) == 1 && gg.GetMemoState(target, 142) == 7 && myself.GetOneTimeQuestFlag(target, 142) == 0) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 142) == 1 && gg.GetMemoState(target, 142) == 7 && myself.GetOneTimeQuestFlag(target, 142) == 0) {
random1_list.SetInfo(4, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(5, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(224);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 3 && gg.OwnItemCount(c1, 3298) < 10) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 3298) == 9) {
myself.GiveItem1(c1, 3298, 1);
myself.SetMemoState(c1, 224, 4);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 4);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3298, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3351) && gg.OwnItemCount(c1, 3344) < 30) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3344) >= 28) {
myself.GiveItem1(c1, 3344, 2);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3344, 2);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(233);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 233) && gg.OwnItemCount(c1, 2902) == 1 && gg.OwnItemCount(c1, 2904) == 1) {
i0 = gg.Rand(100);
if (i0 > 65) {
if (gg.OwnItemCount(c1, 2909) == 0) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2909, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2908) == 0) {
if (1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2908, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

} else if (i0 > 30) {
if (gg.OwnItemCount(c1, 2907) == 0) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2907, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2906) == 0) {
if (1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2906, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

} else if (i0 > 0) {
if (gg.OwnItemCount(c1, 2905) == 0) {
myself.GiveItem1(c1, 2905, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

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
case 3: {
myself.SetCurrentQuestID(370);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 10) {
myself.GiveItem1(target, 5916, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(142);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 413) {
if (gg.OwnItemCount(target, 10352) >= 29) {
myself.DeleteItem1(target, 10352, gg.OwnItemCount(target, 10352));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 142, 5);
myself.ShowQuestMark(target, 142);
myself.SetMemoState(target, 142, 8);

} else {
myself.GiveItem1(target, 10352, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 25) {
myself.GiveItem1(target, 7586, 1);
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