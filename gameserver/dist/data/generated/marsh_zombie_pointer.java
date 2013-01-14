package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marsh_zombie_pointer extends warrior_pa_slow_type2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.OwnItemCount(target, 972) == 1) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 319) == 1 && gg.OwnItemCount(target, 1045) < 5) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(103);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 5) {
myself.GiveItem1(target, 973, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.DeleteItem1(target, 972, 1);
myself.SetFlagJournal(target, 103, 7);
myself.ShowQuestMark(target, 103);

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(319);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) > 7) {
myself.GiveItem1(target, 1045, 1);
if (gg.OwnItemCount(target, 1045) >= 4) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 319, 2);
myself.ShowQuestMark(target, 319);

} else {
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