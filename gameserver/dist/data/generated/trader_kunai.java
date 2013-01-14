package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_kunai extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"pants";15;0.000000;0}, {"shirt";15;0.000000;0}, {"leather_pants";15;0.000000;0}, {"leather_shirt";15;0.000000;0}, {"hard_leather_pants";15;0.000000;0}, {"wooden_gaiters";15;0.000000;0}, {"wooden_breastplate";15;0.000000;0}, {"tights_pants";15;0.000000;0}, {"tights_shirt";15;0.000000;0}, {"bone_breastplate";15;0.000000;0}, {"bone_gaiters";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose";15;0.000000;0}, {"tunic";15;0.000000;0}, {"cotton_hose";15;0.000000;0}, {"cotton_tunic";15;0.000000;0}, {"feriotic_hose";15;0.000000;0}, {"feriotic_tunic";15;0.000000;0}, {"leather_hose";15;0.000000;0}, {"leather_tunic";15;0.000000;0}, {"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam quest_id, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Long Live the Pa'agrio Lord (In Progress)");

}
if (gg.HaveMemo(talker, 268) == 0 && talker.level >= 15) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Traces of Evil");

}
if (gg.HaveMemo(talker, 268) == 0 && talker.level < 15) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Traces of Evil");

}
if (gg.HaveMemo(talker, 268) == 1 && gg.GetMemoState(talker, 268) == 1 && gg.OwnItemCount(talker, 10869) <= 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Traces of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 268) == 1 && gg.GetMemoState(talker, 268) == 1 && gg.OwnItemCount(talker, 10869) > 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Traces of Evil (In Progress)");

}
if (gg.HaveMemo(talker, 268) == 1 && gg.GetMemoState(talker, 268) == 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Traces of Evil (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 4) == 1) {
myself.SetCurrentQuestID(4);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1545) < 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_kunai_q0004_01.htm");
myself.GiveItem1(talker, 1545, 1);
if (gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 5) {
myself.SetFlagJournal(talker, 4, 2);
myself.ShowQuestMark(talker, 4);

}
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(talker, 1545) >= 1) {
myself.ShowPage(talker, "trader_kunai_q0004_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 268) == 0 && talker.level >= 15) {
myself.SetCurrentQuestID(268);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "trader_kunai_q0268_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 268);
myself.ShowQuestFHTML(talker, fhtml0, 268);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 268) == 0 && talker.level < 15) {
myself.SetCurrentQuestID(268);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "trader_kunai_q0268_02.htm", 268);

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 268) == 1 && gg.GetMemoState(talker, 268) == 1 && gg.OwnItemCount(talker, 10869) <= 0) {
myself.SetCurrentQuestID(268);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_kunai_q0268_04.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 268) == 1 && gg.GetMemoState(talker, 268) == 1 && gg.OwnItemCount(talker, 10869) > 0) {
myself.SetCurrentQuestID(268);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_kunai_q0268_05.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 268) == 1 && gg.GetMemoState(talker, 268) == 2) {
myself.SetCurrentQuestID(268);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_kunai_q0268_06.htm");
myself.GiveItem1(talker, 57, 2474);
myself.IncrementParam(talker, 0, 8738);
myself.IncrementParam(talker, 1, 409);
myself.DeleteItem1(talker, 10869, gg.OwnItemCount(talker, 10869));
myself.RemoveMemo(talker, 268);
gg.AddLog(2, talker, 268);
myself.SoundEffect(talker, "ItemSound.quest_finish");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 268) {
myself.SetCurrentQuestID(268);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 268) == 0 && talker.level >= 15) {
myself.SetMemoState(talker, 268, 1);
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 268);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.SetFlagJournal(talker, 268, 1);
myself.ShowQuestPage(talker, "trader_kunai_q0268_03.htm", 268);
gg.AddLog(1, talker, quest_id);

}
return;

}
super;
	}


}