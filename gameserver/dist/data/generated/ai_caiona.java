package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_caiona extends ai_a_seed_normal_monster {
	protected int Skill01_ID = 419364865;
	protected int Skill01_Probability = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 419430401;
	protected int Skill02_Probability = 10;
	protected int Skill02_Target_Type = 1;
	protected int Skill03_ID = 419495937;
	protected int Skill03_Probability = 10;
	protected int Skill03_Target_Type = 0;
	protected int FieldCycle_ID = 6;
	protected int FieldCycle_point = 1;

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam success, HandlerParam skill_name_id) {
if (target.is_pc == 1) {
if (myself.IsInCategory(112, target.occupation) == 1 || myself.IsInCategory(3, target.occupation) == 1) {
if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(target, 418709505, 0, 1, max_desire);

}

} else if (gg.Rand(100) < 10) {
myself.AddUseSkillDesire(target, 418709505, 0, 1, max_desire);

}

}
super;
	}


}