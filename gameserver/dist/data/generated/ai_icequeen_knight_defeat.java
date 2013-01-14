package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_knight_defeat extends default_npc {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 2500;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Prob = 3333;

	protected void CREATED() {
myself.SetMaxHateListSize(10);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.AddAttackDesire(attacker, 1, damage * 2);
if (myself.DistFromMe(attacker) >= 500) {
if (Skill02_ID != 458752001) {
if (gg.Rand(10000) < Skill02_Prob) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill02_ID, 0, 1, 1000000);

}

}

}

}
if (attacker.is_pc == 1) {
myself.BroadcastScriptEvent(23140043, gg.GetIndexFromCreature(myself.sm), 1500);

}
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

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
myself.AddAttackDesire(attacker, 1, 100);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0) {
if (script_event_arg1 == 23140045) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddHateInfo(c0, 1, 0, 1, 1);
myself.BroadcastScriptEvent(23140043, gg.GetIndexFromCreature(myself.sm), 1500);
myself.AddTimerEx(4321, 3000);

}

} else if (script_event_arg1 == 23140020) {
myself.Despawn();

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam c0, HandlerParam i0, HandlerParam h0) {
if (timer_id == 4321) {
i0 = gg.Rand(myself.GetHateInfoCount());
h0 = myself.GetHateInfoByIndex(i0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.AddAttackDesire(h0.creature, 1, 1000);

}

}

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam c0) {
if (creature.is_pc == 1) {
myself.AddAttackDesire(c0, 1, 1000);

}
	}


}