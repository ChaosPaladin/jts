package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class elliany extends merchant {
protected Object[][] SellList0 = {
{"necklace_of_wisdom";10;0.000000;0}, {"blue_diamond_necklace";10;0.000000;0}, {"necklace_of_devotion";10;0.000000;0}, {"enchanted_necklace";10;0.000000;0}, {"near_forest_necklace";10;0.000000;0}, {"elven_necklace";10;0.000000;0}, {"cat'seye_earing";10;0.000000;0}, {"coral_earing";10;0.000000;0}, {"red_cresent_earing";10;0.000000;0}, {"enchanted_earing";10;0.000000;0}, {"tiger'seye_earing";10;0.000000;0}, {"elven_earing";10;0.000000;0}, {"ring_of_wisdom";10;0.000000;0}, {"blue_coral_ring";10;0.000000;0}, {"ring_of_devotion";10;0.000000;0}, {"enchanted_ring";10;0.000000;0}, {"black_pearl_ring";10;0.000000;0}, {"elven_ring";10;0.000000;0}, {"onyxbeast'seye_earing";10;0.000000;0}, {"mithril_ring";10;0.000000;0}, {"necklace_of_darkness";10;0.000000;0}, {"moonstone_earing";10;0.000000;0}, {"aquastone_ring";10;0.000000;0}, {"aquastone_necklace";10;0.000000;0}, {"ring_of_protection";10;0.000000;0}, {"earing_of_protection";10;0.000000;0}, {"necklace_of_protection";10;0.000000;0}, {"ring_of_ages";10;0.000000;0}, {"earing_of_binding";10;0.000000;0}, {"necklace_of_mermaid";10;0.000000;0}, {"ring_of_binding";10;0.000000;0}, {"nassen's_earing";10;0.000000;0}, {"necklace_of_binding";10;0.000000;0}
};
protected Object[][] SellList4 = {
{"necklace_of_devotion_low";10;0.000000;0}, {"enchanted_necklace_low";10;0.000000;0}, {"near_forest_necklace_low";10;0.000000;0}, {"elven_necklace_low";10;0.000000;0}, {"red_cresent_earing_low";10;0.000000;0}, {"enchanted_earing_low";10;0.000000;0}, {"tiger'seye_earing_low";10;0.000000;0}, {"elven_earing_low";10;0.000000;0}, {"ring_of_devotion_low";10;0.000000;0}, {"enchanted_ring_low";10;0.000000;0}, {"black_pearl_ring_low";10;0.000000;0}, {"elven_ring_low";10;0.000000;0}, {"onyxbeast'seye_earing_low";10;0.000000;0}, {"mithril_ring_low";10;0.000000;0}, {"necklace_of_darkness_low";10;0.000000;0}, {"moonstone_earing_low";10;0.000000;0}, {"aquastone_ring_low";10;0.000000;0}, {"aquastone_necklace_low";10;0.000000;0}, {"ring_of_protection_low";10;0.000000;0}, {"earing_of_protection_low";10;0.000000;0}, {"necklace_of_protection_low";10;0.000000;0}, {"ring_of_ages_low";10;0.000000;0}, {"earing_of_binding_low";10;0.000000;0}, {"necklace_of_mermaid_low";10;0.000000;0}, {"ring_of_binding_low";10;0.000000;0}, {"nassen's_earing_low";10;0.000000;0}, {"necklace_of_binding_low";10;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Get a Pet (In Progress)");

}
if (talker.level >= 60 && gg.HaveMemo(talker, 35) == 0 && myself.GetOneTimeQuestFlag(talker, 35) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Find Glittering Jewelry");

}
if (talker.level < 60 && gg.HaveMemo(talker, 35) == 0 && myself.GetOneTimeQuestFlag(talker, 35) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Find Glittering Jewelry");

}
if (gg.HaveMemo(talker, 35) == 0 && myself.GetOneTimeQuestFlag(talker, 35) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Find Glittering Jewelry (Done)");

}
if (gg.HaveMemo(talker, 35) == 1 && myself.GetOneTimeQuestFlag(talker, 35) == 0 && gg.GetMemoState(talker, 35) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Find Glittering Jewelry (In Progress)");

}
if (gg.HaveMemo(talker, 35) == 1 && gg.GetMemoState(talker, 35) == 2 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Find Glittering Jewelry (In Progress)");

}
if (gg.HaveMemo(talker, 35) == 1 && gg.GetMemoState(talker, 35) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Find Glittering Jewelry (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 419, gg.GetMemoState(talker, 419) | 8);
myself.ShowPage(talker, "elliany_q0419_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level >= 60 && gg.HaveMemo(talker, 35) == 0 && myself.GetOneTimeQuestFlag(talker, 35) == 0) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "elliany_q0035_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 35);
myself.ShowQuestFHTML(talker, fhtml0, 35);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level < 60 && gg.HaveMemo(talker, 35) == 0 && myself.GetOneTimeQuestFlag(talker, 35) == 0) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elliany_q0035_0103.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 35) == 0 && myself.GetOneTimeQuestFlag(talker, 35) == 1) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 35) == 1 && myself.GetOneTimeQuestFlag(talker, 35) == 0 && gg.GetMemoState(talker, 35) == 1 * 10 + 1) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "elliany_q0035_0105.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 35) == 1 && gg.GetMemoState(talker, 35) == 2 * 10 + 2) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7162) >= 10) {
myself.SetHTMLCookie(talker, 35, 2);
myself.ShowPage(talker, "elliany_q0035_0201.htm");

} else {
myself.ShowPage(talker, "elliany_q0035_0202.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 35) == 1 && gg.GetMemoState(talker, 35) == 3 * 10 + 1) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1893) >= 5 && gg.OwnItemCount(talker, 1873) >= 500 && gg.OwnItemCount(talker, 4044) >= 150) {
myself.SetHTMLCookie(talker, 35, 3);
myself.ShowPage(talker, "elliany_q0035_0303.htm");

} else {
myself.ShowPage(talker, "elliany_q0035_0304.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 35) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 35);
myself.ShowQuestMark(talker, 35);
myself.SetMemoState(talker, 35, 1 * 10 + 1);
gg.AddLog(1, talker, 35);
myself.SetFlagJournal(talker, 35, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "elliany_q0035_0104.htm", 35);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 35) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 35) {
i0 = myself.GetHTMLCookie(talker, 35, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 35) == 1) {
if (gg.OwnItemCount(talker, 7162) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7162, 10);
myself.ShowPage(talker, "elliany_q0035_0301.htm");
myself.SetMemoState(talker, 35, 3 * 10 + 1);
myself.SetFlagJournal(talker, 35, 4);
myself.ShowQuestMark(talker, 35);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "elliany_q0035_0302.htm");

}

}

}

}
if (ask == 35) {
myself.SetCurrentQuestID(35);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 35 && myself.GetOneTimeQuestFlag(talker, 35) == 0) {
i0 = myself.GetHTMLCookie(talker, 35, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 35) == 1 && myself.GetOneTimeQuestFlag(talker, 35) == 0) {
if (gg.OwnItemCount(talker, 1893) >= 5 && gg.OwnItemCount(talker, 1873) >= 500 && gg.OwnItemCount(talker, 4044) >= 150) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1893, 5);
myself.DeleteItem1(talker, 1873, 500);
myself.DeleteItem1(talker, 4044, 150);
myself.GiveItem1(talker, 7077, 1);

}
gg.AddLog(2, talker, 35);
myself.RemoveMemo(talker, 35);
myself.SetOneTimeQuestFlag(talker, 35, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "elliany_q0035_0401.htm");

} else {
myself.ShowPage(talker, "elliany_q0035_0402.htm");

}

}

}

}
super;
	}


}