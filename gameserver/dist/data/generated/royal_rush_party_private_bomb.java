package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_party_private_bomb extends party_private {
	protected int PhysicalSpecial1 = 262209537;
	protected int MagicHeal = 266403841;
	protected int Bomb = 266403841;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (myself.top_desire_target == attacker) {
if (gg.Rand(100) < 33) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

}

}
if (gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 40) {
if (myself.IsMyBossAlive() == 1) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.boss, MagicHeal, 0, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(Bomb) < myself.sm.mp && myself.Skill_GetConsumeHP(Bomb) < myself.sm.hp && myself.Skill_InReuseDelay(Bomb) == 0) {
myself.AddUseSkillDesire(myself.sm, Bomb, 0, 1, 1000000);

}

}

}

}

}

}
super;
	}

	protected void PARTY_ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 40) {
if (myself.IsMyBossAlive() == 1) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.boss, MagicHeal, 0, 1, 1000000);

}
if (myself.Skill_GetConsumeMP(Bomb) < myself.sm.mp && myself.Skill_GetConsumeHP(Bomb) < myself.sm.hp && myself.Skill_InReuseDelay(Bomb) == 0) {
myself.AddUseSkillDesire(myself.sm, Bomb, 0, 1, 1000000);

}

}

}
super;
	}


}