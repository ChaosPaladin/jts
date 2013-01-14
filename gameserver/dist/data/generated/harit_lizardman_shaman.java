package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harit_lizardman_shaman extends wizard_pa_ddmagic2_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.GetMemoState(target, 337) == 21110 || gg.GetMemoState(target, 337) == 21100 || gg.GetMemoState(target, 337) == 21010 || gg.GetMemoState(target, 337) == 21000 || gg.GetMemoState(target, 337) == 20110 || gg.GetMemoState(target, 337) == 20100 || gg.GetMemoState(target, 337) == 20010 || gg.GetMemoState(target, 337) == 20000 && gg.OwnItemCount(target, 3858) == 0 && gg.HaveMemo(target, 337) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.GetMemoState(target, 337) == 21110 || gg.GetMemoState(target, 337) == 21100 || gg.GetMemoState(target, 337) == 21010 || gg.GetMemoState(target, 337) == 21000 || gg.GetMemoState(target, 337) == 20110 || gg.GetMemoState(target, 337) == 20100 || gg.GetMemoState(target, 337) == 20010 || gg.GetMemoState(target, 337) == 20000 && gg.OwnItemCount(target, 3858) == 0 && gg.HaveMemo(target, 337) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.GetMemoState(target, 337) == 21110 || gg.GetMemoState(target, 337) == 21100 || gg.GetMemoState(target, 337) == 21010 || gg.GetMemoState(target, 337) == 21000 || gg.GetMemoState(target, 337) == 20110 || gg.GetMemoState(target, 337) == 20100 || gg.GetMemoState(target, 337) == 20010 || gg.GetMemoState(target, 337) == 20000 && gg.OwnItemCount(target, 3858) == 0 && gg.HaveMemo(target, 337) == 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 2 && gg.OwnItemCount(target, 3812) == 0) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 2 && gg.OwnItemCount(target, 3812) == 0) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 2 && gg.OwnItemCount(target, 3812) == 0) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
random1_list.SetInfo(2, target);
random1_list.SetInfo(2, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
random1_list.SetInfo(2, target);

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

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
myself.SetCurrentQuestID(337);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.CreateOnePrivate(1027172, "harit_lizardman_zealot", 0, 1);
myself.CreateOnePrivate(1027172, "harit_lizardman_zealot", 0, 1);
myself.CreateOnePrivate(1027172, "harit_lizardman_zealot", 0, 1);

}
break;

}
case 1: {
myself.SetCurrentQuestID(336);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 63) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3812, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.SetFlagJournal(target, 336, 3);
myself.ShowQuestMark(target, 336);

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(501);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c2 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c2) == 0) {
if (gg.HaveMemo(c2, 501) && gg.GetMemoState(c2, 501) >= 3 && gg.GetMemoState(c2, 501) < 6) {
if (gg.Rand(10) == 1) {
myself.GiveItem1(target, 3832, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 645) {
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