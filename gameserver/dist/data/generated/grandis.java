package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grandis extends warrior_ag_casting_enchant_1of4 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3735) && gg.OwnItemCount(target, 3777) < 100) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3746) && gg.OwnItemCount(target, 3788) < 1) {
random1_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 21 || gg.GetMemoState(target, 66) == 22 && gg.OwnItemCount(target, 9778) < 10) {
always_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(219);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3190) && gg.OwnItemCount(c1, 3192) && gg.OwnItemCount(c1, 3198) == 0 && gg.OwnItemCount(c1, 3193) && gg.OwnItemCount(c1, 3194) < 1) {
if (gg.OwnItemCount(c1, 3194) >= 0) {
myself.GiveItem1(c1, 3194, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3194, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(222);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 222) && gg.OwnItemCount(c1, 2778) > 0 && gg.OwnItemCount(c1, 2781) < 3 && gg.GetMemoState(c1, 222) == 2) {
i0 = gg.GetMemoStateEx(c1, 222, 1);
myself.SetMemoStateEx(c1, 222, 1, i0 + 1);
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2781, 1);
if (gg.OwnItemCount(c1, 2781) >= 3) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (i0 >= 5) {
myself.SetFlagJournal(c1, 222, 5);
myself.SetMemoStateEx(c1, 222, 1, 0);

}

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(214);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 214) && gg.OwnItemCount(c1, 2677) == 1 && gg.OwnItemCount(c1, 2691) == 1 && gg.OwnItemCount(c1, 2705) == 1 && gg.OwnItemCount(c1, 2708) == 0) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2708, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(66);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 780 && gg.OwnItemCount(target, 9778) < 10) {
if (gg.GetMemoState(target, 66) == 21 && gg.OwnItemCount(target, 9778) < 1) {
myself.SetFlagJournal(target, 66, 12);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 66, 22);
myself.GiveItem1(target, 9778, 1);

} else if (gg.GetMemoState(target, 66) == 22 && gg.OwnItemCount(target, 9778) >= 9) {
myself.SetFlagJournal(target, 66, 13);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 66, 23);
myself.DeleteItem1(target, 9778, gg.OwnItemCount(target, 9778));
myself.GiveItem1(target, 9779, 1);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.GiveItem1(target, 9778, 1);

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
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 3777, 2);
if (gg.OwnItemCount(target, 3777) >= 100) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 2) {
myself.CreateOnePrivate(1027160, "grandis_chief_gok_magok", 0, 1);

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 39) {
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