package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class langk_lizardman_warrior extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(402);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.OwnItemCount(myself.c_quest0, 1174) && gg.OwnItemCount(myself.c_quest0, 1175) < 20 && myself.i_quest0 == 1 && gg.Rand(10) < 5) {
myself.GiveItem1(myself.c_quest0, 1175, 1);
if (gg.OwnItemCount(myself.c_quest0, 1175) == 20) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(415);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 415) == 1 && gg.OwnItemCount(myself.c_quest0, 1607) == 1 && gg.OwnItemCount(myself.c_quest0, 1611) < 3 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1610) + gg.OwnItemCount(myself.c_quest0, 1611) + gg.OwnItemCount(myself.c_quest0, 1612) + gg.OwnItemCount(myself.c_quest0, 1609) >= 11) {
myself.DeleteItem1(myself.c_quest0, 1609, gg.OwnItemCount(myself.c_quest0, 1609));
myself.DeleteItem1(myself.c_quest0, 1610, gg.OwnItemCount(myself.c_quest0, 1610));
myself.DeleteItem1(myself.c_quest0, 1611, gg.OwnItemCount(myself.c_quest0, 1611));
myself.DeleteItem1(myself.c_quest0, 1612, gg.OwnItemCount(myself.c_quest0, 1612));
myself.DeleteItem1(myself.c_quest0, 1607, 1);
myself.GiveItem1(myself.c_quest0, 1608, 1);
myself.SetFlagJournal(myself.c_quest0, 415, 12);
myself.ShowQuestMark(myself.c_quest0, 415);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1611, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(340);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 340) && gg.GetMemoState(c1, 340) == 3) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
if (gg.OwnItemCount(c1, 4256) == 0) {
if (gg.Rand(100) <= 19) {
myself.GiveItem1(c1, 4256, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 4256) >= 1 && gg.OwnItemCount(c1, 4257) == 0) {
if (gg.Rand(100) <= 19) {
myself.GiveItem1(c1, 4257, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
myself.SetCurrentQuestID(415);
if (gg.HaveMemo(attacker, 415)) {
switch (myself.i_quest0) {
case 0: {
if (attacker.attack_type != 5 && attacker.attack_type != 9) {
myself.i_quest0 = 2;

} else {
myself.i_quest0 = 1;

}
myself.c_quest0 = attacker;
break;

}
case 1: {
if (myself.c_quest0 != attacker || attacker.attack_type != 5 && attacker.attack_type != 9) {
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