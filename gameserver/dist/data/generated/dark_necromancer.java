package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dark_necromancer extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sweet Whispers (In Progress)");

}
if (gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sweet Whispers (In Progress)");

}
if (talker.level >= 60 && gg.HaveMemo(talker, 627) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Heart in Search of Power");

}
if (talker.level < 60 && gg.HaveMemo(talker, 627) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Heart in Search of Power");

}
if (gg.HaveMemo(talker, 627) == 1 && gg.GetMemoState(talker, 627) >= 1 * 10 + 1 && gg.GetMemoState(talker, 627) <= 1 * 10 + 2) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Heart in Search of Power (In Progress)");

}
if (gg.HaveMemo(talker, 627) == 1 && gg.GetMemoState(talker, 627) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Heart in Search of Power (In Progress)");

}
if (gg.HaveMemo(talker, 627) == 1 && gg.OwnItemCount(talker, 7172) >= 1 && gg.GetMemoState(talker, 627) == 3 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Heart in Search of Power (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 1 * 10 + 1) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 15, 1);
myself.ShowPage(talker, "dark_necromancer_q0015_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0 && gg.GetMemoState(talker, 15) == 2 * 10 + 1) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_necromancer_q0015_0202.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || talker.level >= 60 && gg.HaveMemo(talker, 627) == 0) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "dark_necromancer_q0627_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 627);
myself.ShowQuestFHTML(talker, fhtml0, 627);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 3: {
if (_from_choice == 0 || talker.level < 60 && gg.HaveMemo(talker, 627) == 0) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "dark_necromancer_q0627_0103.htm", 627);

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 627) == 1 && gg.GetMemoState(talker, 627) >= 1 * 10 + 1 && gg.GetMemoState(talker, 627) <= 1 * 10 + 2) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 627) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7171) >= 300) {
myself.SetHTMLCookie(talker, 627, 1);
myself.ShowPage(talker, "dark_necromancer_q0627_0105.htm");

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0106.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 627) == 1 && gg.GetMemoState(talker, 627) == 2 * 10 + 1) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "dark_necromancer_q0627_0203.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 627) == 1 && gg.OwnItemCount(talker, 7172) >= 1 && gg.GetMemoState(talker, 627) == 3 * 10 + 1) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 627, 3);
myself.ShowPage(talker, "dark_necromancer_q0627_0301.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 627) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 627);
myself.ShowQuestMark(talker, 627);
myself.SetMemoState(talker, 627, 1 * 10 + 1);
gg.AddLog(1, talker, 627);
myself.SetFlagJournal(talker, 627, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "dark_necromancer_q0627_0104.htm", 627);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 15) {
myself.SetCurrentQuestID(15);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 15) {
i0 = myself.GetHTMLCookie(talker, 15, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 15) == 1 && myself.GetOneTimeQuestFlag(talker, 15) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "dark_necromancer_q0015_0201.htm");
myself.SetMemoState(talker, 15, 2 * 10 + 1);
myself.SetFlagJournal(talker, 15, 2);
myself.ShowQuestMark(talker, 15);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
if (ask == 627) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 627) {
i0 = myself.GetHTMLCookie(talker, 627, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7171) >= 300) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7171, 300);
myself.GiveItem1(talker, 7170, 1);
myself.ShowPage(talker, "dark_necromancer_q0627_0201.htm");
myself.SetMemoState(talker, 627, 2 * 10 + 1);
myself.SetFlagJournal(talker, 627, 3);
myself.ShowQuestMark(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0202.htm");

}

}

}

}
if (ask == 627) {
myself.SetCurrentQuestID(627);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 627) {
i0 = myself.GetHTMLCookie(talker, 627, 4 - 1);
if (i0 != -1) {
if (reply == 3 && gg.HaveMemo(talker, 627) == 1) {
myself.ShowPage(talker, "dark_necromancer_q0627_0401.htm");

}
if (reply == 11 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7172) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7172, gg.OwnItemCount(talker, 7172));
myself.GiveItem1(talker, 57, 100000);
gg.AddLog(2, talker, 627);
gg.AddLog(3, talker, 627);
myself.RemoveMemo(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_necromancer_q0627_0402.htm");

}

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0403.htm");

}

}
if (reply == 12 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7172) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7172, gg.OwnItemCount(talker, 7172));
myself.GiveItem1(talker, 4043, 13);
myself.GiveItem1(talker, 57, 6400);
gg.AddLog(2, talker, 627);
gg.AddLog(3, talker, 627);
myself.RemoveMemo(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_necromancer_q0627_0402.htm");

}

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0403.htm");

}

}
if (reply == 13 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7172) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7172, gg.OwnItemCount(talker, 7172));
myself.GiveItem1(talker, 4044, 13);
myself.GiveItem1(talker, 57, 6400);
gg.AddLog(2, talker, 627);
gg.AddLog(3, talker, 627);
myself.RemoveMemo(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_necromancer_q0627_0402.htm");

}

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0403.htm");

}

}
if (reply == 14 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7172) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7172, gg.OwnItemCount(talker, 7172));
myself.GiveItem1(talker, 4042, 6);
myself.GiveItem1(talker, 57, 13600);
gg.AddLog(2, talker, 627);
gg.AddLog(3, talker, 627);
myself.RemoveMemo(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_necromancer_q0627_0402.htm");

}

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0403.htm");

}

}
if (reply == 15 && gg.HaveMemo(talker, 627) == 1) {
if (gg.OwnItemCount(talker, 7172) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7172, gg.OwnItemCount(talker, 7172));
myself.GiveItem1(talker, 4041, 3);
myself.GiveItem1(talker, 57, 17200);
gg.AddLog(2, talker, 627);
gg.AddLog(3, talker, 627);
myself.RemoveMemo(talker, 627);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "dark_necromancer_q0627_0402.htm");

}

} else {
myself.ShowPage(talker, "dark_necromancer_q0627_0403.htm");

}

}

}

}
super;
	}


}