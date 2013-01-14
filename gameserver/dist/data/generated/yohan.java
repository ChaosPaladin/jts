package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class yohan extends cleric_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 703) > 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Cure for Fever (In Progress)");

}
if (gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 704) > 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Cure for Fever (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 703) > 0) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 703) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 704, 1);
myself.DeleteItem1(talker, 703, 1);
myself.ShowPage(talker, "yohan_q0259_01.htm");
myself.SetFlagJournal(talker, 151, 3);
myself.ShowQuestMark(talker, 151);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else if (gg.OwnItemCount(talker, 704) == 1) {
myself.ShowPage(talker, "yohan_q0259_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 151) == 1 && gg.OwnItemCount(talker, 704) > 0) {
myself.SetCurrentQuestID(151);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "yohan_q0259_02.htm");

}
break;

}

}
return;

}
super;
	}


}