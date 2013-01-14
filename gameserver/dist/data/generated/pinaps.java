package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pinaps extends guard_fixed {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 251) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 251) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "No Secrets");

}
if (gg.HaveMemo(talker, 251) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 251) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "No Secrets");

}
if (gg.HaveMemo(talker, 251) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "No Secrets (Done)");

}
if (gg.HaveMemo(talker, 251) == 1 && gg.GetMemoState(talker, 251) == 1 && gg.OwnItemCount(talker, 15508) < 10 || gg.OwnItemCount(talker, 15509) < 5) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "No Secrets (In progress)");

}
if (gg.HaveMemo(talker, 251) == 1 && gg.GetMemoState(talker, 251) == 1 && gg.OwnItemCount(talker, 15508) >= 10 && gg.OwnItemCount(talker, 15509) >= 5) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "No Secrets (In progress)");

}
if (gg.HaveMemo(talker, 290) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 0 || talker.level < 82) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Threat Removal");

}
if (gg.HaveMemo(talker, 290) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 1 && talker.level >= 82) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Threat Removal");

}
if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) < 400) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Threat Removal (In progress)");

}
if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) >= 400) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Threat Removal (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 251) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 251) == 0) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.ShowQuestPage(talker, "pinaps_q0251_01.htm", 251);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 251) == 0 && talker.level < 82 && myself.GetOneTimeQuestFlag(talker, 251) == 0) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "pinaps_q0251_02.htm", 251);

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 251) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 1) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pinaps_q0251_03.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 251) == 1 && gg.GetMemoState(talker, 251) == 1 && gg.OwnItemCount(talker, 15508) < 10 || gg.OwnItemCount(talker, 15509) < 5) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pinaps_q0251_06.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 251) == 1 && gg.GetMemoState(talker, 251) == 1 && gg.OwnItemCount(talker, 15508) >= 10 && gg.OwnItemCount(talker, 15509) >= 5) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 313355);
myself.IncrementParam(talker, 0, 56787);
myself.IncrementParam(talker, 1, 160578);
myself.DeleteItem1(talker, 15508, gg.OwnItemCount(talker, 15508));
myself.DeleteItem1(talker, 15509, gg.OwnItemCount(talker, 15509));
myself.RemoveMemo(talker, 251);
myself.SetOneTimeQuestFlag(talker, 251, 1);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 251);
gg.AddLog(3, talker, 251);
myself.ShowPage(talker, "pinaps_q0251_07.htm");

}

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 290) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 0 || talker.level < 82) {
myself.SetCurrentQuestID(290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "pinaps_q0290_01.htm", 290);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 290) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 1 && talker.level >= 82) {
myself.SetCurrentQuestID(290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.FHTML_SetFileName(fhtml0, "pinaps_q0290_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 290);
myself.ShowQuestFHTML(talker, fhtml0, 290);

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) < 400) {
myself.SetCurrentQuestID(290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pinaps_q0290_04.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) >= 400) {
myself.SetCurrentQuestID(290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "pinaps_q0290_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 251) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 251) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 251) == 0) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 251);
myself.SetMemoState(talker, 251, 1);
myself.ShowQuestPage(talker, "pinaps_q0251_05.htm", 251);
myself.SetFlagJournal(talker, 251, 1);
myself.ShowQuestMark(talker, 251);

}

}
return;

}
if (quest_id == 290) {
myself.SetCurrentQuestID(290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 290) == 0 && myself.GetOneTimeQuestFlag(talker, 251) == 1 && talker.level >= 82) {
myself.SetMemo(talker, quest_id);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 290);
myself.SetMemoState(talker, 290, 1);
myself.ShowQuestPage(talker, "pinaps_q0290_03.htm", 290);
myself.SetFlagJournal(talker, 290, 1);
myself.ShowQuestMark(talker, 290);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam reply, HandlerParam talker) {
if (ask == 251) {
myself.SetCurrentQuestID(251);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 251) {
if (reply == 1) {
if (gg.HaveMemo(talker, 251) == 0 && talker.level >= 82 && myself.GetOneTimeQuestFlag(talker, 251) == 0) {
myself.FHTML_SetFileName(fhtml0, "pinaps_q0251_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 251);
myself.ShowQuestFHTML(talker, fhtml0, 251);

}

}

}
if (ask == 290) {
myself.SetCurrentQuestID(290);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 290) {
if (reply == 1) {
if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) >= 400) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.DeleteItem1(talker, 15714, 400);
i0 = gg.Rand(10);
if (i0 == 0) {
myself.GiveItem1(talker, 959, 1);

} else if (i0 >= 1 && i0 < 4) {
myself.GiveItem1(talker, 960, 1);

} else if (i0 >= 4 && i0 < 6) {
myself.GiveItem1(talker, 960, 2);

} else if (i0 >= 6 && i0 < 7) {
myself.GiveItem1(talker, 960, 3);

} else if (i0 >= 7 && i0 < 9) {
myself.GiveItem1(talker, 9552, 1);

} else {
myself.GiveItem1(talker, 9552, 2);

}
gg.AddLog(3, talker, 290);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.ShowPage(talker, "pinaps_q0290_06.htm");

}

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1) {
myself.ShowPage(talker, "pinaps_q0290_07.htm");
myself.SetMemoState(talker, 290, 1);

}

}
if (reply == 3) {
if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) > 1) {
myself.ShowPage(talker, "pinaps_q0290_08.htm");

} else if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1 && gg.OwnItemCount(talker, 15714) == 0) {
myself.DeleteItem1(talker, 15714, gg.OwnItemCount(talker, 15714));
myself.RemoveMemo(talker, 290);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 290);
myself.ShowPage(talker, "pinaps_q0290_09.htm");

}

}
if (reply == 4) {
if (gg.HaveMemo(talker, 290) == 1 && gg.GetMemoState(talker, 290) == 1) {
myself.DeleteItem1(talker, 15714, gg.OwnItemCount(talker, 15714));
myself.RemoveMemo(talker, 290);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 290);
myself.ShowPage(talker, "pinaps_q0290_10.htm");

}

}

}
super;
	}


}