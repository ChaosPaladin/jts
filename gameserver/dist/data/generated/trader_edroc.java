package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_edroc extends merchant {
protected Object[][] SellList0 = {
{"tights_pants";30;0.000000;0}, {"tights_shirt";30;0.000000;0}, {"bone_breastplate";30;0.000000;0}, {"bone_gaiters";30;0.000000;0}, {"piece_bone_breastplate";30;0.000000;0}, {"bronze_breastplate";30;0.000000;0}, {"hard_leather_gaiters";30;0.000000;0}, {"piece_bone_gaiters";30;0.000000;0}, {"hard_leather_shirt";30;0.000000;0}, {"bronze_gaiters";30;0.000000;0}, {"puma_skin_gaiters";30;0.000000;0}, {"ring_breastplate";30;0.000000;0}, {"iron_plate_gaiters";30;0.000000;0}, {"puma_skin_shirt";30;0.000000;0}, {"lion_skin_gaiters";30;0.000000;0}, {"lion_skin_shirt";30;0.000000;0}, {"mithril_breastplate";30;0.000000;0}, {"mithril_gaiters";30;0.000000;0}, {"round_shield";30;0.000000;0}, {"bone_shield";30;0.000000;0}, {"bronze_shield";30;0.000000;0}, {"aspis";30;0.000000;0}, {"leather_gloves";30;0.000000;0}, {"bracer";30;0.000000;0}, {"excellence_leather_gloves";30;0.000000;0}, {"leather_gauntlet";30;0.000000;0}, {"low_boots";30;0.000000;0}, {"boots";30;0.000000;0}, {"leather_boots";30;0.000000;0}, {"blue_buckskin_boots";30;0.000000;0}, {"leather_helmet";30;0.000000;0}, {"hard_leather_helmet";30;0.000000;0}, {"bone_helmet";30;0.000000;0}, {"bronze_helmet";30;0.000000;0}, {"mithril_banded_gaiters";30;0.000000;0}, {"mithril_banded_mail";30;0.000000;0}, {"tshirt";30;0.000000;0}, {"cotton_tshirt";30;0.000000;0}, {"pattern_tshirt";30;0.000000;0}, {"pattern_cotton_tshirt";30;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose_of_devotion";30;0.000000;0}, {"tunic_of_devotion";30;0.000000;0}, {"hose_of_magicpower";30;0.000000;0}, {"tunic_of_magicpower";30;0.000000;0}, {"cursed_hose";30;0.000000;0}, {"cursed_tunic";30;0.000000;0}, {"dark_hose";30;0.000000;0}, {"white_tunic";30;0.000000;0}, {"mage's_hose";30;0.000000;0}, {"mage's_tunic";30;0.000000;0}, {"hose_of_knowledge";30;0.000000;0}, {"tunic_of_knowledge";30;0.000000;0}, {"round_shield";30;0.000000;0}, {"bone_shield";30;0.000000;0}, {"bronze_shield";30;0.000000;0}, {"aspis";30;0.000000;0}, {"leather_gloves";30;0.000000;0}, {"bracer";30;0.000000;0}, {"excellence_leather_gloves";30;0.000000;0}, {"leather_gauntlet";30;0.000000;0}, {"low_boots";30;0.000000;0}, {"boots";30;0.000000;0}, {"leather_boots";30;0.000000;0}, {"blue_buckskin_boots";30;0.000000;0}, {"leather_helmet";30;0.000000;0}, {"hard_leather_helmet";30;0.000000;0}, {"bone_helmet";30;0.000000;0}, {"bronze_helmet";30;0.000000;0}, {"tshirt";30;0.000000;0}, {"cotton_tshirt";30;0.000000;0}, {"pattern_tshirt";30;0.000000;0}, {"pattern_cotton_tshirt";30;0.000000;0}
};
protected Object[][] SellList4 = {
{"puma_skin_gaiters_low";30;0.000000;0}, {"ring_breastplate_low";30;0.000000;0}, {"iron_plate_gaiters_low";30;0.000000;0}, {"puma_skin_shirt_low";30;0.000000;0}, {"lion_skin_gaiters_low";30;0.000000;0}, {"lion_skin_shirt_low";30;0.000000;0}, {"mithril_breastplate_low";30;0.000000;0}, {"mithril_gaiters_low";30;0.000000;0}, {"bronze_shield_low";30;0.000000;0}, {"aspis_low";30;0.000000;0}, {"excellence_leather_gloves_low";30;0.000000;0}, {"leather_gauntlet_low";30;0.000000;0}, {"leather_boots_low";30;0.000000;0}, {"blue_buckskin_boots_low";30;0.000000;0}, {"bone_helmet_low";30;0.000000;0}, {"bronze_helmet_low";30;0.000000;0}, {"mithril_banded_gaiters_low";30;0.000000;0}, {"mithril_banded_mail_low";30;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";30;0.000000;0}, {"cursed_tunic_low";30;0.000000;0}, {"dark_hose_low";30;0.000000;0}, {"white_tunic_low";30;0.000000;0}, {"mage's_hose_low";30;0.000000;0}, {"mage's_tunic_low";30;0.000000;0}, {"hose_of_knowledge_low";30;0.000000;0}, {"tunic_of_knowledge_low";30;0.000000;0}, {"bronze_shield_low";30;0.000000;0}, {"aspis_low";30;0.000000;0}, {"excellence_leather_gloves_low";30;0.000000;0}, {"leather_gauntlet_low";30;0.000000;0}, {"leather_boots_low";30;0.000000;0}, {"blue_buckskin_boots_low";30;0.000000;0}, {"bone_helmet_low";30;0.000000;0}, {"bronze_helmet_low";30;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2702) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2704) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Scholar (In Progress)");

}
if (gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) == 1 && gg.OwnItemCount(talker, 2713) >= 1 || gg.OwnItemCount(talker, 2705) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Scholar (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2702) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_edroc_q0214_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) >= 1 && gg.OwnItemCount(talker, 2704) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_edroc_q0214_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 214) == 1 && gg.OwnItemCount(talker, 2703) == 1 && gg.OwnItemCount(talker, 2713) >= 1 || gg.OwnItemCount(talker, 2705) >= 1) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_edroc_q0214_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 214) {
myself.SetCurrentQuestID(214);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 214) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 2702) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_edroc_q0214_02.htm");
myself.SetFlagJournal(talker, 214, 24);
myself.ShowQuestMark(talker, 214);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2702, 1);
myself.GiveItem1(talker, 2704, 1);

}

}

}

}
super;
	}


}