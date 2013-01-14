package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class scarlet_salamander extends warrior_pa_casting_3skill_magical2 {
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
myself.SetCurrentQuestID(415);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 415) == 1 && gg.OwnItemCount(myself.c_quest0, 1596) == 1 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1602) == 4) {
myself.DeleteItem1(myself.c_quest0, 1602, gg.OwnItemCount(myself.c_quest0, 1602));
myself.DeleteItem1(myself.c_quest0, 1596, gg.OwnItemCount(myself.c_quest0, 1596));
myself.GiveItem1(myself.c_quest0, 1599, 1);
myself.SetFlagJournal(myself.c_quest0, 415, 7);
myself.ShowQuestMark(myself.c_quest0, 415);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1602, 1);
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
if (gg.HaveMemo(myself.c_quest0, 416) == 1 && gg.OwnItemCount(myself.c_quest0, 1616) == 1 && gg.OwnItemCount(myself.c_quest0, 1619) < 1 && myself.i_quest0 == 1) {
if (gg.OwnItemCount(myself.c_quest0, 1617) >= 1 && gg.OwnItemCount(myself.c_quest0, 1618) >= 1 && gg.OwnItemCount(myself.c_quest0, 1619) < 1) {
myself.GiveItem1(myself.c_quest0, 1619, 1);
myself.SetFlagJournal(myself.c_quest0, 416, 2);
myself.ShowQuestMark(myself.c_quest0, 416);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1619, 1);
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