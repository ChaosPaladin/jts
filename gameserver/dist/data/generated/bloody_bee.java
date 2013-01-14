package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bloody_bee extends warrior_passive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(330);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 330) == 1 && gg.OwnItemCount(c1, 1420) == 1 && gg.OwnItemCount(c1, 1424) + gg.OwnItemCount(c1, 1425) + gg.OwnItemCount(c1, 1429) + gg.OwnItemCount(c1, 1430) + gg.OwnItemCount(c1, 1433) + gg.OwnItemCount(c1, 1437) + gg.OwnItemCount(c1, 1438) + gg.OwnItemCount(c1, 1441) < 5 && gg.OwnItemCount(c1, 1426) == 1) {
i0 = gg.Rand(100);
if (i0 < 80) {
if (gg.OwnItemCount(c1, 1427) < 20) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 1427, 1);
if (gg.OwnItemCount(c1, 1427) == 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

} else if (i0 > 95) {
if (gg.OwnItemCount(c1, 1428) < 10) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 1428, 1);
if (gg.OwnItemCount(c1, 1428) == 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}


}