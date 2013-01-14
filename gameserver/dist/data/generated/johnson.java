package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class johnson extends guard_stand {
	protected void TALK_SELECTED(HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 104)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Spirit of Mirrors (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 104)) {
myself.SetCurrentQuestID(104);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "johnson_q0104_01.htm");
i0 = gg.GetMemoStateEx(talker, 104, 1);
myself.SetMemoStateEx(talker, 104, 1, i0 + 1);
if (gg.GetMemoStateEx(talker, 104, 1) == 110) {
myself.SetFlagJournal(talker, 104, 2);
myself.ShowQuestMark(talker, 104);
myself.SoundEffect(talker, "ItemSound.quest_middle");

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