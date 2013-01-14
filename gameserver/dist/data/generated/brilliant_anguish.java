package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class brilliant_anguish extends saint_ninja {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 626) == 1 && gg.GetMemoState(target, 626) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 626) == 1 && gg.GetMemoState(target, 626) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 626) == 1 && gg.GetMemoState(target, 626) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 627) == 1 && gg.GetMemoState(target, 627) == 1 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 627) == 1 && gg.GetMemoState(target, 627) == 1 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 627) == 1 && gg.GetMemoState(target, 627) == 1 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 21 && gg.OwnItemCount(target, 9743) < 62) {
always_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 21 && gg.OwnItemCount(target, 9743) < 62) {
always_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 21 && gg.OwnItemCount(target, 9743) < 62) {
always_list.SetInfo(3, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(4, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 3: {
myself.SetCurrentQuestID(236);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(target, 9743, 1);
if (gg.OwnItemCount(target, 9743) >= 61) {
myself.SetFlagJournal(target, 236, 13);
myself.ShowQuestMark(target, 236);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 236, 22);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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
myself.SetCurrentQuestID(336);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 210) {
myself.GiveItem1(target, 3490, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(626);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 848) {
if (gg.OwnItemCount(target, 7169) + 1 >= 300) {
if (gg.OwnItemCount(target, 7169) < 300) {
myself.GiveItem1(target, 7169, 300 - gg.OwnItemCount(target, 7169));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 626, 2);
myself.ShowQuestMark(target, 626);
myself.SetMemoState(target, 626, 1 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7169, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(627);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 875) {
if (gg.OwnItemCount(target, 7171) + 1 >= 300) {
if (gg.OwnItemCount(target, 7171) < 300) {
myself.GiveItem1(target, 7171, 300 - gg.OwnItemCount(target, 7171));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 627, 2);
myself.ShowQuestMark(target, 627);
myself.SetMemoState(target, 627, 1 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7171, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 280) {
myself.GiveItem1(target, 7586, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
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