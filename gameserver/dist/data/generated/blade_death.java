package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blade_death extends party_private_priest {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 662)) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 662)) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 662)) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 663) == 1 && gg.GetMemoState(target, 663) >= 1 && gg.GetMemoState(target, 663) <= 4) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 663) == 1 && gg.GetMemoState(target, 663) >= 1 && gg.GetMemoState(target, 663) <= 4) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 663) == 1 && gg.GetMemoState(target, 663) >= 1 && gg.GetMemoState(target, 663) <= 4) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(386);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 17) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
i1 = gg.Party_GetCount(c1);
i2 = 0;
if (i1 == 0) {
if (gg.HaveMemo(c1, 386)) {
c2 = c1;

}

} else {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (gg.HaveMemo(c0, 386)) {
i3 = gg.Rand(1000);
if (i2 <= i3) {
i2 = i3;
c2 = c0;

}

}

}

}
if (myself.IsNullCreature(c2) == 0 && myself.DistFromMe(c2) <= 1500) {
c2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c2, 6363, 1);
myself.SoundEffect(c2, "ItemSound.quest_itemget");

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
case 1: {
myself.SetCurrentQuestID(662);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 283) {
myself.GiveItem1(target, 8765, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(663);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 425) {
myself.GiveItem1(target, 8766, 1);
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