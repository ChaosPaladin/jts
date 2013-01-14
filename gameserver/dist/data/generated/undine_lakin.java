package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class undine_lakin extends warrior_pa_slow_type2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(369);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 80) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
i1 = gg.Party_GetCount(c1);
i2 = 0;
if (i1 == 0 && gg.HaveMemo(c1, 369) && gg.GetMemoState(c1, 369) == 1 && gg.OwnItemCount(c1, 5883) < 50 || gg.HaveMemo(c1, 369) && gg.GetMemoState(c1, 369) == 3 && gg.OwnItemCount(c1, 5883) < 200) {
c2 = c1;

}
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (gg.HaveMemo(c0, 369) && gg.GetMemoState(c0, 369) == 1 && gg.OwnItemCount(c0, 5883) < 50 || gg.HaveMemo(c0, 369) && gg.GetMemoState(c0, 369) == 3 && gg.OwnItemCount(c0, 5883) < 200) {
i3 = gg.Rand(1000);
if (i2 < i3) {
i2 = i3;
c2 = c0;

}

}

}
if (myself.IsNullCreature(c2) == 0 && myself.DistFromMe(c2) <= 1500) {
if (myself.GetCurrentTick() - c2.quest_last_reward_time > 1) {
c2.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c2, 5883, 1);
if (gg.GetMemoState(c2, 369) == 1 && gg.OwnItemCount(c2, 5883) >= 49 && gg.OwnItemCount(c2, 5882) >= 50) {
myself.SetFlagJournal(c2, 369, 2);
myself.ShowQuestMark(c2, 369);
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else if (gg.GetMemoState(c2, 369) == 3 && gg.OwnItemCount(c2, 5883) >= 199 && gg.OwnItemCount(c2, 5882) >= 200) {
myself.SetFlagJournal(c2, 369, 4);
myself.ShowQuestMark(c2, 369);
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c2, "ItemSound.quest_itemget");

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