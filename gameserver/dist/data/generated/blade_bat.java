package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class blade_bat extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 108) == 1 && gg.OwnItemCount(target, 1570) && gg.OwnItemCount(target, 1571) == 0) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 294) && gg.OwnItemCount(target, 1491) < 100) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(108);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 2) {
myself.GiveItem1(target, 1571, 1);
myself.DeleteItem1(target, 1570, 1);
myself.SetFlagJournal(target, 108, 12);
myself.ShowQuestMark(target, 108);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(294);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(10);
if (i0 > 5) {
if (gg.OwnItemCount(target, 1491) >= 99) {
myself.GiveItem1(target, 1491, 1);
myself.SetFlagJournal(target, 294, 2);
myself.ShowQuestMark(target, 294);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 1491, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

} else if (i0 > 2) {
if (gg.OwnItemCount(target, 1491) >= 98) {
myself.GiveItem1(target, 1491, 100 - gg.OwnItemCount(target, 1491));
myself.SetFlagJournal(target, 294, 2);
myself.ShowQuestMark(target, 294);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 1491, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(target, 1491) >= 97) {
myself.GiveItem1(target, 1491, 100 - gg.OwnItemCount(target, 1491));
myself.SetFlagJournal(target, 294, 2);
myself.ShowQuestMark(target, 294);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 1491, 3);
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