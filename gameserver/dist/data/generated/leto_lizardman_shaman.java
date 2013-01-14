package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class leto_lizardman_shaman extends wizard_pa_ddmagic2_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target, HandlerParam weapon_class_id) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
target = last_attacker;
always_list.SetInfo(4, target);
target = last_attacker;
always_list.SetInfo(5, target);
target = last_attacker;
always_list.SetInfo(6, target);
target = last_attacker;
always_list.SetInfo(7, target);
target = last_attacker;
if (gg.HaveMemo(target, 186) == 1 && gg.GetMemoState(target, 186) == 2 && myself.GetOneTimeQuestFlag(target, 186) == 0) {
random1_list.SetInfo(8, target);

}
if (gg.HaveMemo(target, 186) == 1 && gg.GetMemoState(target, 186) == 2 && myself.GetOneTimeQuestFlag(target, 186) == 0) {
random1_list.SetInfo(8, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 186) == 1 && gg.GetMemoState(target, 186) == 2 && myself.GetOneTimeQuestFlag(target, 186) == 0) {
random1_list.SetInfo(8, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(212);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 212) && gg.GetMemoState(c1, 212) == 9 && gg.OwnItemCount(c1, 2641) < 20) {
if (gg.OwnItemCount(c1, 2641) == 19) {
myself.GiveItem1(c1, 2641, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 212, 12);
myself.ShowQuestMark(c1, 212);

} else {
myself.GiveItem1(c1, 2641, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(224);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 224) && gg.GetMemoState(c1, 224) == 13 && gg.OwnItemCount(c1, 3306) < 140) {
if (gg.OwnItemCount(c1, 3306) - 10 * 5 > gg.Rand(100)) {
myself.CreateOnePrivateEx(1027090, "serpent_demon_kadesh", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.DeleteItem1(c1, 3306, gg.OwnItemCount(c1, 3306));
myself.SoundEffect(c1, "Itemsound.quest_before_battle");

} else {
myself.GiveItem1(c1, 3306, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(223);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 223) && gg.OwnItemCount(c1, 3285) && gg.OwnItemCount(c1, 3292) < 10) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(c1, 3292) >= 9) {
myself.GiveItem1(c1, 3292, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 223, 13);
myself.ShowQuestMark(c1, 223);

} else {
myself.GiveItem1(c1, 3292, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3347) && gg.OwnItemCount(c1, 3337) < 30) {
if (gg.OwnItemCount(c1, 3337) >= 28) {
myself.GiveItem1(c1, 3337, 2);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3337, 2);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(218);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 218) && gg.OwnItemCount(c1, 3156) == 1 && gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(c1, 3166) == 0) {
myself.GiveItem1(c1, 3166, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 3167) == 0) {
myself.GiveItem1(c1, 3167, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 3168) == 0) {
myself.GiveItem1(c1, 3168, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 3169) == 0) {
myself.GiveItem1(c1, 3169, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 3170) == 0) {
myself.GiveItem1(c1, 3170, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 3171) == 0) {
myself.GiveItem1(c1, 3171, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(229);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 229) == 1 && gg.OwnItemCount(c1, 3309) == 1 && gg.OwnItemCount(c1, 3310) == 1) {
if (gg.Rand(100) <= 100 && gg.OwnItemCount(c1, 3312) < 20) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3312, 1);
if (gg.OwnItemCount(c1, 3312) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(233);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 233) && gg.OwnItemCount(c1, 2888) == 1) {
i0 = gg.Rand(100);
if (i0 > 0) {
if (gg.OwnItemCount(c1, 2889) == 0) {
myself.GiveItem1(c1, 2889, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2890) == 0) {
myself.GiveItem1(c1, 2890, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2891) == 0) {
myself.GiveItem1(c1, 2891, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2892) == 0) {
myself.GiveItem1(c1, 2892, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 2893) == 0) {
myself.GiveItem1(c1, 2893, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}
break;

}
case 7: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3695) && gg.OwnItemCount(c1, 3710) < 20) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(c1, 3710, 1);
if (gg.OwnItemCount(c1, 3710) >= 20) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
if (gg.HaveMemo(c1, 335) && gg.OwnItemCount(c1, 3742) && gg.OwnItemCount(c1, 3784) < 1) {
if (gg.Rand(10) < 2) {
myself.CreateOnePrivate(1027156, "leto_shaman_ketz", 0, 1);

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
case 8: {
myself.SetCurrentQuestID(186);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 50 && gg.OwnItemCount(target, 10367) < 1) {
myself.GiveItem1(target, 10367, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}

}

}
super;
	}


}