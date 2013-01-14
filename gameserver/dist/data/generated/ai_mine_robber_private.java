package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_mine_robber_private extends warrior_use_skill {
	protected int TIMER_MASTER_CHECK = 33131;
	protected int TIMER_TELEPORT = 33132;
	protected int TIMER_TELEPORT_AGAIN = 33133;
	protected int TIMER_SPAWN_DELAY = 33134;
	protected int TIMER_DELAY_FIRED = 33135;
	protected int SPAWN_DELAY = 1500;
	protected int SKILL_TeleportEffect = 306118657;
	protected int debug_mode = 0;

	protected void CREATED() {
if (debug_mode) {
myself.Say("Created!");

}
super;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
gg.SetAsNull(myself.c_ai0);
myself.AddTimerEx(TIMER_MASTER_CHECK, 5 * 60 * 1000);
myself.AddTimerEx(TIMER_SPAWN_DELAY, SPAWN_DELAY);
	}

	protected void NO_DESIRE() {
if (myself.IsMyBossAlive()) {
myself.AddFollowDesire2(myself.boss, 5, 1, gg.Rand(50) + 50, gg.Rand(60) - 30 + 180);

} else {
myself.AddMoveAroundDesire(5, 5);

}
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam f0) {
if (myself.i_ai7 == 1) {
if (private != myself.sm) {
if (myself.IsNullCreature(attacker) == 0) {
myself.MakeAttackEvent(attacker, damage, 0);

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam victim, HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai7 == 1) {
if (victim == myself.boss) {
if (gg.FloatToInt(attacker.z) - gg.FloatToInt(myself.sm.z) > 100 || gg.FloatToInt(attacker.z) - gg.FloatToInt(myself.sm.z) < -100) {
if (myself.i_ai6 == 0) {
if (debug_mode) {
myself.Say("teleport");

}
myself.i_ai6 = 1;
myself.c_ai0 = attacker;
myself.RemoveAllDesire();
myself.StopMove();
if (myself.Skill_GetConsumeMP(SKILL_TeleportEffect) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_TeleportEffect) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_TeleportEffect) == 0) {
myself.AddUseSkillDesire(myself.sm, SKILL_TeleportEffect, 1, 1, 1000000);

}

} else if (myself.i_ai6 == 1) {
if (debug_mode) {
myself.Say("teleport lock");

}
myself.AddAttackDesire(attacker, 1, 100);

}

} else {
myself.AddAttackDesire(attacker, 1, 100);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == TIMER_MASTER_CHECK) {
if (debug_mode) {
myself.Say("Timer Master Check");

}
if (myself.IsMyBossAlive()) {
if (debug_mode) {
myself.Say("My Boss Alive");

}
myself.AddTimerEx(TIMER_MASTER_CHECK, 5 * 60 * 1000);

} else {
if (debug_mode) {
myself.Say("My Boss Already Died!");

}
myself.Despawn();

}

} else if (timer_id == TIMER_TELEPORT_AGAIN) {
if (myself.i_ai6 == 1) {
if (debug_mode) {
myself.Say("teleport able");

}
myself.i_ai6 = 0;

}

} else if (timer_id == TIMER_SPAWN_DELAY) {
myself.i_ai7 = 1;

} else if (timer_id == TIMER_DELAY_FIRED) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
myself.MakeAttackEvent(myself.c_ai1, 1000, 0);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
super;
if (script_event_arg1 == 2512001) {
myself.c_ai1 = gg.GetCreatureFromIndex(script_event_arg3);
if (myself.i_ai7 == 1) {
if (gg.GetCreatureFromIndex(script_event_arg2) == myself.boss) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
myself.MakeAttackEvent(myself.c_ai1, 1000, 0);

}

}

} else {
myself.AddTimerEx(TIMER_DELAY_FIRED, SPAWN_DELAY);

}

}
	}

	protected void MY_DYING() {
super;
gg.SendScriptEvent(myself.boss, 2512002, 0);
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam target, HandlerParam c0, HandlerParam i0) {
super;
if (skill_name_id == SKILL_TeleportEffect && success == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.InstantTeleport(myself.sm, gg.FloatToInt(myself.c_ai0.x), gg.FloatToInt(myself.c_ai0.y), gg.FloatToInt(myself.c_ai0.z));
if (debug_mode) {
myself.Say("teleported");

}
myself.MakeAttackEvent(myself.c_ai0, 1000, 0);
myself.AddTimerEx(TIMER_TELEPORT_AGAIN, 10 * 1000);

}

}
	}


}