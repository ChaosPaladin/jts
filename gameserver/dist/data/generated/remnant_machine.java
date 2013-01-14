package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class remnant_machine extends ai_remnant_machine {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam party0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 693) == 1 && gg.GetMemoState(target, 693) == 2) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 693) == 1 && gg.GetMemoState(target, 693) == 2) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 693) == 1 && gg.GetMemoState(target, 693) == 2) {
random1_list.SetInfo(0, target);

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
myself.SetCurrentQuestID(693);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(693);
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.IsNullCreature(c1) == 0) {
party0 = gg.GetParty(c1);
if (gg.IsNull(party0) == 0) {
i0 = party0.member_count;
for (i1 = 0; i1 < i0; i1 = i1 + 1) {
c0 = myself.GetMemberOfParty(party0, i1);
if (myself.IsNullCreature(c0) == 0) {
if (myself.InMyTerritory(c0) == 1) {
myself.SetMemoState(c0, 693, i0 * 10);

}

}

}

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