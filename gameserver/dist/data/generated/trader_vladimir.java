package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_vladimir extends merchant {
protected Object[][] SellList0 = {
{"tights_pants";20;0.000000;0}, {"tights_shirt";20;0.000000;0}, {"bone_breastplate";20;0.000000;0}, {"bone_gaiters";20;0.000000;0}, {"piece_bone_breastplate";20;0.000000;0}, {"bronze_breastplate";20;0.000000;0}, {"hard_leather_gaiters";20;0.000000;0}, {"piece_bone_gaiters";20;0.000000;0}, {"hard_leather_shirt";20;0.000000;0}, {"bronze_gaiters";20;0.000000;0}, {"puma_skin_gaiters";20;0.000000;0}, {"ring_breastplate";20;0.000000;0}, {"puma_skin_shirt";20;0.000000;0}, {"iron_plate_gaiters";20;0.000000;0}, {"lion_skin_gaiters";20;0.000000;0}, {"lion_skin_shirt";20;0.000000;0}, {"scale_mail";20;0.000000;0}, {"compound_scale_mail";20;0.000000;0}, {"dwarven_scale_mail";20;0.000000;0}, {"mithril_breastplate";20;0.000000;0}, {"mithril_gaiters";20;0.000000;0}, {"reinforce_leather_gaiters";20;0.000000;0}, {"scale_gaiters";20;0.000000;0}, {"blast_plate";20;0.000000;0}, {"compound_scale_gaiters";20;0.000000;0}, {"dwarven_scale_gaiters";20;0.000000;0}, {"mithril_banded_mail";20;0.000000;0}, {"mithril_banded_gaiters";20;0.000000;0}, {"reinforce_leather_shirt";20;0.000000;0}, {"brigandine_gaiters";20;0.000000;0}, {"brigandine";20;0.000000;0}, {"manticor_skin_shirt";20;0.000000;0}, {"manticor_skin_gaiters";20;0.000000;0}, {"mithril_scale_gaiters";20;0.000000;0}, {"half_plate";20;0.000000;0}, {"plate_gaiters";20;0.000000;0}, {"slamander_skin_mail";20;0.000000;0}, {"round_shield";20;0.000000;0}, {"bone_shield";20;0.000000;0}, {"bronze_shield";20;0.000000;0}, {"aspis";20;0.000000;0}, {"hoplon";20;0.000000;0}, {"kite_shield";20;0.000000;0}, {"brigandine_shield";20;0.000000;0}, {"square_shield";20;0.000000;0}, {"plate_shield";20;0.000000;0}, {"leather_gloves";20;0.000000;0}, {"bracer";20;0.000000;0}, {"excellence_leather_gloves";20;0.000000;0}, {"leather_gauntlet";20;0.000000;0}, {"gauntlet";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul";20;0.000000;0}, {"reinforce_leather_gloves";20;0.000000;0}, {"manticor_skin_gloves";20;0.000000;0}, {"brigandine_gauntlet";20;0.000000;0}, {"mithril_glove";20;0.000000;0}, {"ogre_power_gauntlet";20;0.000000;0}, {"low_boots";20;0.000000;0}, {"boots";20;0.000000;0}, {"leather_boots";20;0.000000;0}, {"blue_buckskin_boots";20;0.000000;0}, {"iron_boots";20;0.000000;0}, {"boots_of_power";20;0.000000;0}, {"reinforce_leather_boots";20;0.000000;0}, {"manticor_skin_boots";20;0.000000;0}, {"brigandine_boots";20;0.000000;0}, {"assault_boots";20;0.000000;0}, {"slamander_skin_boots";20;0.000000;0}, {"plate_boots";20;0.000000;0}, {"leather_helmet";20;0.000000;0}, {"hard_leather_helmet";20;0.000000;0}, {"bone_helmet";20;0.000000;0}, {"bronze_helmet";20;0.000000;0}, {"helmet";20;0.000000;0}, {"brigandine_helmet";20;0.000000;0}, {"plate_helmet";20;0.000000;0}, {"mithril_boots";20;0.000000;0}, {"chain_mail_shirt";20;0.000000;0}, {"chain_gaiters";20;0.000000;0}, {"tempered_mithril_shirt";20;0.000000;0}, {"eldarake";20;0.000000;0}, {"tempered_mithril_gaiters";20;0.000000;0}, {"chain_boots";20;0.000000;0}, {"plate_leather_boots";20;0.000000;0}, {"dwarven_chain_boots";20;0.000000;0}, {"boots_of_seal";20;0.000000;0}, {"reinforce_mithril_gloves";20;0.000000;0}, {"chain_gloves";20;0.000000;0}, {"chain_shield";20;0.000000;0}, {"plate_leather";20;0.000000;0}, {"plate_leather_gaiters";20;0.000000;0}, {"plate_leather_gloves";20;0.000000;0}, {"dwarven_chain_shield";20;0.000000;0}, {"composite_armor";20;0.000000;0}, {"full_plate_armor";20;0.000000;0}, {"drake_leather_mail";20;0.000000;0}, {"knight_shield";20;0.000000;0}, {"tower_shield";20;0.000000;0}, {"composite_shield";20;0.000000;0}, {"full_plate_shield";20;0.000000;0}, {"dwarven_chain_gaiters";20;0.000000;0}, {"rind_leather_gaiters";20;0.000000;0}, {"theca_leather_gaiters";20;0.000000;0}, {"great_helmet";20;0.000000;0}, {"composite_helmet";20;0.000000;0}, {"shining_circlet";20;0.000000;0}, {"full_plate_helmet";20;0.000000;0}, {"dwarven_chain_gloves";20;0.000000;0}, {"gloves_of_seal";20;0.000000;0}, {"rind_leather_gloves";20;0.000000;0}, {"mithril_gauntlet";20;0.000000;0}, {"theca_leather_gloves";20;0.000000;0}, {"drake_leather_gloves";20;0.000000;0}, {"full_plate_gauntlet";20;0.000000;0}, {"crimson_boots";20;0.000000;0}, {"rind_leather_boots";20;0.000000;0}, {"composite_boots";20;0.000000;0}, {"theca_leather_boots";20;0.000000;0}, {"drake_leather_boots";20;0.000000;0}, {"full_plate_boots";20;0.000000;0}, {"dwarven_chain_mail_shirt";20;0.000000;0}, {"rind_leather_mail";20;0.000000;0}, {"theca_leather_mail";20;0.000000;0}, {"tshirt";20;0.000000;0}, {"cotton_tshirt";20;0.000000;0}, {"pattern_tshirt";20;0.000000;0}, {"pattern_cotton_tshirt";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose_of_devotion";20;0.000000;0}, {"tunic_of_devotion";20;0.000000;0}, {"hose_of_magicpower";20;0.000000;0}, {"tunic_of_magicpower";20;0.000000;0}, {"cursed_hose";20;0.000000;0}, {"cursed_tunic";20;0.000000;0}, {"dark_hose";20;0.000000;0}, {"white_tunic";20;0.000000;0}, {"mage's_hose";20;0.000000;0}, {"mage's_tunic";20;0.000000;0}, {"hose_of_knowledge";20;0.000000;0}, {"tunic_of_knowledge";20;0.000000;0}, {"mithril_hose";20;0.000000;0}, {"mithril_tunic";20;0.000000;0}, {"sage's_rag";20;0.000000;0}, {"round_shield";20;0.000000;0}, {"bone_shield";20;0.000000;0}, {"bronze_shield";20;0.000000;0}, {"aspis";20;0.000000;0}, {"hoplon";20;0.000000;0}, {"kite_shield";20;0.000000;0}, {"brigandine_shield";20;0.000000;0}, {"square_shield";20;0.000000;0}, {"plate_shield";20;0.000000;0}, {"leather_gloves";20;0.000000;0}, {"bracer";20;0.000000;0}, {"excellence_leather_gloves";20;0.000000;0}, {"leather_gauntlet";20;0.000000;0}, {"gauntlet";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul";20;0.000000;0}, {"gloves_of_knowledge";20;0.000000;0}, {"elven_mithril_gloves";20;0.000000;0}, {"mithril_glove";20;0.000000;0}, {"ogre_power_gauntlet";20;0.000000;0}, {"sage's_worn_gloves";20;0.000000;0}, {"demon's_gloves";20;0.000000;0}, {"blessed_gloves";20;0.000000;0}, {"low_boots";20;0.000000;0}, {"boots";20;0.000000;0}, {"leather_boots";20;0.000000;0}, {"blue_buckskin_boots";20;0.000000;0}, {"iron_boots";20;0.000000;0}, {"boots_of_power";20;0.000000;0}, {"boots_of_knowledge";20;0.000000;0}, {"elven_mithril_boots";20;0.000000;0}, {"assault_boots";20;0.000000;0}, {"slamander_skin_boots";20;0.000000;0}, {"plate_boots";20;0.000000;0}, {"demon's_boots";20;0.000000;0}, {"leather_helmet";20;0.000000;0}, {"hard_leather_helmet";20;0.000000;0}, {"bone_helmet";20;0.000000;0}, {"bronze_helmet";20;0.000000;0}, {"helmet";20;0.000000;0}, {"brigandine_helmet";20;0.000000;0}, {"plate_helmet";20;0.000000;0}, {"karmian_tunic";20;0.000000;0}, {"karmian_hose";20;0.000000;0}, {"karmian_boots";20;0.000000;0}, {"karmian_gloves";20;0.000000;0}, {"robe_of_seal";20;0.000000;0}, {"demon's_hose";20;0.000000;0}, {"divine_hose";20;0.000000;0}, {"demon's_tunic";20;0.000000;0}, {"divine_tunic";20;0.000000;0}, {"tshirt";20;0.000000;0}, {"cotton_tshirt";20;0.000000;0}, {"pattern_tshirt";20;0.000000;0}, {"pattern_cotton_tshirt";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"puma_skin_gaiters_low";20;0.000000;0}, {"ring_breastplate_low";20;0.000000;0}, {"puma_skin_shirt_low";20;0.000000;0}, {"iron_plate_gaiters_low";20;0.000000;0}, {"lion_skin_gaiters_low";20;0.000000;0}, {"lion_skin_shirt_low";20;0.000000;0}, {"scale_mail_low";20;0.000000;0}, {"compound_scale_mail_low";20;0.000000;0}, {"dwarven_scale_mail_low";20;0.000000;0}, {"mithril_breastplate_low";20;0.000000;0}, {"mithril_gaiters_low";20;0.000000;0}, {"reinforce_leather_gaiters_low";20;0.000000;0}, {"scale_gaiters_low";20;0.000000;0}, {"blast_plate_low";20;0.000000;0}, {"compound_scale_gaiters_low";20;0.000000;0}, {"dwarven_scale_gaiters_low";20;0.000000;0}, {"mithril_banded_mail_low";20;0.000000;0}, {"mithril_banded_gaiters_low";20;0.000000;0}, {"reinforce_leather_shirt_low";20;0.000000;0}, {"brigandine_gaiters_low";20;0.000000;0}, {"brigandine_low";20;0.000000;0}, {"mithril_scale_gaiters_low";20;0.000000;0}, {"manticor_skin_shirt_low";20;0.000000;0}, {"manticor_skin_gaiters_low";20;0.000000;0}, {"half_plate_low";20;0.000000;0}, {"plate_gaiters_low";20;0.000000;0}, {"slamander_skin_mail_low";20;0.000000;0}, {"bronze_shield_low";20;0.000000;0}, {"aspis_low";20;0.000000;0}, {"hoplon_low";20;0.000000;0}, {"kite_shield_low";20;0.000000;0}, {"brigandine_shield_low";20;0.000000;0}, {"square_shield_low";20;0.000000;0}, {"plate_shield_low";20;0.000000;0}, {"excellence_leather_gloves_low";20;0.000000;0}, {"leather_gauntlet_low";20;0.000000;0}, {"gauntlet_low";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";20;0.000000;0}, {"reinforce_leather_gloves_low";20;0.000000;0}, {"manticor_skin_gloves_low";20;0.000000;0}, {"brigandine_gauntlet_low";20;0.000000;0}, {"mithril_glove_low";20;0.000000;0}, {"ogre_power_gauntlet_low";20;0.000000;0}, {"leather_boots_low";20;0.000000;0}, {"blue_buckskin_boots_low";20;0.000000;0}, {"iron_boots_low";20;0.000000;0}, {"boots_of_power_low";20;0.000000;0}, {"reinforce_leather_boots_low";20;0.000000;0}, {"manticor_skin_boots_low";20;0.000000;0}, {"brigandine_boots_low";20;0.000000;0}, {"assault_boots_low";20;0.000000;0}, {"slamander_skin_boots_low";20;0.000000;0}, {"plate_boots_low";20;0.000000;0}, {"bone_helmet_low";20;0.000000;0}, {"bronze_helmet_low";20;0.000000;0}, {"helmet_low";20;0.000000;0}, {"brigandine_helmet_low";20;0.000000;0}, {"plate_helmet_low";20;0.000000;0}, {"mithril_boots_low";20;0.000000;0}, {"chain_mail_shirt_low";20;0.000000;0}, {"chain_gaiters_low";20;0.000000;0}, {"tempered_mithril_shirt_low";20;0.000000;0}, {"eldarake_low";20;0.000000;0}, {"tempered_mithril_gaiters_low";20;0.000000;0}, {"chain_boots_low";20;0.000000;0}, {"plate_leather_boots_low";20;0.000000;0}, {"dwarven_chain_boots_low";20;0.000000;0}, {"boots_of_seal_low";20;0.000000;0}, {"reinforce_mithril_gloves_low";20;0.000000;0}, {"chain_gloves_low";20;0.000000;0}, {"chain_shield_low";20;0.000000;0}, {"composite_armor_low";20;0.000000;0}, {"full_plate_armor_low";20;0.000000;0}, {"drake_leather_mail_low";20;0.000000;0}, {"knight_shield_low";20;0.000000;0}, {"tower_shield_low";20;0.000000;0}, {"composite_shield_low";20;0.000000;0}, {"full_plate_shield_low";20;0.000000;0}, {"dwarven_chain_gaiters_low";20;0.000000;0}, {"rind_leather_gaiters_low";20;0.000000;0}, {"theca_leather_gaiters_low";20;0.000000;0}, {"great_helmet_low";20;0.000000;0}, {"composite_helmet_low";20;0.000000;0}, {"shining_circlet_low";20;0.000000;0}, {"full_plate_helmet_low";20;0.000000;0}, {"dwarven_chain_gloves_low";20;0.000000;0}, {"gloves_of_seal_low";20;0.000000;0}, {"rind_leather_gloves_low";20;0.000000;0}, {"mithril_gauntlet_low";20;0.000000;0}, {"theca_leather_gloves_low";20;0.000000;0}, {"drake_leather_gloves_low";20;0.000000;0}, {"full_plate_gauntlet_low";20;0.000000;0}, {"crimson_boots_low";20;0.000000;0}, {"rind_leather_boots_low";20;0.000000;0}, {"composite_boots_low";20;0.000000;0}, {"theca_leather_boots_low";20;0.000000;0}, {"drake_leather_boots_low";20;0.000000;0}, {"full_plate_boots_low";20;0.000000;0}, {"dwarven_chain_mail_shirt_low";20;0.000000;0}, {"rind_leather_mail_low";20;0.000000;0}, {"theca_leather_mail_low";20;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";20;0.000000;0}, {"cursed_tunic_low";20;0.000000;0}, {"dark_hose_low";20;0.000000;0}, {"white_tunic_low";20;0.000000;0}, {"mage's_hose_low";20;0.000000;0}, {"mage's_tunic_low";20;0.000000;0}, {"hose_of_knowledge_low";20;0.000000;0}, {"tunic_of_knowledge_low";20;0.000000;0}, {"mithril_hose_low";20;0.000000;0}, {"mithril_tunic_low";20;0.000000;0}, {"sage's_rag_low";20;0.000000;0}, {"bronze_shield_low";20;0.000000;0}, {"aspis_low";20;0.000000;0}, {"hoplon_low";20;0.000000;0}, {"kite_shield_low";20;0.000000;0}, {"brigandine_shield_low";20;0.000000;0}, {"square_shield_low";20;0.000000;0}, {"plate_shield_low";20;0.000000;0}, {"excellence_leather_gloves_low";20;0.000000;0}, {"leather_gauntlet_low";20;0.000000;0}, {"gauntlet_low";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";20;0.000000;0}, {"gloves_of_knowledge_low";20;0.000000;0}, {"elven_mithril_gloves_low";20;0.000000;0}, {"mithril_glove_low";20;0.000000;0}, {"ogre_power_gauntlet_low";20;0.000000;0}, {"sage's_worn_gloves_low";20;0.000000;0}, {"leather_boots_low";20;0.000000;0}, {"blue_buckskin_boots_low";20;0.000000;0}, {"iron_boots_low";20;0.000000;0}, {"boots_of_power_low";20;0.000000;0}, {"boots_of_knowledge_low";20;0.000000;0}, {"elven_mithril_boots_low";20;0.000000;0}, {"demon's_gloves_low";20;0.000000;0}, {"blessed_gloves_low";20;0.000000;0}, {"assault_boots_low";20;0.000000;0}, {"slamander_skin_boots_low";20;0.000000;0}, {"plate_boots_low";20;0.000000;0}, {"demon's_boots_low";20;0.000000;0}, {"bone_helmet_low";20;0.000000;0}, {"bronze_helmet_low";20;0.000000;0}, {"helmet_low";20;0.000000;0}, {"brigandine_helmet_low";20;0.000000;0}, {"plate_helmet_low";20;0.000000;0}, {"karmian_tunic_low";20;0.000000;0}, {"karmian_hose_low";20;0.000000;0}, {"karmian_boots_low";20;0.000000;0}, {"karmian_gloves_low";20;0.000000;0}, {"robe_of_seal_low";20;0.000000;0}, {"demon's_hose_low";20;0.000000;0}, {"divine_hose_low";20;0.000000;0}, {"demon's_tunic_low";20;0.000000;0}, {"divine_tunic_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 60 && gg.HaveMemo(talker, 15) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sweet Whispers");

}
if (talker.level < 60 && gg.HaveMemo(talker, 15) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sweet Whispers");

}
if (gg.HaveMemo(talker, 15) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Sweet Whispers (Done)");

}
if (gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Sweet Whispers (In Progress)");

}
if (talker.level >= 82 && gg.HaveMemo(talker, 19) == 0 && myself.GetOneTimeQuestFlag(talker, 19) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Go to the Pastureland");

}
if (talker.level < 82 && gg.HaveMemo(talker, 19) == 0 && myself.GetOneTimeQuestFlag(talker, 19) == 0) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Go to the Pastureland");

}
if (gg.HaveMemo(talker, 19) == 0 && myself.GetOneTimeQuestFlag(talker, 19) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Go to the Pastureland (Done)");

}
if (gg.HaveMemo(talker, 19) == 1 && myself.GetOneTimeQuestFlag(talker, 19) == 0 && gg.GetMemoState(talker, 19) > 0) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Go to the Pastureland (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 60 && gg.HaveMemo(talker, 15) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "trader_vladimir_q0015_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 15);
myself.ShowQuestFHTML(talker, fhtml0, 15);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 60 && gg.HaveMemo(talker, 15) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_vladimir_q0015_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 15) == 0 && myself.GetOneTimeQuestFlag(talker, 15) == 1) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 1 * 10 + 1) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_vladimir_q0015_0105.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || talker.level >= 82 && gg.HaveMemo(talker, 19) == 0 && myself.GetOneTimeQuestFlag(talker, 19) == 0) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "trader_vladimir_q0019_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 19);
myself.ShowQuestFHTML(talker, fhtml0, 19);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || talker.level < 82 && gg.HaveMemo(talker, 19) == 0 && myself.GetOneTimeQuestFlag(talker, 19) == 0) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_vladimir_q0019_0103.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 19) == 0 && myself.GetOneTimeQuestFlag(talker, 19) == 1) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 19) == 1 && myself.GetOneTimeQuestFlag(talker, 19) == 0 && gg.GetMemoState(talker, 19) > 0) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_vladimir_q0019_0105.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 15) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 15);
myself.ShowQuestMark(talker, 15);
myself.SetMemoState(talker, 15, 1 * 10 + 1);
gg.AddLog(1, talker, 15);
myself.SetFlagJournal(talker, 15, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_vladimir_q0015_0104.htm", 15);

}
return;

}
if (quest_id == 19) {
myself.SetCurrentQuestID(19);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 19);
myself.ShowQuestMark(talker, 19);
myself.SetMemoState(talker, 19, 1);
gg.AddLog(1, talker, 19);
myself.SetFlagJournal(talker, 19, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_vladimir_q0019_0104.htm", 19);
myself.GiveItem1(talker, 15532, 1);

}
return;

}
super;
	}


}