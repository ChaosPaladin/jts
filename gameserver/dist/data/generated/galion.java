package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class galion extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 2) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Bard's Mandolin (In Progress)");

}
if (gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 3) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Bard's Mandolin (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) == 2) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
myself.SetFlagJournal(talker, 362, 3);
myself.ShowQuestMark(talker, 362);
myself.SoundEffect(talker, "ItemSound.quest_middle");
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4316, 1);
myself.SetMemoState(talker, 362, 3);
myself.ShowPage(talker, "galion_q0362_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 362) == 1 && gg.GetMemoState(talker, 362) >= 3) {
myself.SetCurrentQuestID(362);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "galion_q0362_02.htm");

}
break;

}

}
return;

}
super;
	}


}