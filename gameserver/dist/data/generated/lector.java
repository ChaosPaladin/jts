package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class lector extends merchant_for_newbie {
protected Object[][] SellList0 = {
{1;15;0.000000;0}, {"club";15;0.000000;0}, {"bone_dagger";15;0.000000;0}, {"short_bow";15;0.000000;0}, {"broad_sword";15;0.000000;0}, {"heavy_chisel";15;0.000000;0}, {"knife";15;0.000000;0}, {"doomed_dagger";15;0.000000;0}, {"bow";15;0.000000;0}, {"mace";15;0.000000;0}, {"sickle";15;0.000000;0}, {"brandish";15;0.000000;0}, {"gladius";15;0.000000;0}, {"orcish_sword";15;0.000000;0}, {"handmade_sword";15;0.000000;0}, {"dwarven_mace";15;0.000000;0}, {"dirk";15;0.000000;0}, {"hunting_bow";15;0.000000;0}, {"long_sword";15;0.000000;0}, {"throw_knife";15;0.000000;0}, {"bow_of_forest";15;0.000000;0}, {"short_spear";15;0.000000;0}, {"zweihander";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_rod";15;0.000000;0}, {"buffalo_horn";15;0.000000;0}, {"willow_staff";15;0.000000;0}, {"apprentice's_spellbook";15;0.000000;0}, {"cedar_staff";15;0.000000;0}, {"apprentice's_staff";15;0.000000;0}, {"relic_of_saints";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 258) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Bring Wolf Pelts");

}
if (gg.HaveMemo(talker, 258) == 1 && gg.OwnItemCount(talker, 702) >= 0 && gg.OwnItemCount(talker, 702) < 40) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Bring Wolf Pelts (In Progress)");

}
if (gg.HaveMemo(talker, 258) == 1 && gg.OwnItemCount(talker, 702) >= 40) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Bring Wolf Pelts (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 258) == 0) {
myself.SetCurrentQuestID(258);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "lector_q0258_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 258);
myself.ShowQuestFHTML(talker, fhtml0, 258);

} else {
myself.ShowQuestPage(talker, "lector_q0258_01.htm", 258);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 258) == 1 && gg.OwnItemCount(talker, 702) >= 0 && gg.OwnItemCount(talker, 702) < 40) {
myself.SetCurrentQuestID(258);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "lector_q0258_05.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 258) == 1 && gg.OwnItemCount(talker, 702) >= 40) {
myself.SetCurrentQuestID(258);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 702, 40);
i0 = gg.Rand(16);
if (i0 == 0) {
myself.GiveItem1(talker, 390, 1);
myself.SoundEffect(talker, "ItemSound.quest_jackpot");

} else if (i0 < 6) {
myself.GiveItem1(talker, 29, 1);

} else if (i0 < 9) {
myself.GiveItem1(talker, 22, 1);

} else if (i0 < 13) {
myself.GiveItem1(talker, 1119, 1);

} else {
myself.GiveItem1(talker, 426, 1);

}
myself.ShowPage(talker, "lector_q0258_06.htm");
myself.RemoveMemo(talker, 258);
gg.AddLog(2, talker, 258);
gg.AddLog(3, talker, 258);
myself.SoundEffect(talker, "ItemSound.quest_finish");

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
if (quest_id == 258) {
myself.SetCurrentQuestID(258);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 258);
myself.ShowQuestMark(talker, 258);
gg.AddLog(1, talker, 258);
myself.SetFlagJournal(talker, 258, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "lector_q0258_03.htm", 258);

}
return;

}
super;
	}


}