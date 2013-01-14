package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class leikar extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Make a Pair of Dress Shoes (In Progress)");

}
if (gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Make a Pair of Dress Shoes (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && gg.OwnItemCount(talker, 7159) >= 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 5 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 6 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Make Formal Wear (In Progress)");

}
if (gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 7 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Make Formal Wear (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 1 * 10 + 1) {
myself.SetCurrentQuestID(33);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 33, 1);
myself.ShowPage(talker, "leikar_q0033_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0 && gg.GetMemoState(talker, 33) == 2 * 10 + 1) {
myself.SetCurrentQuestID(33);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "leikar_q0033_0202.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 1 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 37, 1);
myself.ShowPage(talker, "leikar_q0037_0101.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 2 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "leikar_q0037_0202.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && gg.OwnItemCount(talker, 7159) >= 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 5 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 37, 5);
myself.ShowPage(talker, "leikar_q0037_0501.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 6 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7076) >= 1 && gg.OwnItemCount(talker, 7077) >= 1 && gg.OwnItemCount(talker, 7078) >= 1) {
myself.SetHTMLCookie(talker, 37, 6);
myself.ShowPage(talker, "leikar_q0037_0603.htm");

} else {
myself.ShowPage(talker, "leikar_q0037_0604.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0 && gg.GetMemoState(talker, 37) == 7 * 10 + 1) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 7113) >= 1) {
myself.SetHTMLCookie(talker, 37, 7);
myself.ShowPage(talker, "leikar_q0037_0703.htm");

} else {
myself.ShowPage(talker, "leikar_q0037_0704.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 33) {
myself.SetCurrentQuestID(33);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 33) {
i0 = myself.GetHTMLCookie(talker, 33, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 33) == 1 && myself.GetOneTimeQuestFlag(talker, 33) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "leikar_q0033_0201.htm");
myself.SetMemoState(talker, 33, 2 * 10 + 1);
myself.SetFlagJournal(talker, 33, 2);
myself.ShowQuestMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37) {
i0 = myself.GetHTMLCookie(talker, 37, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7164, 1);
myself.ShowPage(talker, "leikar_q0037_0201.htm");
myself.SetMemoState(talker, 37, 2 * 10 + 1);
myself.SetFlagJournal(talker, 37, 2);
myself.ShowQuestMark(talker, 37);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37) {
i0 = myself.GetHTMLCookie(talker, 37, 6 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (gg.OwnItemCount(talker, 7159) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7159, 1);
myself.ShowPage(talker, "leikar_q0037_0601.htm");
myself.SetMemoState(talker, 37, 6 * 10 + 1);
myself.SetFlagJournal(talker, 37, 6);
myself.ShowQuestMark(talker, 37);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "leikar_q0037_0602.htm");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37) {
i0 = myself.GetHTMLCookie(talker, 37, 7 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (gg.OwnItemCount(talker, 7076) >= 1 && gg.OwnItemCount(talker, 7077) >= 1 && gg.OwnItemCount(talker, 7078) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7076, 1);
myself.DeleteItem1(talker, 7077, 1);
myself.DeleteItem1(talker, 7078, 1);
myself.ShowPage(talker, "leikar_q0037_0701.htm");
myself.SetMemoState(talker, 37, 7 * 10 + 1);
myself.SetFlagJournal(talker, 37, 7);
myself.ShowQuestMark(talker, 37);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "leikar_q0037_0702.htm");

}

}

}

}
if (ask == 37) {
myself.SetCurrentQuestID(37);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 37 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
i0 = myself.GetHTMLCookie(talker, 37, 8 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 37) == 1 && myself.GetOneTimeQuestFlag(talker, 37) == 0) {
if (gg.OwnItemCount(talker, 7113) >= 1 && gg.OwnItemCount(talker, 7164) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7113, gg.OwnItemCount(talker, 7113));
myself.DeleteItem1(talker, 7164, gg.OwnItemCount(talker, 7164));
myself.GiveItem1(talker, 6408, 1);

}
gg.AddLog(2, talker, 37);
myself.RemoveMemo(talker, 37);
myself.SetOneTimeQuestFlag(talker, 37, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "leikar_q0037_0801.htm");

} else {
myself.ShowPage(talker, "leikar_q0037_0802.htm");

}

}

}

}
super;
	}


}