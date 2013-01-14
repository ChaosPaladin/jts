package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hanged_man_ripper extends warrior_aggressive_casting_hold_magic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 8 && gg.OwnItemCount(target, 9775) < 30) {
always_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(4, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(212);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 212) && gg.GetMemoState(c1, 212) == 6) {
if (gg.Rand(100) < c1.flag - 3 * 33) {
myself.CreateOnePrivateEx(1030656, "spirit_of_sir_talianus", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.SoundEffect(c1, "ItemSound.quest_middle");
c1.flag = 0;
myself.SetFlagJournal(c1, 212, 8);
myself.ShowQuestMark(c1, 212);

} else {
c1.flag = c1.flag + 1;

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(219);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3174) && gg.OwnItemCount(c1, 3175) == 0) {
myself.GiveItem1(c1, 3175, 1);
myself.DeleteItem1(c1, 3174, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 219, 3);
myself.ShowQuestMark(c1, 219);

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(225);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 225) == 1 && gg.OwnItemCount(c1, 2800) == 1 && gg.OwnItemCount(c1, 2802) < 4 && gg.OwnItemCount(c1, 2804) == 0) {
if (gg.OwnItemCount(c1, 2802) < 3) {
if (gg.Rand(100) < 50) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2802, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

} else if (gg.Rand(100) < 50) {
myself.DeleteItem1(c1, 2802, gg.OwnItemCount(c1, 2802));
myself.GiveItem1(c1, 2804, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 2803) >= 1) {
myself.SetFlagJournal(c1, 225, 15);
myself.ShowQuestMark(c1, 225);

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(66);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (gg.OwnItemCount(target, 9775) < 30) {
if (gg.OwnItemCount(target, 9775) >= 29) {
myself.SetFlagJournal(target, 66, 8);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9775, 1);
if (i4 < 100 && gg.OwnItemCount(target, 9775) < 29) {
myself.GiveItem1(target, 9775, 1);

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
case 4: {
myself.SetCurrentQuestID(137);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 100) {
if (gg.OwnItemCount(target, 10340) >= 29) {
myself.GiveItem1(target, 10340, 1);
myself.SetFlagJournal(target, 137, 3);
myself.ShowQuestMark(target, 137);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10340, 1);
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