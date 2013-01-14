package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_casting_3skill_magical4 extends warrior {
	protected int MagicHeal = 264568833;
	protected int Buff = 263979009;
	protected int CancelMagic = 268304385;
	protected int CheckMagic = 458752001;
	protected int CheckMagic1 = 458752001;
	protected int CheckMagic2 = 458752001;

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
i0 = gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100);
if (gg.Rand(100) < 33 && i0 < 70) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(myself.sm, MagicHeal, 1, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.i_ai1 == 0 && gg.Rand(100) < 33 && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) > 50) {
if (myself.Skill_GetConsumeMP(Buff) < myself.sm.mp && myself.Skill_GetConsumeHP(Buff) < myself.sm.hp && myself.Skill_InReuseDelay(Buff) == 0) {
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 1000000);

}

}
if (gg.Rand(100) < 1 && myself.i_ai2 == 0 && myself.sm.hp > myself.sm.max_hp * 0.400000) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
myself.i_ai2 = 1;

}

}
myself.i_ai1 = 1;

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam i0) {
if (gg.Rand(100) < 33 && myself.p_state != 3) {
if (myself.Skill_GetConsumeMP(MagicHeal) < myself.sm.mp && myself.Skill_GetConsumeHP(MagicHeal) < myself.sm.hp && myself.Skill_InReuseDelay(MagicHeal) == 0) {
myself.AddUseSkillDesire(victim, MagicHeal, 1, 1, 1000000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (gg.Rand(100) < 1 && myself.i_ai2 == 0 && myself.sm.hp > myself.sm.max_hp * 0.400000) {
myself.i_ai2 = 1;

}

}
super;
	}


}