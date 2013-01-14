package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ragna_orc_warrior_re extends ai_nest_warrior_buff {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 311) == 1 && gg.GetMemoState(target, 311) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 311) == 1 && gg.GetMemoState(target, 311) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 311) == 1 && gg.GetMemoState(target, 311) == 1) {
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
myself.SetCurrentQuestID(311);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.SetMemoStateEx(target, 311, 1, gg.GetMemoStateEx(target, 311, 1) + 1);
if (gg.GetMemoStateEx(target, 311, 1) >= 100) {
i1 = gg.Rand(20);
if (i1 < gg.GetMemoStateEx(target, 311, 1) % 100 + 1) {
myself.SetMemoStateEx(target, 311, 1, 0);
myself.GiveItem1(target, 14881, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
i0 = gg.Rand(1000);
if (i0 < 716) {
myself.GiveItem1(target, 14882, 1);
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