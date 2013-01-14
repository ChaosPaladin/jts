package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_archer extends raid_private_standard {
	protected int LongRangePhysicalSpecial_a = 458752001;

	protected void CREATED() {
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai2 == 0 && myself.DistFromMe(attacker) < 100) {
myself.AddTimerEx(100002, 2000);
myself.i_ai2 = 1;
myself.c_ai1 = attacker;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100002) {
myself.AddFleeDesire(myself.c_ai1, 10000);
myself.i_ai2 = 0;

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && attacker == myself.top_desire_target && gg.Rand(20) < 1) {
myself.AddUseSkillDesire(attacker, LongRangePhysicalSpecial_a, 0, 1, 1000000);

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (speller == myself.top_desire_target && gg.Rand(20) < 1) {
myself.AddUseSkillDesire(speller, LongRangePhysicalSpecial_a, 0, 1, 1000000);

}

}
super;
	}


}