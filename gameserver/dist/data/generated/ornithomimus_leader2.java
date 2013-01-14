package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ornithomimus_leader2 extends roamer_primeval {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 125) == 1 && gg.GetMemoState(target, 125) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 125) == 1 && gg.GetMemoState(target, 125) == 3) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 125) == 1 && gg.GetMemoState(target, 125) == 3) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 111) == 1 && gg.GetMemoState(target, 111) == 11) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 111) == 1 && gg.GetMemoState(target, 111) == 11) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 111) == 1 && gg.GetMemoState(target, 111) == 11) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 643) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 643) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 643) == 1) {
random1_list.SetInfo(2, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 643) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.HaveMemo(target, 643) == 1) {
random1_list.SetInfo(3, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 643) == 1) {
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
myself.SetCurrentQuestID(125);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 327 && gg.OwnItemCount(target, 8779) <= 1) {
if (gg.OwnItemCount(target, 8779) < 1) {
myself.GiveItem1(target, 8779, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 8779) >= 1) {
myself.GiveItem1(target, 8779, 1);
if (gg.OwnItemCount(target, 8780) >= 2) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 125, 4);
myself.ShowQuestMark(target, 125);

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(111);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 330 && gg.OwnItemCount(target, 8770) <= 9) {
if (gg.OwnItemCount(target, 8770) < 9) {
myself.GiveItem1(target, 8770, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 8770) == 9) {
myself.GiveItem1(target, 8770, 1);
if (gg.OwnItemCount(target, 8772) >= 10 && gg.OwnItemCount(target, 8771) >= 10) {
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 111, 11);
myself.ShowQuestMark(target, 111);

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(643);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 116) {
myself.GiveItem1(target, 8776, 2);

} else {
myself.GiveItem1(target, 8776, 1);

}
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
break;

}
case 3: {
myself.SetCurrentQuestID(643);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 116) {
myself.GiveItem1(target, 8776, 2);

} else {
myself.GiveItem1(target, 8776, 1);

}
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
break;

}

}

}
super;
	}


}