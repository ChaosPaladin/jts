package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_espen extends merchant {
protected Object[][] SellList0 = {
{"tights_pants";20;0.000000;0}, {"tights_shirt";20;0.000000;0}, {"bone_breastplate";20;0.000000;0}, {"bone_gaiters";20;0.000000;0}, {"piece_bone_breastplate";20;0.000000;0}, {"bronze_breastplate";20;0.000000;0}, {"hard_leather_gaiters";20;0.000000;0}, {"piece_bone_gaiters";20;0.000000;0}, {"hard_leather_shirt";20;0.000000;0}, {"bronze_gaiters";20;0.000000;0}, {"puma_skin_gaiters";20;0.000000;0}, {"ring_breastplate";20;0.000000;0}, {"puma_skin_shirt";20;0.000000;0}, {"iron_plate_gaiters";20;0.000000;0}, {"lion_skin_gaiters";20;0.000000;0}, {"lion_skin_shirt";20;0.000000;0}, {"scale_mail";20;0.000000;0}, {"compound_scale_mail";20;0.000000;0}, {"dwarven_scale_mail";20;0.000000;0}, {"mithril_breastplate";20;0.000000;0}, {"mithril_gaiters";20;0.000000;0}, {"reinforce_leather_gaiters";20;0.000000;0}, {"scale_gaiters";20;0.000000;0}, {"blast_plate";20;0.000000;0}, {"compound_scale_gaiters";20;0.000000;0}, {"dwarven_scale_gaiters";20;0.000000;0}, {"mithril_banded_mail";20;0.000000;0}, {"mithril_banded_gaiters";20;0.000000;0}, {"reinforce_leather_shirt";20;0.000000;0}, {"brigandine_gaiters";20;0.000000;0}, {"brigandine";20;0.000000;0}, {"manticor_skin_shirt";20;0.000000;0}, {"manticor_skin_gaiters";20;0.000000;0}, {"mithril_scale_gaiters";20;0.000000;0}, {"half_plate";20;0.000000;0}, {"plate_gaiters";20;0.000000;0}, {"slamander_skin_mail";20;0.000000;0}, {"round_shield";20;0.000000;0}, {"bone_shield";20;0.000000;0}, {"bronze_shield";20;0.000000;0}, {"aspis";20;0.000000;0}, {"hoplon";20;0.000000;0}, {"kite_shield";20;0.000000;0}, {"brigandine_shield";20;0.000000;0}, {"square_shield";20;0.000000;0}, {"plate_shield";20;0.000000;0}, {"leather_gloves";20;0.000000;0}, {"bracer";20;0.000000;0}, {"excellence_leather_gloves";20;0.000000;0}, {"leather_gauntlet";20;0.000000;0}, {"gauntlet";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul";20;0.000000;0}, {"reinforce_leather_gloves";20;0.000000;0}, {"manticor_skin_gloves";20;0.000000;0}, {"mithril_glove";20;0.000000;0}, {"ogre_power_gauntlet";20;0.000000;0}, {"low_boots";20;0.000000;0}, {"boots";20;0.000000;0}, {"leather_boots";20;0.000000;0}, {"blue_buckskin_boots";20;0.000000;0}, {"iron_boots";20;0.000000;0}, {"boots_of_power";20;0.000000;0}, {"reinforce_leather_boots";20;0.000000;0}, {"manticor_skin_boots";20;0.000000;0}, {"brigandine_boots";20;0.000000;0}, {"assault_boots";20;0.000000;0}, {"slamander_skin_boots";20;0.000000;0}, {"plate_boots";20;0.000000;0}, {"leather_helmet";20;0.000000;0}, {"hard_leather_helmet";20;0.000000;0}, {"bone_helmet";20;0.000000;0}, {"bronze_helmet";20;0.000000;0}, {"helmet";20;0.000000;0}, {"brigandine_helmet";20;0.000000;0}, {"plate_helmet";20;0.000000;0}, {"tshirt";20;0.000000;0}, {"cotton_tshirt";20;0.000000;0}, {"pattern_tshirt";20;0.000000;0}, {"pattern_cotton_tshirt";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose_of_devotion";20;0.000000;0}, {"tunic_of_devotion";20;0.000000;0}, {"hose_of_magicpower";20;0.000000;0}, {"tunic_of_magicpower";20;0.000000;0}, {"cursed_hose";20;0.000000;0}, {"cursed_tunic";20;0.000000;0}, {"dark_hose";20;0.000000;0}, {"white_tunic";20;0.000000;0}, {"mage's_hose";20;0.000000;0}, {"mage's_tunic";20;0.000000;0}, {"hose_of_knowledge";20;0.000000;0}, {"tunic_of_knowledge";20;0.000000;0}, {"mithril_hose";20;0.000000;0}, {"mithril_tunic";20;0.000000;0}, {"sage's_rag";20;0.000000;0}, {"round_shield";20;0.000000;0}, {"bone_shield";20;0.000000;0}, {"bronze_shield";20;0.000000;0}, {"aspis";20;0.000000;0}, {"hoplon";20;0.000000;0}, {"kite_shield";20;0.000000;0}, {"brigandine_shield";20;0.000000;0}, {"square_shield";20;0.000000;0}, {"plate_shield";20;0.000000;0}, {"leather_gloves";20;0.000000;0}, {"bracer";20;0.000000;0}, {"excellence_leather_gloves";20;0.000000;0}, {"leather_gauntlet";20;0.000000;0}, {"gauntlet";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul";20;0.000000;0}, {"gloves_of_knowledge";20;0.000000;0}, {"elven_mithril_gloves";20;0.000000;0}, {"mithril_glove";20;0.000000;0}, {"ogre_power_gauntlet";20;0.000000;0}, {"sage's_worn_gloves";20;0.000000;0}, {"low_boots";20;0.000000;0}, {"boots";20;0.000000;0}, {"leather_boots";20;0.000000;0}, {"blue_buckskin_boots";20;0.000000;0}, {"iron_boots";20;0.000000;0}, {"boots_of_power";20;0.000000;0}, {"boots_of_knowledge";20;0.000000;0}, {"elven_mithril_boots";20;0.000000;0}, {"assault_boots";20;0.000000;0}, {"slamander_skin_boots";20;0.000000;0}, {"plate_boots";20;0.000000;0}, {"leather_helmet";20;0.000000;0}, {"hard_leather_helmet";20;0.000000;0}, {"bone_helmet";20;0.000000;0}, {"bronze_helmet";20;0.000000;0}, {"helmet";20;0.000000;0}, {"brigandine_helmet";20;0.000000;0}, {"plate_helmet";20;0.000000;0}, {"tshirt";20;0.000000;0}, {"cotton_tshirt";20;0.000000;0}, {"pattern_tshirt";20;0.000000;0}, {"pattern_cotton_tshirt";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"puma_skin_gaiters_low";20;0.000000;0}, {"ring_breastplate_low";20;0.000000;0}, {"puma_skin_shirt_low";20;0.000000;0}, {"iron_plate_gaiters_low";20;0.000000;0}, {"lion_skin_gaiters_low";20;0.000000;0}, {"lion_skin_shirt_low";20;0.000000;0}, {"scale_mail_low";20;0.000000;0}, {"compound_scale_mail_low";20;0.000000;0}, {"dwarven_scale_mail_low";20;0.000000;0}, {"mithril_breastplate_low";20;0.000000;0}, {"mithril_gaiters_low";20;0.000000;0}, {"reinforce_leather_gaiters_low";20;0.000000;0}, {"scale_gaiters_low";20;0.000000;0}, {"blast_plate_low";20;0.000000;0}, {"compound_scale_gaiters_low";20;0.000000;0}, {"dwarven_scale_gaiters_low";20;0.000000;0}, {"mithril_banded_mail_low";20;0.000000;0}, {"mithril_banded_gaiters_low";20;0.000000;0}, {"reinforce_leather_shirt_low";20;0.000000;0}, {"brigandine_gaiters_low";20;0.000000;0}, {"brigandine_low";20;0.000000;0}, {"mithril_scale_gaiters_low";20;0.000000;0}, {"manticor_skin_shirt_low";20;0.000000;0}, {"manticor_skin_gaiters_low";20;0.000000;0}, {"half_plate_low";20;0.000000;0}, {"plate_gaiters_low";20;0.000000;0}, {"slamander_skin_mail_low";20;0.000000;0}, {"bronze_shield_low";20;0.000000;0}, {"aspis_low";20;0.000000;0}, {"hoplon_low";20;0.000000;0}, {"kite_shield_low";20;0.000000;0}, {"square_shield_low";20;0.000000;0}, {"plate_shield_low";20;0.000000;0}, {"excellence_leather_gloves_low";20;0.000000;0}, {"leather_gauntlet_low";20;0.000000;0}, {"gauntlet_low";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";20;0.000000;0}, {"reinforce_leather_gloves_low";20;0.000000;0}, {"mithril_glove_low";20;0.000000;0}, {"ogre_power_gauntlet_low";20;0.000000;0}, {"leather_boots_low";20;0.000000;0}, {"blue_buckskin_boots_low";20;0.000000;0}, {"iron_boots_low";20;0.000000;0}, {"boots_of_power_low";20;0.000000;0}, {"reinforce_leather_boots_low";20;0.000000;0}, {"assault_boots_low";20;0.000000;0}, {"slamander_skin_boots_low";20;0.000000;0}, {"plate_boots_low";20;0.000000;0}, {"bone_helmet_low";20;0.000000;0}, {"bronze_helmet_low";20;0.000000;0}, {"helmet_low";20;0.000000;0}, {"plate_helmet_low";20;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";20;0.000000;0}, {"cursed_tunic_low";20;0.000000;0}, {"dark_hose_low";20;0.000000;0}, {"white_tunic_low";20;0.000000;0}, {"mage's_hose_low";20;0.000000;0}, {"mage's_tunic_low";20;0.000000;0}, {"hose_of_knowledge_low";20;0.000000;0}, {"tunic_of_knowledge_low";20;0.000000;0}, {"mithril_hose_low";20;0.000000;0}, {"mithril_tunic_low";20;0.000000;0}, {"sage's_rag_low";20;0.000000;0}, {"bronze_shield_low";20;0.000000;0}, {"aspis_low";20;0.000000;0}, {"hoplon_low";20;0.000000;0}, {"kite_shield_low";20;0.000000;0}, {"brigandine_shield_low";20;0.000000;0}, {"square_shield_low";20;0.000000;0}, {"plate_shield_low";20;0.000000;0}, {"excellence_leather_gloves_low";20;0.000000;0}, {"leather_gauntlet_low";20;0.000000;0}, {"gauntlet_low";20;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";20;0.000000;0}, {"gloves_of_knowledge_low";20;0.000000;0}, {"elven_mithril_gloves_low";20;0.000000;0}, {"mithril_glove_low";20;0.000000;0}, {"ogre_power_gauntlet_low";20;0.000000;0}, {"sage's_worn_gloves_low";20;0.000000;0}, {"leather_boots_low";20;0.000000;0}, {"blue_buckskin_boots_low";20;0.000000;0}, {"iron_boots_low";20;0.000000;0}, {"boots_of_power_low";20;0.000000;0}, {"boots_of_knowledge_low";20;0.000000;0}, {"elven_mithril_boots_low";20;0.000000;0}, {"assault_boots_low";20;0.000000;0}, {"slamander_skin_boots_low";20;0.000000;0}, {"plate_boots_low";20;0.000000;0}, {"bone_helmet_low";20;0.000000;0}, {"bronze_helmet_low";20;0.000000;0}, {"helmet_low";20;0.000000;0}, {"plate_helmet_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 383) == 0 && talker.level < 42) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Treasure Hunt");

}
if (gg.HaveMemo(talker, 383) == 0 && talker.level >= 42 && gg.OwnItemCount(talker, 5915) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Treasure Hunt");

}
if (gg.HaveMemo(talker, 383) == 0 && talker.level >= 42 && gg.OwnItemCount(talker, 5915) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Treasure Hunt");

}
if (gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Treasure Hunt (In Progress)");

}
if (gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Treasure Hunt (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 383) == 0 && talker.level < 42) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_espen_q0383_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 383) == 0 && talker.level >= 42 && gg.OwnItemCount(talker, 5915) == 0) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_espen_q0383_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 383) == 0 && talker.level >= 42 && gg.OwnItemCount(talker, 5915) > 0) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "trader_espen_q0383_03.htm", 383);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 1) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_espen_q0383_13.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 2) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_espen_q0383_14.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 383) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (gg.HaveMemo(talker, 383) == 0 && talker.level >= 42 && gg.OwnItemCount(talker, 5915) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 5915, 1);
myself.SetMemoState(talker, 383, 1);
myself.SetJournal(talker, 383, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "trader_espen_q0383_08.htm", 383);
gg.AddLog(1, talker, quest_id);

}

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 383) {
myself.SetCurrentQuestID(383);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 383) {
if (reply == 1) {
myself.ShowQuestPage(talker, "trader_espen_q0383_04.htm", 383);

}
if (reply == 2 && gg.OwnItemCount(talker, 5915) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, 1000);
myself.RemoveMemo(talker, 383);
gg.AddLog(2, talker, 383);
myself.DeleteItem1(talker, 5915, 1);
myself.ShowQuestPage(talker, "trader_espen_q0383_05.htm", 383);

}

}
if (reply == 3) {
if (gg.OwnItemCount(talker, 5915) > 0) {
myself.FHTML_SetFileName(fhtml0, "trader_espen_q0383_06.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 383);
myself.ShowQuestFHTML(talker, fhtml0, 383);

} else {
myself.ShowPage(talker, "trader_espen_q0383_07.htm");

}

}
if (reply == 4) {
myself.ShowPage(talker, "trader_espen_q0383_09.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "trader_espen_q0383_10.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "trader_espen_q0383_11.htm");

}
if (reply == 7) {
if (gg.HaveMemo(talker, 383) == 1 && gg.GetMemoState(talker, 383) == 1) {
myself.SetMemoState(talker, 383, 2);
myself.SetJournal(talker, 383, 2);
myself.ShowQuestMark(talker, 383);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "trader_espen_q0383_12.htm");

}

}

}
super;
	}


}