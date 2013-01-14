package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class jud extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1028) != 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Nerupa's Request (In Progress)");

}
if (gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Nerupa's Request (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1028) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1028, gg.OwnItemCount(talker, 1028));
if (gg.OwnItemCount(talker, 1029) == 0) {
myself.GiveItem1(talker, 1029, 1);
myself.ShowPage(talker, "jud_q0311_01.htm");
myself.SetFlagJournal(talker, 160, 4);
myself.ShowQuestMark(talker, 160);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 160) != 0 && gg.OwnItemCount(talker, 1029) != 0) {
myself.SetCurrentQuestID(160);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "jud_q0311_02.htm");

}
break;

}

}
return;

}
super;
	}


}