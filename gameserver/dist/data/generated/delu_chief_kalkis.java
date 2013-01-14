package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class delu_chief_kalkis extends party_leader {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(225);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 225) == 1 && gg.OwnItemCount(c1, 2788) == 1 && gg.OwnItemCount(c1, 2789) == 0 && gg.OwnItemCount(c1, 2791) == 0) {
myself.GiveItem1(c1, 2789, 1);
myself.GiveItem1(c1, 2791, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 225, 6);
myself.ShowQuestMark(c1, 225);

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