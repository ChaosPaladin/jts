package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_roomboss_4 extends royal_rush_roomboss_basic {
	protected int ClanBuff1 = 266403841;
	protected int RangeDDMagic1 = 264241153;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(ClanBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(ClanBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(ClanBuff1) == 0) {
myself.AddUseSkillDesire(myself.sm, ClanBuff1, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(RangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, RangeDDMagic1, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage) {
if (gg.Rand(100) < 33 && myself.top_desire_target != attacker) {
if (myself.Skill_GetConsumeMP(RangeDDMagic1) < myself.sm.mp && myself.Skill_GetConsumeHP(RangeDDMagic1) < myself.sm.hp && myself.Skill_InReuseDelay(RangeDDMagic1) == 0) {
myself.AddUseSkillDesire(attacker, RangeDDMagic1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(ClanBuff1) < myself.sm.mp && myself.Skill_GetConsumeHP(ClanBuff1) < myself.sm.hp && myself.Skill_InReuseDelay(ClanBuff1) == 0) {
myself.AddUseSkillDesire(victim, ClanBuff1, 0, 1, 1000000);

}

}
super;
	}


}