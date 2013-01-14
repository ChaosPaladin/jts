package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class crimsha_werewolf extends warrior_aggressive {
	protected void MY_DYING(HandlerParam always_list, HandlerParam attacker, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam skill_name_id, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(227);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (gg.HaveMemo(myself.c_quest0, 227) == 1 && gg.GetMemoState(myself.c_quest0, 227) == 11) {
myself.SetMemoState(myself.c_quest0, 227, 12);
myself.SetFlagJournal(c1, 227, 13);
myself.ShowQuestMark(c1, 227);
myself.SoundEffect(c1, "ItemSound.quest_middle");

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

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam weapon_class_id) {
myself.SetCurrentQuestID(227);
myself.AddAttackDesire(attacker, 1, 2000);
if (skill_name_id / 65536 != 79036417 / 65536 && skill_name_id / 65536 != 70058185 / 65536 && skill_name_id / 65536 != 78708737 / 65536 && skill_name_id / 65536 != 76284105 / 65536 && skill_name_id / 65536 != 76546049 / 65536 && skill_name_id / 65536 != 75169793 / 65536 && skill_name_id / 65536 != 67567617 / 65536 && skill_name_id / 65536 != 77135873 / 65536 && skill_name_id / 65536 != 77594625 / 65536 && attacker.is_pc == 1) {
myself.Say(gg.MakeFString(22720, "", "", "", "", ""));
myself.Despawn();

}
if (attacker.is_pc == 1) {
myself.c_quest0 = attacker;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam c0, HandlerParam i0, HandlerParam timer_id) {
myself.SetCurrentQuestID(227);
if (timer_id == 7778) {
if (myself.i_quest0 < 60) {
myself.i_quest0 = myself.i_quest0 + 1;
myself.AddTimerEx(7778, 1000 * 5);

} else {
myself.Despawn();

}

} else if (timer_id == 7779) {
i0 = myself.sm.param1;
if (i0 > 0) {
c0 = myself.Maker_FindNpcByKey(i0);
if (c0) {
myself.AddAttackDesire(c0, 1, 2000);

} else {
myself.AddTimerEx(7779, 500);

}

}

}
super;
	}

	protected void CREATED() {
myself.SetCurrentQuestID(227);
myself.AddTimerEx(7778, 1000 * 5);
myself.AddTimerEx(7779, 500);
myself.i_quest0 = 0;
super;
	}


}