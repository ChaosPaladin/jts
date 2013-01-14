package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class drake extends warrior_aggressive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(503);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c2 = myself.Pledge_GetLeader(c1);
if (myself.IsNullCreature(c2) == 0) {
if (gg.HaveMemo(c2, 503) == 1 && gg.GetMemoState(c2, 503) < 3000 && gg.GetMemoState(c2, 503) >= 2000 && myself.DistFromMe(c2) <= 1500) {
if (gg.Rand(100) < 10) {
if (gg.OwnItemCount(c2, 3839) < 10) {
myself.GiveItem1(c2, 3839, 1);
if (gg.OwnItemCount(c2, 3839) >= 10) {
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c2, "ItemSound.quest_itemget");

}

}

}
if (gg.Rand(100) < 50) {
if (gg.OwnItemCount(c2, 3841) < 10) {
myself.GiveItem1(c2, 3841, 1);
if (gg.OwnItemCount(c2, 3841) >= 10) {
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c2, "ItemSound.quest_itemget");

}

}

}

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