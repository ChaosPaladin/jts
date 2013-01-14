package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_enchant_1of4 extends warrior {
	protected int SelfBuff1 = 263979009;
	protected int SelfBuff2 = 263979009;
	protected int SelfBuff3 = 263979009;
	protected int SelfBuff4 = 263979009;

	protected void CREATED(HandlerParam i0) {
i0 = gg.Rand(4);
if (i0 == 0) {
myself.i_ai0 = SelfBuff1;

} else if (i0 == 1) {
myself.i_ai0 = SelfBuff2;

} else if (i0 == 2) {
myself.i_ai0 = SelfBuff3;

} else {
myself.i_ai0 = SelfBuff4;

}
myself.i_ai1 = 0;
if (myself.Skill_GetConsumeMP(myself.i_ai0) < myself.sm.mp && myself.Skill_GetConsumeHP(myself.i_ai0) < myself.sm.hp && myself.Skill_InReuseDelay(myself.i_ai0) == 0) {
myself.AddUseSkillDesire(myself.sm, myself.i_ai0, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai1 == 0 && gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(myself.i_ai0) < myself.sm.mp && myself.Skill_GetConsumeHP(myself.i_ai0) < myself.sm.hp && myself.Skill_InReuseDelay(myself.i_ai0) == 0) {
myself.AddUseSkillDesire(myself.sm, myself.i_ai0, 1, 1, 1000000);

}

}
myself.i_ai1 = 1;

}
super;
	}


}