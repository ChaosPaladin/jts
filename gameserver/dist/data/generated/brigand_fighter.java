package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class brigand_fighter extends warrior_ag_physicalspecial_potion {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 649) == 1 && gg.GetMemoState(target, 649) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 649) == 1 && gg.GetMemoState(target, 649) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 649) == 1 && gg.GetMemoState(target, 649) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 117) == 1 && gg.GetMemoState(target, 117) == 7 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 117) == 1 && gg.GetMemoState(target, 117) == 7 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 117) == 1 && gg.GetMemoState(target, 117) == 7 * 10 + 1) {
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
myself.SetCurrentQuestID(649);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 827) {
if (gg.OwnItemCount(target, 8099) + 1 >= 200) {
if (gg.OwnItemCount(target, 8099) < 200) {
myself.GiveItem1(target, 8099, 200 - gg.OwnItemCount(target, 8099));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 649, 2);
myself.ShowQuestMark(target, 649);
myself.SetMemoState(target, 649, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 8099, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(117);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 179) {
if (gg.OwnItemCount(target, 8495) + 1 >= 1) {
if (gg.OwnItemCount(target, 8495) < 1) {
myself.GiveItem1(target, 8495, 1 - gg.OwnItemCount(target, 8495));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 117, 8);
myself.ShowQuestMark(target, 117);
myself.SetMemoState(target, 117, 7 * 10 + 2);

}

} else {
myself.GiveItem1(target, 8495, 1);
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