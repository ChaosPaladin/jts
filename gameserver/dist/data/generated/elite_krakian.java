package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elite_krakian extends ai_elite_krakian {
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
if (gg.HaveMemo(target, 453) == 1 && gg.GetMemoState(target, 453) == 1 && gg.GetMemoStateEx(target, 453, 1) == 2) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 453) == 1 && gg.GetMemoState(target, 453) == 1 && gg.GetMemoStateEx(target, 453, 1) == 2) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 453) == 1 && gg.GetMemoState(target, 453) == 1 && gg.GetMemoStateEx(target, 453, 1) == 2) {
always_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(453);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(453);
myself.IncreaseNPCLogByID(target, 453, 0, 1022755, 20);
if (myself.GetNPCLogByID(target, 453, 0, 1022754) >= 20 && myself.GetNPCLogByID(target, 453, 0, 1022755) >= 20 && myself.GetNPCLogByID(target, 453, 0, 1022756) >= 20) {
myself.SetMemoState(target, 453, 2);
myself.SetFlagJournal(target, 453, 5);
myself.ShowQuestMark(target, 453);
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
case 0: {
myself.SetCurrentQuestID(692);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(692);
if (myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 12) {
myself.GiveItem1(target, 15536, 1);
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