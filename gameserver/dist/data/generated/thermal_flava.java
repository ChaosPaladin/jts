package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class thermal_flava extends warrior_ag_casting_enchant_physical_poison {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 623) == 1 && gg.GetMemoState(target, 623) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 623) == 1 && gg.GetMemoState(target, 623) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 623) == 1 && gg.GetMemoState(target, 623) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
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
myself.SetCurrentQuestID(623);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000) {
if (gg.OwnItemCount(target, 7199) + 1 >= 100) {
if (gg.OwnItemCount(target, 7199) < 100) {
myself.GiveItem1(target, 7199, 100 - gg.OwnItemCount(target, 7199));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.OwnItemCount(target, 7200) >= 100 && gg.OwnItemCount(target, 7201) >= 100) {
myself.SetFlagJournal(target, 623, 2);
myself.SetMemoState(target, 623, 1 * 10 + 2);
myself.ShowQuestMark(target, 623);

}

} else {
myself.GiveItem1(target, 7199, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 235) {
myself.GiveItem1(target, 7586, 4);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
myself.GiveItem1(target, 7586, 3);
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