package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class freighter_daisy extends warehouse_keeper {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 18) == 1 && myself.GetOneTimeQuestFlag(talker, 18) == 0 && gg.GetMemoState(talker, 18) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Meeting with the Golden Ram (In Progress)");

}
if (gg.HaveMemo(talker, 18) == 1 && gg.GetMemoState(talker, 18) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Meeting with the Golden Ram (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 18) == 1 && myself.GetOneTimeQuestFlag(talker, 18) == 0 && gg.GetMemoState(talker, 18) == 1 * 10 + 1) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 18, 1);
myself.ShowPage(talker, "freighter_daisy_q0018_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 18) == 1 && gg.GetMemoState(talker, 18) == 2 * 10 + 1) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "freighter_daisy_q0018_0202.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 18) {
myself.SetCurrentQuestID(18);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 18) {
i0 = myself.GetHTMLCookie(talker, 18, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 18) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7245, 1);
myself.ShowPage(talker, "freighter_daisy_q0018_0201.htm");
myself.SetMemoState(talker, 18, 2 * 10 + 1);
myself.SetFlagJournal(talker, 18, 2);
myself.ShowQuestMark(talker, 18);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}