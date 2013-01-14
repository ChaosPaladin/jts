package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class breka_orc_overlord extends warrior_aggressive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
target = last_attacker;
always_list.SetInfo(4, target);
target = last_attacker;
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3125) == 1 && gg.OwnItemCount(target, 3127) == 1 && gg.OwnItemCount(target, 3128) < 30) {
always_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3125) == 1 && gg.OwnItemCount(target, 3127) == 1 && gg.OwnItemCount(target, 3128) < 30) {
always_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3125) == 1 && gg.OwnItemCount(target, 3127) == 1 && gg.OwnItemCount(target, 3128) < 30) {
always_list.SetInfo(5, target);

}

}

}
target = last_attacker;
always_list.SetInfo(6, target);
target = last_attacker;
always_list.SetInfo(7, target);
target = last_attacker;
if (gg.HaveMemo(target, 420) == 1 && gg.OwnItemCount(target, 3828) == 1 && gg.OwnItemCount(target, 3829) < 20) {
random1_list.SetInfo(8, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 64) == 1 && gg.GetMemoState(target, 64) == 2 && gg.OwnItemCount(target, 9754) < 20) {
always_list.SetInfo(9, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(10, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(10, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(10, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(212);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 212) && gg.GetMemoState(c1, 212) == 11) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 2643) == 0) {
myself.GiveItem1(c1, 2643, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(c1, 2644) == 0) {
myself.GiveItem1(c1, 2644, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(c1, 2645) == 0) {
myself.GiveItem1(c1, 2645, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.SetFlagJournal(c1, 212, 15);
myself.ShowQuestMark(c1, 212);

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(224);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 6 && gg.OwnItemCount(c1, 3299) < 10) {
if (gg.OwnItemCount(c1, 3299) == 9) {
myself.GiveItem1(c1, 3299, 1);
myself.GiveItem1(c1, 3301, 1);
myself.SetMemoState(c1, 224, 7);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 7);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3299, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(219);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3190) && gg.OwnItemCount(c1, 3192) && gg.OwnItemCount(c1, 3198) == 0 && gg.OwnItemCount(c1, 3193) && gg.OwnItemCount(c1, 3196) < 1) {
if (gg.OwnItemCount(c1, 1020270) >= 0) {
myself.GiveItem1(c1, 3196, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3196, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3349) && gg.OwnItemCount(c1, 3341) < 30) {
if (gg.OwnItemCount(c1, 3341) >= 28) {
myself.GiveItem1(c1, 3341, 2);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3341, 2);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(232);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 232) == 1 && gg.OwnItemCount(c1, 3391) == 1 && gg.OwnItemCount(c1, 3392) == 1 && gg.OwnItemCount(c1, 3397) == 1 && gg.OwnItemCount(c1, 3400) == 0 && gg.OwnItemCount(c1, 3399) == 0) {
if (gg.OwnItemCount(c1, 3398) < 20 && gg.Rand(100) <= 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3398, 2);
if (gg.OwnItemCount(c1, 3398) >= 18) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(216);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(216);
if (gg.OwnItemCount(target, 3128) >= 29) {
myself.GiveItem1(target, 3128, 1);
myself.DeleteItem1(target, 3127, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 3128, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(213);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 213) && gg.OwnItemCount(c1, 2667) == 1 && gg.OwnItemCount(c1, 2669) == 0) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2669, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 2668) >= 1 && gg.OwnItemCount(c1, 2670) >= 1 && gg.OwnItemCount(c1, 2671) >= 1) {
myself.SetFlagJournal(c1, 213, 16);
myself.ShowQuestMark(c1, 213);

}

}

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(222);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 222) && gg.OwnItemCount(c1, 2765) > 0 && gg.OwnItemCount(c1, 2772) < 10 && gg.GetMemoState(c1, 222) == 1) {
i0 = gg.GetMemoStateEx(c1, 222, 1);
myself.SetMemoStateEx(c1, 222, 1, i0 + 1);
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2772, 1);
if (gg.OwnItemCount(c1, 2772) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (i0 >= 9) {
myself.SetFlagJournal(c1, 222, 3);
myself.SetMemoStateEx(c1, 222, 1, 0);

}

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(64);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 9754) >= 19) {
myself.GiveItem1(target, 9754, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 64, 3);
myself.ShowQuestMark(target, 64);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 9754, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 8: {
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 50) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3829, 1);
if (gg.OwnItemCount(target, 3829) >= 19) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(42047, "", "", "", "", ""));

}

}
break;

}
case 10: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 365) {
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