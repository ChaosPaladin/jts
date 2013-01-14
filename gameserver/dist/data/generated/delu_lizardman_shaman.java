package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class delu_lizardman_shaman extends wizard_pa_ddmagic2_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i4, HandlerParam i5, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
if (gg.HaveMemo(target, 660) && gg.GetMemoState(target, 660) == 2) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 660) && gg.GetMemoState(target, 660) == 2) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 660) && gg.GetMemoState(target, 660) == 2) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 66) == 1 && gg.GetMemoState(target, 66) == 3 && gg.OwnItemCount(target, 9773) < 30) {
always_list.SetInfo(2, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 135) == 1 && gg.GetMemoState(target, 135) == 4) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 135) == 1 && gg.GetMemoState(target, 135) == 4) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 135) == 1 && gg.GetMemoState(target, 135) == 4) {
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
case 0: {
myself.SetCurrentQuestID(225);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 225) == 1 && gg.OwnItemCount(c1, 2786) == 1 && gg.OwnItemCount(c1, 2787) < 10) {
myself.GiveItem1(c1, 2787, 1);
if (gg.OwnItemCount(c1, 2787) >= 10) {
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 225, 4);
myself.ShowQuestMark(c1, 225);

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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
if (gg.OwnItemCount(target, 9773) < 30) {
if (gg.OwnItemCount(target, 9773) >= 29) {
myself.SetFlagJournal(target, 66, 4);
myself.ShowQuestMark(target, 66);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 9773, 1);
if (i4 < 80 && gg.OwnItemCount(target, 9773) < 29) {
myself.GiveItem1(target, 9773, 1);

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
case 1: {
myself.SetCurrentQuestID(660);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 65) {
myself.GiveItem1(target, 8076, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 3: {
myself.SetCurrentQuestID(135);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 439) {
if (gg.OwnItemCount(target, 10328) < 9) {
myself.GiveItem1(target, 10328, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 10328) == 9) {
myself.GiveItem1(target, 10328, 1);
if (gg.OwnItemCount(target, 10328) == 9 && gg.OwnItemCount(target, 10329) == 10 && gg.OwnItemCount(target, 10330) == 10) {
myself.SetMemoState(target, 135, 5);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 135, 4);
myself.ShowQuestMark(target, 135);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(target, 10329) < 9) {
myself.GiveItem1(target, 10329, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 10329) == 9) {
myself.GiveItem1(target, 10329, 1);
if (gg.OwnItemCount(target, 10328) == 10 && gg.OwnItemCount(target, 10329) == 9 && gg.OwnItemCount(target, 10330) == 10) {
myself.SetMemoState(target, 135, 5);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 135, 4);
myself.ShowQuestMark(target, 135);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(target, 10330) < 9) {
myself.GiveItem1(target, 10330, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 10330) == 9) {
myself.GiveItem1(target, 10330, 1);
if (gg.OwnItemCount(target, 10328) == 10 && gg.OwnItemCount(target, 10329) == 10 && gg.OwnItemCount(target, 10330) == 9) {
myself.SetMemoState(target, 135, 5);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 135, 4);
myself.ShowQuestMark(target, 135);

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 4: {
myself.SetCurrentQuestID(426);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 27) {
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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(225);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.HaveMemo(attacker, 225) == 1 && gg.OwnItemCount(attacker, 2786) == 1) {
if (myself.i_quest0 == 0) {
myself.i_quest0 = 1;
myself.CreateOnePrivate(1027092, "neer_bodyguard", 0, 1);

}

}
super;
	}


}