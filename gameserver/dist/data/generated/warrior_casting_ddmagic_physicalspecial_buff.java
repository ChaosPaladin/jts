package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_ddmagic_physicalspecial_buff extends warrior_casting_ddmagic_physicalspecial {
	protected int Buff = 263979009;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.p_state != 3 && myself.p_state != 10) {
if (gg.GetAbnormalLevel(victim, myself.Skill_GetAbnormalType(Buff)) <= 0) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(victim, Buff, 1, 1, 1000000);

}

}

}

}
super;
	}


}