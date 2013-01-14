package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_agit03_lidia extends default_npc {
	protected int SelfRangeDDMagic = 458752001;
	protected int DDMagic = 458752001;
	protected int SelfBuff = 458752001;
	protected String AreaName1 = "ai_agit03_lidia_area_1";
	protected String AreaName2 = "ai_agit03_lidia_area_2";
	protected String AreaName3 = "ai_agit03_lidia_area_3";

	protected void NO_DESIRE() {
myself.AddDoNothingDesire(5, 5);
	}

	protected void CREATED() {
myself.Shout(gg.MakeFString(1010624, "", "", "", "", ""));
myself.CreateOnePrivateEx(1035631, "ai_agit03_giselle", 10, 5, 56619, -27866, 569, 54000, 0, 0, 0);
myself.CreateOnePrivateEx(1035630, "ai_agit03_alfred", 10, 5, 59282, -26496, 569, 48000, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 57905, -27648, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 57905, -27712, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27182, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27232, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27282, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27332, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27382, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27432, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27482, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27532, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27582, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27632, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27682, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27732, 608, 33540, 0, 0, 0);
myself.CreateOnePrivateEx(1035647, "ai_agit02_vampire_agit_party", 10, 5, 58233, -27782, 608, 33540, 0, 0, 0);
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
myself.AddTimerEx(1001, 30000);
myself.i_ai1 = 0;
gg.Area_SetOnOff(AreaName1, 1);
gg.Area_SetOnOff(AreaName2, 1);
gg.Area_SetOnOff(AreaName3, 1);
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (myself.InMyTerritory(myself.sm)) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 1000);

}

}
if (gg.Rand(Rand * 30) < 1) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic, 0, 1, 1000000);

}

} else if (myself.sm.hp < myself.sm.max_hp * 0.200000 && gg.Rand(Rand * 30) < 1) {
if (myself.Skill_GetConsumeMP(SelfRangeDDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfRangeDDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(SelfRangeDDMagic) == 0) {
myself.AddUseSkillDesire(attacker, SelfRangeDDMagic, 0, 1, 1000000);

}

}
if (myself.DistFromMe(attacker) > 300 && gg.Rand(Rand * 30) < 1) {
if (myself.Skill_GetConsumeMP(DDMagic) < myself.sm.mp && myself.Skill_GetConsumeHP(DDMagic) < myself.sm.hp && myself.Skill_InReuseDelay(DDMagic) == 0) {
myself.AddUseSkillDesire(attacker, DDMagic, 0, 1, 1000000);

}

}
if (myself.InMyTerritory(myself.sm) == 0) {
myself.RemoveAllAttackDesire();
myself.InstantTeleport(myself.sm, myself.start_x, myself.start_y, myself.start_z);
myself.AddMoveToDesire(myself.start_x, myself.start_y, myself.start_z, 1000000);

}
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage) {
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
myself.AddAttackDesire(attacker, 1, damage / myself.sm.max_hp / 0.050000 * 1000);

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private.class_id == 1035631) {
myself.i_ai1 = myself.i_ai1 + 1;

}
if (private.class_id == 1035630) {
myself.i_ai1 = myself.i_ai1 + 1;

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
if (myself.Skill_GetConsumeMP(SelfBuff) < myself.sm.mp && myself.Skill_GetConsumeHP(SelfBuff) < myself.sm.hp && myself.Skill_InReuseDelay(SelfBuff) == 0) {
myself.AddUseSkillDesire(myself.sm, SelfBuff, 1, 1, 1000000);

}
if (myself.i_ai1 < 2) {
myself.AddTimerEx(1001, 30000);

}

}
	}

	protected void MY_DYING() {
myself.Shout(gg.MakeFString(1010638, "", "", "", "", ""));
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
gg.Area_SetOnOff(AreaName3, 0);
	}


}