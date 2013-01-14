package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class taik_orc_supply_leader extends warrior_aggressive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(360);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 360) == 1 && gg.Rand(100) < 75) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 5872, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.HaveMemo(c1, 360) == 1 && gg.Rand(100) < 10) {
if (gg.OwnItemCount(c1, 5871) < 4) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 5871, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 5870, 1);
myself.DeleteItem1(c1, 5871, gg.OwnItemCount(c1, 5871));
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(713);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 713) == 1 && gg.GetMemoState(c0, 713) % 100 == 2) {
i0 = gg.GetMemoState(c0, 713);
i1 = gg.GetMemoStateEx(c0, 713, 1);
if (i1 >= 99) {
myself.SetMemoState(c0, 713, i0 + 10);
if (gg.GetMemoState(c0, 713) / 100 < 5) {
myself.SetFlagJournal(c0, 713, 3);

} else if (gg.GetMemoState(c0, 713) / 100 >= 5) {
myself.SetFlagJournal(c0, 713, 5);

}
myself.ShowQuestMark(c0, 713);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}
myself.SetMemoStateEx(c0, 713, 1, i1 + 1);

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