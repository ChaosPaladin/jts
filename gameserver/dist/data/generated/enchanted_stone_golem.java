package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class enchanted_stone_golem extends warrior_pa_slow_type1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3729) && gg.OwnItemCount(target, 3771) < 50) {
random1_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3695) && gg.OwnItemCount(target, 3715) < 20) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 343) && myself.IsInCategory(2, target.occupation)) {
random1_list.SetInfo(4, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(229);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 229) == 1 && gg.OwnItemCount(c1, 3309) == 1 && gg.OwnItemCount(c1, 3310) == 1) {
if (gg.Rand(100) <= 100 && gg.OwnItemCount(c1, 3313) < 20) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3313, 1);
if (gg.OwnItemCount(c1, 3313) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(228);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 228) && gg.OwnItemCount(c1, 2847) == 1 && gg.OwnItemCount(c1, 2863) == 1 && gg.OwnItemCount(c1, 2854) < 10) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2854, 1);
if (gg.OwnItemCount(c1, 2854) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
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
switch (code_info.code) {
case 2: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 3771, 1);
if (gg.OwnItemCount(target, 3771) >= 50) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 62) {
myself.GiveItem1(target, 3715, 1);
if (gg.OwnItemCount(target, 3715) >= 20) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(343);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 65) {
myself.GiveItem1(target, 4364, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
if (gg.GetMemoStateEx(target, 343, 1) > 1) {
if (gg.Rand(100) <= 12) {
myself.SetMemoStateEx(target, 343, 1, gg.GetMemoStateEx(target, 343, 1) - 1);

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