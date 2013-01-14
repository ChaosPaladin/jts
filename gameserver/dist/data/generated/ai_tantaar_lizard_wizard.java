package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_lizard_wizard extends wizard_basic {
	protected int Max_Desire = 1000000000000000000;
	protected int AttackRange = 2;
	protected int Skill01_ID = 437518337;
	protected int Skill01_Check_Dist = 0;
	protected int Skill02_Check_Dist = 0;
	protected int TID_ATTRACT_TO_FUNGUS_KILLA = 780002;
	protected int babble_mode = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
super;
if (myself.IsNullCreature(attacker) == 0) {
myself.c_ai0 = attacker;

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
super;
if (skill_name_id == 421199873) {
if (babble_mode) {
myself.Say("s_lizard_grasslands_fungus1 hit");

}
myself.AddUseSkillDesire(myself.sm, 433979393, 0, 1, Max_Desire);

}
if (babble_mode) {
myself.Say("SPELLED:" + skill_name_id / 256 * 256);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0) {
super;
if (myself.sm.npc_class_id == 1022773) {
if (myself.IsNullCreature(gg.GetCreatureFromID(script_event_arg3)) == 0) {
myself.c_ai1 = gg.GetCreatureFromID(script_event_arg3);

}
myself.AddTimerEx(TID_ATTRACT_TO_FUNGUS_KILLA, 7 * 1000);
if (script_event_arg1 == 78010087) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAllDesire();
myself.ChangeMoveType(1);
myself.AddMoveToDesire(gg.FloatToInt(c0.x) + gg.Rand(25) - gg.Rand(25), gg.FloatToInt(c0.y) + gg.Rand(25) - gg.Rand(25), gg.FloatToInt(c0.z) + gg.Rand(25) - gg.Rand(25), Max_Desire);

}

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
super;
if (private == myself.boss && private.npc_class_id == 1018864) {
myself.AddTimerEx(780001, 3 * 60 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
super;
if (timer_id == 780001) {
if (myself.p_state != 3 && myself.sm.hp == myself.sm.max_hp) {
myself.Despawn();

} else {
myself.AddTimerEx(780001, 3 * 60 * 1000);

}

} else if (timer_id == TID_ATTRACT_TO_FUNGUS_KILLA) {
if (myself.IsNullCreature(myself.c_ai1) == 0) {
myself.MakeAttackEvent(myself.c_ai1, 5000, 0);

}

}
	}

	protected void MY_DYING() {
super;
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.CreateOnePrivateEx(1018919, "ai_auragrafter", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 0, 0);

}
if (gg.Rand(1000) == 0 && myself.sm.npc_class_id != 1018862) {
myself.CreateOnePrivateEx(1018862, "tantaar_lizard_protecter", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 0, 0);

}
	}


}