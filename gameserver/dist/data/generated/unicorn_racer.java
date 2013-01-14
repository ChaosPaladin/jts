package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class unicorn_racer extends warrior_passive_hold {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c0 = c1.master;
if (gg.HaveMemo(c0, 230) && gg.OwnItemCount(c0, 3371)) {
myself.GiveItem1(c0, 3374, 1);
myself.DeleteItem1(c0, 3371, gg.OwnItemCount(c0, 3371));
myself.SoundEffect(c0, "Itemsound.quest_middle");
myself.Say(gg.MakeFString(23062, "", "", "", "", ""));

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam c1, HandlerParam damage) {
myself.SetCurrentQuestID(230);
switch (myself.i_quest0) {
case 0: {
myself.c_quest0 = attacker;
myself.i_quest0 = 1;
myself.AddTimerEx(23001, 1000 * 120);
if (myself.c_quest0.master) {
myself.AddTimerEx(23008, 1000 * 5);
c0 = myself.c_quest0.master;
myself.c_quest1 = myself.c_quest0.master;
if (gg.HaveMemo(c0, 230) && gg.OwnItemCount(c0, 3370)) {
myself.Say(gg.MakeFString(23060, "", "", "", "", ""));
myself.GiveItem1(c0, 3371, 1);
myself.DeleteItem1(c0, 3370, gg.OwnItemCount(c0, 3370));
myself.AddAttackDesire(myself.c_quest0, 1, 100000);

}

}
break;

}
case 1: {
if (myself.c_quest0 != attacker) {
if (gg.OwnItemCount(myself.c_quest1, 3370) == 0 && gg.OwnItemCount(myself.c_quest1, 3371)) {
myself.i_quest0 = 2;
myself.Say(gg.MakeFString(23061, "", "", "", "", ""));
myself.GiveItem1(myself.c_quest1, 3372, 1);
myself.DeleteItem1(myself.c_quest1, 3371, gg.OwnItemCount(myself.c_quest1, 3371));
myself.DeleteItem1(myself.c_quest1, 3370, gg.OwnItemCount(myself.c_quest1, 3370));
myself.Despawn();
myself.c_quest2 = attacker;
if (myself.c_quest2.master) {
c1 = myself.c_quest2.master;
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3371)) {
myself.GiveItem1(c1, 3372, 1);
myself.DeleteItem1(c1, 3371, gg.OwnItemCount(c1, 3371));
myself.DeleteItem1(c1, 3370, gg.OwnItemCount(c1, 3370));

}

} else if (myself.c_quest2 != myself.c_quest1 && gg.HaveMemo(myself.c_quest2, 230) && gg.OwnItemCount(myself.c_quest2, 3371)) {
myself.GiveItem1(myself.c_quest2, 3372, 1);
myself.DeleteItem1(myself.c_quest2, 3371, gg.OwnItemCount(myself.c_quest2, 3371));
myself.DeleteItem1(myself.c_quest2, 3370, gg.OwnItemCount(myself.c_quest2, 3370));

}

} else {
myself.Despawn();

}

}

}
case 2: {
break;

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(230);
if (timer_id == 23001) {
myself.Despawn();

} else if (timer_id == 23008) {
if (myself.c_quest0.alive == 0) {
myself.Despawn();

} else {
myself.AddTimerEx(23008, 1000 * 5);

}

}
super;
	}


}