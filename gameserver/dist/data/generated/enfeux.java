package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class enfeux extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 627) == 1 && gg.OwnItemCount(talker, 7170) >= 1 && gg.GetMemoState(talker, 627) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Heart in Search of Power (In Progress)");

}
if (gg.HaveMemo(talker, 627) == 1 && gg.GetMemoState(talker, 627) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Heart in Search of Power (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 627) == 1 && gg.OwnItemCount(talker, 7170) >= 1 && gg.GetMemoState(talker, 627) == 2 * 10 + 1) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 627, 2);
myself.ShowPage(talker, "enfeux_q0627_0201.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 627) == 1 && gg.GetMemoState(talker, 627) == 3 * 10 + 1) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "enfeux_q0627_0303.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 627) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 627) {
i0 = myself.GetHTMLCookie(talker, 627, 3 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7170) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7170, 1);
myself.DeleteItem1(talker, 0, 0);
myself.DeleteItem1(talker, 0, 0);
myself.GiveItem1(talker, 7172, 1);
myself.ShowPage(talker, "enfeux_q0627_0301.htm");
myself.SetMemoState(talker, 627, 3 * 10 + 1);
myself.SetFlagJournal(talker, 627, 4);
myself.ShowQuestMark(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "enfeux_q0627_0302.htm");

}

}

}

}
super;
	}


}