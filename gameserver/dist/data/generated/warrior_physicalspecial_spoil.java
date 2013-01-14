package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_physicalspecial_spoil extends warrior_physicalspecial {
	protected int EffectSkill = 458752001;
	protected int PhysicalSpecial = 458752001;

	protected void CREATED() {
myself.i_ai1 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
if (myself.i_ai1 == 0) {
if (myself.Skill_GetConsumeMP(EffectSkill) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill) == 0) {
myself.AddUseSkillDesire(attacker, EffectSkill, 0, 1, 1000000);

}
myself.i_ai1 = 1;

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

}
super;
	}

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 1) {
myself.Say(gg.MakeFString(1010584, "", "", "", "", ""));

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam i0) {
if (skill_name_id == EffectSkill && success == 1) {
i0 = gg.Rand(100);
if (i0 < 30) {
myself.Say(gg.MakeFString(10068, "", "", "", "", ""));

} else if (i0 < 60) {
myself.Say(gg.MakeFString(10069, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(10070, "", "", "", "", ""));

}

}
	}


}