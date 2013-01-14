package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class q_bloody_senior extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(709);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c0 = myself.Pledge_GetLeader(target);
if (myself.IsNullCreature(c0) == 0) {
if (myself.DistFromMe(c0) <= 1500 && gg.HaveMemo(c0, 709) == 1 && gg.GetMemoState(c0, 709) / 10 == 2) {
myself.GiveItem1(c0, 13850, 1);
i0 = gg.GetMemoState(c0, 709);
myself.SetMemoState(c0, 709, i0 + 10);
myself.SetFlagJournal(c0, 709, 7);
myself.ShowQuestMark(c0, 709);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.Say(gg.MakeFString(70956, "", "", "", "", ""));

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

	protected void TIMER_FIRED_EX(HandlerParam i0, HandlerParam talker, HandlerParam timer_id) {
myself.SetCurrentQuestID(709);
if (timer_id == 70902) {
myself.Say(gg.MakeFString(70957, "", "", "", "", ""));

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam c1, HandlerParam i0) {
myself.SetCurrentQuestID(709);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (myself.IsNullCreature(c0) == 0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(70955, c0.name, "", "", "", ""));

}

}
myself.AddTimerEx(70902, 1000 * 120);
super;
	}


}