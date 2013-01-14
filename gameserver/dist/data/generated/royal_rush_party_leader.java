package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_party_leader extends party_leader {
	protected int PhysicalSpecial1 = 262209537;
	protected int SummonSlave = 1020130;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.i_ai0 == 0) {
myself.CreateOnePrivateEx(SummonSlave, "sacrifice_scarab", 0, 0, gg.FloatToInt(attacker.x), gg.FloatToInt(attacker.y), gg.FloatToInt(attacker.z), 0, 1000, gg.GetIndexFromCreature(myself.top_desire_target), 0);
myself.i_ai0 = 1;

}

}

}
super;
	}


}