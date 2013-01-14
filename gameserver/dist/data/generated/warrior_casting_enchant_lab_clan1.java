package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_enchant_lab_clan1 extends warrior {
	protected int Buff1 = 458752001;
	protected int Buff2 = 458752001;
	protected int Buff3 = 458752001;
	protected int Buff4 = 458752001;

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff1)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(victim, Buff1, 1, 1, 1000000);

}

} else if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff1)) >= 0) {
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(victim, Buff2, 1, 1, 1000000);

}

} else if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff2)) >= 0) {
if (myself.Skill_GetConsumeMP(Buff3) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff3) < myself.sm.hp && myself.Skill_InReuseDelay(Buff3) == 0) {
myself.AddUseSkillDesire(victim, Buff3, 1, 1, 1000000);

}

} else if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff3)) >= 0) {
if (myself.Skill_GetConsumeMP(Buff4) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff4) < myself.sm.hp && myself.Skill_InReuseDelay(Buff4) == 0) {
myself.AddUseSkillDesire(victim, Buff4, 1, 1, 1000000);

}

}
super;
	}


}