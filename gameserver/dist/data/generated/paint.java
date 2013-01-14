package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class paint extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"pants";15;0.000000;0}, {"shirt";15;0.000000;0}, {"leather_pants";15;0.000000;0}, {"leather_shirt";15;0.000000;0}, {"hard_leather_pants";15;0.000000;0}, {"wooden_gaiters";15;0.000000;0}, {"wooden_breastplate";15;0.000000;0}, {"tights_pants";15;0.000000;0}, {"tights_shirt";15;0.000000;0}, {"bone_breastplate";15;0.000000;0}, {"bone_gaiters";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose";15;0.000000;0}, {"tunic";15;0.000000;0}, {"cotton_hose";15;0.000000;0}, {"cotton_tunic";15;0.000000;0}, {"feriotic_hose";15;0.000000;0}, {"feriotic_tunic";15;0.000000;0}, {"leather_hose";15;0.000000;0}, {"leather_tunic";15;0.000000;0}, {"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 264) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Keen Claws");

}
if (gg.HaveMemo(talker, 264) == 1 && gg.OwnItemCount(talker, 1367) < 50) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Keen Claws (In Progress)");

}
if (gg.HaveMemo(talker, 264) == 1 && gg.OwnItemCount(talker, 1367) >= 50) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Keen Claws (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 264) == 0) {
myself.SetCurrentQuestID(264);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 3) {
myself.FHTML_SetFileName(fhtml0, "paint_q0264_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 264);
myself.ShowQuestFHTML(talker, fhtml0, 264);

} else {
myself.ShowQuestPage(talker, "paint_q0264_01.htm", 264);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 264) == 1 && gg.OwnItemCount(talker, 1367) < 50) {
myself.SetCurrentQuestID(264);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "paint_q0264_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 264) == 1 && gg.OwnItemCount(talker, 1367) >= 50) {
myself.SetCurrentQuestID(264);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1367, gg.OwnItemCount(talker, 1367));
i0 = gg.Rand(17);
if (i0 == 0) {
myself.GiveItem1(talker, 4633, 1);
myself.SoundEffect(talker, "ItemSound.quest_jackpot");

} else if (i0 < 2) {
myself.GiveItem1(talker, 57, 2000);

} else if (i0 < 5) {
myself.GiveItem1(talker, 5140, 1);

} else if (i0 < 8) {
myself.GiveItem1(talker, 735, 1);
myself.GiveItem1(talker, 57, 50);

} else if (i0 < 11) {
myself.GiveItem1(talker, 737, 1);

} else if (i0 < 14) {
myself.GiveItem1(talker, 734, 1);

} else {
myself.GiveItem1(talker, 35, 1);
myself.GiveItem1(talker, 57, 50);

}
myself.ShowPage(talker, "paint_q0264_05.htm");
myself.RemoveMemo(talker, 264);
gg.AddLog(2, talker, 264);
gg.AddLog(3, talker, 264);
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
if (quest_id == 264) {
myself.SetCurrentQuestID(264);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 264);
myself.ShowQuestMark(talker, 264);
gg.AddLog(1, talker, 264);
myself.SetFlagJournal(talker, 264, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "paint_q0264_03.htm", 264);

}
return;

}
super;
	}


}