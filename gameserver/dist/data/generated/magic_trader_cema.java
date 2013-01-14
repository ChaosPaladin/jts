package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magic_trader_cema extends merchant_for_chaotic {
protected Object[][] SellList0 = {
{"apprentice's_staff";50;0.000000;0}, {"relic_of_saints";50;0.000000;0}, {"mage_staff";50;0.000000;0}, {"crucifix_of_blessing";50;0.000000;0}, {"voodoo_doll";50;0.000000;0}, {"bone_staff";50;0.000000;0}, {"scroll_of_wisdom";50;0.000000;0}, {"branch_of_life";50;0.000000;0}, {"proof_of_revenge";50;0.000000;0}, {"mace_of_prayer";50;0.000000;0}, {"doom_hammer";50;0.000000;0}, {"mystic_staff";50;0.000000;0}, {"staff_of_mana";50;0.000000;0}, {"divine_tome";50;0.000000;0}, {"sword_of_magic";50;0.000000;0}, {"sword_of_mystic";50;0.000000;0}, {"sword_of_occult";50;0.000000;0}, {"dagger_of_mana";50;0.000000;0}, {"mystic_knife";50;0.000000;0}, {"conjure_knife";50;0.000000;0}, {"knife_o'_silenus";50;0.000000;0}, {"staff_of_magicpower";50;0.000000;0}, {"blood_of_saints";50;0.000000;0}, {"tome_of_blood";50;0.000000;0}, {"goathead_staff";50;0.000000;0}, {"crucifix_of_blood";50;0.000000;0}, {"demon_fangs";50;0.000000;0}, {"atuba_hammer";50;0.000000;0}, {"ghost_staff";50;0.000000;0}, {"life_stick";50;0.000000;0}, {"atuba_mace";50;0.000000;0}, {"hose_of_devotion";50;0.000000;0}, {"tunic_of_devotion";50;0.000000;0}, {"hose_of_magicpower";50;0.000000;0}, {"tunic_of_magicpower";50;0.000000;0}, {"cursed_hose";50;0.000000;0}, {"cursed_tunic";50;0.000000;0}, {"dark_hose";50;0.000000;0}, {"white_tunic";50;0.000000;0}, {"mage's_hose";50;0.000000;0}, {"mage's_tunic";50;0.000000;0}, {"hose_of_knowledge";50;0.000000;0}, {"tunic_of_knowledge";50;0.000000;0}, {"mithril_hose";50;0.000000;0}, {"mithril_tunic";50;0.000000;0}, {"sage's_rag";50;0.000000;0}, {"round_shield";50;0.000000;0}, {"bone_shield";50;0.000000;0}, {"bronze_shield";50;0.000000;0}, {"aspis";50;0.000000;0}, {"hoplon";50;0.000000;0}, {"kite_shield";50;0.000000;0}, {"brigandine_shield";50;0.000000;0}, {"square_shield";50;0.000000;0}, {"plate_shield";50;0.000000;0}, {"leather_gloves";50;0.000000;0}, {"bracer";50;0.000000;0}, {"excellence_leather_gloves";50;0.000000;0}, {"leather_gauntlet";50;0.000000;0}, {"gauntlet";50;0.000000;0}, {"gauntlet_of_repose_of_the_soul";50;0.000000;0}, {"gloves_of_knowledge";50;0.000000;0}, {"elven_mithril_gloves";50;0.000000;0}, {"mithril_glove";50;0.000000;0}, {"ogre_power_gauntlet";50;0.000000;0}, {"sage's_worn_gloves";50;0.000000;0}, {"low_boots";50;0.000000;0}, {"boots";50;0.000000;0}, {"leather_boots";50;0.000000;0}, {"blue_buckskin_boots";50;0.000000;0}, {"iron_boots";50;0.000000;0}, {"boots_of_power";50;0.000000;0}, {"boots_of_knowledge";50;0.000000;0}, {"elven_mithril_boots";50;0.000000;0}, {"assault_boots";50;0.000000;0}, {"slamander_skin_boots";50;0.000000;0}, {"plate_boots";50;0.000000;0}, {"leather_helmet";50;0.000000;0}, {"hard_leather_helmet";50;0.000000;0}, {"bone_helmet";50;0.000000;0}, {"bronze_helmet";50;0.000000;0}, {"helmet";50;0.000000;0}, {"brigandine_helmet";50;0.000000;0}, {"plate_helmet";50;0.000000;0}, {"tshirt";50;0.000000;0}, {"cotton_tshirt";50;0.000000;0}, {"pattern_tshirt";50;0.000000;0}, {"pattern_cotton_tshirt";50;0.000000;0}
};
protected Object[][] SellList1 = {
{"soulshot_none";50;0.000000;0}, {"spiritshot_none";50;0.000000;0}, {"blessed_spiritshot_none";50;0.000000;0}, {"comp_bspiritshot_none";50;0.000000;0}, {"comp_spiritshot_none";50;0.000000;0}, {"comp_soulshot_none";50;0.000000;0}, {"adv_comp_bspiritshot_none";50;0.000000;0}, {"adv_comp_spiritshot_none";50;0.000000;0}, {"adv_comp_soulshot_none";50;0.000000;0}, {"wooden_arrow";50;0.000000;0}, {"bone_arrow";50;0.000000;0}, {"fine_steel_arrow";50;0.000000;0}, {"lesser_healing_potion";50;0.000000;0}, {"healing_potion";50;0.000000;0}, {"antidote";50;0.000000;0}, {"advanced_antidote";50;0.000000;0}, {"bandage";50;0.000000;0}, {"emergency_dressing";50;0.000000;0}, {"quick_step_potion";50;0.000000;0}, {"swift_attack_potion";50;0.000000;0}, {"potion_of_acumen2";50;0.000000;0}, {"scroll_of_awake";50;0.000000;0}, {"scroll_of_escape";50;0.000000;0}, {"scroll_of_resurrection";50;0.000000;0}, {"scroll_of_escape_to_agit";50;0.000000;0}, {"scroll_of_escape_to_castle";50;0.000000;0}, {"energy_stone";50;0.000000;0}, {"key_of_thief";50;0.000000;0}, {"cursed_bone";50;0.000000;0}, {"bone_bolt";50;0.000000;0}, {"fine_steel_bolt";50;0.000000;0}, {"blank_soul_bottle_5";50;0.000000;0}, {"dice_heart";50;0.000000;0}, {"dice_spade";50;0.000000;0}, {"dice_clover";50;0.000000;0}, {"dice_diamond";50;0.000000;0}
};
protected Object[][] SellList4 = {
{"bone_staff_low";50;0.000000;0}, {"scroll_of_wisdom_low";50;0.000000;0}, {"branch_of_life_low";50;0.000000;0}, {"proof_of_revenge_low";50;0.000000;0}, {"mace_of_prayer_low";50;0.000000;0}, {"doom_hammer_low";50;0.000000;0}, {"mystic_staff_low";50;0.000000;0}, {"staff_of_mana_low";50;0.000000;0}, {"divine_tome_low";50;0.000000;0}, {"sword_of_magic_low";50;0.000000;0}, {"sword_of_mystic_low";50;0.000000;0}, {"sword_of_occult_low";50;0.000000;0}, {"dagger_of_mana_low";50;0.000000;0}, {"mystic_knife_low";50;0.000000;0}, {"conjure_knife_low";50;0.000000;0}, {"knife_o'_silenus_low";50;0.000000;0}, {"staff_of_magicpower_low";50;0.000000;0}, {"blood_of_saints_low";50;0.000000;0}, {"tome_of_blood_low";50;0.000000;0}, {"goathead_staff_low";50;0.000000;0}, {"crucifix_of_blood_low";50;0.000000;0}, {"demon_fangs_low";50;0.000000;0}, {"atuba_hammer_low";50;0.000000;0}, {"ghost_staff_low";50;0.000000;0}, {"life_stick_low";50;0.000000;0}, {"atuba_mace_low";50;0.000000;0}, {"cursed_hose_low";50;0.000000;0}, {"cursed_tunic_low";50;0.000000;0}, {"dark_hose_low";50;0.000000;0}, {"white_tunic_low";50;0.000000;0}, {"mage's_hose_low";50;0.000000;0}, {"mage's_tunic_low";50;0.000000;0}, {"hose_of_knowledge_low";50;0.000000;0}, {"tunic_of_knowledge_low";50;0.000000;0}, {"mithril_hose_low";50;0.000000;0}, {"mithril_tunic_low";50;0.000000;0}, {"sage's_rag_low";50;0.000000;0}, {"bronze_shield_low";50;0.000000;0}, {"aspis_low";50;0.000000;0}, {"hoplon_low";50;0.000000;0}, {"kite_shield_low";50;0.000000;0}, {"brigandine_shield_low";50;0.000000;0}, {"square_shield_low";50;0.000000;0}, {"plate_shield_low";50;0.000000;0}, {"excellence_leather_gloves_low";50;0.000000;0}, {"leather_gauntlet_low";50;0.000000;0}, {"gauntlet_low";50;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";50;0.000000;0}, {"gloves_of_knowledge_low";50;0.000000;0}, {"reinforce_leather_gloves_low";50;0.000000;0}, {"manticor_skin_gloves_low";50;0.000000;0}, {"brigandine_gauntlet_low";50;0.000000;0}, {"mithril_glove_low";50;0.000000;0}, {"ogre_power_gauntlet_low";50;0.000000;0}, {"sage's_worn_gloves_low";50;0.000000;0}, {"leather_boots_low";50;0.000000;0}, {"blue_buckskin_boots_low";50;0.000000;0}, {"iron_boots_low";50;0.000000;0}, {"boots_of_power_low";50;0.000000;0}, {"reinforce_leather_boots_low";50;0.000000;0}, {"boots_of_knowledge_low";50;0.000000;0}, {"manticor_skin_boots_low";50;0.000000;0}, {"brigandine_boots_low";50;0.000000;0}, {"assault_boots_low";50;0.000000;0}, {"slamander_skin_boots_low";50;0.000000;0}, {"plate_boots_low";50;0.000000;0}, {"bone_helmet_low";50;0.000000;0}, {"bronze_helmet_low";50;0.000000;0}, {"helmet_low";50;0.000000;0}, {"brigandine_helmet_low";50;0.000000;0}, {"plate_helmet_low";50;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 343) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Under the Shadow of the Ivory Tower");

}
if (gg.HaveMemo(talker, 343) == 1 && gg.OwnItemCount(talker, 4364) < 1 && myself.IsInCategory(2, talker.occupation)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Under the Shadow of the Ivory Tower (In Progress)");

}
if (gg.HaveMemo(talker, 343) == 1 && gg.OwnItemCount(talker, 4364) >= 1 && myself.IsInCategory(2, talker.occupation)) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Under the Shadow of the Ivory Tower (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 343) == 0) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.IsInCategory(2, talker.occupation) == 0) {
myself.ShowQuestPage(talker, "magic_trader_cema_q0343_01.htm", 343);

} else if (myself.IsInCategory(2, talker.occupation) && talker.level < 40) {
myself.ShowQuestPage(talker, "magic_trader_cema_q0343_02.htm", 343);

} else if (myself.IsInCategory(2, talker.occupation) && talker.level >= 40) {
myself.ShowQuestPage(talker, "magic_trader_cema_q0343_03.htm", 343);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 343) == 1 && gg.OwnItemCount(talker, 4364) < 1 && myself.IsInCategory(2, talker.occupation)) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magic_trader_cema_q0343_06.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 343) == 1 && gg.OwnItemCount(talker, 4364) >= 1 && myself.IsInCategory(2, talker.occupation)) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "magic_trader_cema_q0343_07.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 343) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 343) == 0 && myself.IsInCategory(2, talker.occupation) && talker.level >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 343);
myself.SetMemoState(talker, 343, 1);
myself.SetMemoStateEx(talker, 343, 1, 0);
gg.AddLog(1, talker, 343);
myself.SetFlagJournal(talker, 343, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "magic_trader_cema_q0343_05.htm", 343);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 343) {
myself.SetCurrentQuestID(343);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 343 && myself.IsInCategory(2, talker.occupation)) {
if (reply == 1) {
if (gg.HaveMemo(talker, 343) == 0 && myself.IsInCategory(2, talker.occupation) && talker.level >= 40) {
myself.FHTML_SetFileName(fhtml0, "magic_trader_cema_q0343_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 343);
myself.ShowQuestFHTML(talker, fhtml0, 343);

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 343) == 1) {
if (gg.OwnItemCount(talker, 4364) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 57, gg.OwnItemCount(talker, 4364) * 120);
myself.DeleteItem1(talker, 4364, gg.OwnItemCount(talker, 4364));
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_08.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_08a.htm");

}

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 343) == 1) {
myself.ShowPage(talker, "magic_trader_cema_q0343_09.htm");

}

}
if (reply == 4) {
myself.ShowPage(talker, "magic_trader_cema_q0343_10.htm");

}
if (reply == 5) {
myself.ShowPage(talker, "magic_trader_cema_q0343_11.htm");
myself.RemoveMemo(talker, 343);
gg.AddLog(2, talker, 343);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 4364) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 734, 1);
myself.DeleteItem1(talker, 4364, 10);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_12.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}
if (reply == 7) {
if (gg.OwnItemCount(talker, 4364) >= 15) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 737, 1);
myself.DeleteItem1(talker, 4364, 15);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_13.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}
if (reply == 8) {
if (gg.OwnItemCount(talker, 4364) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 735, 1);
myself.DeleteItem1(talker, 4364, 20);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_14.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}
if (reply == 9) {
if (gg.OwnItemCount(talker, 4364) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 2508, 10);
myself.DeleteItem1(talker, 4364, 20);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_15.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}
if (reply == 10) {
if (gg.OwnItemCount(talker, 4364) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 956, 1);
myself.DeleteItem1(talker, 4364, 100);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_16.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}
if (reply == 11) {
if (gg.OwnItemCount(talker, 4364) >= 400) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 952, 1);
myself.DeleteItem1(talker, 4364, 400);
gg.AddLog(3, talker, 343);
myself.ShowPage(talker, "magic_trader_cema_q0343_17.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}
if (reply == 12) {
if (gg.OwnItemCount(talker, 4364) >= 200) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4365, 1);
myself.DeleteItem1(talker, 4364, 200);
myself.ShowPage(talker, "magic_trader_cema_q0343_18.htm");

}

} else {
myself.ShowPage(talker, "magic_trader_cema_q0343_19.htm");

}

}

}
super;
	}


}