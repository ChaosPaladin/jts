package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mandragora_sprout extends warrior_pa_casting_3skill_magical2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
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
if (gg.HaveMemo(c1, 330) == 1 && gg.OwnItemCount(c1, 1420) == 1 && gg.OwnItemCount(c1, 1424) + gg.OwnItemCount(c1, 1425) + gg.OwnItemCount(c1, 1429) + gg.OwnItemCount(c1, 1430) + gg.OwnItemCount(c1, 1433) + gg.OwnItemCount(c1, 1437) + gg.OwnItemCount(c1, 1438) + gg.OwnItemCount(c1, 1441) < 5 && gg.OwnItemCount(c1, 1421) == 1 && gg.OwnItemCount(c1, 1424) == 0 && gg.OwnItemCount(c1, 1425) == 0) {
i0 = gg.Rand(100);
if (i0 < 70) {
if (gg.OwnItemCount(c1, 1422) < 40) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 1422, 1);
if (gg.OwnItemCount(c1, 1422) == 40) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

} else if (i0 < 77) {
if (gg.OwnItemCount(c1, 1423) < 40) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 1423, 1);
if (gg.OwnItemCount(c1, 1423) == 40) {
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
case 1: {
myself.SetCurrentQuestID(221);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 221) && gg.OwnItemCount(c1, 3239) == 1 && gg.OwnItemCount(c1, 3264) == 1 && gg.OwnItemCount(c1, 3243) == 0) {
if (gg.OwnItemCount(c1, 3265) < 20 && gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3265, 1);
if (gg.OwnItemCount(c1, 3265) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(216);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 216) == 1 && gg.OwnItemCount(c1, 3120) == 1 && gg.OwnItemCount(c1, 3121) == 0) {
if (gg.Rand(100) <= 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3121, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 216, 4);

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(709);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) % 10 == 5) {
myself.GiveItem1(target, 13849, 1);
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
code_info.code;

}
super;
	}


}