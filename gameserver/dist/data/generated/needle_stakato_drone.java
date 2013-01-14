package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class needle_stakato_drone extends warrior_run_away_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 628) == 1 && gg.OwnItemCount(target, 7247) < 1 && gg.OwnItemCount(target, 7246) >= 1 && gg.OwnItemCount(target, 7249) < 100) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 628) == 1 && gg.OwnItemCount(target, 7247) < 1 && gg.OwnItemCount(target, 7246) >= 1 && gg.OwnItemCount(target, 7249) < 100) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 628) == 1 && gg.OwnItemCount(target, 7247) < 1 && gg.OwnItemCount(target, 7246) >= 1 && gg.OwnItemCount(target, 7249) < 100) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 629) == 1 && myself.GetOneTimeQuestFlag(target, 629) == 0 && gg.GetMemoState(target, 629) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 629) == 1 && myself.GetOneTimeQuestFlag(target, 629) == 0 && gg.GetMemoState(target, 629) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 629) == 1 && myself.GetOneTimeQuestFlag(target, 629) == 0 && gg.GetMemoState(target, 629) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 2 && gg.OwnItemCount(target, 9745) == 0) {
always_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 2 && gg.OwnItemCount(target, 9745) == 0) {
always_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 2 && gg.OwnItemCount(target, 9745) == 0) {
always_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 2: {
myself.SetCurrentQuestID(236);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(target, 9745, 1);
myself.SetFlagJournal(target, 236, 3);
myself.ShowQuestMark(target, 236);
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
case 0: {
myself.SetCurrentQuestID(628);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 531) {
if (gg.OwnItemCount(target, 7249) >= 99) {
myself.GiveItem1(target, 7249, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 7249, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(629);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 879 && 879 != 0) {
myself.GiveItem1(target, 7250, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 495) {
myself.GiveItem1(target, 7586, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
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