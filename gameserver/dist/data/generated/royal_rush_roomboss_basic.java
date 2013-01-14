package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_roomboss_basic extends warrior {
	protected int PhysicalSpecial1 = 264241153;
	protected int KeyBox = 1031842;
	protected int KeyBox_X = 0;
	protected int KeyBox_Y = 0;
	protected int KeyBox_Z = 0;

	protected void CREATED() {
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 1, 1000000);

}

}

}

}
super;
	}

	protected void MY_DYING() {
if (KeyBox_X != 0 && KeyBox_Y != 0 && KeyBox_Z != 0) {
myself.CreateOnePrivateEx(KeyBox, "royal_rush_keybox", 0, 0, gg.FloatToInt(KeyBox_X), gg.FloatToInt(KeyBox_Y), gg.FloatToInt(KeyBox_Z), 0, 0, 0, 0);

} else {
myself.CreateOnePrivateEx(KeyBox, "royal_rush_keybox", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 0, 0, 0);

}
super;
	}


}