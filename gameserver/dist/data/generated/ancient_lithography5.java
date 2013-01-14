package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ancient_lithography5 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 603) == 1 && gg.OwnItemCount(talker, 7191) >= 1 && gg.GetMemoState(talker, 603) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Daimon the White-Eyed - Part 1 (In Progress)");

}
if (gg.HaveMemo(talker, 603) == 1 && gg.GetMemoState(talker, 603) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Daimon the White-Eyed - Part 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 603) == 1 && gg.OwnItemCount(talker, 7191) >= 1 && gg.GetMemoState(talker, 603) == 5 * 10 + 1) {
myself.SetCurrentQuestID(603);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 603, 5);
myself.ShowPage(talker, "ancient_lithography5_q0603_0501.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 603) == 1 && gg.GetMemoState(talker, 603) == 6 * 10 + 1) {
myself.SetCurrentQuestID(603);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "ancient_lithography5_q0603_0603.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 603) {
myself.SetCurrentQuestID(603);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 603) {
i0 = myself.GetHTMLCookie(talker, 603, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 603) == 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7191, 1);
myself.ShowPage(talker, "ancient_lithography5_q0603_0601.htm");
myself.SetMemoState(talker, 603, 6 * 10 + 1);
myself.SetFlagJournal(talker, 603, 6);
myself.ShowQuestMark(talker, 603);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}