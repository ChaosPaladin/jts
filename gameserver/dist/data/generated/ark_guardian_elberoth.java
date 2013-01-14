package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ark_guardian_elberoth extends warrior_passive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i0, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(348);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 348) && gg.GetMemoStateEx(c1, 348, 0) < 8 && gg.GetMemoStateEx(c1, 348, 1) % 1000 / 100 == 1 && gg.OwnItemCount(c1, 4292) == 0 && gg.OwnItemCount(c1, 4397) == 0) {
i0 = gg.GetMemoStateEx(c1, 348, 1);
i0 = i0 + 100;
myself.SetMemoStateEx(c1, 348, 1, i0);
if (i0 % 10 != 0) {
myself.SetFlagJournal(c1, 348, 11);
myself.ShowQuestMark(c1, 348);

}
myself.GiveItem1(c1, 4292, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");
myself.Say(gg.MakeFString(34832, "", "", "", "", ""));

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
myself.SetCurrentQuestID(348);
switch (myself.i_quest0) {
case 0: {
myself.Say(gg.MakeFString(34833, "", "", "", "", ""));
myself.i_quest0 = 1;
break;

}
case 1: {
break;

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam timer_id) {
myself.SetCurrentQuestID(348);
if (timer_id == 34802) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(348);
myself.AddTimerEx(34804, 1000 * 600);
myself.Say(gg.MakeFString(34837, "", "", "", "", ""));
super;
	}


}