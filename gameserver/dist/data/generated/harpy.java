package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harpy extends warrior_aggressive_casting_curse {
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
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(331);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 331)) {
i0 = gg.Rand(100);
if (i0 < 59) {
myself.GiveItem1(c1, 1452, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(223);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 223) && gg.OwnItemCount(c1, 3281) && gg.OwnItemCount(c1, 3287) < 30) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 3287) >= 28) {
myself.GiveItem1(c1, 3287, 2);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3288) >= 30 && gg.OwnItemCount(c1, 3289) >= 30) {
myself.SetFlagJournal(c1, 223, 7);
myself.ShowQuestMark(c1, 223);

}

} else {
myself.GiveItem1(c1, 3287, 2);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(218);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 218) && gg.OwnItemCount(c1, 3144) == 1 && gg.OwnItemCount(c1, 3153) == 1 && gg.OwnItemCount(c1, 3165) < 20) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3165, 4);
if (gg.OwnItemCount(c1, 3165) >= 16) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3164) >= 20) {
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
case 3: {
myself.SetCurrentQuestID(228);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 228) && gg.OwnItemCount(c1, 2847) == 1 && gg.OwnItemCount(c1, 2861) == 1 && gg.OwnItemCount(c1, 2850) < 20) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2850, 1);
if (gg.OwnItemCount(c1, 2850) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(223);
switch (myself.i_quest0) {
case 0: {
myself.c_quest0 = attacker;
if (gg.HaveMemo(myself.c_quest0, 223) && gg.OwnItemCount(myself.c_quest0, 3281) && gg.OwnItemCount(myself.c_quest0, 3287) < 30) {
if (gg.Rand(2) == 1) {
if (gg.Rand(10) < 7) {
myself.CreateOnePrivate(1027088, "harpy_martriarch", 0, 1);

} else {
myself.CreateOnePrivate(1027088, "harpy_martriarch", 0, 1);
myself.CreateOnePrivate(1027088, "harpy_martriarch", 0, 1);

}

}

}
myself.i_quest0 = 1;
break;

}
case 1: {
myself.i_quest0 = 2;
break;

}
case 2: {
break;

}

}
super;
	}


}