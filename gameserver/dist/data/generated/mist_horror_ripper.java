package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mist_horror_ripper extends warrior_aggressive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 334) && gg.OwnItemCount(target, 3680) && gg.OwnItemCount(target, 3681) && gg.OwnItemCount(target, 3687) == 0) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(1, target);

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
myself.SetCurrentQuestID(334);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) == 0) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3687, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.OwnItemCount(target, 3684) >= 1 && gg.OwnItemCount(target, 3685) >= 1 && gg.OwnItemCount(target, 3686) >= 1 && gg.OwnItemCount(target, 3688) >= 1 && gg.OwnItemCount(target, 3689) >= 1 && gg.OwnItemCount(target, 3689) >= 1 && gg.OwnItemCount(target, 3690) >= 1 && gg.OwnItemCount(target, 3691) >= 1) {
myself.SetJournal(target, 334, 4);
myself.ShowQuestMark(target, 334);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 18) {
myself.GiveItem1(target, 7586, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}

}

}
super;
	}


}