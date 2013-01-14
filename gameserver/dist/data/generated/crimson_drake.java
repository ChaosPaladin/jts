package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crimson_drake extends warrior_aggressive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 386)) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 386)) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 386)) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 53) == 1 && myself.GetOneTimeQuestFlag(target, 53) == 0 && gg.GetMemoState(target, 53) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 53) == 1 && myself.GetOneTimeQuestFlag(target, 53) == 0 && gg.GetMemoState(target, 53) == 1 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 53) == 1 && myself.GetOneTimeQuestFlag(target, 53) == 0 && gg.GetMemoState(target, 53) == 1 * 10 + 1) {
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
myself.SetCurrentQuestID(386);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(1000) < 20.200001) {
myself.GiveItem1(target, 6363, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(53);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 500 && 500 != 0) {
if (gg.OwnItemCount(target, 7624) + 1 >= 100) {
if (gg.OwnItemCount(target, 7624) < 100) {
myself.GiveItem1(target, 7624, 100 - gg.OwnItemCount(target, 7624));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 53, 2);
myself.ShowQuestMark(target, 53);

}
myself.SetMemoState(target, 53, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7624, 1);
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