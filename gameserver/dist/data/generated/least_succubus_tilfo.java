package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class least_succubus_tilfo extends warrior_aggressive_casting_hold_magic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 3) == 1 && gg.OwnItemCount(target, 1083) == 0) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 3) == 1 && gg.OwnItemCount(target, 1083) == 0) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 3) == 1 && gg.OwnItemCount(target, 1083) == 0) {
random1_list.SetInfo(0, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(3);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 1083, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
if (gg.OwnItemCount(target, 1081) >= 1 && gg.OwnItemCount(target, 1082) >= 1) {
myself.SetFlagJournal(target, 3, 2);
myself.ShowQuestMark(target, 3);

}

}
break;

}

}

}
super;
	}


}