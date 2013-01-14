package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class beolin extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 621) == 1 && gg.OwnItemCount(talker, 7196) >= 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Egg Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Egg Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 622) == 1 && gg.OwnItemCount(talker, 7197) >= 5 && gg.GetMemoState(talker, 622) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Specialty Liquor Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Specialty Liquor Delivery (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 621) == 1 && gg.OwnItemCount(talker, 7196) >= 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 5 * 10 + 1) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 621, 5);
myself.ShowPage(talker, "beolin_q0621_0501.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 6 * 10 + 1) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beolin_q0621_0603.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 622) == 1 && gg.OwnItemCount(talker, 7197) >= 5 && gg.GetMemoState(talker, 622) == 1 * 10 + 1) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 622, 1);
myself.ShowPage(talker, "beolin_q0622_0101.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0 && gg.GetMemoState(talker, 622) == 2 * 10 + 1) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "beolin_q0622_0203.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 621) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 621) {
i0 = myself.GetHTMLCookie(talker, 621, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0) {
if (gg.OwnItemCount(talker, 7195) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7195, 1);
myself.GiveItem1(talker, 7196, 1);
myself.ShowPage(talker, "beolin_q0621_0601.htm");
myself.SetMemoState(talker, 621, 6 * 10 + 1);
myself.SetFlagJournal(talker, 621, 6);
myself.ShowQuestMark(talker, 621);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "beolin_q0621_0602.htm");

}

}

}

}
if (ask == 622) {
myself.SetCurrentQuestID(622);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 622) {
i0 = myself.GetHTMLCookie(talker, 622, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 622) == 1 && myself.GetOneTimeQuestFlag(talker, 622) == 0) {
if (gg.OwnItemCount(talker, 7197) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7197, 1);
myself.GiveItem1(talker, 7198, 1);
myself.ShowPage(talker, "beolin_q0622_0201.htm");
myself.SetMemoState(talker, 622, 2 * 10 + 1);
myself.SetFlagJournal(talker, 622, 2);
myself.ShowQuestMark(talker, 622);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "beolin_q0622_0202.htm");

}

}

}

}
super;
	}


}