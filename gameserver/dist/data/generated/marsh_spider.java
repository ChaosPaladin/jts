package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marsh_spider extends warrior_aggressive_casting_curse {
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
always_list.SetInfo(3, target);
target = last_attacker;
always_list.SetInfo(4, target);
target = last_attacker;
always_list.SetInfo(5, target);
target = last_attacker;
if (gg.HaveMemo(target, 420) == 1 && gg.OwnItemCount(target, 3824) == 1 && gg.OwnItemCount(target, 3825) < 20) {
random1_list.SetInfo(6, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(7, target);

}
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(7, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(7, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(231);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 231) && gg.GetMemoState(c1, 231) == 4 && gg.OwnItemCount(c1, 2877) < 10 && gg.OwnItemCount(c1, 2875) == 1) {
if (gg.OwnItemCount(c1, 2877) == 9) {
myself.GiveItem1(c1, 2877, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 2877, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(224);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 10 && gg.OwnItemCount(c1, 3304) == 0) {
if (gg.OwnItemCount(c1, 3302) && gg.OwnItemCount(c1, 3305) && gg.OwnItemCount(c1, 3303)) {
myself.GiveItem1(c1, 3304, 1);
myself.SetMemoState(c1, 224, 11);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 11);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3304, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(219);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3177) && gg.OwnItemCount(c1, 3179) < 10) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 3179) == 9) {
myself.GiveItem1(c1, 3179, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3178) >= 10 && gg.OwnItemCount(c1, 3180) >= 10 && gg.OwnItemCount(c1, 3181) >= 10 && gg.OwnItemCount(c1, 3182) >= 10) {
myself.SetFlagJournal(c1, 219, 7);
myself.ShowQuestMark(c1, 219);

}

} else {
myself.GiveItem1(c1, 3179, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(232);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 232) == 1 && gg.OwnItemCount(c1, 3391) == 1 && gg.OwnItemCount(c1, 3395) == 1 && gg.OwnItemCount(c1, 3409) == 0) {
if (gg.Rand(100) < 100) {
if (gg.OwnItemCount(c1, 3407) < 10) {
myself.GiveItem1(c1, 3407, 2);
if (gg.OwnItemCount(c1, 3407) >= 8) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 3408) < 10) {
myself.GiveItem1(c1, 3408, 2);
if (gg.OwnItemCount(c1, 3408) >= 8) {
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
case 4: {
myself.SetCurrentQuestID(221);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 221) && gg.OwnItemCount(c1, 3240) == 1 && gg.OwnItemCount(c1, 3272) == 1 && gg.OwnItemCount(c1, 3270) == 0 && gg.OwnItemCount(c1, 3271) == 0) {
if (gg.OwnItemCount(c1, 3275) < 10 && gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3275, 1);
if (gg.OwnItemCount(c1, 3275) >= 9) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3273) >= 20 && gg.OwnItemCount(c1, 3274) >= 10) {
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
case 5: {
myself.SetCurrentQuestID(218);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 218) && gg.OwnItemCount(c1, 3144) == 1 && gg.OwnItemCount(c1, 3153) == 1 && gg.OwnItemCount(c1, 3164) < 20) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3164, 4);
if (gg.OwnItemCount(c1, 3164) >= 16) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3165) >= 20) {
myself.SetFlagJournal(c1, 218, 10);
myself.ShowQuestMark(c1, 218);

}

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
case 6: {
myself.SetCurrentQuestID(420);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 50) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3825, 1);
if (gg.OwnItemCount(target, 3825) >= 19) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 7: {
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

} else if (i0 < 95) {
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