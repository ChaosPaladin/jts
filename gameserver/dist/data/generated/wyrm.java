package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wyrm extends warrior_aggressive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 331)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
always_list.SetInfo(3, target);
target = last_attacker;
if (gg.HaveMemo(target, 65) == 1 && gg.GetMemoState(target, 65) == 22 && gg.OwnItemCount(target, 9804) < 10) {
always_list.SetInfo(4, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(5, target);

}
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(5, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 138) == 1 && gg.GetMemoState(target, 138) == 4 && gg.OwnItemCount(target, 10342) < 10) {
random1_list.SetInfo(5, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 426) == 1) {
random1_list.SetInfo(6, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(230);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 230) && gg.OwnItemCount(c1, 3352) == 0 && gg.OwnItemCount(c1, 3351) && gg.OwnItemCount(c1, 3346) < 30) {
if (gg.OwnItemCount(c1, 3346) >= 27) {
myself.GiveItem1(c1, 3346, 3);
myself.SoundEffect(c1, "Itemsound.quest_middle");

} else {
myself.GiveItem1(c1, 3346, 3);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(218);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 218) && gg.OwnItemCount(c1, 3144) == 1 && gg.OwnItemCount(c1, 3149) == 1 && gg.OwnItemCount(c1, 3163) < 20) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3163, 4);
if (gg.OwnItemCount(c1, 3163) >= 16) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3161) >= 10 && gg.OwnItemCount(c1, 3162) >= 20) {
myself.SetFlagJournal(c1, 218, 5);
myself.ShowQuestMark(c1, 218);

}

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(228);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 228) && gg.OwnItemCount(c1, 2847) == 1 && gg.OwnItemCount(c1, 2861) == 1 && gg.OwnItemCount(c1, 2851) < 10) {
if (gg.Rand(100) < 50) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2851, 1);
if (gg.OwnItemCount(c1, 2851) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(65);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(target, 9804, 1);
if (gg.OwnItemCount(target, 9804) >= 9) {
myself.SetFlagJournal(target, 65, 16);
myself.ShowQuestMark(target, 65);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 65, 23);

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
myself.SetCurrentQuestID(331);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 60) {
myself.GiveItem1(target, 1454, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(138);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 42) {
if (gg.OwnItemCount(target, 10342) >= 9) {
myself.GiveItem1(target, 10342, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 10342, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 6: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 28) {
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