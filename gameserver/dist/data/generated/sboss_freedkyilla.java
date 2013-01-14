package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sboss_freedkyilla extends ai_immo_sboss_slayer_b {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 692) == 1 && gg.GetMemoState(target, 692) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 692) == 1 && gg.GetMemoState(target, 692) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 692) == 1 && gg.GetMemoState(target, 692) == 3) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 698) == 1 && gg.GetMemoState(target, 698) == 2) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 698) == 1 && gg.GetMemoState(target, 698) == 2) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 698) == 1 && gg.GetMemoState(target, 698) == 2) {
always_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(698);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(698);
if (myself.DistFromMe(target) <= 1500) {
myself.SetMemoStateEx(target, 698, 1, gg.GetMemoStateEx(target, 698, 1) + 5);

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
myself.SetCurrentQuestID(692);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(692);
if (myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 460) {
myself.GiveItem1(target, 13863, gg.Rand(10) + 20 * 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
myself.GiveItem1(target, 13863, gg.Rand(10) + 25 * 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

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