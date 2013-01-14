package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class eranus_the_guard extends lv3_ranger {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam npc0, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(67);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target.is_pc == 1) {
if (gg.HaveMemo(target, 67) == 1 && target.occupation == 127 && gg.GetMemoState(target, 67) == 7 && gg.OwnItemCount(target, 9728) == 0 && target.dbid == myself.sm.param2) {
myself.Say(gg.MakeFString(6752, "", "", "", "", ""));
myself.GiveItem1(target, 9728, 1);
myself.SetFlagJournal(target, 67, 9);
myself.ShowQuestMark(target, 67);
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
myself.SetCurrentQuestID(67);
if (timer_id == 99901) {
c0 = gg.GetCreatureFromIndex(myself.sm.param1);
if (c0) {
if (c0.is_pc == 1) {
myself.Say(gg.MakeFString(6750, c0.name, "", "", "", ""));

}

}

} else if (timer_id == 99902) {
myself.Say(gg.MakeFString(6751, "", "", "", "", ""));
npc0 = gg.GetNPCFromID(myself.sm.param3);
if (gg.IsNull(npc0) == 0) {
npc0.i_quest0 = 0;

}
myself.Despawn();

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(67);
myself.AddTimerEx(99901, 500);
myself.AddTimerEx(99902, 1000 * 300);
super;
	}


}