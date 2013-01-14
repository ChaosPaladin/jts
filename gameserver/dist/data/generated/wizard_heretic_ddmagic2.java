package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class wizard_heretic_ddmagic2 extends wizard_ddmagic2 {
	protected void CREATED() {
myself.i_ai4 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam i0) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (myself.i_ai4 == 0) {
myself.i_ai4 = 1;

}

}
super;
	}

	protected void OUT_OF_TERRITORY() {
if (myself.i_ai4 == 0) {
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam i0, HandlerParam c0) {
if (script_event_arg1 == 10033) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.i_ai4 = 1;
myself.RemoveAllAttackDesire();
if (myself.DistFromMe(c0) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(c0, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c0, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(c0, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(c0, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c0, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(c0, 1, 1000);

}
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddHateInfo(c0, 1 * 200, 0, 1, 1);

}

}

} else if (script_event_arg1 == 10035) {
myself.i_ai4 = 0;
myself.RemoveAllAttackDesire();
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 100);

} else if (script_event_arg1 == 10002) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
myself.RemoveAllAttackDesire();
if (myself.DistFromMe(c0) > 100) {
if (myself.Skill_GetConsumeMP(W_LongRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_LongRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_LongRangeDDMagic) == 0) {
myself.AddUseSkillDesire(c0, W_LongRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c0, W_LongRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(c0, 1, 1000);

}

} else if (myself.Skill_GetConsumeMP(W_ShortRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(W_ShortRangeDDMagic) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(W_ShortRangeDDMagic) == 0) {
myself.AddUseSkillDesire(c0, W_ShortRangeDDMagic, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(c0, W_ShortRangeDDMagic, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(c0, 1, 1000);

}
if (c0.is_pc != 0 || myself.IsInCategory(12, c0.npc_class_id)) {
myself.AddHateInfo(c0, 1 * 200, 0, 1, 1);

}

}

}
	}


}