package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class loc extends ai_loc_raid {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 700) == 1 && gg.GetMemoState(target, 700) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 700) == 1 && gg.GetMemoState(target, 700) == 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 700) == 1 && gg.GetMemoState(target, 700) == 1) {
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
myself.SetCurrentQuestID(700);
while (gg.IsNull(target = code_info.Next()) == 0) {
if (myself.DistFromMe(target) <= 1500) {
myself.SetCurrentQuestID(700);
i0 = gg.Rand(1000);
i1 = gg.Rand(1000);
i2 = gg.Rand(1000);
if (i0 < 700) {
myself.GiveItem1(target, 13872, 1);

} else if (i0 < 885) {
myself.GiveItem1(target, 13872, 2);

} else if (i0 < 949) {
myself.GiveItem1(target, 13872, 3);

} else if (i0 < 966) {
myself.GiveItem1(target, 13872, gg.Rand(5) + 4);

} else if (i0 < 985) {
myself.GiveItem1(target, 13872, gg.Rand(9) + 4);

} else if (i0 < 993) {
myself.GiveItem1(target, 13872, gg.Rand(7) + 13);

} else if (i0 < 997) {
myself.GiveItem1(target, 13872, gg.Rand(15) + 9);

} else if (i0 < 999) {
myself.GiveItem1(target, 13872, gg.Rand(23) + 53);

} else if (i0 < 1000) {
myself.GiveItem1(target, 13872, gg.Rand(49) + 76);

}
if (i1 < 520) {
myself.GiveItem1(target, 13873, 1);

} else if (i1 < 771) {
myself.GiveItem1(target, 13873, 2);

} else if (i1 < 836) {
myself.GiveItem1(target, 13873, 3);

} else if (i1 < 985) {
myself.GiveItem1(target, 13873, gg.Rand(2) + 4);

} else if (i1 < 995) {
myself.GiveItem1(target, 13873, gg.Rand(4) + 5);

} else if (i1 < 1000) {
myself.GiveItem1(target, 13873, gg.Rand(8) + 6);

}
if (i2 < 185) {
myself.GiveItem1(target, 13874, gg.Rand(2) + 1);

} else if (i2 < 370) {
myself.GiveItem1(target, 13874, gg.Rand(6) + 2);

} else if (i2 < 570) {
myself.GiveItem1(target, 13874, gg.Rand(6) + 7);

} else if (i2 < 850) {
myself.GiveItem1(target, 13874, gg.Rand(6) + 12);

} else if (i2 < 1000) {
myself.GiveItem1(target, 13874, gg.Rand(6) + 17);

}
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