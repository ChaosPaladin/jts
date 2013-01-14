package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class amber_basilisk extends warrior_passive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 8 && gg.OwnItemCount(target, 9775) < 30) {
always_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(334);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 334) && gg.OwnItemCount(c1, 3680) && gg.OwnItemCount(c1, 3681) && gg.OwnItemCount(c1, 3684) == 0) {
if (gg.Rand(10) == 0) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3684, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
if (gg.OwnItemCount(c1, 3685) >= 1 && gg.OwnItemCount(c1, 3686) >= 1 && gg.OwnItemCount(c1, 3687) >= 1 && gg.OwnItemCount(c1, 3688) >= 1 && gg.OwnItemCount(c1, 3689) >= 1 && gg.OwnItemCount(c1, 3689) >= 1 && gg.OwnItemCount(c1, 3690) >= 1 && gg.OwnItemCount(c1, 3691) >= 1) {
myself.SetJournal(c1, 334, 4);
myself.ShowQuestMark(c1, 334);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(66);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 980 && gg.OwnItemCount(target, 9775) < 30) {
if (gg.OwnItemCount(target, 9775) >= 29) {
myself.SetFlagJournal(target, 66, 8);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9775, 1);

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
myself.SetCurrentQuestID(137);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 89) {
if (gg.OwnItemCount(target, 10340) >= 29) {
myself.GiveItem1(target, 10340, 1);
myself.SetFlagJournal(target, 137, 3);
myself.ShowQuestMark(target, 137);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10340, 1);
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