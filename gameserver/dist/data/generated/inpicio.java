package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class inpicio extends warrior_passive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(3, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(221);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 221) && gg.OwnItemCount(c1, 3240) == 1 && gg.OwnItemCount(c1, 3272) == 1 && gg.OwnItemCount(c1, 3270) == 0 && gg.OwnItemCount(c1, 3271) == 0) {
if (gg.OwnItemCount(c1, 3274) < 10 && gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3274, 1);
if (gg.OwnItemCount(c1, 3274) >= 9) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3273) >= 20 && gg.OwnItemCount(c1, 3275) >= 10) {
myself.SetFlagJournal(c1, 221, 8);
myself.ShowQuestMark(c1, 221);

}

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
if (gg.HaveMemo(c1, 228) && gg.OwnItemCount(c1, 2847) == 1 && gg.OwnItemCount(c1, 2862) == 1 && gg.OwnItemCount(c1, 2848) < 20) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2848, 1);
if (gg.OwnItemCount(c1, 2848) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 420) == 1 && gg.OwnItemCount(c1, 3818) == 1 && gg.OwnItemCount(c1, 3820) < 10 || gg.OwnItemCount(c1, 3819) == 1 && gg.OwnItemCount(c1, 3820) < 20) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.Rand(100) < 30) {
i0 = 19;
if (gg.OwnItemCount(c1, 3818) == 1) {
i0 = 9;

}
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(c1, 3820) >= i0) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}
myself.GiveItem1(c1, 3820, 1);

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
case 3: {
myself.SetCurrentQuestID(134);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
i1 = gg.Rand(100);
if (gg.OwnItemCount(target, 10336) >= 1) {
if (i1 < 100) {
myself.CreateOnePrivateEx(1027339, "pagan_of_cruma", 0, 0, gg.FloatToInt(myself.sm.x) + 20, gg.FloatToInt(myself.sm.y) + 20, gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, myself.sm.id);
myself.DeleteItem1(target, 10336, 1);

} else {
myself.DeleteItem1(target, 10336, 1);

}

} else if (i0 < 83) {
myself.GiveItem1(target, 10335, 1);
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