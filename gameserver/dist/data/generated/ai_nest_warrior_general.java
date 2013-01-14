package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_warrior_general extends ai_nest_warrior_basic {
	protected String Privates1 = "";
	protected String Privates2 = "";
	protected String Privates3 = "";
	protected int DeBuff = 458752001;
	protected int DeBuffProb = 3333;

	protected void CREATED(HandlerParam maker0) {
super;
maker0 = myself.GetMyMaker();
if (maker0.maximum_npc - maker0.npc_count >= 2) {
myself.CreatePrivates(Privates1);
if (gg.Rand(100) < 50) {
myself.CreatePrivates(Privates2);

} else {
myself.CreatePrivates(Privates3);

}

}
myself.i_ai5 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
super;
if (gg.Rand(10000) < DeBuffProb) {
if (myself.Skill_GetConsumeMP(DeBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(DeBuff) < myself.sm.hp && myself.Skill_InReuseDelay(DeBuff) == 0) {
myself.AddUseSkillDesire(attacker, DeBuff, 0, 1, 1000000);

}

}
	}


}