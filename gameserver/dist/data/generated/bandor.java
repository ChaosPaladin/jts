package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class bandor extends merchant {
protected Object[][] SellList0 = {
{"sb_adv_defence_power1";15;0.000000;0}, {"sb_advanced_attack_power1";15;0.000000;0}, {"sb_might1";15;0.000000;0}, {"sb_battle_heal1";15;0.000000;0}, {"sb_vampiric_touch1";15;0.000000;0}, {"sb_ice_bolt1";15;0.000000;0}, {"sb_heal1";15;0.000000;0}, {"sb_group_heal1";15;0.000000;0}, {"sb_shield1";15;0.000000;0}, {"sb_breeze1";15;0.000000;0}, {"sb_wind_walk1";15;0.000000;0}, {"sb_curse:weakness";15;0.000000;0}, {"sb_curse:poison1";15;0.000000;0}, {"sb_cure_poison1";15;0.000000;0}, {"sb_flame_strike1";15;0.000000;0}, {"sb_drain_energy1";15;0.000000;0}, {"sb_elemental_heal1";15;0.000000;0}, {"sb_disrupt_undead1";15;0.000000;0}, {"sb_resurrection1";15;0.000000;0}, {"sb_blaze1";15;0.000000;0}, {"sb_summon_shadow1";15;0.000000;0}, {"sb_summon_silhouette1";15;0.000000;0}, {"sb_summon_unicorn_boxer1";15;0.000000;0}, {"sb_summon_blackcat1";15;0.000000;0}, {"sb_servitor_heal1";15;0.000000;0}, {"sb_aqua_swirl1";15;0.000000;0}, {"sb_arcane_acumen1";15;0.000000;0}, {"sb_energy_bolt1";15;0.000000;0}, {"sb_aura_burn1";15;0.000000;0}, {"sb_charm11";15;0.000000;0}, {"sb_concentration1";15;0.000000;0}, {"sb_water_breathing";15;0.000000;0}, {"sb_twister1";15;0.000000;0}, {"sb_poison1";15;0.000000;0}, {"sb_poison_recovery1";15;0.000000;0}, {"sb_confusion1";15;0.000000;0}, {"sb_cure_bleeding1";15;0.000000;0}, {"sb_dryad_root1";15;0.000000;0}, {"sb_mental_shield1";15;0.000000;0}, {"sb_body_to_mind1";15;0.000000;0}, {"sb_shadow_spark1";15;0.000000;0}, {"sb_surrender_to_earth1";15;0.000000;0}, {"sb_surrender_to_fire1";15;0.000000;0}, {"sb_surrender_to_poison1";15;0.000000;0}, {"sb_summon_cuti_cat1";15;0.000000;0}, {"sb_summon_unicorn_mirage1";15;0.000000;0}, {"sb_servitor_mana_charge1";15;0.000000;0}, {"sb_solar_spark1";15;0.000000;0}, {"sb_agility1";15;0.000000;0}, {"sb_empower1";15;0.000000;0}, {"sb_poison_cloud1";15;0.000000;0}, {"sb_focus1";15;0.000000;0}, {"sb_holy_weapon1";15;0.000000;0}, {"sb_touch_of_god1";15;0.000000;0}, {"sb_fire_resist1";15;0.000000;0}, {"sb_recharge1";15;0.000000;0}, {"sb_vampiric_rage1";15;0.000000;0}, {"sb_sleep1";15;0.000000;0}, {"sb_corpse_life_drain1";15;0.000000;0}, {"sb_decrease_weight1";15;0.000000;0}, {"sb_auqa_resist1";15;0.000000;0}, {"sb_wind_resist1";15;0.000000;0}, {"sb_resist_poison1";15;0.000000;0}, {"sb_regeneration1";15;0.000000;0}, {"sb_mighty_servitor1";15;0.000000;0}, {"sb_berserker_spirit1";15;0.000000;0}, {"sb_bright_servitor1";15;0.000000;0}, {"sb_slow1";15;0.000000;0}, {"sb_curse_bleary1";15;0.000000;0}, {"sb_fast_servitor1";15;0.000000;0}, {"sb_erase_hostility1";15;0.000000;0}, {"sb_speed_walk1";15;0.000000;0}, {"sb_zero_g1";15;0.000000;0}, {"sb_power_break1";15;0.000000;0}, {"sb_freezing_strike1";15;0.000000;0}, {"sb_summon_friend";15;1.000000;5}, {"sb_summon_attract_cubic1";15;1.000000;10}, {"sb_aura_flash1";15;1.000000;10}, {"sb_summon_swoop_cannon1";15;1.000000;5}, {"sb_celestial_shield1";15;1.000000;10}, {"sb_invocation1";15;1.000000;10}
};
protected Object[][] SellList1 = {
{"dye_s1c3_d";15;0.000000;0}, {"dye_s1d3_d";15;0.000000;0}, {"dye_c1s3_d";15;0.000000;0}, {"dye_c1d3_d";15;0.000000;0}, {"dye_d1s3_d";15;0.000000;0}, {"dye_d1c3_d";15;0.000000;0}, {"dye_i1m3_d";15;0.000000;0}, {"dye_i1w3_d";15;0.000000;0}, {"dye_m1i3_d";15;0.000000;0}, {"dye_m1w3_d";15;0.000000;0}, {"dye_w1i3_d";15;0.000000;0}, {"dye_w1m3_d";15;0.000000;0}, {"dye_s1c2_d";15;0.000000;0}, {"dye_s1d2_d";15;0.000000;0}, {"dye_c1s2_d";15;0.000000;0}, {"dye_c1d2_d";15;0.000000;0}, {"dye_d1s2_d";15;0.000000;0}, {"dye_d1c2_d";15;0.000000;0}, {"dye_i1m2_d";15;0.000000;0}, {"dye_i1w2_d";15;0.000000;0}, {"dye_m1i2_d";15;0.000000;0}, {"dye_m1w2_d";15;0.000000;0}, {"dye_w1i2_d";15;0.000000;0}, {"dye_w1m2_d";15;0.000000;0}, {"dye_s1c3_c";15;0.000000;0}, {"dye_s1d3_c";15;0.000000;0}, {"dye_c1s3_c";15;0.000000;0}, {"dye_c1c3_c";15;0.000000;0}, {"dye_d1s3_c";15;0.000000;0}, {"dye_d1c3_c";15;0.000000;0}, {"dye_i1m3_c";15;0.000000;0}, {"dye_i1w3_c";15;0.000000;0}, {"dye_m1i3_c";15;0.000000;0}, {"dye_m1w3_c";15;0.000000;0}, {"dye_w1i3_c";15;0.000000;0}, {"dye_w1m3_c";15;0.000000;0}, {"dye_s1c2_c";15;0.000000;0}, {"dye_s1d2_c";15;0.000000;0}, {"dye_c1s2_c";15;0.000000;0}, {"dye_c1c2_c";15;0.000000;0}, {"dye_d1s2_c";15;0.000000;0}, {"dye_d1c2_c";15;0.000000;0}, {"dye_i1m2_c";15;0.000000;0}, {"dye_i1w2_c";15;0.000000;0}, {"dye_m1i2_c";15;0.000000;0}, {"dye_m1w2_c";15;0.000000;0}, {"dye_w1i2_c";15;0.000000;0}, {"dye_w1m2_c";15;0.000000;0}, {"dye_s2c4_c";15;0.000000;0}, {"dye_s2d4_c";15;0.000000;0}, {"dye_c2s4_c";15;0.000000;0}, {"dye_c2c4_c";15;0.000000;0}, {"dye_d2s4_c";15;0.000000;0}, {"dye_d2c4_c";15;0.000000;0}, {"dye_i2m4_c";15;0.000000;0}, {"dye_i2w4_c";15;0.000000;0}, {"dye_m2i4_c";15;0.000000;0}, {"dye_m2w4_c";15;0.000000;0}, {"dye_w2i4_c";15;0.000000;0}, {"dye_w2m4_c";15;0.000000;0}, {"dye_s2c3_c";15;0.000000;0}, {"dye_s2d3_c";15;0.000000;0}, {"dye_c2s3_c";15;0.000000;0}, {"dye_c2c3_c";15;0.000000;0}, {"dye_d2s3_c";15;0.000000;0}, {"dye_d2c3_c";15;0.000000;0}, {"dye_i2m3_c";15;0.000000;0}, {"dye_i2w3_c";15;0.000000;0}, {"dye_m2i3_c";15;0.000000;0}, {"dye_m2w3_c";15;0.000000;0}, {"dye_w2i3_c";15;0.000000;0}, {"dye_w2m3_c";15;0.000000;0}, {"dye_s3c5_c";15;0.000000;0}, {"dye_s3d5_c";15;0.000000;0}, {"dye_c3s5_c";15;0.000000;0}, {"dye_c3c5_c";15;0.000000;0}, {"dye_d3s5_c";15;0.000000;0}, {"dye_d3c5_c";15;0.000000;0}, {"dye_i3m5_c";15;0.000000;0}, {"dye_i3w5_c";15;0.000000;0}, {"dye_m3i5_c";15;0.000000;0}, {"dye_m3w5_c";15;0.000000;0}, {"dye_w3i5_c";15;0.000000;0}, {"dye_w3m5_c";15;0.000000;0}, {"dye_s3c4_c";15;0.000000;0}, {"dye_s3d4_c";15;0.000000;0}, {"dye_c3s4_c";15;0.000000;0}, {"dye_c3c4_c";15;0.000000;0}, {"dye_d3s4_c";15;0.000000;0}, {"dye_d3c4_c";15;0.000000;0}, {"dye_i3m4_c";15;0.000000;0}, {"dye_i3w4_c";15;0.000000;0}, {"dye_m3i4_c";15;0.000000;0}, {"dye_m3w4_c";15;0.000000;0}, {"dye_w3i4_c";15;0.000000;0}, {"dye_w3m4_c";15;0.000000;0}, {"dye_s4c6_c";15;0.000000;0}, {"dye_s4d6_c";15;0.000000;0}, {"dye_c4s6_c";15;0.000000;0}, {"dye_c4c6_c";15;0.000000;0}, {"dye_d4s6_c";15;0.000000;0}, {"dye_d4c6_c";15;0.000000;0}, {"dye_i4m6_c";15;0.000000;0}, {"dye_i4w6_c";15;0.000000;0}, {"dye_m4i6_c";15;0.000000;0}, {"dye_m4w6_c";15;0.000000;0}, {"dye_w4i6_c";15;0.000000;0}, {"dye_w4m6_c";15;0.000000;0}, {"dye_s4c5_c";15;0.000000;0}, {"dye_s4d5_c";15;0.000000;0}, {"dye_c4s5_c";15;0.000000;0}, {"dye_c4c5_c";15;0.000000;0}, {"dye_d4s5_c";15;0.000000;0}, {"dye_d4c5_c";15;0.000000;0}, {"dye_i4m5_c";15;0.000000;0}, {"dye_i4w5_c";15;0.000000;0}, {"dye_m4i5_c";15;0.000000;0}, {"dye_m4w5_c";15;0.000000;0}, {"dye_w4i5_c";15;0.000000;0}, {"dye_w4m5_c";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 373) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Supplier of Reagents");

}
if (gg.HaveMemo(talker, 373) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Supplier of Reagents (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 373) == 0) {
myself.SetCurrentQuestID(373);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 57) {
myself.ShowPage(talker, "bandor_q0373_01.htm");

} else if (talker.level >= 57) {
myself.ShowQuestPage(talker, "bandor_q0373_02.htm", 373);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 373) == 1) {
myself.SetCurrentQuestID(373);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "bandor_q0373_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 373) {
myself.SetCurrentQuestID(373);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
if (talker.level >= 57 && gg.HaveMemo(talker, 373) == 0) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 5904, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
gg.AddLog(1, talker, 373);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "bandor_q0373_04.htm", 373);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 373) {
myself.SetCurrentQuestID(373);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 373) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "bandor_q0373_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 373);
myself.ShowQuestFHTML(talker, fhtml0, 373);

}
if (reply == 2) {
myself.ShowPage(talker, "bandor_q0373_06.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "bandor_q0373_07.htm");

}
if (reply == 4) {
myself.ShowPage(talker, "bandor_q0373_08.htm");

}
if (reply == 5) {
myself.DeleteItem1(talker, 5904, gg.OwnItemCount(talker, 5904));
myself.DeleteItem1(talker, 6317, gg.OwnItemCount(talker, 6317));
myself.RemoveMemo(talker, 373);
gg.AddLog(2, talker, 373);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "bandor_q0373_09.htm");

}
if (reply == 11) {
if (gg.OwnItemCount(talker, 6021) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 735, 1);
myself.DeleteItem1(talker, 6021, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_10.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 12) {
if (gg.OwnItemCount(talker, 6022) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 737, 2);
myself.DeleteItem1(talker, 6022, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_11.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 13) {
if (gg.OwnItemCount(talker, 6023) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2508, 25);
myself.DeleteItem1(talker, 6023, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_12.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 14) {
if (gg.OwnItemCount(talker, 6024) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 32) {
myself.GiveItem1(talker, 4042, 1);

} else if (i0 < 66) {
myself.GiveItem1(talker, 4043, 1);

} else {
myself.GiveItem1(talker, 4044, 1);

}
myself.GiveItem1(talker, 57, 500);
myself.DeleteItem1(talker, 6024, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_13.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 15) {
if (gg.OwnItemCount(talker, 6025) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 28) {
myself.GiveItem1(talker, 735, 20);

} else if (i0 < 68) {
myself.GiveItem1(talker, 4953, 1);

} else {
myself.GiveItem1(talker, 4959, 1);

}
myself.DeleteItem1(talker, 6025, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_14.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 16) {
if (gg.OwnItemCount(talker, 6026) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 40) {
myself.GiveItem1(talker, 2508, 200);

} else if (i0 < 70) {
myself.GiveItem1(talker, 4960, 1);

} else {
myself.GiveItem1(talker, 4958, 1);

}
myself.DeleteItem1(talker, 6026, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_15.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 17) {
if (gg.OwnItemCount(talker, 6027) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 40) {
myself.GiveItem1(talker, 4998, 1);

} else if (i0 < 80) {
myself.GiveItem1(talker, 4992, 1);

} else {
myself.GiveItem1(talker, 737, 20);

}
myself.DeleteItem1(talker, 6027, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_16.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 18) {
if (gg.OwnItemCount(talker, 6028) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 90) {
myself.GiveItem1(talker, 4993, 1);
myself.GiveItem1(talker, 4999, 1);

} else {
myself.GiveItem1(talker, 4042, 2);

}
myself.DeleteItem1(talker, 6028, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_17.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 19) {
if (gg.OwnItemCount(talker, 6029) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(talker, 5478, 2);

} else if (i0 < 40) {
myself.GiveItem1(talker, 5479, 2);

} else if (i0 < 60) {
myself.GiveItem1(talker, 5480, 2);

} else if (i0 < 80) {
myself.GiveItem1(talker, 5481, 2);

} else {
myself.GiveItem1(talker, 5482, 2);

}
myself.GiveItem1(talker, 57, 8000);
myself.DeleteItem1(talker, 6029, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_18.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 20) {
if (gg.OwnItemCount(talker, 6030) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 20) {
myself.GiveItem1(talker, 5520, 3);

} else if (i0 < 40) {
myself.GiveItem1(talker, 5521, 3);

} else if (i0 < 60) {
myself.GiveItem1(talker, 5522, 3);

} else if (i0 < 80) {
myself.GiveItem1(talker, 5523, 3);

} else {
myself.GiveItem1(talker, 5524, 3);

}
myself.GiveItem1(talker, 57, 8000);
myself.DeleteItem1(talker, 6030, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_19.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 21) {
if (gg.OwnItemCount(talker, 6031) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 40) {
myself.GiveItem1(talker, 57, 320000);

} else if (i0 < 80) {
myself.GiveItem1(talker, 57, 245000);

} else {
myself.GiveItem1(talker, 57, 160000);

}
myself.DeleteItem1(talker, 6031, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_20.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 22) {
if (gg.OwnItemCount(talker, 6032) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 30) {
myself.GiveItem1(talker, 103, 1);

} else if (i0 < 60) {
myself.GiveItem1(talker, 2437, 1);

} else {
myself.GiveItem1(talker, 630, 1);

}
myself.GiveItem1(talker, 57, 5000);
myself.DeleteItem1(talker, 6032, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_21.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 23) {
if (gg.OwnItemCount(talker, 6033) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 25) {
myself.GiveItem1(talker, 612, 1);

} else if (i0 < 50) {
myself.GiveItem1(talker, 2464, 1);

} else if (i0 < 75) {
myself.GiveItem1(talker, 554, 1);

} else {
myself.GiveItem1(talker, 600, 1);

}
myself.DeleteItem1(talker, 6033, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_22.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}
if (reply == 24) {
if (gg.OwnItemCount(talker, 6034) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.Rand(100);
if (i0 < 17) {
myself.GiveItem1(talker, 2439, 1);

} else if (i0 < 34) {
myself.GiveItem1(talker, 601, 1);

} else if (i0 < 51) {
myself.GiveItem1(talker, 2487, 1);

} else if (i0 < 68) {
myself.GiveItem1(talker, 2475, 1);

} else {
myself.GiveItem1(talker, 4992, 1);
myself.GiveItem1(talker, 4998, 1);

}
myself.GiveItem1(talker, 57, 19000);
myself.DeleteItem1(talker, 6034, 1);
gg.AddLog(3, talker, 373);
myself.ShowPage(talker, "bandor_q0373_23.htm");

}

} else {
myself.ShowPage(talker, "bandor_q0373_24.htm");

}

}

}
super;
	}


}