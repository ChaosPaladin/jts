package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_destruct_disciple extends ai_destruct_wizard {
	protected int SelfRangeDebuff_ID = 458752001;
	protected int SelfRangeDebuff_Prob = 0;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (SelfRangeDebuff_ID != 458752001) {
if (gg.Rand(10000) < SelfRangeDebuff_Prob) {
if (myself.Skill_GetConsumeMP(SelfRangeDebuff_ID) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDebuff_ID) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDebuff_ID) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeDebuff_ID, 0, 0, 1000000);

}

}

}
	}


}