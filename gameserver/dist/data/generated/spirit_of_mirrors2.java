package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class spirit_of_mirrors2 extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target, HandlerParam weapon_class_id) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(104);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.IsNullCreature(c1) == 0) {
if (gg.HaveMemo(c1, 104) == 1 && myself.sm.last_blow_weapon_class_id == 748 && gg.OwnItemCount(c1, 1136) == 0 && gg.OwnItemCount(c1, 748) > 0) {
myself.DeleteItem1(c1, 748, 1);
myself.GiveItem1(c1, 1136, 1);
if (gg.OwnItemCount(c1, 1135) + gg.OwnItemCount(c1, 1136) + gg.OwnItemCount(c1, 1137) >= 2) {
myself.SetFlagJournal(c1, 104, 3);
myself.ShowQuestMark(c1, 104);

}
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 104, 2);

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