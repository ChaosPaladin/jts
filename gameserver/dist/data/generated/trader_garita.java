package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_garita extends merchant_for_newbie {
protected Object[][] SellList0 = {
{"necklace_of_magic";15;0.000000;0}, {"necklace_of_knowledge";15;0.000000;0}, {"necklace_of_anguish";15;0.000000;0}, {"necklace_of_wisdom";15;0.000000;0}, {"apprentice's_earing";15;0.000000;0}, {"mage_earing";15;0.000000;0}, {"earing_of_strength";15;0.000000;0}, {"earing_of_wisdom";15;0.000000;0}, {"cat'seye_earing";15;0.000000;0}, {"magic_ring";15;0.000000;0}, {"ring_of_knowledge";15;0.000000;0}, {"ring_of_anguish";15;0.000000;0}, {"ring_of_wisdom";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Miner's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Miner's Favor (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548) == 0) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "trader_garita_q0005_01.htm");
myself.GiveItem1(talker, 1548, 1);
if (gg.OwnItemCount(talker, 1548) + gg.OwnItemCount(talker, 1549) + gg.OwnItemCount(talker, 1550) + gg.OwnItemCount(talker, 1551) >= 3) {
myself.SetFlagJournal(talker, 5, 2);
myself.ShowQuestMark(talker, 5);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 5) && gg.OwnItemCount(talker, 1547) && gg.OwnItemCount(talker, 1548)) {
myself.SetCurrentQuestID(5);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_garita_q0005_02.htm");

}
break;

}

}
return;

}
super;
	}


}