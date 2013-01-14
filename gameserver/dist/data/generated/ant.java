package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ant extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3135) == 1 && gg.OwnItemCount(target, 3136) < 70) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3135) == 1 && gg.OwnItemCount(target, 3136) < 70) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3135) == 1 && gg.OwnItemCount(target, 3136) < 70) {
always_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 142) == 1 && gg.GetMemoState(target, 142) == 7 && myself.GetOneTimeQuestFlag(target, 142) == 0) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 142) == 1 && gg.GetMemoState(target, 142) == 7 && myself.GetOneTimeQuestFlag(target, 142) == 0) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 142) == 1 && gg.GetMemoState(target, 142) == 7 && myself.GetOneTimeQuestFlag(target, 142) == 0) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

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
myself.SetCurrentQuestID(216);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(216);
i0 = 0;
if (gg.Rand(100) < 100 && target.occupation == 54 && myself.IsSpoiled() == 1) {
i0 = i0 + 5;

}
if (gg.Rand(100) < 50 && target.occupation == 56) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3137, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.Rand(100) < 100 && gg.OwnItemCount(target, 3136) + i0 < 70) {
i0 = i0 + 5;

}
if (i0 >= 1) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3136, i0);
if (gg.OwnItemCount(target, 3136) + i0 >= 70) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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
case 2: {
myself.SetCurrentQuestID(142);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 338) {
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
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 205) {
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