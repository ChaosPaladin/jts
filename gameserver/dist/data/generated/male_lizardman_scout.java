package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class male_lizardman_scout extends warrior_passive_use_power_shot {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 39) == 1 && gg.GetMemoState(target, 39) == 2 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 39) == 1 && gg.GetMemoState(target, 39) == 2 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 39) == 1 && gg.GetMemoState(target, 39) == 2 * 10 + 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 39) == 1 && gg.GetMemoState(target, 39) == 3 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 39) == 1 && gg.GetMemoState(target, 39) == 3 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 39) == 1 && gg.GetMemoState(target, 39) == 3 * 10 + 1) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 44) == 1 && gg.GetMemoState(target, 44) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 44) == 1 && gg.GetMemoState(target, 44) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 44) == 1 && gg.GetMemoState(target, 44) == 2 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 118) == 1 && gg.GetMemoState(target, 118) == 1 && gg.OwnItemCount(target, 8062) < 10) {
always_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 63) == 1 && gg.GetMemoState(target, 63) == 16 && gg.OwnItemCount(target, 9771) < 1) {
random1_list.SetInfo(4, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 3: {
myself.SetCurrentQuestID(118);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(10) < 7) {
myself.GiveItem1(target, 8062, 1);
if (gg.OwnItemCount(target, 8062) >= 9) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 118, 2);
myself.ShowQuestMark(target, 118);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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
myself.SetCurrentQuestID(39);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500) {
if (gg.OwnItemCount(target, 7178) + 1 >= 100) {
if (gg.OwnItemCount(target, 7178) < 100) {
myself.GiveItem1(target, 7178, 100 - gg.OwnItemCount(target, 7178));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.OwnItemCount(target, 7179) >= 100) {
myself.SetFlagJournal(target, 39, 3);
myself.ShowQuestMark(target, 39);
myself.SetMemoState(target, 39, 2 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7178, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(39);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 250) {
if (gg.OwnItemCount(target, 7180) + 1 >= 30) {
if (gg.OwnItemCount(target, 7180) < 30) {
myself.GiveItem1(target, 7180, 30 - gg.OwnItemCount(target, 7180));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.OwnItemCount(target, 7181) >= 30) {
myself.SetFlagJournal(target, 39, 5);
myself.ShowQuestMark(target, 39);
myself.SetMemoState(target, 39, 3 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7180, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(44);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000 && 1000 != 0) {
if (gg.OwnItemCount(target, 7552) + 1 >= 30) {
if (gg.OwnItemCount(target, 7552) < 30) {
myself.GiveItem1(target, 7552, 30 - gg.OwnItemCount(target, 7552));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 44, 3);
myself.ShowQuestMark(target, 44);

}
myself.SetMemoState(target, 44, 2 * 10 + 2);

} else {
myself.GiveItem1(target, 7552, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(63);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.GetMemoStateEx(target, 63, 1);
if (i4 < 4) {
myself.SetMemoStateEx(target, 63, 1, i4 + 1);

} else {
myself.SetMemoStateEx(target, 63, 1, 0);
myself.CreateOnePrivateEx(1027337, "olmahum_takin", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}

}
break;

}

}

}
super;
	}


}