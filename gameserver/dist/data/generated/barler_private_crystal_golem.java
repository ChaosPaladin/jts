package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class barler_private_crystal_golem extends default_npc {
	protected int debuff = 458752001;
	protected int MagicHeal = 458752001;
	protected String AreaName_good_npc1 = "24_22_barler_004_01";
	protected String AreaName_good_npc2 = "24_22_barler_004_02";
	protected String AreaName_good_npc3 = "24_22_barler_004_05";
	protected String AreaName_good_npc4 = "24_22_barler_004_06";
	protected String AreaName_good_npc5 = "24_22_barler_004_07";
	protected String AreaName_good_npc6 = "24_22_barler_004_08";
	protected String AreaName_good_npc7 = "24_22_barler_004_09";
	protected String AreaName_good_npc8 = "24_22_barler_004_10";
	protected String AreaName_good_npc9 = "24_22_barler_004_12";
	protected String AreaName_good_npc10 = "24_22_barler_004_13";
	protected String AreaName_good_npc11 = "24_22_barler_004_14";
	protected String AreaName_good_npc12 = "24_22_barler_004_15";
	protected String AreaName_good_pc1 = "24_22_barler_004_03";
	protected String AreaName_good_pc2 = "24_22_barler_004_04";
	protected String AreaName_good_pc3 = "24_22_barler_004_11";

	protected void CREATED() {
myself.i_ai0 = myself.sm.param1;
myself.i_ai1 = myself.sm.param2;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.AddTimerEx(3001, 30000);
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam f0) {
if (script_event_arg1 == 13013) {
myself.AddTimerEx(2004, 4500);
if (myself.i_ai2 == 1) {
gg.Area_SetOnOffEx(AreaName_good_npc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOffEx(AreaName_good_npc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOffEx(AreaName_good_npc3, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 4) {
gg.Area_SetOnOffEx(AreaName_good_npc4, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 5) {
gg.Area_SetOnOffEx(AreaName_good_npc5, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 6) {
gg.Area_SetOnOffEx(AreaName_good_npc6, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 7) {
gg.Area_SetOnOffEx(AreaName_good_npc7, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 8) {
gg.Area_SetOnOffEx(AreaName_good_npc8, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 9) {
gg.Area_SetOnOffEx(AreaName_good_npc9, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 10) {
gg.Area_SetOnOffEx(AreaName_good_npc10, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 11) {
gg.Area_SetOnOffEx(AreaName_good_npc11, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 12) {
gg.Area_SetOnOffEx(AreaName_good_npc12, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 13) {
gg.Area_SetOnOffEx(AreaName_good_pc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 14) {
gg.Area_SetOnOffEx(AreaName_good_pc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 15) {
gg.Area_SetOnOffEx(AreaName_good_pc3, 0, myself.InstantZone_GetId());

}

}
if (script_event_arg1 == 13030) {
myself.i_ai0 = 0;
myself.Despawn();
if (myself.i_ai2 == 1) {
gg.Area_SetOnOffEx(AreaName_good_npc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOffEx(AreaName_good_npc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOffEx(AreaName_good_npc3, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 4) {
gg.Area_SetOnOffEx(AreaName_good_npc4, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 5) {
gg.Area_SetOnOffEx(AreaName_good_npc5, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 6) {
gg.Area_SetOnOffEx(AreaName_good_npc6, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 7) {
gg.Area_SetOnOffEx(AreaName_good_npc7, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 8) {
gg.Area_SetOnOffEx(AreaName_good_npc8, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 9) {
gg.Area_SetOnOffEx(AreaName_good_npc9, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 10) {
gg.Area_SetOnOffEx(AreaName_good_npc10, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 11) {
gg.Area_SetOnOffEx(AreaName_good_npc11, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 12) {
gg.Area_SetOnOffEx(AreaName_good_npc12, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 13) {
gg.Area_SetOnOffEx(AreaName_good_pc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 14) {
gg.Area_SetOnOffEx(AreaName_good_pc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 15) {
gg.Area_SetOnOffEx(AreaName_good_pc3, 0, myself.InstantZone_GetId());

}

}
	}

	protected void STATIC_OBJECT_CLAN_ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam i0) {
if (skill_name_id == 154796033) {
if (myself.DistFromMe(attacker) < 500) {
if (myself.i_ai0 == 1) {
myself.AddEffectActionDesire(myself.sm, 1, 10000, 10000);
myself.BroadcastScriptEvent(13013, 0, 5000);
myself.AddTimerEx(2005, 2000);
myself.AddTimerEx(2006, 5500);
if (myself.Skill_GetConsumeMP(354418689) < myself.sm.mp && myself.Skill_GetConsumeHP(354418689) < myself.sm.hp && myself.Skill_InReuseDelay(354418689) == 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(23134209)) <= 0 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(87556097)) <= 0) {
myself.AddUseSkillDesire(myself.sm, 354418689, 0, 1, 1000000);

}

} else {
i0 = gg.Rand(100);
if (i0 < 33) {
myself.Shout(gg.MakeFString(1800064, "", "", "", "", ""));

} else if (i0 < 66) {
myself.Shout(gg.MakeFString(1800065, "", "", "", "", ""));

} else {
myself.Shout(gg.MakeFString(1800066, "", "", "", "", ""));

}
myself.AddTimerEx(2001, 1000);

}
myself.BroadcastScriptEvent(13028, 0, 3000);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2001) {
if (myself.i_ai0 == 0) {
myself.AddMoveToDesire(153574, 142063, -12736, 1000000);

}

}
if (timer_id == 2002) {
myself.BroadcastScriptEvent(13029, 0, 3000);
if (myself.i_ai2 == 1) {
gg.Area_SetOnOffEx(AreaName_good_npc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOffEx(AreaName_good_npc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOffEx(AreaName_good_npc3, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 4) {
gg.Area_SetOnOffEx(AreaName_good_npc4, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 5) {
gg.Area_SetOnOffEx(AreaName_good_npc5, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 6) {
gg.Area_SetOnOffEx(AreaName_good_npc6, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 7) {
gg.Area_SetOnOffEx(AreaName_good_npc7, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 8) {
gg.Area_SetOnOffEx(AreaName_good_npc8, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 9) {
gg.Area_SetOnOffEx(AreaName_good_npc9, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 10) {
gg.Area_SetOnOffEx(AreaName_good_npc10, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 11) {
gg.Area_SetOnOffEx(AreaName_good_npc11, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 12) {
gg.Area_SetOnOffEx(AreaName_good_npc12, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 13) {
gg.Area_SetOnOffEx(AreaName_good_pc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 14) {
gg.Area_SetOnOffEx(AreaName_good_pc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 15) {
gg.Area_SetOnOffEx(AreaName_good_pc3, 0, myself.InstantZone_GetId());

}
myself.Despawn();

}
if (timer_id == 2003) {
if (myself.Skill_GetConsumeMP(275906570) < myself.sm.mp && myself.Skill_GetConsumeHP(275906570) < myself.sm.hp && myself.Skill_InReuseDelay(275906570) == 0) {
myself.AddUseSkillDesire(myself.boss, 275906570, 1, 1, 1000000);

}

}
if (timer_id == 2004) {
myself.Despawn();

}
if (timer_id == 2005) {
myself.CreateOnePrivateEx(1029110, "barler_clear_npc5", 0, 0, 153580, 142077, -12736, 0, 0, 0, 0);

}
if (timer_id == 2006) {
myself.SpecialCamera3(myself.sm, 0, 0, 0, 5000, 5000, 6000, 0, 0, 1, 0, 0);

}
if (timer_id == 2007) {
if (myself.Skill_GetConsumeMP(275906569) < myself.sm.mp && myself.Skill_GetConsumeHP(275906569) < myself.sm.hp && myself.Skill_InReuseDelay(275906569) == 0) {
myself.AddUseSkillDesire(myself.boss, 275906569, 1, 1, 1000000);

}

}
if (timer_id == 3001) {
if (myself.i_ai0 == 1) {
myself.AddTimerEx(3001, 5000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
if (skill_name_id == 275906570) {

}
	}

	protected void MOVE_TO_FINISHED(HandlerParam x, HandlerParam y, HandlerParam z, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9) {
myself.AddTimerEx(2002, 60 * 1000);
myself.AddTimerEx(2003, 5000);
myself.AddTimerEx(2007, 40 * 1000);
if (gg.Rand(100) <= 80) {
i0 = gg.Rand(100);
i1 = gg.Rand(2);
i2 = gg.Rand(2);
i4 = gg.Rand(2);
i5 = gg.Rand(2);
i6 = 0;
if (gg.Rand(100) < 80) {
i3 = 1;

} else {
i3 = 0;

}
if (i1 == 1) {
if (i6 == 0) {
i6 = 1;

}
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 153565, 141290, -12736, 0, 1, i6, 0);

}
if (i2 == 1) {
if (i6 == 0) {
i6 = 1;
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 154359, 142077, -12736, 0, 1, i6, 0);

} else {
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 154359, 142077, -12736, 0, 1, 0, 0);

}

}
if (i4 == 1) {
if (i6 == 0) {
i6 = 1;
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 153570, 142853, -12736, 0, 1, i6, 0);

} else {
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 153570, 142853, -12736, 0, 1, 0, 0);

}

}
if (i5 == 1) {
if (i6 == 0) {
i6 = 1;
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 152793, 142080, -12736, 0, 1, i6, 0);

} else {
myself.CreateOnePrivateEx(1032271, "ai_parme", 0, 0, 152793, 142080, -12736, 0, 1, 0, 0);

}

}
if (i0 <= 8) {
gg.Area_SetOnOffEx(AreaName_good_npc1, 1, myself.InstantZone_GetId());
myself.i_ai2 = 1;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc1, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc1, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc1, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc1, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc1, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 16) {
gg.Area_SetOnOffEx(AreaName_good_npc2, 1, myself.InstantZone_GetId());
myself.i_ai2 = 2;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc2, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc2, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc2, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc2, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc2, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 24) {
gg.Area_SetOnOffEx(AreaName_good_npc3, 1, myself.InstantZone_GetId());
myself.i_ai2 = 3;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc3, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc3, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc3, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc3, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc3, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 32) {
gg.Area_SetOnOffEx(AreaName_good_npc4, 1, myself.InstantZone_GetId());
myself.i_ai2 = 4;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc4, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc4, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc4, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc4, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc4, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 40) {
gg.Area_SetOnOffEx(AreaName_good_npc5, 1, myself.InstantZone_GetId());
myself.i_ai2 = 5;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc5, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc5, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc5, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc5, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc5, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 48) {
gg.Area_SetOnOffEx(AreaName_good_npc6, 1, myself.InstantZone_GetId());
myself.i_ai2 = 6;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc6, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc6, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc6, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc6, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc6, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 56) {
gg.Area_SetOnOffEx(AreaName_good_npc7, 1, myself.InstantZone_GetId());
myself.i_ai2 = 7;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc7, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc7, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc7, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc7, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc7, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 64) {
gg.Area_SetOnOffEx(AreaName_good_npc8, 1, myself.InstantZone_GetId());
myself.i_ai2 = 8;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc8, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc8, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc8, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc8, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc8, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 72) {
gg.Area_SetOnOffEx(AreaName_good_npc9, 1, myself.InstantZone_GetId());
myself.i_ai2 = 9;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc9, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc9, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc9, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc9, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc9, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 80) {
gg.Area_SetOnOffEx(AreaName_good_npc10, 1, myself.InstantZone_GetId());
myself.i_ai2 = 10;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc10, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc10, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc10, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc10, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc10, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 88) {
gg.Area_SetOnOffEx(AreaName_good_npc11, 1, myself.InstantZone_GetId());
myself.i_ai2 = 11;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc11, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc11, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc11, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc11, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc11, i5, 4, myself.InstantZone_GetId());

} else {
gg.Area_SetOnOffEx(AreaName_good_npc12, 1, myself.InstantZone_GetId());
myself.i_ai2 = 12;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc12, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc12, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc12, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc12, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_npc12, i5, 4, myself.InstantZone_GetId());

}

} else {
i1 = gg.Rand(2);
i2 = gg.Rand(2);
i4 = gg.Rand(2);
i5 = gg.Rand(2);
if (gg.Rand(100) < 80) {
i3 = 1;

} else {
i3 = 0;

}
if (i0 <= 33) {
gg.Area_SetOnOffEx(AreaName_good_pc1, 1, myself.InstantZone_GetId());
myself.i_ai2 = 13;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc1, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc1, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc1, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc1, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc1, i5, 4, myself.InstantZone_GetId());

} else if (i0 <= 66) {
gg.Area_SetOnOffEx(AreaName_good_pc2, 1, myself.InstantZone_GetId());
myself.i_ai2 = 14;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc2, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc2, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc2, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc2, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc2, i5, 4, myself.InstantZone_GetId());

} else {
gg.Area_SetOnOffEx(AreaName_good_pc3, 1, myself.InstantZone_GetId());
myself.i_ai2 = 15;
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc3, i1, 0, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc3, i2, 1, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc3, i3, 2, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc3, i4, 3, myself.InstantZone_GetId());
gg.Area_SetBannedTerritoryOnOff(AreaName_good_pc3, i5, 4, myself.InstantZone_GetId());

}

}
	}

	protected void MY_DYING() {
if (myself.i_ai2 == 1) {
gg.Area_SetOnOffEx(AreaName_good_npc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 2) {
gg.Area_SetOnOffEx(AreaName_good_npc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 3) {
gg.Area_SetOnOffEx(AreaName_good_npc3, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 4) {
gg.Area_SetOnOffEx(AreaName_good_npc4, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 5) {
gg.Area_SetOnOffEx(AreaName_good_npc5, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 6) {
gg.Area_SetOnOffEx(AreaName_good_npc6, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 7) {
gg.Area_SetOnOffEx(AreaName_good_npc7, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 8) {
gg.Area_SetOnOffEx(AreaName_good_npc8, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 9) {
gg.Area_SetOnOffEx(AreaName_good_npc9, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 10) {
gg.Area_SetOnOffEx(AreaName_good_npc10, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 11) {
gg.Area_SetOnOffEx(AreaName_good_npc11, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 12) {
gg.Area_SetOnOffEx(AreaName_good_npc12, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 13) {
gg.Area_SetOnOffEx(AreaName_good_pc1, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 14) {
gg.Area_SetOnOffEx(AreaName_good_pc2, 0, myself.InstantZone_GetId());

} else if (myself.i_ai2 == 15) {
gg.Area_SetOnOffEx(AreaName_good_pc3, 0, myself.InstantZone_GetId());

}
myself.BroadcastScriptEvent(13029, 0, 3000);
	}


}