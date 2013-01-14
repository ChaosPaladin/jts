package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class specter extends warrior_aggressive_casting_hold_magic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 333) == 1 && gg.OwnItemCount(target, 3671) >= 1) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 43) == 1 && gg.GetMemoState(target, 43) == 2 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 43) == 1 && gg.GetMemoState(target, 43) == 2 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 43) == 1 && gg.GetMemoState(target, 43) == 2 * 10 + 1) {
random1_list.SetInfo(1, target);

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
myself.SetCurrentQuestID(333);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 3848, 1);

}
if (gg.Rand(100) < 8) {
myself.GiveItem1(target, 3440, 1);

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(43);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000 && 1000 != 0) {
if (gg.OwnItemCount(target, 7550) + 1 >= 30) {
if (gg.OwnItemCount(target, 7550) < 30) {
myself.GiveItem1(target, 7550, 30 - gg.OwnItemCount(target, 7550));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 43, 3);
myself.ShowQuestMark(target, 43);

}
myself.SetMemoState(target, 43, 2 * 10 + 2);

} else {
myself.GiveItem1(target, 7550, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

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