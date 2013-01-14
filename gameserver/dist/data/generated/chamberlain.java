package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chamberlain extends citizen {
	protected String fnHi = "chamberlain_saius001.htm";
	protected String fnViewReport = "chamberlain_saius002.htm";
	protected String fnViewTaxRate = "chamberlain_saius003.htm";
	protected String fnSetGate = "chamberlain_saius005.htm";
	protected String fnSetSiegeTime1 = "chamberlain_saius006.htm";
	protected String fnViewSiegeTime = "chamberlain_saius007.htm";
	protected String fnManageWarehouse = "chamberlain_saius008.htm";
	protected String fnNotMyLord = "chamberlain_saius009.htm";
	protected String fnAfterOpenGate = "chamberlain_saius011.htm";
	protected String fnAfterCloseGate = "chamberlain_saius012.htm";
	protected String fnAlreadySetSiege = "chamberlain_saius013.htm";
	protected String fnNotRegeistTime = "chamberlain_saius014.htm";
	protected String fnSetSiegeTime2 = "chamberlain_saius015.htm";
	protected String fnSetSiegeTime3 = "chamberlain_saius016.htm";
	protected String fnSetSiegeTime4 = "chamberlain_saius017.htm";
	protected String fnSetSiegeTime5 = "chamberlain_saius018.htm";
	protected String fnAfterSetSiegeTime = "chamberlain_saius019.htm";
	protected String fnSiegeViewReport = "chamberlain_saius020.htm";
	protected String fnSiegeStoppedFunction = "chamberlain_saius021.htm";
	protected String fnManorManage = "chamberlain_saius022.htm";
	protected String fnManageWarehouse2 = "chamberlain_saius023.htm";
	protected String fnNotEnoughMoney = "chamberlain_saius049.htm";
	protected String fnBanish = "chamberlain_saius050.htm";
	protected String fnAfterBanish = "chamberlain_saius051.htm";
	protected String fnSiegeDefendList = "chamberlain_saius052.htm";
	protected String fnDoorStrengthen = "chamberlain_saius053.htm";
	protected String fnDoorLevel = "chamberlain_saius054.htm";
	protected String fnDoorStrengthenConfirm = "chamberlain_saius055.htm";
	protected String fnCurrentDoorLevelHigher = "chamberlain_saius056.htm";
	protected String fnDoorHpLevelUp = "chamberlain_saius057.htm";
	protected String fnSetSlowZone = "chamberlain_saius058.htm";
	protected String fnSetDmgLevel = "chamberlain_saius059.htm";
	protected String fnDmgZoneConfirm = "chamberlain_saius060.htm";
	protected String fnCurrentDmgzoneLevelHigher = "chamberlain_saius061.htm";
	protected String fnDmgZoneLevelUp = "chamberlain_saius062.htm";
	protected String fnNoAuthority = "chamberlain_saius063.htm";
	protected String fnSellPage = "chamberlain_saius064.htm";
	protected String fnCastleList = "chamberlain_saius065.htm";
	protected String fnCrownBefor = "chamberlain_saius066.htm";
	protected String fnCrownAfter = "chamberlain_saius067.htm";
	protected String fnSSDenial = "chamberlain_saius068.htm";
	protected String fnSetTaxRate = "castlesettaxrate.htm";
	protected String fnAfterSetTaxRate = "castleaftersettaxrate.htm";
	protected String fnManageVault = "castlemanagevault.htm";
	protected String fnNotEnoughBalance = "castlenotenoughbalance.htm";
	protected String fnSellDawnTicket = "ssq_selldawnticket.htm";
	protected String fnTooHighTaxRate = "castletoohightaxrate.htm";
	protected String fnNotEnoughTicket = "ssq_notenoughticket.htm";
	protected String fnNotDawnOrEvent = "ssq_notdawnorevent.htm";
	protected String DDoorName1_1 = "aden_castle_outter_001";
	protected String DDoorName1_2 = "aden_castle_outter_002";
	protected String DDoorName2_1 = "aden_castle_left_001";
	protected String DDoorName2_2 = "aden_castle_left_002";
	protected String DDoorName3_1 = "aden_castle_right_001";
	protected String DDoorName3_2 = "aden_castle_right_002";
	protected String DDoorName4_1 = "aden_castle_inner_001";
	protected String DDoorName4_2 = "aden_castle_inner_002";
	protected String DDoorName5_1 = "aden_castle_left_003";
	protected String DDoorName5_2 = "aden_castle_left_004";
	protected String DDoorName6_1 = "aden_castle_right_003";
	protected String DDoorName6_2 = "aden_castle_right_004";
	protected String SDoorName1 = "aden_castle_terrace";
	protected String SDoorName2 = "aden_castle_side_door1";
	protected String SDoorName3 = "aden_castle_side_door2";
	protected String SDoorName4 = "aden_castle_side_door3";
	protected String SDoorName5 = "aden_castle_side_door4";
	protected String WallName1 = "aden_castle_wall_in";
	protected String WallName2 = "aden_castle_wall_left";
	protected String WallName3 = "aden_castle_wall_right";
	protected String dmgzonename1 = "aden_damage1_ctrltower";
	protected String dmgzonename2 = "aden_damage2_ctrltower";
	protected int DDoorPrice1_1 = 3000000;
	protected int DDoorPrice1_2 = 4000000;
	protected int DDoorPrice1_3 = 5000000;
	protected int DDoorPrice2_1 = 750000;
	protected int DDoorPrice2_2 = 900000;
	protected int DDoorPrice2_3 = 1000000;
	protected int DDoorPrice3_1 = 750000;
	protected int DDoorPrice3_2 = 900000;
	protected int DDoorPrice3_3 = 1000000;
	protected int DDoorPrice4_1 = 750000;
	protected int DDoorPrice4_2 = 900000;
	protected int DDoorPrice4_3 = 1000000;
	protected int WallPrice1_1 = 1600000;
	protected int WallPrice1_2 = 1800000;
	protected int WallPrice1_3 = 2000000;
	protected int WallPrice1_1 = 1600000;
	protected int WallPrice1_2 = 1800000;
	protected int WallPrice1_3 = 2000000;
	protected int WallPrice1_1 = 1600000;
	protected int WallPrice1_2 = 1800000;
	protected int WallPrice1_3 = 2000000;
	protected int dmgzoneprice1_1 = 3000000;
	protected int dmgzoneprice1_2 = 4000000;
	protected int dmgzoneprice1_3 = 5000000;
	protected int dmgzoneprice1_4 = 6000000;
	protected int dmgzoneprice1_1 = 3000000;
	protected int dmgzoneprice1_2 = 4000000;
	protected int dmgzoneprice1_3 = 5000000;
	protected int dmgzoneprice1_4 = 6000000;
	protected int SSQ_DawnTicketQuantity = 300;
	protected int SSQ_DawnTicketPrice = 1000;
	protected int SSQ_DawnTicketBundle = 10;
	protected int SSQ_DawnFactor_door = 80;
	protected int SSQ_DawnFactor_dmg = 80;
	protected int SSQ_DrawFactor_door = 100;
	protected int SSQ_DrawFactor_dmg = 100;
	protected int SSQ_DuskFactor_door = 300;
	protected int SSQ_DuskFactor_dmg = 300;
	protected int SSQ_DawnFactor_tax = 25;
	protected int SSQ_DrawFactor_tax = 15;
	protected int SSQ_DuskFactor_tax = 5;
	protected String ShopName = "";
	protected String fnAddTeleporter1 = "ol_mahum_steward_tamutak019.htm";
	protected String fnAddTeleporter2 = "ol_mahum_steward_tamutak020.htm";
	protected String fnTeleportLevelZero = "ol_mahum_steward_tamutak021.htm";
	protected int fortress_id1 = -1;
	protected int fortress_id2 = -1;
	protected int fortress_id3 = -1;
	protected int fortress_id4 = -1;
	protected int fortress_id5 = -1;
	protected int fortress_fstr = 1300101;
	protected int fortress_status = 1300123;
	protected int dominion_id = 81;
	protected int decotype_hpregen = 1;
	protected int decotype_mpregen = 2;
	protected int decotype_cpregen = 3;
	protected int decotype_xprestore = 4;
	protected int decotype_teleport = 5;
	protected int decotype_broadcast = 6;
	protected int decotype_curtain = 7;
	protected int decotype_hanging = 8;
	protected int decotype_buff = 9;
	protected int decotype_outerflag = 10;
	protected int decotype_platform = 11;
	protected int decotype_item = 12;
	protected String fnManage = "ol_mahum_AgitDecoManage.htm";
	protected String fnWarehouse = "agitwarehouse_b.htm";
	protected String fnDecoReset = "agitresetdeco.htm";
	protected String fnAfterSetDeco = "agitaftersetdeco.htm";
	protected String fnAfterResetDeco = "agitafterresetdeco.htm";
	protected String fnFailtoSetDeco = "agitfailtosetdeco.htm";
	protected String fnFailtoResetDeco = "agitfailtoresetdeco.htm";
	protected String fnDecoFunction = "agitdecofunction.htm";
	protected String fnFuncDisabled = "agitfuncdisabled.htm";
	protected String fnAgitBuff = "agitbuff";
	protected String fnAfterBuyItem = "agitafterbuyitem.htm";
	protected String fnManageRegen = "ol_mahum_agitdeco_ar01.htm";
	protected String fnManageEtc = "ol_mahum_agitdeco_ae01.htm";
	protected String fnDecoAlreadySet = "agitdecoalreadyset.htm";
	protected String fnAfterBuff = "agitafterbuff.htm";
	protected String fnNeedCoolTime = "agitneedcooltime.htm";
	protected String fnNotEnoughMP = "agitnotenoughmp.htm";
	protected int ppSetGate = 11;
	protected int ppDecoFunction = 12;
	protected int ppManage = 15;
	protected String fileSetName = "CastleDeco";
	protected int fstr_stage_lv = 9;
	protected int fstr_percent = 10;
	protected String fnNoFortressContract = "";
	protected String fnMyFortressStatus = "";
	protected int fortress_dependancy = 1300133;

protected Object[][] Position1 = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] Position2 = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};
protected Object[][] SellList0 = {
{"advdeluxe_food_for_strider";10;0.000000;0}
};
protected Object[][] BuyList0 = {
{"adena";0}, {"q_cybellins_dagger";0}, {"apprentice's_wand";0}, {"apprentice's_tunic";0}, {"apprentice's_hose";0}, {"dagger";0}, {"squire's_shirt";0}, {"squire's_pants";0}, {"training_gloves";0}, {"squire's_sword";0}, {"union_member's_club";0}, {"gallins_oak_wand";0}, {"rusted_bronze_sword3";0}, {"netis_bow";0}, {"netis_dagger";0}, {"guards_bow";0}, {"talins_spear";0}, {"old_knight_sword";0}, {"crescent_moon_bow";0}, {"sword_of_binding";0}, {"q_cybellins_dagger";0}, {"rp_titan_key";0}, {"rp_journeyman_ring";0}, {"rp_amber_bead";0}, {"q_rp_titans_powerstone";0}, {"q_herb_of_breka";0}, {"q_herb_of_vanor";0}, {"q_herb_of_oel_mahum";0}, {"q_blood_of_eva";0}, {"q_athreas_coin";0}, {"q_symbol_of_loyalty";0}, {"q_mist_drake_egg";0}, {"q_blitz_wyrm_egg";0}, {"q_drake_egg";0}, {"q_thunderwyrm_egg";0}, {"q_nebulite_crystals";0}, {"q_titan_powerstone";0}, {"q_imperial_key";0}, {"wolf_collar";0}, {"dragonflute_of_wind";0}, {"dragonflute_of_star";0}, {"dragonflute_of_twilight";0}, {"dragon_bugle_wind";0}, {"dragon_bugle_star";0}, {"dragon_bugle_dusk";0}, {"manacles_of_redemption";0}, {"adena_of_ancient";0}, {"party_mask_01";0}, {"the_infinity_blade";0}, {"the_infinity_cleaver";0}, {"the_infinity_axe";0}, {"the_infinity_rod";0}, {"the_infinity_crusher";0}, {"the_infinity_scepter";0}, {"the_infinity_stinger";0}, {"the_infinity_fangs";0}, {"the_infinity_bow";0}, {"the_infinity_wings";0}, {"the_infinity_spear";0}, {"crown_of_lord";0}, {"wings_of_destiny_circlet";0}, {"l2_fair_2005_coin";0}, {"q_escape_scroll_talking";0}, {"q_escape_scroll_elf";0}, {"q_escape_scroll_darkelf";0}, {"q_escape_scroll_orc";0}, {"q_escape_scroll_dwarf";0}, {"q_escape_scroll_giran";0}, {"guide_apprentice's_staff";0}, {"guide_bone_club";0}, {"guide_shining_knife";0}, {"guide_cestus";0}, {"guide_bow_of_forest";0}, {"guide_long_sword";0}, {"guide_mace_of_prayer";0}, {"guide_dark_elven_bow";0}, {"guide_long_bow";0}, {"guide_staff_of_mana";0}, {"guide_bastard_sword";0}, {"guide_divine_tome";0}, {"guide_single-edged_jamadhr";0}, {"guide_tomahawk";0}, {"guide_poniard_dagger";0}, {"guide_pike";0}, {"q_adventure_coupon1";0}, {"q_adventure_coupon2";0}, {"uq_sword_zariche";0}, {"nobless_gate_pass";0}, {"baby_buffalo_panpipe";0}, {"baby_cougar_chime";0}, {"baby_kukaburo_ocarina";0}, {"uq_dual_aka_manaf";0}, {"infinity_rapier";0}, {"infinity_sword";0}, {"infinity_shooter";0}, {"lbracelet_agit1";0}, {"lbracelet_agit2";0}, {"lbracelet_castle_gludio";0}, {"lbracelet_castle_dion";0}, {"lbracelet_castle_giran";0}, {"lbracelet_castle_oren";0}, {"lbracelet_castle_aden";0}, {"lbracelet_castle_innadrille";0}, {"lbracelet_castle_godad";0}, {"lbracelet_castle_rune";0}, {"lbracelet_castle_schuttgart";0}, {"fort_flag";0}, {"helmet_of_oath";0}, {"armor_of_oath";0}, {"gauntlet_of_oath";0}, {"boots_of_oath";0}, {"dress_of_oath";0}, {"leather_gloves_of_oath";0}, {"shoes_of_oath";0}, {"coat_of_oath";0}, {"silk_gloves_of_oath";0}, {"sandals_of_oath";0}, {"chevelier_rapier_bytime";0}, {"ritter_schleager_bytime";0}, {"ballista_bytime";0}, {"blink_slasher_bytime";0}, {"invincible_blade_bytime";0}, {"taslam_bytime";0}, {"assult_fleuret_bytime";0}, {"nameless_victory_bytime";0}, {"peace_maker_bytime";0}, {"high_wolf_collar";0}, {"talisman_test1";0}, {"red_talisman_might";0}, {"red_talisman_wild_magic";0}, {"red_talisman_berserker_spirit";0}, {"red_talisman_clarity";0}, {"red_talisman_clarity_special";0}, {"blue_talisman_damage_shield";0}, {"blue_talisman_silent_move";0}, {"blue_talisman_shield_defence_up";0}, {"blue_talisman_cure_bleeding";0}, {"blue_talisman_cure_hold";0}, {"blue_talisman_heal_empower";0}, {"blue_talisman_heal";0}, {"blue_talisman_shield";0}, {"blue_talisman_magic_barrier";0}, {"blue_talisman_mp_regen_up";0}, {"blue_talisman_shield_rate_up";0}, {"blue_talisman_silent_move";0}, {"blue_talisman_mp_relax";0}, {"blue_talisman_celestial_shield";0}, {"yellow_talisman_pa_up";0}, {"yellow_talisman_attack_speed_up";0}, {"yellow_talisman_md_up";0}, {"yellow_talisman_ma_up";0}, {"yellow_talisman_magic_speed_up";0}, {"yellow_talisman_hit_up";0}, {"yellow_talisman_pd_up";0}, {"yellow_talisman_all_speed_up";0}, {"yellow_talisman_speed_up";0}, {"yellow_talisman_critical_damage_down";0}, {"yellow_talisman_critical_damage_up";0}, {"yellow_talisman_critical_rate_down";0}, {"yellow_talisman_avoid_up";0}, {"yellow_talisman_heal_up";0}, {"yellow_talisman_cp_regen_up";0}, {"yellow_talisman_hp_regen_up";0}, {"yellow_talisman_mp_regen_up";0}, {"gray_talisman_weight_up";0}, {"gray_talisman_fishing";0}, {"orange_talisman_create_healing_potion";0}, {"orange_talisman_create_elixir_of_mental_c";0}, {"orange_talisman_create_elixir_of_mental_b";0}, {"black_talisman_cure_m_silence";0}, {"black_talisman_cure_m_hold";0}, {"black_talisman_cure_p_hold";0}, {"black_talisman_cure_p_silence";0}, {"black_talisman_cure_silence";0}, {"white_talisman_derangement_resist_up";0}, {"white_talisman_paralyze_resist_up";0}, {"white_talisman_shock_resist_up";0}, {"white_talisman_sleep_resist_up";0}, {"white_talisman_bleed_resist_up";0}, {"white_talisman_cancel_resist_up";0}, {"white_talisman_hold_resist_up";0}, {"fleuret_bytime_q";0}, {"assult_tulwar_bytime_q";0}, {"hand_bowgun_bytime_q";0}, {"blink_slasher_bytime_q";0}, {"invincible_blade_bytime_q";0}, {"taslam_bytime_q";0}, {"gray_talisman_transform_yeti";0}, {"gray_talisman_transform_buffalo";0}, {"blue_talisman_avoid";0}, {"loaf_sugar";0}, {"sb_subclass_beginner";0}, {"sb_subclass_warrior";0}, {"sb_subclass_knight";0}, {"sb_subclass_rogue";0}, {"sb_subclass_wizard";0}, {"sb_subclass_healer";0}, {"sb_subclass_summoner";0}, {"sb_subclass_enchanter";0}, {"sb_transform_knight";0}, {"sb_transform_warrior";0}, {"sb_transform_rogue";0}, {"sb_transform_healer";0}, {"sb_transform_wizard";0}, {"sb_transform_enchanter";0}, {"sb_transform_summoner";0}, {"sb_transform_zaken";0}, {"sb_transform_anakim";0}, {"sb_transform_venom";0}, {"sb_transform_gordon";0}, {"sb_transform_lancoo";0}, {"sb_transform_keyache";0}, {"sb_transform_duke_devil";0}, {"sb_transform_heretic";0}, {"sb_transform_vale_master";0}, {"sb_transform_saber_toothed_tiger";0}, {"sb_transform_oel_mahum";0}, {"sb_transform_doll_blader";0}, {"high_wolf_collar_white";0}, {"dragon_bugle_wind_red";0}, {"dragon_bugle_star_red";0}, {"dragon_bugle_dusk_red";0}, {"viking_circlet_violet_bytime";0}, {"viking_circlet_gold_bytime";0}, {"red_talisman_detonation";0}, {"red_talisman_m_detonation";0}, {"white_talisman_storm";0}, {"white_talisman_darkness";0}, {"white_talisman_water";0}, {"white_talisman_fire";0}, {"white_talisman_light";0}, {"blue_talisman_explosion";0}, {"blue_talisman_great_healing";0}, {"lesser_red_talisman_might";0}, {"lesser_blue_talisman_shield_defence_up";0}, {"lesser_yellow_talisman_pd_up";0}, {"lesser_yellow_talisman_ma_up";0}, {"lesser_yellow_talisman_avoid_up";0}, {"lesser_yellow_talisman_heal_up";0}, {"lesser_yellow_talisman_cp_regen_up";0}, {"lesser_yellow_talisman_hp_regen_up";0}, {"lesser_yellow_talisman_mp_regen_up";0}, {"lesser_blue_talisman_heal";0}, {"lesser_yellow_talisman_speed_up";0}, {"gray_talisman_fishing_24";0}, {"blue_talisman_vatality";0}, {"white_talisman_earth";0}, {"q_caradines_letter1";0}, {"q_caradines_letter2";0}, {"bind_small_gourd_seed";0}, {"bind_big_gourd_seed";0}, {"circlet_of_innadril";0}, {"circlet_of_dion";0}, {"circlet_of_godard";0}, {"circlet_of_oren";0}, {"circlet_of_gludio";0}, {"circlet_of_giran";0}, {"circlet_of_aden";0}, {"circlet_of_rune";0}, {"circlet_of_shuttgart";0}, {"blank_soul_bottle_5";0}, {"lbracelet_1";0}, {"lbracelet_fort_1";0}, {"lbracelet_2";0}, {"bracelet_agathion_angel_1";0}, {"bracelet_agathion_angel_2";0}, {"bracelet_agathion_angel_3";0}, {"bracelet_agathion_angel_4";0}, {"bracelet_agathion_angel";0}, {"bracelet_agathion_devil_1";0}, {"bracelet_agathion_devil_2";0}, {"bracelet_agathion_devil_3";0}, {"bracelet_agathion_devil_4";0}, {"bracelet_agathion_devil";0}, {"cube_event";0}, {"circlet_of_academy";0}, {"escape_scroll_talking";0}, {"escape_scroll_elf";0}, {"escape_scroll_darkelf";0}, {"escape_scroll_orc";0}, {"escape_scroll_dwarf";0}, {"escape_scroll_gludin";0}, {"escape_scroll_gludio";0}, {"escape_scroll_dion";0}, {"escape_scroll_floran";0}, {"escape_scroll_giran";0}, {"escape_scroll_hardin";0}, {"escape_scroll_heiness";0}, {"escape_scroll_oren";0}, {"escape_scroll_ivorytower";0}, {"escape_scroll_hunter";0}, {"escape_scroll_aden";0}, {"escape_scroll_godard";0}, {"escape_scroll_rune";0}, {"escape_scroll_schtgart";0}, {"escape_scroll_ketra";0}, {"escape_scroll_barka";0}, {"escape_scroll_soul_island";0}, {"q_energy_ore_q0269";0}, {"q_red_patch_q0060";0}, {"q_antidote_of_hel";0}, {"q_decayed_liq_of_kasha_spider";0}, {"piece_of_emery";0}, {"upgrade_buffalo_panpipe";0}, {"upgrade_cougar_chime";0}, {"upgrade_kukaburo_ocarina";0}, {"high_wolf_collar_ride";0}, {"high_wolf_collar_ride_white";0}, {"pi_ferret_pet_collar";0}, {"pi_fairy_princess_pet_collar";0}, {"pi_beast_fighter_pet_collar";0}, {"pi_foxian_wizard_pet_collar";0}, {"pi_toy_knight_necklace";0}, {"pi_spirit_maget_necklace";0}, {"pi_owl_maget_necklace";0}, {"pi_turtle_mastert_necklace";0}, {"olympiad_token";0}, {"event_chicken_cap2";0}, {"event_black_feather_mask2";0}, {"event_carnival_circlet2";0}, {"event_middle_age_party_mask2";0}, {"bytime_chicken_cap2_escape";0}, {"bytime_chicken_cap2_bighead";0}, {"bytime_chicken_cap2_bomb";0}, {"bytime_black_feather_mask2_escape";0}, {"bytime_black_feather_mask2_bighead";0}, {"bytime_black_feather_mask2_bomb";0}, {"bytime_carnival_circlet2_escape";0}, {"bytime_carnival_circlet2_bighead";0}, {"bytime_carnival_circlet2_bomb";0}, {"bytime_middle_age_party_mask2_escape";0}, {"bytime_middle_age_party_mask2_bighead";0}, {"bytime_middle_age_party_mask2_bomb";0}, {"event_whiteday_candybsk_1";0}, {"event_whiteday_candybsk_2";0}, {"event_whiteday_solo_pack";0}, {"event_whiteday_candy";0}, {"event_whiteday_candle";0}, {"cat_the_cat_cap_14days";0}, {"flower_coronet_whiteday_event";0}, {"wedding_dress_14days";0}, {"event_whiteday_pig_candy";0}, {"event_bracelet_aga_love";0}, {"event_bracelet_aga_chu";0}
};

	protected void CREATED() {
myself.AddTimerEx(1077, 1000);
myself.RegisterTeleporterType(1, 0);
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, fnHi);

} else if (myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNotMyLord);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam state, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam s0) {
if (ask == 0) {
if (myself.IsMyLord(talker)) {
myself.ShowPage(talker, fnHi);

} else if (myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNotMyLord);

}

}
if (ask == -201) {
switch (reply) {
case 1: {
if (myself.IsMyLord(talker)) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeViewReport);

} else if (myself.sm.residence_id > 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnViewReport);
myself.FHTML_SetStr(fhtml0, "my_pledge_name", myself.Castle_GetPledgeName());
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));

}
if (myself.GetSSQStatus() == 1) {
myself.FHTML_SetStr(fhtml0, "ss_event", gg.MakeFString(1000507, "", "", "", "", ""));

} else if (myself.GetSSQStatus() == 3) {
myself.FHTML_SetStr(fhtml0, "ss_event", gg.MakeFString(1000508, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "ss_event", gg.MakeFString(1000509, "", "", "", "", ""));

}
if (myself.GetSSQStatus() != 1 && myself.GetSSQSealOwner(1) == 1) {
myself.FHTML_SetStr(fhtml0, "ss_avarice", gg.MakeFString(1000510, "", "", "", "", ""));

} else if (myself.GetSSQStatus() != 1 && myself.GetSSQSealOwner(1) == 2) {
myself.FHTML_SetStr(fhtml0, "ss_avarice", gg.MakeFString(1000511, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "ss_avarice", gg.MakeFString(1000512, "", "", "", "", ""));

}
if (myself.GetSSQStatus() != 1 && myself.GetSSQSealOwner(2) == 1) {
myself.FHTML_SetStr(fhtml0, "ss_revelation", gg.MakeFString(1000510, "", "", "", "", ""));

} else if (myself.GetSSQStatus() != 1 && myself.GetSSQSealOwner(2) == 2) {
myself.FHTML_SetStr(fhtml0, "ss_revelation", gg.MakeFString(1000511, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "ss_revelation", gg.MakeFString(1000512, "", "", "", "", ""));

}
if (myself.GetSSQStatus() != 1 && myself.GetSSQSealOwner(3) == 1) {
myself.FHTML_SetStr(fhtml0, "ss_strife", gg.MakeFString(1000510, "", "", "", "", ""));

} else if (myself.GetSSQStatus() != 1 && myself.GetSSQSealOwner(3) == 2) {
myself.FHTML_SetStr(fhtml0, "ss_strife", gg.MakeFString(1000511, "", "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "ss_strife", gg.MakeFString(1000512, "", "", "", "", ""));

}
myself.ShowFHTML(talker, fhtml0);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 2: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 21) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else {
if (myself.GetSSQSealOwner(3) == 1) {
i0 = SSQ_DuskFactor_tax;

} else if (myself.GetSSQSealOwner(3) == 2) {
i0 = SSQ_DawnFactor_tax;

} else {
i0 = SSQ_DrawFactor_tax;

}
myself.FHTML_SetFileName(fhtml0, fnSetTaxRate);
myself.FHTML_SetInt(fhtml0, "current_tax_rate", myself.Residence_GetTaxRateCurrent());
myself.FHTML_SetInt(fhtml0, "next_tax_rate", myself.Residence_GetTaxRate());
myself.FHTML_SetInt(fhtml0, "TaxLimit", i0);
myself.ShowFHTML(talker, fhtml0);

}

} else if (myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.FHTML_SetFileName(fhtml0, fnViewTaxRate);
myself.FHTML_SetInt(fhtml0, "current_tax_rate", myself.Residence_GetTaxRateCurrent());
myself.FHTML_SetInt(fhtml0, "next_tax_rate", myself.Residence_GetTaxRate());
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 3: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 21) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.FHTML_SetFileName(fhtml0, fnManageVault);
myself.FHTML_SetInt(fhtml0, "tax_income", myself.Residence_GetTaxIncome());
myself.FHTML_SetInt(fhtml0, "tax_income_reserved", myself.Residence_GetTaxIncomeReserved());
myself.FHTML_SetInt(fhtml0, "seed_income", myself.Manor_GetSeedIncome());
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 4: {
if (myself.IsMyLord(talker) || myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else {
myself.ShowPage(talker, fnCastleList);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 5: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 18) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.OpenSiegeInfo(talker);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 6: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.FHTML_SetFileName(fhtml0, "manor.htm");
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 7: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 19) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnSellPage);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 8: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 20) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else {
myself.ShowPage(talker, fnBanish);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 9: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 16) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else {
myself.ShowPage(talker, fnSetGate);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 10: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 23) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (gg.Castle_GetDomainFortressContractStatus(myself.sm.residence_id) == 0) {
myself.ShowPage(talker, fnNoFortressContract);
return;

}
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.GetSSQStatus() == 1 || myself.GetSSQStatus() == 2) {
myself.ShowPage(talker, fnSSDenial);

} else {
myself.ShowPage(talker, fnSiegeDefendList);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 11: {
if (myself.IsMyLord(talker)) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (gg.GetSSQPart(talker) == 2) {
if (myself.GetSSQStatus() == 1) {
if (myself.GetTicketBuyCount(talker) < SSQ_DawnTicketQuantity / SSQ_DawnTicketBundle) {
myself.FHTML_SetFileName(fhtml0, fnSellDawnTicket);
myself.FHTML_SetInt(fhtml0, "DawnTicketLeft", SSQ_DawnTicketQuantity - myself.GetTicketBuyCount(talker) * SSQ_DawnTicketBundle);
myself.FHTML_SetInt(fhtml0, "DawnTicketBundle", SSQ_DawnTicketBundle);
myself.FHTML_SetInt(fhtml0, "DawnTicketPrice", SSQ_DawnTicketPrice * SSQ_DawnTicketBundle);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNotEnoughTicket);

}

} else {
myself.ShowPage(talker, fnNotDawnOrEvent);

}

} else {
myself.ShowPage(talker, fnNotDawnOrEvent);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 12: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 19) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowBuySell(talker, SellList0, BuyList0, -50);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 13: {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.IsMyLord(talker)) {
if (gg.OwnItemCount(talker, 6841) >= 1) {
myself.ShowPage(talker, fnCrownBefor);

} else if (myself.sm.residence_id > 0) {
if (myself.Castle_GetPledgeId()) {
myself.FHTML_SetFileName(fhtml0, fnCrownAfter);
myself.FHTML_SetStr(fhtml0, "my_owner_name", myself.Castle_GetOwnerName());
myself.FHTML_SetStr(fhtml0, "feud_name", gg.MakeFString(MakeFString + myself.sm.residence_id, "", "", "", "", ""));
myself.GiveItem1(talker, 6841, 1);
myself.ShowFHTML(talker, fhtml0);

}

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 14: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 18) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.RegisterDominion(dominion_id, talker);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 151: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppManage) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.FHTML_SetFileName(fhtml0, fnManageRegen);
if (myself.Agit_GetDecoLevel(decotype_hpregen) == 0) {
myself.FHTML_SetStr(fhtml0, "HP" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "HP" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "HP" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_hpregen) - 10;
myself.FHTML_SetStr(fhtml0, "HP" + "Depth", gg.MakeFString(fstr_percent, gg.IntToStr(i0 * 20), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "HP" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_hpregen, myself.Agit_GetDecoLevel(decotype_hpregen))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_hpregen, myself.Agit_GetDecoLevel(decotype_hpregen))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "HP" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_hpregen), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_hpregen), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_hpregen), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "HP" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_hpregen), fnBracketR, "", ""));

}
if (myself.Agit_GetDecoLevel(decotype_mpregen) == 0) {
myself.FHTML_SetStr(fhtml0, "MP" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "MP" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "MP" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_mpregen) - 10;
myself.FHTML_SetStr(fhtml0, "MP" + "Depth", gg.MakeFString(fstr_percent, gg.IntToStr(i0 * 5), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "MP" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_mpregen, myself.Agit_GetDecoLevel(decotype_mpregen))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_mpregen, myself.Agit_GetDecoLevel(decotype_mpregen))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "MP" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_mpregen), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_mpregen), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_mpregen), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "MP" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_mpregen), fnBracketR, "", ""));

}
if (myself.Agit_GetDecoLevel(decotype_xprestore) == 0) {
myself.FHTML_SetStr(fhtml0, "XP" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "XP" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "XP" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_xprestore) - 10;
myself.FHTML_SetStr(fhtml0, "XP" + "Depth", gg.MakeFString(fstr_percent, gg.IntToStr(i0 * 5), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "XP" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_xprestore, myself.Agit_GetDecoLevel(decotype_xprestore))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_xprestore, myself.Agit_GetDecoLevel(decotype_xprestore))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "XP" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_xprestore), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_xprestore), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_xprestore), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "XP" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_xprestore), fnBracketR, "", ""));

}
if (myself.Agit_GetDecoLevel(decotype_curtain) == 0) {
myself.FHTML_SetStr(fhtml0, "VP" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "VP" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "VP" + "Reset", "");

} else {
myself.FHTML_SetStr(fhtml0, "VP" + "Depth", gg.MakeFString(fstr_percent, gg.IntToStr(myself.Agit_GetDecoLevel(decotype_curtain) * 25), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "VP" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_curtain, myself.Agit_GetDecoLevel(decotype_curtain))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_curtain, myself.Agit_GetDecoLevel(decotype_curtain))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "VP" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_curtain), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_curtain), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_curtain), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "VP" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_curtain), fnBracketR, "", ""));

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 152: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppManage) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.FHTML_SetFileName(fhtml0, fnManageEtc);
if (myself.Agit_GetDecoLevel(decotype_teleport) == 0) {
myself.FHTML_SetStr(fhtml0, "TP" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "TP" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "TP" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_teleport) - 10;
myself.FHTML_SetStr(fhtml0, "TP" + "Depth", gg.MakeFString(fstr_stage_lv, gg.IntToStr(i0 * 1), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "TP" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_teleport, myself.Agit_GetDecoLevel(decotype_teleport))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_teleport, myself.Agit_GetDecoLevel(decotype_teleport))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "TP" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_teleport), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_teleport), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_teleport), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "TP" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_teleport), fnBracketR, "", ""));

}
if (myself.Agit_GetDecoLevel(decotype_broadcast) == 0) {
myself.FHTML_SetStr(fhtml0, "BC" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "BC" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "BC" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_broadcast) - 10;
myself.FHTML_SetStr(fhtml0, "BC" + "Depth", gg.MakeFString(fstr_stage_lv, gg.IntToStr(i0 * 1), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "BC" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_broadcast, myself.Agit_GetDecoLevel(decotype_broadcast))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_broadcast, myself.Agit_GetDecoLevel(decotype_broadcast))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "BC" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_broadcast), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_broadcast), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_broadcast), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "BC" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_broadcast), fnBracketR, "", ""));

}
if (myself.Agit_GetDecoLevel(decotype_item) == 0) {
myself.FHTML_SetStr(fhtml0, "IC" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "IC" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "IC" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_item) - 10;
myself.FHTML_SetStr(fhtml0, "IC" + "Depth", gg.MakeFString(fstr_stage_lv, gg.IntToStr(i0 * 1), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "IC" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_item, myself.Agit_GetDecoLevel(decotype_item))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_item, myself.Agit_GetDecoLevel(decotype_item))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "IC" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_item), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_item), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_item), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "IC" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_item), fnBracketR, "", ""));

}
if (myself.Agit_GetDecoLevel(decotype_buff) == 0) {
myself.FHTML_SetStr(fhtml0, "BF" + "Depth", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "BF" + "Expire", gg.MakeFString(4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "BF" + "Reset", "");

} else {
i0 = myself.Agit_GetDecoLevel(decotype_buff) - 10;
myself.FHTML_SetStr(fhtml0, "BF" + "Depth", gg.MakeFString(fstr_stage_lv, gg.IntToStr(i0 * 1), "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "BF" + "Cost", "(" + gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(decotype_buff, myself.Agit_GetDecoLevel(decotype_buff))), gg.IntToStr(myself.Agit_GetDecoDay(decotype_buff, myself.Agit_GetDecoLevel(decotype_buff))), "", "", "") + ")");
myself.FHTML_SetStr(fhtml0, "BF" + "Expire", gg.MakeFString(5, gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_buff), 1)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_buff), 2)), gg.IntToStr(gg.GetDateTime(myself.Agit_GetDecoExpire(decotype_buff), 3)), "", ""));
myself.FHTML_SetStr(fhtml0, "BF" + "Reset", gg.MakeFString(7, fnBracketL, gg.IntToStr(decotype_buff), fnBracketR, "", ""));

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 107: {
if (myself.HavePledgePower(talker, ppDecoFunction) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Agit_GetDecoLevel(decotype_buff) == 0) {
myself.ShowPage(talker, fnFuncDisabled);

} else {
myself.FHTML_SetFileName(fhtml0, fnAgitBuff + "_" + gg.IntToStr(myself.Agit_GetDecoLevel(decotype_buff) - 10) + ".htm");
myself.FHTML_SetInt(fhtml0, "MPLeft", gg.FloatToInt(myself.sm.mp));
myself.ShowFHTML(talker, fhtml0);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 105: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppManage) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.ShowPage(talker, fnManage);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 103: {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppDecoFunction) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.FHTML_SetFileName(fhtml0, fnDecoFunction);
if (myself.Agit_GetDecoLevel(decotype_hpregen) == 0) {
myself.FHTML_SetInt(fhtml0, "HPDepth", 0);

} else {
myself.FHTML_SetInt(fhtml0, "HPDepth", myself.Agit_GetDecoLevel(decotype_hpregen) - 10 * 20);

}
if (myself.Agit_GetDecoLevel(decotype_mpregen) == 0) {
myself.FHTML_SetInt(fhtml0, "MPDepth", 0);

} else {
myself.FHTML_SetInt(fhtml0, "MPDepth", myself.Agit_GetDecoLevel(decotype_mpregen) - 10 * 5);

}
if (myself.Agit_GetDecoLevel(decotype_xprestore) == 0) {
myself.FHTML_SetInt(fhtml0, "XPDepth", 0);

} else {
myself.FHTML_SetInt(fhtml0, "XPDepth", myself.Agit_GetDecoLevel(decotype_xprestore) - 10 * 5);

}
if (myself.Agit_GetDecoLevel(decotype_curtain) == 0) {
myself.FHTML_SetInt(fhtml0, "VPDepth", 0);

} else {
myself.FHTML_SetInt(fhtml0, "VPDepth", myself.Agit_GetDecoLevel(decotype_curtain) * 25);

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}
break;

}
case 399: {
myself.Castle_GetRelatedFortressList(talker);

}

}

} else if (ask == -202) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 21) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else {
if (myself.GetSSQSealOwner(3) == 1) {
i0 = SSQ_DuskFactor_tax;

} else if (myself.GetSSQSealOwner(3) == 2) {
i0 = SSQ_DawnFactor_tax;

} else {
i0 = SSQ_DrawFactor_tax;

}
if (reply > i0) {
myself.FHTML_SetFileName(fhtml0, fnTooHighTaxRate);
myself.FHTML_SetInt(fhtml0, "TaxLimit", i0);

} else {
myself.FHTML_SetFileName(fhtml0, fnAfterSetTaxRate);
if (reply < 0) {
myself.Residence_SetTaxRate(0);
myself.FHTML_SetInt(fhtml0, "next_tax_rate", 0);

} else {
myself.Residence_SetTaxRate(reply);
myself.FHTML_SetInt(fhtml0, "next_tax_rate", reply);

}

}
myself.ShowFHTML(talker, fhtml0);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -203) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 16) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
switch (reply) {
case 1: {
gg.Castle_GateOpenClose2(DDoorName1_1, 0);
gg.Castle_GateOpenClose2(DDoorName1_2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 101: {
gg.Castle_GateOpenClose2(DDoorName1_1, 1);
gg.Castle_GateOpenClose2(DDoorName1_2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 2: {
gg.Castle_GateOpenClose2(DDoorName2_1, 0);
gg.Castle_GateOpenClose2(DDoorName2_2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 102: {
gg.Castle_GateOpenClose2(DDoorName2_1, 1);
gg.Castle_GateOpenClose2(DDoorName2_2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 3: {
gg.Castle_GateOpenClose2(DDoorName3_1, 0);
gg.Castle_GateOpenClose2(DDoorName3_2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 103: {
gg.Castle_GateOpenClose2(DDoorName3_1, 1);
gg.Castle_GateOpenClose2(DDoorName3_2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 4: {
gg.Castle_GateOpenClose2(DDoorName4_1, 0);
gg.Castle_GateOpenClose2(DDoorName4_2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 104: {
gg.Castle_GateOpenClose2(DDoorName4_1, 1);
gg.Castle_GateOpenClose2(DDoorName4_2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 5: {
gg.Castle_GateOpenClose2(DDoorName5_1, 0);
gg.Castle_GateOpenClose2(DDoorName5_2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 105: {
gg.Castle_GateOpenClose2(DDoorName5_1, 1);
gg.Castle_GateOpenClose2(DDoorName5_2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 6: {
gg.Castle_GateOpenClose2(DDoorName6_1, 0);
gg.Castle_GateOpenClose2(DDoorName6_2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 106: {
gg.Castle_GateOpenClose2(DDoorName6_1, 1);
gg.Castle_GateOpenClose2(DDoorName6_2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 11: {
gg.Castle_GateOpenClose2(SDoorName1, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 111: {
gg.Castle_GateOpenClose2(SDoorName1, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 12: {
gg.Castle_GateOpenClose2(SDoorName2, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 112: {
gg.Castle_GateOpenClose2(SDoorName2, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 13: {
gg.Castle_GateOpenClose2(SDoorName3, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 113: {
gg.Castle_GateOpenClose2(SDoorName3, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 14: {
gg.Castle_GateOpenClose2(SDoorName4, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 114: {
gg.Castle_GateOpenClose2(SDoorName4, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 15: {
gg.Castle_GateOpenClose2(SDoorName5, 0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 115: {
gg.Castle_GateOpenClose2(SDoorName5, 1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}
case 99: {
myself.Castle_GateOpenClose(0);
myself.ShowPage(talker, fnAfterOpenGate);
break;

}
case 199: {
myself.Castle_GateOpenClose(1);
myself.ShowPage(talker, fnAfterCloseGate);
break;

}

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -204) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 23) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
switch (reply) {
case 1: {
myself.ShowPage(talker, fnDoorStrengthen);
break;

}
case 2: {
myself.ShowPage(talker, fnSetSlowZone);
break;

}

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -205) {
myself.SetCookie(talker, "gate_num", reply);
myself.ShowPage(talker, fnDoorLevel);

} else if (ask == -206) {
switch (reply) {
case 1: {
myself.SetCookie(talker, "gate_level", 200);
break;

}
case 2: {
myself.SetCookie(talker, "gate_level", 300);
break;

}
case 3: {
myself.SetCookie(talker, "gate_level", 500);
break;

}

}
i0 = myself.GetCookie(talker, "gate_num");
i1 = myself.GetCookie(talker, "gate_level");
if (i0 == 1 && i1 == 200) {
i2 = DDoorPrice1_1;

}
if (i0 == 1 && i1 == 300) {
i2 = DDoorPrice1_2;

}
if (i0 == 1 && i1 == 500) {
i2 = DDoorPrice1_3;

}
if (i0 == 2 || i0 == 3 && i1 == 200) {
i2 = DDoorPrice2_1;

}
if (i0 == 2 || i0 == 3 && i1 == 300) {
i2 = DDoorPrice2_2;

}
if (i0 == 2 || i0 == 3 && i1 == 500) {
i2 = DDoorPrice2_3;

}
if (i0 == 4 && i1 == 200) {
i2 = DDoorPrice4_1;

}
if (i0 == 4 && i1 == 300) {
i2 = DDoorPrice4_2;

}
if (i0 == 4 && i1 == 500) {
i2 = DDoorPrice4_3;

}
if (i0 == 21 && i1 == 200) {
i2 = WallPrice1_1;

}
if (i0 == 21 && i1 == 300) {
i2 = WallPrice1_2;

}
if (i0 == 21 && i1 == 500) {
i2 = WallPrice1_3;

}
if (i0 == 22 && i1 == 200) {
i2 = WallPrice1_1;

}
if (i0 == 22 && i1 == 300) {
i2 = WallPrice1_2;

}
if (i0 == 22 && i1 == 500) {
i2 = WallPrice1_3;

}
if (myself.GetSSQSealOwner(3) == 1) {
i2 = gg.FloatToInt(i2 * SSQ_DuskFactor_door / 100);

} else if (myself.GetSSQSealOwner(3) == 2) {
i2 = gg.FloatToInt(i2 * SSQ_DawnFactor_door / 100);

} else {
i2 = gg.FloatToInt(i2 * SSQ_DrawFactor_door / 100);

}
myself.SetCookie(talker, "gate_price", i2);
myself.FHTML_SetFileName(fhtml0, fnDoorStrengthenConfirm);
myself.FHTML_SetInt(fhtml0, "gate_price", i2);
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -207 && reply == 1) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 23) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = myself.GetCookie(talker, "gate_num");
i1 = myself.GetCookie(talker, "gate_price");
switch (i0) {
case 1: {
myself.GetDoorHpLevel(talker, DDoorName1_1);
break;

}
case 2: {
myself.GetDoorHpLevel(talker, DDoorName2_1);
break;

}
case 3: {
myself.GetDoorHpLevel(talker, DDoorName3_1);
break;

}
case 4: {
myself.GetDoorHpLevel(talker, DDoorName4_1);
break;

}
case 21: {
myself.GetDoorHpLevel(talker, WallName1);
break;

}
case 22: {
myself.GetDoorHpLevel(talker, WallName3);
break;

}

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -208) {
if (reply == 1) {
myself.SetCookie(talker, "dmgzone_num", 1);

} else if (reply == 2) {
myself.SetCookie(talker, "dmgzone_num", 2);

}
myself.ShowPage(talker, fnSetDmgLevel);

} else if (ask == -209) {
myself.SetCookie(talker, "dmgzone_level", reply);
switch (reply) {
case 1: {
i0 = dmgzoneprice1_1;
break;

}
case 2: {
i0 = dmgzoneprice1_2;
break;

}
case 3: {
i0 = dmgzoneprice1_3;
break;

}
case 4: {
i0 = dmgzoneprice1_4;
break;

}

}
if (myself.GetSSQSealOwner(3) == 1) {
i0 = gg.FloatToInt(i0 * SSQ_DuskFactor_dmg / 100);

} else if (myself.GetSSQSealOwner(3) == 2) {
i0 = gg.FloatToInt(i0 * SSQ_DawnFactor_dmg / 100);

} else {
i0 = gg.FloatToInt(i0 * SSQ_DrawFactor_dmg / 100);

}
myself.SetCookie(talker, "dmgzone_price", i0);
myself.FHTML_SetFileName(fhtml0, fnDmgZoneConfirm);
myself.FHTML_SetInt(fhtml0, "dmgzone_price", i0);
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -210 && reply == 1) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.GetCookie(talker, "dmgzone_num") == 1) {
myself.GetControlTowerLevel(talker, dmgzonename1);

} else if (myself.GetCookie(talker, "dmgzone_num") == 2) {
myself.GetControlTowerLevel(talker, dmgzonename2);

}

} else if (ask == -219) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 20) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else {
myself.Castle_BanishOthers();
myself.ShowPage(talker, fnAfterBanish);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -240) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 21) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (reply == 0) {
myself.ShowPage(talker, fnHi);

} else if (reply <= myself.Residence_GetTaxIncome()) {
myself.Residence_VaultTakeOutMoney(talker, reply);
myself.ShowPage(talker, fnHi);

} else {
myself.FHTML_SetFileName(fhtml0, fnNotEnoughBalance);
myself.FHTML_SetInt(fhtml0, "tax_income", myself.Residence_GetTaxIncome());
myself.FHTML_SetInt(fhtml0, "withdraw_amount", reply);
myself.ShowFHTML(talker, fhtml0);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -241) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 21) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
myself.Residence_VaultSaveMoney(talker, reply);
myself.ShowPage(talker, fnHi);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -251) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (reply == 3) {
if (myself.IsMyLord(talker)) {
myself.FHTML_SetFileName(fhtml0, fnManageWarehouse2);
myself.FHTML_SetInt(fhtml0, "tax_income", myself.Residence_GetTaxIncome());
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else {
i0 = gg.FloatToInt(reply / 10);
myself.SetCookie(talker, "ManorId", i0);
i1 = reply - i0 * 10;
if (i1 == 1) {
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentSeedCount" + i2, myself.GetCurrentSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "MaxSell" + i2, myself.GetMaxSellableCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedPrice" + i2, myself.GetCurrentSeedPrice(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedRemain" + i2, myself.GetCurrentSeedRemainCount(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentSeedCount" + i2, myself.GetCurrentSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "MaxSell" + i2, myself.GetMaxSellableCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedPrice" + i2, myself.GetCurrentSeedPrice(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentSeedRemain" + i2, myself.GetCurrentSeedRemainCount(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

}

} else if (i1 == 2) {
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

}

} else if (i1 == 3) {
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

}

} else if (i1 == 4) {
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + ".htm");
i3 = 0;
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextProcureCount" + i2, myself.GetNextProcurementCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextProcurePrice" + i2, myself.GetNextProcurementRate(i0, i2));
i3 = i3 + myself.GetNextProcurementCount(i0, i2) * myself.GetNextProcurementRate(i0, i2);
myself.FHTML_SetInt(fhtml0, "NextProcureType" + i2, myself.GetNextProcurementType(i0, i2));

}
myself.FHTML_SetInt(fhtml0, "total_sum", i3);
myself.ShowFHTML(talker, fhtml0);

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + ".htm");
i3 = 0;
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextProcureCount" + i2, myself.GetNextProcurementCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextProcurePrice" + i2, myself.GetNextProcurementRate(i0, i2));
i3 = i3 + myself.GetNextProcurementCount(i0, i2) * myself.GetNextProcurementRate(i0, i2);
myself.FHTML_SetInt(fhtml0, "NextProcureType" + i2, myself.GetNextProcurementType(i0, i2));

}
myself.FHTML_SetInt(fhtml0, "total_sum", i3);
myself.ShowFHTML(talker, fhtml0);

}

} else if (i1 == 5) {
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + ".htm");
i3 = 0;
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "DefaultSeedPrice" + i2, myself.GetSeedDefaultPrice(i0, i2));
i3 = i3 + myself.GetNextSeedSellCountSet(i0, i2) * myself.GetSeedDefaultPrice(i0, i2);
myself.FHTML_SetInt(fhtml0, "sum" + i2, myself.GetNextSeedSellCountSet(i0, i2) * myself.GetSeedDefaultPrice(i0, i2));

}
myself.FHTML_SetInt(fhtml0, "total_sum", i3);
myself.ShowFHTML(talker, fhtml0);

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + ".htm");
i3 = 0;
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "DefaultSeedPrice" + i2, myself.GetSeedDefaultPrice(i0, i2));
i3 = i3 + myself.GetNextSeedSellCountSet(i0, i2) * myself.GetSeedDefaultPrice(i0, i2);
myself.FHTML_SetInt(fhtml0, "sum" + i2, myself.GetNextSeedSellCountSet(i0, i2) * myself.GetSeedDefaultPrice(i0, i2));

}
myself.FHTML_SetInt(fhtml0, "total_sum", i3);
myself.ShowFHTML(talker, fhtml0);

}

}

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -252 && myself.IsManorSettingTime() == 1) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = myself.GetCookie(talker, "ManorId");
i1 = myself.GetCropClassidByOrderNum(i0, reply);
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "cropmanage.htm");
s0 = gg.MakeFString(i1 + 1200001 - 5065, "", "", "", "", "");

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_cropmanage.htm");
s0 = gg.MakeFString(i1 + 1200031 - 5818, "", "", "", "", "");

}
myself.FHTML_SetStr(fhtml0, "cropname", s0);
myself.FHTML_SetInt(fhtml0, "CurrentSeedCount", myself.GetCurrentSeedSellCountSet(i0, reply));
myself.FHTML_SetInt(fhtml0, "CurrentSeedPrice", myself.GetCurrentSeedPrice(i0, reply));
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount", myself.GetProcurementCount(i0, reply));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice", myself.GetProcurementRate(i0, reply));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType", myself.GetProcurementType(i0, reply));
myself.FHTML_SetInt(fhtml0, "NextSeedCount", myself.GetNextSeedSellCountSet(i0, reply));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice", myself.GetNextSeedPrice(i0, reply));
myself.FHTML_SetInt(fhtml0, "NextProcureCount", myself.GetNextProcurementCount(i0, reply));
myself.FHTML_SetInt(fhtml0, "NextProcurePrice", myself.GetNextProcurementRate(i0, reply));
myself.FHTML_SetInt(fhtml0, "NextProcureType", myself.GetNextProcurementType(i0, reply));
myself.FHTML_SetInt(fhtml0, "manorid", i0);
myself.FHTML_SetInt(fhtml0, "cropid", reply);
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -252 && myself.IsManorSettingTime() == 0) {
myself.FHTML_SetFileName(fhtml0, "manor_timeinfo_lord.htm");
myself.ShowFHTML(talker, fhtml0);

} else if (ask == -253) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = myself.GetCookie(talker, "ManorId");
i1 = i0 * 10 + reply;
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + i1 + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(i0, i2));

}

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + i1 + ".htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "CurrentCropProcureCount" + i2, myself.GetProcurementCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "RemainCropCount" + i2, myself.GetRemainProcureCropCount(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentCropPrice" + i2, myself.GetProcurementRate(i0, i2));
myself.FHTML_SetInt(fhtml0, "CurrentProcureType" + i2, myself.GetProcurementType(i0, i2));

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -255) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = reply;
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + "3.htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -257) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = reply;
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + "3.htm");
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -256) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 17) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = reply;
if (state == 1) {
myself.FHTML_SetFileName(fhtml0, "manormanage" + reply + "3.htm");

} else if (state == 2) {
myself.FHTML_SetFileName(fhtml0, "im_manormanage" + reply + "3.htm");

}
for (i2 = 1; i2 <= 25; i2 = i2 + 1) {
myself.FHTML_SetInt(fhtml0, "NextSeedCount" + i2, myself.GetNextSeedSellCountSet(i0, i2));
myself.FHTML_SetInt(fhtml0, "NextSeedPrice" + i2, myself.GetNextSeedPrice(i0, i2));

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -260) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 19) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (gg.GetSSQPart(talker) == 2) {
if (myself.GetSSQStatus() == 1) {
if (myself.GetTicketBuyCount(talker) < SSQ_DawnTicketQuantity / SSQ_DawnTicketBundle) {
if (gg.OwnItemCount(talker, 57) >= SSQ_DawnTicketPrice * SSQ_DawnTicketBundle) {
myself.DeleteItem1(talker, 57, SSQ_DawnTicketPrice * SSQ_DawnTicketBundle);
myself.GiveItem1(talker, 6388, SSQ_DawnTicketBundle);
myself.SetTicketBuyCount(talker, myself.GetTicketBuyCount(talker) + 1);

} else {
myself.ShowPage(talker, fnNotEnoughMoney);

}

} else {
myself.ShowPage(talker, fnNotEnoughTicket);

}

} else {
myself.ShowPage(talker, fnNotDawnOrEvent);

}

} else {
myself.ShowPage(talker, fnNotDawnOrEvent);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -270) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppManage) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = gg.FloatToInt(reply / 1000);
i1 = reply - i0 * 1000;
if (i1 == 0) {
myself.FHTML_SetFileName(fhtml0, fnDecoReset);
myself.FHTML_SetInt(fhtml0, "AgitDecoSubmit", reply);

} else {
if (myself.Agit_GetDecoLevel(i0) == i1) {
myself.FHTML_SetFileName(fhtml0, fnDecoAlreadySet);

} else {
myself.FHTML_SetFileName(fhtml0, "ol_mahum_" + fileSetName + "__" + gg.IntToStr(i0) + ".htm");
myself.FHTML_SetStr(fhtml0, "AgitDecoCost", gg.MakeFString(6, gg.IntToStr(myself.Agit_GetDecoFee(i0, i1)), gg.IntToStr(myself.Agit_GetDecoDay(i0, i1)), "", "", ""));
myself.FHTML_SetInt(fhtml0, "AgitDecoSubmit", reply);

}
if (i0 == decotype_hpregen) {
myself.FHTML_SetStr(fhtml0, "AgitDecoEffect", gg.MakeFString(fstr_percent, gg.IntToStr(i1 - 10 * 20), "", "", "", ""));

} else if (i0 == decotype_mpregen) {
myself.FHTML_SetStr(fhtml0, "AgitDecoEffect", gg.MakeFString(fstr_percent, gg.IntToStr(i1 - 10 * 5), "", "", "", ""));

} else if (i0 == decotype_xprestore) {
myself.FHTML_SetStr(fhtml0, "AgitDecoEffect", gg.MakeFString(fstr_percent, gg.IntToStr(i1 - 10 * 5), "", "", "", ""));

} else if (i0 == decotype_curtain) {
myself.FHTML_SetStr(fhtml0, "AgitDecoEffect", gg.MakeFString(fstr_percent, gg.IntToStr(i1 * 25), "", "", "", ""));

} else {
myself.FHTML_SetStr(fhtml0, "AgitDecoEffect", gg.MakeFString(fstr_stage_lv, gg.IntToStr(i1 - 10), "", "", "", ""));

}

}
myself.ShowFHTML(talker, fhtml0);

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -271) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppManage) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = gg.FloatToInt(reply / 1000);
i1 = reply - i0 * 1000;
if (i1 == 0) {
myself.Agit_ResetDeco(talker, i0);

} else if (gg.OwnItemCount(talker, 57) >= myself.Agit_GetDecoFee(i0, i1)) {
myself.SetCookie(talker, "AgitDecoFee", myself.Agit_GetDecoFee(i0, i1));
if (i0 == decotype_buff) {
if (i1 > 0) {
i2 = 286130177 + i1 - 10 * 256 * 256;
if (myself.Skill_GetConsumeMP(i2) < myself.sm.mp && myself.Skill_GetConsumeHP(i2) < myself.sm.hp && myself.Skill_InReuseDelay(i2) == 0) {
myself.AddUseSkillDesire(myself.sm, i2, 1, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(286195713) < myself.sm.mp && myself.Skill_GetConsumeHP(286195713) < myself.sm.hp && myself.Skill_InReuseDelay(286195713) == 0) {
myself.AddUseSkillDesire(myself.sm, 286195713, 1, 1, 1000000);

}

}
myself.Agit_SetDeco(talker, i0, i1);

} else {
myself.ShowPage(talker, fnNotEnoughMoney);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}

} else if (ask == -22208) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppDecoFunction) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (myself.Skill_GetConsumeMP(reply) < myself.sm.mp) {
if (myself.Skill_GetConsumeHP(reply) < myself.sm.hp && myself.Skill_InReuseDelay(reply) == 0) {
switch (reply) {
case 284557313: {

}
case 284557314: {

}
case 284622849: {

}
case 284622850: {

}
case 284622851: {

}
case 284688385: {

}
case 284688386: {

}
case 284688387: {

}
case 284753921: {

}
case 284753922: {

}
case 284753923: {

}
case 284819457: {

}
case 284819458: {

}
case 284819459: {

}
case 284819460: {

}
case 284884993: {

}
case 284884994: {

}
case 284884995: {

}
case 284884996: {

}
case 284884997: {

}
case 284884998: {

}
case 284950529: {

}
case 284950530: {

}
case 284950531: {

}
case 284950532: {

}
case 284950533: {

}
case 284950534: {

}
case 285016065: {

}
case 285016066: {

}
case 285081601: {

}
case 285081602: {

}
case 285081603: {

}
case 285081604: {

}
case 285147137: {

}
case 285147138: {

}
case 285147139: {

}
case 285147140: {

}
case 285147141: {

}
case 285147142: {

}
case 285212673: {

}
case 285212674: {

}
case 285278209: {

}
case 285278210: {

}
case 285278211: {

}
case 285278212: {

}
case 285278213: {

}
case 285278214: {

}
case 285343745: {

}
case 285343746: {

}
case 285343747: {

}
case 285343748: {

}
case 285409281: {

}
case 285409282: {

}
case 285409283: {

}
case 285474817: {

}
case 285474818: {

}
case 285474819: {

}
case 285540353: {

}
case 285540354: {

}
case 285605889: {

}
case 285605890: {

}
case 285605891: {

}
case 285671425: {

}
case 285671426: {

}
case 285671427: {

}
case 285736961: {

}
case 285736962: {

}
case 285736963: {
myself.CastBuffForAgitManager(talker, reply);
myself.FHTML_SetFileName(fhtml0, fnAfterBuff);
break;

}

}

} else {
myself.FHTML_SetFileName(fhtml0, fnNeedCoolTime);

}

} else {
myself.FHTML_SetFileName(fhtml0, fnNotEnoughMP);

}

}
myself.FHTML_SetInt(fhtml0, "MPLeft", gg.FloatToInt(myself.sm.mp));
myself.ShowFHTML(talker, fhtml0);

}
	}

	protected void DOOR_HP_LEVEL_INFORMED(HandlerParam talker, HandlerParam level, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 23) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = myself.GetCookie(talker, "gate_price");
i1 = myself.GetCookie(talker, "gate_level");
i2 = myself.GetCookie(talker, "gate_num");
if (level >= i1) {
myself.FHTML_SetFileName(fhtml0, fnCurrentDoorLevelHigher);
myself.FHTML_SetInt(fhtml0, "doorlevel", level);
myself.ShowFHTML(talker, fhtml0);

} else if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
switch (i2) {
case 1: {
myself.SetDoorHpLevel(DDoorName1_1, i1);
myself.SetDoorHpLevel(DDoorName1_2, i1);
break;

}
case 2: {
myself.SetDoorHpLevel(DDoorName2_1, i1);
myself.SetDoorHpLevel(DDoorName2_2, i1);
break;

}
case 3: {
myself.SetDoorHpLevel(DDoorName3_1, i1);
myself.SetDoorHpLevel(DDoorName3_2, i1);
break;

}
case 4: {
myself.SetDoorHpLevel(DDoorName4_1, i1);
myself.SetDoorHpLevel(DDoorName4_2, i1);
break;

}
case 21: {
myself.SetDoorHpLevel(WallName1, i1);
myself.SetDoorHpLevel(WallName2, i1);
break;

}
case 22: {
myself.SetDoorHpLevel(WallName3, i1);
break;

}

}
myself.ShowPage(talker, fnDoorHpLevelUp);

} else {
myself.ShowPage(talker, fnNotEnoughMoney);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
	}

	protected void CONTROLTOWER_LEVEL_INFORMED(HandlerParam talker, HandlerParam level, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.Castle_IsUnderSiege() || gg.GetDominionWarState(dominion_id) == 5) {
myself.ShowPage(talker, fnSiegeStoppedFunction);

} else if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, 23) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
i0 = myself.GetCookie(talker, "dmgzone_price");
i1 = myself.GetCookie(talker, "dmgzone_level");
i2 = myself.GetCookie(talker, "dmgzone_num");
if (level >= 2 * i1) {
myself.FHTML_SetFileName(fhtml0, fnCurrentDmgzoneLevelHigher);
myself.FHTML_SetInt(fhtml0, "dmglevel", level / 2);
myself.ShowFHTML(talker, fhtml0);

} else if (gg.OwnItemCount(talker, 57) >= i0) {
myself.DeleteItem1(talker, 57, i0);
switch (i2) {
case 1: {
myself.SetControlTowerLevel(dmgzonename1, 2 * i1);
break;

}
case 2: {
myself.SetControlTowerLevel(dmgzonename2, 2 * i1);
break;

}

}
myself.ShowPage(talker, fnDmgZoneLevelUp);

} else {
myself.ShowPage(talker, fnNotEnoughMoney);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
	}

	protected void MANOR_MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam state, HandlerParam time) {
if (state == -1) {
state = myself.sm.residence_id;

}
if (ask == 3) {
myself.ShowSeedInfo(talker, state, time);

} else if (ask == 4) {
myself.ShowCropInfo(talker, state, time);

} else if (ask == 5) {
myself.ShowManorDefaultInfo(talker);

} else if (ask == 7) {
myself.ShowSeedSetting(talker, state);

} else if (ask == 8) {
myself.ShowCropSetting(talker, state);

}
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (myself.IsMyLord(talker) || myself.HavePledgePower(talker, ppSetGate) && myself.Castle_GetPledgeId() == talker.pledge_id && talker.pledge_id != 0) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else if (myself.Agit_GetDecoLevel(decotype_teleport) == 11) {
myself.Teleport(talker, Position1, ShopName, "", "", "", 57, "");

} else if (myself.Agit_GetDecoLevel(decotype_teleport) == 12) {
myself.Teleport(talker, Position2, ShopName, "", "", "", 57, "");

} else {
myself.ShowPage(talker, fnFuncDisabled);

}

} else {
myself.ShowPage(talker, fnNoAuthority);

}
	}

	protected void SET_AGIT_DECO_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply) {
if (gg.OwnItemCount(talker, 57) >= myself.GetCookie(talker, "AgitDecoFee")) {
myself.DeleteItem1(talker, 57, myself.GetCookie(talker, "AgitDecoFee"));
myself.ShowPage(talker, fnAfterSetDeco);

} else {
myself.ShowPage(talker, fnNotEnoughMoney);

}

} else {
myself.ShowPage(talker, fnFailtoSetDeco);

}
	}

	protected void RESET_AGIT_DECO_RETURNED(HandlerParam talker, HandlerParam reply) {
if (reply) {
myself.ShowPage(talker, fnAfterResetDeco);

} else {
myself.ShowPage(talker, fnFailtoResetDeco);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 1077) {
if (myself.Agit_GetDecoLevel(decotype_buff) > 0) {
i0 = 286130177 + myself.Agit_GetDecoLevel(decotype_buff) - 10 * 256 * 256;
if (myself.Skill_GetConsumeMP(i0) < myself.sm.mp && myself.Skill_GetConsumeHP(i0) < myself.sm.hp && myself.Skill_InReuseDelay(i0) == 0) {
myself.AddUseSkillDesire(myself.sm, i0, 1, 1, 1000000);

}

} else if (myself.Skill_GetConsumeMP(286195713) < myself.sm.mp && myself.Skill_GetConsumeHP(286195713) < myself.sm.hp && myself.Skill_InReuseDelay(286195713) == 0) {
myself.AddUseSkillDesire(myself.sm, 286195713, 1, 1, 1000000);

}
myself.AddTimerEx(1077, 300000);

}
super;
	}

	protected void GET_RELATED_FORTRESS_LIST_RETURNED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam fhtml0) {
myself.FHTML_SetFileName(fhtml0, fnMyFortressStatus);
if (i0 > 100) {
i5 = gg.Fortress_GetContractStatus(i0);
i6 = fortress_fstr + i0 - 101;
i7 = fortress_status + i5;
i8 = fortress_dependancy + myself.Fortress_IsInBoundary(i0);
myself.FHTML_SetStr(fhtml0, "name_fortress1", gg.MakeFString(i6, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "status_fortress1", gg.MakeFString(i7, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "boundary_fortress1", gg.MakeFString(i8, "", "", "", "", ""));
i5 = 0;
i6 = 0;
i7 = 0;
i8 = 0;

}
if (i1 > 100) {
i5 = gg.Fortress_GetContractStatus(i1);
i6 = fortress_fstr + i1 - 101;
i7 = fortress_status + i5;
i8 = fortress_dependancy + myself.Fortress_IsInBoundary(i1);
myself.FHTML_SetStr(fhtml0, "name_fortress2", gg.MakeFString(i6, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "status_fortress2", gg.MakeFString(i7, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "boundary_fortress2", gg.MakeFString(i8, "", "", "", "", ""));
i5 = 0;
i6 = 0;
i7 = 0;
i8 = 0;

}
if (i2 > 100) {
i5 = gg.Fortress_GetContractStatus(i2);
i6 = fortress_fstr + i2 - 101;
i7 = fortress_status + i5;
i8 = fortress_dependancy + myself.Fortress_IsInBoundary(i2);
myself.FHTML_SetStr(fhtml0, "name_fortress3", gg.MakeFString(i6, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "status_fortress3", gg.MakeFString(i7, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "boundary_fortress3", gg.MakeFString(i8, "", "", "", "", ""));
i5 = 0;
i6 = 0;
i7 = 0;
i8 = 0;

}
if (i3 > 100) {
i5 = gg.Fortress_GetContractStatus(i3);
i6 = fortress_fstr + i3 - 101;
i7 = fortress_status + i5;
i8 = fortress_dependancy + myself.Fortress_IsInBoundary(i3);
myself.FHTML_SetStr(fhtml0, "name_fortress4", gg.MakeFString(i6, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "status_fortress4", gg.MakeFString(i7, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "boundary_fortress4", gg.MakeFString(i8, "", "", "", "", ""));
i5 = 0;
i6 = 0;
i7 = 0;
i8 = 0;

}
if (i4 > 100) {
i5 = gg.Fortress_GetContractStatus(i4);
i6 = fortress_fstr + i4 - 101;
i7 = fortress_status + i5;
i8 = fortress_dependancy + myself.Fortress_IsInBoundary(i4);
myself.FHTML_SetStr(fhtml0, "name_fortress5", gg.MakeFString(i6, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "status_fortress5", gg.MakeFString(i7, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "boundary_fortress5", gg.MakeFString(i8, "", "", "", "", ""));
i5 = 0;
i6 = 0;
i7 = 0;
i8 = 0;

}
myself.ShowFHTML(talker, fhtml0);
	}


}