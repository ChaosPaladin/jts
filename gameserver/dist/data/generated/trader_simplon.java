package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_simplon extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"tights_pants";20;0.000000;0}, {"tights_shirt";20;0.000000;0}, {"bone_breastplate";20;0.000000;0}, {"bone_gaiters";20;0.000000;0}, {"piece_bone_breastplate";20;0.000000;0}, {"bronze_breastplate";20;0.000000;0}, {"hard_leather_gaiters";20;0.000000;0}, {"piece_bone_gaiters";20;0.000000;0}, {"hard_leather_shirt";20;0.000000;0}, {"bronze_gaiters";20;0.000000;0}, {"puma_skin_gaiters";20;0.000000;0}, {"ring_breastplate";20;0.000000;0}, {"iron_plate_gaiters";20;0.000000;0}, {"puma_skin_shirt";20;0.000000;0}, {"lion_skin_gaiters";20;0.000000;0}, {"lion_skin_shirt";20;0.000000;0}, {"mithril_breastplate";20;0.000000;0}, {"mithril_gaiters";20;0.000000;0}, {"round_shield";20;0.000000;0}, {"bone_shield";20;0.000000;0}, {"bronze_shield";20;0.000000;0}, {"aspis";20;0.000000;0}, {"leather_gloves";20;0.000000;0}, {"bracer";20;0.000000;0}, {"excellence_leather_gloves";20;0.000000;0}, {"leather_gauntlet";20;0.000000;0}, {"low_boots";20;0.000000;0}, {"boots";20;0.000000;0}, {"leather_boots";20;0.000000;0}, {"blue_buckskin_boots";20;0.000000;0}, {"leather_helmet";20;0.000000;0}, {"hard_leather_helmet";20;0.000000;0}, {"bone_helmet";20;0.000000;0}, {"bronze_helmet";20;0.000000;0}, {"mithril_banded_gaiters";20;0.000000;0}, {"mithril_banded_mail";20;0.000000;0}, {"tshirt";20;0.000000;0}, {"cotton_tshirt";20;0.000000;0}, {"pattern_tshirt";20;0.000000;0}, {"pattern_cotton_tshirt";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose_of_devotion";20;0.000000;0}, {"tunic_of_devotion";20;0.000000;0}, {"hose_of_magicpower";20;0.000000;0}, {"tunic_of_magicpower";20;0.000000;0}, {"cursed_hose";20;0.000000;0}, {"cursed_tunic";20;0.000000;0}, {"dark_hose";20;0.000000;0}, {"white_tunic";20;0.000000;0}, {"mage's_hose";20;0.000000;0}, {"mage's_tunic";20;0.000000;0}, {"hose_of_knowledge";20;0.000000;0}, {"tunic_of_knowledge";20;0.000000;0}, {"round_shield";20;0.000000;0}, {"bone_shield";20;0.000000;0}, {"bronze_shield";20;0.000000;0}, {"aspis";20;0.000000;0}, {"leather_gloves";20;0.000000;0}, {"bracer";20;0.000000;0}, {"excellence_leather_gloves";20;0.000000;0}, {"leather_gauntlet";20;0.000000;0}, {"low_boots";20;0.000000;0}, {"boots";20;0.000000;0}, {"leather_boots";20;0.000000;0}, {"blue_buckskin_boots";20;0.000000;0}, {"leather_helmet";20;0.000000;0}, {"hard_leather_helmet";20;0.000000;0}, {"bone_helmet";20;0.000000;0}, {"bronze_helmet";20;0.000000;0}, {"tshirt";20;0.000000;0}, {"cotton_tshirt";20;0.000000;0}, {"pattern_tshirt";20;0.000000;0}, {"pattern_cotton_tshirt";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"puma_skin_gaiters_low";20;0.000000;0}, {"ring_breastplate_low";20;0.000000;0}, {"iron_plate_gaiters_low";20;0.000000;0}, {"puma_skin_shirt_low";20;0.000000;0}, {"lion_skin_gaiters_low";20;0.000000;0}, {"lion_skin_shirt_low";20;0.000000;0}, {"mithril_breastplate_low";20;0.000000;0}, {"mithril_gaiters_low";20;0.000000;0}, {"bronze_shield_low";20;0.000000;0}, {"aspis_low";20;0.000000;0}, {"excellence_leather_gloves_low";20;0.000000;0}, {"leather_gauntlet_low";20;0.000000;0}, {"leather_boots_low";20;0.000000;0}, {"blue_buckskin_boots_low";20;0.000000;0}, {"bone_helmet_low";20;0.000000;0}, {"bronze_helmet_low";20;0.000000;0}, {"mithril_banded_gaiters_low";20;0.000000;0}, {"mithril_banded_mail_low";20;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";20;0.000000;0}, {"cursed_tunic_low";20;0.000000;0}, {"dark_hose_low";20;0.000000;0}, {"white_tunic_low";20;0.000000;0}, {"mage's_hose_low";20;0.000000;0}, {"mage's_tunic_low";20;0.000000;0}, {"hose_of_knowledge_low";20;0.000000;0}, {"tunic_of_knowledge_low";20;0.000000;0}, {"bronze_shield_low";20;0.000000;0}, {"aspis_low";20;0.000000;0}, {"excellence_leather_gloves_low";20;0.000000;0}, {"leather_gauntlet_low";20;0.000000;0}, {"leather_boots_low";20;0.000000;0}, {"blue_buckskin_boots_low";20;0.000000;0}, {"bone_helmet_low";20;0.000000;0}, {"bronze_helmet_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Path of the Cleric (In Progress)");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1138)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Path of the Warrior (In Progress)");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1139)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Path of the Warrior (In Progress)");

}
if (gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1143)) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Path of the Warrior (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 405) == 1 && gg.OwnItemCount(talker, 1191) == 1) {
myself.SetCurrentQuestID(405);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1195) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_simplon_q0405_01.htm");
myself.GiveItem1(talker, 1195, 3);
if (gg.OwnItemCount(talker, 1195) >= 0 && gg.OwnItemCount(talker, 1194) >= 1 && gg.OwnItemCount(talker, 1196) >= 1) {
myself.SetFlagJournal(talker, 405, 2);
myself.ShowQuestMark(talker, 405);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

} else if (gg.OwnItemCount(talker, 1195) > 0) {
myself.ShowPage(talker, "trader_simplon_q0405_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1138)) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_simplon_q0401_01.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1139)) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1140) < 1) {
myself.ShowPage(talker, "trader_simplon_q0401_03.htm");

} else if (gg.OwnItemCount(talker, 1140) < 10) {
myself.ShowPage(talker, "trader_simplon_q0401_04.htm");

} else if (gg.OwnItemCount(talker, 1140) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1139, 1);
myself.DeleteItem1(talker, 1140, gg.OwnItemCount(talker, 1140));
myself.GiveItem1(talker, 1141, 1);
myself.GiveItem1(talker, 1143, 1);
myself.ShowPage(talker, "trader_simplon_q0401_05.htm");
myself.SetFlagJournal(talker, 401, 4);
myself.ShowQuestMark(talker, 401);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 401) == 1 && gg.OwnItemCount(talker, 1143)) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_simplon_q0401_06.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 401) {
myself.SetCurrentQuestID(401);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 401) {
if (reply == 1 && gg.OwnItemCount(talker, 1138) > 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_simplon_q0401_02.htm");
myself.DeleteItem1(talker, 1138, 1);
myself.GiveItem1(talker, 1139, 1);
myself.SetFlagJournal(talker, 401, 2);
myself.ShowQuestMark(talker, 401);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}