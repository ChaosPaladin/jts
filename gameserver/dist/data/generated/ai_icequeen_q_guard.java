package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_q_guard extends default_npc {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 2000;
	protected int is_leader = -1;
	protected int TIMER_call_knight = 2314888;
	protected int TIMER_soulshot = 2314889;
	protected String MAKER_freya_defeatdun = "schuttgart29_2314_300m1";
	protected String IceQueen_Defeatdun = "icequeen_door_002";
	protected int debug_mode = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
if (is_leader == 1) {
gg.Castle_GateOpenCloseEx(IceQueen_Defeatdun, 0, myself.InstantZone_GetId());

}
	}

	protected void NO_DESIRE(HandlerParam c0) {
c0 = gg.GetCreatureFromIndex(myself.i_ai1);
if (myself.IsNullCreature(c0) == 0) {
myself.AddFollowDesire2(c0, 10, 1, gg.Rand(100) + 100, gg.Rand(60) - 30 + 180);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddAttackDesire(attacker, 1, damage);
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (gg.Rand(2) == 1) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Skill01_ID, 0, 1, 1000000);

}

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam maker0) {
if (creature.is_pc == 1) {
myself.i_ai1 = gg.GetIndexFromCreature(creature);
if (myself.i_ai0 == 0) {
if (is_leader == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, MAKER_freya_defeatdun);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 23140101, gg.GetIndexFromCreature(creature), 0);

}
myself.Say(gg.MakeFString(1801096, creature.name, "", "", "", ""));
myself.UseSoulShot(10);

}
myself.AddTimerEx(TIMER_call_knight, 5 * 1000);
myself.i_ai0 = 1;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 23140043) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.UseSoulShot(10);
myself.AddAttackDesire(c0, 1, 150);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TIMER_call_knight) {
myself.UseSoulShot(10);
myself.BroadcastScriptEvent(23140045, gg.GetIndexFromCreature(myself.sm), 3500);
myself.AddTimerEx(TIMER_call_knight, 3 * 1000);

}
	}


}