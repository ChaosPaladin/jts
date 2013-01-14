package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tarlk_basilisk extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 52) == 1 && myself.GetOneTimeQuestFlag(target, 52) == 0 && gg.GetMemoState(target, 52) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 52) == 1 && myself.GetOneTimeQuestFlag(target, 52) == 0 && gg.GetMemoState(target, 52) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 52) == 1 && myself.GetOneTimeQuestFlag(target, 52) == 0 && gg.GetMemoState(target, 52) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(504);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.OwnItemCount(c1, 4333) && gg.HaveMemo(c1, 504) && gg.OwnItemCount(c1, 4332) < 30) {
if (gg.Rand(10) < 9) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(c1, 4332) == 29) {
myself.GiveItem1(c1, 4332, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 4332, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

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
myself.SetCurrentQuestID(52);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500 && 500 != 0) {
if (gg.OwnItemCount(target, 7623) + 1 >= 100) {
if (gg.OwnItemCount(target, 7623) < 100) {
myself.GiveItem1(target, 7623, 100 - gg.OwnItemCount(target, 7623));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 52, 2);
myself.ShowQuestMark(target, 52);

}
myself.SetMemoState(target, 52, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7623, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 545) {
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