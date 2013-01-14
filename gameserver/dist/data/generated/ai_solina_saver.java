package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_solina_saver extends warrior {
	protected int MoveAroundSocial = 0;
	protected int Skill01_ID = 413204481;
	protected int Skill02_ID = 413270017;

	protected void CREATED() {
myself.AddMoveAroundDesire(5, 5);
myself.c_ai0 = myself.sm;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
super;
	}

	protected void NO_DESIRE() {
myself.i_ai3 = 0;
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam c0, HandlerParam i0, HandlerParam i1) {
if (myself.GetLifeTime() > 7 && myself.InMyTerritory(myself.sm) && myself.IsNullCreature(myself.top_desire_target) == 1) {
i0 = gg.Rand(10) + 40;
i1 = gg.Rand(10) + 40;
if (creature.is_pc != 0 && myself.IsWeaponEquippedInHand(creature) == 1) {
if (myself.IsInCategory(112, creature.occupation)) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, 1000000);

}
myself.c_ai0 = creature;

} else if (myself.i_ai4 == 0 && gg.Rand(100) < 33) {
myself.i_ai4 = 1;
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, 1000000);

}

} else {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(creature, Skill02_ID, 0, 1, 1000000);

}
myself.c_ai0 = creature;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(attacker, Skill01_ID, 0, 1, 1000000);

}

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 10000);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == Skill02_ID) {
if (myself.i_ai3 == 0) {
myself.Say(gg.MakeFString(1121006, "", "", "", "", ""));
myself.i_ai3 = 1;

}
myself.AddAttackDesire(myself.c_ai0, 1, 10000);

}
	}

	protected void MY_DYING(HandlerParam c0) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
if (gg.HaveMemo(c0, 457) == 0 && gg.GetDailyQuestFlag(c0, 457) == 1 && c0.level >= 82) {
if (gg.Rand(100) < 1) {
myself.CreateOnePrivateEx(1032759, "lost_villager", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), myself.GetDirection(myself.sm), 0, 0, 0);

}

}

}
super;
	}


}