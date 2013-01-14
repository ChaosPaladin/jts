package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class sentinel_berryos extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.OwnItemCount(talker, 1131) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sea of Spores Fever (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 102) == 1 && gg.OwnItemCount(talker, 746) == 1 && gg.OwnItemCount(talker, 1131) == 1) {
myself.SetCurrentQuestID(102);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 102, gg.OwnItemCount(talker, 1130) + gg.OwnItemCount(talker, 1131) + gg.OwnItemCount(talker, 1132) + gg.OwnItemCount(talker, 1133) + gg.OwnItemCount(talker, 1134));
myself.DeleteItem1(talker, 1131, 1);
if (gg.OwnItemCount(talker, 1130) + gg.OwnItemCount(talker, 1132) + gg.OwnItemCount(talker, 1133) + gg.OwnItemCount(talker, 1134) < 1) {
myself.SetFlagJournal(talker, 102, 6);
myself.ShowQuestMark(talker, 102);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
myself.ShowPage(talker, "sentinel_berryos_q0102_01.htm");

}
break;

}

}
return;

}
super;
	}


}