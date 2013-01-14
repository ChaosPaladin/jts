package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jackson extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"pants";15;0.000000;0}, {"shirt";15;0.000000;0}, {"leather_pants";15;0.000000;0}, {"leather_shirt";15;0.000000;0}, {"hard_leather_pants";15;0.000000;0}, {"wooden_gaiters";15;0.000000;0}, {"wooden_breastplate";15;0.000000;0}, {"tights_pants";15;0.000000;0}, {"tights_shirt";15;0.000000;0}, {"bone_breastplate";15;0.000000;0}, {"bone_gaiters";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};
protected Object[][] SellList1 = {
{"hose";15;0.000000;0}, {"tunic";15;0.000000;0}, {"cotton_hose";15;0.000000;0}, {"cotton_tunic";15;0.000000;0}, {"feriotic_hose";15;0.000000;0}, {"feriotic_tunic";15;0.000000;0}, {"leather_hose";15;0.000000;0}, {"leather_tunic";15;0.000000;0}, {"hose_of_devotion";15;0.000000;0}, {"tunic_of_devotion";15;0.000000;0}, {"leather_shield";15;0.000000;0}, {"small_shield";15;0.000000;0}, {"buckler";15;0.000000;0}, {"round_shield";15;0.000000;0}, {"short_gloves";15;0.000000;0}, {"short_leather_gloves";15;0.000000;0}, {"gloves";15;0.000000;0}, {"leather_gloves";15;0.000000;0}, {"apprentice's_shoes";15;0.000000;0}, {"cloth_shoes";15;0.000000;0}, {"leather_sandals";15;0.000000;0}, {"crude_leather_shoes";15;0.000000;0}, {"cotton_shoes";15;0.000000;0}, {"leather_shoes";15;0.000000;0}, {"low_boots";15;0.000000;0}, {"cloth_cap";15;0.000000;0}, {"leather_cap";15;0.000000;0}, {"wooden_helmet";15;0.000000;0}, {"leather_helmet";15;0.000000;0}, {"tshirt";15;0.000000;0}, {"pattern_tshirt";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1013) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Deliver Goods (In Progress)");

}
if (gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1016) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Deliver Goods (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1013) != 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.DeleteItem1(talker, 1013, gg.OwnItemCount(talker, 1013));
if (gg.OwnItemCount(talker, 1016) == 0) {
myself.GiveItem1(talker, 1016, 1);

}
myself.ShowPage(talker, "jackson_q0302_01.htm");
if (gg.OwnItemCount(talker, 1017) >= 1 && gg.OwnItemCount(talker, 1018) >= 1) {
myself.SetFlagJournal(talker, 153, 2);
myself.ShowQuestMark(talker, 153);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 153) != 0 && gg.OwnItemCount(talker, 1016) != 0) {
myself.SetCurrentQuestID(153);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jackson_q0302_02.htm");

}
break;

}

}
return;

}
super;
	}


}