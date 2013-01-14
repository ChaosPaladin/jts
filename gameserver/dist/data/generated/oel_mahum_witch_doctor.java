package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class oel_mahum_witch_doctor extends wizard_pa_ddmagic2_heal {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 336) && gg.GetMemoState(target, 336) == 3) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
random1_list.SetInfo(1, target);
random1_list.SetInfo(1, target);
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
random1_list.SetInfo(1, target);

}

}
target = last_attacker;
always_list.SetInfo(2, target);
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
switch (code_info.code) {
case 2: {
myself.SetCurrentQuestID(712);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 712) == 1 && gg.GetMemoState(c0, 712) == 7 && myself.DistFromMe(c0) <= 1500) {
if (gg.OwnItemCount(c0, 13851) >= 299) {
myself.GiveItem1(c0, 13851, 1);
myself.SetMemoState(c0, 712, 8);
myself.SetFlagJournal(c0, 712, 7);
myself.ShowQuestMark(c0, 712);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c0, 13851, 1);
myself.SoundEffect(c0, "ItemSound.quest_itemget");

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
myself.SetCurrentQuestID(336);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 200) {
myself.GiveItem1(target, 3490, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(501);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c2 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c2) == 0) {
if (gg.HaveMemo(c2, 501) && gg.GetMemoState(c2, 501) >= 3 && gg.GetMemoState(c2, 501) < 6) {
if (gg.Rand(10) == 1) {
myself.GiveItem1(target, 3834, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 42) {
myself.GiveItem1(target, 7586, 2);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else {
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