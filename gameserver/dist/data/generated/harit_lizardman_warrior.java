package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class harit_lizardman_warrior extends warrior_passive_casting_enchant_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target, HandlerParam weapon_class_id) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3751) && gg.OwnItemCount(target, 3793) < 40) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3751) && gg.OwnItemCount(target, 3793) < 40) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(2, target);

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
if (gg.Rand(100) < 100) {
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
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 66) {
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


}