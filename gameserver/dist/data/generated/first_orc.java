package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class first_orc extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3413) >= 1 || gg.OwnItemCount(talker, 3416) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Lord (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 232) == 1 && gg.OwnItemCount(talker, 3413) >= 1 || gg.OwnItemCount(talker, 3416) >= 1) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "first_orc_q0232_01.htm");
myself.SetFlagJournal(talker, 232, 7);
myself.ShowQuestMark(talker, 232);
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
myself.SetCurrentQuestID(232);
myself.Despawn();
super;
	}

	protected void CREATED(HandlerParam i0) {
myself.SetCurrentQuestID(232);
myself.AddTimerEx(7789, 1000 * 200);
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 232) {
myself.SetCurrentQuestID(232);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 232) {
if (reply == 1) {
myself.ShowPage(talker, "first_orc_q0232_02.htm");

}
if (reply == 2) {
myself.ShowPage(talker, "first_orc_q0232_03.htm");
myself.AddTimerEx(7778, 1000 * 10);

}

}
super;
	}


}