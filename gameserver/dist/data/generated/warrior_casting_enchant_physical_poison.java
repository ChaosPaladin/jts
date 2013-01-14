package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_enchant_physical_poison extends warrior {
	protected int PhysicalSpecial = 264241164;
	protected int Buff1 = 273481729;
	protected int Buff2 = 273612801;
	protected int DeBuff1 = 298254337;
	protected int DeBuff2 = 298319873;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff1, 1, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff2, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i1, HandlerParam skill_name_id) {
i1 = 0;
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff1)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff1, 1, 1, 1000000);

}

}
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff2)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff2, 1, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 10) {
i1 = gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff1));
if (i1 == -1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}

} else if (i1 == 10) {

} else {
i1 = DeBuff1 + i1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(attacker, i1, 0, 1, 1000000);

}

}

}
if (gg.Rand(100) < 10) {
i1 = gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff2));
if (i1 == -1) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff2, 0, 1, 1000000);

}

} else if (i1 == 10) {

} else {
i1 = DeBuff2 + i1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(attacker, i1, 0, 1, 1000000);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam i1) {
i1 = 0;
if (gg.Rand(100) < 10) {
i1 = gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff1));
if (i1 == -1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}

} else if (i1 == 10) {

} else {
i1 = DeBuff1 + i1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(attacker, i1, 0, 1, 1000000);

}

}

}
if (gg.Rand(100) < 10) {
i1 = gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff2));
if (i1 == -1) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff2, 0, 1, 1000000);

}

} else if (i1 == 10) {

} else {
i1 = DeBuff2 + i1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(attacker, i1, 0, 1, 1000000);

}

}

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam i1) {
i1 = 0;
if (gg.Rand(100) < 10) {
i1 = gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(DeBuff1));
if (i1 == -1) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(speller, DeBuff1, 0, 1, 1000000);

}

} else if (i1 == 10) {

} else {
i1 = DeBuff1 + i1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(speller, i1, 0, 1, 1000000);

}

}

}
if (gg.Rand(100) < 10) {
i1 = gg.GetAbnormalLevel(speller, myself.Skill_GetAbnormalType(DeBuff2));
if (i1 == -1) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(speller, DeBuff2, 0, 1, 1000000);

}

} else if (i1 == 10) {

} else {
i1 = DeBuff2 + i1;
if (myself.Skill_GetConsumeMP(i1) < myself.sm.mp && myself.Skill_GetConsumeHP(i1) < myself.sm.hp && myself.Skill_InReuseDelay(i1) == 0) {
myself.AddUseSkillDesire(speller, i1, 0, 1, 1000000);

}

}

}
super;
	}


}