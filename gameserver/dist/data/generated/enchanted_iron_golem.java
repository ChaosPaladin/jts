package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class enchanted_iron_golem extends warrior_pa_slow_type1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 36) == 1 && gg.GetMemoState(target, 36) == 1 * 10 + 1 && myself.GetOneTimeQuestFlag(target, 36) == 0) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 36) == 1 && gg.GetMemoState(target, 36) == 1 * 10 + 1 && myself.GetOneTimeQuestFlag(target, 36) == 0) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 36) == 1 && gg.GetMemoState(target, 36) == 1 * 10 + 1 && myself.GetOneTimeQuestFlag(target, 36) == 0) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(228);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 228) && gg.OwnItemCount(c1, 2847) == 1 && gg.OwnItemCount(c1, 2863) == 1 && gg.OwnItemCount(c1, 2855) < 10) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2855, 1);
if (gg.OwnItemCount(c1, 2855) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(343);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 343) && myself.IsInCategory(2, c1.occupation)) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
if (gg.Rand(100) < 68) {
myself.GiveItem1(c1, 4364, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.GetMemoStateEx(c1, 343, 1) > 1) {
if (gg.Rand(100) <= 13) {
myself.SetMemoStateEx(c1, 343, 1, gg.GetMemoStateEx(c1, 343, 1) - 1);

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
case 2: {
myself.SetCurrentQuestID(36);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500) {
if (gg.OwnItemCount(target, 7163) + 1 >= 5) {
if (gg.OwnItemCount(target, 7163) < 5) {
myself.GiveItem1(target, 7163, 5 - gg.OwnItemCount(target, 7163));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 36, 2);
myself.ShowQuestMark(target, 36);
myself.SetMemoState(target, 36, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7163, 1);
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