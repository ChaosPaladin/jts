package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_rider extends ai_master_rider_raid {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(699);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(699);
i0 = gg.Rand(1000);
if (i0 < 215) {
i1 = gg.Rand(10) + 90;
myself.GiveItem1(target, 13871, i1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 < 446) {
i1 = gg.Rand(10) + 80;
myself.GiveItem1(target, 13871, i1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 < 715) {
i1 = gg.Rand(10) + 70;
myself.GiveItem1(target, 13871, i1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

} else if (i0 < 1000) {
i1 = gg.Rand(10) + 60;
myself.GiveItem1(target, 13871, i1);
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