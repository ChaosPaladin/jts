package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_warrior_physicalspecial2 extends royal_rush_warrior_physicalspecial1 {
	protected int PhysicalSpecial2 = 264241153;
	protected int WeaponID = 0;

	protected void CREATED() {
myself.i_ai0 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && WeaponID) {
myself.EquipItem(WeaponID);
myself.SetEnchantOfWeapon(15);
myself.i_ai0 = 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker && myself.DistFromMe(attacker) < 100) {
if (myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else {
myself.UseSoulShot(20);

}

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 33 && myself.DistFromMe(attacker) < 100) {
if (myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial2) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial2) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial2) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial2, 0, 1, 1000000);

}

} else {
myself.UseSoulShot(20);

}

}

}
super;
	}


}