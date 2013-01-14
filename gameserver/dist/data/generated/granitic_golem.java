package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class granitic_golem extends warrior_pa_slow_type1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 329)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3131) < 70) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3131) < 70) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 216) == 1 && gg.OwnItemCount(target, 3122) == 1 && gg.OwnItemCount(target, 3129) == 1 && gg.OwnItemCount(target, 3131) < 70) {
always_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 8 && gg.OwnItemCount(target, 9775) < 30) {
always_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 137) == 1 && gg.GetMemoState(target, 137) == 5 && gg.OwnItemCount(target, 10340) < 30) {
random1_list.SetInfo(3, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(4, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(4, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(4, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(216);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(216);
myself.GiveItem1(target, 3131, 7);
if (gg.OwnItemCount(target, 3131) >= 63) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(66);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (gg.OwnItemCount(target, 9775) < 30) {
if (gg.OwnItemCount(target, 9775) >= 29) {
myself.SetFlagJournal(target, 66, 8);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9775, 1);
if (i4 < 100 && gg.OwnItemCount(target, 9775) < 29) {
myself.GiveItem1(target, 9775, 1);

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
myself.SetCurrentQuestID(329);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 3) {
myself.GiveItem1(target, 1346, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 < 54) {
myself.GiveItem1(target, 1365, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(137);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 100) {
if (gg.OwnItemCount(target, 10340) >= 29) {
myself.GiveItem1(target, 10340, 1);
myself.SetFlagJournal(target, 137, 3);
myself.ShowQuestMark(target, 137);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10340, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 245) {
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