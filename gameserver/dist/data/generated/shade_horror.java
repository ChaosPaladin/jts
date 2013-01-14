package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shade_horror extends warrior_passive_casting_curse {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 162) == 1 && gg.OwnItemCount(target, 1159) < 3) {
random1_list.SetInfo(0, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(162);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 25 && gg.OwnItemCount(target, 1159) < 3) {
myself.GiveItem1(target, 1159, 1);
if (gg.OwnItemCount(target, 1159) >= 2) {
myself.SoundEffect(target, "ItemSound.quest_middle");
if (gg.OwnItemCount(target, 1158) >= 10) {
myself.SetFlagJournal(target, 162, 2);
myself.ShowQuestMark(target, 162);

}

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

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