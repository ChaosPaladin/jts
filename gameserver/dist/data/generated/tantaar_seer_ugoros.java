package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tantaar_seer_ugoros extends ai_tantaar_ugoros {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 288) == 1 && gg.GetMemoState(target, 288) == 1 && gg.OwnItemCount(target, 15498) == 0 && myself.i_quest4 == 1) {
always_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 288) == 1 && gg.GetMemoState(target, 288) == 1 && gg.OwnItemCount(target, 15497) == 0 && myself.i_quest4 != 1) {
always_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(288);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 15498, 1);
myself.SetMemoState(target, 288, 2);
myself.SetMemoStateEx(target, 288, 1, myself.i_quest4);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.SetFlagJournal(target, 288, 2);
myself.ShowQuestMark(target, 288);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
break;

}
case 1: {
myself.SetCurrentQuestID(288);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 15497, 1);
myself.SetMemoState(target, 288, 2);
myself.SetMemoStateEx(target, 288, 1, myself.i_quest4);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.SetFlagJournal(target, 288, 3);
myself.ShowQuestMark(target, 288);
myself.SoundEffect(target, "ItemSound.quest_middle");

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