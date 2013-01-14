package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_is_soul_wagon extends is_basic {
	protected int Skill01_ID = 385875969;
	protected int Skill01_Probability = 15;
	protected int Skill01_Target_Type = 0;
	protected int Skill02_ID = 386596865;
	protected int Skill02_Probability = 20;
	protected int Skill02_Target_Type = 0;
	protected int self_stun = 389087233;

	protected void ATTACKED(HandlerParam attacker) {
if (myself.IsInCategory(112, attacker.occupation)) {
if (gg.Rand(100) < 20) {
myself.AddUseSkillDesire(myself.sm, 389087233, 1, 0, 100000000);

}

}
super;
	}


}