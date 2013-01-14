package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ol_mahum_general extends warrior_aggressive_run_away_to_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 326)) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 171) && gg.GetMemoState(target, 171) == 6) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(326);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 60) {
myself.GiveItem1(target, 1361, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(171);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) <= 9) {
if (gg.OwnItemCount(target, 4245) == 0) {
myself.GiveItem1(target, 4245, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}
if (gg.OwnItemCount(target, 4246) == 0) {
myself.GiveItem1(target, 4246, 1);
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