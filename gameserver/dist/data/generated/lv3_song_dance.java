package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lv3_song_dance extends lv3_monster {
	protected int DeBuff1 = 272039937;
	protected int DeBuff2 = 272039937;
	protected int DeBuff3 = 272039937;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam f0) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (damage == 0) {
damage = 1;

}
myself.AddAttackDesire(attacker, 1, 1.000000 * damage / myself.sm.level + 7 * 100);

}
if (gg.Rand(100) < 33 && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(DeBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff1) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.i_ai1 == 0) {
if (myself.Skill_GetConsumeMP(DeBuff2) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff2) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff2) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff2, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.i_ai2 == 0) {
if (myself.Skill_GetConsumeMP(DeBuff3) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff3) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff3) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff3, 0, 1, 1000000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id / 256 * 256 == DeBuff1 / 256 * 256) {
myself.i_ai0 = 1;

}
if (skill_name_id / 256 * 256 == DeBuff2 / 256 * 256) {
myself.i_ai1 = 1;

}
if (skill_name_id / 256 * 256 == DeBuff3 / 256 * 256) {
myself.i_ai2 = 1;

}
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam c0, HandlerParam i0) {
c0 = speller;
if (c0.master) {
c0 = c0.master;

}
if (c0.is_pc == 1) {
if (c0.dbid == myself.sm.param2) {
if (myself.Skill_GetAbnormalType(skill_name_id) == myself.Skill_GetAbnormalType(DeBuff1)) {
myself.i_ai0 = 0;

}
if (myself.Skill_GetAbnormalType(skill_name_id) == myself.Skill_GetAbnormalType(DeBuff2)) {
myself.i_ai1 = 0;

}
if (myself.Skill_GetAbnormalType(skill_name_id) == myself.Skill_GetAbnormalType(DeBuff3)) {
myself.i_ai2 = 0;

}

}

}
super;
	}


}