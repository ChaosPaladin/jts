package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class warehouse_grookin extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 4) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Long Live the Pa'agrio Lord (In Progress)");

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
if (gg.OwnItemCount(talker, 1543) < 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "warehouse_grookin_q0004_01.htm");
myself.GiveItem1(talker, 1543, 1);
if (gg.OwnItemCount(talker, 1541) + gg.OwnItemCount(talker, 1542) + gg.OwnItemCount(talker, 1543) + gg.OwnItemCount(talker, 1544) + gg.OwnItemCount(talker, 1545) + gg.OwnItemCount(talker, 1546) >= 5) {
myself.SetFlagJournal(talker, 4, 2);
myself.ShowQuestMark(talker, 4);

}
myself.SoundEffect(talker, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(talker, 1543) >= 1) {
myself.ShowPage(talker, "warehouse_grookin_q0004_02.htm");

}

}
break;

}

}
return;

}
super;
	}


}