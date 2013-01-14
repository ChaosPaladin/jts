package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sandra extends merchant {
protected Object[][] SellList0 = {
{"necklace_of_wisdom";10;0.000000;0}, {"blue_diamond_necklace";10;0.000000;0}, {"necklace_of_devotion";10;0.000000;0}, {"enchanted_necklace";10;0.000000;0}, {"near_forest_necklace";10;0.000000;0}, {"elven_necklace";10;0.000000;0}, {"cat'seye_earing";10;0.000000;0}, {"coral_earing";10;0.000000;0}, {"red_cresent_earing";10;0.000000;0}, {"enchanted_earing";10;0.000000;0}, {"tiger'seye_earing";10;0.000000;0}, {"elven_earing";10;0.000000;0}, {"ring_of_wisdom";10;0.000000;0}, {"blue_coral_ring";10;0.000000;0}, {"ring_of_devotion";10;0.000000;0}, {"enchanted_ring";10;0.000000;0}, {"black_pearl_ring";10;0.000000;0}, {"elven_ring";10;0.000000;0}, {"onyxbeast'seye_earing";10;0.000000;0}, {"mithril_ring";10;0.000000;0}, {"necklace_of_darkness";10;0.000000;0}, {"moonstone_earing";10;0.000000;0}, {"aquastone_ring";10;0.000000;0}, {"aquastone_necklace";10;0.000000;0}, {"ring_of_protection";10;0.000000;0}, {"earing_of_protection";10;0.000000;0}, {"necklace_of_protection";10;0.000000;0}, {"ring_of_ages";10;0.000000;0}, {"earing_of_binding";10;0.000000;0}, {"necklace_of_mermaid";10;0.000000;0}, {"ring_of_binding";10;0.000000;0}, {"nassen's_earing";10;0.000000;0}, {"necklace_of_binding";10;0.000000;0}
};
protected Object[][] SellList4 = {
{"necklace_of_devotion_low";10;0.000000;0}, {"enchanted_necklace_low";10;0.000000;0}, {"near_forest_necklace_low";10;0.000000;0}, {"elven_necklace_low";10;0.000000;0}, {"red_cresent_earing_low";10;0.000000;0}, {"enchanted_earing_low";10;0.000000;0}, {"tiger'seye_earing_low";10;0.000000;0}, {"elven_earing_low";10;0.000000;0}, {"ring_of_devotion_low";10;0.000000;0}, {"enchanted_ring_low";10;0.000000;0}, {"black_pearl_ring_low";10;0.000000;0}, {"elven_ring_low";10;0.000000;0}, {"onyxbeast'seye_earing_low";10;0.000000;0}, {"mithril_ring_low";10;0.000000;0}, {"necklace_of_darkness_low";10;0.000000;0}, {"moonstone_earing_low";10;0.000000;0}, {"aquastone_ring_low";10;0.000000;0}, {"aquastone_necklace_low";10;0.000000;0}, {"ring_of_protection_low";10;0.000000;0}, {"earing_of_protection_low";10;0.000000;0}, {"necklace_of_protection_low";10;0.000000;0}, {"ring_of_ages_low";10;0.000000;0}, {"earing_of_binding_low";10;0.000000;0}, {"necklace_of_mermaid_low";10;0.000000;0}, {"ring_of_binding_low";10;0.000000;0}, {"nassen's_earing_low";10;0.000000;0}, {"necklace_of_binding_low";10;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 1 && gg.OwnItemCount(talker, 5900) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Let's Become a Royal Member! (In Progress)");

}
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 2 && gg.OwnItemCount(talker, 5900) == 0 && gg.OwnItemCount(talker, 7569) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Let's Become a Royal Member! (In Progress)");

}
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 2 && gg.OwnItemCount(talker, 5900) == 0 && gg.OwnItemCount(talker, 7569) > 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Let's Become a Royal Member! (In Progress)");

}
if (gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 2 && gg.OwnItemCount(talker, 5900) >= 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Let's Become a Royal Member! (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "To Talking Island (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Once More In the Arms of the Mother Tree (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Into the Dark Elven Forest (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "To the Immortal Plateau (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "The Road Home (In Progress)");

}
if (gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 4 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "The Road Home (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 1 && gg.OwnItemCount(talker, 5900) == 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0381_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 2 && gg.OwnItemCount(talker, 5900) == 0 && gg.OwnItemCount(talker, 7569) == 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0381_03.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 2 && gg.OwnItemCount(talker, 5900) == 0 && gg.OwnItemCount(talker, 7569) > 0) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "sandra_q0381_04.htm");
myself.GiveItem1(talker, 5900, 1);
myself.DeleteItem1(talker, 7569, gg.OwnItemCount(talker, 7569));

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 381) == 1 && gg.GetMemoState(talker, 381) == 2 && gg.OwnItemCount(talker, 5900) >= 1) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0381_05.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 3 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 45, 3);
myself.ShowPage(talker, "sandra_q0045_0301.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0 && gg.GetMemoState(talker, 45) == 4 * 10 + 1) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0045_0403.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 3 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 46, 3);
myself.ShowPage(talker, "sandra_q0046_0301.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0 && gg.GetMemoState(talker, 46) == 4 * 10 + 1) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0046_0403.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 3 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 47, 3);
myself.ShowPage(talker, "sandra_q0047_0301.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0 && gg.GetMemoState(talker, 47) == 4 * 10 + 1) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0047_0403.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 3 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 48, 3);
myself.ShowPage(talker, "sandra_q0048_0301.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0 && gg.GetMemoState(talker, 48) == 4 * 10 + 1) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0048_0403.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && gg.OwnItemCount(talker, 7564) >= 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 3 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 49, 3);
myself.ShowPage(talker, "sandra_q0049_0301.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0 && gg.GetMemoState(talker, 49) == 4 * 10 + 1) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "sandra_q0049_0403.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 381) {
myself.SetCurrentQuestID(381);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 381) {
if (reply == 1 && gg.HaveMemo(talker, 381) == 1 && gg.OwnItemCount(talker, 5900) == 0) {
myself.ShowPage(talker, "sandra_q0381_02.htm");
myself.SetMemoState(talker, 381, 2);

}

}
if (ask == 45) {
myself.SetCurrentQuestID(45);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 45) {
i0 = myself.GetHTMLCookie(talker, 45, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 45) == 1 && myself.GetOneTimeQuestFlag(talker, 45) == 0) {
if (gg.OwnItemCount(talker, 7564) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7564, 1);
myself.GiveItem1(talker, 7567, 1);
myself.ShowPage(talker, "sandra_q0045_0401.htm");
myself.SetMemoState(talker, 45, 4 * 10 + 1);
myself.SetFlagJournal(talker, 45, 4);
myself.ShowQuestMark(talker, 45);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sandra_q0045_0402.htm");

}

}

}

}
if (ask == 46) {
myself.SetCurrentQuestID(46);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 46) {
i0 = myself.GetHTMLCookie(talker, 46, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 46) == 1 && myself.GetOneTimeQuestFlag(talker, 46) == 0) {
if (gg.OwnItemCount(talker, 7564) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7564, 1);
myself.GiveItem1(talker, 7567, 1);
myself.ShowPage(talker, "sandra_q0046_0401.htm");
myself.SetMemoState(talker, 46, 4 * 10 + 1);
myself.SetFlagJournal(talker, 46, 4);
myself.ShowQuestMark(talker, 46);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sandra_q0046_0402.htm");

}

}

}

}
if (ask == 47) {
myself.SetCurrentQuestID(47);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 47) {
i0 = myself.GetHTMLCookie(talker, 47, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 47) == 1 && myself.GetOneTimeQuestFlag(talker, 47) == 0) {
if (gg.OwnItemCount(talker, 7564) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7564, 1);
myself.GiveItem1(talker, 7567, 1);
myself.ShowPage(talker, "sandra_q0047_0401.htm");
myself.SetMemoState(talker, 47, 4 * 10 + 1);
myself.SetFlagJournal(talker, 47, 4);
myself.ShowQuestMark(talker, 47);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sandra_q0047_0402.htm");

}

}

}

}
if (ask == 48) {
myself.SetCurrentQuestID(48);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 48) {
i0 = myself.GetHTMLCookie(talker, 48, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 48) == 1 && myself.GetOneTimeQuestFlag(talker, 48) == 0) {
if (gg.OwnItemCount(talker, 7564) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7564, 1);
myself.GiveItem1(talker, 7567, 1);
myself.ShowPage(talker, "sandra_q0048_0401.htm");
myself.SetMemoState(talker, 48, 4 * 10 + 1);
myself.SetFlagJournal(talker, 48, 4);
myself.ShowQuestMark(talker, 48);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sandra_q0048_0402.htm");

}

}

}

}
if (ask == 49) {
myself.SetCurrentQuestID(49);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 49) {
i0 = myself.GetHTMLCookie(talker, 49, 4 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 49) == 1 && myself.GetOneTimeQuestFlag(talker, 49) == 0) {
if (gg.OwnItemCount(talker, 7564) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7564, 1);
myself.GiveItem1(talker, 7567, 1);
myself.ShowPage(talker, "sandra_q0049_0401.htm");
myself.SetMemoState(talker, 49, 4 * 10 + 1);
myself.SetFlagJournal(talker, 49, 4);
myself.ShowQuestMark(talker, 49);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "sandra_q0049_0402.htm");

}

}

}

}
super;
	}


}