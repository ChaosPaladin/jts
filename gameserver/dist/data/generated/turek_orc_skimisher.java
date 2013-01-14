package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class turek_orc_skimisher extends warrior_aggressive_run_away_to_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 171) && gg.GetMemoState(target, 171) == 2 && gg.OwnItemCount(target, 4239) < 20) {
random1_list.SetInfo(0, target);

}
target = last_attacker;
if (gg.HaveMemo(target, 327) == 1) {
random1_list.SetInfo(1, target);

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(171);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.Rand(100) < 55) {
myself.GiveItem1(target, 4239, 1);
if (gg.OwnItemCount(target, 4239) >= 19) {
myself.SoundEffect(target, "Itemsound.quest_middle");

} else {
myself.SoundEffect(target, "Itemsound.quest_itemget");

}

}
if (gg.OwnItemCount(target, 4239) == 5) {
myself.CreateOnePrivateEx(1027190, "ol_mahum_support_troop", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 1, gg.GetIndexFromCreature(target), 0, 0);

}
if (gg.OwnItemCount(target, 4239) >= 10) {
if (gg.Rand(100) <= 24) {
myself.CreateOnePrivateEx(1027190, "ol_mahum_support_troop", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 1, gg.GetIndexFromCreature(target), 0, 0);

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(327);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 1846, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
i0 = gg.Rand(100);
if (i0 < 21) {
i1 = gg.Rand(100);
if (i1 < 25) {
myself.GiveItem1(target, 1848, 1);

} else if (i1 < 50) {
myself.GiveItem1(target, 1849, 1);

} else if (i1 < 75) {
myself.GiveItem1(target, 1850, 1);

} else {
myself.GiveItem1(target, 1851, 1);

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