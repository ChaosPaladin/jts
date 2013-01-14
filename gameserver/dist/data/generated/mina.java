package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class mina extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"necklace_of_magic";15;0.000000;0}, {"necklace_of_knowledge";15;0.000000;0}, {"necklace_of_anguish";15;0.000000;0}, {"necklace_of_wisdom";15;0.000000;0}, {"apprentice's_earing";15;0.000000;0}, {"mage_earing";15;0.000000;0}, {"earing_of_strength";15;0.000000;0}, {"earing_of_wisdom";15;0.000000;0}, {"cat'seye_earing";15;0.000000;0}, {"magic_ring";15;0.000000;0}, {"ring_of_knowledge";15;0.000000;0}, {"ring_of_anguish";15;0.000000;0}, {"ring_of_wisdom";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"sb_adv_defence_power1";15;0.000000;0}, {"sb_advanced_attack_power1";15;0.000000;0}, {"sb_might1";15;0.000000;0}, {"sb_battle_heal1";15;0.000000;0}, {"sb_vampiric_touch1";15;0.000000;0}, {"sb_ice_bolt1";15;0.000000;0}, {"sb_heal1";15;0.000000;0}, {"sb_group_heal1";15;0.000000;0}, {"sb_shield1";15;0.000000;0}, {"sb_breeze1";15;0.000000;0}, {"sb_wind_walk1";15;0.000000;0}, {"sb_curse:weakness";15;0.000000;0}, {"sb_curse:poison1";15;0.000000;0}, {"sb_cure_poison1";15;0.000000;0}, {"sb_flame_strike1";15;0.000000;0}, {"sb_drain_energy1";15;0.000000;0}, {"sb_elemental_heal1";15;0.000000;0}, {"sb_disrupt_undead1";15;0.000000;0}, {"sb_resurrection1";15;0.000000;0}, {"sb_blaze1";15;0.000000;0}, {"sb_summon_shadow1";15;0.000000;0}, {"sb_summon_silhouette1";15;0.000000;0}, {"sb_summon_unicorn_boxer1";15;0.000000;0}, {"sb_summon_blackcat1";15;0.000000;0}, {"sb_servitor_heal1";15;0.000000;0}, {"sb_aqua_swirl1";15;0.000000;0}, {"sb_arcane_acumen1";15;0.000000;0}, {"sb_energy_bolt1";15;0.000000;0}, {"sb_aura_burn1";15;0.000000;0}, {"sb_charm11";15;0.000000;0}, {"sb_concentration1";15;0.000000;0}, {"sb_water_breathing";15;0.000000;0}, {"sb_twister1";15;0.000000;0}, {"sb_poison1";15;0.000000;0}, {"sb_poison_recovery1";15;0.000000;0}, {"sb_summon_mechanic_golem1";15;0.000000;0}, {"sb_fallen_arrow1";15;0.000000;0}, {"sb_fallen_attack1";15;0.000000;0}, {"sb_rapid_attack1";15;0.000000;0}, {"sb_increase_power1";15;0.000000;0}, {"sb_detect_trap1";15;0.000000;0}, {"sb_defuse_trap1";15;0.000000;0}, {"sb_guidance1";15;0.000000;0}, {"sb_greater_group_heal11";15;0.000000;0}, {"sb_summon_cursed_bone";15;0.000000;0}, {"sb_greater_heal11";15;0.000000;0}, {"sb_death_whisper1";15;0.000000;0}, {"sb_life_leech";15;0.000000;0}, {"sb_mass_summon_poltergeist_cubic";15;0.000000;0}, {"sb_vampiric_claw11";15;0.000000;0}, {"sb_silence1";15;0.000000;0}, {"sb_shadow_flare1";15;0.000000;0}, {"sb_surrender_to_wind1";15;0.000000;0}, {"sb_summon_soulless1";15;0.000000;0}, {"sb_summon_spark_cubic1";15;0.000000;0}, {"sb_summon_poltergeist_cubic1";15;0.000000;0}, {"sb_servitor_cure1";15;0.000000;0}, {"sb_servitor_physical_shield1";15;0.000000;0}, {"sb_curse_fear1";15;0.000000;0}, {"sb_transfer_pain";15;0.000000;0}, {"sb_hurricane11";15;0.000000;0}, {"sb_hex1";15;0.000000;0}, {"sb_summon_vampiric_cubic1";15;0.000000;0}, {"sb_death_spike1";15;0.000000;0}, {"sb_servitor_magic_shield1";15;0.000000;0}, {"sb_servitor_haste1";15;0.000000;0}, {"sb_purify1";15;0.000000;0}, {"sb_corpse_plague1";15;0.000000;0}, {"sb_tempest1";15;0.000000;0}, {"sb_summon_viper_cubic1";15;0.000000;0}, {"sb_servitor_empower1";15;0.000000;0}, {"sb_curse_death_link1";15;0.000000;0}, {"sb_mana_burn";15;0.000000;0}, {"sb_betray";15;0.000000;0}, {"sb_summon_nightshade";15;0.000000;0}, {"sb_summon_friend";15;0.000000;0}, {"sb_erase";15;0.000000;0}, {"sb_invocation1";15;0.000000;0}, {"sb_lightening_strike1";15;0.000000;0}, {"sb_wind_resist1";15;0.000000;0}, {"sb_resist_holy";15;0.000000;0}, {"sb_mass_surrender_to_wind";15;0.000000;0}, {"sb_aura_flash1";15;0.000000;0}, {"sb_servitor_blessing";15;0.000000;0}, {"sb_wild_magic1";15;0.000000;0}, {"sb_seed_of_wind";15;0.000000;0}, {"sb_aura_symphony1";15;0.000000;0}, {"sb_demon_wind1";15;0.000000;0}, {"sb_elemental_symphony_d1";15;0.000000;0}, {"sb_inquisitor";15;0.000000;0}, {"sb_bless_the_blood1";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 319) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Scent of Death");

}
if (gg.HaveMemo(talker, 319)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Scent of Death (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 319) == 0) {
myself.SetCurrentQuestID(319);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 11) {
myself.FHTML_SetFileName(fhtml0, "mina_q0319_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 319);
myself.ShowQuestFHTML(talker, fhtml0, 319);

} else {
myself.ShowQuestPage(talker, "mina_q0319_02.htm", 319);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 319)) {
myself.SetCurrentQuestID(319);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1045) < 5) {
myself.ShowPage(talker, "mina_q0319_05.htm");

} else if (gg.OwnItemCount(talker, 1045) >= 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "mina_q0319_06.htm");
myself.GiveItem1(talker, 57, 3350);
myself.GiveItem1(talker, 1060, 1);
myself.DeleteItem1(talker, 1045, gg.OwnItemCount(talker, 1045));
myself.RemoveMemo(talker, 319);
gg.AddLog(2, talker, 319);
gg.AddLog(3, talker, 319);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 319) {
myself.SetCurrentQuestID(319);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "mina_q0319_04.htm", 319);
myself.SetMemo(talker, 319);
myself.ShowQuestMark(talker, 319);
myself.SetFlagJournal(talker, 319, 1);
gg.AddLog(1, talker, 319);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}
return;

}
super;
	}


}