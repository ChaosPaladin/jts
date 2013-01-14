package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_portrait_spirit extends default_npc {
	protected int PhysicalSpecial = 328269825;
	protected int Hold = 328466433;
	protected int vampiric = 328531969;
	protected int bomb = 328400897;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;

	protected void CREATED() {
myself.i_ai4 = 0;
myself.i_quest1 = 0;
myself.i_quest2 = 0;
myself.i_ai9 = 0;
myself.AddMoveAroundDesire(200, 5);
myself.AddTimerEx(5000, 10 * 1000);
super;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai4 == 0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, 1 * 50);

}
myself.i_quest2 = myself.GetCurrentTick();
myself.AddTimerEx(2001, 5 * 1000);

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.i_ai4 == 0 && myself.GetLifeTime() > 7) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, 1 * 50);

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam i0, HandlerParam success) {
if (skill_name_id == bomb && success == 1) {
myself.Despawn();
return;

}
if (myself.i_ai4 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target.is_pc == 1) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Hold)) > 0) {
if (myself.Skill_GetConsumeMP(vampiric) < myself.sm.mp && myself.Skill_GetConsumeHP(vampiric) < myself.sm.hp && myself.Skill_InReuseDelay(vampiric) == 0 && myself.i_quest2 < 3) {
myself.i_quest1 = myself.i_quest1 + 1;
myself.AddUseSkillDesire(myself.top_desire_target, vampiric, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial, 0, 1, 1000000);

}
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
myself.AddAttackDesire(myself.top_desire_target, 1, 1 * 50);

}

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (myself.i_ai4 == 0) {
if (timer_id == 2001) {
i0 = myself.GetCurrentTick();
if (i0 > myself.i_quest1 + 5) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.Skill_GetConsumeMP(Hold) < myself.sm.mp && myself.Skill_GetConsumeHP(Hold) < myself.sm.hp && myself.Skill_InReuseDelay(Hold) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, Hold, 0, 1, 1000000);

}

}

}

} else if (timer_id == 2002) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Hold)) > 0) {
if (myself.Skill_GetConsumeMP(vampiric) < myself.sm.mp && myself.Skill_GetConsumeHP(vampiric) < myself.sm.hp && myself.Skill_InReuseDelay(vampiric) == 0 && myself.i_quest2 < 3) {
myself.i_quest1 = myself.i_quest1 + 1;
myself.AddUseSkillDesire(myself.top_desire_target, vampiric, 0, 1, 1000000);

}
myself.AddTimerEx(2002, 5 * 1000);

} else {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.top_desire_target, PhysicalSpecial, 0, 1, 1000000);

}
if (myself.top_desire_target.is_pc != 0 || myself.IsInCategory(12, myself.top_desire_target.npc_class_id)) {
myself.AddAttackDesire(myself.top_desire_target, 1, 1 * 50);

}

}

}

} else if (timer_id == 5000) {
if (myself.IsMyBossAlive() == 0) {
if (myself.p_state != 3 && myself.p_state != 10) {
myself.Despawn();

} else if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(myself.top_desire_target) > 5000) {
myself.Despawn();

}

} else {
myself.AddTimerEx(5000, 10 * 1000);

}

} else {
myself.AddTimerEx(5000, 10 * 1000);

}

}
super;

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.i_ai4 == 0 && myself.GetLifeTime() > 7) {
if (creature.is_pc == 0 && myself.IsInCategory(12, creature.npc_class_id) == 0) {

} else {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(creature, PhysicalSpecial, 0, 1, 1000000);

}
if (creature.is_pc != 0 || myself.IsInCategory(12, creature.npc_class_id)) {
myself.AddAttackDesire(creature, 1, 1 * 50);

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 20000) {
if (myself.i_ai9 == 1) {
myself.Say("자폭");

}
myself.RemoveAllDesire();
if (myself.Skill_GetConsumeMP(bomb) < myself.sm.mp && myself.Skill_GetConsumeHP(bomb) < myself.sm.hp && myself.Skill_InReuseDelay(bomb) == 0) {
myself.AddUseSkillDesire(myself.sm, bomb, 1, 1, 1000000);

}

} else if (script_event_arg2 == 40000) {
myself.RemoveAllDesire();
myself.Despawn();

} else if (script_event_arg2 == 50000) {
myself.i_ai4 = 1;
myself.RemoveAllDesire();

}
	}


}