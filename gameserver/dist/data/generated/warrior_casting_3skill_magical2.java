package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_magical2 extends warrior {
	protected int DDMagic1 = 262209537;
	protected int DDMagic2 = 262209537;
	protected int DeBuff = 264568833;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.DistFromMe(attacker) > 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic2) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic2, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i6) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (myself.DistFromMe(attacker) > 100) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic2) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic2) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic2) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic2, 0, 1, 1000000);

}

}

}
if (gg.Rand(100) < 33 && gg.GetAbnormalLevel(attacker, myself.Skill_GetAbnormalType(DeBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}

}
super;
	}


}