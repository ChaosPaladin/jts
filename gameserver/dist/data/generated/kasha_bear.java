package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class kasha_bear extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
myself.SetCurrentQuestID(415);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 415) == 1 && gg.OwnItemCount(myself.c_quest0, 1594) == 1 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1600) == 4) {
myself.DeleteItem1(myself.c_quest0, 1600, gg.OwnItemCount(myself.c_quest0, 1600));
myself.DeleteItem1(myself.c_quest0, 1594, gg.OwnItemCount(myself.c_quest0, 1594));
myself.GiveItem1(myself.c_quest0, 1597, 1);
myself.SetFlagJournal(myself.c_quest0, 415, 3);
myself.ShowQuestMark(myself.c_quest0, 415);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1600, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(416);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 416) == 1 && gg.OwnItemCount(myself.c_quest0, 1616) == 1 && gg.OwnItemCount(myself.c_quest0, 1617) < 1 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1617) < 1 && gg.OwnItemCount(myself.c_quest0, 1618) >= 1 && gg.OwnItemCount(myself.c_quest0, 1619) >= 1) {
myself.GiveItem1(myself.c_quest0, 1617, 1);
myself.SetFlagJournal(myself.c_quest0, 416, 2);
myself.ShowQuestMark(myself.c_quest0, 416);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1617, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(276);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 276) && gg.OwnItemCount(c1, 1481) < 1) {
i0 = gg.OwnItemCount(c1, 1480);
i1 = gg.Rand(100);
i2 = 1;
if (i0 >= 79) {
myself.CreateOnePrivate(1027044, "kasha_bear_totem", 0, 1);
myself.DeleteItem1(c1, 1480, gg.OwnItemCount(c1, 1480));
i2 = 0;

} else if (i0 >= 69) {
if (i1 <= 20) {
myself.CreateOnePrivate(1027044, "kasha_bear_totem", 0, 1);
myself.DeleteItem1(c1, 1480, gg.OwnItemCount(c1, 1480));
i2 = 0;

}

} else if (i0 >= 59) {
if (i1 <= 15) {
myself.CreateOnePrivate(1027044, "kasha_bear_totem", 0, 1);
myself.DeleteItem1(c1, 1480, gg.OwnItemCount(c1, 1480));
i2 = 0;

}

} else if (i0 >= 49) {
if (i1 <= 10) {
myself.CreateOnePrivate(1027044, "kasha_bear_totem", 0, 1);
myself.DeleteItem1(c1, 1480, gg.OwnItemCount(c1, 1480));
i2 = 0;

}

} else if (i0 >= 39) {
if (i1 <= 2) {
myself.CreateOnePrivate(1027044, "kasha_bear_totem", 0, 1);
myself.DeleteItem1(c1, 1480, gg.OwnItemCount(c1, 1480));
i2 = 0;

}

}
if (i2) {
myself.GiveItem1(c1, 1480, 1);
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
code_info.code;

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