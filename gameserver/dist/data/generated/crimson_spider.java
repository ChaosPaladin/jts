package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crimson_spider extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 261) == 1 && gg.OwnItemCount(target, 1087) < 8) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 419) == 1 && gg.OwnItemCount(target, 3419) == 1 && gg.OwnItemCount(target, 3424) < 50) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(261);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 1087, 1);
if (gg.OwnItemCount(target, 1087) >= 7) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 261, 2);
myself.ShowQuestMark(target, 261);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 3424, 1);
if (gg.OwnItemCount(target, 3424) >= 50) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_middle");

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