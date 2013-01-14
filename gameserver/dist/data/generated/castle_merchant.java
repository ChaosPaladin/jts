package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class castle_merchant extends citizen {
	protected String fnHi = "castle_merchant001.htm";
	protected String fnMyLord = "castle_merchant002.htm";
	protected String fnSellCrop = "castle_merchant003.htm";
	protected String fnAfterSellCrop = "castle_merchant004.htm";
	protected String fnHaveNoCrop = "castle_merchant005.htm";
	protected String ShopName = "";
	protected int manor_id = 1;

protected Object[][] SellList0 = {
{"reaping_machine";0;0.000000;0}
};
protected Object[][] BuyList0 = {
{"adena";0}, {"q_cybellins_dagger";0}, {"apprentice's_wand";0}, {"apprentice's_tunic";0}, {"apprentice's_hose";0}, {"dagger";0}, {"squire's_shirt";0}, {"squire's_pants";0}, {"training_gloves";0}, {"squire's_sword";0}, {"union_member's_club";0}, {"gallins_oak_wand";0}, {"rusted_bronze_sword3";0}, {"netis_bow";0}, {"netis_dagger";0}, {"guards_bow";0}, {"talins_spear";0}, {"old_knight_sword";0}, {"crescent_moon_bow";0}, {"sword_of_binding";0}, {"q_cybellins_dagger";0}, {"rp_titan_key";0}, {"rp_journeyman_ring";0}, {"rp_amber_bead";0}, {"q_rp_titans_powerstone";0}, {"q_herb_of_breka";0}, {"q_herb_of_vanor";0}, {"q_herb_of_oel_mahum";0}, {"q_blood_of_eva";0}, {"q_athreas_coin";0}, {"q_symbol_of_loyalty";0}, {"q_mist_drake_egg";0}, {"q_blitz_wyrm_egg";0}, {"q_drake_egg";0}, {"q_thunderwyrm_egg";0}, {"q_nebulite_crystals";0}, {"q_titan_powerstone";0}, {"q_imperial_key";0}, {"wolf_collar";0}, {"dragonflute_of_wind";0}, {"dragonflute_of_star";0}, {"dragonflute_of_twilight";0}, {"dragon_bugle_wind";0}, {"dragon_bugle_star";0}, {"dragon_bugle_dusk";0}, {"manacles_of_redemption";0}, {"adena_of_ancient";0}, {"party_mask_01";0}, {"the_infinity_blade";0}, {"the_infinity_cleaver";0}, {"the_infinity_axe";0}, {"the_infinity_rod";0}, {"the_infinity_crusher";0}, {"the_infinity_scepter";0}, {"the_infinity_stinger";0}, {"the_infinity_fangs";0}, {"the_infinity_bow";0}, {"the_infinity_wings";0}, {"the_infinity_spear";0}, {"crown_of_lord";0}, {"wings_of_destiny_circlet";0}, {"l2_fair_2005_coin";0}, {"q_escape_scroll_talking";0}, {"q_escape_scroll_elf";0}, {"q_escape_scroll_darkelf";0}, {"q_escape_scroll_orc";0}, {"q_escape_scroll_dwarf";0}, {"q_escape_scroll_giran";0}, {"guide_apprentice's_staff";0}, {"guide_bone_club";0}, {"guide_shining_knife";0}, {"guide_cestus";0}, {"guide_bow_of_forest";0}, {"guide_long_sword";0}, {"guide_mace_of_prayer";0}, {"guide_dark_elven_bow";0}, {"guide_long_bow";0}, {"guide_staff_of_mana";0}, {"guide_bastard_sword";0}, {"guide_divine_tome";0}, {"guide_single-edged_jamadhr";0}, {"guide_tomahawk";0}, {"guide_poniard_dagger";0}, {"guide_pike";0}, {"q_adventure_coupon1";0}, {"q_adventure_coupon2";0}, {"uq_sword_zariche";0}, {"nobless_gate_pass";0}, {"baby_buffalo_panpipe";0}, {"baby_cougar_chime";0}, {"baby_kukaburo_ocarina";0}, {"uq_dual_aka_manaf";0}, {"infinity_rapier";0}, {"infinity_sword";0}, {"infinity_shooter";0}, {"lbracelet_agit1";0}, {"lbracelet_agit2";0}, {"lbracelet_castle_gludio";0}, {"lbracelet_castle_dion";0}, {"lbracelet_castle_giran";0}, {"lbracelet_castle_oren";0}, {"lbracelet_castle_aden";0}, {"lbracelet_castle_innadrille";0}, {"lbracelet_castle_godad";0}, {"lbracelet_castle_rune";0}, {"lbracelet_castle_schuttgart";0}, {"fort_flag";0}, {"helmet_of_oath";0}, {"armor_of_oath";0}, {"gauntlet_of_oath";0}, {"boots_of_oath";0}, {"dress_of_oath";0}, {"leather_gloves_of_oath";0}, {"shoes_of_oath";0}, {"coat_of_oath";0}, {"silk_gloves_of_oath";0}, {"sandals_of_oath";0}, {"chevelier_rapier_bytime";0}, {"ritter_schleager_bytime";0}, {"ballista_bytime";0}, {"blink_slasher_bytime";0}, {"invincible_blade_bytime";0}, {"taslam_bytime";0}, {"assult_fleuret_bytime";0}, {"nameless_victory_bytime";0}, {"peace_maker_bytime";0}, {"high_wolf_collar";0}, {"talisman_test1";0}, {"red_talisman_might";0}, {"red_talisman_wild_magic";0}, {"red_talisman_berserker_spirit";0}, {"red_talisman_clarity";0}, {"red_talisman_clarity_special";0}, {"blue_talisman_damage_shield";0}, {"blue_talisman_silent_move";0}, {"blue_talisman_shield_defence_up";0}, {"blue_talisman_cure_bleeding";0}, {"blue_talisman_cure_hold";0}, {"blue_talisman_heal_empower";0}, {"blue_talisman_heal";0}, {"blue_talisman_shield";0}, {"blue_talisman_magic_barrier";0}, {"blue_talisman_mp_regen_up";0}, {"blue_talisman_shield_rate_up";0}, {"blue_talisman_silent_move";0}, {"blue_talisman_mp_relax";0}, {"blue_talisman_celestial_shield";0}, {"yellow_talisman_pa_up";0}, {"yellow_talisman_attack_speed_up";0}, {"yellow_talisman_md_up";0}, {"yellow_talisman_ma_up";0}, {"yellow_talisman_magic_speed_up";0}, {"yellow_talisman_hit_up";0}, {"yellow_talisman_pd_up";0}, {"yellow_talisman_all_speed_up";0}, {"yellow_talisman_speed_up";0}, {"yellow_talisman_critical_damage_down";0}, {"yellow_talisman_critical_damage_up";0}, {"yellow_talisman_critical_rate_down";0}, {"yellow_talisman_avoid_up";0}, {"yellow_talisman_heal_up";0}, {"yellow_talisman_cp_regen_up";0}, {"yellow_talisman_hp_regen_up";0}, {"yellow_talisman_mp_regen_up";0}, {"gray_talisman_weight_up";0}, {"gray_talisman_fishing";0}, {"orange_talisman_create_healing_potion";0}, {"orange_talisman_create_elixir_of_mental_c";0}, {"orange_talisman_create_elixir_of_mental_b";0}, {"black_talisman_cure_m_silence";0}, {"black_talisman_cure_m_hold";0}, {"black_talisman_cure_p_hold";0}, {"black_talisman_cure_p_silence";0}, {"black_talisman_cure_silence";0}, {"white_talisman_derangement_resist_up";0}, {"white_talisman_paralyze_resist_up";0}, {"white_talisman_shock_resist_up";0}, {"white_talisman_sleep_resist_up";0}, {"white_talisman_bleed_resist_up";0}, {"white_talisman_cancel_resist_up";0}, {"white_talisman_hold_resist_up";0}, {"fleuret_bytime_q";0}, {"assult_tulwar_bytime_q";0}, {"hand_bowgun_bytime_q";0}, {"blink_slasher_bytime_q";0}, {"invincible_blade_bytime_q";0}, {"taslam_bytime_q";0}, {"gray_talisman_transform_yeti";0}, {"gray_talisman_transform_buffalo";0}, {"blue_talisman_avoid";0}, {"loaf_sugar";0}, {"sb_subclass_beginner";0}, {"sb_subclass_warrior";0}, {"sb_subclass_knight";0}, {"sb_subclass_rogue";0}, {"sb_subclass_wizard";0}, {"sb_subclass_healer";0}, {"sb_subclass_summoner";0}, {"sb_subclass_enchanter";0}, {"sb_transform_knight";0}, {"sb_transform_warrior";0}, {"sb_transform_rogue";0}, {"sb_transform_healer";0}, {"sb_transform_wizard";0}, {"sb_transform_enchanter";0}, {"sb_transform_summoner";0}, {"sb_transform_zaken";0}, {"sb_transform_anakim";0}, {"sb_transform_venom";0}, {"sb_transform_gordon";0}, {"sb_transform_lancoo";0}, {"sb_transform_keyache";0}, {"sb_transform_duke_devil";0}, {"sb_transform_heretic";0}, {"sb_transform_vale_master";0}, {"sb_transform_saber_toothed_tiger";0}, {"sb_transform_oel_mahum";0}, {"sb_transform_doll_blader";0}, {"high_wolf_collar_white";0}, {"dragon_bugle_wind_red";0}, {"dragon_bugle_star_red";0}, {"dragon_bugle_dusk_red";0}, {"viking_circlet_violet_bytime";0}, {"viking_circlet_gold_bytime";0}, {"red_talisman_detonation";0}, {"red_talisman_m_detonation";0}, {"white_talisman_storm";0}, {"white_talisman_darkness";0}, {"white_talisman_water";0}, {"white_talisman_fire";0}, {"white_talisman_light";0}, {"blue_talisman_explosion";0}, {"blue_talisman_great_healing";0}, {"lesser_red_talisman_might";0}, {"lesser_blue_talisman_shield_defence_up";0}, {"lesser_yellow_talisman_pd_up";0}, {"lesser_yellow_talisman_ma_up";0}, {"lesser_yellow_talisman_avoid_up";0}, {"lesser_yellow_talisman_heal_up";0}, {"lesser_yellow_talisman_cp_regen_up";0}, {"lesser_yellow_talisman_hp_regen_up";0}, {"lesser_yellow_talisman_mp_regen_up";0}, {"lesser_blue_talisman_heal";0}, {"lesser_yellow_talisman_speed_up";0}, {"gray_talisman_fishing_24";0}, {"blue_talisman_vatality";0}, {"white_talisman_earth";0}, {"q_caradines_letter1";0}, {"q_caradines_letter2";0}, {"bind_small_gourd_seed";0}, {"bind_big_gourd_seed";0}, {"circlet_of_innadril";0}, {"circlet_of_dion";0}, {"circlet_of_godard";0}, {"circlet_of_oren";0}, {"circlet_of_gludio";0}, {"circlet_of_giran";0}, {"circlet_of_aden";0}, {"circlet_of_rune";0}, {"circlet_of_shuttgart";0}, {"blank_soul_bottle_5";0}, {"lbracelet_1";0}, {"lbracelet_fort_1";0}, {"lbracelet_2";0}, {"bracelet_agathion_angel_1";0}, {"bracelet_agathion_angel_2";0}, {"bracelet_agathion_angel_3";0}, {"bracelet_agathion_angel_4";0}, {"bracelet_agathion_angel";0}, {"bracelet_agathion_devil_1";0}, {"bracelet_agathion_devil_2";0}, {"bracelet_agathion_devil_3";0}, {"bracelet_agathion_devil_4";0}, {"bracelet_agathion_devil";0}, {"cube_event";0}, {"circlet_of_academy";0}, {"escape_scroll_talking";0}, {"escape_scroll_elf";0}, {"escape_scroll_darkelf";0}, {"escape_scroll_orc";0}, {"escape_scroll_dwarf";0}, {"escape_scroll_gludin";0}, {"escape_scroll_gludio";0}, {"escape_scroll_dion";0}, {"escape_scroll_floran";0}, {"escape_scroll_giran";0}, {"escape_scroll_hardin";0}, {"escape_scroll_heiness";0}, {"escape_scroll_oren";0}, {"escape_scroll_ivorytower";0}, {"escape_scroll_hunter";0}, {"escape_scroll_aden";0}, {"escape_scroll_godard";0}, {"escape_scroll_rune";0}, {"escape_scroll_schtgart";0}, {"escape_scroll_ketra";0}, {"escape_scroll_barka";0}, {"escape_scroll_soul_island";0}, {"q_energy_ore_q0269";0}, {"q_red_patch_q0060";0}, {"q_antidote_of_hel";0}, {"q_decayed_liq_of_kasha_spider";0}, {"piece_of_emery";0}, {"upgrade_buffalo_panpipe";0}, {"upgrade_cougar_chime";0}, {"upgrade_kukaburo_ocarina";0}, {"high_wolf_collar_ride";0}, {"high_wolf_collar_ride_white";0}, {"pi_ferret_pet_collar";0}, {"pi_fairy_princess_pet_collar";0}, {"pi_beast_fighter_pet_collar";0}, {"pi_foxian_wizard_pet_collar";0}, {"pi_toy_knight_necklace";0}, {"pi_spirit_maget_necklace";0}, {"pi_owl_maget_necklace";0}, {"pi_turtle_mastert_necklace";0}, {"olympiad_token";0}, {"event_chicken_cap2";0}, {"event_black_feather_mask2";0}, {"event_carnival_circlet2";0}, {"event_middle_age_party_mask2";0}, {"bytime_chicken_cap2_escape";0}, {"bytime_chicken_cap2_bighead";0}, {"bytime_chicken_cap2_bomb";0}, {"bytime_black_feather_mask2_escape";0}, {"bytime_black_feather_mask2_bighead";0}, {"bytime_black_feather_mask2_bomb";0}, {"bytime_carnival_circlet2_escape";0}, {"bytime_carnival_circlet2_bighead";0}, {"bytime_carnival_circlet2_bomb";0}, {"bytime_middle_age_party_mask2_escape";0}, {"bytime_middle_age_party_mask2_bighead";0}, {"bytime_middle_age_party_mask2_bomb";0}, {"event_whiteday_candybsk_1";0}, {"event_whiteday_candybsk_2";0}, {"event_whiteday_solo_pack";0}, {"event_whiteday_candy";0}, {"event_whiteday_candle";0}, {"cat_the_cat_cap_14days";0}, {"flower_coronet_whiteday_event";0}, {"wedding_dress_14days";0}, {"event_whiteday_pig_candy";0}, {"event_bracelet_aga_love";0}, {"event_bracelet_aga_chu";0}
};

	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, fnMyLord);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam state, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (ask == -231) {
if (reply == 1) {
myself.ShowSellSeedList(talker, manor_id);

} else if (reply == 2) {
myself.ShowProcureCropList(talker, manor_id);

} else if (reply == 3) {
myself.FHTML_SetFileName(fhtml0, "seed_client_info" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentSeedCount" + i2, myself.GetCurrentSeedSellCountSet(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedPrice" + i2, myself.GetCurrentSeedPrice(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedRemain" + i2, myself.GetCurrentSeedRemainCount(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 7) {
myself.FHTML_SetFileName(fhtml0, "seed_client_info_improve" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentSeedCount" + i2, myself.GetCurrentSeedSellCountSet(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedPrice" + i2, myself.GetCurrentSeedPrice(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedRemain" + i2, myself.GetCurrentSeedRemainCount(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 4) {
myself.FHTML_SetFileName(fhtml0, "crop_client_info" + manor_id + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(manor_id, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(manor_id, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(manor_id, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(manor_id, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 5) {
myself.ShowBuySell(talker, SellList0, BuyList0, -50);

} else if (reply == 6) {
myself.FHTML_SetFileName(fhtml0, "crop_client_info" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 8) {
myself.FHTML_SetFileName(fhtml0, "imcrop_client_info" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(state, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 9) {
myself.FHTML_SetFileName(fhtml0, "next_crop_client_info" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextProcureCount" + i2, myself.GetNextProcurementCount(state, i2));
myself.FHTML_SetInt(fhtml0, "NextProcurePrice" + i2, myself.GetNextProcurementRate(state, i2));
myself.FHTML_SetInt(fhtml0, "NextProcureType" + i2, myself.GetNextProcurementType(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 10) {
myself.FHTML_SetFileName(fhtml0, "next_imcrop_client_info" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextProcureCount" + i2, myself.GetNextProcurementCount(state, i2));
myself.FHTML_SetInt(fhtml0, "NextProcurePrice" + i2, myself.GetNextProcurementRate(state, i2));
myself.FHTML_SetInt(fhtml0, "NextProcureType" + i2, myself.GetNextProcurementType(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 11) {
if (myself.IsManorSettingTime() == 1) {
myself.FHTML_SetFileName(fhtml0, "manor_timeinfo_client.htm");

} else if (myself.IsManorSettingTime() == 0) {
myself.FHTML_SetFileName(fhtml0, "manor_crop_client_info_next.htm");

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 12) {
myself.FHTML_SetFileName(fhtml0, "next_seed_client_info" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(state, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 13) {
myself.FHTML_SetFileName(fhtml0, "next_seed_client_info_improve" + state + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(state, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(state, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (reply == 14) {
if (myself.IsManorSettingTime() == 1) {
myself.FHTML_SetFileName(fhtml0, "manor_timeinfo_client.htm");

} else if (myself.IsManorSettingTime() == 0) {
myself.FHTML_SetFileName(fhtml0, "manor_seed_client_info_next.htm");

}
myself.ShowFHTML(talker, fhtml0);

}

}
super;
	}

	protected void MANOR_MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam state, HandlerParam time) {
if (ask == 1) {
myself.ShowSellSeedList(talker, manor_id);

} else if (ask == 2) {
myself.ShowProcureCropList(talker, manor_id);

} else if (ask == 3) {
if (state == -1) {
myself.ShowSeedInfo(talker, manor_id, time);

} else {
myself.ShowSeedInfo(talker, state, time);

}

} else if (ask == 4) {
if (state == -1) {
myself.ShowCropInfo(talker, manor_id, time);

} else {
myself.ShowCropInfo(talker, state, time);

}

} else if (ask == 5) {
myself.ShowManorDefaultInfo(talker);

} else if (ask == 6) {
myself.ShowBuySell(talker, SellList0, BuyList0, -50);

} else if (ask == 9) {
myself.ShowProcureCropDetail(talker, state);

}
	}


}