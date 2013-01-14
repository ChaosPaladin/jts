package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_is_death_scout extends is_basic {
	protected int Skill01_ID = 385220609;
	protected int Skill01_Probability = 20;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 386269185;
	protected int Skill02_Probability = 5;
	protected int Skill02_Target_Type = 0;
	protected int cruel_expunge1 = 385286145;

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 8001) {
if (gg.IsNull(myself.top_desire_target) == 0) {
if (gg.GetAbnormalLevel(myself.top_desire_target, myself.Skill_GetAbnormalType(Skill01_ID)) > 0) {
myself.AddUseSkillDesire(myself.top_desire_target, 385286145, 1, 0, 100000000);

}

}

}
super;
	}


}