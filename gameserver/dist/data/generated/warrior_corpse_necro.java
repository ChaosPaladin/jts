package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_corpse_necro extends warrior {
	protected int SummonPrivate = 1020130;
	protected String SummonPrivateAI = "warrior";
	protected int ClearCorpse = 262209537;
	protected int DDMagic = 262209537;
	protected int PhysicalSpecial = 264241153;

	protected void CREATED() {
myself.AddTimerEx(3456, 5000);
super;
	}

	protected void SEE_CREATURE(HandlerParam creature) {
if (creature.alive == 0) {
if (myself.p_state == 3 && gg.Rand(100) < 50 && myself.DistFromMe(creature) < 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.CreateOnePrivateEx(SummonPrivate, SummonPrivateAI, 0, 0, gg.FloatToInt(creature.x), gg.FloatToInt(creature.y), gg.FloatToInt(creature.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 0);
if (myself.Skill_GetConsumeMP(ClearCorpse) < myself.sm.mp && myself.Skill_GetConsumeHP(ClearCorpse) < myself.sm.hp && myself.Skill_InReuseDelay(ClearCorpse) == 0) {
myself.AddUseSkillDesire(creature, ClearCorpse, 0, 1, 1000000);

}

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
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 40) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3456) {
myself.LookNeighbor(200);
myself.AddTimerEx(3456, 5000);

}
super;
	}


}