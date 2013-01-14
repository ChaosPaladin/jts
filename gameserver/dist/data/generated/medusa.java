package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class medusa extends warrior_aggressive {
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
target = last_attacker;
always_list.SetInfo(5, target);
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
if (i0 < 61) {
myself.GiveItem1(c1, 1453, 1);
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
if (gg.HaveMemo(c1, 223) && gg.OwnItemCount(c1, 3281) && gg.OwnItemCount(c1, 3288) < 30) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 3288) >= 27) {
myself.GiveItem1(c1, 3288, 3);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3287) >= 30 && gg.OwnItemCount(c1, 3289) >= 30) {
myself.SetFlagJournal(c1, 223, 7);
myself.ShowQuestMark(c1, 223);

}

} else {
myself.GiveItem1(c1, 3288, 3);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

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
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3177) && gg.OwnItemCount(c1, 3178) < 10) {
if (gg.Rand(2) <= 1) {
if (gg.OwnItemCount(c1, 3178) == 9) {
myself.GiveItem1(c1, 3178, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3179) >= 10 && gg.OwnItemCount(c1, 3180) >= 10 && gg.OwnItemCount(c1, 3181) >= 10 && gg.OwnItemCount(c1, 3182) >= 10) {
myself.SetFlagJournal(c1, 219, 7);
myself.ShowQuestMark(c1, 219);

}

} else {
myself.GiveItem1(c1, 3178, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(233);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 233) && gg.OwnItemCount(c1, 2895) == 1) {
i0 = gg.Rand(100);
if (i0 > 0) {
if (gg.OwnItemCount(c1, 2897) == 0) {
myself.GiveItem1(c1, 2897, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2898) == 0) {
myself.GiveItem1(c1, 2898, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2899) == 0) {
myself.GiveItem1(c1, 2899, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2900) == 0) {
myself.GiveItem1(c1, 2900, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(213);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 213) && gg.OwnItemCount(c1, 2659) == 1 && gg.OwnItemCount(c1, 2660) < 10) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2660, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 2660) >= 9) {
myself.SetFlagJournal(c1, 213, 10);
myself.ShowQuestMark(c1, 213);

}

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(214);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 214) && gg.OwnItemCount(c1, 2705) == 1 && gg.OwnItemCount(c1, 2711) == 1 && gg.OwnItemCount(c1, 2715) == 1 && gg.OwnItemCount(c1, 2717) < 12) {
myself.GiveItem1(c1, 2717, 1);
if (gg.OwnItemCount(c1, 2717) >= 12) {
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


}