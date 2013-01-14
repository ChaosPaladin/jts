package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barbed_bat extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(294);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 294) && gg.OwnItemCount(c1, 1491) < 100) {
i0 = gg.Rand(10);
if (i0 > 6) {
if (gg.OwnItemCount(c1, 1491) >= 99) {
myself.GiveItem1(c1, 1491, 1);
myself.SetFlagJournal(c1, 294, 2);
myself.ShowQuestMark(c1, 294);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1491, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (i0 > 3) {
if (gg.OwnItemCount(c1, 1491) >= 98) {
myself.GiveItem1(c1, 1491, 100 - gg.OwnItemCount(c1, 1491));
myself.SetFlagJournal(c1, 294, 2);
myself.ShowQuestMark(c1, 294);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1491, 2);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (i0 > 1) {
if (gg.OwnItemCount(c1, 1491) >= 97) {
myself.GiveItem1(c1, 1491, 100 - gg.OwnItemCount(c1, 1491));
myself.SetFlagJournal(c1, 294, 2);
myself.ShowQuestMark(c1, 294);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1491, 3);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 1491) >= 96) {
myself.GiveItem1(c1, 1491, 100 - gg.OwnItemCount(c1, 1491));
myself.SetFlagJournal(c1, 294, 2);
myself.ShowQuestMark(c1, 294);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1491, 4);
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