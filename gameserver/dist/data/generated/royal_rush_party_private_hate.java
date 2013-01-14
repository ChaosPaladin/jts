package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_party_private_hate extends party_private {
	protected int MobHate = 262209537;
	protected int SelfBuff = 266403841;

	protected void CREATED() {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(MobHate) < myself.sm.mp && myself.Skill_GetConsumeHP(MobHate) < myself.sm.hp && myself.Skill_InReuseDelay(MobHate) == 0) {
myself.AddUseSkillDesire(attacker, MobHate, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (gg.Rand(100) < 10) {
if (myself.Skill_GetConsumeMP(MobHate) < myself.sm.mp && myself.Skill_GetConsumeHP(MobHate) < myself.sm.hp && myself.Skill_InReuseDelay(MobHate) == 0) {
myself.AddUseSkillDesire(attacker, MobHate, 0, 1, 1000000);

}

}
super;
	}


}