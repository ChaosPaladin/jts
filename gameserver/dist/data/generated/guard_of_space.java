package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_of_space extends warrior_basic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 279) == 1 && gg.GetMemoState(target, 279) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 279) == 1 && gg.GetMemoState(target, 279) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 279) == 1 && gg.GetMemoState(target, 279) == 1) {
random1_list.SetInfo(0, target);

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
myself.SetCurrentQuestID(279);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(279);
i0 = gg.Rand(1000);
if (i0 < 311) {
if (gg.OwnItemCount(target, 15517) < 1) {
if (gg.OwnItemCount(target, 15518) >= 1 && gg.OwnItemCount(target, 15519) >= 1 && gg.OwnItemCount(target, 15520) >= 1) {
myself.GiveItem1(target, 15517, 1);
myself.SetFlagJournal(target, 279, 2);
myself.ShowQuestMark(target, 279);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 15517, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}

}

}
break;

}

}

}
super;
	}


}