package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class chest_of_golkonda extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4668) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Fate's Whisper (In Progress)");

}
if (gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) != 2 || gg.OwnItemCount(talker, 4668) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Fate's Whisper (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) == 2 && gg.OwnItemCount(talker, 4668) == 0) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 4668, 1);
myself.SoundEffect(talker, "ItemSound.quest_itemget");
myself.ShowPage(talker, "chest_of_golkonda_q0234_01.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 234) == 1 && gg.GetMemoState(talker, 234) != 2 || gg.OwnItemCount(talker, 4668) == 1) {
myself.SetCurrentQuestID(234);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "chest_of_golkonda_q0234_02.htm");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(234);
if (timer_id == 23403) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(234);
myself.AddTimerEx(23403, 1000 * 120);
super;
	}


}