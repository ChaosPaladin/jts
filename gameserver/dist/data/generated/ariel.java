package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ariel extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"pants";15;0.000000;0}, {"shirt";15;0.000000;0}, {"leather_pants";15;0.000000;0}, {"leather_shirt";15;0.000000;0}, {"hard_leather_pants";15;0.000000;0}, {"wooden_gaiters";15;0.000000;0}, {"wooden_breastplate";15;0.000000;0}, {"tights_pants";15;0.000000;0}, {"tights_shirt";15;0.000000;0}, {"bone_breastplate";15;0.000000;0}, {"bone_gaiters";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose";15;0.000000;0}, {"tunic";15;0.000000;0}, {"cotton_hose";15;0.000000;0}, {"cotton_tunic";15;0.000000;0}, {"feriotic_hose";15;0.000000;0}, {"feriotic_tunic";15;0.000000;0}, {"leather_hose";15;0.000000;0}, {"leather_tunic";15;0.000000;0}, {"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 7) == 1 && myself.GetOneTimeQuestFlag(talker, 7) == 0 && gg.GetMemoState(talker, 7) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "A Trip Begins (In Progress)");

}
if (gg.HaveMemo(talker, 7) == 1 && gg.GetMemoState(talker, 7) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "A Trip Begins (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 1 && myself.GetOneTimeQuestFlag(talker, 7) == 0 && gg.GetMemoState(talker, 7) == 1 * 10 + 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 7, 1);
myself.ShowPage(talker, "ariel_q0007_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 7) == 1 && gg.GetMemoState(talker, 7) == 2 * 10 + 1) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ariel_q0007_0202.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 7) {
myself.SetCurrentQuestID(7);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 7) {
i0 = myself.GetHTMLCookie(talker, 7, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 7) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7572, 1);
myself.ShowPage(talker, "ariel_q0007_0201.htm");
myself.SetMemoState(talker, 7, 2 * 10 + 1);
myself.SetFlagJournal(talker, 7, 2);
myself.ShowQuestMark(talker, 7);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}