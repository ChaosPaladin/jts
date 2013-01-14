package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_corpse_vampire_basic extends wizard_ddmagic2 {
	protected int DeBuff = 272039937;
	protected int DDMagic = 272039937;
	protected int W_ShortRangeDDMagic = 262209537;
	protected int W_LongRangeDDMagic = 262209537;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 90 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}

}
super;
	}


}