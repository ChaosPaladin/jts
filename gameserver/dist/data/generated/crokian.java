package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crokian extends warrior_aggressive_casting_enchant_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 140) == 1 && gg.GetMemoState(target, 140) == 4) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 140) == 1 && gg.GetMemoState(target, 140) == 4) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 140) == 1 && gg.GetMemoState(target, 140) == 4) {
random1_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(345);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 345) && gg.GetMemoState(c1, 345) == 1) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
i0 = gg.Rand(100);
if (i0 <= 5) {
if (gg.OwnItemCount(c1, 4274) == 0) {
myself.GiveItem1(c1, 4274, 1);

} else {
myself.GiveItem1(c1, 4280, 1);

}
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 <= 11) {
if (gg.OwnItemCount(c1, 4275) == 0) {
myself.GiveItem1(c1, 4275, 1);

} else {
myself.GiveItem1(c1, 4280, 1);

}
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 <= 17) {
if (gg.OwnItemCount(c1, 4276) == 0) {
myself.GiveItem1(c1, 4276, 1);

} else {
myself.GiveItem1(c1, 4280, 1);

}
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 <= 23) {
if (gg.OwnItemCount(c1, 4277) == 0) {
myself.GiveItem1(c1, 4277, 1);

} else {
myself.GiveItem1(c1, 4280, 1);

}
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 <= 29) {
if (gg.OwnItemCount(c1, 4278) == 0) {
myself.GiveItem1(c1, 4278, 1);

} else {
myself.GiveItem1(c1, 4280, 1);

}
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 <= 60) {
myself.GiveItem1(c1, 4280, 1);

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
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(140);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 45) {
myself.GiveItem1(target, 10347, 1);
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