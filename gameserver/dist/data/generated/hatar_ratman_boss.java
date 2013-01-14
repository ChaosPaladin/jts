package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class hatar_ratman_boss extends warrior_passive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3752) && gg.OwnItemCount(c1, 3794) < 20) {
if (gg.Rand(100) < 62) {
myself.GiveItem1(c1, 3794, 1);
if (gg.OwnItemCount(c1, 3794) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}
if (gg.Rand(20) < 2) {
myself.CreateOnePrivate(1027149, "gremlin_filcher", 0, 1);
myself.Say(gg.MakeFString(33512, "", "", "", "", ""));

}

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3767) && gg.OwnItemCount(c1, 3809) < 1) {
if (gg.Rand(10) < 2) {
myself.CreateOnePrivate(1027162, "hatar_chieftain_kubel", 0, 1);

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