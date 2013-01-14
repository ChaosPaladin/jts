package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class road_scavenger extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
if (gg.HaveMemo(target, 420) == 1 && gg.OwnItemCount(target, 3826) == 1 && gg.OwnItemCount(target, 3827) < 20) {
random1_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 64) == 1 && gg.GetMemoState(target, 64) == 4 && gg.OwnItemCount(target, 9755) == 0) {
always_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(6, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(7, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(7, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(7, target);

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
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 10 && gg.OwnItemCount(c1, 3302) == 0) {
if (gg.OwnItemCount(c1, 3304) && gg.OwnItemCount(c1, 3305) && gg.OwnItemCount(c1, 3303)) {
myself.GiveItem1(c1, 3302, 1);
myself.SetMemoState(c1, 224, 11);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 11);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3302, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

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
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 10 && gg.OwnItemCount(c1, 3302) == 0) {
if (gg.OwnItemCount(c1, 3304) && gg.OwnItemCount(c1, 3305) && gg.OwnItemCount(c1, 3303)) {
myself.GiveItem1(c1, 3302, 1);
myself.SetMemoState(c1, 224, 11);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3302, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(223);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 223) && gg.OwnItemCount(c1, 3284) && gg.OwnItemCount(c1, 3291) < 10) {
if (gg.OwnItemCount(c1, 3291) >= 9) {
myself.GiveItem1(c1, 3291, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 223, 11);
myself.ShowQuestMark(c1, 223);

} else {
myself.GiveItem1(c1, 3291, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(225);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 225) == 1 && gg.OwnItemCount(c1, 2800) == 1 && gg.OwnItemCount(c1, 2801) < 4 && gg.OwnItemCount(c1, 2803) == 0) {
if (gg.OwnItemCount(c1, 2801) < 3) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2801, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

} else if (gg.Rand(100) < 100) {
myself.DeleteItem1(c1, 2801, gg.OwnItemCount(c1, 2801));
myself.GiveItem1(c1, 2803, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 2804) >= 1) {
myself.SetFlagJournal(c1, 225, 15);
myself.ShowQuestMark(c1, 225);

}

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(64);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(target, 9755, 1);
myself.SetFlagJournal(target, 64, 6);
myself.ShowQuestMark(target, 64);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 4: {
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 50) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3827, 1);
if (gg.OwnItemCount(target, 3827) >= 19) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(42046, "", "", "", "", ""));

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(138);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 46) {
if (gg.OwnItemCount(target, 10342) >= 9) {
myself.GiveItem1(target, 10342, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10342, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 30) {
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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(223);
switch (myself.i_quest0) {
case 0: {
myself.c_quest0 = attacker;
if (gg.HaveMemo(myself.c_quest0, 223) && gg.OwnItemCount(myself.c_quest0, 3284) > 0 && gg.OwnItemCount(myself.c_quest0, 3291) < 100) {
if (gg.Rand(2) == 1) {
if (gg.Rand(10) < 7) {
myself.CreateOnePrivate(1027089, "road_collector", 0, 1);

} else {
myself.CreateOnePrivate(1027089, "road_collector", 0, 1);
myself.CreateOnePrivate(1027089, "road_collector", 0, 1);

}

}

}
myself.i_quest0 = 1;
break;

}
case 1: {
myself.i_quest0 = 2;
break;

}
case 2: {
break;

}

}
super;
	}


}