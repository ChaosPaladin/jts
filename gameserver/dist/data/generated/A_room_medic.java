package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class A_room_medic extends default_npc {
	protected int MagicHeal = 458752001;
	protected String a_doorname = "island_of_oracle_b";
	protected int inzone_type_param = 9;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.c_ai1 = gg.GetNullCreature();
myself.c_ai2 = gg.GetNullCreature();
myself.c_ai3 = gg.GetNullCreature();
myself.AddTimerEx(1001, gg.Rand(10) + 5 * 1000);
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(5, 5);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim) {
myself.AddFleeDesire(attacker, 100000);
if (myself.i_ai1 == 0 && attacker.y <= 179986) {
gg.Castle_GateOpenCloseEx(a_doorname, 1, myself.InstantZone_GetId());
myself.i_ai1 = 1;
myself.BroadcastScriptEvent(12531, 0, 1000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
if (gg.Rand(100) < 33 && victim != myself.sm && victim.hp <= victim.max_hp * 0.700000) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(victim, MagicHeal, 1, 1, 1000000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam party0, HandlerParam i1, HandlerParam c0, HandlerParam c1) {
if (timer_id == 1001) {
myself.i_ai0 = 0;

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 12531) {
myself.i_ai1 = 1;

}
	}

	protected void MY_DYING() {
myself.InstantZone_MarkRestriction();
	}


}