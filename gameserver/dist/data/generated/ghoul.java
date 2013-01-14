package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ghoul extends warrior_pa_slow_type2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3130) < 70) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3130) < 70) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3130) < 70) {
always_list.SetInfo(1, target);

}

}

}
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 8 && gg.OwnItemCount(target, 9775) < 30) {
always_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(5, target);

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
if (gg.HaveMemo(c1, 212) && gg.GetMemoState(c1, 212) == 5 && gg.OwnItemCount(c1, 2638) < 10 && gg.OwnItemCount(c1, 2639) == 0) {
if (gg.OwnItemCount(c1, 2638) == 9) {
if (gg.Rand(2) <= 1) {
myself.GiveItem1(c1, 2639, 1);
myself.DeleteItem1(c1, 2638, gg.OwnItemCount(c1, 2638));
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 212, 6);
myself.ShowQuestMark(c1, 212);

}

} else if (gg.Rand(2) <= 1) {
myself.GiveItem1(c1, 2638, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
myself.GiveItem1(target, 3130, 5);
if (gg.OwnItemCount(target, 3130) >= 65) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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
if (gg.HaveMemo(c1, 214) && gg.OwnItemCount(c1, 2705) == 1 && gg.OwnItemCount(c1, 2711) == 1 && gg.OwnItemCount(c1, 2715) == 1 && gg.OwnItemCount(c1, 2716) < 10) {
myself.GiveItem1(c1, 2716, 1);
if (gg.OwnItemCount(c1, 2716) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 214, 29);
myself.ShowQuestMark(c1, 214);

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(333);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 333) == 1 && gg.OwnItemCount(c1, 3671) >= 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(2) == 0) {
myself.GiveItem1(c1, 3848, 1);

}
if (gg.Rand(100) < 15) {
myself.GiveItem1(c1, 3440, 1);

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

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 5: {
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