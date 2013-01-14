package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pa36_keym_healas extends ai_keym_healer {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 128) == 1 && gg.GetMemoState(target, 128) == 2 && myself.GetOneTimeQuestFlag(target, 128) == 0) {
always_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(128);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 13131, 1);
myself.GiveItem1(target, 13038, 1);
myself.DeleteItem1(target, 13130, gg.OwnItemCount(target, 13130));
myself.SetMemoState(target, 128, 3);
myself.SetFlagJournal(target, 128, 3);
myself.ShowQuestMark(target, 128);
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