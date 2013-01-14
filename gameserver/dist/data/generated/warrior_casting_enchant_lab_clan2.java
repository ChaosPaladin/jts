package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_enchant_lab_clan2 extends warrior_casting_enchant_lab_clan1 {
	protected int SelfBuff1 = 458752001;
	protected int SelfBuff2 = 458752001;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam party0) {
party0 = gg.GetParty(attacker);
if (myself.IsNullParty(party0) == 0) {
if (party0.member_count >= 8) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff2)) <= 0) {
if (myself.Skill_GetConsumeMP(SelfBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff2) == 0) {
myself.AddUseSkillDesire(attacker, SelfBuff2, 1, 1, 1000000);

}

}

} else if (party0.member_count >= 6) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff1)) <= 0) {
if (myself.Skill_GetConsumeMP(SelfBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff1) == 0) {
myself.AddUseSkillDesire(attacker, SelfBuff1, 1, 1, 1000000);

}

}

}

}
super;
	}


}