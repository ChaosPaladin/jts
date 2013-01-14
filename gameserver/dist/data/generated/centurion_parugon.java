package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class centurion_parugon extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Merciless Punishment (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 107) == 1 && gg.OwnItemCount(talker, 1553) || gg.OwnItemCount(talker, 1554) || gg.OwnItemCount(talker, 1555)) {
myself.SetCurrentQuestID(107);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "centurion_parugon_q0107_01.htm");
myself.SetFlagJournal(talker, 107, 2);
myself.ShowQuestMark(talker, 107);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
return;

}
super;
	}


}