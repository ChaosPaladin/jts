package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_silentbasin_warrior extends warrior_use_skill {
	protected int SkillStigma = 395378689;

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i0, HandlerParam i1) {
if (gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(SkillStigma)) > 0) {
myself.i_ai0 = 1;
myself.AddAttackDesire(creature, 1, 2000);

}
super;
	}

	protected void MY_DYING(HandlerParam creature) {
if (gg.Rand(1000) < 2) {
myself.CreateOnePrivateEx(1018695, "ai_silentbasin_trguard_b", 0, 0, gg.FloatToInt(myself.sm.x) + 100, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z) + 100, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z));
myself.CreateOnePrivateEx(1018694, "ai_silentbasin_trguard_a", 0, 0, gg.FloatToInt(myself.sm.x) - 100, gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z) + 100, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1018694, "ai_silentbasin_trguard_a", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) + 100, gg.FloatToInt(myself.sm.z) + 100, 0, 0, 0, 0);
myself.CreateOnePrivateEx(1018694, "ai_silentbasin_trguard_a", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y) - 100, gg.FloatToInt(myself.sm.z) + 100, 0, 0, 0, 0);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai0 == 1) {
myself.UseSoulShot(20);

}
if (attacker.summon_type == 1 || attacker.summon_type == 2) {
if (myself.DistFromMe(attacker.master) < 900) {
myself.AddAttackDesire(attacker.master, 1, 2000);

} else {
myself.TeleportTo(attacker, attacker.master);

}
return;

}
super;
	}


}