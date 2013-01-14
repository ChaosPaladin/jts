package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class brilliant_fang extends wizard_pa_saint_ddmagic2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 21 && gg.OwnItemCount(target, 9743) < 62) {
always_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 21 && gg.OwnItemCount(target, 9743) < 62) {
always_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 21 && gg.OwnItemCount(target, 9743) < 62) {
always_list.SetInfo(0, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(236);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 70) {
myself.GiveItem1(target, 9743, 1);
if (gg.OwnItemCount(target, 9743) >= 61) {
myself.SetFlagJournal(target, 236, 13);
myself.ShowQuestMark(target, 236);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetMemoState(target, 236, 22);

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
code_info.code;

}
super;
	}


}