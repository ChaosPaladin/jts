package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dead_seeker extends warrior_pa_casting_3skill_magical2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3132) < 70) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3132) < 70) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3132) < 70) {
always_list.SetInfo(1, target);

}

}

}
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 420) == 1 && gg.OwnItemCount(target, 3830) == 1 && gg.OwnItemCount(target, 3831) < 20) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 8 && gg.OwnItemCount(target, 9775) < 30) {
always_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 64) == 1 && gg.GetMemoState(target, 64) == 7 && gg.OwnItemCount(target, 9756) == 0) {
always_list.SetInfo(5, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
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
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3177) && gg.OwnItemCount(c1, 3180) < 10) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 3180) == 9) {
myself.GiveItem1(c1, 3180, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3178) >= 10 && gg.OwnItemCount(c1, 3179) >= 10 && gg.OwnItemCount(c1, 3181) >= 10 && gg.OwnItemCount(c1, 3182) >= 10) {
myself.SetFlagJournal(c1, 219, 7);
myself.ShowQuestMark(c1, 219);

}

} else {
myself.GiveItem1(c1, 3180, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(216);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(216);
myself.GiveItem1(target, 3132, 7);
if (gg.OwnItemCount(target, 3132) >= 63) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(222);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 222) && gg.OwnItemCount(c1, 2764) > 0 && gg.OwnItemCount(c1, 2771) < 10 && gg.GetMemoState(c1, 222) == 1) {
i0 = gg.GetMemoStateEx(c1, 222, 1);
myself.SetMemoStateEx(c1, 222, 1, i0 + 1);
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2771, 1);
if (gg.OwnItemCount(c1, 2771) >= 10) {
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
case 4: {
myself.SetCurrentQuestID(66);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (gg.OwnItemCount(target, 9775) < 30) {
if (gg.OwnItemCount(target, 9775) >= 29) {
myself.SetFlagJournal(target, 66, 8);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9775, 1);
if (i4 < 20 && gg.OwnItemCount(target, 9775) < 29) {
myself.GiveItem1(target, 9775, 1);

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
myself.GiveItem1(target, 9756, 1);
if (gg.OwnItemCount(target, 9757) > 0) {
myself.SetFlagJournal(target, 64, 10);
myself.ShowQuestMark(target, 64);
myself.SoundEffect(target, "ItemSound.quest_middle");

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
case 3: {
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 50) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3831, 1);
if (gg.OwnItemCount(target, 3831) >= 19) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(137);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 92) {
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