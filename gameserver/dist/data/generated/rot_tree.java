package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rot_tree extends warrior_passive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3748) && gg.OwnItemCount(target, 3790) < 40) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 356) == 1 && gg.OwnItemCount(target, 5866) < 50) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 77) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3790, 1);
if (gg.OwnItemCount(target, 3790) >= 40) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(356);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 73) {
myself.GiveItem1(target, 5866, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.OwnItemCount(target, 5866) >= 49 && gg.OwnItemCount(target, 5865) >= 50) {
myself.SetFlagJournal(target, 356, 3);
myself.ShowQuestMark(target, 356);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(target, 5866) >= 49) {
myself.SetFlagJournal(target, 356, 2);
myself.ShowQuestMark(target, 356);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
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