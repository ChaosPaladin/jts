package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class vulture_rider_3lv extends ai_vulture_rider {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam talker, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 699) == 1 && gg.GetMemoState(target, 699) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 699) == 1 && gg.GetMemoState(target, 699) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 699) == 1 && gg.GetMemoState(target, 699) == 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 10273) == 1 && gg.GetMemoState(target, 10273) == 2) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 10273) == 1 && gg.GetMemoState(target, 10273) == 2) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 10273) == 1 && gg.GetMemoState(target, 10273) == 2) {
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
myself.SetCurrentQuestID(699);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(1000);
if (i0 < 719) {
myself.GiveItem1(target, 13871, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(10273);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.OwnItemCount(target, 13856) == 4) {
myself.GiveItem1(target, 13856, 1);
myself.SetMemoState(target, 10273, 3);
myself.SetFlagJournal(target, 10273, 2);
myself.ShowQuestMark(target, 10273);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.GiveItem1(target, 13856, 1);
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