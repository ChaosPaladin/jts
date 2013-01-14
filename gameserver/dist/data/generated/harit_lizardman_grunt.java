package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harit_lizardman_grunt extends warrior_passive_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target, HandlerParam weapon_class_id) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3751) && gg.OwnItemCount(target, 3793) < 40) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && myself.sm.last_blow_weapon_class_id == 3471 && gg.OwnItemCount(target, 3692) || gg.OwnItemCount(target, 3693)) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 350) == 1) {
random1_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(3, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 98) {
myself.GiveItem1(target, 3793, 1);
if (gg.OwnItemCount(target, 3793) >= 40) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
if (gg.OwnItemCount(target, 3697)) {
if (gg.OwnItemCount(target, 3698)) {
myself.GiveItem1(target, 3699, 1);
myself.DeleteItem1(target, 3698, gg.OwnItemCount(target, 3698));

} else if (gg.OwnItemCount(target, 3699)) {
myself.GiveItem1(target, 3700, 1);
myself.DeleteItem1(target, 3699, gg.OwnItemCount(target, 3699));

} else if (gg.OwnItemCount(target, 3700)) {
myself.GiveItem1(target, 3701, 1);
myself.DeleteItem1(target, 3700, gg.OwnItemCount(target, 3700));

} else if (gg.OwnItemCount(target, 3701)) {
myself.GiveItem1(target, 3702, 1);
myself.DeleteItem1(target, 3701, gg.OwnItemCount(target, 3701));

} else if (gg.OwnItemCount(target, 3702)) {
myself.GiveItem1(target, 3703, 1);
myself.DeleteItem1(target, 3702, gg.OwnItemCount(target, 3702));

} else if (gg.OwnItemCount(target, 3703)) {
myself.GiveItem1(target, 3704, 1);
myself.SoundEffect(target, "ItemSound.quest_jackpot");
myself.DeleteItem1(target, 3703, gg.OwnItemCount(target, 3703));

} else if (gg.OwnItemCount(target, 3704)) {
myself.GiveItem1(target, 3705, 1);
myself.SoundEffect(target, "ItemSound.quest_jackpot");
myself.DeleteItem1(target, 3704, gg.OwnItemCount(target, 3704));

} else if (gg.OwnItemCount(target, 3705)) {
myself.GiveItem1(target, 3706, 1);
myself.SoundEffect(target, "ItemSound.quest_jackpot");
myself.DeleteItem1(target, 3705, gg.OwnItemCount(target, 3705));

} else if (gg.OwnItemCount(target, 3706)) {
myself.GiveItem1(target, 3707, 1);
myself.SoundEffect(target, "ItemSound.quest_jackpot");
myself.DeleteItem1(target, 3706, gg.OwnItemCount(target, 3706));

}

}

} else if (gg.OwnItemCount(target, 3697) && gg.OwnItemCount(target, 3698) >= 1 || gg.OwnItemCount(target, 3699) >= 1 || gg.OwnItemCount(target, 3700) >= 1 || gg.OwnItemCount(target, 3701) >= 1 || gg.OwnItemCount(target, 3702) >= 1 || gg.OwnItemCount(target, 3703) >= 1 || gg.OwnItemCount(target, 3704) >= 1 || gg.OwnItemCount(target, 3705) >= 1 || gg.OwnItemCount(target, 3706) >= 1) {
myself.DeleteItem1(target, 3698, gg.OwnItemCount(target, 3698));
myself.DeleteItem1(target, 3699, gg.OwnItemCount(target, 3699));
myself.DeleteItem1(target, 3700, gg.OwnItemCount(target, 3700));
myself.DeleteItem1(target, 3701, gg.OwnItemCount(target, 3701));
myself.DeleteItem1(target, 3702, gg.OwnItemCount(target, 3702));
myself.DeleteItem1(target, 3703, gg.OwnItemCount(target, 3703));
myself.DeleteItem1(target, 3704, gg.OwnItemCount(target, 3704));
myself.DeleteItem1(target, 3705, gg.OwnItemCount(target, 3705));
myself.DeleteItem1(target, 3706, gg.OwnItemCount(target, 3706));
myself.GiveItem1(target, 3708, 1);

}

}
break;

}
case 2: {
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
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 68) {
myself.GiveItem1(target, 7586, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

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