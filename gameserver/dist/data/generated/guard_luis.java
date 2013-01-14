package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_luis extends guard_stand {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (talker.level >= 19 && gg.HaveMemo(talker, 38) == 0 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Dragon Fangs");

}
if (talker.level < 19 && gg.HaveMemo(talker, 38) == 0 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Dragon Fangs");

}
if (gg.HaveMemo(talker, 38) == 0 && myself.GetOneTimeQuestFlag(talker, 38) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Dragon Fangs (Done)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) >= 1 * 10 + 1 && gg.GetMemoState(talker, 38) <= 1 * 10 + 2 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Dragon Fangs (In Progress)");

}
if (gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Dragon Fangs (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || talker.level >= 19 && gg.HaveMemo(talker, 38) == 0 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "guard_luis_q0038_0101.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 38);
myself.ShowQuestFHTML(talker, fhtml0, 38);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || talker.level < 19 && gg.HaveMemo(talker, 38) == 0 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_luis_q0038_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 0 && myself.GetOneTimeQuestFlag(talker, 38) == 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) >= 1 * 10 + 1 && gg.GetMemoState(talker, 38) <= 1 * 10 + 2 && myself.GetOneTimeQuestFlag(talker, 38) == 0) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.GetMemoState(talker, 38) == 1 * 10 + 2 && gg.OwnItemCount(talker, 7173) >= 100) {
myself.SetHTMLCookie(talker, 38, 1);
myself.ShowPage(talker, "guard_luis_q0038_0105.htm");

} else {
myself.ShowPage(talker, "guard_luis_q0038_0106.htm");

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 38) == 1 && gg.GetMemoState(talker, 38) == 2 * 10 + 1) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "guard_luis_q0038_0203.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 38) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 38);
myself.ShowQuestMark(talker, 38);
myself.SetMemoState(talker, 38, 1 * 10 + 1);
gg.AddLog(1, talker, 38);
myself.SetFlagJournal(talker, 38, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "guard_luis_q0038_0104.htm", 38);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 38) {
myself.SetCurrentQuestID(38);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 38) {
i0 = myself.GetHTMLCookie(talker, 38, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 38) == 1) {
if (gg.OwnItemCount(talker, 7173) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7173, 100);
myself.GiveItem1(talker, 7174, 1);
myself.ShowPage(talker, "guard_luis_q0038_0201.htm");
myself.SetMemoState(talker, 38, 2 * 10 + 1);
myself.SetFlagJournal(talker, 38, 3);
myself.ShowQuestMark(talker, 38);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

} else {
myself.ShowPage(talker, "guard_luis_q0038_0202.htm");

}

}

}

}
super;
	}


}