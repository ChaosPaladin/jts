package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class thermal_atrox extends warrior_ag_casting_ddmagic_enchant_physical_poison {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 624) == 1 && gg.GetMemoState(target, 624) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 624) == 1 && gg.GetMemoState(target, 624) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 624) == 1 && gg.GetMemoState(target, 624) == 1 * 10 + 1) {
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
myself.SetCurrentQuestID(624);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 1000) {
if (gg.OwnItemCount(target, 7204) + 1 >= 50) {
if (gg.OwnItemCount(target, 7204) < 50) {
myself.GiveItem1(target, 7204, 50 - gg.OwnItemCount(target, 7204));
myself.SoundEffect(target, "ItemSound.quest_middle");

}
if (gg.OwnItemCount(target, 7203) >= 50 && gg.OwnItemCount(target, 7202) >= 50) {
myself.SetFlagJournal(target, 624, 2);
myself.ShowQuestMark(target, 624);
myself.SetMemoState(target, 624, 1 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7204, 1);
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