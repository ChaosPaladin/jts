package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit03_giselle extends default_npc {
	protected int DDMagic = 458752001;
	protected int SelfRangeBuff_a = 458752001;
	protected String AreaName1 = "ai_agit03_giselle_area_1";
	protected String AreaName2 = "ai_agit03_giselle_area_2";

	protected void CREATED() {
myself.Shout(gg.MakeFString(1010637, "", "", "", "", ""));
myself.AddTimerEx(1003, 1000);
super;
	}

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1003) {
if (myself.Skill_GetConsumeMP(SelfRangeBuff_a) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeBuff_a) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeBuff_a) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfRangeBuff_a, 1, 1, 1000000);

}
myself.AddTimerEx(1003, 300000);

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam private, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 1000);

}
if (myself.DistFromMe(attacker) > 300 && gg.Rand(Rand * 30) < 1) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
	}

	protected void MY_DYING() {
myself.Shout(gg.MakeFString(1010625, "", "", "", "", ""));
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
	}


}