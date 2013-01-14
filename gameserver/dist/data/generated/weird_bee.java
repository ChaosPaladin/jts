package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class weird_bee extends warrior_aggressive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(2, target);

}

}

}
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
if (i0 < 92) {
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

} else if (gg.OwnItemCount(c1, 1428) < 10) {
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
break;

}
case 1: {
myself.SetCurrentQuestID(231);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 231) && gg.GetMemoState(c1, 231) == 4 && gg.OwnItemCount(c1, 2876) < 10 && gg.OwnItemCount(c1, 2875) == 1) {
if (gg.OwnItemCount(c1, 2876) == 9) {
myself.GiveItem1(c1, 2876, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 2876, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

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
case 2: {
myself.SetCurrentQuestID(134);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
i1 = gg.Rand(100);
if (gg.OwnItemCount(target, 10336) >= 1) {
if (i1 < 100) {
myself.CreateOnePrivateEx(1027339, "pagan_of_cruma", 0, 0, gg.FloatToInt(myself.sm.x) + 20, gg.FloatToInt(myself.sm.y) + 20, gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, myself.sm.id);
myself.DeleteItem1(target, 10336, 1);

} else {
myself.DeleteItem1(target, 10336, 1);

}

} else if (i0 < 75) {
myself.GiveItem1(target, 10335, 1);
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