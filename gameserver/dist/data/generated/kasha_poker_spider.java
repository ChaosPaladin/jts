package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kasha_poker_spider extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 415) == 1 && gg.GetMemoState(target, 415) == 3 && gg.OwnItemCount(target, 8545) < 6) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 415) == 1 && gg.GetMemoState(target, 415) == 3 && gg.OwnItemCount(target, 8545) < 6) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 415) == 1 && gg.GetMemoState(target, 415) == 3 && gg.OwnItemCount(target, 8545) < 6) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 419) == 1 && gg.OwnItemCount(target, 3421) == 1 && gg.OwnItemCount(target, 3426) < 50) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
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
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(415);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target.attack_type == 5 || target.attack_type == 9) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(target, 8545, 1);
if (gg.OwnItemCount(target, 8545) >= 5) {
myself.SetFlagJournal(target, 415, 16);
myself.ShowQuestMark(target, 415);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 75) {
myself.GiveItem1(target, 3426, 1);
if (gg.OwnItemCount(target, 3426) >= 50) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}

}
break;

}
case 2: {
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
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 11) {
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