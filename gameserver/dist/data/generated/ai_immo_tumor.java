package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_immo_tumor extends default_npc {
	protected String dispatcher_maker = "rumwarsha14_1424_dispm1";
	protected int tide = 0;
	protected int room = 0;
	protected int zone = 0;
	protected String type = "";
	protected int Skill_Branding = 542375937;
	protected int Skill_dying_display = 395640833;
	protected int Skill_clutch = 392167425;
	protected int regen_value = 24;
	protected int IsAggressive = 0;
	protected double Aggressive_Time = 30.000000;
	protected double Attack_DecayRatio = 6.600000;
	protected double UseSkill_DecayRatio = 66000.000000;
	protected double Attack_BoostValue = 300.000000;
	protected double UseSkill_BoostValue = 100000.000000;
	protected double DefaultHate = 100.000000;
	protected double Maximum_Hate = 999999984306749440.000000;
	protected int HateClassGroup1 = 4;
	protected double HateClassGroup1Boost = 80.000000;
	protected int HateClassGroup2 = 5;
	protected double HateClassGroup2Boost = 40.000000;
	protected int FavorClassGroup1 = 3;
	protected double FavorClassGroup1Boost = 20.000000;
	protected double ATTACKED_Weight_Point = 2.000000;
	protected double CLAN_ATTACKED_Weight_Point = 0.000000;
	protected double PARTY_ATTACKED_Weight_Point = 0.000000;
	protected double SEE_SPELL_Weight_Point = 1.000000;
	protected double HATE_SKILL_Weight_Point = 100.000000;
	protected double TUMOR_ATTACKED_Weight_Point = 0.000000;
	protected double VEIN_SIGNAL_Weight_Point = 0.000000;
	protected double TUMOR_HELP_Weight_Point = 0.000000;
	protected double LIFESEED_TAUNT_Weight_Point = 0.000000;
	protected int TACT_AGGRESIVE = 0;
	protected int TACT_INTERCEPT = 1;
	protected int TACT_DEFENSIVE = 2;
	protected int reward_siege = 13797;
	protected int reward_rate_destroyed = 70;
	protected int reward_quantity_destroyed = 10;
	protected int TM_RESPAWN_INVIN = 78001;
	protected int TIME_respawn_invin = 60;
	protected int TM_SPAWN_VEIN = 78002;
	protected int TM_SEND_HELP = 78003;
	protected int TM_CLUTCH = 78004;
	protected int TM_AREA_RENEW = 78005;
	protected int TIME_AREA_RENEW = 60;
	protected int TIME_clutch = 60;
	protected int duration_clutch = 60;
	protected int babble_mode = 0;
	protected String area_z2a_r212_mob_atk1 = "14_24_undying_z2a_r212_atk_up1";
	protected String area_z2a_r222_mob_atk1 = "14_24_undying_z2a_r222_atk_up1";
	protected String area_z2a_r232_mob_atk1 = "14_24_undying_z2a_r232_atk_up1";
	protected String area_z2a_r242_mob_atk1 = "14_24_undying_z2a_r242_atk_up1";
	protected String area_z2a_r211_mob_atk1 = "14_24_undying_z2a_r211_atk_up1";
	protected String area_z2a_r221_mob_atk1 = "14_24_undying_z2a_r221_atk_up1";
	protected String area_z2a_r231_mob_atk1 = "14_24_undying_z2a_r231_atk_up1";
	protected String area_z2a_r241_mob_atk1 = "14_24_undying_z2a_r241_atk_up1";
	protected String area_z2a_r212_mob_atk2 = "14_24_undying_z2a_r212_atk_up2";
	protected String area_z2a_r222_mob_atk2 = "14_24_undying_z2a_r222_atk_up2";
	protected String area_z2a_r232_mob_atk2 = "14_24_undying_z2a_r232_atk_up2";
	protected String area_z2a_r242_mob_atk2 = "14_24_undying_z2a_r242_atk_up2";
	protected String area_z2a_r211_mob_atk2 = "14_24_undying_z2a_r211_atk_up2";
	protected String area_z2a_r221_mob_atk2 = "14_24_undying_z2a_r221_atk_up2";
	protected String area_z2a_r231_mob_atk2 = "14_24_undying_z2a_r231_atk_up2";
	protected String area_z2a_r241_mob_atk2 = "14_24_undying_z2a_r241_atk_up2";
	protected String area_z2a_r212_mob_atk3 = "14_24_undying_z2a_r212_atk_up3";
	protected String area_z2a_r222_mob_atk3 = "14_24_undying_z2a_r222_atk_up3";
	protected String area_z2a_r232_mob_atk3 = "14_24_undying_z2a_r232_atk_up3";
	protected String area_z2a_r242_mob_atk3 = "14_24_undying_z2a_r242_atk_up3";
	protected String area_z2a_r211_mob_atk3 = "14_24_undying_z2a_r211_atk_up3";
	protected String area_z2a_r221_mob_atk3 = "14_24_undying_z2a_r221_atk_up3";
	protected String area_z2a_r231_mob_atk3 = "14_24_undying_z2a_r231_atk_up3";
	protected String area_z2a_r241_mob_atk3 = "14_24_undying_z2a_r241_atk_up3";
	protected String area_z2a_r212_mob_atk4 = "14_24_undying_z2a_r212_atk_up4";
	protected String area_z2a_r222_mob_atk4 = "14_24_undying_z2a_r222_atk_up4";
	protected String area_z2a_r232_mob_atk4 = "14_24_undying_z2a_r232_atk_up4";
	protected String area_z2a_r242_mob_atk4 = "14_24_undying_z2a_r242_atk_up4";
	protected String area_z2a_r211_mob_atk4 = "14_24_undying_z2a_r211_atk_up4";
	protected String area_z2a_r221_mob_atk4 = "14_24_undying_z2a_r221_atk_up4";
	protected String area_z2a_r231_mob_atk4 = "14_24_undying_z2a_r231_atk_up4";
	protected String area_z2a_r241_mob_atk4 = "14_24_undying_z2a_r241_atk_up4";
	protected String area_z2a_r212_mob_atk5 = "14_24_undying_z2a_r212_atk_up5";
	protected String area_z2a_r222_mob_atk5 = "14_24_undying_z2a_r222_atk_up5";
	protected String area_z2a_r232_mob_atk5 = "14_24_undying_z2a_r232_atk_up5";
	protected String area_z2a_r242_mob_atk5 = "14_24_undying_z2a_r242_atk_up5";
	protected String area_z2a_r211_mob_atk5 = "14_24_undying_z2a_r211_atk_up5";
	protected String area_z2a_r221_mob_atk5 = "14_24_undying_z2a_r221_atk_up5";
	protected String area_z2a_r231_mob_atk5 = "14_24_undying_z2a_r231_atk_up5";
	protected String area_z2a_r241_mob_atk5 = "14_24_undying_z2a_r241_atk_up5";
	protected String area_z2a_r212_mob_def1 = "14_24_undying_z2a_r212_def_up1";
	protected String area_z2a_r222_mob_def1 = "14_24_undying_z2a_r222_def_up1";
	protected String area_z2a_r232_mob_def1 = "14_24_undying_z2a_r232_def_up1";
	protected String area_z2a_r242_mob_def1 = "14_24_undying_z2a_r242_def_up1";
	protected String area_z2a_r211_mob_def1 = "14_24_undying_z2a_r211_def_up1";
	protected String area_z2a_r221_mob_def1 = "14_24_undying_z2a_r221_def_up1";
	protected String area_z2a_r231_mob_def1 = "14_24_undying_z2a_r231_def_up1";
	protected String area_z2a_r241_mob_def1 = "14_24_undying_z2a_r241_def_up1";
	protected String area_z2a_r212_mob_def2 = "14_24_undying_z2a_r212_def_up2";
	protected String area_z2a_r222_mob_def2 = "14_24_undying_z2a_r222_def_up2";
	protected String area_z2a_r232_mob_def2 = "14_24_undying_z2a_r232_def_up2";
	protected String area_z2a_r242_mob_def2 = "14_24_undying_z2a_r242_def_up2";
	protected String area_z2a_r211_mob_def2 = "14_24_undying_z2a_r211_def_up2";
	protected String area_z2a_r221_mob_def2 = "14_24_undying_z2a_r221_def_up2";
	protected String area_z2a_r231_mob_def2 = "14_24_undying_z2a_r231_def_up2";
	protected String area_z2a_r241_mob_def2 = "14_24_undying_z2a_r241_def_up2";
	protected String area_z2a_r212_mob_def3 = "14_24_undying_z2a_r212_def_up3";
	protected String area_z2a_r222_mob_def3 = "14_24_undying_z2a_r222_def_up3";
	protected String area_z2a_r232_mob_def3 = "14_24_undying_z2a_r232_def_up3";
	protected String area_z2a_r242_mob_def3 = "14_24_undying_z2a_r242_def_up3";
	protected String area_z2a_r211_mob_def3 = "14_24_undying_z2a_r211_def_up3";
	protected String area_z2a_r221_mob_def3 = "14_24_undying_z2a_r221_def_up3";
	protected String area_z2a_r231_mob_def3 = "14_24_undying_z2a_r231_def_up3";
	protected String area_z2a_r241_mob_def3 = "14_24_undying_z2a_r241_def_up3";
	protected String area_z2a_r212_mob_def4 = "14_24_undying_z2a_r212_def_up4";
	protected String area_z2a_r222_mob_def4 = "14_24_undying_z2a_r222_def_up4";
	protected String area_z2a_r232_mob_def4 = "14_24_undying_z2a_r232_def_up4";
	protected String area_z2a_r242_mob_def4 = "14_24_undying_z2a_r242_def_up4";
	protected String area_z2a_r211_mob_def4 = "14_24_undying_z2a_r211_def_up4";
	protected String area_z2a_r221_mob_def4 = "14_24_undying_z2a_r221_def_up4";
	protected String area_z2a_r231_mob_def4 = "14_24_undying_z2a_r231_def_up4";
	protected String area_z2a_r241_mob_def4 = "14_24_undying_z2a_r241_def_up4";
	protected String area_z2a_r212_mob_def5 = "14_24_undying_z2a_r212_def_up5";
	protected String area_z2a_r222_mob_def5 = "14_24_undying_z2a_r222_def_up5";
	protected String area_z2a_r232_mob_def5 = "14_24_undying_z2a_r232_def_up5";
	protected String area_z2a_r242_mob_def5 = "14_24_undying_z2a_r242_def_up5";
	protected String area_z2a_r211_mob_def5 = "14_24_undying_z2a_r211_def_up5";
	protected String area_z2a_r221_mob_def5 = "14_24_undying_z2a_r221_def_up5";
	protected String area_z2a_r231_mob_def5 = "14_24_undying_z2a_r231_def_up5";
	protected String area_z2a_r241_mob_def5 = "14_24_undying_z2a_r241_def_up5";
	protected String area_z2d_r212_mob_atk1 = "14_24_undying_z2d_r212_atk_up1";
	protected String area_z2d_r222_mob_atk1 = "14_24_undying_z2d_r222_atk_up1";
	protected String area_z2d_r232_mob_atk1 = "14_24_undying_z2d_r232_atk_up1";
	protected String area_z2d_r242_mob_atk1 = "14_24_undying_z2d_r242_atk_up1";
	protected String area_z2d_r211_mob_atk1 = "14_24_undying_z2d_r211_atk_up1";
	protected String area_z2d_r221_mob_atk1 = "14_24_undying_z2d_r221_atk_up1";
	protected String area_z2d_r231_mob_atk1 = "14_24_undying_z2d_r231_atk_up1";
	protected String area_z2d_r241_mob_atk1 = "14_24_undying_z2d_r241_atk_up1";
	protected String area_z2d_r212_mob_atk2 = "14_24_undying_z2d_r212_atk_up2";
	protected String area_z2d_r222_mob_atk2 = "14_24_undying_z2d_r222_atk_up2";
	protected String area_z2d_r232_mob_atk2 = "14_24_undying_z2d_r232_atk_up2";
	protected String area_z2d_r242_mob_atk2 = "14_24_undying_z2d_r242_atk_up2";
	protected String area_z2d_r211_mob_atk2 = "14_24_undying_z2d_r211_atk_up2";
	protected String area_z2d_r221_mob_atk2 = "14_24_undying_z2d_r221_atk_up2";
	protected String area_z2d_r231_mob_atk2 = "14_24_undying_z2d_r231_atk_up2";
	protected String area_z2d_r241_mob_atk2 = "14_24_undying_z2d_r241_atk_up2";
	protected String area_z2d_r212_mob_atk3 = "14_24_undying_z2d_r212_atk_up3";
	protected String area_z2d_r222_mob_atk3 = "14_24_undying_z2d_r222_atk_up3";
	protected String area_z2d_r232_mob_atk3 = "14_24_undying_z2d_r232_atk_up3";
	protected String area_z2d_r242_mob_atk3 = "14_24_undying_z2d_r242_atk_up3";
	protected String area_z2d_r211_mob_atk3 = "14_24_undying_z2d_r211_atk_up3";
	protected String area_z2d_r221_mob_atk3 = "14_24_undying_z2d_r221_atk_up3";
	protected String area_z2d_r231_mob_atk3 = "14_24_undying_z2d_r231_atk_up3";
	protected String area_z2d_r241_mob_atk3 = "14_24_undying_z2d_r241_atk_up3";
	protected String area_z2d_r212_mob_atk4 = "14_24_undying_z2d_r212_atk_up4";
	protected String area_z2d_r222_mob_atk4 = "14_24_undying_z2d_r222_atk_up4";
	protected String area_z2d_r232_mob_atk4 = "14_24_undying_z2d_r232_atk_up4";
	protected String area_z2d_r242_mob_atk4 = "14_24_undying_z2d_r242_atk_up4";
	protected String area_z2d_r211_mob_atk4 = "14_24_undying_z2d_r211_atk_up4";
	protected String area_z2d_r221_mob_atk4 = "14_24_undying_z2d_r221_atk_up4";
	protected String area_z2d_r231_mob_atk4 = "14_24_undying_z2d_r231_atk_up4";
	protected String area_z2d_r241_mob_atk4 = "14_24_undying_z2d_r241_atk_up4";
	protected String area_z2d_r212_mob_atk5 = "14_24_undying_z2d_r212_atk_up5";
	protected String area_z2d_r222_mob_atk5 = "14_24_undying_z2d_r222_atk_up5";
	protected String area_z2d_r232_mob_atk5 = "14_24_undying_z2d_r232_atk_up5";
	protected String area_z2d_r242_mob_atk5 = "14_24_undying_z2d_r242_atk_up5";
	protected String area_z2d_r211_mob_atk5 = "14_24_undying_z2d_r211_atk_up5";
	protected String area_z2d_r221_mob_atk5 = "14_24_undying_z2d_r221_atk_up5";
	protected String area_z2d_r231_mob_atk5 = "14_24_undying_z2d_r231_atk_up5";
	protected String area_z2d_r241_mob_atk5 = "14_24_undying_z2d_r241_atk_up5";
	protected String area_z2d_r212_mob_def1 = "14_24_undying_z2d_r212_def_up1";
	protected String area_z2d_r222_mob_def1 = "14_24_undying_z2d_r222_def_up1";
	protected String area_z2d_r232_mob_def1 = "14_24_undying_z2d_r232_def_up1";
	protected String area_z2d_r242_mob_def1 = "14_24_undying_z2d_r242_def_up1";
	protected String area_z2d_r211_mob_def1 = "14_24_undying_z2d_r211_def_up1";
	protected String area_z2d_r221_mob_def1 = "14_24_undying_z2d_r221_def_up1";
	protected String area_z2d_r231_mob_def1 = "14_24_undying_z2d_r231_def_up1";
	protected String area_z2d_r241_mob_def1 = "14_24_undying_z2d_r241_def_up1";
	protected String area_z2d_r212_mob_def2 = "14_24_undying_z2d_r212_def_up2";
	protected String area_z2d_r222_mob_def2 = "14_24_undying_z2d_r222_def_up2";
	protected String area_z2d_r232_mob_def2 = "14_24_undying_z2d_r232_def_up2";
	protected String area_z2d_r242_mob_def2 = "14_24_undying_z2d_r242_def_up2";
	protected String area_z2d_r211_mob_def2 = "14_24_undying_z2d_r211_def_up2";
	protected String area_z2d_r221_mob_def2 = "14_24_undying_z2d_r221_def_up2";
	protected String area_z2d_r231_mob_def2 = "14_24_undying_z2d_r231_def_up2";
	protected String area_z2d_r241_mob_def2 = "14_24_undying_z2d_r241_def_up2";
	protected String area_z2d_r212_mob_def3 = "14_24_undying_z2d_r212_def_up3";
	protected String area_z2d_r222_mob_def3 = "14_24_undying_z2d_r222_def_up3";
	protected String area_z2d_r232_mob_def3 = "14_24_undying_z2d_r232_def_up3";
	protected String area_z2d_r242_mob_def3 = "14_24_undying_z2d_r242_def_up3";
	protected String area_z2d_r211_mob_def3 = "14_24_undying_z2d_r211_def_up3";
	protected String area_z2d_r221_mob_def3 = "14_24_undying_z2d_r221_def_up3";
	protected String area_z2d_r231_mob_def3 = "14_24_undying_z2d_r231_def_up3";
	protected String area_z2d_r241_mob_def3 = "14_24_undying_z2d_r241_def_up3";
	protected String area_z2d_r212_mob_def4 = "14_24_undying_z2d_r212_def_up4";
	protected String area_z2d_r222_mob_def4 = "14_24_undying_z2d_r222_def_up4";
	protected String area_z2d_r232_mob_def4 = "14_24_undying_z2d_r232_def_up4";
	protected String area_z2d_r242_mob_def4 = "14_24_undying_z2d_r242_def_up4";
	protected String area_z2d_r211_mob_def4 = "14_24_undying_z2d_r211_def_up4";
	protected String area_z2d_r221_mob_def4 = "14_24_undying_z2d_r221_def_up4";
	protected String area_z2d_r231_mob_def4 = "14_24_undying_z2d_r231_def_up4";
	protected String area_z2d_r241_mob_def4 = "14_24_undying_z2d_r241_def_up4";
	protected String area_z2d_r212_mob_def5 = "14_24_undying_z2d_r212_def_up5";
	protected String area_z2d_r222_mob_def5 = "14_24_undying_z2d_r222_def_up5";
	protected String area_z2d_r232_mob_def5 = "14_24_undying_z2d_r232_def_up5";
	protected String area_z2d_r242_mob_def5 = "14_24_undying_z2d_r242_def_up5";
	protected String area_z2d_r211_mob_def5 = "14_24_undying_z2d_r211_def_up5";
	protected String area_z2d_r221_mob_def5 = "14_24_undying_z2d_r221_def_up5";
	protected String area_z2d_r231_mob_def5 = "14_24_undying_z2d_r231_def_up5";
	protected String area_z2d_r241_mob_def5 = "14_24_undying_z2d_r241_def_up5";
	protected String area_z3a_r301_mob_atk1 = "14_24_undying_z3a_r301_atk_up1";
	protected String area_z3a_r302_mob_atk1 = "14_24_undying_z3a_r302_atk_up1";
	protected String area_z3a_r303_mob_atk1 = "14_24_undying_z3a_r303_atk_up1";
	protected String area_z3a_r304_mob_atk1 = "14_24_undying_z3a_r304_atk_up1";
	protected String area_z3a_r305_mob_atk1 = "14_24_undying_z3a_r305_atk_up1";
	protected String area_z3a_r306_mob_atk1 = "14_24_undying_z3a_r306_atk_up1";
	protected String area_z3a_r301_mob_atk2 = "14_24_undying_z3a_r301_atk_up2";
	protected String area_z3a_r302_mob_atk2 = "14_24_undying_z3a_r302_atk_up2";
	protected String area_z3a_r303_mob_atk2 = "14_24_undying_z3a_r303_atk_up2";
	protected String area_z3a_r304_mob_atk2 = "14_24_undying_z3a_r304_atk_up2";
	protected String area_z3a_r305_mob_atk2 = "14_24_undying_z3a_r305_atk_up2";
	protected String area_z3a_r306_mob_atk2 = "14_24_undying_z3a_r306_atk_up2";
	protected String area_z3a_r301_mob_atk3 = "14_24_undying_z3a_r301_atk_up3";
	protected String area_z3a_r302_mob_atk3 = "14_24_undying_z3a_r302_atk_up3";
	protected String area_z3a_r303_mob_atk3 = "14_24_undying_z3a_r303_atk_up3";
	protected String area_z3a_r304_mob_atk3 = "14_24_undying_z3a_r304_atk_up3";
	protected String area_z3a_r305_mob_atk3 = "14_24_undying_z3a_r305_atk_up3";
	protected String area_z3a_r306_mob_atk3 = "14_24_undying_z3a_r306_atk_up3";
	protected String area_z3a_r301_mob_atk4 = "14_24_undying_z3a_r301_atk_up4";
	protected String area_z3a_r302_mob_atk4 = "14_24_undying_z3a_r302_atk_up4";
	protected String area_z3a_r303_mob_atk4 = "14_24_undying_z3a_r303_atk_up4";
	protected String area_z3a_r304_mob_atk4 = "14_24_undying_z3a_r304_atk_up4";
	protected String area_z3a_r305_mob_atk4 = "14_24_undying_z3a_r305_atk_up4";
	protected String area_z3a_r306_mob_atk4 = "14_24_undying_z3a_r306_atk_up4";
	protected String area_z3a_r301_mob_atk5 = "14_24_undying_z3a_r301_atk_up5";
	protected String area_z3a_r302_mob_atk5 = "14_24_undying_z3a_r302_atk_up5";
	protected String area_z3a_r303_mob_atk5 = "14_24_undying_z3a_r303_atk_up5";
	protected String area_z3a_r304_mob_atk5 = "14_24_undying_z3a_r304_atk_up5";
	protected String area_z3a_r305_mob_atk5 = "14_24_undying_z3a_r305_atk_up5";
	protected String area_z3a_r306_mob_atk5 = "14_24_undying_z3a_r306_atk_up5";
	protected String area_z3a_r301_mob_def1 = "14_24_undying_z3a_r301_def_up1";
	protected String area_z3a_r302_mob_def1 = "14_24_undying_z3a_r302_def_up1";
	protected String area_z3a_r303_mob_def1 = "14_24_undying_z3a_r303_def_up1";
	protected String area_z3a_r304_mob_def1 = "14_24_undying_z3a_r304_def_up1";
	protected String area_z3a_r305_mob_def1 = "14_24_undying_z3a_r305_def_up1";
	protected String area_z3a_r306_mob_def1 = "14_24_undying_z3a_r306_def_up1";
	protected String area_z3a_r301_mob_def2 = "14_24_undying_z3a_r301_def_up2";
	protected String area_z3a_r302_mob_def2 = "14_24_undying_z3a_r302_def_up2";
	protected String area_z3a_r303_mob_def2 = "14_24_undying_z3a_r303_def_up2";
	protected String area_z3a_r304_mob_def2 = "14_24_undying_z3a_r304_def_up2";
	protected String area_z3a_r305_mob_def2 = "14_24_undying_z3a_r305_def_up2";
	protected String area_z3a_r306_mob_def2 = "14_24_undying_z3a_r306_def_up2";
	protected String area_z3a_r301_mob_def3 = "14_24_undying_z3a_r301_def_up3";
	protected String area_z3a_r302_mob_def3 = "14_24_undying_z3a_r302_def_up3";
	protected String area_z3a_r303_mob_def3 = "14_24_undying_z3a_r303_def_up3";
	protected String area_z3a_r304_mob_def3 = "14_24_undying_z3a_r304_def_up3";
	protected String area_z3a_r305_mob_def3 = "14_24_undying_z3a_r305_def_up3";
	protected String area_z3a_r306_mob_def3 = "14_24_undying_z3a_r306_def_up3";
	protected String area_z3a_r301_mob_def4 = "14_24_undying_z3a_r301_def_up4";
	protected String area_z3a_r302_mob_def4 = "14_24_undying_z3a_r302_def_up4";
	protected String area_z3a_r303_mob_def4 = "14_24_undying_z3a_r303_def_up4";
	protected String area_z3a_r304_mob_def4 = "14_24_undying_z3a_r304_def_up4";
	protected String area_z3a_r305_mob_def4 = "14_24_undying_z3a_r305_def_up4";
	protected String area_z3a_r306_mob_def4 = "14_24_undying_z3a_r306_def_up4";
	protected String area_z3a_r301_mob_def5 = "14_24_undying_z3a_r301_def_up5";
	protected String area_z3a_r302_mob_def5 = "14_24_undying_z3a_r302_def_up5";
	protected String area_z3a_r303_mob_def5 = "14_24_undying_z3a_r303_def_up5";
	protected String area_z3a_r304_mob_def5 = "14_24_undying_z3a_r304_def_up5";
	protected String area_z3a_r305_mob_def5 = "14_24_undying_z3a_r305_def_up5";
	protected String area_z3a_r306_mob_def5 = "14_24_undying_z3a_r306_def_up5";
	protected String area_z3d_r301_mob_atk1 = "14_24_undying_z3d_r301_atk_up1";
	protected String area_z3d_r302_mob_atk1 = "14_24_undying_z3d_r302_atk_up1";
	protected String area_z3d_r303_mob_atk1 = "14_24_undying_z3d_r303_atk_up1";
	protected String area_z3d_r304_mob_atk1 = "14_24_undying_z3d_r304_atk_up1";
	protected String area_z3d_r305_mob_atk1 = "14_24_undying_z3d_r305_atk_up1";
	protected String area_z3d_r306_mob_atk1 = "14_24_undying_z3d_r306_atk_up1";
	protected String area_z3d_r301_mob_atk2 = "14_24_undying_z3d_r301_atk_up2";
	protected String area_z3d_r302_mob_atk2 = "14_24_undying_z3d_r302_atk_up2";
	protected String area_z3d_r303_mob_atk2 = "14_24_undying_z3d_r303_atk_up2";
	protected String area_z3d_r304_mob_atk2 = "14_24_undying_z3d_r304_atk_up2";
	protected String area_z3d_r305_mob_atk2 = "14_24_undying_z3d_r305_atk_up2";
	protected String area_z3d_r306_mob_atk2 = "14_24_undying_z3d_r306_atk_up2";
	protected String area_z3d_r301_mob_atk3 = "14_24_undying_z3d_r301_atk_up3";
	protected String area_z3d_r302_mob_atk3 = "14_24_undying_z3d_r302_atk_up3";
	protected String area_z3d_r303_mob_atk3 = "14_24_undying_z3d_r303_atk_up3";
	protected String area_z3d_r304_mob_atk3 = "14_24_undying_z3d_r304_atk_up3";
	protected String area_z3d_r305_mob_atk3 = "14_24_undying_z3d_r305_atk_up3";
	protected String area_z3d_r306_mob_atk3 = "14_24_undying_z3d_r306_atk_up3";
	protected String area_z3d_r301_mob_atk4 = "14_24_undying_z3d_r301_atk_up4";
	protected String area_z3d_r302_mob_atk4 = "14_24_undying_z3d_r302_atk_up4";
	protected String area_z3d_r303_mob_atk4 = "14_24_undying_z3d_r303_atk_up4";
	protected String area_z3d_r304_mob_atk4 = "14_24_undying_z3d_r304_atk_up4";
	protected String area_z3d_r305_mob_atk4 = "14_24_undying_z3d_r305_atk_up4";
	protected String area_z3d_r306_mob_atk4 = "14_24_undying_z3d_r306_atk_up4";
	protected String area_z3d_r301_mob_atk5 = "14_24_undying_z3d_r301_atk_up5";
	protected String area_z3d_r302_mob_atk5 = "14_24_undying_z3d_r302_atk_up5";
	protected String area_z3d_r303_mob_atk5 = "14_24_undying_z3d_r303_atk_up5";
	protected String area_z3d_r304_mob_atk5 = "14_24_undying_z3d_r304_atk_up5";
	protected String area_z3d_r305_mob_atk5 = "14_24_undying_z3d_r305_atk_up5";
	protected String area_z3d_r306_mob_atk5 = "14_24_undying_z3d_r306_atk_up5";
	protected String area_z3d_r301_mob_def1 = "14_24_undying_z3d_r301_def_up1";
	protected String area_z3d_r302_mob_def1 = "14_24_undying_z3d_r302_def_up1";
	protected String area_z3d_r303_mob_def1 = "14_24_undying_z3d_r303_def_up1";
	protected String area_z3d_r304_mob_def1 = "14_24_undying_z3d_r304_def_up1";
	protected String area_z3d_r305_mob_def1 = "14_24_undying_z3d_r305_def_up1";
	protected String area_z3d_r306_mob_def1 = "14_24_undying_z3d_r306_def_up1";
	protected String area_z3d_r301_mob_def2 = "14_24_undying_z3d_r301_def_up2";
	protected String area_z3d_r302_mob_def2 = "14_24_undying_z3d_r302_def_up2";
	protected String area_z3d_r303_mob_def2 = "14_24_undying_z3d_r303_def_up2";
	protected String area_z3d_r304_mob_def2 = "14_24_undying_z3d_r304_def_up2";
	protected String area_z3d_r305_mob_def2 = "14_24_undying_z3d_r305_def_up2";
	protected String area_z3d_r306_mob_def2 = "14_24_undying_z3d_r306_def_up2";
	protected String area_z3d_r301_mob_def3 = "14_24_undying_z3d_r301_def_up3";
	protected String area_z3d_r302_mob_def3 = "14_24_undying_z3d_r302_def_up3";
	protected String area_z3d_r303_mob_def3 = "14_24_undying_z3d_r303_def_up3";
	protected String area_z3d_r304_mob_def3 = "14_24_undying_z3d_r304_def_up3";
	protected String area_z3d_r305_mob_def3 = "14_24_undying_z3d_r305_def_up3";
	protected String area_z3d_r306_mob_def3 = "14_24_undying_z3d_r306_def_up3";
	protected String area_z3d_r301_mob_def4 = "14_24_undying_z3d_r301_def_up4";
	protected String area_z3d_r302_mob_def4 = "14_24_undying_z3d_r302_def_up4";
	protected String area_z3d_r303_mob_def4 = "14_24_undying_z3d_r303_def_up4";
	protected String area_z3d_r304_mob_def4 = "14_24_undying_z3d_r304_def_up4";
	protected String area_z3d_r305_mob_def4 = "14_24_undying_z3d_r305_def_up4";
	protected String area_z3d_r306_mob_def4 = "14_24_undying_z3d_r306_def_up4";
	protected String area_z3d_r301_mob_def5 = "14_24_undying_z3d_r301_def_up5";
	protected String area_z3d_r302_mob_def5 = "14_24_undying_z3d_r302_def_up5";
	protected String area_z3d_r303_mob_def5 = "14_24_undying_z3d_r303_def_up5";
	protected String area_z3d_r304_mob_def5 = "14_24_undying_z3d_r304_def_up5";
	protected String area_z3d_r305_mob_def5 = "14_24_undying_z3d_r305_def_up5";
	protected String area_z3d_r306_mob_def5 = "14_24_undying_z3d_r306_def_up5";

	protected void CREATED() {
myself.i_ai0 = 0;
myself.i_ai2 = 0;
myself.SetMaxHateListSize(1);
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp * 0.500000);
myself.AddTimerEx(TM_RESPAWN_INVIN, TIME_respawn_invin * 1000);
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam c0, HandlerParam f0) {
if (script_event_arg1 == 78010058 && myself.i_ai0 != 0) {
if (script_event_arg2 == 0) {
myself.i_ai2 = myself.i_ai2 + 1;
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen + regen_value);
c0 = gg.GetCreatureFromID(script_event_arg3);
if (myself.IsNullCreature(c0) == 0) {
gg.SendScriptEventEx(c0, 998915, 0, 0);

}
if (babble_mode == 1) {
myself.Say("재생력 상승! 영혼관" + gg.IntToStr(myself.i_ai2) + "개 리젠량" + gg.IntToStr(gg.FloatToInt(myself.sm.hp_regen)));

}

} else if (script_event_arg2 == 1) {
myself.i_ai2 = myself.i_ai2 - script_event_arg3;
if (gg.FloatToInt(myself.sm.hp_regen - script_event_arg3 * regen_value) > 0) {
gg.SetNpcParam(myself.sm, 35, myself.sm.hp_regen - script_event_arg3 * regen_value);

} else {
gg.SetNpcParam(myself.sm, 35, 0);

}
if (babble_mode == 1) {
myself.Say("재생력 하락! 영혼관" + gg.IntToStr(myself.i_ai2) + "개 리젠량" + gg.IntToStr(gg.FloatToInt(myself.sm.hp_regen)));

}

}

} else if (script_event_arg1 == 78010056) {
if (script_event_arg2 == 99) {
if (babble_mode == 1) {
myself.Say("리스폰 HP감소");

}
gg.SetNpcParam(myself.sm, 9, myself.sm.max_hp * 0.300000);

} else {
if (tide == 2 && script_event_arg2 == 0 || tide == 3 && script_event_arg2 == 0) {
f0 = 0.800000;

} else if (tide == 3 && script_event_arg2 == 1) {
f0 = 0.670000;

} else if (tide == 2 && script_event_arg2 == 1) {
f0 = 0.600000;

} else if (tide == 3 && script_event_arg2 == 2) {
f0 = 0.540000;

} else if (tide == 2 && script_event_arg2 == 2 || tide == 3 && script_event_arg2 == 3) {
f0 = 0.400000;

} else if (tide == 3 && script_event_arg2 == 4) {
f0 = 0.270000;

} else if (tide == 2 && script_event_arg2 == 3) {
f0 = 0.200000;

} else if (tide == 3 && script_event_arg2 == 5) {
f0 = 0.140000;

} else if (tide == 2 && script_event_arg2 == 4 || tide == 3 && script_event_arg2 == 6) {
f0 = 0.000000;

}
if (f0 > 0.000000) {
if (babble_mode == 1) {
myself.Say("종양체 상태에 따라 HP리젠");

}
myself.AddUseSkillDesire(myself.sm, Skill_dying_display, 1, 1, 10000000000);
gg.SetNpcParam(myself.sm, 9, myself.sm.hp + myself.sm.max_hp * f0);

}

}

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id, HandlerParam h0, HandlerParam f0, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
if (myself.sm.hp / myself.sm.max_hp >= 0.800000) {
i1 = 0;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.600000) {
i1 = 1;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.400000) {
i1 = 2;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.200000) {
i1 = 3;

} else if (myself.sm.hp / myself.sm.max_hp >= 0.010000) {
i1 = 4;

}
if (damage / myself.sm.max_hp >= 0.010000) {
i1 = i1 + 4;

} else if (damage / myself.sm.max_hp >= 0.006000) {
i1 = i1 + 3;

} else if (damage / myself.sm.max_hp >= 0.003000) {
i1 = i1 + 2;

} else if (damage / myself.sm.max_hp >= 0.001000) {
i1 = i1 + 1;

}
myself.BroadcastScriptEventEx(78010049, attacker.id, i1, 700);
if (skill_name_id == Skill_Branding) {
if (babble_mode == 1) {
myself.Say("실드 브랜딩에 맞음!");

}
if (myself.IsNullCreature(attacker) == 0 && attacker.is_pc == 1) {
myself.ShowSystemMessageStr(attacker, gg.MakeFString(1800292, gg.IntToStr(gg.FloatToInt(myself.sm.hp * 0.050000)), "", "", "", ""));
gg.SetNpcParam(myself.sm, 9, myself.sm.hp - myself.sm.hp * 0.050000);

}

}
if (attacker.is_pc != 0 || myself.IsInCategory(12, attacker.npc_class_id)) {
if (myself.GetHateInfoCount() == 0) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * ATTACKED_Weight_Point + Attack_BoostValue), 0, 1, 1);

} else {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddHateInfo(attacker, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

}

}
if (myself.IsInCategory(12, attacker.npc_class_id)) {
f0 = DefaultHate;
if (HateClassGroup1 > -1) {
if (myself.IsInCategory(HateClassGroup1, attacker.master.occupation)) {
f0 = f0 + HateClassGroup1Boost;

}

}
if (HateClassGroup2 > -1) {
if (myself.IsInCategory(HateClassGroup2, attacker.master.occupation)) {
f0 = f0 + HateClassGroup2Boost;

}

}
if (FavorClassGroup1 > -1) {
if (myself.IsInCategory(FavorClassGroup1, attacker.master.occupation)) {
f0 = f0 - FavorClassGroup1Boost;

}

}
if (f0 + 1 < 0) {
f0 = 0;

} else {
f0 = damage * f0 + 1;

}
myself.AddHateInfo(attacker.master, gg.FloatToInt(f0 * ATTACKED_Weight_Point), 0, 1, 1);

}
if (damage > 0) {
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0) {
if (h0.creature.is_pc == 1 && gg.GetAbnormalLevel(h0.creature, myself.Skill_GetAbnormalType(Skill_clutch)) > 0) {
myself.ShowSystemMessageStr(h0.creature, gg.MakeFString(1800260, gg.IntToStr(gg.FloatToInt(damage / 2)), "", "", "", ""));
gg.SetNpcParam(myself.sm, 9, myself.sm.hp + damage / 2);
gg.SetNpcParam(h0.creature, 9, h0.creature.hp - damage / 2);

}

}

}
	}

	protected void DESIRE_MANIPULATION(HandlerParam speller, HandlerParam desire) {
myself.MakeAttackEvent(speller, desire * HATE_SKILL_Weight_Point, 0);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam h0, HandlerParam f0) {
if (timer_id == TM_RESPAWN_INVIN) {
myself.i_ai0 = 1;
myself.BroadcastScriptEventEx(78010065, myself.sm.id, 0, 2000);
myself.AddTimerEx(TM_AREA_RENEW, 1 * 1000);
myself.AddTimerEx(TM_CLUTCH, TIME_clutch * 1000);

} else if (timer_id == TM_AREA_RENEW) {
if (babble_mode == 1) {
myself.Say("area 갱신");

}
i1 = tide;
if (myself.sm.hp / myself.sm.max_hp >= 0.950000) {
i0 = 5;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (babble_mode == 1) {
myself.Say("#" + gg.IntToStr(room) + " area lv" + gg.IntToStr(i0) + "/tide" + gg.IntToStr(i1));

}

} else if (myself.sm.hp / myself.sm.max_hp >= 0.800000) {
i0 = 4;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (babble_mode == 1) {
myself.Say("#" + gg.IntToStr(room) + " area lv" + gg.IntToStr(i0) + "/tide" + gg.IntToStr(i1));

}

} else if (myself.sm.hp / myself.sm.max_hp >= 0.600000) {
i0 = 3;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (babble_mode == 1) {
myself.Say("#" + gg.IntToStr(room) + " area lv" + gg.IntToStr(i0) + "/tide" + gg.IntToStr(i1));

}

} else if (myself.sm.hp / myself.sm.max_hp >= 0.400000) {
i0 = 2;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (babble_mode == 1) {
myself.Say("#" + gg.IntToStr(room) + " area lv" + gg.IntToStr(i0) + "/tide" + gg.IntToStr(i1));

}

} else if (myself.sm.hp / myself.sm.max_hp >= 0.200000) {
i0 = 1;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (babble_mode == 1) {
myself.Say("#" + gg.IntToStr(room) + " area lv" + gg.IntToStr(i0) + "/tide" + gg.IntToStr(i1));

}

} else {
i0 = 0;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (babble_mode == 1) {
myself.Say("#" + gg.IntToStr(room) + " area lv" + gg.IntToStr(i0) + "/tide" + gg.IntToStr(i1));

}

}
myself.AddTimerEx(TM_AREA_RENEW, TIME_AREA_RENEW * 1000);

} else if (timer_id == TM_CLUTCH) {
myself.RemoveAllAttackDesire();
myself.RemoveAllHateInfoIF(1, 0);
myself.RemoveAllHateInfoIF(3, 2000);
h0 = myself.GetMaxHateInfo(0);
i0 = 0;
if (myself.IsNullHateInfo(h0) == 0) {
if (myself.IsNullCreature(h0.creature) == 0) {
i0 = 1;

}

}
if (i0 == 1 && h0.hate > 0 && h0.creature.is_pc == 1) {
if (babble_mode == 1) {
myself.Say(h0.creature.name + "에 클러치 디버프!");

}
myself.AddUseSkillDesire(h0.creature, Skill_clutch, 0, 1, 10000000000);

}
myself.AddTimerEx(TM_CLUTCH, TIME_clutch * 1000);

}
	}

	protected void MY_DYING(HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam s0) {
if (babble_mode == 1) {
s0 = gg.IntToStr(room) + "번 방 종양체 비활성화!";
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
i0 = 0;
i1 = tide;
if (i1 == 0) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2a_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3a_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

} else if (i1 == 1) {
if (i0 == 0) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 1) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 2) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 3) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 4) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 0, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 0, myself.InstantZone_GetId());

}

} else if (i0 == 5) {
if (room == 212) {
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r212_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 222) {
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r222_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 232) {
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r232_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 242) {
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r242_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 211) {
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r211_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 221) {
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r221_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 231) {
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r231_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 241) {
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z2d_r241_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 301) {
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r301_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 1, myself.InstantZone_GetId());

} else if (room == 302) {
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r302_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 303) {
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r303_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 304) {
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r304_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 305) {
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r305_mob_def5, 1, myself.InstantZone_GetId());

} else if (room == 306) {
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_atk5, 1, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def1, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def2, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def3, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def4, 0, myself.InstantZone_GetId());
gg.Area_SetOnOffEx(area_z3d_r306_mob_def5, 1, myself.InstantZone_GetId());

}

}

}
if (gg.Rand(100) <= reward_rate_destroyed) {
if (babble_mode == 1) {
myself.Say("아이템 드랍");

}
myself.DropItem1(myself.sm, reward_siege, gg.Rand(reward_quantity_destroyed) + 1);

}
myself.BroadcastScriptEventEx(989812, 0, 0, 1500);
	}


}