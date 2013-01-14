package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tamlin_orc_archer extends warrior_passive_use_power_shot {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(220);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 220) && gg.OwnItemCount(c1, 3209) && gg.OwnItemCount(c1, 3217) && gg.OwnItemCount(c1, 3218) < 20) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3218) == 19) {
myself.GiveItem1(c1, 3218, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3219) >= 20) {
myself.SetFlagJournal(c1, 220, 7);
myself.ShowQuestMark(c1, 220);

}

} else {
myself.GiveItem1(c1, 3218, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(229);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 229) == 1 && gg.OwnItemCount(c1, 3328) == 1) {
if (gg.Rand(100) < 50 && gg.OwnItemCount(c1, 3329) < 20) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3329, 1);
if (gg.OwnItemCount(c1, 3329) >= 20) {
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
myself.SetCurrentQuestID(233);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 233) && gg.OwnItemCount(c1, 2880) == 1 && gg.OwnItemCount(c1, 2881) < 13) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2881, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(222);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 222) && gg.OwnItemCount(c1, 2767) > 0 && gg.OwnItemCount(c1, 2777) < 10 && gg.GetMemoState(c1, 222) == 1) {
i0 = gg.GetMemoStateEx(c1, 222, 1);
myself.SetMemoStateEx(c1, 222, 1, i0 + 1);
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2777, 1);
if (gg.OwnItemCount(c1, 2777) >= 10) {
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
case 4: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3738) && gg.OwnItemCount(c1, 3780) < 40) {
if (gg.Rand(100) < 90) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3780, 1);
if (gg.OwnItemCount(c1, 3780) >= 40) {
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

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}


}