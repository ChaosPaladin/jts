package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_potion extends warrior_physicalspecial {
	protected int EffectSkill = 458752001;
	protected int MagicHeal = 458752001;
	protected int PhysicalSpecial = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.sm.hp < myself.sm.max_hp * 0.800000 && myself.i_ai1 != 3 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}
myself.i_ai1 = 1;

} else if (myself.sm.hp < myself.sm.max_hp / 2 && myself.i_ai1 != 3 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}
myself.i_ai1 = 2;

} else if (myself.sm.hp < myself.sm.max_hp / 3 && myself.i_ai1 != 3 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}
myself.i_ai1 = 3;

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam i0) {
i0 = gg.Rand(100);
if (skill_name_id == MagicHeal) {
if (i0 < 30) {
myself.Say(gg.MakeFString(10071, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(10072, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(10073, "", "", "", "", ""));

}

}
	}


}