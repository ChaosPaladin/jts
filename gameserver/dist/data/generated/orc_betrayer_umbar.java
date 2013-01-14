package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class orc_betrayer_umbar extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(414);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 414) == 1 && gg.OwnItemCount(myself.c_quest0, 1581) + gg.OwnItemCount(myself.c_quest0, 1583) + gg.OwnItemCount(myself.c_quest0, 1582) + gg.OwnItemCount(myself.c_quest0, 1584) + gg.OwnItemCount(myself.c_quest0, 1585) + gg.OwnItemCount(myself.c_quest0, 1586) + gg.OwnItemCount(myself.c_quest0, 1587) + gg.OwnItemCount(myself.c_quest0, 1588) + gg.OwnItemCount(myself.c_quest0, 1589) + gg.OwnItemCount(myself.c_quest0, 1590) > 0 && gg.OwnItemCount(myself.c_quest0, 1591) < 2 && myself.i_quest0 == 1 && gg.Rand(10) < 2) {
myself.GiveItem1(myself.c_quest0, 1591, 1);
if (gg.OwnItemCount(myself.c_quest0, 1590) == 1) {
myself.DeleteItem1(myself.c_quest0, 1590, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1589) == 1) {
myself.DeleteItem1(myself.c_quest0, 1589, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1588) == 1) {
myself.DeleteItem1(myself.c_quest0, 1588, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1587) == 1) {
myself.DeleteItem1(myself.c_quest0, 1587, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1586) == 1) {
myself.DeleteItem1(myself.c_quest0, 1586, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1585) == 1) {
myself.DeleteItem1(myself.c_quest0, 1585, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1584) == 1) {
myself.DeleteItem1(myself.c_quest0, 1584, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1582) == 1) {
myself.DeleteItem1(myself.c_quest0, 1582, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1583) == 1) {
myself.DeleteItem1(myself.c_quest0, 1583, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1581) == 1) {
myself.DeleteItem1(myself.c_quest0, 1581, 1);

}
if (gg.OwnItemCount(myself.c_quest0, 1591) >= 1) {
myself.SetFlagJournal(myself.c_quest0, 414, 4);
myself.ShowQuestMark(myself.c_quest0, 414);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

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