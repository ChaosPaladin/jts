package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class spirit_of_sir_talianus extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 6 && gg.OwnItemCount(talker, 2636)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Trial of Duty (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 212) == 1 && gg.GetMemoState(talker, 212) == 6 && gg.OwnItemCount(talker, 2636)) {
myself.SetCurrentQuestID(212);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "spirit_of_sir_talianus_q0212_01.htm");
myself.DeleteItem1(talker, 2636, 1);
myself.DeleteItem1(talker, 2639, gg.OwnItemCount(talker, 2639));
myself.GiveItem1(talker, 2637, 1);
myself.SetMemoState(talker, 212, 7);
myself.SetFlagJournal(talker, 212, 9);
myself.ShowQuestMark(talker, 212);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.Despawn();

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