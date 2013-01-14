package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kasha_blade_spider extends warrior_passive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 415) == 1 && gg.GetMemoState(target, 415) == 3 && gg.OwnItemCount(target, 8545) < 6) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 415) == 1 && gg.GetMemoState(target, 415) == 3 && gg.OwnItemCount(target, 8545) < 6) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 415) == 1 && gg.GetMemoState(target, 415) == 3 && gg.OwnItemCount(target, 8545) < 6) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
target = last_attacker;
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 268) && gg.GetMemoState(target, 268) == 1) {
random1_list.SetInfo(4, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(415);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 415) == 1 && gg.OwnItemCount(myself.c_quest0, 1595) == 1 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1601) == 4) {
myself.DeleteItem1(myself.c_quest0, 1601, gg.OwnItemCount(myself.c_quest0, 1601));
myself.DeleteItem1(myself.c_quest0, 1595, gg.OwnItemCount(myself.c_quest0, 1595));
myself.GiveItem1(myself.c_quest0, 1598, 1);
myself.SetFlagJournal(myself.c_quest0, 415, 5);
myself.ShowQuestMark(myself.c_quest0, 415);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1601, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(416);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 416) == 1 && gg.OwnItemCount(myself.c_quest0, 1616) == 1 && gg.OwnItemCount(myself.c_quest0, 1618) < 1 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1617) >= 1 && gg.OwnItemCount(myself.c_quest0, 1618) < 1 && gg.OwnItemCount(myself.c_quest0, 1619) >= 1) {
myself.GiveItem1(myself.c_quest0, 1618, 1);
myself.SetFlagJournal(myself.c_quest0, 416, 2);
myself.ShowQuestMark(myself.c_quest0, 416);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1618, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c1.quest_last_reward_time = 0;
if (gg.HaveMemo(c1, 419) == 1 && gg.OwnItemCount(c1, 3421) == 1) {
if (gg.OwnItemCount(c1, 3426) < 50 && gg.Rand(100) < 100) {
myself.GiveItem1(c1, 3426, 1);
if (gg.OwnItemCount(c1, 3426) >= 50) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_getitem");

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
case 1: {
myself.SetCurrentQuestID(415);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target.attack_type == 5 || target.attack_type == 9) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(target, 8545, 1);
if (gg.OwnItemCount(target, 8545) >= 5) {
myself.SetFlagJournal(target, 415, 16);
myself.ShowQuestMark(target, 415);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(268);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 10869) == 29) {
myself.GiveItem1(target, 10869, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 268, 2);
myself.SetFlagJournal(target, 268, 2);
myself.ShowQuestMark(target, 268);

} else {
myself.GiveItem1(target, 10869, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
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
myself.SetCurrentQuestID(416);
if (gg.HaveMemo(attacker, 416)) {
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