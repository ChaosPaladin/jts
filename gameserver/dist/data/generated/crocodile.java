package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crocodile extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 338)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 32) == 1 && myself.GetOneTimeQuestFlag(target, 32) == 0 && gg.GetMemoState(target, 32) == 3 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 32) == 1 && myself.GetOneTimeQuestFlag(target, 32) == 0 && gg.GetMemoState(target, 32) == 3 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 32) == 1 && myself.GetOneTimeQuestFlag(target, 32) == 0 && gg.GetMemoState(target, 32) == 3 * 10 + 1) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 35) == 1 && gg.GetMemoState(target, 35) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 35) == 1 && gg.GetMemoState(target, 35) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 35) == 1 && gg.GetMemoState(target, 35) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 141) == 1 && gg.GetMemoState(target, 141) == 2 && myself.GetOneTimeQuestFlag(target, 141) == 0 && gg.OwnItemCount(target, 10350) < 30) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 141) == 1 && gg.GetMemoState(target, 141) == 2 && myself.GetOneTimeQuestFlag(target, 141) == 0 && gg.OwnItemCount(target, 10350) < 30) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 141) == 1 && gg.GetMemoState(target, 141) == 2 && myself.GetOneTimeQuestFlag(target, 141) == 0 && gg.OwnItemCount(target, 10350) < 30) {
random1_list.SetInfo(3, target);

}

}

}
target = last_attacker;
always_list.SetInfo(4, target);
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
case 4: {
myself.SetCurrentQuestID(711);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) / 1000 >= 1 && gg.GetMemoState(c0, 711) / 1000 < 101 && myself.DistFromMe(c0) <= 1500) {
i0 = gg.GetMemoState(c0, 711);
if (gg.GetMemoState(c0, 711) / 1000 < 100) {
myself.SetMemoState(c0, 711, i0 + 1000);

} else {
myself.SetMemoState(c0, 711, i0 + 1000);
myself.SetFlagJournal(c0, 711, 6);
myself.ShowQuestMark(c0, 711);
myself.SoundEffect(c0, "ItemSound.quest_middle");

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
myself.SetCurrentQuestID(338);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 4337, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.Rand(100) < 19) {
myself.GiveItem1(target, 4337, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(32);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(500);
if (i4 < 500) {
if (gg.OwnItemCount(target, 7166) + 1 >= 20) {
if (gg.OwnItemCount(target, 7166) <= 20) {
myself.GiveItem1(target, 7166, 20 - gg.OwnItemCount(target, 7166));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 32, 4);
myself.ShowQuestMark(target, 32);
myself.SetMemoState(target, 32, 3 * 10 + 2);

} else {
myself.GiveItem1(target, 7166, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(35);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500) {
if (gg.OwnItemCount(target, 7162) + 1 >= 10) {
if (gg.OwnItemCount(target, 7162) < 10) {
myself.GiveItem1(target, 7162, 10 - gg.OwnItemCount(target, 7162));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 35, 3);
myself.ShowQuestMark(target, 35);
myself.SetMemoState(target, 35, 2 * 10 + 2);

} else {
myself.GiveItem1(target, 7162, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(141);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 53) {
if (gg.OwnItemCount(target, 10350) >= 29) {
myself.GiveItem1(target, 10350, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 141, 3);
myself.ShowQuestMark(target, 141);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10350, 1);
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
if (gg.Rand(100) < 36) {
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