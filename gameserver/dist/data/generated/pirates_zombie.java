package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pirates_zombie extends warrior_passive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 365)) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 365)) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 365)) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(710);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
i1 = gg.GetMemoStateEx(c0, 710, 1);
if (gg.HaveMemo(c0, 710) == 1 && gg.GetMemoState(c0, 710) >= 8) {
if (i1 >= 299) {
if (gg.GetMemoState(c0, 710) == 8) {
myself.SetFlagJournal(c0, 710, 8);
myself.ShowQuestMark(c0, 710);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 710, 9);
myself.SetMemoStateEx(c0, 710, 1, i1 + 1);

}

} else {
myself.SetMemoStateEx(c0, 710, 1, i1 + 1);
myself.SoundEffect(c0, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 13013, 1);

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
case 0: {
myself.SetCurrentQuestID(365);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 47) {
myself.GiveItem1(target, 5873, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.SetMemoState(target, 365, 0);

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 785) {
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