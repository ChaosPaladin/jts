package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class skeleton_hunter extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.OwnItemCount(target, 970) == 1 && gg.OwnItemCount(target, 1107) < 10) {
random1_list.SetInfo(0, target);

}
if (gg.OwnItemCount(target, 970) == 1 && gg.OwnItemCount(target, 1107) < 10) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.OwnItemCount(target, 970) == 1 && gg.OwnItemCount(target, 1107) < 10) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 320) == 1 && gg.OwnItemCount(target, 809) < 10) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 320) == 1 && gg.OwnItemCount(target, 809) < 10) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 320) == 1 && gg.OwnItemCount(target, 809) < 10) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
always_list.SetInfo(2, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 2: {
myself.SetCurrentQuestID(412);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 412) == 1 && gg.OwnItemCount(myself.c_quest0, 1278) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(myself.c_quest0, 1259) < 2) {
if (gg.Rand(2) == 0) {
myself.GiveItem1(myself.c_quest0, 1259, 1);
if (gg.OwnItemCount(myself.c_quest0, 1259) == 2) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

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
myself.SetCurrentQuestID(103);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 10) {
myself.GiveItem1(target, 1107, 1);
if (gg.OwnItemCount(target, 1107) >= 9) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 103, 4);
myself.ShowQuestMark(target, 103);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(320);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 18) {
myself.GiveItem1(target, 809, 1);
if (gg.OwnItemCount(target, 809) >= 9) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 320, 2);
myself.ShowQuestMark(target, 320);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(412);
if (gg.HaveMemo(attacker, 412)) {
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