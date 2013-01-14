package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_physicalspecial extends party_leader {
	protected int PhysicalSpecial = 264241153;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i6 = gg.Rand(100);
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.sm.hp < myself.sm.max_hp * 0.200000 && i6 < 33 && myself.i_ai0 == 0 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i6 = gg.Rand(100);
if (i6 < 33 && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}
super;
	}


}