package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_corpse_vampire_curse extends wizard_corpse_vampire_basic {
	protected int DeBuff1 = 262209537;
	protected int Cancel = 262209537;

	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai4 == 0) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}
myself.i_ai4 = 1;
myself.c_ai0 = attacker;

}
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 10 && myself.i_ai4 == 1) {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
if (myself.DistFromMe(myself.c_ai0) < 100) {
if (myself.Skill_GetConsumeMP(Cancel) < myself.sm.mp && myself.Skill_GetConsumeHP(Cancel) < myself.sm.hp && myself.Skill_InReuseDelay(Cancel) == 0) {
myself.AddUseSkillDesire(myself.c_ai0, Cancel, 0, 1, 1000000);

}
myself.i_ai4 = 2;

}

}

}

}
super;
	}


}