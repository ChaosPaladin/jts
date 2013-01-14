package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gremlin_filcher extends warrior_aggressive_immediate {
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
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3754) && gg.OwnItemCount(c1, 3796) < 40) {
myself.GiveItem1(c1, 3796, 5);
if (gg.OwnItemCount(c1, 3796) >= 40) {
myself.SoundEffect(c1, "ItemSound.quest_midddle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(33513, "", "", "", "", ""));

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3755) && gg.OwnItemCount(c1, 3797) < 40) {
myself.GiveItem1(c1, 3797, 5);
if (gg.OwnItemCount(c1, 3797) >= 40) {
myself.SoundEffect(c1, "ItemSound.quest_midddle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(33513, "", "", "", "", ""));

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3757) && gg.OwnItemCount(c1, 3799) < 40) {
myself.GiveItem1(c1, 3799, 5);
if (gg.OwnItemCount(c1, 3799) >= 40) {
myself.SoundEffect(c1, "ItemSound.quest_midddle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(33513, "", "", "", "", ""));

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3762) && gg.OwnItemCount(c1, 3804) < 40) {
myself.GiveItem1(c1, 3804, 5);
if (gg.OwnItemCount(c1, 3804) >= 40) {
myself.SoundEffect(c1, "ItemSound.quest_midddle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(33513, "", "", "", "", ""));

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3752) && gg.OwnItemCount(c1, 3794) < 20) {
myself.GiveItem1(c1, 3794, 3);
if (gg.OwnItemCount(c1, 3794) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_midddle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}
myself.Say(gg.MakeFString(33513, "", "", "", "", ""));

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