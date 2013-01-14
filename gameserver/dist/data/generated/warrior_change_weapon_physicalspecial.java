package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warrior_change_weapon_physicalspecial extends warrior_physicalspecial {
	protected int EquipWeapon = 129;
	protected int SelfBuff = 263979009;

	protected void CREATED() {
myself.i_ai0 = 0;
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam i0) {
i0 = 50 + gg.Rand(20);
if (gg.FloatToInt(myself.sm.hp / myself.sm.max_hp * 100) < i0 && myself.i_ai0 == 0) {
myself.EquipItem(EquipWeapon);
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
myself.i_ai0 = 1;

}
if (myself.i_ai0 == 1) {
myself.UseSoulShot(SoulShot);

}
super;
	}


}