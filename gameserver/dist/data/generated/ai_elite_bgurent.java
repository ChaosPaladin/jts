package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_elite_bgurent extends ai_a_seed_elite_monster {
	protected int Skill01_ID = 418250753;
	protected int Skill01_Probability = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 418381825;
	protected int Skill02_Probability = 15;
	protected int Skill02_Target_Type = 1;
	protected int SpecialSkill01_ID = 418316289;
	protected int FieldCycle_ID = 4;
	protected int FieldCycle_point = 10;

	protected void CREATED(HandlerParam i0, HandlerParam i1) {
i1 = gg.Rand(3);
for (i0 = 0; i0 < 3; i0 = i0 + 1) {
switch (i1) {
case 0: {
myself.CreateOnePrivateEx(1022747, "brakian", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 1: {
myself.CreateOnePrivateEx(1022748, "groykhan", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1022749, "traikhan", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) > 300) {
if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(attacker, SpecialSkill01_ID, 0, 1, 1000000);

}

}
super;
	}


}