package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class delu_lizardman_warrior extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(333);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 333) == 1 && gg.OwnItemCount(c1, 3673) >= 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(2) == 0) {
myself.GiveItem1(c1, 3850, 1);

}
if (gg.Rand(100) < 15) {
myself.GiveItem1(c1, 3442, 1);

}

}
if (gg.Rand(100) < 3 && gg.HaveMemo(c1, 333) && gg.OwnItemCount(c1, 3673)) {
myself.CreateOnePrivate(1027151, "delu_lizardm_headhunter", 0, 1);
myself.CreateOnePrivate(1027151, "delu_lizardm_headhunter", 0, 1);

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