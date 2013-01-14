package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class banshee_queen extends ai_banshee_raid {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 701) == 1 && gg.GetMemoState(target, 701) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 701) == 1 && gg.GetMemoState(target, 701) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 701) == 1 && gg.GetMemoState(target, 701) == 1) {
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
myself.SetCurrentQuestID(701);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(701);
i0 = gg.Rand(1000);
if (i0 < 708) {
myself.GiveItem1(target, 13876, gg.Rand(2) + 1);

} else if (i0 < 978) {
myself.GiveItem1(target, 13876, gg.Rand(3) + 3);

} else if (i0 < 994) {
myself.GiveItem1(target, 13876, gg.Rand(4) + 6);

} else if (i0 < 998) {
myself.GiveItem1(target, 13876, gg.Rand(4) + 10);

} else if (i0 < 1000) {
myself.GiveItem1(target, 13876, gg.Rand(5) + 14);

}
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