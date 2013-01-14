package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class party_private_casting_ddmagic_heal extends party_private {
	protected int MagicHeal = 264568833;
	protected int DDMagic = 267845633;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
i0 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
if (gg.Rand(100) < 33 && i0 < 70) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}

}
if (myself.DistFromMe(attacker) > 100) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage, HandlerParam i0) {
i0 = gg.FloatToInt(private.hp / private.max_hp * 100);
if (gg.Rand(100) < 33 && private != myself.sm && i0 < 70) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(private, MagicHeal, 1, 1, 1000000);

}

}
if (myself.DistFromMe(attacker) > 100) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}

}
super;
	}


}