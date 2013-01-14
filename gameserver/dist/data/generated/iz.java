package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class iz extends merchant {
protected Object[][] SellList1 = {
{"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"hose_of_magicpower";15;0.000000;0}, {"tunic_of_magicpower";15;0.000000;0}, {"cursed_hose";15;0.000000;0}, {"cursed_tunic";15;0.000000;0}, {"dark_hose";15;0.000000;0}, {"white_tunic";15;0.000000;0}, {"mage's_hose";15;0.000000;0}, {"mage's_tunic";15;0.000000;0}, {"hose_of_knowledge";15;0.000000;0}, {"tunic_of_knowledge";15;0.000000;0}, {"mithril_hose";15;0.000000;0}, {"mithril_tunic";15;0.000000;0}, {"sage's_rag";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"bone_shield";15;0.000000;0}, {"bronze_shield";15;0.000000;0}, {"aspis";15;0.000000;0}, {"hoplon";15;0.000000;0}, {"kite_shield";15;0.000000;0}, {"brigandine_shield";15;0.000000;0}, {"square_shield";15;0.000000;0}, {"plate_shield";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"bracer";15;0.000000;0}, {"excellence_leather_gloves";15;0.000000;0}, {"leather_gauntlet";15;0.000000;0}, {"gauntlet";15;0.000000;0}, {"gauntlet_of_repose_of_the_soul";15;0.000000;0}, {"gloves_of_knowledge";15;0.000000;0}, {"elven_mithril_gloves";15;0.000000;0}, {"mithril_glove";15;0.000000;0}, {"ogre_power_gauntlet";15;0.000000;0}, {"sage's_worn_gloves";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"boots";15;0.000000;0}, {"leather_boots";15;0.000000;0}, {"blue_buckskin_boots";15;0.000000;0}, {"iron_boots";15;0.000000;0}, {"boots_of_power";15;0.000000;0}, {"boots_of_knowledge";15;0.000000;0}, {"elven_mithril_boots";15;0.000000;0}, {"assault_boots";15;0.000000;0}, {"slamander_skin_boots";15;0.000000;0}, {"plate_boots";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"hard_leather_helmet";15;0.000000;0}, {"bone_helmet";15;0.000000;0}, {"bronze_helmet";15;0.000000;0}, {"helmet";15;0.000000;0}, {"brigandine_helmet";15;0.000000;0}, {"plate_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"cotton_tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}, {"pattern_cotton_tshirt";15;0.000000;0}
};
protected Object[][] SellList5 = {
{"cursed_hose_low";15;0.000000;0}, {"cursed_tunic_low";15;0.000000;0}, {"dark_hose_low";15;0.000000;0}, {"white_tunic_low";15;0.000000;0}, {"mage's_hose_low";15;0.000000;0}, {"mage's_tunic_low";15;0.000000;0}, {"hose_of_knowledge_low";15;0.000000;0}, {"tunic_of_knowledge_low";15;0.000000;0}, {"mithril_hose_low";15;0.000000;0}, {"mithril_tunic_low";15;0.000000;0}, {"sage's_rag_low";15;0.000000;0}, {"bronze_shield_low";15;0.000000;0}, {"aspis_low";15;0.000000;0}, {"hoplon_low";15;0.000000;0}, {"kite_shield_low";15;0.000000;0}, {"brigandine_shield_low";15;0.000000;0}, {"square_shield_low";15;0.000000;0}, {"plate_shield_low";15;0.000000;0}, {"excellence_leather_gloves_low";15;0.000000;0}, {"leather_gauntlet_low";15;0.000000;0}, {"gauntlet_low";15;0.000000;0}, {"gauntlet_of_repose_of_the_soul_low";15;0.000000;0}, {"gloves_of_knowledge_low";15;0.000000;0}, {"elven_mithril_gloves_low";15;0.000000;0}, {"mithril_glove_low";15;0.000000;0}, {"ogre_power_gauntlet_low";15;0.000000;0}, {"sage's_worn_gloves_low";15;0.000000;0}, {"leather_boots_low";15;0.000000;0}, {"blue_buckskin_boots_low";15;0.000000;0}, {"iron_boots_low";15;0.000000;0}, {"boots_of_power_low";15;0.000000;0}, {"boots_of_knowledge_low";15;0.000000;0}, {"elven_mithril_boots_low";15;0.000000;0}, {"assault_boots_low";15;0.000000;0}, {"slamander_skin_boots_low";15;0.000000;0}, {"plate_boots_low";15;0.000000;0}, {"bone_helmet_low";15;0.000000;0}, {"bronze_helmet_low";15;0.000000;0}, {"helmet_low";15;0.000000;0}, {"plate_helmet_low";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Make a Pair of Dress Shoes (In Progress)");

}
if (gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Make a Pair of Dress Shoes (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 4 * 10 + 1) {
myself.SetCurrentQuestID(33);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 33, 4);
myself.ShowPage(talker, "iz_q0033_0401.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 5 * 10 + 1) {
myself.SetCurrentQuestID(33);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "iz_q0033_0503.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 33) {
myself.SetCurrentQuestID(33);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 33) {
i0 = myself.GetHTMLCookie(talker, 33, 5 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0) {
if (gg.OwnItemCount(talker, 57) >= 300000) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 57, 300000);
myself.ShowPage(talker, "iz_q0033_0501.htm");
myself.SetMemoState(talker, 33, 5 * 10 + 1);
myself.SetFlagJournal(talker, 33, 5);
myself.ShowQuestMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "iz_q0033_0502.htm");

}

}

}

}
super;
	}


}