package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ragna_orc_seer extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(220);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 220) && gg.OwnItemCount(c1, 3235) && gg.OwnItemCount(c1, 3236) == 0) {
myself.CreateOnePrivateEx(1027086, "revenant_of_tantos_chief", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
myself.Say(gg.MakeFString(22054, "", "", "", "", ""));

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(232);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 232) == 1 && gg.OwnItemCount(c1, 3413) == 1) {
if (gg.OwnItemCount(c1, 3415) == 0) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3415, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 3414) == 0) {
c1.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(c1, 3414, 1);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetFlagJournal(c1, 232, 5);
myself.ShowQuestMark(c1, 232);

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(220);
switch (myself.i_quest0) {
case 0: {
myself.c_quest0 = attacker;
if (gg.HaveMemo(myself.c_quest0, 220) && gg.OwnItemCount(myself.c_quest0, 3236) == 0) {
myself.Say(gg.MakeFString(22053, "", "", "", "", ""));
myself.i_quest0 = 1;

}
break;

}
case 1: {
myself.i_quest0 = 2;
break;

}
case 2: {
break;

}

}
super;
	}


}