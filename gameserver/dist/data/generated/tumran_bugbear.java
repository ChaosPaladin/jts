package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tumran_bugbear extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 62) == 1 && gg.GetMemoState(target, 62) == 5 && gg.OwnItemCount(target, 9751) < 1) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(171);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 171) && gg.GetMemoState(c1, 171) == 5) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
if (gg.OwnItemCount(c1, 4241) == 0) {
myself.GiveItem1(c1, 4241, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(c1, 4241) >= 1 && gg.OwnItemCount(c1, 4242) == 0) {
if (gg.Rand(100) <= 19) {
myself.GiveItem1(c1, 4242, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 4241) >= 1 && gg.OwnItemCount(c1, 4242) >= 1 && gg.OwnItemCount(c1, 4243) == 0) {
if (gg.Rand(100) <= 19) {
myself.GiveItem1(c1, 4243, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 4241) >= 1 && gg.OwnItemCount(c1, 4242) >= 1 && gg.OwnItemCount(c1, 4243) >= 1 && gg.OwnItemCount(c1, 4244) == 0) {
if (gg.Rand(100) <= 19) {
myself.GiveItem1(c1, 4244, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

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
myself.SetCurrentQuestID(62);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500 && gg.OwnItemCount(target, 9751) < 1) {
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.GiveItem1(target, 9751, 1);

}

}
break;

}

}

}
super;
	}


}