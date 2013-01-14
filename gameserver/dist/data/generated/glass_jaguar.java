package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class glass_jaguar extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 136) == 1 && gg.GetMemoState(target, 136) == 10 && gg.OwnItemCount(target, 9789) < 5) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(334);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 334) && gg.OwnItemCount(c1, 3680) && gg.OwnItemCount(c1, 3681) && gg.OwnItemCount(c1, 3686) == 0) {
if (gg.Rand(10) == 0) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3686, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
if (gg.OwnItemCount(c1, 3684) >= 1 && gg.OwnItemCount(c1, 3685) >= 1 && gg.OwnItemCount(c1, 3687) >= 1 && gg.OwnItemCount(c1, 3688) >= 1 && gg.OwnItemCount(c1, 3689) >= 1 && gg.OwnItemCount(c1, 3689) >= 1 && gg.OwnItemCount(c1, 3690) >= 1 && gg.OwnItemCount(c1, 3691) >= 1) {
myself.SetJournal(c1, 334, 4);
myself.ShowQuestMark(c1, 334);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

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
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(136);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 986 && gg.OwnItemCount(target, 9789) < 5) {
if (gg.OwnItemCount(target, 9789) >= 4) {
myself.SetFlagJournal(target, 136, 8);
myself.ShowQuestMark(target, 136);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9789, 1);

}

}
break;

}

}

}
super;
	}


}