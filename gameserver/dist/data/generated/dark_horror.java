package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_horror extends warrior_aggressive_casting_hold_magic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 169) == 1) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
always_list.SetInfo(1, target);
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
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c1.quest_last_reward_time = 0;
if (gg.HaveMemo(c1, 419) == 1 && gg.OwnItemCount(c1, 3420) == 1) {
if (gg.OwnItemCount(c1, 3425) < 50 && gg.Rand(100) < 75) {
myself.GiveItem1(c1, 3425, 1);
if (gg.OwnItemCount(c1, 3425) >= 50) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
case 0: {
myself.SetCurrentQuestID(169);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) > 7 && gg.OwnItemCount(target, 1031) == 0) {
myself.GiveItem1(target, 1031, 1);
myself.SetFlagJournal(target, 169, 2);
myself.ShowQuestMark(target, 169);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.Rand(10) > 4) {
myself.GiveItem1(target, 1030, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 11) {
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