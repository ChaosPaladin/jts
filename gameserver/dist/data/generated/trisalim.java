package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trisalim extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3696) && gg.OwnItemCount(target, 3718) < 20) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3749) && gg.OwnItemCount(target, 3791) < 40) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 34) == 1 && myself.GetOneTimeQuestFlag(target, 34) == 0 && gg.GetMemoState(target, 34) == 4 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 34) == 1 && myself.GetOneTimeQuestFlag(target, 34) == 0 && gg.GetMemoState(target, 34) == 4 * 10 + 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 34) == 1 && myself.GetOneTimeQuestFlag(target, 34) == 0 && gg.GetMemoState(target, 34) == 4 * 10 + 1) {
random1_list.SetInfo(2, target);

}

}

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
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 3718, 1);
if (gg.OwnItemCount(target, 3718) >= 20) {
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
if (gg.Rand(100) < 76) {
myself.GiveItem1(target, 3791, 1);
if (gg.OwnItemCount(target, 3791) >= 40) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(34);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500) {
if (gg.OwnItemCount(target, 7528) + 1 >= 10) {
if (gg.OwnItemCount(target, 7528) <= 10) {
myself.GiveItem1(target, 7528, 10 - gg.OwnItemCount(target, 7528));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 34, 5);
myself.ShowQuestMark(target, 34);
myself.SetMemoState(target, 34, 4 * 10 + 2);

} else {
myself.GiveItem1(target, 7528, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 44) {
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