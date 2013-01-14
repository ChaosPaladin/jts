package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_frog extends warrior_flee {
	protected int Max_Desire = 1000000000000000000;
	protected int Skill01_ID = 458752001;
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.IsNullCreature(attacker) == 0) {
myself.c_ai0 = attacker;

}
if (myself.i_ai1 == 0) {
if (myself.IsNullCreature(attacker) == 0 && attacker.is_pc || myself.IsInCategory(12, attacker.npc_class_id) || myself.IsInCategory(35, attacker.npc_class_id)) {
if (babble_mode) {
myself.Say("buffer out");

}
myself.CreateOnePrivateEx(1018918, "ai_tantaar_vegetation_buffer", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, attacker.id, 3, 0);

}
myself.i_ai1 = 1;
myself.ChangeStatus(2);
myself.Suicide();

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
super;
if (babble_mode) {
myself.Say("SPELLED:" + skill_name_id / 256 * 256);

}
if (skill_name_id == 421199873) {
if (babble_mode) {
myself.Say("s_lizard_grasslands_fungus1 hit");

}
myself.AddUseSkillDesire(myself.sm, 433979393, 0, 1, Max_Desire);

}
	}


}