package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_magical extends warrior {
	protected int SleepMagic = 265158657;
	protected int DDMagic = 262209537;
	protected int CancelMagic = 268304385;
	protected int CheckMagic = 458752001;
	protected int CheckMagic1 = 458752001;
	protected int CheckMagic2 = 458752001;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 1) {

} else if (myself.top_desire_target != attacker) {
i6 = gg.Rand(100);
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;

} else if (myself.i_ai0 == 1 && i6 < 30 && myself.sm.hp > myself.sm.max_hp / 10.000000) {
if (myself.Skill_GetConsumeMP(SleepMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SleepMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SleepMagic) == 0) {
myself.AddUseSkillDesire(attacker, SleepMagic, 0, 1, 1000000);

}

}

} else {
if (myself.DistFromMe(attacker) > 100) {
i6 = gg.Rand(100);
if (myself.top_desire_target == attacker && i6 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
if (gg.Rand(100) < 1 && myself.i_ai1 == 0 && myself.sm.hp > myself.sm.max_hp * 0.400000) {
myself.i_ai1 = 1;

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
i6 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 100 && i6 < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 1 && myself.i_ai1 == 0 && myself.sm.hp > myself.sm.max_hp * 0.400000) {
myself.i_ai1 = 1;

}

}
super;
	}


}