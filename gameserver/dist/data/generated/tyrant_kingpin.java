package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tyrant_kingpin extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 334) && gg.OwnItemCount(target, 3680) && gg.OwnItemCount(target, 3681) && gg.OwnItemCount(target, 3690) == 0) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 422) && gg.GetMemoState(target, 422) == 7 && gg.OwnItemCount(target, 4328) < 1) {
random1_list.SetInfo(4, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(219);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 219) && gg.OwnItemCount(c1, 3177) && gg.OwnItemCount(c1, 3181) < 10) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3181) == 9) {
myself.GiveItem1(c1, 3181, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3178) >= 10 && gg.OwnItemCount(c1, 3179) >= 10 && gg.OwnItemCount(c1, 3180) >= 10 && gg.OwnItemCount(c1, 3182) >= 10) {
myself.SetFlagJournal(c1, 219, 7);
myself.ShowQuestMark(c1, 219);

}

} else {
myself.GiveItem1(c1, 3181, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

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
if (gg.HaveMemo(c1, 220) && gg.OwnItemCount(c1, 3204) && gg.OwnItemCount(c1, 3206) < 10) {
if (gg.Rand(20) < 20) {
if (gg.OwnItemCount(c1, 3206) == 9) {
myself.GiveItem1(c1, 3206, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3205) >= 10 && gg.OwnItemCount(c1, 3207) >= 10) {
myself.SetFlagJournal(c1, 220, 2);
myself.ShowQuestMark(c1, 220);

}

} else {
myself.GiveItem1(c1, 3206, 1);
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
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3350) && gg.OwnItemCount(c1, 3343) < 30) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3343) >= 27) {
myself.GiveItem1(c1, 3343, 3);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3343, 3);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

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
myself.SetCurrentQuestID(334);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) == 0) {
target.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(target, 3690, 1);
if (gg.OwnItemCount(target, 3684) >= 1 && gg.OwnItemCount(target, 3685) >= 1 && gg.OwnItemCount(target, 3686) >= 1 && gg.OwnItemCount(target, 3687) >= 1 && gg.OwnItemCount(target, 3688) >= 1 && gg.OwnItemCount(target, 3689) >= 1 && gg.OwnItemCount(target, 3689) >= 1 && gg.OwnItemCount(target, 3691) >= 1) {
myself.SetJournal(target, 334, 4);
myself.ShowQuestMark(target, 334);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(422);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 4328, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
break;

}

}

}
super;
	}


}