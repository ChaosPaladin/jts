package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class farhite extends wizard_pa_ddmagic2_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 140) == 1 && gg.GetMemoState(target, 140) == 4) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 140) == 1 && gg.GetMemoState(target, 140) == 4) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 140) == 1 && gg.GetMemoState(target, 140) == 4) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 141) == 1 && gg.GetMemoState(target, 141) == 2 && myself.GetOneTimeQuestFlag(target, 141) == 0 && gg.OwnItemCount(target, 10350) < 30) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 141) == 1 && gg.GetMemoState(target, 141) == 2 && myself.GetOneTimeQuestFlag(target, 141) == 0 && gg.OwnItemCount(target, 10350) < 30) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 141) == 1 && gg.GetMemoState(target, 141) == 2 && myself.GetOneTimeQuestFlag(target, 141) == 0 && gg.OwnItemCount(target, 10350) < 30) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
always_list.SetInfo(2, target);
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
case 2: {
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
myself.SetCurrentQuestID(140);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 92) {
myself.GiveItem1(target, 10347, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(141);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 92) {
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
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 62) {
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