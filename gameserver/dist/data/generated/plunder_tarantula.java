package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class plunder_tarantula extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i5, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
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
myself.SetCurrentQuestID(417);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (gg.HaveMemo(myself.c_quest0, 417) == 1 && gg.OwnItemCount(myself.c_quest0, 1654) == 1 && gg.OwnItemCount(myself.c_quest0, 1656) < 20 && myself.i_quest0 == 2) {
if (gg.Rand(10) < 10) {
if (gg.OwnItemCount(myself.c_quest0, 1656) == 19) {
myself.GiveItem1(myself.c_quest0, 1656, 1);
myself.SetFlagJournal(myself.c_quest0, 417, 8);
myself.ShowQuestMark(myself.c_quest0, 417);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_middle");

} else {
myself.GiveItem1(myself.c_quest0, 1656, 1);
myself.SoundEffect(myself.c_quest0, "ItemSound.quest_itemget");

}

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(296);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 296)) {
i5 = gg.Rand(100);
if (i5 > 95) {
myself.GiveItem1(c1, 1494, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

} else if (i5 > 45) {
myself.GiveItem1(c1, 1493, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}
case 2: {
myself.SetCurrentQuestID(419);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c1.quest_last_reward_time = 0;
if (gg.HaveMemo(c1, 419) == 1 && gg.OwnItemCount(c1, 3422) == 1) {
if (gg.OwnItemCount(c1, 3427) < 50 && gg.Rand(100) < 100) {
myself.GiveItem1(c1, 3427, 1);
if (gg.OwnItemCount(c1, 3427) >= 50) {
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SoundEffect(c1, "ItemSound.quest_itemget");

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
myself.SetCurrentQuestID(417);
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
myself.c_quest0 = attacker;
if (skill_name_id / 65536 == 16646145 / 65536) {
myself.i_quest0 = 2;

}
break;

}
case 1: {
if (skill_name_id / 65536 == 16646145 / 65536) {
myself.i_quest0 = 2;

}
break;

}
case 2: {
break;

}

}
super;
	}


}