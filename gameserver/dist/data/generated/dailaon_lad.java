package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dailaon_lad extends warrior_passive_use_power_shot {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(354);
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
if (i2 > i3 && gg.HaveMemo(c1, 354)) {
i3 = i2;
c2 = c1;

}

}

} else {
c2 = c0;

}
if (gg.HaveMemo(c2, 354) && myself.IsNullCreature(c2) == 0 && myself.DistFromMe(c2) <= 1500) {
if (myself.GetCurrentTick() - c2.quest_last_reward_time > 1) {
if (gg.Rand(100) < 91) {
c2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c2, 5863, 1);
myself.SoundEffect(c2, "ItemSound.quest_itemget");

}
if (gg.Rand(10) == 5) {
myself.GiveItem1(c2, 5864, 1);

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(711);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) / 1000 >= 1 && gg.GetMemoState(c0, 711) / 1000 < 101 && myself.DistFromMe(c0) <= 1500) {
i0 = gg.GetMemoState(c0, 711);
if (gg.GetMemoState(c0, 711) / 1000 < 100) {
myself.SetMemoState(c0, 711, i0 + 1000);

} else {
myself.SetMemoState(c0, 711, i0 + 1000);
myself.SetFlagJournal(c0, 711, 6);
myself.ShowQuestMark(c0, 711);
myself.SoundEffect(c0, "ItemSound.quest_middle");

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