package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class turek_orc_warlord extends warrior_aggressive_run_away_to_clan {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(213);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 213) && gg.OwnItemCount(c1, 2649) == 1 && gg.OwnItemCount(c1, 2655) == 0) {
if (gg.Rand(100) < 100) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 2655, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
if (gg.OwnItemCount(c1, 2654) >= 1 && gg.OwnItemCount(c1, 2656) >= 1 && gg.OwnItemCount(c1, 2657) >= 1) {
myself.SetFlagJournal(c1, 213, 5);
myself.ShowQuestMark(c1, 213);

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(327);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 327) == 1) {
myself.GiveItem1(c1, 1847, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
i0 = gg.Rand(100);
if (i0 < 26) {
i1 = gg.Rand(100);
if (i1 < 25) {
myself.GiveItem1(c1, 1848, 1);

} else if (i1 < 50) {
myself.GiveItem1(c1, 1849, 1);

} else if (i1 < 75) {
myself.GiveItem1(c1, 1850, 1);

} else {
myself.GiveItem1(c1, 1851, 1);

}

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