package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class monstereye_gazer extends wizard_pa_ddmagic2_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 330) == 1 && gg.OwnItemCount(target, 1420) == 1 && gg.OwnItemCount(target, 1424) + gg.OwnItemCount(target, 1425) + gg.OwnItemCount(target, 1429) + gg.OwnItemCount(target, 1430) + gg.OwnItemCount(target, 1433) + gg.OwnItemCount(target, 1437) + gg.OwnItemCount(target, 1438) + gg.OwnItemCount(target, 1441) < 5 && gg.OwnItemCount(target, 1439) == 1 && gg.OwnItemCount(target, 1440) < 30) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 42) == 1 && gg.GetMemoState(target, 42) == 2 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 42) == 1 && gg.GetMemoState(target, 42) == 2 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 42) == 1 && gg.GetMemoState(target, 42) == 2 * 10 + 1) {
random1_list.SetInfo(1, target);

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
myself.SetCurrentQuestID(330);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(10);
if (i0 < 7) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 1440, 1);
if (gg.OwnItemCount(target, 1440) == 30) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

} else {
target.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(target, 1440) == 29) {
myself.GiveItem1(target, 1440, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 1440, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
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