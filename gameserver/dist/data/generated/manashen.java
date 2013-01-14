package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class manashen extends warrior_passive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3695) && gg.OwnItemCount(target, 3715) < 20) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 343) && myself.IsInCategory(2, target.occupation)) {
random1_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 25 || gg.GetMemoState(target, 66) == 26 && gg.OwnItemCount(target, 9780) < 10) {
always_list.SetInfo(5, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(224);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 10 && gg.OwnItemCount(c1, 3305) == 0) {
if (gg.OwnItemCount(c1, 3302) && gg.OwnItemCount(c1, 3304) && gg.OwnItemCount(c1, 3303)) {
myself.GiveItem1(c1, 3305, 1);
myself.SetMemoState(c1, 224, 11);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 224, 11);
myself.ShowQuestMark(c1, 224);

} else {
myself.GiveItem1(c1, 3305, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(220);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 220) && gg.OwnItemCount(c1, 3204) && gg.OwnItemCount(c1, 3205) < 10) {
if (gg.Rand(20) < 20) {
if (gg.OwnItemCount(c1, 3205) == 9) {
myself.GiveItem1(c1, 3205, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3206) >= 10 && gg.OwnItemCount(c1, 3207) >= 10) {
myself.SetFlagJournal(c1, 220, 2);
myself.ShowQuestMark(c1, 220);

}

} else {
myself.GiveItem1(c1, 3205, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3348) && gg.OwnItemCount(c1, 3340) < 30) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3340) >= 28) {
myself.GiveItem1(c1, 3340, 2);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3340, 2);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(66);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 840 && gg.OwnItemCount(target, 9780) < 10) {
if (gg.GetMemoState(target, 66) == 25 && gg.OwnItemCount(target, 9780) < 1) {
myself.SetFlagJournal(target, 66, 15);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 66, 26);

} else if (gg.GetMemoState(target, 66) == 26 && gg.OwnItemCount(target, 9780) >= 9) {
myself.SetFlagJournal(target, 66, 16);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 66, 27);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9780, 1);

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
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
target.quest_last_reward_time = myself.GetCurrentTick();
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
if (gg.Rand(100) < 63) {
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