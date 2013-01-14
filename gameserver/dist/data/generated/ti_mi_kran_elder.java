package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ti_mi_kran_elder extends warrior_pa_slow_type1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 420) == 1 && gg.OwnItemCount(target, 3817) == 1) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3696) && gg.OwnItemCount(target, 3719) < 30) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 357) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 357) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 357) == 1) {
random1_list.SetInfo(2, target);

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
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 30) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(target, 3817, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 420, 10);
myself.Say(gg.MakeFString(42048, "", "", "", "", ""));

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 85) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3719, 1);
if (gg.OwnItemCount(target, 3719) >= 30) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(357);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 62) {
myself.GiveItem1(target, 5867, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
myself.GiveItem1(target, 5867, 1);
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