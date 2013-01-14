package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_pabelgolem extends party_private {
	protected int DeBuff = 458752001;
	protected int PhysicalSpecial = 458752001;
	protected int DDMagic = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
super;
	}


}