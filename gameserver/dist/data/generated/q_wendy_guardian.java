package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class q_wendy_guardian extends warrior_casting_enchant_lab_clan1 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(114);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target.is_pc == 1) {
if (gg.HaveMemo(target, 114) == 1 && gg.GetMemoState(target, 114) == 6 && gg.GetMemoStateEx(target, 114, 1) == 20111) {
myself.Say(gg.MakeFString(11452, "", "", "", "", ""));
myself.SetMemoStateEx(target, 114, 1, 20211);
myself.SetFlagJournal(target, 114, 11);
myself.ShowQuestMark(target, 114);
myself.SoundEffect(target, "ItemSound.quest_middle");

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

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam npc0, HandlerParam timer_id) {
myself.SetCurrentQuestID(114);
if (timer_id == 11401) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(11450, c0.name, "", "", "", ""));
myself.AddAttackDesire(c0, 1, 2000);

}

}

} else if (timer_id == 11402) {
myself.Say(gg.MakeFString(11451, "", "", "", "", ""));
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(114);
myself.AddTimerEx(11401, 500);
myself.AddTimerEx(11402, 1000 * 300);
super;
	}


}