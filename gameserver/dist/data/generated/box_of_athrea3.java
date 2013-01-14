package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class box_of_athrea3 extends citizen {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c2, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
random1_list.SetInfo(0, target);
random1_list.SetInfo(0, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
random1_list.SetInfo(0, target);

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(501);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c2 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c2) == 0) {
if (gg.HaveMemo(c2, 501) && gg.GetMemoState(c2, 501) == 4) {
if (c2.flag == 3 && myself.boss.flag == 15) {
c2.flag = c2.flag + 1;
myself.Say(gg.MakeFString(50110, "", "", "", "", ""));

} else if (c2.flag == 2 && myself.boss.flag == 14) {
c2.flag = c2.flag + 1;
myself.Say(gg.MakeFString(50110, "", "", "", "", ""));

} else if (c2.flag == 1 && myself.boss.flag == 13) {
c2.flag = c2.flag + 1;
myself.Say(gg.MakeFString(50110, "", "", "", "", ""));

} else if (c2.flag == 0 && myself.boss.flag == 12) {
c2.flag = c2.flag + 1;
myself.Say(gg.MakeFString(50110, "", "", "", "", ""));

} else if (c2.flag < 4) {
if (gg.Rand(4) == 0) {
c2.flag = c2.flag + 1;
myself.Say(gg.MakeFString(50110, "", "", "", "", ""));

}

}
myself.boss.flag = myself.boss.flag + 1;

}

}

}
break;

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(501);
if (timer_id == 2501003) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(501);
myself.AddTimerEx(2501003, 300 * 1000);
super;
	}


}