package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tarlk_bugbear_boss extends warrior_passive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.OwnItemCount(target, 4333) && gg.HaveMemo(target, 504) && gg.OwnItemCount(target, 4332) < 30) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(336);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 80) {
myself.GiveItem1(target, 3490, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(504);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 8) {
if (gg.OwnItemCount(target, 4332) == 29) {
myself.GiveItem1(target, 4332, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 4332, 1);
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


}