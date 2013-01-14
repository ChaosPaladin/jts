package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class cel extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"necklace_of_magic";15;0.000000;0}, {"necklace_of_knowledge";15;0.000000;0}, {"necklace_of_anguish";15;0.000000;0}, {"necklace_of_wisdom";15;0.000000;0}, {"apprentice's_earing";15;0.000000;0}, {"mage_earing";15;0.000000;0}, {"earing_of_strength";15;0.000000;0}, {"earing_of_wisdom";15;0.000000;0}, {"cat'seye_earing";15;0.000000;0}, {"magic_ring";15;0.000000;0}, {"ring_of_knowledge";15;0.000000;0}, {"ring_of_anguish";15;0.000000;0}, {"ring_of_wisdom";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"sb_adv_defence_power1";15;0.000000;0}, {"sb_advanced_attack_power1";15;0.000000;0}, {"sb_might1";15;0.000000;0}, {"sb_battle_heal1";15;0.000000;0}, {"sb_vampiric_touch1";15;0.000000;0}, {"sb_ice_bolt1";15;0.000000;0}, {"sb_heal1";15;0.000000;0}, {"sb_group_heal1";15;0.000000;0}, {"sb_shield1";15;0.000000;0}, {"sb_breeze1";15;0.000000;0}, {"sb_wind_walk1";15;0.000000;0}, {"sb_curse:weakness";15;0.000000;0}, {"sb_curse:poison1";15;0.000000;0}, {"sb_cure_poison1";15;0.000000;0}, {"sb_flame_strike1";15;0.000000;0}, {"sb_drain_energy1";15;0.000000;0}, {"sb_elemental_heal1";15;0.000000;0}, {"sb_disrupt_undead1";15;0.000000;0}, {"sb_resurrection1";15;0.000000;0}, {"sb_blaze1";15;0.000000;0}, {"sb_summon_shadow1";15;0.000000;0}, {"sb_summon_silhouette1";15;0.000000;0}, {"sb_summon_unicorn_boxer1";15;0.000000;0}, {"sb_summon_blackcat1";15;0.000000;0}, {"sb_servitor_heal1";15;0.000000;0}, {"sb_aqua_swirl1";15;0.000000;0}, {"sb_arcane_acumen1";15;0.000000;0}, {"sb_energy_bolt1";15;0.000000;0}, {"sb_aura_burn1";15;0.000000;0}, {"sb_charm11";15;0.000000;0}, {"sb_concentration1";15;0.000000;0}, {"sb_water_breathing";15;0.000000;0}, {"sb_twister1";15;0.000000;0}, {"sb_poison1";15;0.000000;0}, {"sb_poison_recovery1";15;0.000000;0}, {"sb_summon_mechanic_golem1";15;0.000000;0}, {"sb_fallen_arrow1";15;0.000000;0}, {"sb_fallen_attack1";15;0.000000;0}, {"sb_rapid_attack1";15;0.000000;0}, {"sb_increase_power1";15;0.000000;0}, {"sb_detect_trap1";15;0.000000;0}, {"sb_defuse_trap1";15;0.000000;0}, {"sb_greater_heal11";15;0.000000;0}, {"sb_greater_group_heal11";15;0.000000;0}, {"sb_resist_shock1";15;0.000000;0}, {"sb_return1";15;0.000000;0}, {"sb_mana_regeneration";15;0.000000;0}, {"sb_might_of_heaven11";15;0.000000;0}, {"sb_mass_summon_aqua_cubic";15;0.000000;0}, {"sb_bless_shield1";15;0.000000;0}, {"sb_surrender_to_water1";15;0.000000;0}, {"sb_summon_life_cubic1";15;0.000000;0}, {"sb_summon_storm_cubic1";15;0.000000;0}, {"sb_summon_aqua_cubic1";15;0.000000;0}, {"sb_summon_unicorn_merrow1";15;0.000000;0}, {"sb_servitor_cure1";15;0.000000;0}, {"sb_servitor_physical_shield1";15;0.000000;0}, {"sb_solar_flare1";15;0.000000;0}, {"sb_spirit_barrier1";15;0.000000;0}, {"sb_aura_bolt1";15;0.000000;0}, {"sb_aura_flare11";15;0.000000;0}, {"sb_curse_fear1";15;0.000000;0}, {"sb_transfer_pain";15;0.000000;0}, {"sb_frost_bolt11";15;0.000000;0}, {"sb_freezing_skin1";15;0.000000;0}, {"sb_hydro_blast11";15;0.000000;0}, {"sb_servitor_magic_shield1";15;0.000000;0}, {"sb_servitor_haste1";15;0.000000;0}, {"sb_serenade_of_eva1";15;0.000000;0}, {"sb_sleeping_cloud1";15;0.000000;0}, {"sb_ice_dagger1";15;0.000000;0}, {"sb_freezing_shackle1";15;0.000000;0}, {"sb_vitalize1";15;0.000000;0}, {"sb_cancel1";15;0.000000;0}, {"sb_party_recall1";15;0.000000;0}, {"sb_servitor_empower1";15;0.000000;0}, {"sb_frost_wall1";15;0.000000;0}, {"sb_mana_burn";15;0.000000;0}, {"sb_major_heal";15;0.000000;0}, {"sb_betray";15;0.000000;0}, {"sb_summon_unicorn_seraphim";15;0.000000;0}, {"sb_summon_friend";15;0.000000;0}, {"sb_erase";15;0.000000;0}, {"sb_invocation1";15;0.000000;0}, {"sb_turn_undead";15;0.000000;0}, {"sb_trance";15;0.000000;0}, {"sb_auqa_resist1";15;0.000000;0}, {"sb_resist_unholy";15;0.000000;0}, {"sb_mass_surrender_to_water";15;0.000000;0}, {"sb_aqua_splash1";15;0.000000;0}, {"sb_advanced_block1";15;0.000000;0}, {"sb_aura_flash1";15;0.000000;0}, {"sb_clarity";15;0.000000;0}, {"sb_summon_attract_cubic1";15;0.000000;0}, {"sb_servitor_blessing";15;0.000000;0}, {"sb_wild_magic1";15;0.000000;0}, {"sb_seed_of_water";15;0.000000;0}, {"sb_aura_symphony1";15;0.000000;0}, {"sb_blizzard1";15;0.000000;0}, {"sb_elemental_symphony_e1";15;0.000000;0}, {"sb_inquisitor";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 164) == 0 && myself.GetOneTimeQuestFlag(talker, 164) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Blood Fiend");

}
if (gg.HaveMemo(talker, 164) == 0 && myself.GetOneTimeQuestFlag(talker, 164) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Blood Fiend (Done)");

}
if (gg.HaveMemo(talker, 164)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Blood Fiend (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1027) != 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1028) != 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Nerupa's Request (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 164) == 0 && myself.GetOneTimeQuestFlag(talker, 164) == 0) {
myself.SetCurrentQuestID(164);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race != 1 && talker.race != 3 && talker.race != 4 && talker.race != 0 && talker.race != 5) {
myself.ShowQuestPage(talker, "cel_q0318_00.htm", 164);

} else if (talker.level >= 21) {
myself.FHTML_SetFileName(fhtml0, "cel_q0318_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 164);
myself.ShowQuestFHTML(talker, fhtml0, 164);

} else {
myself.ShowQuestPage(talker, "cel_q0318_02.htm", 164);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 164) == 0 && myself.GetOneTimeQuestFlag(talker, 164) == 1) {
myself.SetCurrentQuestID(164);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 164)) {
myself.SetCurrentQuestID(164);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1044) < 1) {
myself.ShowPage(talker, "cel_q0318_05.htm");

} else if (gg.OwnItemCount(talker, 1044) >= 1 && myself.GetOneTimeQuestFlag(talker, 164) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "cel_q0318_06.htm");
myself.GiveItem1(talker, 57, 42130);
myself.IncrementParam(talker, 0, 35637);
myself.IncrementParam(talker, 1, 1854);
myself.DeleteItem1(talker, 1044, 1);
myself.RemoveMemo(talker, 164);
gg.AddLog(2, talker, 164);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 164, 1);

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1027) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1027, gg.OwnItemCount(talker, 1027));
if (gg.OwnItemCount(talker, 1028) == 0) {
myself.GiveItem1(talker, 1028, 1);

}
myself.ShowPage(talker, "cel_q0311_01.htm");
myself.SetFlagJournal(talker, 160, 3);
myself.ShowQuestMark(talker, 160);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1028) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cel_q0311_02.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "cel_q0311_03.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 164) {
myself.SetCurrentQuestID(164);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "cel_q0318_04.htm", 164);
myself.SetMemo(talker, 164);
myself.ShowQuestMark(talker, 164);
gg.AddLog(1, talker, 164);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 164, 1);

}
return;

}
super;
	}


}