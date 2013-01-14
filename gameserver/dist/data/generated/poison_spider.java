package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class poison_spider extends warrior_passive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 324) == 1 && gg.OwnItemCount(target, 1077) < 10) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
target = last_attacker;
always_list.SetInfo(4, target);
target = last_attacker;
if (gg.HaveMemo(target, 62) == 1 && gg.GetMemoState(target, 62) == 3 && gg.OwnItemCount(target, 9750) < 10) {
random1_list.SetInfo(5, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(410);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 410) == 1 && gg.OwnItemCount(myself.c_quest0, 1240) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(myself.c_quest0, 1241) < 1) {
myself.GiveItem1(myself.c_quest0, 1241, 1);
if (gg.OwnItemCount(myself.c_quest0, 1242) >= 5) {
myself.SetFlagJournal(myself.c_quest0, 410, 5);
myself.ShowQuestMark(myself.c_quest0, 410);

}
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(401);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest2, 401) && gg.OwnItemCount(myself.c_quest2, 1144) < 20 && myself.i_quest2 == 1) {
myself.GiveItem1(myself.c_quest2, 1144, 1);
if (gg.OwnItemCount(myself.c_quest2, 1144) >= 19) {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest2, 401, 6);
myself.ShowQuestMark(myself.c_quest2, 401);

} else {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(402);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 402) && gg.OwnItemCount(myself.c_quest0, 1172) > 0 && gg.OwnItemCount(myself.c_quest0, 1173) < 20 && myself.i_quest0 == 1) {
myself.GiveItem1(myself.c_quest0, 1173, 1);
if (gg.OwnItemCount(myself.c_quest0, 1173) == 20) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(416);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 416) == 1 && gg.OwnItemCount(myself.c_quest0, 1627) == 1 && gg.OwnItemCount(myself.c_quest0, 1628) == 0 && gg.OwnItemCount(myself.c_quest0, 1629) <= 8 && myself.i_quest0 == 1) {
i0 = gg.Rand(10);
if (gg.OwnItemCount(myself.c_quest0, 1629) == 5 && i0 < 1) {
myself.DeleteItem1(myself.c_quest0, 1629, gg.OwnItemCount(myself.c_quest0, 1629));
myself.CreateOnePrivate(1027056, "durka_spirit", 0, 1);
myself.SoundEffect(myself.c_quest0, "Itemsound.quest_before_battle");

} else if (gg.OwnItemCount(myself.c_quest0, 1629) == 6 && i0 < 2) {
myself.DeleteItem1(myself.c_quest0, 1629, gg.OwnItemCount(myself.c_quest0, 1629));
myself.SoundEffect(myself.c_quest0, "Itemsound.quest_before_battle");
myself.CreateOnePrivate(1027056, "durka_spirit", 0, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1629) == 7 && i0 < 2) {
myself.DeleteItem1(myself.c_quest0, 1629, gg.OwnItemCount(myself.c_quest0, 1629));
myself.SoundEffect(myself.c_quest0, "Itemsound.quest_before_battle");
myself.CreateOnePrivate(1027056, "durka_spirit", 0, 1);

} else if (gg.OwnItemCount(myself.c_quest0, 1629) >= 8) {
myself.CreateOnePrivate(1027056, "durka_spirit", 0, 1);
myself.SoundEffect(myself.c_quest0, "Itemsound.quest_before_battle");
myself.DeleteItem1(myself.c_quest0, 1629, gg.OwnItemCount(myself.c_quest0, 1629));

} else {
myself.GiveItem1(myself.c_quest0, 1629, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

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
myself.SetCurrentQuestID(324);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 29) {
myself.GiveItem1(target, 1077, 1);
if (gg.OwnItemCount(target, 1077) >= 9) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 324, 2);
myself.ShowQuestMark(target, 324);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(62);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (gg.OwnItemCount(target, 9750) < 10) {
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.GiveItem1(target, 9750, 1);

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam weapon_class_id) {
myself.SetCurrentQuestID(410);
if (gg.HaveMemo(attacker, 410)) {
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
myself.SetCurrentQuestID(401);
if (gg.HaveMemo(attacker, 401)) {
switch (myself.i_quest2) {
case 0: {
myself.c_quest2 = attacker;
if (myself.c_quest2.equiped_weapon_class_id != 1142) {
myself.i_quest2 = 2;

} else {
myself.i_quest2 = 1;

}
break;

}
case 1: {
if (myself.c_quest2.equiped_weapon_class_id != 1142) {
myself.i_quest2 = 2;

}
if (myself.c_quest2 != attacker) {
myself.i_quest2 = 2;

}
break;

}
case 2: {
break;

}

}

}
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