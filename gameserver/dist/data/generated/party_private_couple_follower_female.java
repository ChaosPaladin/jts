package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_couple_follower_female extends party_private_couple_follower {
	protected int PhysicalSpecial = 458752001;
	protected int Buff = 458752001;
	protected int Debuff = 458752001;
	protected int Private = 0;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Debuff)) <= 0) {
if (myself.Skill_GetConsumeMP(Debuff) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff) == 0) {
myself.AddUseSkillDesire(attacker, Debuff, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Buff)) <= 0 && gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

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
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Debuff)) <= 0) {
if (myself.Skill_GetConsumeMP(Debuff) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff) == 0) {
myself.AddUseSkillDesire(attacker, Debuff, 0, 1, 1000000);

}

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Debuff)) <= 0) {
if (myself.Skill_GetConsumeMP(Debuff) < myself.sm.mp && myself.Skill_GetConsumeHP(Debuff) < myself.sm.hp && myself.Skill_InReuseDelay(Debuff) == 0) {
myself.AddUseSkillDesire(attacker, Debuff, 0, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(Buff)) <= 0 && gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(private, Buff, 1, 1, 1000000);

}

}

}
super;
	}


}