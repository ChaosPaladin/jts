package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blader extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.OwnItemCount(target, 703) == 0 && gg.HaveMemo(target, 151)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 259)) {
random1_list.SetInfo(3, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(402);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.OwnItemCount(myself.c_quest0, 1176) > 0 && gg.Rand(10) < 4 && gg.OwnItemCount(myself.c_quest0, 1177) < 20 && myself.i_quest0 == 1) {
myself.GiveItem1(myself.c_quest0, 1177, 1);
if (gg.OwnItemCount(myself.c_quest0, 1177) == 20) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c1.quest_last_reward_time = 0;
if (gg.HaveMemo(c1, 419) == 1 && gg.OwnItemCount(c1, 3418) == 1) {
if (gg.OwnItemCount(c1, 3423) < 50 && gg.Rand(100) < 100) {
myself.GiveItem1(c1, 3423, 1);
if (gg.OwnItemCount(c1, 3423) >= 50) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(151);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(5) == 0) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 703, 1);
myself.SetFlagJournal(target, 151, 2);
myself.ShowQuestMark(target, 151);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(259);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 1495, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(402);
if (gg.HaveMemo(attacker, 402)) {
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