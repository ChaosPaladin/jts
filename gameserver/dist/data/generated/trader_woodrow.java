package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_woodrow extends merchant {
protected Object[][] SellList0 = {
{"long_sword";20;0.000000;0}, {"throw_knife";20;0.000000;0}, {"bow_of_forest";20;0.000000;0}, {"short_spear";20;0.000000;0}, {"falchion";20;0.000000;0}, {"sword_breaker";20;0.000000;0}, {"composition_bow";20;0.000000;0}, {"buzdygan";20;0.000000;0}, {"morning_star";20;0.000000;0}, {"iron_hammer";20;0.000000;0}, {"long_spear";20;0.000000;0}, {"saber";20;0.000000;0}, {"iron_sword";20;0.000000;0}, {"handiwork_dagger";20;0.000000;0}, {"assassin_knife";20;0.000000;0}, {"strengthening_bow";20;0.000000;0}, {"hand_axe";20;0.000000;0}, {"heavy_mace";20;0.000000;0}, {"work_hammer";20;0.000000;0}, {"trident";20;0.000000;0}, {"bastard_sword";20;0.000000;0}, {"poniard_dagger";20;0.000000;0}, {"long_bow";20;0.000000;0}, {"dark_elven_bow";20;0.000000;0}, {"pike";20;0.000000;0}, {"dwarven_trident";20;0.000000;0}, {"cestus";20;0.000000;0}, {"viper's_canine";20;0.000000;0}, {"bagh-nakh";20;0.000000;0}, {"single-edged_jamadhr";20;0.000000;0}, {"flamberge";20;0.000000;0}, {"stormbringer";20;0.000000;0}, {"big_hammer";20;0.000000;0}, {"scythe";20;0.000000;0}, {"battle_axe";20;0.000000;0}, {"war_pick";20;0.000000;0}, {"skull_graver";20;0.000000;0}, {"heavy_doom_hammer";20;0.000000;0}, {"heavy_doom_axe";20;0.000000;0}, {"cursed_dagger";20;0.000000;0}, {"darkelven_dagger";20;0.000000;0}, {"chakram";20;0.000000;0}, {"crystallized_ice_bow";20;0.000000;0}, {"orcish_glaive";20;0.000000;0}, {"body_slasher";20;0.000000;0}, {"shamshir";20;0.000000;0}, {"katana";20;0.000000;0}, {"spirits_sword";20;0.000000;0}, {"raid_sword";20;0.000000;0}, {"stiletto";20;0.000000;0}, {"dwarven_warhammer";20;0.000000;0}, {"bech_de_corbin";20;0.000000;0}, {"elemental_bow";20;0.000000;0}, {"noble_elven_bow";20;0.000000;0}, {"knuckle_dust";20;0.000000;0}, {"caliburs";20;0.000000;0}, {"sword_of_delusion";20;0.000000;0}, {"tsurugi";20;0.000000;0}, {"sword_of_limit";20;0.000000;0}, {"sword_of_nightmare";20;0.000000;0}, {"war_axe";20;0.000000;0}, {"grace_dagger";20;0.000000;0}, {"dark_screamer";20;0.000000;0}, {"poleaxe";20;0.000000;0}, {"fist_blade";20;0.000000;0}, {"akat_long_bow";20;0.000000;0}, {"sword_of_paagrio";20;0.000000;0}, {"horn_of_karik";20;0.000000;0}, {"scorpion";20;0.000000;0}, {"widow_maker";20;0.000000;0}, {"samurai_longsword";20;0.000000;0}, {"crystal_dagger";20;0.000000;0}, {"yaksa_mace";20;0.000000;0}, {"great_pata";20;0.000000;0}, {"eminence_bow";20;0.000000;0}, {"orcish_poleaxe";20;0.000000;0}, {"berserker_blade";20;0.000000;0}, {"dwarven_hammer";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_staff";20;0.000000;0}, {"relic_of_saints";20;0.000000;0}, {"mage_staff";20;0.000000;0}, {"crucifix_of_blessing";20;0.000000;0}, {"voodoo_doll";20;0.000000;0}, {"bone_staff";20;0.000000;0}, {"scroll_of_wisdom";20;0.000000;0}, {"sword_of_priest";20;0.000000;0}, {"branch_of_life";20;0.000000;0}, {"proof_of_revenge";20;0.000000;0}, {"mace_of_prayer";20;0.000000;0}, {"doom_hammer";20;0.000000;0}, {"mystic_staff";20;0.000000;0}, {"staff_of_mana";20;0.000000;0}, {"divine_tome";20;0.000000;0}, {"sword_of_magic";20;0.000000;0}, {"sword_of_mystic";20;0.000000;0}, {"sword_of_occult";20;0.000000;0}, {"dagger_of_mana";20;0.000000;0}, {"mystic_knife";20;0.000000;0}, {"conjure_knife";20;0.000000;0}, {"crystal_staff";20;0.000000;0}, {"stick_of_faith";20;0.000000;0}, {"mystery_sword";20;0.000000;0}, {"dagger_of_magicflame";20;0.000000;0}, {"horn_of_glory";20;0.000000;0}, {"cursed_staff";20;0.000000;0}, {"homunkulus's_sword";20;0.000000;0}, {"deathbreath_sword";20;0.000000;0}, {"nirvana_axe";20;0.000000;0}, {"stick_of_eternity";20;0.000000;0}, {"club_of_nature";20;0.000000;0}, {"mace_of_underworld";20;0.000000;0}, {"heathen's_book";20;0.000000;0}, {"paradia_staff";20;0.000000;0}, {"inferno_staff";20;0.000000;0}, {"paagrio_hammer";20;0.000000;0}, {"sage's_staff";20;0.000000;0}, {"paagrio_axe";20;0.000000;0}, {"sword_of_eclipse";20;0.000000;0}, {"eclipse_axe";20;0.000000;0}, {"deadman's_staff";20;0.000000;0}, {"ghoul's_staff";20;0.000000;0}, {"demon's_staff";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"saber_low";20;0.000000;0}, {"iron_sword_low";20;0.000000;0}, {"handiwork_dagger_low";20;0.000000;0}, {"assassin_knife_low";20;0.000000;0}, {"strengthening_bow_low";20;0.000000;0}, {"hand_axe_low";20;0.000000;0}, {"heavy_mace_low";20;0.000000;0}, {"work_hammer_low";20;0.000000;0}, {"trident_low";20;0.000000;0}, {"bastard_sword_low";20;0.000000;0}, {"poniard_dagger_low";20;0.000000;0}, {"long_bow_low";20;0.000000;0}, {"dark_elven_bow_low";20;0.000000;0}, {"pike_low";20;0.000000;0}, {"dwarven_trident_low";20;0.000000;0}, {"bagh-nakh_low";20;0.000000;0}, {"single-edged_jamadhr_low";20;0.000000;0}, {"flamberge_low";20;0.000000;0}, {"stormbringer_low";20;0.000000;0}, {"big_hammer_low";20;0.000000;0}, {"scythe_low";20;0.000000;0}, {"battle_axe_low";20;0.000000;0}, {"war_pick_low";20;0.000000;0}, {"skull_graver_low";20;0.000000;0}, {"heavy_doom_hammer_low";20;0.000000;0}, {"heavy_doom_axe_low";20;0.000000;0}, {"cursed_dagger_low";20;0.000000;0}, {"darkelven_dagger_low";20;0.000000;0}, {"chakram_low";20;0.000000;0}, {"crystallized_ice_bow_low";20;0.000000;0}, {"orcish_glaive_low";20;0.000000;0}, {"body_slasher_low";20;0.000000;0}, {"shamshir_low";20;0.000000;0}, {"katana_low";20;0.000000;0}, {"spirits_sword_low";20;0.000000;0}, {"raid_sword_low";20;0.000000;0}, {"stiletto_low";20;0.000000;0}, {"dwarven_warhammer_low";20;0.000000;0}, {"bech_de_corbin_low";20;0.000000;0}, {"elemental_bow_low";20;0.000000;0}, {"noble_elven_bow_low";20;0.000000;0}, {"knuckle_dust_low";20;0.000000;0}, {"caliburs_low";20;0.000000;0}, {"sword_of_delusion_low";20;0.000000;0}, {"tsurugi_low";20;0.000000;0}, {"sword_of_limit_low";20;0.000000;0}, {"sword_of_nightmare_low";20;0.000000;0}, {"war_axe_low";20;0.000000;0}, {"grace_dagger_low";20;0.000000;0}, {"dark_screamer_low";20;0.000000;0}, {"poleaxe_low";20;0.000000;0}, {"fist_blade_low";20;0.000000;0}, {"akat_long_bow_low";20;0.000000;0}, {"sword_of_paagrio_low";20;0.000000;0}, {"horn_of_karik_low";20;0.000000;0}, {"scorpion_low";20;0.000000;0}, {"widow_maker_low";20;0.000000;0}, {"samurai_longsword_low";20;0.000000;0}, {"crystal_dagger_low";20;0.000000;0}, {"yaksa_mace_low";20;0.000000;0}, {"great_pata_low";20;0.000000;0}, {"eminence_bow_low";20;0.000000;0}, {"orcish_poleaxe_low";20;0.000000;0}, {"berserker_blade_low";20;0.000000;0}, {"dwarven_hammer_low";20;0.000000;0}
};
protected Object[][] SellList5 = {
{"bone_staff_low";20;0.000000;0}, {"scroll_of_wisdom_low";20;0.000000;0}, {"sword_of_priest_low";20;0.000000;0}, {"branch_of_life_low";20;0.000000;0}, {"proof_of_revenge_low";20;0.000000;0}, {"mace_of_prayer_low";20;0.000000;0}, {"doom_hammer_low";20;0.000000;0}, {"mystic_staff_low";20;0.000000;0}, {"staff_of_mana_low";20;0.000000;0}, {"divine_tome_low";20;0.000000;0}, {"sword_of_magic_low";20;0.000000;0}, {"sword_of_mystic_low";20;0.000000;0}, {"sword_of_occult_low";20;0.000000;0}, {"dagger_of_mana_low";20;0.000000;0}, {"mystic_knife_low";20;0.000000;0}, {"conjure_knife_low";20;0.000000;0}, {"crystal_staff_low";20;0.000000;0}, {"stick_of_faith_low";20;0.000000;0}, {"mystery_sword_low";20;0.000000;0}, {"dagger_of_magicflame_low";20;0.000000;0}, {"horn_of_glory_low";20;0.000000;0}, {"cursed_staff_low";20;0.000000;0}, {"homunkulus's_sword_low";20;0.000000;0}, {"deathbreath_sword_low";20;0.000000;0}, {"nirvana_axe_low";20;0.000000;0}, {"stick_of_eternity_low";20;0.000000;0}, {"club_of_nature_low";20;0.000000;0}, {"mace_of_underworld_low";20;0.000000;0}, {"heathen's_book_low";20;0.000000;0}, {"paradia_staff_low";20;0.000000;0}, {"inferno_staff_low";20;0.000000;0}, {"paagrio_hammer_low";20;0.000000;0}, {"sage's_staff_low";20;0.000000;0}, {"paagrio_axe_low";20;0.000000;0}, {"sword_of_eclipse_low";20;0.000000;0}, {"eclipse_axe_low";20;0.000000;0}, {"deadman's_staff_low";20;0.000000;0}, {"ghoul's_staff_low";20;0.000000;0}, {"demon's_staff_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Bard's Mandolin (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 1) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetFlagJournal(talker, 362, 2);
myself.ShowQuestMark(talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 362, 2);
myself.ShowPage(talker, "woodrow_q0362_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 2) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "woodrow_q0362_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 3) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "woodrow_q0362_03.htm");

}
break;

}

}
return;

}
super;
	}


}