package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class croc_of_swamp extends party_private_physicalspecial {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(711);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 711) == 1 && gg.GetMemoState(c0, 711) / 1000 >= 1 && gg.GetMemoState(c0, 711) / 1000 < 101 && myself.DistFromMe(c0) <= 1500) {
i0 = gg.GetMemoState(c0, 711);
if (gg.GetMemoState(c0, 711) / 1000 < 100) {
myself.SetMemoState(c0, 711, i0 + 1000);

} else {
myself.SetMemoState(c0, 711, i0 + 1000);
myself.SetFlagJournal(c0, 711, 6);
myself.ShowQuestMark(c0, 711);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

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