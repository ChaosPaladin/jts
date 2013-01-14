package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bloody_axe_elite extends warrior_aggressive_immediate {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(223);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 223) && gg.OwnItemCount(c1, 3279) && gg.OwnItemCount(c1, 3290) < 10) {
if (gg.OwnItemCount(c1, 3290) >= 9) {
myself.GiveItem1(c1, 3290, 1);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.SetFlagJournal(c1, 223, 3);
myself.ShowQuestMark(c1, 223);

} else {
myself.GiveItem1(c1, 3290, 1);
myself.SoundEffect(c1, "Itemsound.quest_itemget");

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
myself.SetCurrentQuestID(223);
switch (myself.i_quest0) {
case 0: {
myself.c_quest0 = attacker;
if (gg.HaveMemo(myself.c_quest0, 223) && gg.OwnItemCount(myself.c_quest0, 3279) && gg.OwnItemCount(myself.c_quest0, 3290) < 100) {
if (gg.Rand(2) == 1) {
myself.CreateOnePrivate(1020780, "bloody_axe_elite", 0, 1);

}

}
myself.i_quest0 = 1;
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