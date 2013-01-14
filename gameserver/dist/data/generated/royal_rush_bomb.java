package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_bomb extends warrior {
	protected int SelfRangeDDMagic = 277348353;
	protected int SelfRangeDDMagicRate = 33;
	protected int DDMagicUseHpRate = 30;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.Rand(100) < SelfRangeDDMagicRate && gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < DDMagicUseHpRate) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDDMagic, 0, 1, 1000000);

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
myself.Despawn();
	}


}