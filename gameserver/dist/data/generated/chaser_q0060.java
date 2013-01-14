package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chaser_q0060 extends monster_parameter {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(60);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.HaveMemo(target, 60) == 1 && gg.GetMemoState(target, 60) == 1) {
if (target.is_pc == 1) {
if (target.dbid == myself.sm.param2) {
myself.SetFlagJournal(target, 60, 2);
myself.ShowQuestMark(target, 60);
myself.SetMemoState(target, 60, 2);
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.Say(gg.MakeFString(6053, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(6054, "", "", "", "", ""));

}

}

}
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

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

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam i0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(60);
if (timer_id == 6001) {
myself.Say(gg.MakeFString(6052, "", "", "", "", ""));
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0) {
myself.SetCurrentQuestID(60);
myself.AddTimerEx(6001, 1000 * 60);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (gg.IsNull(c0) == 0) {
if (c0.is_pc == 1) {
myself.AddAttackDesire(c0, 1, 10000);

}
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(6051, c0.name, "", "", "", ""));

}

}
super;
	}


}