package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tarlk_bugbear_warrior extends warrior_aggressive_casting_enchant_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3696) && gg.OwnItemCount(target, 3722) + gg.OwnItemCount(target, 3723) + gg.OwnItemCount(target, 3724) + gg.OwnItemCount(target, 3725) + gg.OwnItemCount(target, 3726) < 5) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3759) && gg.OwnItemCount(target, 3801) < 30) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.OwnItemCount(target, 4333) && gg.HaveMemo(target, 504) && gg.OwnItemCount(target, 4332) < 30) {
random1_list.SetInfo(2, target);

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
if (gg.Rand(10) < 2) {
if (gg.OwnItemCount(target, 3722) == 0) {
myself.CreateOnePrivate(1027144, "talk_raider_athu", 0, 1);

} else if (gg.OwnItemCount(target, 3723) == 0) {
myself.CreateOnePrivate(1027145, "talk_raider_lanka", 0, 1);

} else if (gg.OwnItemCount(target, 3724) == 0) {
myself.CreateOnePrivate(1027146, "talk_raider_triska", 0, 1);

} else if (gg.OwnItemCount(target, 3725) == 0) {
myself.CreateOnePrivate(1027147, "talk_raider_motura", 0, 1);

} else if (gg.OwnItemCount(target, 3726) == 0) {
myself.CreateOnePrivate(1027148, "talk_raider_kalath", 0, 1);

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 73) {
myself.GiveItem1(target, 3801, 1);
if (gg.OwnItemCount(target, 3801) >= 30) {
myself.SoundEffect(target, "ItemSound.quest_midddle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(504);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 7) {
target.quest_last_reward_time = myself.GetCurrentTick();
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