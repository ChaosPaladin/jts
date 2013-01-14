package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_couple_follower_baby extends party_private_couple_follower {
	protected int SelfRangePhysicalSpecial = 458752001;
	protected int Buff = 458752001;
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
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangePhysicalSpecial, 0, 1, 1000000);

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
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

}

}
super;
	}


}