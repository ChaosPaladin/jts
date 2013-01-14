package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_acellopy extends merchant {
protected Object[][] SellList0 = {
{"sb_adv_defence_power1";20;0.000000;0}, {"sb_advanced_attack_power1";20;0.000000;0}, {"sb_might1";20;0.000000;0}, {"sb_battle_heal1";20;0.000000;0}, {"sb_vampiric_touch1";20;0.000000;0}, {"sb_ice_bolt1";20;0.000000;0}, {"sb_heal1";20;0.000000;0}, {"sb_group_heal1";20;0.000000;0}, {"sb_shield1";20;0.000000;0}, {"sb_breeze1";20;0.000000;0}, {"sb_wind_walk1";20;0.000000;0}, {"sb_curse:weakness";20;0.000000;0}, {"sb_curse:poison1";20;0.000000;0}, {"sb_cure_poison1";20;0.000000;0}, {"sb_flame_strike1";20;0.000000;0}, {"sb_drain_energy1";20;0.000000;0}, {"sb_elemental_heal1";20;0.000000;0}, {"sb_disrupt_undead1";20;0.000000;0}, {"sb_resurrection1";20;0.000000;0}, {"sb_blaze1";20;0.000000;0}, {"sb_summon_shadow1";20;0.000000;0}, {"sb_summon_silhouette1";20;0.000000;0}, {"sb_summon_unicorn_boxer1";20;0.000000;0}, {"sb_summon_blackcat1";20;0.000000;0}, {"sb_servitor_heal1";20;0.000000;0}, {"sb_aqua_swirl1";20;0.000000;0}, {"sb_arcane_acumen1";20;0.000000;0}, {"sb_energy_bolt1";20;0.000000;0}, {"sb_aura_burn1";20;0.000000;0}, {"sb_charm11";20;0.000000;0}, {"sb_concentration1";20;0.000000;0}, {"sb_water_breathing";20;0.000000;0}, {"sb_twister1";20;0.000000;0}, {"sb_poison1";20;0.000000;0}, {"sb_poison_recovery1";20;0.000000;0}, {"sb_confusion1";20;0.000000;0}, {"sb_cure_bleeding1";20;0.000000;0}, {"sb_dryad_root1";20;0.000000;0}, {"sb_mental_shield1";20;0.000000;0}, {"sb_body_to_mind1";20;0.000000;0}, {"sb_shadow_spark1";20;0.000000;0}, {"sb_surrender_to_earth1";20;0.000000;0}, {"sb_surrender_to_fire1";20;0.000000;0}, {"sb_surrender_to_poison1";20;0.000000;0}, {"sb_summon_cuti_cat1";20;0.000000;0}, {"sb_summon_unicorn_mirage1";20;0.000000;0}, {"sb_servitor_mana_charge1";20;0.000000;0}, {"sb_solar_spark1";20;0.000000;0}, {"sb_agility1";20;0.000000;0}, {"sb_empower1";20;0.000000;0}, {"sb_poison_cloud1";20;0.000000;0}, {"sb_focus1";20;0.000000;0}, {"sb_holy_weapon1";20;0.000000;0}, {"sb_touch_of_god1";20;0.000000;0}, {"sb_fire_resist1";20;0.000000;0}, {"sb_recharge1";20;0.000000;0}, {"sb_vampiric_rage1";20;0.000000;0}, {"sb_sleep1";20;0.000000;0}, {"sb_corpse_life_drain1";20;0.000000;0}, {"sb_night_murmur1";20;0.000000;0}, {"sb_blood_lust1";20;0.000000;0}, {"sb_pain_thorn1";20;0.000000;0}, {"sb_devotioin_of_shine1";20;0.000000;0}, {"sb_chill_flame1";20;0.000000;0}, {"sb_mass_frenzy1";20;0.000000;0}, {"sb_external_fear1";20;0.000000;0}, {"sb_entice_madness1";20;0.000000;0}, {"sb_pain_edge1";20;0.000000;0}, {"sb_inspire_life_force1";20;0.000000;0}, {"sb_devotioin_of_soul1";20;0.000000;0}, {"sb_burning_spirit1";20;0.000000;0}, {"sb_blaze_quake1";20;0.000000;0}, {"sb_eternal_flame1";20;0.000000;0}, {"sb_bind_will1";20;0.000000;0}, {"sb_aura_sway1";20;0.000000;0}, {"sb_engrave_seal_of_timid1";20;0.000000;0}, {"sb_pure_inspiration1";20;0.000000;0}, {"sb_power_of_paagrio1";20;0.000000;0}, {"sb_summon_mechanic_golem1";20;0.000000;0}, {"sb_fallen_arrow1";20;0.000000;0}, {"sb_fallen_attack1";20;0.000000;0}, {"sb_rapid_attack1";20;0.000000;0}, {"sb_increase_power1";20;0.000000;0}, {"sb_detect_trap1";20;0.000000;0}, {"sb_defuse_trap1";20;0.000000;0}, {"sb_dark_strike1";20;0.000000;0}, {"sb_double_thrust1";20;0.000000;0}, {"sb_abyssal_blaze1";20;0.000000;0}, {"sb_penetrate_short1";20;0.000000;0}, {"sb_erase_mark1";20;0.000000;0}, {"sb_change_weapon1";20;0.000000;0}, {"sb_furious_soul1";20;0.000000;0}, {"sb_dark_explosion1";20;0.000000;0}, {"sb_death_mark1";20;0.000000;0}, {"sb_fire_trap1";20;0.000000;0}, {"sb_fast_shot1";20;0.000000;0}, {"sb_surrender_to_unholy1";20;0.000000;0}, {"sb_rush1";20;0.000000;0}, {"sb_warf1";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 327)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Recover the Farmland (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 327)) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_acellopy_q0327_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 327) {
myself.SetCurrentQuestID(327);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 327) {
if (reply == 1 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1848) < 5) {
myself.ShowPage(talker, "trader_acellopy_q0327_02.htm");

} else if (gg.Rand(6) < 5) {
myself.ShowPage(talker, "trader_acellopy_q0327_03.htm");
myself.DeleteItem1(talker, 1848, 5);
myself.GiveItem1(talker, 1852, 1);

} else {
myself.ShowPage(talker, "trader_acellopy_q0327_10.htm");
myself.DeleteItem1(talker, 1848, 5);

}

} else if (reply == 2 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1849) < 5) {
myself.ShowPage(talker, "trader_acellopy_q0327_04.htm");

} else if (gg.Rand(7) < 6) {
myself.ShowPage(talker, "trader_acellopy_q0327_05.htm");
myself.DeleteItem1(talker, 1849, 5);
myself.GiveItem1(talker, 1853, 1);

} else {
myself.ShowPage(talker, "trader_acellopy_q0327_10.htm");
myself.DeleteItem1(talker, 1849, 5);

}

} else if (reply == 3 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1850) < 5) {
myself.ShowPage(talker, "trader_acellopy_q0327_06.htm");

} else if (gg.Rand(7) < 6) {
myself.ShowPage(talker, "trader_acellopy_q0327_07.htm");
myself.DeleteItem1(talker, 1850, 5);
myself.GiveItem1(talker, 1854, 1);

} else {
myself.ShowPage(talker, "trader_acellopy_q0327_10.htm");
myself.DeleteItem1(talker, 1850, 5);

}

} else if (reply == 4 && myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 1851) < 5) {
myself.ShowPage(talker, "trader_acellopy_q0327_08.htm");

} else if (gg.Rand(8) < 7) {
myself.ShowPage(talker, "trader_acellopy_q0327_09.htm");
myself.DeleteItem1(talker, 1851, 5);
myself.GiveItem1(talker, 1855, 1);

} else {
myself.ShowPage(talker, "trader_acellopy_q0327_10.htm");
myself.DeleteItem1(talker, 1851, 5);

}

} else {
myself.ShowPage(talker, "trader_acellopy_q0327_01.htm");

}

}
super;
	}


}