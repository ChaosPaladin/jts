package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_lizard_summoner extends ai_tantaar_lizard_wizard {
	protected int Max_Desire = 1000000000000000000;
	protected int Skill01_ID = 437714945;
	protected int Self_Debuff = 421068801;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai3 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id) {
super;
if (myself.sm.hp <= myself.sm.max_hp * 0.600000 && myself.i_ai3 == 0 && myself.IsNullCreature(attacker) == 0) {
if (babble_mode) {
myself.Say("spawn");

}
myself.i_ai3 = 1;
myself.AddUseSkillDesire(myself.sm, Self_Debuff, 0, 1, Max_Desire);
myself.CreateOnePrivateEx(1022768, "tantaar_lizardman_scout", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, attacker.id, 0, 0);
myself.CreateOnePrivateEx(1022768, "tantaar_lizardman_scout", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, attacker.id, 0, 0);

}
	}

	protected void MY_DYING() {
if (myself.IsNullCreature(myself.c_ai0) == 0) {
myself.CreateOnePrivateEx(1018919, "ai_auragrafter", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 0, 0);

}
if (gg.Rand(1000) == 0 && myself.sm.npc_class_id != 1018862) {
myself.CreateOnePrivateEx(1018862, "tantaar_lizard_protecter", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 0, 0);

}
super;
	}


}