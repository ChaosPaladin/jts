package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_elite_karnibi extends ai_a_seed_elite_monster {
	protected int Skill01_ID = 418971649;
	protected int Skill01_Probability = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 419037185;
	protected int Skill02_Probability = 10;
	protected int Skill02_Target_Type = 1;
	protected int Skill03_ID = 419102721;
	protected int Skill03_Probability = 10;
	protected int Skill03_Target_Type = 0;
	protected int SpecialSkill01_ID = 418906113;
	protected int FieldCycle_ID = 6;
	protected int FieldCycle_point = 10;

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
for (i0 = 0; i0 < 3; i0 = i0 + 1) {
i1 = gg.Rand(3);
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022760, "karnibi", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022761, "kiriona", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022762, "caiona", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

}
super;
	}

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