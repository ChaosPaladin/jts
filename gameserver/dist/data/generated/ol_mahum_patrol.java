package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ol_mahum_patrol extends warrior_passive_use_bow {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 63) == 1 && gg.GetMemoState(target, 63) == 2 && gg.OwnItemCount(target, 9763) < 5) {
random1_list.SetInfo(2, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(407);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 407) && myself.i_quest0 == 1 && gg.GetMemoState(myself.c_quest0, 407) == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1208) + gg.OwnItemCount(myself.c_quest0, 1209) + gg.OwnItemCount(myself.c_quest0, 1210) + gg.OwnItemCount(myself.c_quest0, 1211) < 4) {
if (gg.OwnItemCount(myself.c_quest0, 1208) < 1) {
myself.GiveItem1(myself.c_quest0, 1208, 1);
if (gg.OwnItemCount(myself.c_quest0, 1208) + gg.OwnItemCount(myself.c_quest0, 1209) + gg.OwnItemCount(myself.c_quest0, 1210) + gg.OwnItemCount(myself.c_quest0, 1211) >= 3) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 407, 3);
myself.ShowQuestMark(myself.c_quest0, 407);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(myself.c_quest0, 1209) < 1) {
myself.GiveItem1(myself.c_quest0, 1209, 1);
if (gg.OwnItemCount(myself.c_quest0, 1208) + gg.OwnItemCount(myself.c_quest0, 1209) + gg.OwnItemCount(myself.c_quest0, 1210) + gg.OwnItemCount(myself.c_quest0, 1211) >= 3) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 407, 3);
myself.ShowQuestMark(myself.c_quest0, 407);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(myself.c_quest0, 1210) < 1) {
myself.GiveItem1(myself.c_quest0, 1210, 1);
if (gg.OwnItemCount(myself.c_quest0, 1208) + gg.OwnItemCount(myself.c_quest0, 1209) + gg.OwnItemCount(myself.c_quest0, 1210) + gg.OwnItemCount(myself.c_quest0, 1211) >= 3) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 407, 3);
myself.ShowQuestMark(myself.c_quest0, 407);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(myself.c_quest0, 1211) < 1) {
myself.GiveItem1(myself.c_quest0, 1211, 1);
if (gg.OwnItemCount(myself.c_quest0, 1208) + gg.OwnItemCount(myself.c_quest0, 1209) + gg.OwnItemCount(myself.c_quest0, 1210) + gg.OwnItemCount(myself.c_quest0, 1211) >= 3) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 407, 3);
myself.ShowQuestMark(myself.c_quest0, 407);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(326);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 326)) {
if (gg.Rand(100) < 61) {
myself.GiveItem1(c1, 1359, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
case 2: {
myself.SetCurrentQuestID(63);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (gg.OwnItemCount(target, 9763) < 5) {
if (gg.OwnItemCount(target, 9762) >= 10 && gg.OwnItemCount(target, 9763) >= 4) {
myself.SetFlagJournal(target, 63, 3);
myself.ShowQuestMark(target, 63);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9763, 1);

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(407);
if (gg.HaveMemo(attacker, 407)) {
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