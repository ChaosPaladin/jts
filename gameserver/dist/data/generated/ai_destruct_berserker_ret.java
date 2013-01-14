package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_berserker_ret extends ai_destruct_warrior_ret {
	protected int Buff = 458752001;

	protected void CREATED() {
super;
myself.c_ai0 = gg.GetNullCreature();
myself.SetMaxHateListSize(50);
myself.AddTimerEx(1546, 3000);
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * 10, 0);
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0) {
if (attacker.is_pc == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1 || attacker.npc_class_id == 1018775) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);

}
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.c_ai0.alive != 0) {
myself.AddAttackDesire(myself.c_ai0, 1, 10000);
if (Skill01_ID != 458752001) {
if (gg.Rand(10000) < Skill01_Prob) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Skill01_ID, 0, 1, 1000000);

}

}

}

} else {
myself.RemoveAllDesire();
myself.c_ai0 = gg.GetNullCreature();

}

} else {
myself.c_ai0 = attacker;
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 10000000);

}

}
myself.AddAttackDesire(attacker, 1, 300000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0) {
super;
if (timer_id == 1546) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.c_ai0.alive != 1 && myself.GetHateInfoCount() != 0) {
h0 = myself.GetMaxHateInfo(0);
myself.c_ai0 = h0.creature;
myself.RemoveAllHateInfoIF(0, 0);
myself.AddAttackDesire(myself.c_ai0, 1, 300000);

}

}
myself.AddTimerEx(1546, 3000);

}
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (myself.IsNullCreature(myself.c_ai0) == 1) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
myself.c_ai0 = creature;
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 10000000);

}

}
myself.AddAttackDesire(creature, 1, 300000);

}

}
	}


}