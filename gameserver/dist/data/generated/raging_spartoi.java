package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raging_spartoi extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
myself.SetCurrentQuestID(406);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 406) != 0 && gg.OwnItemCount(myself.c_quest0, 1203) == 0 && gg.OwnItemCount(myself.c_quest0, 1205) < 20 && myself.i_quest0 == 1 && gg.Rand(100) < 70) {
myself.GiveItem1(myself.c_quest0, 1205, 1);
if (gg.OwnItemCount(myself.c_quest0, 1205) >= 19) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 406, 2);
myself.ShowQuestMark(myself.c_quest0, 406);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(403);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest2, 403) && gg.OwnItemCount(myself.c_quest2, 1183) < 10 && myself.i_quest2 == 1 && gg.Rand(10) < 8) {
myself.GiveItem1(myself.c_quest2, 1183, 1);
if (gg.OwnItemCount(myself.c_quest2, 1183) >= 9) {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest2, 403, 3);
myself.ShowQuestMark(myself.c_quest2, 403);

} else {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(708);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 708) == 1 && gg.GetMemoState(c0, 708) / 10 == 2) {
i0 = gg.GetMemoStateEx(c0, 708, 1);
i1 = gg.Rand(100);
if (i1 < i0) {
myself.CreateOnePrivateEx(1027393, "q_duahan_of_glodio", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, myself.sm.id);

} else {
myself.SetMemoStateEx(c0, 708, 1, i0 + 1);

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam weapon_class_id) {
myself.SetCurrentQuestID(406);
if (gg.HaveMemo(attacker, 406)) {
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
myself.SetCurrentQuestID(403);
if (gg.HaveMemo(attacker, 403)) {
switch (myself.i_quest2) {
case 0: {
myself.c_quest2 = attacker;
if (myself.c_quest2.equiped_weapon_class_id != 1181 && myself.c_quest2.equiped_weapon_class_id != 1182) {
myself.i_quest2 = 2;

} else {
myself.i_quest2 = 1;

}
break;

}
case 1: {
if (myself.c_quest2.equiped_weapon_class_id != 1181 && myself.c_quest2.equiped_weapon_class_id != 1182) {
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
super;
	}


}