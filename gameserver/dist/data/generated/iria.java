package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class iria extends merchant_for_newbie {
protected Object[][] SellList0 = {
{1;15;0.000000;0}, {"club";15;0.000000;0}, {"bone_dagger";15;0.000000;0}, {"short_bow";15;0.000000;0}, {"broad_sword";15;0.000000;0}, {"heavy_chisel";15;0.000000;0}, {"knife";15;0.000000;0}, {"doomed_dagger";15;0.000000;0}, {"bow";15;0.000000;0}, {"mace";15;0.000000;0}, {"sickle";15;0.000000;0}, {"brandish";15;0.000000;0}, {"gladius";15;0.000000;0}, {"orcish_sword";15;0.000000;0}, {"handmade_sword";15;0.000000;0}, {"dwarven_mace";15;0.000000;0}, {"dirk";15;0.000000;0}, {"hunting_bow";15;0.000000;0}, {"long_sword";15;0.000000;0}, {"throw_knife";15;0.000000;0}, {"bow_of_forest";15;0.000000;0}, {"short_spear";15;0.000000;0}, {"zweihander";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_rod";15;0.000000;0}, {"buffalo_horn";15;0.000000;0}, {"willow_staff";15;0.000000;0}, {"apprentice's_spellbook";15;0.000000;0}, {"cedar_staff";15;0.000000;0}, {"apprentice's_staff";15;0.000000;0}, {"relic_of_saints";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1088) == 1 && gg.OwnItemCount(talker, 1089) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Mass of Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1089) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Mass of Darkness (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1088) == 1 && gg.OwnItemCount(talker, 1089) == 0) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 1089, 1);
myself.ShowPage(talker, "iria_q0322_01.htm");
if (gg.OwnItemCount(talker, 1090) > 0 && gg.OwnItemCount(talker, 1091) > 0) {
myself.SetFlagJournal(talker, 166, 2);
myself.ShowQuestMark(talker, 166);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 166) == 1 && gg.OwnItemCount(talker, 1089) == 1) {
myself.SetCurrentQuestID(166);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iria_q0322_02.htm");

}
break;

}

}
return;

}
super;
	}


}