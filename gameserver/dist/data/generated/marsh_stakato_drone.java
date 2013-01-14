package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marsh_stakato_drone extends warrior_aggressive_casting_enchant_self {
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
always_list.SetInfo(6, target);
target = last_attacker;
always_list.SetInfo(7, target);
target = last_attacker;
if (gg.HaveMemo(target, 333) == 1 && gg.OwnItemCount(target, 3674) >= 1) {
random1_list.SetInfo(8, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 64) == 1 && gg.GetMemoState(target, 64) == 7 && gg.OwnItemCount(target, 9757) == 0) {
always_list.SetInfo(9, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(10, target);

}
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(10, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 134) >= 1 && gg.GetMemoState(target, 134) == 3 && gg.OwnItemCount(target, 10337) < 3) {
random1_list.SetInfo(10, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(11, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(11, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(11, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(217);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 217) && gg.GetMemoState(c1, 217) == 6 && gg.OwnItemCount(c1, 2751) < 5 && gg.OwnItemCount(c1, 2755) && gg.OwnItemCount(c1, 2754) == 0) {
if (gg.OwnItemCount(c1, 2751) >= 4) {
myself.GiveItem1(c1, 2754, 1);
myself.DeleteItem1(c1, 2751, gg.OwnItemCount(c1, 2751));
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 2752) >= 1 && gg.OwnItemCount(c1, 2753) >= 1) {
myself.SetFlagJournal(c1, 217, 7);
myself.ShowQuestMark(c1, 217);

}

} else {
myself.GiveItem1(c1, 2751, 1);
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
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 10 && gg.OwnItemCount(c1, 3303) == 0) {
if (gg.OwnItemCount(c1, 3302) && gg.OwnItemCount(c1, 3304) && gg.OwnItemCount(c1, 3305)) {
myself.GiveItem1(c1, 3303, 1);
myself.SetMemoState(c1, 224, 11);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 11);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3303, 1);
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
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3177) && gg.OwnItemCount(c1, 3182) < 10) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3182) == 9) {
myself.GiveItem1(c1, 3182, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3178) >= 10 && gg.OwnItemCount(c1, 3179) >= 10 && gg.OwnItemCount(c1, 3180) >= 10 && gg.OwnItemCount(c1, 3181) >= 10) {
myself.SetFlagJournal(c1, 219, 7);
myself.ShowQuestMark(c1, 219);

}

} else {
myself.GiveItem1(c1, 3182, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(220);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 220) && gg.OwnItemCount(c1, 3209) && gg.OwnItemCount(c1, 3210) && gg.OwnItemCount(c1, 3213) == 0 && gg.OwnItemCount(c1, 3233) && gg.OwnItemCount(c1, 3234) < 30) {
if (gg.Rand(20) < 20) {
if (gg.OwnItemCount(c1, 3234) == 29) {
myself.GiveItem1(c1, 3234, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3234, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

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
if (gg.OwnItemCount(c1, 3273) < 20 && gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3273, 1);
if (gg.OwnItemCount(c1, 3273) >= 19) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3274) >= 10 && gg.OwnItemCount(c1, 3275) >= 10) {
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
case 6: {
myself.SetCurrentQuestID(213);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 213) && gg.OwnItemCount(c1, 2667) == 1 && gg.OwnItemCount(c1, 2668) == 0) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2668, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 2669) >= 1 && gg.OwnItemCount(c1, 2670) >= 1 && gg.OwnItemCount(c1, 2671) >= 1) {
myself.SetFlagJournal(c1, 213, 16);
myself.ShowQuestMark(c1, 213);

}

}

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(222);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 222) && gg.OwnItemCount(c1, 2764) > 0 && gg.OwnItemCount(c1, 2770) < 10 && gg.GetMemoState(c1, 222) == 1) {
i0 = gg.GetMemoStateEx(c1, 222, 1);
myself.SetMemoStateEx(c1, 222, 1, i0 + 1);
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2770, 1);
if (gg.OwnItemCount(c1, 2770) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (i0 >= 9) {
myself.SetFlagJournal(c1, 222, 3);
myself.SetMemoStateEx(c1, 222, 1, 0);

}

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 9: {
myself.SetCurrentQuestID(64);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(target, 9757, 1);
if (gg.OwnItemCount(target, 9756) > 0) {
myself.SetFlagJournal(target, 64, 10);
myself.ShowQuestMark(target, 64);
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
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 8: {
myself.SetCurrentQuestID(333);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 3851, 1);

}
if (gg.Rand(100) < 15) {
myself.GiveItem1(target, 3443, 1);

}
if (gg.Rand(100) < 2 && gg.HaveMemo(target, 333) && gg.OwnItemCount(target, 3674)) {
myself.CreateOnePrivate(1027152, "marsh_stakato_marquess", 0, 1);

}

}
break;

}
case 10: {
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

} else if (i0 < 96) {
myself.GiveItem1(target, 10335, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 11: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 29) {
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