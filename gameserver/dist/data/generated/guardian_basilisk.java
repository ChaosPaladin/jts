package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_basilisk extends warrior_passive_casting_enchant_self {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3695) && gg.OwnItemCount(target, 3709) < 40) {
random1_list.SetInfo(3, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 335) && gg.OwnItemCount(target, 3732) && gg.OwnItemCount(target, 3774) < 100) {
random1_list.SetInfo(4, target);

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
case 0: {
myself.SetCurrentQuestID(217);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 217) && gg.GetMemoState(c1, 217) == 6 && gg.OwnItemCount(c1, 2749) < 10 && gg.OwnItemCount(c1, 2755) && gg.OwnItemCount(c1, 2752) == 0) {
if (gg.OwnItemCount(c1, 2749) >= 4) {
myself.GiveItem1(c1, 2752, 1);
myself.DeleteItem1(c1, 2749, gg.OwnItemCount(c1, 2749));
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 2754) >= 1 && gg.OwnItemCount(c1, 2753) >= 1) {
myself.SetFlagJournal(c1, 217, 7);
myself.ShowQuestMark(c1, 217);

}

} else {
myself.GiveItem1(c1, 2749, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(220);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 220) && gg.OwnItemCount(c1, 3204) && gg.OwnItemCount(c1, 3207) < 10) {
if (gg.Rand(20) < 20) {
if (gg.OwnItemCount(c1, 3207) == 9) {
myself.GiveItem1(c1, 3207, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
if (gg.OwnItemCount(c1, 3205) >= 10 && gg.OwnItemCount(c1, 3206) >= 10) {
myself.SetFlagJournal(c1, 220, 2);
myself.ShowQuestMark(c1, 220);

}

} else {
myself.GiveItem1(c1, 3207, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

}

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
if (gg.HaveMemo(c1, 218) && gg.OwnItemCount(c1, 3144) == 1 && gg.OwnItemCount(c1, 3149) == 1 && gg.OwnItemCount(c1, 3161) < 10) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3161, 2);
if (gg.OwnItemCount(c1, 3161) >= 8) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 3163) >= 20 && gg.OwnItemCount(c1, 3162) >= 20) {
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

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 3: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 90) {
myself.GiveItem1(target, 3709, 1);
if (gg.OwnItemCount(target, 3709) >= 40) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(335);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 3774, 2);
if (gg.OwnItemCount(target, 3774) >= 100) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

} else {
myself.GiveItem1(target, 3774, 1);
if (gg.OwnItemCount(target, 3774) >= 100) {
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 5: {
myself.SetCurrentQuestID(138);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 46) {
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
if (gg.Rand(100) < 30) {
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