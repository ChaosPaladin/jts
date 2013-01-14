package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hunter_bear extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(417);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
c2 = gg.GetCreatureFromIndex(myself.i_quest1);
if (myself.IsNullCreature(c2) == 0) {
if (gg.HaveMemo(c2, 417) == 1 && gg.OwnItemCount(c2, 1653) == 1 && gg.OwnItemCount(c2, 1655) < 5 && myself.i_quest0 == 1) {
if (c2.flag >= 0) {
i0 = c2.flag * 20;
if (gg.Rand(100) <= i0) {
myself.CreateOnePrivate(1027058, "honey_bear", 0, 1);
c2.flag = 0;

} else {
c2.flag = c2.flag + 1;

}

} else {
c2.flag = c2.flag + 1;

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(417);
if (gg.HaveMemo(attacker, 417)) {
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
if (attacker.master) {
myself.i_quest1 = gg.GetIndexFromCreature(attacker.master);

} else {
myself.i_quest1 = gg.GetIndexFromCreature(attacker);

}
break;

}
case 1: {
if (attacker.master) {
if (myself.i_quest1 != gg.GetIndexFromCreature(attacker.master)) {
myself.i_quest0 = 2;

}

} else if (myself.i_quest1 != gg.GetIndexFromCreature(attacker)) {
myself.i_quest0 = 2;

}
break;

}
case 2: {
break;

}

}

}
super;
	}


}