package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class castle_prisoner_i extends raid_boss_type4 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 512) == 1) {
random1_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(512);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c2 = myself.GetLastAttacker();
if (c2.master) {
c2 = c2.master;

}
i3 = 0;
i1 = gg.Party_GetCount(c2);
if (i1 <= 0) {
myself.GiveItem1(c2, 9798, 176);
myself.SoundEffect(c2, "ItemSound.quest_middle");

} else {
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(c2, i2);
if (gg.HaveMemo(c1, 512) == 1) {
i3 = i3 + 1;

}

}
if (i3 > 0) {
i4 = 1447 / i3;

} else {
i4 = 1447;

}
for (i2 = 0; i2 < i1; i2 = i2 + 1) {
c1 = gg.Party_GetCreature(c2, i2);
if (gg.HaveMemo(c1, 512) == 1) {
myself.GiveItem1(c1, 9798, i4);
myself.SoundEffect(c1, "ItemSound.quest_middle");

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