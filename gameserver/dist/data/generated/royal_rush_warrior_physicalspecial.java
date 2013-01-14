package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_warrior_physicalspecial extends warrior_physicalspecial {
	protected int SelfBuff = 0;
	protected int WeaponID = 0;

	protected void CREATED() {
if (SelfBuff != 0) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
myself.AddTimerEx(3000, 1000 * 60 * 2);

}
myself.i_ai0 = 0;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < 50 && WeaponID) {
myself.EquipItem(WeaponID);
myself.SetEnchantOfWeapon(15);
myself.i_ai0 = 1;

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id) && myself.i_ai0 == 0) {
if (myself.IsNullCreature(myself.top_desire_target) == 0) {
if (gg.Rand(100) < 33 && myself.top_desire_target == attacker && myself.DistFromMe(attacker) < 100) {
if (myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

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
if (gg.Rand(100) < 33 && myself.DistFromMe(attacker) > 100) {
if (myself.i_ai0 == 0) {
if (myself.Skill_GetConsumeMP(PhysicalSpecial) < myself.sm.mp && myself.Skill_GetConsumeHP(PhysicalSpecial) < myself.sm.hp && myself.Skill_InReuseDelay(PhysicalSpecial) == 0) {
myself.AddUseSkillDesire(attacker, PhysicalSpecial, 0, 1, 1000000);

}

} else {
myself.UseSoulShot(20);

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 3000) {
if (gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(SelfBuff)) <= 0) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}

}
myself.AddTimerEx(3000, 1000 * 60 * 2);

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