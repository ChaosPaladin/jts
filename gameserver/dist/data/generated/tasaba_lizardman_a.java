package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tasaba_lizardman_a extends warrior_passive_use_power_shot {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.OwnItemCount(target, 4296) && gg.HaveMemo(target, 351)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 139) == 1 && gg.GetMemoState(target, 139) == 3 && myself.GetOneTimeQuestFlag(target, 139) == 0) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 139) == 1 && gg.GetMemoState(target, 139) == 3 && myself.GetOneTimeQuestFlag(target, 139) == 0) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 139) == 1 && gg.GetMemoState(target, 139) == 3 && myself.GetOneTimeQuestFlag(target, 139) == 0) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
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
myself.SetCurrentQuestID(351);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (i0 < 10) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 4297, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.Rand(20) == 0) {
myself.GiveItem1(target, 4298, 1);

}

} else if (i0 < 15) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 4297, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");
if (gg.Rand(20) == 0) {
myself.GiveItem1(target, 4298, 1);

}

} else if (gg.Rand(100) < 4) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 4298, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(139);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
i1 = gg.Rand(11);
if (i0 < 100) {
if (i1 < 10) {
myself.GiveItem1(target, 10345, 1);

} else {
myself.GiveItem1(target, 10346, 1);

}
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 185) {
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