package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_wizard_fixed extends ai_destruct_basic {
	protected int Skill01_ID = 458752001;
	protected int Skill01_Prob = 0;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Prob = 0;
	protected int Skill03_ID = 458752001;
	protected int Skill03_Prob = 0;

	protected void CREATED() {
super;
myself.SetMaxHateListSize(50);
myself.i_ai4 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam h0) {
super;
if (myself.i_ai4 == 0) {
if (attacker.is_pc == 1) {
myself.AddHateInfo(attacker, gg.FloatToInt(damage), 0, 1, 1);

} else if (attacker.is_pc == 0 && myself.IsInCategory(12, attacker.npc_class_id) == 1) {
if (attacker.master.alive == 1) {
myself.AddHateInfo(attacker.master, gg.FloatToInt(damage), 0, 1, 1);

}

}
if (myself.GetHateInfoCount() > 0) {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
if (h0.creature.is_pc != 0 || myself.IsInCategory(12, h0.creature.npc_class_id)) {
if (myself.DistFromMe(h0.creature) >= 150) {
if (Skill01_ID != 458752001 && gg.Rand(10000) < Skill01_Prob) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill01_ID, 0, 0, 1000000);

}

}

} else if (Skill02_ID != 458752001 && gg.Rand(10000) < Skill02_Prob) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(h0.creature, Skill02_ID, 0, 0, 1000000);

}

}

}

}

}

}

} else if (myself.i_ai4 == 1) {
myself.AddAttackDesire(attacker, 0, damage);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam h0) {
super;
if (timer_id == 4811) {
if (myself.Skill_GetConsumeMP(Skill01_ID) > myself.sm.mp || myself.Skill_GetConsumeMP(Skill02_ID) > myself.sm.mp || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.AddTimerEx(4811, 10 * 1000);

} else {
myself.RemoveAllDesire();
myself.i_ai4 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
myself.MakeAttackEvent(h0.creature, 100, 0);

}

}

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam h0, HandlerParam i0, HandlerParam f0, HandlerParam i1, HandlerParam c0) {
if (myself.i_ai4 == 0) {
if (myself.Skill_GetConsumeMP(Skill01_ID) > myself.sm.mp || myself.Skill_GetConsumeMP(Skill02_ID) > myself.sm.mp || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(69730305)) > 0 || gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) > 0) {
myself.RemoveAllDesire();
h0 = myself.GetMaxHateInfo(0);
myself.AddAttackDesire(h0.creature, 0, 1000);
myself.i_ai4 = 1;
myself.AddTimerEx(4811, 10 * 1000);

} else {
h0 = myself.GetMaxHateInfo(0);
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
c0 = h0.creature;
if (myself.DistFromMe(c0) >= 150) {
if (Skill01_ID != 458752001) {
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 0, 1000000);

}

}

}

} else if (Skill02_ID != 458752001) {
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
if (myself.Skill_InReuseDelay(Skill02_ID) == 0) {
if (myself.Skill_GetConsumeMP(Skill02_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill02_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill02_ID) == 0) {
myself.AddUseSkillDesire(c0, Skill02_ID, 0, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(Skill01_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(Skill01_ID) < myself.sm.hp && myself.Skill_InReuseDelay(Skill01_ID) == 0) {
myself.AddUseSkillDesire(c0, Skill01_ID, 0, 1, 1000000);

}

}

}

}

}

}

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
myself.MakeAttackEvent(attacker, damage / 10, 0);
	}

	protected void ATTACK_FINISHED(HandlerParam target, HandlerParam h0) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
myself.MakeAttackEvent(target.master, 1000, 0);

}

}
if (myself.GetHateInfoCount() == 0) {
myself.LookNeighbor(450);

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam h0) {
if (creature.is_pc == 1 || myself.IsInCategory(12, creature.npc_class_id) == 1) {
if (myself.GetHateInfoCount() == 0) {
myself.AddHateInfo(creature, 500, 0, 1, 1);

} else {
myself.AddHateInfo(creature, 100, 0, 1, 1);

}
myself.MakeAttackEvent(creature, 100, 0);

}
super;
	}


}