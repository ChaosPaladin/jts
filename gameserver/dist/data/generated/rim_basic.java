package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class rim_basic extends warrior_basic {
	protected int Type = 0;
	protected int Buff = 284426241;
	protected int Debuff = 374800385;
	protected String MyMakerName = "rim25_trr_testm1";
	protected int Max_Npc = 7;
	protected int Max_Npc2 = 9;
	protected int Point_Kill_Basic = 10;
	protected int Point_Kill_Sp_A = 20;
	protected int Point_Kill_Sp_B = 50;
	protected int Point_UseSkill = 1;
	protected int Point_UseSpell = 1;
	protected int Point_ModHP = 4;
	protected int Point_ModMP = 2;
	protected int Point_LevDiff_PC = 3;
	protected int Point_LevDiff_NonPC = 1;
	protected int Point_WeaknessKill = 2;
	protected int Point_MobUseSkill1 = 1;
	protected int Point_MobUseSkill2 = 2;
	protected int Point_ClanAggro = 2;
	protected int Point_Buff = 2;
	protected int PrivatesNorm = 1022452;
	protected int PrivatesSpA = 1022453;
	protected int PrivatesSpB = 1022454;
	protected String Privates_AI = "rim_basic";
	protected int Prob_Chain_N_A = 400;
	protected int Prob_Chain_N_B = 200;
	protected int Prob_Chain_A_A = 150;
	protected int Prob_Chain_A_B = 300;
	protected int Prob_Chain_B_B = 100;
	protected int Prob_Chain_FastKill_NonMag = 50;
	protected int Prob_Chain_FastKill_Magic = 200;
	protected int DefaultCombatTime = 10;
	protected int Penalty_CombatTimeLong = 15;
	protected int Prob_Overheat = 100;
	protected int AutoDispawnTime = 30;
	protected int Prob_Susceptibilty_Norm = 10;
	protected int Prob_Susceptibilty_P_skill = 50;
	protected int Prob_Susceptibilty_Checktime = 10;
	protected int TM_CombatTimeCheck = 78001;
	protected int TM_AutoDispawnTimeCheck = 78002;
	protected int TM_Prob_Susceptibilty = 78003;
	protected int id_ab_hawk_eye = 0;
	protected int id_abnormal_invincibility = 172;
	protected int id_all_speed_down = 2;
	protected int id_armor_fire = 7;
	protected int id_armor_holy = 8;
	protected int id_armor_unholy = 9;
	protected int id_armor_water = 10;
	protected int id_armor_wind = 11;
	protected int id_attack_speed_up_bow = 12;
	protected int id_attack_time_down = 13;
	protected int id_avoid_skill = 166;
	protected int id_avoid_up = 16;
	protected int id_avoid_up_special = 17;
	protected int id_berserker = 18;
	protected int id_cancel_prob_down = 25;
	protected int id_casting_time_down = 26;
	protected int id_cheap_magic = 28;
	protected int id_counter_skill = 165;
	protected int id_cp_up = 167;
	protected int id_critical_dmg_up = 30;
	protected int id_critical_prob_up = 32;
	protected int id_decrease_weight_penalty = 48;
	protected int id_detect_weakness = 50;
	protected int id_dmg_shield = 51;
	protected int id_duelist_spirit = 55;
	protected int id_elemental_armor = 246;
	protected int id_focus_dagger = 59;
	protected int id_force_meditation = 183;
	protected int id_heal_effect_up = 61;
	protected int id_heal_power_up = 198;
	protected int id_hero_buff = 62;
	protected int id_hero_debuff = 63;
	protected int id_hit_up = 65;
	protected int id_holy_attack = 66;
	protected int id_hp_regen_up = 69;
	protected int id_improve_crt_rate_dmg_up = 251;
	protected int id_improve_hp_mp_up = 250;
	protected int id_improve_ma_md_up = 249;
	protected int id_improve_pa_pd_up = 248;
	protected int id_improve_shield_rate_defence_up = 252;
	protected int id_improve_speed_avoid_up = 253;
	protected int id_improve_vampiric_haste = 262;
	protected int id_instinct = 221;
	protected int id_invincibility = 171;
	protected int id_iron_shield = 188;
	protected int id_kamael_special = 203;
	protected int id_life_force_kamael = 236;
	protected int id_life_force_orc = 70;
	protected int id_life_force_others = 71;
	protected int id_ma_up = 79;
	protected int id_ma_up_special = 237;
	protected int id_magic_critical_up = 72;
	protected int id_majesty = 73;
	protected int id_max_breath_up = 74;
	protected int id_max_hp_up = 76;
	protected int id_max_mp_up = 77;
	protected int id_md_up = 82;
	protected int id_md_up_attr = 83;
	protected int id_might_mortal = 84;
	protected int id_mirage = 184;
	protected int id_mp_cost_down = 85;
	protected int id_mp_regen_up = 88;
	protected int id_multi_buff = 89;
	protected int id_pa_pd_up = 93;
	protected int id_pa_up = 94;
	protected int id_pa_up_special = 96;
	protected int id_pd_up = 98;
	protected int id_pd_up_bow = 99;
	protected int id_pd_up_special = 100;
	protected int id_pinch = 101;
	protected int id_polearm_attack = 103;
	protected int id_possession = 104;
	protected int id_preserve_abnormal = 105;
	protected int id_public_slot = 106;
	protected int id_recharge_up = 199;
	protected int id_reduce_drop_penalty = 108;
	protected int id_reflect_abnormal = 109;
	protected int id_resist_bleeding = 110;
	protected int id_resist_debuff_dispel = 111;
	protected int id_resist_derangement = 112;
	protected int id_resist_holy_unholy = 113;
	protected int id_resist_poison = 114;
	protected int id_resist_shock = 115;
	protected int id_resist_spiritless = 116;
	protected int id_resurrection_special = 164;
	protected int id_reuse_delay_down = 117;
	protected int id_root_magically = 120;
	protected int id_root_physically = 119;
	protected int id_seed_of_knight = 243;
	protected int id_shield_defence_up = 121;
	protected int id_shield_prob_up = 122;
	protected int id_snipe = 127;
	protected int id_speed_up = 147;
	protected int id_speed_up_special = 148;
	protected int id_stealth = 151;
	protected int id_t_crt_dmg_down = 220;
	protected int id_target_lock = 240;
	protected int id_thrill_fight = 224;
	protected int id_touch_of_life = 155;
	protected int id_transfer_damage = 189;
	protected int id_transform = 204;
	protected int id_transform_scrifice = 259;
	protected int id_vampiric_attack = 162;
	protected int Log_normal_Kill = 1001;
	protected int Log_spA_Kill = 1002;
	protected int Log_spB_Kill = 1003;
	protected int Log_pc_useSkill = 1004;
	protected int Log_pc_useSpell = 1005;
	protected int Log_pc_ModHpMp = 1006;
	protected int Log_pc_LevDiff = 1009;
	protected int Log_pc_Buff = 1010;
	protected int Log_mob_useSkill1 = 1011;
	protected int Log_mob_useSkill2 = 1012;
	protected int Log_CombatTimeLong = 1016;
	protected int Log_ClanAggro = 1017;
	protected int babble_mode = 0;
	protected int log_mode = 1;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 0;
if (Type == 1) {
myself.i_ai0 = Point_Kill_Sp_A;
myself.AddTimerEx(TM_AutoDispawnTimeCheck, AutoDispawnTime * 1000);

} else if (Type == 2) {
myself.i_ai0 = Point_Kill_Sp_B;
myself.AddTimerEx(TM_AutoDispawnTimeCheck, AutoDispawnTime * 2 * 1000);

} else {
myself.i_ai0 = Point_Kill_Basic;

}
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.AddTimerEx(TM_Prob_Susceptibilty, Prob_Susceptibilty_Checktime * 1000);
if (myself.sm.param1 == 1000) {
c0 = gg.GetCreatureFromID(myself.sm.param2);
if (myself.IsNullCreature(c0) == 0) {
myself.AddHateInfo(c0, 500, 0, 1, 1);
myself.AddAttackDesire(c0, 1, 1000);

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam skill_id, HandlerParam damage, HandlerParam i0, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3) {
if (myself.IsNullCreature(attacker) == 0) {
if (myself.i_ai1 <= 1 && attacker.is_pc == 1) {
i0 = myself.sm.level - attacker.level * Point_LevDiff_PC;
if (i0 != 0) {
myself.i_ai0 = myself.i_ai0 + i0;
if (babble_mode == 1) {
myself.Say("공격자 레벨 차이: " + gg.IntToStr(i0));

}
if (log_mode == 1) {
gg.AddLogEx(Log_pc_LevDiff, attacker, i0, 0);

}

}
f0 = attacker.hp;
f1 = attacker.max_hp;
f2 = attacker.mp;
f3 = attacker.max_mp;
myself.i_ai2 = gg.FloatToInt(f0);
myself.i_ai3 = gg.FloatToInt(f2);
if (myself.IsInCategory(3, attacker.occupation) != 1 || myself.IsInCategory(85, attacker.occupation) != 1 || myself.IsInCategory(92, attacker.occupation) != 1 || myself.IsInCategory(90, attacker.occupation) != 1) {
i0 = 0;
if (gg.GetAbnormalLevel(attacker, id_ab_hawk_eye) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_ab_hawk_eye);

}
if (gg.GetAbnormalLevel(attacker, id_abnormal_invincibility) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_abnormal_invincibility);

}
if (gg.GetAbnormalLevel(attacker, id_all_speed_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_all_speed_down);

}
if (gg.GetAbnormalLevel(attacker, id_armor_fire) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_armor_fire);

}
if (gg.GetAbnormalLevel(attacker, id_armor_holy) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_armor_holy);

}
if (gg.GetAbnormalLevel(attacker, id_armor_unholy) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_armor_unholy);

}
if (gg.GetAbnormalLevel(attacker, id_armor_water) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_armor_water);

}
if (gg.GetAbnormalLevel(attacker, id_armor_wind) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_armor_wind);

}
if (gg.GetAbnormalLevel(attacker, id_attack_speed_up_bow) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_attack_speed_up_bow);

}
if (gg.GetAbnormalLevel(attacker, id_attack_time_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_attack_time_down);

}
if (gg.GetAbnormalLevel(attacker, id_avoid_skill) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_avoid_skill);

}
if (gg.GetAbnormalLevel(attacker, id_avoid_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_avoid_up);

}
if (gg.GetAbnormalLevel(attacker, id_avoid_up_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_avoid_up_special);

}
if (gg.GetAbnormalLevel(attacker, id_berserker) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_berserker);

}
if (gg.GetAbnormalLevel(attacker, id_cancel_prob_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_cancel_prob_down);

}
if (gg.GetAbnormalLevel(attacker, id_casting_time_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_casting_time_down);

}
if (gg.GetAbnormalLevel(attacker, id_cheap_magic) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_cheap_magic);

}
if (gg.GetAbnormalLevel(attacker, id_counter_skill) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_counter_skill);

}
if (gg.GetAbnormalLevel(attacker, id_cp_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_cp_up);

}
if (gg.GetAbnormalLevel(attacker, id_critical_dmg_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_critical_dmg_up);

}
if (gg.GetAbnormalLevel(attacker, id_critical_prob_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_critical_prob_up);

}
if (gg.GetAbnormalLevel(attacker, id_decrease_weight_penalty) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_decrease_weight_penalty);

}
if (gg.GetAbnormalLevel(attacker, id_detect_weakness) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_detect_weakness);

}
if (gg.GetAbnormalLevel(attacker, id_dmg_shield) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_dmg_shield);

}
if (gg.GetAbnormalLevel(attacker, id_duelist_spirit) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_duelist_spirit);

}
if (gg.GetAbnormalLevel(attacker, id_elemental_armor) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_elemental_armor);

}
if (gg.GetAbnormalLevel(attacker, id_focus_dagger) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_focus_dagger);

}
if (gg.GetAbnormalLevel(attacker, id_force_meditation) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_force_meditation);

}
if (gg.GetAbnormalLevel(attacker, id_heal_effect_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_heal_effect_up);

}
if (gg.GetAbnormalLevel(attacker, id_heal_power_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_heal_power_up);

}
if (gg.GetAbnormalLevel(attacker, id_hero_buff) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_hero_buff);

}
if (gg.GetAbnormalLevel(attacker, id_hero_debuff) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_hero_debuff);

}
if (gg.GetAbnormalLevel(attacker, id_hit_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_hit_up);

}
if (gg.GetAbnormalLevel(attacker, id_holy_attack) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_holy_attack);

}
if (gg.GetAbnormalLevel(attacker, id_hp_regen_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_hp_regen_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_crt_rate_dmg_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_crt_rate_dmg_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_hp_mp_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_hp_mp_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_ma_md_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_ma_md_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_pa_pd_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_pa_pd_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_shield_rate_defence_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_shield_rate_defence_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_speed_avoid_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_speed_avoid_up);

}
if (gg.GetAbnormalLevel(attacker, id_improve_vampiric_haste) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_improve_vampiric_haste);

}
if (gg.GetAbnormalLevel(attacker, id_instinct) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_instinct);

}
if (gg.GetAbnormalLevel(attacker, id_invincibility) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_invincibility);

}
if (gg.GetAbnormalLevel(attacker, id_iron_shield) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_iron_shield);

}
if (gg.GetAbnormalLevel(attacker, id_kamael_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_kamael_special);

}
if (gg.GetAbnormalLevel(attacker, id_life_force_kamael) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_life_force_kamael);

}
if (gg.GetAbnormalLevel(attacker, id_life_force_orc) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_life_force_orc);

}
if (gg.GetAbnormalLevel(attacker, id_life_force_others) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_life_force_others);

}
if (gg.GetAbnormalLevel(attacker, id_ma_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_ma_up);

}
if (gg.GetAbnormalLevel(attacker, id_ma_up_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_ma_up_special);

}
if (gg.GetAbnormalLevel(attacker, id_magic_critical_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_magic_critical_up);

}
if (gg.GetAbnormalLevel(attacker, id_majesty) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_majesty);

}
if (gg.GetAbnormalLevel(attacker, id_max_breath_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_max_breath_up);

}
if (gg.GetAbnormalLevel(attacker, id_max_hp_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_max_hp_up);

}
if (gg.GetAbnormalLevel(attacker, id_max_mp_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_max_mp_up);

}
if (gg.GetAbnormalLevel(attacker, id_md_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_md_up);

}
if (gg.GetAbnormalLevel(attacker, id_md_up_attr) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_md_up_attr);

}
if (gg.GetAbnormalLevel(attacker, id_might_mortal) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_might_mortal);

}
if (gg.GetAbnormalLevel(attacker, id_mirage) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_mirage);

}
if (gg.GetAbnormalLevel(attacker, id_mp_cost_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_mp_cost_down);

}
if (gg.GetAbnormalLevel(attacker, id_mp_regen_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_mp_regen_up);

}
if (gg.GetAbnormalLevel(attacker, id_multi_buff) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_multi_buff);

}
if (gg.GetAbnormalLevel(attacker, id_pa_pd_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pa_pd_up);

}
if (gg.GetAbnormalLevel(attacker, id_pa_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pa_up);

}
if (gg.GetAbnormalLevel(attacker, id_pa_up_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pa_up_special);

}
if (gg.GetAbnormalLevel(attacker, id_pd_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pd_up);

}
if (gg.GetAbnormalLevel(attacker, id_pd_up_bow) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pd_up_bow);

}
if (gg.GetAbnormalLevel(attacker, id_pd_up_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pd_up_special);

}
if (gg.GetAbnormalLevel(attacker, id_pinch) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_pinch);

}
if (gg.GetAbnormalLevel(attacker, id_polearm_attack) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_polearm_attack);

}
if (gg.GetAbnormalLevel(attacker, id_possession) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_possession);

}
if (gg.GetAbnormalLevel(attacker, id_preserve_abnormal) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_preserve_abnormal);

}
if (gg.GetAbnormalLevel(attacker, id_public_slot) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_public_slot);

}
if (gg.GetAbnormalLevel(attacker, id_recharge_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_recharge_up);

}
if (gg.GetAbnormalLevel(attacker, id_reduce_drop_penalty) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_reduce_drop_penalty);

}
if (gg.GetAbnormalLevel(attacker, id_reflect_abnormal) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_reflect_abnormal);

}
if (gg.GetAbnormalLevel(attacker, id_resist_bleeding) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_bleeding);

}
if (gg.GetAbnormalLevel(attacker, id_resist_debuff_dispel) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_debuff_dispel);

}
if (gg.GetAbnormalLevel(attacker, id_resist_derangement) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_derangement);

}
if (gg.GetAbnormalLevel(attacker, id_resist_holy_unholy) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_holy_unholy);

}
if (gg.GetAbnormalLevel(attacker, id_resist_poison) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_poison);

}
if (gg.GetAbnormalLevel(attacker, id_resist_shock) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_shock);

}
if (gg.GetAbnormalLevel(attacker, id_resist_spiritless) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resist_spiritless);

}
if (gg.GetAbnormalLevel(attacker, id_resurrection_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_resurrection_special);

}
if (gg.GetAbnormalLevel(attacker, id_reuse_delay_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_reuse_delay_down);

}
if (gg.GetAbnormalLevel(attacker, id_root_magically) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_root_magically);

}
if (gg.GetAbnormalLevel(attacker, id_root_physically) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_root_physically);

}
if (gg.GetAbnormalLevel(attacker, id_seed_of_knight) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_seed_of_knight);

}
if (gg.GetAbnormalLevel(attacker, id_shield_defence_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_shield_defence_up);

}
if (gg.GetAbnormalLevel(attacker, id_shield_prob_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_shield_prob_up);

}
if (gg.GetAbnormalLevel(attacker, id_snipe) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_snipe);

}
if (gg.GetAbnormalLevel(attacker, id_speed_up) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_speed_up);

}
if (gg.GetAbnormalLevel(attacker, id_speed_up_special) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_speed_up_special);

}
if (gg.GetAbnormalLevel(attacker, id_stealth) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_stealth);

}
if (gg.GetAbnormalLevel(attacker, id_t_crt_dmg_down) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_t_crt_dmg_down);

}
if (gg.GetAbnormalLevel(attacker, id_target_lock) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_target_lock);

}
if (gg.GetAbnormalLevel(attacker, id_thrill_fight) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_thrill_fight);

}
if (gg.GetAbnormalLevel(attacker, id_touch_of_life) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_touch_of_life);

}
if (gg.GetAbnormalLevel(attacker, id_transfer_damage) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_transfer_damage);

}
if (gg.GetAbnormalLevel(attacker, id_transform) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_transform);

}
if (gg.GetAbnormalLevel(attacker, id_transform_scrifice) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_transform_scrifice);

}
if (gg.GetAbnormalLevel(attacker, id_vampiric_attack) > 0) {
i0 = i0 + gg.GetAbnormalLevel(attacker, id_vampiric_attack);

}
if (i0 > 0) {
if (babble_mode == 1) {
myself.Say("버프점수:" + gg.IntToStr(i0 / 10 * Point_Buff));

}
myself.i_ai0 = myself.i_ai0 - gg.FloatToInt(i0 / 10 * Point_Buff);
if (log_mode == 1) {
gg.AddLogEx(Log_pc_Buff, attacker, gg.FloatToInt(i0 / 10 * Point_Buff), 0);

}

}

}
if (myself.i_ai1 < 1) {
if (babble_mode == 1) {
myself.Say("PC를 통한 전투 시간 타이머 시작");

}
myself.AddTimerEx(TM_CombatTimeCheck, DefaultCombatTime * 1000);

}
if (myself.i_ai1 < 2) {
myself.i_ai1 = 2;

}

}
if (damage >= myself.sm.max_hp * 0.660000 && myself.i_ai4 >= 0 && myself.Maker_GetNpcCount() < Max_Npc || PrivatesSpB == 1022481 || PrivatesSpB == 1022484 && myself.Maker_GetNpcCount() < Max_Npc2 && myself.InMyTerritory(myself.sm) == 1) {
if (babble_mode == 1) {
myself.Say("1차 체인스폰 시도");

}
if (gg.Skill_IsMagic(skill_name_id) == 0) {
myself.i_ai4 = Prob_Chain_FastKill_Magic;

} else {
myself.i_ai4 = Prob_Chain_FastKill_NonMag;

}
if (babble_mode == 1) {
myself.Say("확률 수정치" + gg.IntToStr(myself.i_ai4 / 10) + "%");

}
if (Type == 2 && gg.Rand(1000) < Prob_Chain_B_B + myself.i_ai4 || Type == 1 && gg.Rand(1000) < Prob_Chain_A_B + myself.i_ai4 || Type == 0 && gg.Rand(1000) < Prob_Chain_N_B + myself.i_ai4) {
if (babble_mode == 1) {
myself.Say("1차 체인스폰:B 성공");

}
myself.CreateOnePrivateEx(PrivatesSpB, Privates_AI, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, attacker.id, 0);
myself.i_ai4 = -1;

} else if (Type == 1 && gg.Rand(1000) < Prob_Chain_A_A + myself.i_ai4 || Type == 0 && gg.Rand(1000) < Prob_Chain_N_A + myself.i_ai4) {
if (babble_mode == 1) {
myself.Say("1차 체인스폰:A 성공");

}
myself.CreateOnePrivateEx(PrivatesSpA, Privates_AI, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, attacker.id, 0);
myself.i_ai4 = -2;

} else {
if (babble_mode == 1) {
myself.Say("1차 체인스폰: 실패");

}
myself.i_ai4 = -99;

}

}
if (attacker.is_pc == 0 && myself.IsInCategory(35, attacker.npc_class_id) == 1 || myself.IsInCategory(12, attacker.npc_class_id) == 1) {
i0 = gg.FloatToInt(myself.sm.level - attacker.level + 3 * Point_LevDiff_NonPC / 2);
if (i0 < 0) {
myself.i_ai0 = myself.i_ai0 + i0;
if (babble_mode == 1) {
myself.Say("펫/소환수 레벨 차이: " + gg.IntToStr(i0));

}
if (log_mode == 1) {
gg.AddLogEx(Log_pc_LevDiff, attacker, i0, 0);

}

}
if (myself.i_ai1 <= 0) {
if (babble_mode == 1) {
myself.Say("펫/소환수를 통한 전투 시간 타이머 시작");

}
myself.AddTimerEx(TM_CombatTimeCheck, DefaultCombatTime * 1000);
myself.i_ai1 = 1;

}

}
if (skill_name_id > 0) {
if (babble_mode == 1) {
myself.Say("스킬 맞았음");

}
if (myself.Skill_GetEffectPoint(skill_name_id) < 0 && gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 100) != 0 && myself.Skill_GetConsumeMP(skill_name_id) > 0 || myself.Skill_GetConsumeHP(skill_name_id) > 0) {
if (gg.Skill_IsMagic(skill_name_id) == 0) {
if (skill_id == 503 || skill_id == 368) {
i0 = gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 1000 * Point_UseSkill);

} else {
i0 = gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 100 * Point_UseSkill);

}
if (babble_mode == 1) {
myself.Say("나를 타겟으로 한 적대적 스킬: 득점 +" + gg.IntToStr(i0));

}
myself.i_ai0 = myself.i_ai0 - i0;
if (log_mode == 1) {
gg.AddLogEx(Log_pc_useSkill, attacker, i0, 0);

}
if (gg.Rand(100) <= Prob_Susceptibilty_P_skill && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Debuff)) <= 0) {
if (babble_mode == 1) {
myself.Say("물리 스킬에 의한 디버프 발동" + gg.IntToStr(gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Debuff))));

}
myself.AddUseSkillDesire(myself.sm, Debuff, 0, 1, 100000000);

}

} else {
i0 = gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 100 * Point_UseSpell);
if (babble_mode == 1) {
myself.Say("나를 타겟으로 한 적대적 마법: 득점 +" + gg.IntToStr(i0));

}
myself.i_ai0 = myself.i_ai0 - i0;
if (log_mode == 1) {
gg.AddLogEx(Log_pc_useSpell, attacker, i0, 0);

}

}

}

}

} else if (babble_mode == 1) {
myself.Say("공격자 오류");

}
if (Type == 2 && myself.sm.hp <= myself.sm.max_hp * 0.300000 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) <= 0) {
if (babble_mode == 1) {
myself.Say("궁극버프 발동");

}
myself.AddUseSkillDesire(myself.sm, Buff, 0, 1, 10000000);

}
if (myself.sm.hp <= myself.sm.max_hp * 0.050000 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Debuff)) > 0) {
myself.i_ai0 = myself.i_ai0 + Point_WeaknessKill;
if (babble_mode == 1) {
myself.Say("디버프 걸린 상태에서 사망");

}

} else if (babble_mode == 1) {
myself.Say("디버프 안걸린 상태에서 사망");

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == TM_CombatTimeCheck && myself.sm.hp > 0 && myself.i_ai0 > 0) {
i0 = myself.i_ai0 * Penalty_CombatTimeLong / 100;
myself.i_ai0 = myself.i_ai0 - i0;
if (babble_mode == 1) {
myself.Say("전투 ?간 초과 페널티: " + gg.IntToStr(i0));

}
if (log_mode == 1) {
gg.AddLogExWithoutCreature(Log_CombatTimeLong, i0, 0);

}
myself.AddTimerEx(TM_CombatTimeCheck, DefaultCombatTime * 1000);

} else if (timer_id == TM_AutoDispawnTimeCheck && myself.sm.hp > 0) {
if (babble_mode == 1) {
myself.Say("특수NPC 잔류 시간 초과");

}
myself.Despawn();

} else if (timer_id == TM_Prob_Susceptibilty) {
if (gg.Rand(100) <= Prob_Susceptibilty_Norm && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Debuff)) <= 0) {
if (babble_mode == 1) {
myself.Say("확률에 의한 디버프 발동" + gg.IntToStr(gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Debuff))));

}
myself.AddUseSkillDesire(myself.sm, Debuff, 0, 1, 100000000);

}
myself.AddTimerEx(TM_Prob_Susceptibilty, Prob_Susceptibilty_Checktime * 1000);

}
super;
	}

	protected void SEE_SPELL(HandlerParam speller, HandlerParam skill_name_id, HandlerParam target, HandlerParam f0, HandlerParam i0) {
if (target == speller && myself.Skill_GetEffectPoint(skill_name_id) > 0 && gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 100) != 0) {
if (gg.Skill_IsMagic(skill_name_id) != 0) {
i0 = gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 100 * Point_UseSkill);
if (babble_mode == 1) {
myself.Say("PC를 타겟으로 한 우호적 스킬: 득점 +" + gg.IntToStr(i0));

}
myself.i_ai0 = myself.i_ai0 + i0;
if (log_mode == 1) {
gg.AddLogEx(Log_pc_useSkill, speller, i0, 0);

}

} else {
i0 = gg.FloatToInt(myself.Skill_GetEffectPoint(skill_name_id) / 100 * Point_UseSpell);
if (babble_mode == 1) {
myself.Say("PC를 타겟으로 한 우호적 마법: 득점 +" + gg.IntToStr(i0));

}
myself.i_ai0 = myself.i_ai0 + i0;
if (log_mode == 1) {
gg.AddLogEx(Log_pc_useSpell, speller, i0, 0);

}

}

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success) {
if (success == 1) {
if (skill_name_id == Buff) {
myself.i_ai0 = myself.i_ai0 - Point_MobUseSkill2;
if (babble_mode == 1) {
myself.Say("궁극 스킬 사용 했음: 감점 " + gg.IntToStr(Point_MobUseSkill2));
myself.Say("버프 상태:" + gg.IntToStr(myself.Skill_GetAbnormalType(Buff)));

}
if (log_mode == 1) {
gg.AddLogEx(Log_mob_useSkill2, target, Point_MobUseSkill2, 0);

}

} else if (skill_name_id == Debuff) {
if (babble_mode == 1) {
myself.Say("디버프 썻음: 상태 " + gg.IntToStr(gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Debuff))));

}

} else {
myself.i_ai0 = myself.i_ai0 - Point_MobUseSkill1;
if (babble_mode == 1) {
myself.Say("일반 스킬 사용 했음: 감점 " + gg.IntToStr(Point_MobUseSkill1));

}
if (log_mode == 1) {
gg.AddLogEx(Log_mob_useSkill1, target, Point_MobUseSkill1, 0);

}

}

}
super;
	}

	protected void CLAN_ATTACKED(HandlerParam attacker, HandlerParam victim, HandlerParam damage, HandlerParam skill_name_id) {
if (myself.i_ai1 == 0) {
if (babble_mode == 1) {
myself.Say("어그로 걸렸음: 감점 " + gg.IntToStr(Point_ClanAggro));

}
myself.i_ai0 = myself.i_ai0 - Point_ClanAggro;
myself.i_ai1 = 1;
if (log_mode == 1) {
gg.AddLogEx(Log_ClanAggro, attacker, Point_ClanAggro, 0);

}

}
if (Type == 2 && victim.hp <= victim.max_hp * 0.300000 && gg.GetAbnormalLevel(myself.sm, myself.Skill_GetAbnormalType(Buff)) <= 0) {
if (babble_mode == 1) {
myself.Say("궁극버프 발동");

}
myself.AddUseSkillDesire(myself.sm, Buff, 1, 1, 10000000);

}
super;
	}

	protected void MY_DYING(HandlerParam last_attacker, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam f0, HandlerParam f1, HandlerParam f2, HandlerParam f3) {
if (myself.IsNullCreature(last_attacker) == 0) {
if (myself.i_ai4 >= 0 && myself.InMyTerritory(myself.sm) == 1) {
if (myself.GetOverhitBonus(myself.sm) > 1) {
f0 = myself.GetOverhitBonus(myself.sm);
if (babble_mode == 1) {
myself.Say("오버히트:" + gg.IntToStr(gg.FloatToInt(f0)));

}
if (myself.GetOverhitBonus(myself.sm) >= 1.200000) {
if (babble_mode == 1) {
myself.Say("오버히트: 체인스폰 확률 + 40%");

}
myself.i_ai4 = myself.i_ai4 + Prob_Overheat * 4;

} else if (myself.GetOverhitBonus(myself.sm) >= 1.100000) {
if (babble_mode == 1) {
myself.Say("오버히트: 체인스폰 확률 + 30%");

}
myself.i_ai4 = myself.i_ai4 + Prob_Overheat * 3;

} else {
if (babble_mode == 1) {
myself.Say("오버히트: 체인스폰 확률 + 20%");

}
myself.i_ai4 = myself.i_ai4 + Prob_Overheat * 2;

}

}
if (myself.Maker_GetNpcCount() < Max_Npc || PrivatesSpB == 1022481 || PrivatesSpB == 1022484 && myself.Maker_GetNpcCount() < Max_Npc2) {
if (babble_mode == 1) {
myself.Say("확률 수정치" + gg.IntToStr(myself.i_ai4 / 10) + "%");

}
if (Type == 2 && gg.Rand(1000) < Prob_Chain_B_B + myself.i_ai4 || Type == 1 && gg.Rand(1000) < Prob_Chain_A_B + myself.i_ai4 || Type == 0 && gg.Rand(1000) < Prob_Chain_N_B + myself.i_ai4) {
if (babble_mode == 1) {
myself.Say("체인스폰:B 성공");

}
myself.CreateOnePrivateEx(PrivatesSpB, Privates_AI, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, last_attacker.id, 0);
myself.i_ai4 = -1;

} else if (Type == 1 && gg.Rand(1000) < Prob_Chain_A_A + myself.i_ai4 || Type == 0 && gg.Rand(1000) < Prob_Chain_N_A + myself.i_ai4) {
if (babble_mode == 1) {
myself.Say("체인스폰:A 성공");

}
myself.CreateOnePrivateEx(PrivatesSpA, Privates_AI, 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, 1000, last_attacker.id, 0);
myself.i_ai4 = -2;

} else {
if (babble_mode == 1) {
myself.Say("체인스폰: 실패");

}
myself.i_ai4 = -99;

}

}

}
if (babble_mode == 1) {
myself.Say("사망 기본 점수:" + gg.IntToStr(myself.i_ai0));

}
if (myself.i_ai2 != 0 && myself.i_ai3 != 0 && last_attacker.is_pc == 1) {
f0 = last_attacker.hp;
f1 = last_attacker.max_hp;
f2 = last_attacker.mp;
f3 = last_attacker.max_mp;
if (babble_mode == 1) {
myself.Say("HP변동: " + gg.IntToStr(gg.FloatToInt(f0 - myself.i_ai2 / f1 * 10)) + "0%");
myself.Say("MP변동: " + gg.IntToStr(gg.FloatToInt(f2 - myself.i_ai3 / f3 * 10)) + "0%");

}
i0 = Point_ModHP * gg.FloatToInt(f0 - myself.i_ai2 / f1 * 10);
i0 = i0 + Point_ModMP * gg.FloatToInt(f2 - myself.i_ai3 / f3 * 10);
myself.i_ai0 = myself.i_ai0 + i0;
if (babble_mode == 1) {
myself.Say("HP차이 득실점:" + gg.IntToStr(i0));

}
if (log_mode == 1) {
gg.AddLogEx(Log_pc_ModHpMp, last_attacker, i0, 0);

}

} else if (babble_mode == 1) {
myself.Say("HP차이 득실점: 최종 공격자 소환수이므로 무효!");

}
if (Type == 1 && myself.i_ai0 > Point_Kill_Sp_A * 3) {
if (babble_mode == 1) {
myself.Say("상한 제한 걸림");

}
myself.i_ai0 = Point_Kill_Sp_A * 3;

} else if (Type == 2 && myself.i_ai0 > Point_Kill_Sp_B * 3) {
if (babble_mode == 1) {
myself.Say("상한 제한 걸림");

}
myself.i_ai0 = Point_Kill_Sp_B * 3;

} else if (Type == 0 && myself.i_ai0 > Point_Kill_Basic * 3) {
if (babble_mode == 1) {
myself.Say("상한 제한 걸림");

}
myself.i_ai0 = Point_Kill_Basic * 3;

}
i1 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i1, MyMakerName);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai4 < 0 && myself.i_ai4 != -99) {
if (babble_mode == 1) {
myself.Say("체인스폰 성공 보고");

}
gg.SendMakerScriptEvent(maker0, 78010046, myself.i_ai4, 0);

} else {
if (babble_mode == 1) {
myself.Say("체인스폰 중단 보고");

}
gg.SendMakerScriptEvent(maker0, 78010046, 0, 0);

}
if (babble_mode == 1) {
gg.ShowOnScreenMsgStr(last_attacker, 3, 0, 0, 0, 1, 0, 3000, 0, "최종 점수:" + gg.IntToStr(myself.i_ai0));

}
if (log_mode == 1) {
if (Type == 1) {
gg.AddLogEx(Log_spA_Kill, last_attacker, Point_Kill_Sp_A, 0);

} else if (Type == 2) {
gg.AddLogEx(Log_spB_Kill, last_attacker, Point_Kill_Sp_B, 0);

} else {
gg.AddLogEx(Log_normal_Kill, last_attacker, Point_Kill_Basic, 0);

}

}
gg.SendMakerScriptEvent(maker0, 78010044, myself.i_ai0, 0);

} else if (babble_mode == 1) {
myself.Say("메이커명 오류");

}

} else if (babble_mode == 1) {
myself.Say("공격자 오류");

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 1000) {
if (babble_mode == 1) {
myself.Say("디스폰 이벤트 받음");

}
myself.Despawn();

}
	}

	protected void NO_DESIRE() {
myself.AddMoveAroundDesire(500, 500);
	}


}