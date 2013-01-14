package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_warrior_physicalspecial1_hold extends warrior_hold {
	protected int PhysicalSpecial1 = 262209537;
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
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker && myself.DistFromMe(attacker) > 100 && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 0, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.i_ai0 == 1) {
myself.UseSoulShot(20);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.GetLifeTime() > 7 && attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.p_state != 3) {
if (gg.Rand(100) < 33 && myself.DistFromMe(attacker) > 100 && myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial1) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial1) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial1) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial1, 0, 0, 1000000);

}

}
if (gg.Rand(100) < 33 && myself.i_ai0 == 1) {
myself.UseSoulShot(20);

}

}
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (script_event_arg1 == 1234) {
c0 = gg.GetCreatureFromIndex(script_event_arg2);
if (myself.IsNullCreature(c0) == 0) {
if (gg.Rand(100) < 80) {
myself.AddAttackDesire(c0, 1, 300);

} else {
myself.RemoveAllAttackDesire();
myself.AddAttackDesire(c0, 1, 1000);

}

}

}
	}


}