package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class plague_zombie extends warrior_pa_slow_type2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(159);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 159) && gg.OwnItemCount(c1, 1072) && gg.Rand(100) < 40 && gg.OwnItemCount(c1, 1035) < 5) {
if (gg.OwnItemCount(c1, 1035) >= 4) {
myself.GiveItem1(c1, 1035, 1);
myself.SetFlagJournal(c1, 159, 4);
myself.ShowQuestMark(c1, 159);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1035, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.HaveMemo(c1, 159) && gg.OwnItemCount(c1, 1071) && gg.Rand(100) < 40 && gg.OwnItemCount(c1, 1035) == 0) {
myself.GiveItem1(c1, 1035, 1);
myself.SetFlagJournal(c1, 159, 2);
myself.ShowQuestMark(c1, 159);
myself.SoundEffect(c1, "ItemSound.quest_middle");

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