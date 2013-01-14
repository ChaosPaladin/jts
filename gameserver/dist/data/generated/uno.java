package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class uno extends merchant_for_newbie {
protected Object[][] SellList0 = {
{1;15;0.000000;0}, {"club";15;0.000000;0}, {"bone_dagger";15;0.000000;0}, {"short_bow";15;0.000000;0}, {"broad_sword";15;0.000000;0}, {"heavy_chisel";15;0.000000;0}, {"knife";15;0.000000;0}, {"doomed_dagger";15;0.000000;0}, {"bow";15;0.000000;0}, {"mace";15;0.000000;0}, {"sickle";15;0.000000;0}, {"brandish";15;0.000000;0}, {"gladius";15;0.000000;0}, {"orcish_sword";15;0.000000;0}, {"handmade_sword";15;0.000000;0}, {"dwarven_mace";15;0.000000;0}, {"dirk";15;0.000000;0}, {"hunting_bow";15;0.000000;0}, {"long_sword";15;0.000000;0}, {"throw_knife";15;0.000000;0}, {"bow_of_forest";15;0.000000;0}, {"short_spear";15;0.000000;0}, {"zweihander";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_rod";15;0.000000;0}, {"buffalo_horn";15;0.000000;0}, {"willow_staff";15;0.000000;0}, {"apprentice's_spellbook";15;0.000000;0}, {"cedar_staff";15;0.000000;0}, {"apprentice's_staff";15;0.000000;0}, {"relic_of_saints";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1026) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1027) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 162) == 0 && myself.GetOneTimeQuestFlag(talker, 162) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Curse of the Underground Fortress");

}
if (gg.HaveMemo(talker, 162) == 0 && myself.GetOneTimeQuestFlag(talker, 162) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Curse of the Underground Fortress (Done)");

}
if (gg.HaveMemo(talker, 162) == 1 && gg.OwnItemCount(talker, 1159) + gg.OwnItemCount(talker, 1158) < 13) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Curse of the Underground Fortress (In Progress)");

}
if (gg.HaveMemo(talker, 162) == 1 && gg.OwnItemCount(talker, 1159) + gg.OwnItemCount(talker, 1158) >= 13 && myself.GetOneTimeQuestFlag(talker, 162) == 0) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Curse of the Underground Fortress (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1026) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 1026, gg.OwnItemCount(talker, 1026));
if (gg.OwnItemCount(talker, 1027) == 0) {
myself.GiveItem1(talker, 1027, 1);

}
myself.ShowPage(talker, "uno_q0311_01.htm");
myself.SetFlagJournal(talker, 160, 2);
myself.ShowQuestMark(talker, 160);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1027) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "uno_q0311_02.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "uno_q0311_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 162) == 0 && myself.GetOneTimeQuestFlag(talker, 162) == 0) {
myself.SetCurrentQuestID(162);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.race == 2) {
myself.ShowQuestPage(talker, "uno_q0314_00.htm", 162);

} else if (talker.level >= 12) {
myself.ShowQuestPage(talker, "uno_q0314_02.htm", 162);

} else {
myself.ShowQuestPage(talker, "uno_q0314_01.htm", 162);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 162) == 0 && myself.GetOneTimeQuestFlag(talker, 162) == 1) {
myself.SetCurrentQuestID(162);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 162) == 1 && gg.OwnItemCount(talker, 1159) + gg.OwnItemCount(talker, 1158) < 13) {
myself.SetCurrentQuestID(162);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "uno_q0314_05.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 162) == 1 && gg.OwnItemCount(talker, 1159) + gg.OwnItemCount(talker, 1158) >= 13 && myself.GetOneTimeQuestFlag(talker, 162) == 0) {
myself.SetCurrentQuestID(162);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "uno_q0314_06.htm");
myself.GiveItem1(talker, 625, 1);
myself.GiveItem1(talker, 57, 24000);
myself.IncrementParam(talker, 0, 22652);
myself.IncrementParam(talker, 1, 1004);
myself.DeleteItem1(talker, 1159, gg.OwnItemCount(talker, 1159));
myself.DeleteItem1(talker, 1158, gg.OwnItemCount(talker, 1158));
myself.RemoveMemo(talker, 162);
gg.AddLog(2, talker, 162);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.SetOneTimeQuestFlag(talker, 162, 1);

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
if (quest_id == 162) {
myself.SetCurrentQuestID(162);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 162);
gg.AddLog(1, talker, 162);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "uno_q0314_04.htm", 162);
myself.SetFlagJournal(talker, 162, 1);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 162) {
myself.SetCurrentQuestID(162);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 162) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "uno_q0314_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 162);
myself.ShowQuestFHTML(talker, fhtml0, 162);

}

}
super;
	}


}