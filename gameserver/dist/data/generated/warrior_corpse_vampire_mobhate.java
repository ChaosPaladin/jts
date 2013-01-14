package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_corpse_vampire_mobhate extends warrior_corpse_vampire {
	protected int DDMagic2 = 272039937;

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state == 3) {
if (myself.DistFromMe(attacker) < 100 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic2) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic2, 0, 1, 1000000);

}

}

}
super;
	}


}