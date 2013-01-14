package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_leader_wizard_casting_rangecurse extends party_leader_wizard_dd2 {
	protected int Buff1 = 458752001;
	protected int Buff2 = 458752001;
	protected int RangeDeBuff = 458752001;

	protected void CREATED() {
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai3 == 0 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff1, 1, 1, 9999999);

}
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff2, 1, 1, 9999999);

}
myself.i_ai3 = 1;

}
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(RangeDeBuff)) <= 0 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(RangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(RangeDeBuff) == 0) {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai3 == 0 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff1) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff1) < myself.sm.hp && myself.Skill_InReuseDelay(Buff1) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff1, 1, 1, 9999999);

}
if (myself.Skill_GetConsumeMP(Buff2) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff2) < myself.sm.hp && myself.Skill_InReuseDelay(Buff2) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff2, 1, 1, 9999999);

}
myself.i_ai3 = 1;

}
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(RangeDeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(RangeDeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDeBuff) < myself.sm.hp) {
if (myself.Skill_InReuseDelay(RangeDeBuff) == 0) {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

} else {
myself.AddUseSkillDesire(attacker, RangeDeBuff, 0, 1, 1000000);

}

} else {
myself.i_ai0 = 1;
myself.AddAttackDesire(attacker, 1, 1000);

}

}

}
super;
	}


}