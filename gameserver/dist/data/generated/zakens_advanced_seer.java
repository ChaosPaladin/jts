package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class zakens_advanced_seer extends wizard_ag_ddmagic2 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(710);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
i1 = gg.GetMemoStateEx(c0, 710, 1);
if (gg.HaveMemo(c0, 710) == 1 && gg.GetMemoState(c0, 710) >= 8) {
if (i1 >= 299) {
if (gg.GetMemoState(c0, 710) == 8) {
myself.SetFlagJournal(c0, 710, 8);
myself.ShowQuestMark(c0, 710);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 710, 9);
myself.SetMemoStateEx(c0, 710, 1, i1 + 1);

}

} else {
myself.SetMemoStateEx(c0, 710, 1, i1 + 1);
myself.SoundEffect(c0, "ItemSound.quest_itemget");

}
myself.GiveItem1(target, 13013, 1);

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