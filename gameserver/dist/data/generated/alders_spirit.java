package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alders_spirit extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3184) || gg.OwnItemCount(talker, 3185)) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Testimony of Fate (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 219) == 1 && gg.OwnItemCount(talker, 3184) || gg.OwnItemCount(talker, 3185)) {
myself.SetCurrentQuestID(219);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alders_spirit_q0219_02.htm");
myself.SetFlagJournal(talker, 219, 11);
myself.ShowQuestMark(talker, 219);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
return;

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
myself.SetCurrentQuestID(219);
if (timer_id == 21901) {
myself.Despawn();

}
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(219);
myself.AddTimerEx(21901, 1000 * 200);
super;
	}


}