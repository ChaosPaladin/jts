package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shyslassys extends party_leader {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(211);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 211) && gg.GetMemoState(c1, 211) == 1 && gg.OwnItemCount(c1, 2631) == 0 && gg.OwnItemCount(c1, 2632) == 0) {
myself.GiveItem1(c1, 2631, 1);
myself.GiveItem1(c1, 2632, 1);
if (myself.Maker_GetNpcCount() < 10) {
myself.CreateOnePrivateEx(1030647, "chest_of_shyslassys", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 211, 2);
myself.SetFlagJournal(c1, 211, 2);
myself.ShowQuestMark(c1, 211);

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