package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class goblin_tomb_raider extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(414);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 414) == 1 && gg.OwnItemCount(myself.c_quest0, 1579) == 1 && gg.OwnItemCount(myself.c_quest0, 1580) < 10 && gg.OwnItemCount(myself.c_quest0, 1578) <= 20 && myself.i_quest0 == 1) {
if (gg.Rand(100) < gg.OwnItemCount(myself.c_quest0, 1578) * 5) {
myself.DeleteItem1(myself.c_quest0, 1578, gg.OwnItemCount(myself.c_quest0, 1578));
myself.CreateOnePrivate(1027045, "kuruka_ratman_leader", 0, 1);

} else {
myself.GiveItem1(myself.c_quest0, 1578, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(272);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 272) && gg.OwnItemCount(c1, 1474) < 50) {
if (gg.OwnItemCount(c1, 1474) < 49) {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else {
myself.SetFlagJournal(c1, 272, 2);
myself.ShowQuestMark(c1, 272);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}
myself.GiveItem1(c1, 1474, 1);

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
myself.SetCurrentQuestID(414);
if (gg.HaveMemo(attacker, 414)) {
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
if (attacker.master) {
myself.c_quest0 = attacker.master;

} else {
myself.c_quest0 = attacker;

}
break;

}
case 1: {
if (attacker.master) {
if (myself.c_quest0 != attacker.master) {
myself.i_quest0 = 2;

}

} else if (myself.c_quest0 != attacker) {
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