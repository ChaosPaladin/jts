package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sabrin extends merchant {
protected Object[][] SellList0 = {
{"long_sword";20;0.000000;0}, {"throw_knife";20;0.000000;0}, {"bow_of_forest";20;0.000000;0}, {"short_spear";20;0.000000;0}, {"falchion";20;0.000000;0}, {"sword_breaker";20;0.000000;0}, {"composition_bow";20;0.000000;0}, {"buzdygan";20;0.000000;0}, {"morning_star";20;0.000000;0}, {"iron_hammer";20;0.000000;0}, {"long_spear";20;0.000000;0}, {"saber";20;0.000000;0}, {"iron_sword";20;0.000000;0}, {"handiwork_dagger";20;0.000000;0}, {"assassin_knife";20;0.000000;0}, {"strengthening_bow";20;0.000000;0}, {"hand_axe";20;0.000000;0}, {"heavy_mace";20;0.000000;0}, {"work_hammer";20;0.000000;0}, {"trident";20;0.000000;0}, {"bastard_sword";20;0.000000;0}, {"poniard_dagger";20;0.000000;0}, {"long_bow";20;0.000000;0}, {"dark_elven_bow";20;0.000000;0}, {"pike";20;0.000000;0}, {"dwarven_trident";20;0.000000;0}, {"cestus";20;0.000000;0}, {"viper's_canine";20;0.000000;0}, {"bagh-nakh";20;0.000000;0}, {"single-edged_jamadhr";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_staff";20;0.000000;0}, {"relic_of_saints";20;0.000000;0}, {"mage_staff";20;0.000000;0}, {"crucifix_of_blessing";20;0.000000;0}, {"voodoo_doll";20;0.000000;0}, {"bone_staff";20;0.000000;0}, {"scroll_of_wisdom";20;0.000000;0}, {"sword_of_priest";20;0.000000;0}, {"branch_of_life";20;0.000000;0}, {"proof_of_revenge";20;0.000000;0}, {"mace_of_prayer";20;0.000000;0}, {"doom_hammer";20;0.000000;0}, {"mystic_staff";20;0.000000;0}, {"staff_of_mana";20;0.000000;0}, {"divine_tome";20;0.000000;0}, {"sword_of_magic";20;0.000000;0}, {"sword_of_mystic";20;0.000000;0}, {"sword_of_occult";20;0.000000;0}, {"dagger_of_mana";20;0.000000;0}, {"mystic_knife";20;0.000000;0}, {"conjure_knife";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"saber_low";20;0.000000;0}, {"iron_sword_low";20;0.000000;0}, {"handiwork_dagger_low";20;0.000000;0}, {"assassin_knife_low";20;0.000000;0}, {"strengthening_bow_low";20;0.000000;0}, {"hand_axe_low";20;0.000000;0}, {"heavy_mace_low";20;0.000000;0}, {"work_hammer_low";20;0.000000;0}, {"trident_low";20;0.000000;0}, {"bastard_sword_low";20;0.000000;0}, {"poniard_dagger_low";20;0.000000;0}, {"long_bow_low";20;0.000000;0}, {"dark_elven_bow_low";20;0.000000;0}, {"pike_low";20;0.000000;0}, {"dwarven_trident_low";20;0.000000;0}, {"bagh-nakh_low";20;0.000000;0}, {"single-edged_jamadhr_low";20;0.000000;0}
};
protected Object[][] SellList5 = {
{"bone_staff_low";20;0.000000;0}, {"scroll_of_wisdom_low";20;0.000000;0}, {"sword_of_priest_low";20;0.000000;0}, {"branch_of_life_low";20;0.000000;0}, {"proof_of_revenge_low";20;0.000000;0}, {"mace_of_prayer_low";20;0.000000;0}, {"doom_hammer_low";20;0.000000;0}, {"mystic_staff_low";20;0.000000;0}, {"staff_of_mana_low";20;0.000000;0}, {"divine_tome_low";20;0.000000;0}, {"sword_of_magic_low";20;0.000000;0}, {"sword_of_mystic_low";20;0.000000;0}, {"sword_of_occult_low";20;0.000000;0}, {"dagger_of_mana_low";20;0.000000;0}, {"mystic_knife_low";20;0.000000;0}, {"conjure_knife_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4321) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Jovial Accordion (In Progress)");

}
if (gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4321) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Jovial Accordion (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4321) >= 1) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sabrin_q0364_01.htm");
myself.DeleteItem1(talker, 4321, 1);
if (gg.GetMemoState(talker, 364) == 3) {
myself.SetMemoState(talker, 364, 4);

} else if (gg.GetMemoState(talker, 364) == 2) {
myself.SetMemoState(talker, 364, 3);

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 364) == 1 && gg.OwnItemCount(talker, 4321) == 0) {
myself.SetCurrentQuestID(364);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sabrin_q0364_02.htm");

}
break;

}

}
return;

}
super;
	}


}