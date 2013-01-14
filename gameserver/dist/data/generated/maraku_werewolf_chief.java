package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class maraku_werewolf_chief extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(274);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 274) && gg.OwnItemCount(c1, 1477) < 40) {
if (gg.OwnItemCount(c1, 1477) < 39) {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 274, 2);
myself.ShowQuestMark(c1, 274);

}
myself.GiveItem1(c1, 1477, 1);
i0 = gg.Rand(100);
if (i0 <= 5) {
myself.GiveItem1(c1, 1501, 1);

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