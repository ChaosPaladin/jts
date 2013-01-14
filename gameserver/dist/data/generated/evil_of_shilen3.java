package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class evil_of_shilen3 extends ai_evil_of_shilen1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 193) == 1 && gg.GetMemoState(target, 193) == 4) {
always_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(193);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.GetIndexFromCreature(target) == myself.sm.param3) {
myself.GiveItem1(target, 14353, 1);
myself.SoundEffect(target, "ItemSound.quest_finish");
myself.SetMemoState(target, 193, 5);
myself.SetFlagJournal(target, 193, 5);
myself.ShowQuestMark(target, 193);

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