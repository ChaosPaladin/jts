package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_summon_pc extends warrior {
	protected int SummonMagic = 458752001;
	protected int PhysicalSpecial = 458752001;
	protected int SkillCastingTime = 2000;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam c0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
i6 = gg.Rand(100);
myself.c_ai0 = attacker;
if (myself.DistFromMe(attacker) > 300 && myself.i_ai0 == 0) {
if (i6 < 50) {
if (myself.Skill_GetConsumeMP(SummonMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMagic) == 0) {
myself.AddUseSkillDesire(attacker, SummonMagic, 0, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(SummonMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMagic) == 0) {
myself.AddUseSkillDesire(attacker, SummonMagic, 0, 1, 1000000);
myself.i_ai0 = 1;
myself.i_ai1 = 1;

}

}

} else if (myself.DistFromMe(attacker) > 100 && myself.i_ai0 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && i6 < 50 || i6 < 10) {
if (myself.Skill_GetConsumeMP(SummonMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SummonMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SummonMagic) == 0) {
myself.AddUseSkillDesire(attacker, SummonMagic, 0, 1, 1000000);
myself.i_ai0 = 1;
myself.i_ai1 = 1;

}

}

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam success) {
if (success == 1 && myself.i_ai1 == 1) {
myself.InstantTeleport(myself.c_ai0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
myself.i_ai1 = 0;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == myself.c_ai0) {
if (PhysicalSpecial != 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, PhysicalSpecial, 0, 1, 1000000);

}

}

}

}
	}


}