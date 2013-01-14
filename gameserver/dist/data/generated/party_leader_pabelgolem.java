package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_pabelgolem extends party_leader {
	protected int PhysicalSpecial = 458752001;
	protected int SelfRangePhysicalSpecial = 458752001;
	protected int DeBuff = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 1 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

} else if (myself.IsNullParty(party0) != 1 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(SelfRangePhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangePhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangePhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangePhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private) {
if (gg.Rand(100) < 20) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}
super;
	}


}