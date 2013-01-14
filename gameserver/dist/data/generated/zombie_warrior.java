package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zombie_warrior extends warrior_ag_slow_type2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(413);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 413) == 1 && gg.OwnItemCount(myself.c_quest0, 1267) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(myself.c_quest0, 1268) < 10) {
myself.GiveItem1(myself.c_quest0, 1268, 1);
if (gg.OwnItemCount(myself.c_quest0, 1268) >= 9) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 413, 6);
myself.ShowQuestMark(myself.c_quest0, 413);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(325);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.OwnItemCount(c1, 1349) && gg.HaveMemo(c1, 325)) {
i0 = gg.Rand(100);
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 40) {
myself.GiveItem1(c1, 1350, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 < 70) {
myself.GiveItem1(c1, 1351, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 < 100) {
myself.GiveItem1(c1, 1352, 1);
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
code_info.code;

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(413);
if (gg.HaveMemo(attacker, 413)) {
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