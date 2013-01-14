package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class abyssking_bonaparterius extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(334);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 334) && gg.GetMemoState(c1, 334) == 2 && c1.flag == 3) {
myself.Say(gg.MakeFString(33413, "", "", "", "", ""));
if (gg.Rand(2) == 0) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.CreateOnePrivate(1027155, "eviloverlord_ramsebalius", 0, 1);

}

} else {
i1 = gg.Rand(4);
if (i1 == 0) {
myself.GiveItem1(c1, 1979, 1);

} else if (i1 == 1) {
myself.GiveItem1(c1, 1980, 1);

} else if (i1 == 2) {
myself.GiveItem1(c1, 2952, 1);

} else if (i1 == 3) {
myself.GiveItem1(c1, 2953, 1);

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

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(334);
if (timer_id == 2336005) {
myself.Despawn();
myself.Say(gg.MakeFString(33411, "", "", "", "", ""));

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(334);
myself.AddTimerEx(2336005, 1000 * 200);
myself.Say(gg.MakeFString(33425, "", "", "", "", ""));
super;
	}


}