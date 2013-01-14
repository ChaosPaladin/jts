package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class brun_lizardman extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 123) == 1 && gg.GetMemoState(target, 123) == 1 && gg.OwnItemCount(target, 8549) < 10) {
always_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(123);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 7) {
myself.GiveItem1(target, 8549, 1);
if (gg.OwnItemCount(target, 8549) >= 9) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 123, 2);
myself.ShowQuestMark(target, 123);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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