package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_traikhan extends ai_a_seed_normal_monster {
	protected int Skill01_ID = 418447361;
	protected int Skill01_Probability = 10;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 418643969;
	protected int Skill02_Probability = 10;
	protected int Skill02_Target_Type = 1;
	protected int SpecialSkill01_ID = 418185217;
	protected int FieldCycle_ID = 4;
	protected int FieldCycle_point = 1;

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.DistFromMe(attacker) > 300) {
if (gg.Rand(100) < 5) {
myself.AddUseSkillDesire(attacker, SpecialSkill01_ID, 0, 1, 1000000);

}

}
super;
	}


}