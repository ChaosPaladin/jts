package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_selfrangeddmagic_buff extends warrior {
	protected int SelfRangeDDMagic = 264306689;
	protected int Buff = 264110083;

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
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target != attacker && myself.DistFromMe(attacker) < 200) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam victim) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.DistFromMe(attacker) < 200 && gg.Rand(100) < 33 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}

}
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