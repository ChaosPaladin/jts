package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cave_howler extends warrior_aggressive_casting_enchant_self {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(375);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.GetLastAttacker();
if (c0.master) {
c0 = c0.master;

}
i1 = gg.Party_GetCount(c0);
if (i1 != 0) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c1 = gg.Party_GetCreature(c0, i0);
i2 = gg.Rand(1000);
if (i2 > i3 && gg.HaveMemo(c1, 375)) {
i3 = i2;
c2 = c1;

}

}

} else {
c2 = c0;

}
if (gg.HaveMemo(c2, 375) && myself.IsNullCreature(c2) == 0 && myself.DistFromMe(c2) <= 1500) {
c2.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(10) < 2 && gg.OwnItemCount(c2, 5889) < 100) {
if (gg.OwnItemCount(c2, 5889) == 99) {
myself.GiveItem1(c2, 5889, 1);
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c2, 5889, 2);
myself.SoundEffect(c2, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c2, 5889) < 100) {
if (gg.OwnItemCount(c2, 5889) == 99) {
myself.GiveItem1(c2, 5889, 1);
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c2, 5889, 1);
myself.SoundEffect(c2, "ItemSound.quest_itemget");

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
code_info.code;

}
super;
	}


}