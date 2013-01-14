package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class velociraptor_leader2 extends roamer_primeval {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 641) == 1) {
always_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 641) == 1) {
always_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 641) == 1) {
always_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 111) == 1 && gg.GetMemoState(target, 111) == 4) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 111) == 1 && gg.GetMemoState(target, 111) == 4) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 111) == 1 && gg.GetMemoState(target, 111) == 4) {
random1_list.SetInfo(1, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 642) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.HaveMemo(target, 642) == 1) {
random1_list.SetInfo(2, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 642) == 1) {
random1_list.SetInfo(2, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(641);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000 && gg.OwnItemCount(target, 8782) <= 29) {
if (gg.OwnItemCount(target, 8782) < 29) {
myself.GiveItem1(target, 8782, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 8782) == 29) {
myself.GiveItem1(target, 8782, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 641, 2);
myself.ShowQuestMark(target, 641);

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
myself.SetCurrentQuestID(111);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 260 && gg.OwnItemCount(target, 8768) <= 49) {
if (gg.OwnItemCount(target, 8768) < 49) {
myself.GiveItem1(target, 8768, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (gg.OwnItemCount(target, 8768) >= 49) {
myself.GiveItem1(target, 8768, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 111, 5);
myself.ShowQuestMark(target, 111);

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(642);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 309) {
myself.GiveItem1(target, 8774, 1);
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