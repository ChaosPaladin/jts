package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class shield_skeleton extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
target = last_attacker;
always_list.SetInfo(1, target);
target = last_attacker;
always_list.SetInfo(2, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(413);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 413) == 1 && gg.OwnItemCount(myself.c_quest0, 1267) == 1 && myself.i_quest0 == 1 && gg.OwnItemCount(myself.c_quest0, 1268) < 10) {
myself.GiveItem1(myself.c_quest0, 1268, 1);
if (gg.OwnItemCount(myself.c_quest0, 1268) >= 9) {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");
myself.SetFlagJournal(myself.c_quest0, 413, 6);
myself.ShowQuestMark(myself.c_quest0, 413);

} else {
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(325);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.OwnItemCount(c1, 1349) && gg.HaveMemo(c1, 325)) {
i0 = gg.Rand(100);
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (i0 < 6) {
myself.GiveItem1(c1, 1353, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 < 21) {
myself.GiveItem1(c1, 1354, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 < 30) {
myself.GiveItem1(c1, 1355, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 < 31) {
myself.GiveItem1(c1, 1356, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i0 < 64) {
myself.GiveItem1(c1, 1357, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(708);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 708) == 1 && gg.GetMemoState(c0, 708) / 10 == 2) {
i0 = gg.GetMemoStateEx(c0, 708, 1);
i1 = gg.Rand(100);
if (i1 < i0) {
myself.CreateOnePrivateEx(1027393, "q_duahan_of_glodio", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(target), target.dbid, myself.sm.id);

} else {
myself.SetMemoStateEx(c0, 708, 1, i0 + 1);

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.SetCurrentQuestID(413);
if (gg.HaveMemo(attacker, 413)) {
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
if (attacker.master) {
myself.c_quest0 = attacker.master;

} else {
myself.c_quest0 = attacker;

}
break;

}
case 1: {
if (attacker.master) {
if (myself.c_quest0 != attacker.master) {
myself.i_quest0 = 2;

}

} else if (myself.c_quest0 != attacker) {
myself.i_quest0 = 2;

}
break;

}
case 2: {
break;

}

}

}
super;
	}


}