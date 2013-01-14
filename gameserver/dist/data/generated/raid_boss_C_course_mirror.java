package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_boss_C_course_mirror extends raid_boss_standard {
	protected int mirror_image_skill = 458752001;

	protected void CREATED() {
gg.SetNpcParam(myself.sm, 9, myself.boss.hp);
myself.c_ai0 = gg.GetNullCreature();
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetCreatureFromIndex(myself.sm.param2);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
myself.i_ai0 = myself.i_ai0 + damage;
if (myself.i_ai0 >= 50000) {
myself.Despawn();

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == 302) {
if (gg.Rand(2)) {
return;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1) {
if (timer_id == 2001) {
myself.Despawn();

} else if (timer_id == 2002) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 10000);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2) {
if (script_event_arg1 == 11039) {
myself.Despawn();

} else if (script_event_arg1 == 12519) {
myself.AddAttackDesire(myself.c_ai0, 1, 10000);

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam i0, HandlerParam c0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 10000);

}
	}


}