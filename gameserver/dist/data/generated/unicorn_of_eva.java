package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class unicorn_of_eva extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(218);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 218) && gg.OwnItemCount(c1, 3144) == 1 && gg.OwnItemCount(c1, 3026) == 1 && gg.OwnItemCount(c1, 3158) == 1 && gg.OwnItemCount(c1, 3159) == 0) {
if (myself.sm.last_blow_weapon_class_id == 3026) {
myself.GiveItem1(c1, 3159, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.DeleteItem1(c1, 3158, gg.OwnItemCount(c1, 3158));
myself.DeleteItem1(c1, 3026, gg.OwnItemCount(c1, 3026));
myself.SetFlagJournal(c1, 218, 19);
myself.ShowQuestMark(c1, 218);

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