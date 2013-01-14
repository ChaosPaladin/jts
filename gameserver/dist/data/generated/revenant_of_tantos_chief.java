package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class revenant_of_tantos_chief extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
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
myself.GiveItem1(c1, 3236, 1);
myself.SetFlagJournal(c1, 220, 10);
myself.ShowQuestMark(c1, 220);
myself.SoundEffect(c1, "Itemsound.quest_middle");
myself.Say(gg.MakeFString(22056, "", "", "", "", ""));

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
myself.Say(gg.MakeFString(22055, "", "", "", "", ""));
myself.i_quest0 = 1;

}
break;

}
case 1: {
if (gg.HaveMemo(myself.c_quest0, 220) && gg.OwnItemCount(myself.c_quest0, 3236) == 0 && myself.sm.hp < myself.sm.max_hp / 3.000000) {
myself.Say(gg.MakeFString(22057, "", "", "", "", ""));
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

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(220);
if (timer_id == 22005) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(220);
myself.AddTimerEx(22005, 1000 * 200);
super;
	}


}