package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guardian_angel_q065 extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(65);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(c0) == 0 && gg.IsNull(npc0) == 0) {
if (c1 == c0) {
if (gg.IsNull(c1) == 0) {
if (gg.HaveMemo(c1, 65) == 1 && myself.GetOneTimeQuestFlag(c1, 65) == 0 && gg.GetMemoState(c1, 65) == 12) {
myself.CreateOnePrivateEx(1032242, "Keit_nat_q0065", 0, 0, gg.FloatToInt(myself.sm.x) + 20, gg.FloatToInt(myself.sm.y) + 20, gg.FloatToInt(myself.sm.z), 0, gg.GetIndexFromCreature(c0), c0.dbid, npc0.sm.id);
myself.SetMemoState(c1, 65, 13);
myself.Say(gg.MakeFString(6554, "", "", "", "", ""));

}

}

} else {
if (gg.IsNull(npc0) == 0) {
if (npc0.i_quest0 == 1) {
npc0.i_quest0 = 0;

}

}
myself.Say(gg.MakeFString(6555, "", "", "", "", ""));

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

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(65);
if (timer_id == 6511) {
npc0 = gg.GetNPCFromID(myself.sm.param3);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (gg.IsNull(npc0) == 0) {
if (npc0.i_quest0 == 1) {
npc0.i_quest0 = 0;
if (gg.IsNull(c0) == 0) {
myself.Say(gg.MakeFString(6553, c0.name, "", "", "", ""));

}

}

}
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam c0, HandlerParam c1, HandlerParam i0) {
myself.SetCurrentQuestID(65);
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
myself.AddTimerEx(6511, 1000 * 70);
if (gg.IsNull(c0) == 0) {
myself.Say(gg.MakeFString(6552, c0.name, "", "", "", ""));
myself.AddAttackDesire(c0, 1, 10000);

}
super;
	}


}