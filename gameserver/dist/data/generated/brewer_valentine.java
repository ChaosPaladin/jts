package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class brewer_valentine extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Egg Delivery (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 3) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 4) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Adventurer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 621) == 1 && myself.GetOneTimeQuestFlag(talker, 621) == 0 && gg.GetMemoState(talker, 621) == 7 * 10 + 1) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 621, 7);
myself.ShowPage(talker, "brewer_valentine_q0621_0701.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 2) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "brewer_valentine_q0079_0111.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 3) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7080) >= 1) {
myself.ShowPage(talker, "brewer_valentine_q0079_0113.htm");

} else {
myself.ShowPage(talker, "brewer_valentine_q0079_0112.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 4) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "brewer_valentine_q0079_0114.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 621) {
myself.SetCurrentQuestID(621);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 621) {
i0 = myself.GetHTMLCookie(talker, 621, 8 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 621) == 1) {
i1 = gg.Rand(1000);
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (i1 < 800) {
myself.GiveItem1(talker, 734, 1);
myself.GiveItem1(talker, 57, 18800);

} else if (i1 < 800 + 80) {
myself.GiveItem1(talker, 6849, 1);

} else if (i1 < 800 + 80 + 80) {
myself.GiveItem1(talker, 6847, 1);

} else if (i1 < 800 + 80 + 80 + 40) {
myself.GiveItem1(talker, 6851, 1);

}

}
gg.AddLog(2, talker, 621);
gg.AddLog(3, talker, 621);
myself.RemoveMemo(talker, 621);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "brewer_valentine_q0621_0801.htm");

}

}

}
if (ask == 79) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 79) {
if (reply == 3) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 2) {
myself.SetMemoState(talker, 79, 3);
myself.ShowPage(talker, "brewer_valentine_q0079_0115.htm");
myself.SetFlagJournal(talker, 79, 3);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 3 && gg.OwnItemCount(talker, 7080) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7516, 1);
myself.DeleteItem1(talker, 7080, 1);
myself.SetMemoState(talker, 79, 4);
myself.ShowPage(talker, "brewer_valentine_q0079_0116.htm");
myself.SetFlagJournal(talker, 79, 4);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}