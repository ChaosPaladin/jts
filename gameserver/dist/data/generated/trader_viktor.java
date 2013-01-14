package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_viktor extends merchant {
protected Object[][] SellList0 = {
{"long_sword";30;0.000000;0}, {"throw_knife";30;0.000000;0}, {"bow_of_forest";30;0.000000;0}, {"short_spear";30;0.000000;0}, {"falchion";30;0.000000;0}, {"sword_breaker";30;0.000000;0}, {"composition_bow";30;0.000000;0}, {"buzdygan";30;0.000000;0}, {"morning_star";30;0.000000;0}, {"iron_hammer";30;0.000000;0}, {"long_spear";30;0.000000;0}, {"saber";30;0.000000;0}, {"iron_sword";30;0.000000;0}, {"handiwork_dagger";30;0.000000;0}, {"assassin_knife";30;0.000000;0}, {"strengthening_bow";30;0.000000;0}, {"hand_axe";30;0.000000;0}, {"heavy_mace";30;0.000000;0}, {"work_hammer";30;0.000000;0}, {"trident";30;0.000000;0}, {"bastard_sword";30;0.000000;0}, {"poniard_dagger";30;0.000000;0}, {"long_bow";30;0.000000;0}, {"dark_elven_bow";30;0.000000;0}, {"pike";30;0.000000;0}, {"dwarven_trident";30;0.000000;0}, {"cestus";30;0.000000;0}, {"viper's_canine";30;0.000000;0}, {"bagh-nakh";30;0.000000;0}, {"single-edged_jamadhr";30;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_staff";30;0.000000;0}, {"relic_of_saints";30;0.000000;0}, {"mage_staff";30;0.000000;0}, {"crucifix_of_blessing";30;0.000000;0}, {"voodoo_doll";30;0.000000;0}, {"bone_staff";30;0.000000;0}, {"scroll_of_wisdom";30;0.000000;0}, {"sword_of_priest";30;0.000000;0}, {"branch_of_life";30;0.000000;0}, {"proof_of_revenge";30;0.000000;0}, {"mace_of_prayer";30;0.000000;0}, {"doom_hammer";30;0.000000;0}, {"mystic_staff";30;0.000000;0}, {"staff_of_mana";30;0.000000;0}, {"divine_tome";30;0.000000;0}, {"sword_of_magic";30;0.000000;0}, {"sword_of_mystic";30;0.000000;0}, {"sword_of_occult";30;0.000000;0}, {"dagger_of_mana";30;0.000000;0}, {"mystic_knife";30;0.000000;0}, {"conjure_knife";30;0.000000;0}
};
protected Object[][] SellList4 = {
{"saber_low";30;0.000000;0}, {"iron_sword_low";30;0.000000;0}, {"handiwork_dagger_low";30;0.000000;0}, {"assassin_knife_low";30;0.000000;0}, {"strengthening_bow_low";30;0.000000;0}, {"hand_axe_low";30;0.000000;0}, {"heavy_mace_low";30;0.000000;0}, {"work_hammer_low";30;0.000000;0}, {"trident_low";30;0.000000;0}, {"bastard_sword_low";30;0.000000;0}, {"poniard_dagger_low";30;0.000000;0}, {"long_bow_low";30;0.000000;0}, {"dark_elven_bow_low";30;0.000000;0}, {"pike_low";30;0.000000;0}, {"dwarven_trident_low";30;0.000000;0}, {"bagh-nakh_low";30;0.000000;0}, {"single-edged_jamadhr_low";30;0.000000;0}
};
protected Object[][] SellList5 = {
{"bone_staff_low";30;0.000000;0}, {"scroll_of_wisdom_low";30;0.000000;0}, {"sword_of_priest_low";30;0.000000;0}, {"branch_of_life_low";30;0.000000;0}, {"proof_of_revenge_low";30;0.000000;0}, {"mace_of_prayer_low";30;0.000000;0}, {"doom_hammer_low";30;0.000000;0}, {"mystic_staff_low";30;0.000000;0}, {"staff_of_mana_low";30;0.000000;0}, {"divine_tome_low";30;0.000000;0}, {"sword_of_magic_low";30;0.000000;0}, {"sword_of_mystic_low";30;0.000000;0}, {"sword_of_occult_low";30;0.000000;0}, {"dagger_of_mana_low";30;0.000000;0}, {"mystic_knife_low";30;0.000000;0}, {"conjure_knife_low";30;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2650) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2652) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2659) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2661) == 1 && gg.OwnItemCount(talker, 2662) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2663) == 1 && gg.OwnItemCount(talker, 2664) == 1 && gg.OwnItemCount(talker, 2665) == 1 && gg.OwnItemCount(talker, 2672) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Trial of the Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2651) == 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Trial of the Seeker (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2650) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_viktor_q0213_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2652) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_viktor_q0213_12.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2659) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 2660) < 10) {
myself.ShowPage(talker, "trader_viktor_q0213_13.htm");

} else {
myself.ShowPage(talker, "trader_viktor_q0213_14.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2661) == 1 && gg.OwnItemCount(talker, 2662) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_viktor_q0213_16.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2663) == 1 && gg.OwnItemCount(talker, 2664) == 1 && gg.OwnItemCount(talker, 2665) == 1 && gg.OwnItemCount(talker, 2672) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_viktor_q0213_17.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 213) == 1 && gg.OwnItemCount(talker, 2651) == 1) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_viktor_q0213_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 213) {
myself.SetCurrentQuestID(213);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 213) {
if (reply == 1) {
myself.ShowPage(talker, "trader_viktor_q0213_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "trader_viktor_q0213_03.htm");

}
if (reply == 3) {
myself.ShowPage(talker, "trader_viktor_q0213_04.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 2650) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_viktor_q0213_05.htm");
myself.DeleteItem1(talker, 2650, 1);
myself.GiveItem1(talker, 2651, 1);
myself.SetFlagJournal(talker, 213, 7);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (reply == 5) {
myself.ShowPage(talker, "trader_viktor_q0213_06.htm");

}
if (reply == 6) {
myself.ShowPage(talker, "trader_viktor_q0213_07.htm");

}
if (reply == 7) {
myself.ShowPage(talker, "trader_viktor_q0213_08.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "trader_viktor_q0213_09.htm");

}
if (reply == 9) {
myself.ShowPage(talker, "trader_viktor_q0213_10.htm");

}
if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_viktor_q0213_11.htm");
myself.SetFlagJournal(talker, 213, 9);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.GiveItem1(talker, 2659, 1);
myself.DeleteItem1(talker, 2650, gg.OwnItemCount(talker, 2650));
myself.DeleteItem1(talker, 2658, gg.OwnItemCount(talker, 2658));
myself.DeleteItem1(talker, 2652, gg.OwnItemCount(talker, 2652));
myself.DeleteItem1(talker, 2651, gg.OwnItemCount(talker, 2651));

}

}
if (reply == 11) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_viktor_q0213_15.htm");
myself.SetFlagJournal(talker, 213, 11);
myself.ShowQuestMark(talker, 213);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 2659, gg.OwnItemCount(talker, 2659));
myself.DeleteItem1(talker, 2660, gg.OwnItemCount(talker, 2660));
myself.GiveItem1(talker, 2661, 1);
myself.GiveItem1(talker, 2662, 1);

}

}

}
super;
	}


}