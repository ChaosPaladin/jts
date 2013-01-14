package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harpy_martriarch extends warrior_aggressive_immediate {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(223);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 223) && gg.OwnItemCount(c1, 3281) && gg.OwnItemCount(c1, 3287) < 30) {
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