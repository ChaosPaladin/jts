package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_magical3 extends warrior {
	protected int HoldMagic = 265224193;
	protected int DeBuff = 264568833;
	protected int DDMagic = 262209537;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6, HandlerParam c0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}

}
if (myself.DistFromMe(attacker) > 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}

}
myself.AddTimerEx(2001, 12000);
i6 = gg.Rand(100);
if (myself.DistFromMe(attacker) > 300 && myself.i_ai0 == 0) {
if (i6 < 50) {
if (myself.Skill_GetConsumeMP(HoldMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(HoldMagic) < myself.sm.hp && myself.Skill_InReuseDelay(HoldMagic) == 0) {
myself.AddUseSkillDesire(attacker, HoldMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

} else if (myself.DistFromMe(attacker) > 100 && myself.i_ai0 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker && i6 < 50 || i6 < 10) {
if (myself.Skill_GetConsumeMP(HoldMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(HoldMagic) < myself.sm.hp && myself.Skill_InReuseDelay(HoldMagic) == 0) {
myself.AddUseSkillDesire(attacker, HoldMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}
if (attacker.attack_type == 6 && myself.i_ai0 == 0) {
if (gg.Rand(100) < 50) {
if (myself.Skill_GetConsumeMP(HoldMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(HoldMagic) < myself.sm.hp && myself.Skill_InReuseDelay(HoldMagic) == 0) {
myself.AddUseSkillDesire(attacker, HoldMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}
if (myself.DistFromMe(attacker) > 100 && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i6, HandlerParam c0) {
if (timer_id == 2001) {
c0 = myself.GetLastAttacker();
if (myself.IsNullCreature(c0) == 0) {
i6 = gg.Rand(100);
if (i6 < 80 && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(HoldMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(HoldMagic) < myself.sm.hp && myself.Skill_InReuseDelay(HoldMagic) == 0) {
myself.AddUseSkillDesire(c0, HoldMagic, 0, 1, 1000000);

}
myself.i_ai0 = 1;

}

}

}
super;
	}


}