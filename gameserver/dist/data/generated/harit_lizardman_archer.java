package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harit_lizardman_archer extends warrior_aggressive_casting_enchant_self {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target, HandlerParam weapon_class_id) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 350) == 1) {
random1_list.SetInfo(1, target);

}
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
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3751) && gg.OwnItemCount(c1, 3793) < 40) {
if (gg.Rand(100) < 98) {
myself.GiveItem1(c1, 3793, 1);
if (gg.OwnItemCount(c1, 3793) >= 40) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
if (gg.HaveMemo(c1, 335) && myself.sm.last_blow_weapon_class_id == 3471 && gg.OwnItemCount(c1, 3692) || gg.OwnItemCount(c1, 3693)) {
if (gg.Rand(100) < 60) {
if (gg.OwnItemCount(c1, 3697)) {
if (gg.OwnItemCount(c1, 3698)) {
myself.GiveItem1(c1, 3699, 1);
myself.DeleteItem1(c1, 3698, gg.OwnItemCount(c1, 3698));

} else if (gg.OwnItemCount(c1, 3699)) {
myself.GiveItem1(c1, 3700, 1);
myself.DeleteItem1(c1, 3699, gg.OwnItemCount(c1, 3699));

} else if (gg.OwnItemCount(c1, 3700)) {
myself.GiveItem1(c1, 3701, 1);
myself.DeleteItem1(c1, 3700, gg.OwnItemCount(c1, 3700));

} else if (gg.OwnItemCount(c1, 3701)) {
myself.GiveItem1(c1, 3702, 1);
myself.DeleteItem1(c1, 3701, gg.OwnItemCount(c1, 3701));

} else if (gg.OwnItemCount(c1, 3702)) {
myself.GiveItem1(c1, 3703, 1);
myself.DeleteItem1(c1, 3702, gg.OwnItemCount(c1, 3702));

} else if (gg.OwnItemCount(c1, 3703)) {
myself.GiveItem1(c1, 3704, 1);
myself.SoundEffect(c1, "ItemSound.quest_jackpot");
myself.DeleteItem1(c1, 3703, gg.OwnItemCount(c1, 3703));

} else if (gg.OwnItemCount(c1, 3704)) {
myself.GiveItem1(c1, 3705, 1);
myself.SoundEffect(c1, "ItemSound.quest_jackpot");
myself.DeleteItem1(c1, 3704, gg.OwnItemCount(c1, 3704));

} else if (gg.OwnItemCount(c1, 3705)) {
myself.GiveItem1(c1, 3706, 1);
myself.SoundEffect(c1, "ItemSound.quest_jackpot");
myself.DeleteItem1(c1, 3705, gg.OwnItemCount(c1, 3705));

} else if (gg.OwnItemCount(c1, 3706)) {
myself.GiveItem1(c1, 3707, 1);
myself.SoundEffect(c1, "ItemSound.quest_jackpot");
myself.DeleteItem1(c1, 3706, gg.OwnItemCount(c1, 3706));

}

}

} else if (gg.OwnItemCount(c1, 3697) && gg.OwnItemCount(c1, 3698) >= 1 || gg.OwnItemCount(c1, 3699) >= 1 || gg.OwnItemCount(c1, 3700) >= 1 || gg.OwnItemCount(c1, 3701) >= 1 || gg.OwnItemCount(c1, 3702) >= 1 || gg.OwnItemCount(c1, 3703) >= 1 || gg.OwnItemCount(c1, 3704) >= 1 || gg.OwnItemCount(c1, 3705) >= 1 || gg.OwnItemCount(c1, 3706) >= 1) {
myself.DeleteItem1(c1, 3698, gg.OwnItemCount(c1, 3698));
myself.DeleteItem1(c1, 3699, gg.OwnItemCount(c1, 3699));
myself.DeleteItem1(c1, 3700, gg.OwnItemCount(c1, 3700));
myself.DeleteItem1(c1, 3701, gg.OwnItemCount(c1, 3701));
myself.DeleteItem1(c1, 3702, gg.OwnItemCount(c1, 3702));
myself.DeleteItem1(c1, 3703, gg.OwnItemCount(c1, 3703));
myself.DeleteItem1(c1, 3704, gg.OwnItemCount(c1, 3704));
myself.DeleteItem1(c1, 3705, gg.OwnItemCount(c1, 3705));
myself.DeleteItem1(c1, 3706, gg.OwnItemCount(c1, 3706));
myself.GiveItem1(c1, 3708, 1);

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
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(350);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target == myself.c_quest0 && myself.i_quest0 == 2) {
if (gg.OwnItemCount(target, 4651) + gg.OwnItemCount(target, 4652) + gg.OwnItemCount(target, 4653) + gg.OwnItemCount(target, 4654) + gg.OwnItemCount(target, 4655) + gg.OwnItemCount(target, 4656) + gg.OwnItemCount(target, 4657) + gg.OwnItemCount(target, 4658) + gg.OwnItemCount(target, 4659) + gg.OwnItemCount(target, 4660) + gg.OwnItemCount(target, 4661) + gg.OwnItemCount(target, 5579) + gg.OwnItemCount(target, 5582) + gg.OwnItemCount(target, 5914) + gg.OwnItemCount(target, 4629) + gg.OwnItemCount(target, 4630) + gg.OwnItemCount(target, 4631) + gg.OwnItemCount(target, 4632) + gg.OwnItemCount(target, 4633) + gg.OwnItemCount(target, 4634) + gg.OwnItemCount(target, 4635) + gg.OwnItemCount(target, 4636) + gg.OwnItemCount(target, 4637) + gg.OwnItemCount(target, 4638) + gg.OwnItemCount(target, 4639) + gg.OwnItemCount(target, 5577) + gg.OwnItemCount(target, 5580) + gg.OwnItemCount(target, 5908) + gg.OwnItemCount(target, 4640) + gg.OwnItemCount(target, 4641) + gg.OwnItemCount(target, 4642) + gg.OwnItemCount(target, 4643) + gg.OwnItemCount(target, 4644) + gg.OwnItemCount(target, 4645) + gg.OwnItemCount(target, 4646) + gg.OwnItemCount(target, 4647) + gg.OwnItemCount(target, 4648) + gg.OwnItemCount(target, 4649) + gg.OwnItemCount(target, 4650) + gg.OwnItemCount(target, 5578) + gg.OwnItemCount(target, 5581) + gg.OwnItemCount(target, 5911) + gg.OwnItemCount(target, 9571) + gg.OwnItemCount(target, 10161) + gg.OwnItemCount(target, 9570) + gg.OwnItemCount(target, 10160) + gg.OwnItemCount(target, 9572) + gg.OwnItemCount(target, 10162) + gg.OwnItemCount(target, 10482) + gg.OwnItemCount(target, 10481) + gg.OwnItemCount(target, 10480) + gg.OwnItemCount(target, 13072) + gg.OwnItemCount(target, 13073) + gg.OwnItemCount(target, 13071) + gg.OwnItemCount(target, 15542) + gg.OwnItemCount(target, 15543) + gg.OwnItemCount(target, 15541) == 1) {
i0 = gg.Rand(100);
if (i0 <= 9) {
if (gg.OwnItemCount(target, 4651) == 1) {
myself.DeleteItem1(target, 4651, 1);
myself.GiveItem1(target, 4652, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4652) == 1) {
myself.DeleteItem1(target, 4652, 1);
myself.GiveItem1(target, 4653, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4653) == 1) {
myself.DeleteItem1(target, 4653, 1);
myself.GiveItem1(target, 4654, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4654) == 1) {
myself.DeleteItem1(target, 4654, 1);
myself.GiveItem1(target, 4655, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4655) == 1) {
myself.DeleteItem1(target, 4655, 1);
myself.GiveItem1(target, 4656, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4629) == 1) {
myself.DeleteItem1(target, 4629, 1);
myself.GiveItem1(target, 4630, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4630) == 1) {
myself.DeleteItem1(target, 4630, 1);
myself.GiveItem1(target, 4631, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4631) == 1) {
myself.DeleteItem1(target, 4631, 1);
myself.GiveItem1(target, 4632, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4632) == 1) {
myself.DeleteItem1(target, 4632, 1);
myself.GiveItem1(target, 4633, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4633) == 1) {
myself.DeleteItem1(target, 4633, 1);
myself.GiveItem1(target, 4634, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4640) == 1) {
myself.DeleteItem1(target, 4640, 1);
myself.GiveItem1(target, 4641, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4641) == 1) {
myself.DeleteItem1(target, 4641, 1);
myself.GiveItem1(target, 4642, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4642) == 1) {
myself.DeleteItem1(target, 4642, 1);
myself.GiveItem1(target, 4643, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4643) == 1) {
myself.DeleteItem1(target, 4643, 1);
myself.GiveItem1(target, 4644, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4644) == 1) {
myself.DeleteItem1(target, 4644, 1);
myself.GiveItem1(target, 4645, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else {
myself.ShowSystemMessage(target, 978);

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else {
myself.ShowSystemMessage(target, 977);

}

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
myself.SetCurrentQuestID(350);
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
if (skill_name_id / 65536 == 137363457 / 65536 && myself.sm.hp <= myself.sm.max_hp * 0.500000) {
myself.i_quest0 = 2;
myself.c_quest0 = attacker;

}
break;

}
case 1: {
if (skill_name_id / 65536 == 137363457 / 65536 && myself.sm.hp <= myself.sm.max_hp * 0.500000) {
myself.i_quest0 = 2;
myself.c_quest0 = attacker;

}
break;

}
case 2: {
break;

}

}
super;
	}


}