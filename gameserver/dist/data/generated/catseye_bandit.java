package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class catseye_bandit extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(403);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
myself.Say(gg.MakeFString(40307, "", "", "", "", ""));
if (gg.HaveMemo(myself.c_quest2, 403) && gg.OwnItemCount(myself.c_quest2, 1185) > 0 && myself.i_quest2 == 1) {
switch (gg.Rand(4)) {
case 0: {
if (gg.OwnItemCount(myself.c_quest2, 1186) == 0) {
myself.GiveItem1(myself.c_quest2, 1186, 1);
if (gg.OwnItemCount(myself.c_quest2, 1186) + gg.OwnItemCount(myself.c_quest2, 1187) + gg.OwnItemCount(myself.c_quest2, 1188) + gg.OwnItemCount(myself.c_quest2, 1189) >= 3) {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest2, 403, 6);
myself.ShowQuestMark(myself.c_quest2, 403);

} else {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
if (gg.OwnItemCount(myself.c_quest2, 1187) == 0) {
myself.GiveItem1(myself.c_quest2, 1187, 1);
if (gg.OwnItemCount(myself.c_quest2, 1186) + gg.OwnItemCount(myself.c_quest2, 1187) + gg.OwnItemCount(myself.c_quest2, 1188) + gg.OwnItemCount(myself.c_quest2, 1189) >= 3) {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest2, 403, 6);
myself.ShowQuestMark(myself.c_quest2, 403);

} else {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
if (gg.OwnItemCount(myself.c_quest2, 1188) == 0) {
myself.GiveItem1(myself.c_quest2, 1188, 1);
if (gg.OwnItemCount(myself.c_quest2, 1186) + gg.OwnItemCount(myself.c_quest2, 1187) + gg.OwnItemCount(myself.c_quest2, 1188) + gg.OwnItemCount(myself.c_quest2, 1189) >= 3) {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest2, 403, 6);
myself.ShowQuestMark(myself.c_quest2, 403);

} else {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_itemget");

}

}
break;

}
case 3: {
if (gg.OwnItemCount(myself.c_quest2, 1189) == 0) {
myself.GiveItem1(myself.c_quest2, 1189, 1);
if (gg.OwnItemCount(myself.c_quest2, 1186) + gg.OwnItemCount(myself.c_quest2, 1187) + gg.OwnItemCount(myself.c_quest2, 1188) + gg.OwnItemCount(myself.c_quest2, 1189) >= 3) {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest2, 403, 6);
myself.ShowQuestMark(myself.c_quest2, 403);

} else {
myself.SoundEffect(myself.c_quest2, "ItemSound.quest_itemget");

}

}
break;

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
myself.SetCurrentQuestID(403);
if (gg.HaveMemo(attacker, 403)) {
switch (myself.i_quest2) {
case 0: {
myself.c_quest2 = attacker;
if (myself.c_quest2.equiped_weapon_class_id != 1181 && myself.c_quest2.equiped_weapon_class_id != 1182) {
myself.i_quest2 = 2;

} else {
myself.Say(gg.MakeFString(40306, "", "", "", "", ""));
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